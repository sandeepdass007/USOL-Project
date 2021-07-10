<html>
	<head>
		<!-- Style Sheets -->
		<link href="/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		<link href="/css/student-registration.css" rel="stylesheet">
		<link href="/select2/select2-4.1.0/css/select2.min.css" rel="stylesheet">
		
		<!-- JavaScripts -->
		<script src="/jquery/jquery-3.6.0/jquery-3.6.0.min.js"></script>		
		<script src="/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.bundle.min.js"></script>
		<script src="/select2/select2-4.1.0/js/select2.full.min.js"></script>
		<script src="/fontawesome/fontawesome-5.15.3/js/all.min.js"></script>
		<script src="/highcharts/highcharts-9.1.0/highcharts.js"></script>
		<script src="/js/utils/common-utils.js"></script>
		<script src="/js/DataCache.js"></script>
		<script src="/js/student-registration-handler.js"></script>
		<script src="/js/student-handler.js"></script>

	</head>
	<body>
		<div class = "bg"></div>
		<div class="mainbodycontent" >
				
			<div class="container-fluid">
				<div class="row mt-2 mb-2">
					<div class="col-6 col-sm-3 col-md-2 col-lg-2"><img style="height:8rem; width:8rem" src="/images/pu-logo.png" alt="pu logo"></div>
					<div class="col-6 col-sm-9 col-md-10 col-lg-10 d-flex align-content-center flex-wrap justify-content-center">
						<h1 class="display-3 text-center"> <strong> University School Of Open Learning </strong> </h1>
					</div>
				</div>
			</div>
			<div class="card text-center ms-2 border border-1 rounder-1" style="background-color: #00000040;">
				<div class="card-body">
		    	<h1 class="card-title text-white">Student Registration Form</h1>
		    	</div>
	    	</div>
			<div class="container" id="studentRegistrationForm">
				<div class= "row mt-2 mb-2" > 
		  			<div class="col-md-4">
				    	<label for="validationCustom01" class="form-label text-white">Student name</label>
				   		<input type="text" class="form-control" id="studentFirstName" placeholder="First Name" required>
				        <div class="valid-feedback">
				        </div>
				  	</div>
				  	<div class="col-md-4">
				    	<label for="validationCustom02" class="form-label text-white">Middle name</label>
				    	<input type="text" class="form-control" id="studentMiddleName" placeholder="Middle Name" required>
				   		<div class="valid-feedback">
				   	 	</div>
				  	 </div>
				  	 <div class="col-md-4">
				    	<label for="validationCustom03" class="form-label text-white">Last name</label>
				   		<input type="text" class="form-control" id="studentLastName" placeholder="Last Name" required>
				     	<div class="valid-feedback">
				    	</div>
				  	</div>
				</div>
				
				<div class="row mt-2 mb-2">
				  	<div class="col-md-4">
			    		<label for="validationCustom01" class="form-label text-white">Date</label>
			   			<input type="number" min="01" max="31" class="form-control" id="birthDate" placeholder="01" required>
				    	<div class="valid-feedback">
				    	</div>
				  	</div>
				  	<div class="col-md-4">
			    		<label for="validationCustom02" class="form-label text-white">Month</label>
			    		<input type="number" min="01" max="12" class="form-control" id="birthMonth" placeholder="12" required>
				   		<div class="valid-feedback">
				   		</div>
				  	 </div>
				  	 <div class="col-md-4">
			    		<label for="validationCustom03" class="form-label text-white">Year</label>
			   			<input type="number" min="1970" max="2021"class="form-control"class="form-control" id="birthYear" placeholder="1990" required>
			     		<div class="valid-feedback">
			    		</div>
				  	</div>
			  	</div>
			  	<div class="row mt-2 mb-2">
				  	<div class="col-md-4">
			    		<label for="validationCustom01" class="form-label text-white">Personal Contact No.</label>
			   			<input type="text" class="form-control" id="Contact details" placeholder="Enter Your No." required>
				    	<div class="valid-feedback">
				    	</div>
				  	</div>
				  	<div class="col-md-4">
			    		<label for="validationCustom02" class="form-label text-white">Home/Landline Contact No.</label>
			    		<input type="text" class="form-control" id="Contact Details" placeholder="Enter your Landline No." required>
				   		<div class="valid-feedback">
				   		</div>
				  	 </div>
				  	 <div class="col-md-4">
			    		<label for="validationCustom03" class="form-label text-white">Other Contact No</label>
			   			<input type="text" class="form-control" id="Contact Details" placeholder="Other Contact No.">
			     		<div class="valid-feedback">
			    		</div>
				  	</div>
			  	</div>
			  	
			  	
			  	<div class="row mt-2 mb-2">
				  	<div class="col-md-6">
				    		<label for="validationCustom01" class="form-label text-white">Father's Name</label>
				   			<input type="text" class="form-control" id="father'sName" placeholder="Mr." required>
				    		<div class="valid-feedback">
				    		</div>
				  	</div>
				  	<div class="col-md-6">
			    		<label for="validationCustom02" class="form-label text-white">Occupation</label>
			    		<input type="text" class="form-control" id="father'sOccupation" placeholder="Occupation" required>
			   			<div class="valid-feedback">
		   				</div>
				   	</div>
	   			</div>
		   		
		   		<div class="row mt-2 mb-2">
					<div class="col-md-6">
			    		<label for="validationCustom01" class="form-label text-white">Mother's Name</label>
			   			<input type="text" class="form-control" id="mother'sName" placeholder="Mrs." required>
			    		<div class="valid-feedback">
			    		</div>
			  		</div>
			  		<div class="col-md-6">
		    			<label for="validationCustom02" class="form-label text-white">Occupation</label>
			    		<input type="text" class="form-control" id="mother'sOccupation" placeholder="Occupation" required>
				   		<div class="valid-feedback">
				   		</div>
			   		</div>
			   </div>
			   
				<div class="row mt-2 mb-2">
					<div class="col-4">
						<label for="PermanentAddress" class="form-label text-white">Permanent Address</label>
						<input type="text" class="form-control" id="PermanentAddress" placeholder="Building No.">
					</div>
					<div class="col-4">
						<label for="PermanentAddress" class="form-label text-white">Locality</label>
						<input type="text" class="form-control" id="PermanentAddress" placeholder="Area/locality">
					</div>
					<div class="col-4">
						<label for="PermanentAddress" class="form-label text-white">Landmark</label>
						<input type="text" class="form-control" id="PermanentAddress" placeholder="Landmark">
					</div>
				</div>
				
				<div class="row mt-2 mb-2">
					<div class="col-md-3">
						<label for="permanentAddrCountry" class="form-label text-white">Country</label>
						<select id="permanentAddrCountry" class="form-select">
							<option selected>Choose...</option>
							<option>...</option>
						</select>
				</div>
					<div class="col-md-3">
						<label for="inputCity" class="form-label text-white">City</label>
						<select id="inputCity" class="form-select">
						      <option selected>Choose...</option>
						      <option>...</option>
						</select>
					</div>
					<div class="col-md-3">
						<label for="inputState" class="form-label text-white">State</label>
						<select id="inputState" class="form-select">
						      <option selected>Choose...</option>
						      <option>...</option>
						</select>
					</div>
					<div class="col-md-3">
						<label for="inputPincode" class="form-label text-white">Pincode</label>
						<input type="text" class="form-control" id="inputPincode">
					</div>
				</div>
				
				<div class="row mt-2 mb-2">
					<div class="col-4">
						<label for="CorrespondenceAddress" class="form-label text-white">Correspondence Address</label>
						<input type="text" class="form-control" id="CorrespondenceAddress" placeholder="Building No.">
					</div>
					<div class="col-4">
						<label for="CorrespondenceAddress" class="form-label text-white">Locality</label>
						<input type="text" class="form-control" id="CorrespondenceAddress" placeholder="Area/Locality">
					</div>
					<div class="col-4">
						<label for="CorrespondenceAddress" class="form-label text-white">Landmark</label>
						<input type="text" class="form-control" id="CorrespondenceAddress" placeholder="Landmark">
					</div>
				</div>
				
				<div class="row mt-2 mb-2">
					<div class="col-md-3">
						<label for="correspondenceAddrCountry" class="form-label text-white">Country</label>
						<select id="correspondenceAddrCountry" class="form-select">
							<option selected>Choose...</option>
							<option>...</option>
						</select>
				</div>
					<div class="col-md-3">
						<label for="inputCity" class="form-label text-white">City</label>
						<select id="inputCity" class="form-select">
						      <option selected>Choose...</option>
						      <option>...</option>
						</select>
					</div>
					<div class="col-md-3">
						<label for="inputState" class="form-label text-white">State</label>
						<select id="inputState" class="form-select">
						      <option selected>Choose...</option>
						      <option>...</option>
						</select>
					</div>
					<div class="col-md-3">
						<label for="inputPincode" class="form-label text-white">Pincode</label>
						<input type="text" class="form-control" id="inputPincode">
					</div>
				</div>

				<div class="custom-control custom-checkbox">
					  <input type="checkbox" class="custom-control-input" id="customCheck1">
					  <label class="custom-control-label" for="customCheck1">Same as permanent address</label>
				</div>
								
				<div class="row mt-2 mb-2">
				<div class="col-md-6">
					<label for="inputCourse" class="form-label text-white">Course</label>
					<select id="inputcourse" class="form-select">
					      <option selected>Choose...</option>
					      <option>...</option>
					</select>
				</div>
				<div class="col-md-2">
					<label for="inputCourseType" class="form-label text-white">Regular/Private</label>
					<select id="inputCourseType" class="form-select">
					      <option selected>Choose...</option>
					      <option>...</option>
					</select>
				</div>
				<div class="col-md-2">
					<label for="inputSemester" class="form-label text-white">Semester</label>
					<select id="inputSemester" class="form-select">
					      <option selected>Choose...</option>
					      <option>...</option>
					</select>
				</div>
				<div class="col-md-2">
					<label for="inputSession" class="form-label text-white">Session</label>
					<input type="text" class="form-control" id="inputSession">
				</div>
				<p>                         </p>
				<p>                         </p>
				<div class="row">
					<div class="col-6"></div>
					<div class="col-6">
						<input class="btn btn-primary" type="submit" value="Register"/>
					</div>
				</div>
	  		</div>
	  		</div>
	  	
		</div>
	</body>
</html>