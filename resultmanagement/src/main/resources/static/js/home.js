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

function populateCategoryWiseEnrollments() {
	Highcharts.chart('categoryWiseEnrollments', {
		chart: {
			backgroundColor: 'none'
		},
		title: {
			text: 'Course Category Wise Enrollments'
		},

		subtitle: {
			text: 'Since : 2015'
		},

		yAxis: {
			title: {
				text: 'Number of Students'
			}
		},

		xAxis: {
			type: 'category',
			accessibility: {
				rangeDescription: 'Range: 2015 to 2021'
			},
			labels: {
				rotation: -45
			}
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
				pointStart: 2015
			}
		},

		series: [{
			name: 'Regular',
			data: [43934, 52503, 57177, 69658, 97031, 119931, 137133]
		}, {
			name: 'Correspondence',
			data: [41934, 45503, 59177, 63658, 99031, 159931, 167133]
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

function populateCourseWiseStudEnrollChart() {
	Highcharts.chart('courseWiseStudentsEnrolled', {
		chart: {
			plotBackgroundColor: null,
			plotBorderWidth: null,
			plotShadow: false,
			type: 'pie',
			backgroundColor: 'none'
		},
		title: {
			text: 'Year - 2021 : Course Wise Student Enrollment'
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
			name: 'Brands',
			colorByPoint: true,
			data: [{
				name: 'Other',
				y: 61.41,
				sliced: true,
				selected: true
			}, {
				name: 'MCA',
				y: 11.84
			}, {
				name: 'MBA',
				y: 10.85
			}, {
				name: 'B. Tech.',
				y: 4.67
			}, {
				name: 'Msc (Maths)',
				y: 4.18
			}, {
				name: 'B.A. (English)',
				y: 1.64
			}, {
				name: 'M.Com.',
				y: 1.6
			}, {
				name: 'PGDCA',
				y: 1.2
			}, {
				name: 'B.Ed.',
				y: 2.61
			}]
		}]
	});
}