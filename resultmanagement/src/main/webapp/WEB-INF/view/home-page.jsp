<html>
	<head>
		<!-- Style Sheets -->
		<link href="/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		<link href="/css/login.css" rel="stylesheet">
		
		<!-- JavaScripts -->
		<script src="/jquery/jquery-3.6.0/jquery-3.6.0.min.js"></script>		
		<script src="/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.bundle.min.js"></script>
		<script src="/fontawesome/fontawesome-5.15.3/js/all.min.js"></script>
		<script src="/highcharts/highcharts-9.1.0/highcharts.js"></script>
		<script src="/js/utils/constants.js"></script>
		<script src="/js/login-handler.js"></script>
		<script src="/js/home.js"></script>
		
		<style type="text/css">
			body, html {
				height: 100%;
			}
			
			.bg {
				/* The image used */
				background-image: url("images/home-background.png");
			
				/* Full height */
				height: 100%;
			
				/* Center and scale the image nicely */
				background-position: center;
				background-repeat: no-repeat;
				background-size: cover;
			}
		</style>
	</head>
	<body class= "bg" > 
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
		
		<div id="login-carousel" class="carousel slide" data-bs-ride="carousel">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
			</div>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="/images/result-mg-Ants.png" class="d-block w-100" alt="..."/>
					<div class="carousel-caption d-none d-sm-block d-md-block">
					</div>
				</div>
				<div class="carousel-item">
					<img src="/images/User-friendly.png" class="d-block w-100" alt="..."/>
					<div class="carousel-caption d-none d-sm-block d-md-block">
					</div>
				</div>
				<div class="carousel-item">
					<img src="/images/Statistical-representation.png" class="d-block w-100" alt="..."/>
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
		<br/>
		<button type="button" id="studentRegistrationBtn" class="btn btn-warning ms-2"><span>Registration</span>&nbsp;<span class="badge bg-danger">NEW</span></button>
		<br/>
		<div class="container-fluid">
			<div class="row">
				<div class="col-4">
					<div id="courseWiseStudentsEnrolled" style="width:100%; height:15rem;">
					</div>
				</div>
				<div class="col-4 border rounded" style="background-color: #ecb0b012">
					<form id="loginForm">
						<div class="mb-3">
							<label class="form-label">Username</label>
							<input type="text" class="form-control" id="loginUsername" aria-describedby="usernameHelp"/>
							<div class="invalid-feedback"> Please provide a valid username.</div>
							<div id="usernameHelp" class="form-text">Usually it is your university registration number or employee id</div>
						</div>
						<div class="mb-3">
							<label class="form-label">Password</label>
							<input type="password" class="form-control"	id="loginPassword">
							<div class="invalid-feedback"> Password can't be empty or whitespaces.</div>
						</div>
						<button id="loginSubmitBtn" type="submit" class="btn btn-primary">
							<span>Login</span>
							<span id="loginLoadingSpinner" class="spinner-grow spinner-grow-sm d-none" role="status" aria-hidden="true"></span>
						</button>
					</form>
				</div>
				<div class="col-4">
					<div id="categoryWiseEnrollments" style="width:100%; height:15rem;">
					</div>
				</div>
			</div>
		</div>
	</body>
</html>