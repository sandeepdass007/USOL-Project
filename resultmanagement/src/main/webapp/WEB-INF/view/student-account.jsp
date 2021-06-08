<html>
	<head>
		<!-- Style Sheets -->
		<link href="/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		<link href="/css/student-account.css" rel="stylesheet">
		
		<!-- JavaScripts -->
		<script src="/jquery/jquery-3.6.0/jquery-3.6.0.min.js"></script>		
		<script src="/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.bundle.min.js"></script>
		<script src="/fontawesome/fontawesome-5.15.3/js/all.min.js"></script>
		<script src="/js/utils/common-utils.js"></script>
		<script src="/js/student-handler.js"></script>
		<script src="/js/student-account-handler.js"></script>
	</head>
	<body>
		<div class = "bg"></div>
		<!-- Modal -->
		<div class="modal fade" id="changePasswordErrorModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="staticBackdropLabel">Important <i class="fas fa-exclamation"></i></h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
					</div>
					<div class="modal-body">
						<label id="modal-message">Error while changing password</label>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-bs-dismiss="modal"><i class="far fa-check-circle"></i></button>
					</div>
				</div>
			</div>
		</div>
		<!-- Modal -->
		<div class="modal fade" id="passwordChangedModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="staticBackdropLabel">Info <i class="fas fa-exclamation"></i></h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
					</div>
					<div class="modal-body">
						<label id="modal-message">Password changed successfully!</label>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-bs-dismiss="modal"><i class="far fa-check-circle"></i></button>
					</div>
				</div>
			</div>
		</div>
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
			<h1 class="display-3 text-center">Student Account Page</h1>
			<div class="container">
				<div class="row">
					<div class="col-4">
					</div>
					<div class="col-4 border rounded" style="background-color: #ecb0b012">
						<form id="changePasswordForm">
							<div class="mb-3">
								<label class="form-label">Current Password</label>
								<input type="password" class="form-control" id="currentPassword" aria-describedby="usernameHelp"/>
								<div class="invalid-feedback">Password can't be empty or whitespaces.</div>
							</div>
							<div class="mb-3">
								<label class="form-label">New Password</label>
								<input type="password" class="form-control"	id="newPassword">
								<div class="invalid-feedback">Password can't be empty or whitespaces.</div>
							</div>
							<div class="mb-3">
								<label class="form-label">Confirm New Password</label>
								<input type="password" class="form-control"	id="confirmNewPassword">
								<div class="invalid-feedback">Do not match with new password</div>
							</div>
							<button id="submitBtn" type="submit" class="btn btn-primary">
								<span>Submit</span>
								<span id="submitLoadingSpinner" class="spinner-grow spinner-grow-sm d-none" role="status" aria-hidden="true"></span>
							</button>
						</form>
					</div>
					<div class="col-4">
					</div>
				</div>
			</div>
		</div>
	</body>
</html>