/**
 * 
 */

var StudentAcademicsChartHandler = function() {
	return {

	}
}();

$("document").ready(function() {

	populateOverallCourseChart();
	populateClassVersusPercentage();
	populateSemesterWiseDistributionPerformance();
	populateDistributionWiseCourseLevelPerformance();

});

function populateOverallCourseChart() {
	var chart = Highcharts.chart('overallCourseChart', {
		exporting: {
			buttons: {
				contextButton: {
					menuItems: ["viewFullscreen"]
				}
			}
		},
		series: [{
			type: "treemap",
			layoutAlgorithm: 'stripes',
			alternateStartingDirection: true,
			levels: [{
				level: 1,
				layoutAlgorithm: 'sliceAndDice',
				dataLabels: {
					enabled: true,
					align: 'left',
					verticalAlign: 'top',
					style: {
						fontSize: '15px',
						fontWeight: 'bold'
					}
				}
			}],
			data: []
		}],
		title: {
			text: 'Overall Performance'
		}
	});

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane").attr("id");

	$.ajax({
		url: '/chart/student-sem-sub-marks?courseId='+activeCourseId,
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
			var semesters = Object.keys(data);
			semesters.forEach(semester => {
				seriesData.push({
					id: 'sem' + semester,
					name: 'Semester - ' + semester,
					color: CommonUtils.getRandomColor()
				});
			});

			semesters.forEach(semester => {
				data[semester].forEach(record => {
					seriesData.push({
						name: record["subjectName"],
						parent: 'sem' + semester,
						value: record["marks"]
					});
				});
			});
			chart.update({
				series: {
					data: seriesData
				}
			})
			chart.hideLoading();
		},
		error: function(xhr, textStatus, errorThrown) {
			chart.showLoading("Error while fetching details from server!");
		}
	});
}

function populateClassVersusPercentage() {
	Highcharts.chart('classVersusPercentage', {
		exporting: {
			buttons: {
				contextButton: {
					menuItems: ["viewFullscreen"]
				}
			}
		},
		chart: {
			backgroundColor: 'none'
		},
		title: {
			text: 'Avg. Class vs Sandeep'
		},
		yAxis: {
			title: {
				text: 'Marks (in %)'
			}
		},

		xAxis: {
			type: 'category',
		},

		legend: {
			layout: 'vertical',
			align: 'right',
			verticalAlign: 'middle'
		},

		plotOptions: {
			series: {
				label: {
					connectorAllowed: false
				},
				pointStart: 1
			}
		},

		series: [{
			name: 'Class Avg.',
			data: [78.25, 79.55, 77.56, 80.82, 72.43, 85.11, 75.01, 77.25]
		}, {
			name: 'Sandeep',
			data: [65.25, 88.25, 75.15, 85.82, 77.27, 83.02, 82.82, 79.29]
		}],

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
}

function populateSemesterWiseDistributionPerformance() {
	Highcharts.chart('semesterWiseDistributionPerformance', {
		exporting: {
			buttons: {
				contextButton: {
					menuItems: ["viewFullscreen"]
				}
			}
		},
		chart: {
			type: 'column',
			options3d: {
				enabled: true,
				alpha: 15,
				beta: 15,
				viewDistance: 25,
				depth: 40
			}
		},
		title: {
			text: 'Distribution Performance'
		},
		subtitle: {
			text: 'Semester Wise'
		},
		xAxis: {
			categories: ['Semester-1', 'Semester-2', 'Semester-3', 'Semester-4', 'Semester-5', 'Semester-6', 'Semester-7', 'Semester-8']
		},
		yAxis: {
			min: 0,
			title: {
				text: 'Percentage with distribution'
			}
		},
		legend: {
			layout: 'vertical',
			align: 'right',
			verticalAlign: 'middle',
			reversed: true
		},
		plotOptions: {
			series: {
				stacking: 'normal'
			}
		},
		series: [{
			name: 'Theory',
			data: [78.05, 82.92, 94.24, 65.01, 77.25, 66.34, 73.22, 92.92]
		}, {
			name: 'Practical',
			data: [52.05, 62.92, 74.24, 45.01, 57.25, 46.34, 53.22, 72.92]
		}, {
			name: 'Mid Terms',
			data: [68.05, 72.92, 84.24, 55.01, 67.25, 56.34, 63.22, 82.92]
		}, {
			name: 'Assignment',
			data: [72.05, 89.92, 76.24, 82.01, 56.25, 78.34, 45.22, 98.92]
		}]
	});
}

function populateDistributionWiseCourseLevelPerformance() {
	Highcharts.chart('distributionWiseCourseLevelPerformance', {
		exporting: {
			buttons: {
				contextButton: {
					menuItems: ["viewFullscreen"]
				}
			}
		},
		chart: {
			type: 'pie',
			options3d: {
				enabled: true,
				alpha: 45,
				beta: 0
			}
		},
		title: {
			text: 'Distribution Wise Performance'
		},
		accessibility: {
			point: {
				valueSuffix: '%'
			}
		},
		tooltip: {
			pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
		},
		plotOptions: {
			pie: {
				allowPointSelect: true,
				cursor: 'pointer',
				depth: 35,
				dataLabels: {
					enabled: true,
					format: '{point.name}'
				}
			}
		},
		series: [{
			type: 'pie',
			name: 'Distribution',
			data: [
				['Theory', 45.0],
				['Practical', 26.8],
				{
					name: 'Assignment',
					y: 12.8,
					sliced: true,
					selected: true
				},
				['Viva', 8.5],
				['Mid-Terms', 6.2],
				['Others', 0.7]
			]
		}]
	});
}