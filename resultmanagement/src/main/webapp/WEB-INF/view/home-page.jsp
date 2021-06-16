<html>
	<head>
		<!-- Style Sheets -->
		<link href="/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		<link href="/css/login.css" rel="stylesheet">
		<link href="/css/home-page.css" rel="stylesheet">
		
		<!-- JavaScripts -->
		<script src="/jquery/jquery-3.6.0/jquery-3.6.0.min.js"></script>		
		<script src="/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.bundle.min.js"></script>
		<script src="/fontawesome/fontawesome-5.15.3/js/all.min.js"></script>
		<script src="/highcharts/highcharts-9.1.0/highcharts.js"></script>
		<script src="/highcharts/highcharts-9.1.0/modules/exporting.js"></script>
		<script src="/js/utils/constants.js"></script>
		<script src="/js/login-handler.js"></script>
		<script src="/js/home.js"></script>
		
		<title>Statistical Result Management - Home</title>
	</head>
	<body>
		<div class = "bg"></div>
		<!-- Modal -->
		<div class="modal fade" id="loginErrorModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="staticBackdropLabel">Important <i class="fas fa-exclamation"></i></h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
					</div>
					<div class="modal-body">
						<label id="modal-message">Invalid username or password. Kindly check and try again.</label>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-bs-dismiss="modal"><i class="far fa-check-circle"></i></button>
					</div>
				</div>
			</div>
		</div>
		<div class="mainbodycontent">
			<div id="login-carousel" class="carousel slide mb-2 scale-in-center" data-bs-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="/images/carousel-1.jpg" class="d-block w-100 img-fluid kenburns-top-left" alt="..."/>
						<div class="carousel-caption d-none d-sm-block d-md-block">
						</div>
					</div>
					<div class="carousel-item">
						<img src="/images/carousel-2.jpg" class="d-block w-100 img-fluid kenburns-top" alt="..."/>
						<div class="carousel-caption d-none d-sm-block d-md-block">
						</div>
					</div>
					<div class="carousel-item">
						<img src="/images/carousel-3.jpg" class="d-block w-100 img-fluid kenburns-left" alt="..."/>
						<div class="carousel-caption d-none d-sm-block d-md-block">
						</div>
					</div>
				</div>
				<button class="carousel-control-prev" type="button" data-bs-target="#login-carousel" data-bs-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Previous</span>
				</button>
				<button class="carousel-control-next" type="button" data-bs-target="#login-carousel" data-bs-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Next</span>
				</button>
			</div>
			<button type="button" id="studentRegistrationBtn" class="btn btn-warning ms-2 mb-2 scale-in-center"><span>Registration</span>&nbsp;<span class="badge bg-danger">NEW</span></button>
			<br/>
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-12 col-md-4 col-lg-4 col-xl-4">
						<div id="courseWiseStudentsEnrolled" class="scale-in-center" style="width:100%; height:15rem;">
						</div>
					</div>
					<div class="col-sm-12 col-md-4 col-lg-4 col-xl-4 border rounded scale-in-center" style="background-color: #ecb0b012">
						<form id="loginForm">
							<div class="mb-3">
								<label class="form-label">Username</label>
								<input type="text" class="form-control" id="loginUsername" aria-describedby="usernameHelp"/>
								<div class="invalid-feedback"> Please provide a valid username.</div>
								<div id="usernameHelp" class="form-text text-dark">Usually it is your university registration number or employee id</div>
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label>
								<input type="password" class="form-control"	id="loginPassword">
								<div class="invalid-feedback"> Password can't be empty or whitespaces.</div>
							</div>
							<button id="loginSubmitBtn" type="submit" class="btn btn-primary scale-in-center">
								<span>Login</span>
								<span id="loginLoadingSpinner" class="spinner-grow spinner-grow-sm d-none" role="status" aria-hidden="true"></span>
							</button>
						</form>
					</div>
					<div class="col-sm-12 col-md-4 col-lg-4 col-xl-4">
						<div id="categoryWiseEnrollments" class="scale-in-center" style="width:100%; height:15rem;">
						</div>
					</div>
				</div>
			</div>
		</div> 
	</body>
</html>