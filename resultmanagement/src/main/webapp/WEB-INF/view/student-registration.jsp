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
		<script src="/highcharts/highcharts-9.1.0/highcharts.js"></script>
		<script src="/js/utils/common-utils.js"></script>
		<script src="/js/student-handler.js"></script>
		<script src="/js/student-chart-handler.js"></script>
	</head>
	<body>
		<div class = "bg"></div>
		<div class="mainbodycontent" >
				
			<div class="container">
				<div class="row mt-2 mb-2">
					<div class="col-1"><img style="height:8rem; width:8rem" src="/images/pu-logo.png" alt="pu logo"></div>
					<div class="col-11 d-flex align-content-center flex-wrap justify-content-center"><h1 class="display-1">University School Of Open Learning</h1></div>
				</div>
				<div class="row">
					<div class="col">
						<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
							<button class="navbar-toggler border-0" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
								<span class="navbar-toggler-icon"></span>
							</button>
							<div class="collapse navbar-collapse ps-2" id="navbarScroll">
								<ul class="navbar-nav">
									<li id="nav-home" class="nav-item active">
										<a class="nav-link" href="#">Home <i class="fas fa-home"></i></a>
									</li>
									<li id="nav-profile" class="nav-item active">
										<a class="nav-link" href="#">Profile <i class="fas fa-user"></i></a>
									</li>
									<li id="nav-account" class="nav-item active">
										<a class="nav-link" href="#">Account <i class="far fa-user-circle"></i></a>
									</li>
									<li id="nav-academics" class="nav-item active">
										<a class="nav-link" href="#">Academics <i class="fas fa-book-open"></i></a>
									</li>
								</ul>
							</div>
							<span class="navbar-brand text-end ps-2" href="#">Welcome  ${studentname}!</span>
							<span id="logoutBtn" class="me-2 text-white" style="cursor: pointer;"><i class="fas fa-door-open"></i></span>
						</nav>
					</div>
				</div>
			</div>
			<div class="container">
				<div class="row">
					<div class="col-3">
						<div id="percentageHistory" style="width:100%; height:15rem;">
						</div>
					</div>
					<div class="col-3"></div>
					<div class="col-3"></div>
					<div class="col-3"></div>
				</div>
			</div>
			<div class="container">
						<form class="row g-3 needs-validation" novalidate>
			  			<div class="col-md-4">
					    		<label for="validationCustom01" class="form-label">Student name</label>
					   			<input type="text" class="form-control" id="validationCustom01" value="First Name" required>
					    <div class="valid-feedback">
					             Looks good!
					    </div>
					  	</div>
					  	<div class="col-md-4">
					    		<label for="validationCustom02" class="form-label">Middle name</label>
					    		<input type="text" class="form-control" id="validationCustom02" value="Middle Name" required>
					   	<div class="valid-feedback">
					      Looks good!
					   	 </div>
					  	 </div>
					  	 <div class="col-md-4">
					    		<label for="validationCustom03" class="form-label">Last name</label>
					   			<input type="text" class="form-control" id="validationCustom03" value="Last Name" required>
					     <div class="valid-feedback">
					             Looks good!
					    </div>
					  	</div>
					  	<div class="col-md-4">
					    		<label for="validationCustom01" class="form-label">Date</label>
					   			<input type="text" class="form-control" id="validationCustom01" value="01" required>
					    <div class="valid-feedback">
					             Looks good!
					    </div>
					  	</div>
					  	<div class="col-md-4">
					    		<label for="validationCustom02" class="form-label">Month</label>
					    		<input type="text" class="form-control" id="validationCustom02" value="12" required>
					   	<div class="valid-feedback">
					      Looks good!
					   	 </div>
					  	 </div>
					  	 <div class="col-md-4">
					    		<label for="validationCustom03" class="form-label">Year</label>
					   			<input type="text" class="form-control" id="validationCustom03" value="1990" required>
					     <div class="valid-feedback">
					             Looks good!
					    </div>
					  	</div>
					  	<div class="col-md-6">
					    		<label for="validationCustom01" class="form-label">Father's Name</label>
					   			<input type="text" class="form-control" id="validationCustom01" value="Mr." required>
					    <div class="valid-feedback">
					             Looks good!
					    </div>
					  	</div>
					  	<div class="col-md-6">
					    		<label for="validationCustom02" class="form-label">Occupation</label>
					    		<input type="text" class="form-control" id="validationCustom02" value="Occupation" required>
					   	<div class="valid-feedback">
					   	</div>
					   	</div>
						<div class="col-md-6">
					    		<label for="validationCustom01" class="form-label">Mother's Name</label>
					   			<input type="text" class="form-control" id="validationCustom01" value="Mrs." required>
					    <div class="valid-feedback">
					             Looks good!
					    </div>
					  	</div>
					  	<div class="col-md-6">
					    		<label for="validationCustom02" class="form-label">Occupation</label>
					    		<input type="text" class="form-control" id="validationCustom02" value="Occupation" required>
					   	<div class="valid-feedback">
					   	</div>
					   	</div>
						<div class="col-12">
								<label for="PermanentAddress" class="form-label">Address</label>
								<input type="text" class="form-control" id="PermanentAddress" placeholder="Permanent Address">
						</div>
						<div class="col-md-6">
								<label for="inputCity" class="form-label">City</label>
								<input type="text" class="form-control" id="inputCity">
						</div>
						<div class="col-md-4">
								<label for="inputState" class="form-label">State</label>
								<select id="inputState" class="form-select">
								      <option selected>Choose...</option>
								      <option>...</option>
								</select>
						</div>
						<div class="col-md-2">
								<label for="inputPincode" class="form-label">Pincode</label>
								<input type="text" class="form-control" id="inputPincode">
						</div>
						
						<div class="col-12">
								<label for="CorrespondenceAddress" class="form-label">Address 2</label>
								<input type="text" class="form-control" id="CorrespondenceAddress" placeholder="Correspondence Address">
						</div>
						<div class="col-md-6">
								<label for="inputCity" class="form-label">City</label>
								<input type="text" class="form-control" id="inputCity">
						</div>
						<div class="col-md-4">
								<label for="inputState" class="form-label">State</label>
								<select id="inputState" class="form-select">
								      <option selected>Choose...</option>
								      <option>...</option>
								</select>
						</div>
						<div class="col-md-2">
								<label for="inputPincode" class="form-label">Pincode</label>
								<input type="text" class="form-control" id="inputPincode">
						</div>
						<div class="col-md-6">
								<label for="inputCourse" class="form-label">Course</label>
								<select id="inputcourse" class="form-select">
								      <option selected>Choose...</option>
								      <option>...</option>
								</select>
						</div>
						<div class="col-md-2">
								<label for="inputCourseType" class="form-label">Regular/Private</label>
								<select id="inputCourseType" class="form-select">
								      <option selected>Choose...</option>
								      <option>...</option>
								</select>
						</div>
						<div class="col-md-2">
								<label for="inputSemester" class="form-label">Semester</label>
								<select id="inputSemester" class="form-select">
								      <option selected>Choose...</option>
								      <option>...</option>
								</select>
						</div>
						<div class="col-md-2">
								<label for="inputSession" class="form-label">Session</label>
								<input type="text" class="form-control" id="inputSession">
						</div>
		  		</form>
		  		</div>
		  	
		</div>
	</body>
</html>