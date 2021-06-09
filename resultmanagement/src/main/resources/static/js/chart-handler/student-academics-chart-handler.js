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
	Highcharts.chart('classVersusPercentage', {
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
			text: 'Avg. Class vs Sandeep',
			style: {
				color: 'white'
			}
		},
		yAxis: {
			title: {
				text: 'Marks (in %)',
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
	Highcharts.chart('distributionWiseCourseLevelPerformance', {
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

function populatePercentageHistoryChart() {
	const chart = Highcharts.chart('percentageHistory', {
		chart: {
			type: 'column',
			backgroundColor: 'none'
		},
		title: {
			text: 'Percentage History',
			style: {
				color: "white"
			}
		},
		xAxis: {
			title: {
				text: 'Semester',
				style: {
					color: "white"
				}
			},
			labels: {
				style: {
					color: "white"
				}
			},
			categories: [1, 2, 3, 4, 5, 6, 7, 8]
		},
		yAxis: {
			max: 100,
			title: {
				text: 'Percentage',
				style: {
					color: "white"
				}
			},
			labels: {
				format: '{value}%',
				style: {
					color: "white"
				}
			}
		},
		series: [{
			showInLegend: false,
			data: [89.90, 78.24, 80.22, 92.00, 88.87, 78.65, 97.32, 65.89],
			color: "grey"
		}],
		tooltip: {
			formatter: function() {
				return '<b> Semester - ' + this.x + '</b>: ' + Highcharts.numberFormat(this.y, 2) + ' %';
			}
		},
		plotOptions: {
			series: {
				dataLabels: {
					enabled: true,
					allowOverlap: true,
					rotation: -90,
					y: 20
				}
			}
		}
	});
	return chart;
}