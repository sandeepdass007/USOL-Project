/**
 * Home Page Handler
 */

$("document").ready(function() {

	$("#studentRegistrationBtn").click(function() {
		window.location.href = "/register/student";
	});

	populateCourseWiseStudEnrollChart();
	populateCategoryWiseEnrollments();

});

function populateCourseWiseStudEnrollChart() {



	var chart = Highcharts.chart('courseWiseStudentsEnrolled', {
		exporting: {
			buttons: {
				contextButton: {
					menuItems: ["viewFullscreen"]
				}
			}
		},
		chart: {
			plotBackgroundColor: null,
			plotBorderWidth: null,
			plotShadow: false,
			type: 'pie',
			backgroundColor: '#00000010'
		},
		title: {
			text: 'Course Wise Student Enrollment',
			style: {
				color: 'black',
				fontWeight: 'bold'
			}
		},
		tooltip: {
			pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
		},
		accessibility: {
			point: {
				valueSuffix: '%'
			}
		},
		plotOptions: {
			pie: {
				allowPointSelect: true,
				cursor: 'pointer',
				dataLabels: {
					enabled: true,
					format: '<b>{point.name}</b>: {point.percentage:.1f} %'
				}
			}
		},
		series: [{
			name: 'Course',
			colorByPoint: true,
			data: null // to be loaded by rest api below
		}]
	});

	chart.showLoading("Loading...");

	$.ajax({
		url: '/chart/course-wise-student-enrollment/',
		async: true,
		type: 'GET',
		processData: false,
		contentType: 'application/json',
		success: function(data) {
			if (!data || Object.keys(data).length == 0) {
				chart.showLoading("No data available!");
				return;
			}

			var seriesData = [];
			var courseNames = Object.keys(data);
			courseNames.forEach(courseName => {
				var entry = {
					name: courseName,
					y: data[courseName]
				};
				seriesData.push(entry);
			});
			chart.series[0].setData(seriesData);
			chart.hideLoading();
		},
		error: function(xhr, textStatus, errorThrown) {
			chart.showLoading("Error while fetching details from server!");
		}
	});
}

function populateCategoryWiseEnrollments() {
	var chart = Highcharts.chart('categoryWiseEnrollments', {
		exporting: {
			buttons: {
				contextButton: {
					menuItems: ["viewFullscreen"]
				}
			}
		},
		chart: {
			backgroundColor: '#00000010'
		},
		title: {
			text: 'Course Type Wise Enrollments',
			style: {
				color: 'black',
				fontWeight: 'bold'
			}
		},

		/*subtitle: {
			text: 'Since : 2015'
		},*/

		yAxis: {
			title: {
				text: 'Number of Students',
				style: {
					color: 'white',
					fontWeight: 'bold'
				}
			},
			labels: {
				style: {
					color: 'white'
				}
			}
		},

		xAxis: {
			type: 'category',
			accessibility: {
				rangeDescription: 'Range: 2015 to 2021'
			},
			labels: {
				rotation: -45,
				style: {
					color: 'white'
				}
			}
		},

		legend: {
			layout: 'vertical',
			align: 'right',
			verticalAlign: 'middle',
			itemStyle: {
				color: 'white'
			},
			itemHoverStyle: {
				color: 'grey'
			}
		},

		plotOptions: {
			series: {
				label: {
					connectorAllowed: false
				},
				pointStart: 2015
			}
		},

		series: null,

		responsive: {
			rules: [{
				condition: {
					maxWidth: 500
				},
				chartOptions: {
					legend: {
						layout: 'horizontal',
						align: 'center',
						verticalAlign: 'bottom'
					}
				}
			}]
		}
	});

	chart.showLoading("Loading...");

	$.ajax({
		url: '/chart/year-course-wise-enrollment/',
		async: true,
		type: 'GET',
		processData: false,
		contentType: 'application/json',
		success: function(data) {
			if (!data || data.length == 0) {
				chart.showLoading("No data available!");
				return;
			}
			var startPoint = null;
			var jsonObj = {};
			data.forEach(entry => {
				var enrollments = entry["count"];
				var courseType = entry["courseType"];
				var year = entry["year"];
				startPoint = year < startPoint || startPoint == null ? year : startPoint;
				if (!jsonObj[courseType]) {
					jsonObj[courseType] = [];
				}
				jsonObj[courseType].push(enrollments);
			});
			var courseTypes = Object.keys(jsonObj);
			if (courseTypes && courseTypes.length) {
				courseTypes.forEach(courseType => {
					chart.addSeries({
						name: courseType,
						data: jsonObj[courseType]
					}, false);
				});
			}

			chart.series.forEach(series => {
				series.update({
					pointStart: startPoint
				})
			})
			chart.setSubtitle({
				text: "Since: " + startPoint,
				style: {
					color: 'black',
					fontWeight: 'bold'
				}
			});
			chart.redraw();
			chart.hideLoading();
		},
		error: function(xhr, textStatus, errorThrown) {
			chart.showLoading("Error while fetching details from server!");
		}
	});
}