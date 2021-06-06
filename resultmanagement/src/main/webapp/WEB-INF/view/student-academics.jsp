<html>
	<head>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!-- Style Sheets -->
		<link href="/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		<link href="/css/student-common.css" rel="stylesheet">
		<link href="/css/student-academics.css" rel="stylesheet">
		
		<!-- JavaScripts -->
		<script src="/jquery/jquery-3.6.0/jquery-3.6.0.min.js"></script>		
		<script src="/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.bundle.min.js"></script>
		<script src="/fontawesome/fontawesome-5.15.3/js/all.min.js"></script>
		<script src="/highcharts/highcharts-9.1.0/highcharts.js"></script>
		<script src="/highcharts/highcharts-9.1.0/highcharts-3d.js"></script>
		<script src="/highcharts/highcharts-9.1.0/modules/treemap.js"></script>
		<script src="/js/utils/common-utils.js"></script>
		<script src="/js/student-handler.js"></script>
		<script src="/js/chart-handler/student-academics-chart-handler.js"></script>
	</head>
	<body>
		<div class = "bg"></div>
		<div class="mainbodycontent">
			<div class="container-fluid">
				<div class="row mt-2 mb-2">
					<div class="col-6 col-sm-3 col-md-2 col-lg-2"><img style="height:8rem; width:8rem" src="/images/pu-logo.png" alt="pu logo"></div>
					<div class="col-6 col-sm-9 col-md-10 col-lg-10 d-flex align-content-center flex-wrap justify-content-center">
						<h1 class="display-3 text-center">University School Of Open Learning</h1>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<jsp:include page="student-navbar.jsp"></jsp:include>
					</div>
				</div>
			</div>
			<br/>
			<div class="container">
				<div class="row mb-2">
					<div class="col-4">
						<div id="overallCourseChart" style="width:100%; height:15rem;">
						</div>
					</div>
					<div class="col-4">
						<ul class="nav nav-pills mb-3" id="course-wise-details-tab" role="tablist">
							<c:forEach var="courseName" items="${courseVsSubjects.keySet()}">
								<li class="nav-item" role="presentation">
									<button class="nav-link active" id="${courseName}-tab" data-bs-toggle="pill" data-bs-target="#${courseName}"
										type="button" role="tab" aria-controls="${courseName}" aria-selected="true">${courseName}</button>
								</li>
							</c:forEach>
						</ul>
						<div class="tab-content" id="course-wise-details-tabContent">
							<c:forEach var="courseSubEntry" items="${courseVsSubjects.entrySet()}">
								<div class="tab-pane fade show active" id="${courseSubEntry.getKey()}" role="tabpanel" aria-labelledby="${courseSubEntry.getKey()}-tab">
									<c:forEach var="subjectName" items="${courseSubEntry.getValue()}">
										<span class="badge rounded-pill bg-danger">${subjectName}</span>
									</c:forEach>
								</div>
							</c:forEach>
						</div>
					</div>
					<div class="col-4">
						<div id="classVersusPercentage" style="width:100%; height:15rem;">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-4">
						<div id="semesterWiseDistributionPerformance" style="width:100%; height:15rem;">
						</div>
					</div>
					<div class="col-4">
						<div id="distributionWiseCourseLevelPerformance" style="width:100%; height:15rem;">
						</div>
					</div>
					<div class="col-4"></div>
				</div>
			</div>
		</div>
	</body>
</html>