/**
 * Student Page Chart Handler
 */

$("document").ready(function() {
	StudentChartHandler.createPercentageHistoryChart("percentageHistory");
});

var StudentChartHandler = function() {

	function createPercentageHistoryChart(chartContainerId) {
		const chart = Highcharts.chart(chartContainerId, {
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

	return {
		createPercentageHistoryChart: function(chartContainerId) {
			return createPercentageHistoryChart(chartContainerId);
		}
	}

}();