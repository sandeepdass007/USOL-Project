/**
 * 
 */

var StudentAcademicsChartHandler = function() {
	return {

	}
}();

$("document").ready(function() {

	populateOverallCourseChart();

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