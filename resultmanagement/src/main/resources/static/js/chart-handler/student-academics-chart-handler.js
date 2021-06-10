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
	populatePercentageHistoryChart();

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

	chart.showLoading("Loading...");

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane").attr("id");

	$.ajax({
		url: '/chart/student-sem-sub-marks?courseId=' + activeCourseId,
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
	var chart = Highcharts.chart('classVersusPercentage', {
		exporting: {
			buttons: {
				contextButton: {
					menuItems: ["viewFullscreen"]
				}
			}
		},
		chart: {
			type: 'spline',
			backgroundColor: 'none'
		},
		title: {
			text: 'Avg. Class vs You',
			style: {
				color: 'white'
			}
		},
		yAxis: {
			title: {
				text: 'Avg. Marks',
				style: {
					color: 'white'
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
			labels: {
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
				pointStart: 1
			}
		},

		series: [],

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

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane").attr("id");

	$.ajax({
		url: '/chart/student-class-avg-marks-by-sem?courseId=' + activeCourseId,
		async: true,
		type: 'GET',
		processData: false,
		contentType: 'application/json',
		success: function(data) {
			if (!data || Object.keys(data).length == 0) {
				chart.showLoading("No data available!");
				return;
			}
			var clsAvgJsonObj = {
				name: 'Class Avg.',
				data: []
			};
			data["class"].forEach(entry => {
				clsAvgJsonObj["data"].push(entry["marks"]);
			});

			chart.addSeries(clsAvgJsonObj, false);

			var studentAvgJsonObj = {
				name: 'You',
				data: []
			};
			data["student"].forEach(entry => {
				studentAvgJsonObj["data"].push(entry["marks"]);
			});
			chart.addSeries(studentAvgJsonObj, false);
			chart.redraw();
			chart.hideLoading();
		},
		error: function(xhr, textStatus, errorThrown) {
			chart.showLoading("Error while fetching details from server!");
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
			backgroundColor: 'none',
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
			text: 'Distribution Performance',
			style: {
				color: 'white'
			}
		},
		subtitle: {
			text: 'Semester Wise',
			style: {
				color: 'white'
			}
		},
		xAxis: {
			labels: {
				style: {
					color: 'white'
				}
			},
			categories: ['Semester-1', 'Semester-2', 'Semester-3', 'Semester-4', 'Semester-5', 'Semester-6', 'Semester-7', 'Semester-8']
		},
		yAxis: {
			min: 0,
			title: {
				text: 'Percentage with distribution',
				style: {
					color: 'white',
				},
				margin: 30
			},
			labels: {
				style: {
					color: 'white'
				}
			}
		},
		legend: {
			layout: 'vertical',
			align: 'right',
			verticalAlign: 'middle',
			reversed: true,
			itemStyle: {
				color: 'white'
			},
			itemHoverStyle: {
				color: 'grey'
			}
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
	var chart = Highcharts.chart('distributionWiseCourseLevelPerformance', {
		exporting: {
			buttons: {
				contextButton: {
					menuItems: ["viewFullscreen"]
				}
			}
		},
		chart: {
			backgroundColor: 'none',
			type: 'pie',
			options3d: {
				enabled: true,
				alpha: 45,
				beta: 0
			}
		},
		title: {
			text: 'Distribution Wise Performance',
			style: {
				color: 'white'
			}
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
			data: []
		}]
	});

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane").attr("id");

	$.ajax({
		url: '/chart/student-dist-wise-per?courseId=' + activeCourseId,
		async: true,
		type: 'GET',
		processData: false,
		contentType: 'application/json',
		success: function(data) {
			if (!data || data.length == 0) {
				chart.showLoading("No data available!");
				return;
			}

			data.forEach(entry => {
				chart.series[0].addPoint({
					name: entry["type"],
					y: entry["percentage"]
				});
			});
			chart.hideLoading();
		},
		error: function(xhr, textStatus, errorThrown) {
			chart.showLoading("Error while fetching details from server!");
		}
	});
}

function populatePercentageHistoryChart() {
	const chart = new Highcharts.Chart({
		exporting: {
			buttons: {
				contextButton: {
					menuItems: ["viewFullscreen"]
				}
			}
		},
		chart: {
			renderTo: 'percentageHistory',
			type: 'column',
			backgroundColor: 'none',
			options3d: {
				enabled: true,
				alpha: 15,
				beta: 15,
				depth: 50,
				viewDistance: 25
			}
		},
		xAxis: {
			labels: {
				style: {
					color: 'white'
				}
			}
		},
		yAxis: {
			title: {
				text: 'Avg Score',
				style: {
					color: 'white',
				},
				margin: 30
			},
			labels: {
				style: {
					color: 'white'
				}
			}
		},
		title: {
			text: 'Percentage History',
			style: {
				color: 'white'
			}
		},
		legend: {
			itemStyle: {
				color: 'white'
			}
		},
		plotOptions: {
			column: {
				depth: 25
			},
			series: {
				pointStart: 1
			}
		},
		series: []
	});

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane").attr("id");

	$.ajax({
		url: '/chart/student-avg-marks-by-sem?courseId=' + activeCourseId,
		async: true,
		type: 'GET',
		processData: false,
		contentType: 'application/json',
		success: function(data) {
			if (!data || data.length == 0) {
				chart.showLoading("No data available!");
				return;
			}
			var seriesData = {
				name: 'Semester',
				data: []
			};
			data.forEach(entry => {
				seriesData["data"].push(entry["marks"]);
			});
			chart.addSeries(seriesData, false);
			chart.redraw();
			chart.hideLoading();
		},
		error: function(xhr, textStatus, errorThrown) {
			chart.showLoading("Error while fetching details from server!");
		}
	});
}