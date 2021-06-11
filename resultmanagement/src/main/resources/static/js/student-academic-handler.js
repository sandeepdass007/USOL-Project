/**
 * Student Academic Handler
 */

$("document").ready(function() {
	// navbar button active issue
	var firstNavButton = $("#course-wise-details-tab .nav-link").first();
	firstNavButton.addClass("active");
	
	var firstNavPane = $("#course-wise-details-tabContent > .tab-pane").first();
	firstNavPane.addClass("show active");
	
	$("button[data-bs-toggle='pill']").on("shown.bs.tab", function() {
		populateOverallCourseChart();
		populateClassVersusPercentage();
		populateSemesterWiseDistributionPerformance();
		populateDistributionWiseCourseLevelPerformance();
		populatePercentageHistoryChart();
	});
});