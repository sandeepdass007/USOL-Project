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
		chart: {
			backgroundColor: 'none'
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
				}
			}],
			data: [],
		}],
		plotOptions: {
			treemap: {
				dataLabels: {
					style: {
						color: 'black'
					}
				}
			}
		},
		title: {
			text: 'Overall Performance',
			style: {
				color: 'white'
			}
		}
	});

	chart.showLoading("Loading...");

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane.active").attr("id");

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
					name: 'Semester - ' + semester
				});
			});

			semesters.forEach(semester => {
				data[semester].forEach(record => {
					seriesData.push({
						parent: 'sem' + semester,
						value: record["marks"],
						name: record["subjectName"],
						color: CommonUtils.getRandomColor()
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

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane.active").attr("id");

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
				data: [],
				color: 'green'
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
	var chart = Highcharts.chart('semesterWiseDistributionPerformance', {
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
				text: 'Marks Obtained',
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
		series: []
	});

	chart.showLoading("Loading...");

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane.active").attr("id");

	$.ajax({
		url: '/chart/student-sem-dist-type-wise-marks?courseId=' + activeCourseId,
		async: true,
		type: 'GET',
		processData: false,
		contentType: 'application/json',
		success: function(data) {
			if (!data || data.length == 0) {
				chart.showLoading("No data available!");
				return;
			}

			// all type names
			var types = new Set();
			var maxSem = 1;
			// find out max semesters available in the database
			data.forEach(x => {
				types.add(x["type"]);
				if (x["semester"] > maxSem) {
					maxSem = x["semester"];
				}
			});

			var seriesData = [];
			for (var offset = 1; offset <= maxSem; offset++) {
				// filter array to get data of specific semester
				var queriedSemesterData = data.filter(x => {
					return x["semester"] == offset;
				});

				// if semester data is found then well and good
				if (queriedSemesterData && queriedSemesterData.length) {
					queriedSemesterData.forEach(entry => {
						var type = entry["type"];
						var marks = entry["marks"];
						var queriedSeriesData = seriesData.filter(x => {
							return x["name"] == type;
						});

						if (queriedSeriesData && queriedSeriesData.length) {
							queriedSeriesData[0]["data"].push(marks);
						} else {
							seriesData.push({
								name: type,
								data: [marks]
							});
						}
					});
				} else { // fill the entries with null
					types.forEach(type => {
						var queriedNASeriesData = seriesData.filter(x => {
							return x["name"] == type;
						});
						if (queriedNASeriesData && queriedNASeriesData.length) {
							queriedNASeriesData[0].data.push(null);
						} else {
							seriesData.push({
								name: type,
								data: [null]
							});
						}
					});
				}

				// if new distribution type is added just now which wasn't
				// available for other series data, then hydate them with null
				// to maintain the balance
				var queriedUnhydratedData = seriesData.filter(x => {
					return x["data"].length < offset;
				});

				if (queriedUnhydratedData && queriedUnhydratedData.length) {
					queriedUnhydratedData.forEach(x => {
						x["data"].splice(x["data"].length - 1, 0, null);
					});
				}
			}

			seriesData.forEach(seriesDatum => {
				chart.addSeries(seriesDatum, false);
			});
			chart.redraw();
			chart.hideLoading();
		},
		error: function(xhr, textStatus, errorThrown) {
			chart.showLoading("Error while fetching details from server!");
		}
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

	chart.showLoading("Loading...");

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane.active").attr("id");

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

	chart.showLoading("Loading...");

	var activeCourseId = $("#course-wise-details-tabContent .tab-pane.active").attr("id");

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