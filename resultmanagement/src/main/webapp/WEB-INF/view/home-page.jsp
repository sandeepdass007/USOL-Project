<html>
	<head>
		<!-- Style Sheets -->
		<link href="bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		
		<!-- JavaScripts -->
		<script src="jquery/jquery-3.6.0/jquery-3.6.0.min.js"></script>		
		<script src="bootstrap/bootstrap-5.0.1-dist/js/bootstrap.bundle.min.js"></script>
		<script src="fontawesome/fontawesome-5.15.3/js/all.min.js"></script>
		<script src="js/utils/common-utils.js"></script>
		<script src="js/login-handler.js"></script>
		
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
		<div class="container">
			<div class="row">
				<div class="col-4"></div>
				<div class="col-4">
					<form>
						<div class="mb-3">
							<label class="form-label">Username</label>
							<input type="text" class="form-control" id="loginUsername" aria-describedby="usernameHelp"/>
							<div id="usernameHelp" class="form-text">Usually it is your application number or enrollment number</div>
						</div>
						<div class="mb-3">
							<label class="form-label">Password</label>
							<input type="password" class="form-control"	id="loginPassword">
						</div>
						<button id="loginSubmitBtn" type="button" class="btn btn-primary">Login</button>
					</form>
				</div>
				<div class="col-4"></div>
			</div>
		</div>
	</body>
</html>