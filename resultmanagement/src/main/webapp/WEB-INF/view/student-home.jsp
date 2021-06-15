<html>
	<head>
		<!-- Style Sheets -->
		<link href="/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		<link href="/css/student-common.css" rel="stylesheet">
		<link href="/css/student-common-animation.css" rel="stylesheet">
		
		<!-- JavaScripts -->
		<script src="/jquery/jquery-3.6.0/jquery-3.6.0.min.js"></script>		
		<script src="/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.bundle.min.js"></script>
		<script src="/fontawesome/fontawesome-5.15.3/js/all.min.js"></script>
		<script src="/js/utils/common-utils.js"></script>
		<script src="/js/student-handler.js"></script>
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
			<h1 class="display-3 text-center">Student Home Page</h1>
			<br/>
			<div class="container" style="opacity: 0.5">
				<div class="row mb-2" style="height: 15rem;">
					<div class="col-4 bg-primary bounce-in-left"> <p class= "text-white"> Notice </p></div>
					<div class="col-4 bg-secondary bounce-in-top"><p class= "text-white">Gallery</p></div>
					<div class="col-4 bg-danger bounce-in-right"><p class= "text-white">Extra-curricular Activities</p></div>
				</div>
				<div class="row" style="height: 15rem;">
					<div class="col-3 bg-success bounce-in-left"><p class= "text-white">Homework</p></div>
					<div class="col-3 bg-warning bounce-in-bottom"><p class= "text-white">Assignment</p></div>
					<div class="col-3 bg-info bounce-in-bottom"><p class= "text-white"> House Activity</p></div>
					<div class="col-3 bg-dark bounce-in-right"><p class= "text-white">Attendance Record</p></div>
				</div>
			</div>
		</div>
	</body>
</html>