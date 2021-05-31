<html>
	<head>
		<!-- Style Sheets -->
		<link href="/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		<link href="/css/student-common.css" rel="stylesheet">
		
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
					<div class="col-1"><img style="height:8rem; width:8rem" src="/images/pu-logo.png" alt="pu logo"></div>
					<div class="col-11 d-flex align-content-center flex-wrap justify-content-center"><h1 class="display-1">University School Of Open Learning</h1></div>
				</div>
				<div class="row">
					<div class="col">
						<jsp:include page="student-navbar.jsp"></jsp:include>
					</div>
				</div>
			</div>
			<h1 class="display-3">Student Academics Page</h1>
		</div>
	</body>
</html>