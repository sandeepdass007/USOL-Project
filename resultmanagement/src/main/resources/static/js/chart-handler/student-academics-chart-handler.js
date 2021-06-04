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
	Highcharts.chart('overallCourseChart', {
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
			data: [{
				id: 'sem1',
				name: 'Semester-1',
				color: "#EC2500"
			}, {
				id: 'sem2',
				name: 'Semester-2',
				color: "#ECE100"
			}, {
				id: 'sem3',
				name: 'Semester-3',
				color: '#00FF00'
			}, {
				id: 'sem4',
				name: 'Semester-4',
				color: '#0000FF'
			}, {
				id: 'sem5',
				name: 'Semester-5',
				color: '#EC9800'
			}, {
				id: 'sem6',
				name: 'Semester-6',
				color: '#FF98FF'
			}, {
				name: 'Sub1Sem1',
				parent: 'sem1',
				value: 90
			}, {
				name: 'Sub2Sem1',
				parent: 'sem1',
				value: 70
			}, {
				name: 'Sub3Sem1',
				parent: 'sem1',
				value: 75
			}, {
				name: 'Sub1Sem2',
				parent: 'sem2',
				value: 82
			}, {
				name: 'Sub2Sem2',
				parent: 'sem2',
				value: 65
			}, {
				name: 'Sub3Sem2',
				parent: 'sem2',
				value: 92
			}, {
				name: 'Sub1Sem3',
				parent: 'sem3',
				value: 75
			}, {
				name: 'Sub2Sem3',
				parent: 'sem3',
				value: 65
			}, {
				name: 'Sub3Sem3',
				parent: 'sem3',
				value: 85
			}, {
				name: 'Sub1Sem4',
				parent: 'sem4',
				value: 55
			}, {
				name: 'Sub2Sem4',
				parent: 'sem4',
				value: 65
			}, {
				name: 'Sub3Sem4',
				parent: 'sem4',
				value: 95
			}, {
				name: 'Sub1Sem5',
				parent: 'sem5',
				value: 83
			}, {
				name: 'Sub2Sem5',
				parent: 'sem5',
				value: 71
			}, {
				name: 'Sub3Sem5',
				parent: 'sem5',
				value: 45
			}, {
				name: 'Sub1Sem6',
				parent: 'sem6',
				value: 39
			}, {
				name: 'Sub2Sem6',
				parent: 'sem6',
				value: 45
			}, {
				name: 'Sub3Sem6',
				parent: 'sem6',
				value: 27
			}]
		}],
		title: {
			text: 'Overall Performance'
		}
	});
}

function populateClassVersusPercentage() {
	Highcharts.chart('classVersusPercentage', {
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