<html>
	<head>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!-- Style Sheets -->
		<link href="/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		<link href="/css/student-common.css" rel="stylesheet">
		<link href="/css/student-common-animation.css" rel="stylesheet">
		<link href="/css/student-academics.css" rel="stylesheet">
		
		<!-- JavaScripts -->
		<script src="/jquery/jquery-3.6.0/jquery-3.6.0.min.js"></script>		
		<script src="/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.bundle.min.js"></script>
		<script src="/fontawesome/fontawesome-5.15.3/js/all.min.js"></script>
		<script src="/highcharts/highcharts-9.1.0/highcharts.js"></script>
		<script src="/highcharts/highcharts-9.1.0/highcharts-3d.js"></script>
		<script src="/highcharts/highcharts-9.1.0/modules/treemap.js"></script>
		<script src="/highcharts/highcharts-9.1.0/modules/exporting.js"></script>
		<script src="/js/utils/common-utils.js"></script>
		<script src="/js/student-handler.js"></script>
		<script src="/js/student-academic-handler.js"></script>
		<script src="/js/chart-handler/student-academics-chart-handler.js"></script>
		
		<title>Statistical Result Management - Student Academics</title>
	</head>
	<body>
		<div class = "bg"></div>
		<div class="mainbodycontent">
			<div class="container-fluid">
				<div class="row mt-2 mb-2">
					<div class="col-6 col-sm-3 col-md-2 col-lg-2"><img style="height:8rem; width:8rem" src="/images/pu-logo.png" alt="pu logo"></div>
					<div class="col-6 col-sm-9 col-md-10 col-lg-10 d-flex align-content-center flex-wrap justify-content-center">
						<h1 class="display-3 text-center fw-bold top-title-heading">University School Of Open Learning</h1>
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
					<div class="col-sm-12 col-md-12 col-lg-4 col-xl-4 mb-1">
						<div id="overallCourseChart" class="scale-in-center" style="width:100%; height:15rem;">
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-4 col-xl-4 mb-1">
						<ul class="nav nav-pills mb-3 scale-in-center" id="course-wise-details-tab" role="tablist">
							<c:forEach var="courseWiseSubjects" items="${courseWiseSubjectsList}">
								<li class="nav-item" role="presentation">
									<button class="nav-link" id="${courseWiseSubjects.getCourseId()}-tab" data-bs-toggle="pill" data-bs-target="#${courseWiseSubjects.getCourseId()}"
										type="button" role="tab" aria-controls="${courseWiseSubjects.getCourseId()}" aria-selected="true">${courseWiseSubjects.getCourseName()}</button>
								</li>
							</c:forEach>
						</ul>
						<div class="tab-content scale-in-center" id="course-wise-details-tabContent">
							<c:forEach var="courseWiseSubjects" items="${courseWiseSubjectsList}">
								<div class="tab-pane fade" id="${courseWiseSubjects.getCourseId()}" role="tabpanel" aria-labelledby="${courseWiseSubjects.getCourseName()}-tab">
									<c:forEach var="subjectName" items="${courseWiseSubjects.getSubjects()}">
										<span class="badge rounded-pill bg-danger">${subjectName}</span>
									</c:forEach>
								</div>
							</c:forEach>
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-4 col-xl-4 mb-1">
						<div id="classVersusPercentage" class="scale-in-center" style="width:100%; height:15rem;">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12 col-md-6 col-lg-4 col-xl-4 mb-1">
						<div id="semesterWiseDistributionPerformance" class="scale-in-center" style="width:100%; height:15rem;">
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-4 col-xl-4 mb-1">
						<div id="distributionWiseCourseLevelPerformance" class="scale-in-center" style="width:100%; height:15rem;">
						</div>
					</div>
					<div class="col-sm-12 col-md-4 col-lg-4 col-xl-4 mb-1">
						<div id="percentageHistory" class="scale-in-center" style="width:100%; height:15rem;">
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>