<html>
<head>
		<!-- Style Sheets -->
		<link href="/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/fontawesome/fontawesome-5.15.3/css/all.min.css" rel="stylesheet">
		<link href="/css/student-registration.css" rel="stylesheet">
		
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
				
			<div class="container-fluid">
				<div class="row mt-2 mb-2">
					<div class="col-6 col-sm-3 col-md-2 col-lg-2"><img style="height:8rem; width:8rem" src="/images/pu-logo.png" alt="pu logo"></div>
					<div class="col-6 col-sm-9 col-md-10 col-lg-10 d-flex align-content-center flex-wrap justify-content-center">
						<h1 class="display-3 text-center"> <strong> University School Of Open Learning </strong> </h1>
					</div>
				</div>
			</div>
			
			<div class="card text-center ms-2 bg-secondary bg-#ff0013 border border-dark border border-4 ">
				<div class="card-body">
		    	<h1 class="card-title">Teacher's Profile</h1>
		    	</div>
	    	</div>

			
			<div class="container" id="teacher'sProfile">
				
				<div class="row mt-2 mb-2">
				<div class="col-md-4">
					<label for="inputCourse" class="form-label text-black">Course</label>
					<select id="inputcourse" class="form-select">
					      <option selected>Choose Course...</option>
					      <option>...</option>
					</select>
				</div>
				<div class="col-md-4">
					<label for="inputSemester" class="form-label text-black">Semester</label>
					<select id="inputSemester" class="form-select">
					      <option selected>Choose Semester...</option>
					      <option>...</option>
					</select>
				</div>
				<div class="col-md-4">
					<label for="inputSubject" class="form-label text-black">Subject</label>
					<select id="inputSubject" class="form-select">
					      <option selected>Choose Subject...</option>
					      <option>...</option>
					</select>
				</div>
								
				<table class="table table-hover">
				  <thead>
				    <tr>
				      <th scope="col">Sr No.</th>
				      <th scope="col">Roll No.</th>
				      <th scope="col">Name</th>
				      <th scope="col">MST </th>
				      <th scope="col">Internal</th>
				      <th scope="col">Theory</th>
				      <th scope="col">Practical</th>
				      <th scope="col">Viva</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th scope="row">1</th>
				      <th scope="col">1105</th>
				      <th scope="col">Naina</th>
				      <th scope="col">45</th>
				      <th scope="col">08</th>
				      <th scope="col">56</th>
				      <th scope="col">35</th>
				      <th scope="col">10</th>
				    </tr>
				    <tr>
				      <th scope="row">2</th>
				      <th scope="col">1106</th>
				      <th scope="col">Mehar</th>
				      <th scope="col">45</th>
				      <th scope="col">08</th>
				      <th scope="col">56</th>
				      <th scope="col">35</th>
				      <th scope="col">10</th>
				    </tr>
				    <tr>
				      <th scope="row">3</th>
				      <th scope="col">1107</th>
				      <th scope="col">Sandeep</th>
				      <th scope="col">45</th>
				      <th scope="col">08</th>
				      <th scope="col">56</th>
				      <th scope="col">35</th>
				      <th scope="col">10</th>
				    </tr>
				    <tr>
				    <th scope="row">4</th>
				      <th scope="col">1108</th>
				      <th scope="col">Mandeep</th>
				      <th scope="col">35</th>
				      <th scope="col">06</th>
				      <th scope="col">46</th>
				      <th scope="col">35</th>
				      <th scope="col">09</th>
				    </tr>
				     <tr>
				    <th scope="row">5</th>
				      <th scope="col">1109</th>
				      <th scope="col">Bhanu</th>
				      <th scope="col">45</th>
				      <th scope="col">08</th>
				      <th scope="col">57</th>
				      <th scope="col">32</th>
				      <th scope="col">09</th>
				    </tr>
				     <tr>
				      <th scope="col">6</th>
				      <th scope="col">1110</th>
				      <th scope="col">Rabia</th>
				      <th scope="col">46</th>
				      <th scope="col">09</th>
				      <th scope="col">55</th>
				      <th scope="col">35</th>
				      <th scope="col">08</th>
				    </tr>
				     <tr>
				      <th scope="col">7</th>
				      <th scope="col">1111</th>
				      <th scope="col">Mehak</th>
				      <th scope="col">48</th>
				      <th scope="col">09</th>
				      <th scope="col">58</th>
				      <th scope="col">38</th>
				      <th scope="col">08</th>
				    </tr>
				    <tr>
				      <th scope="col">8</th>
				      <th scope="col">1112</th>
				      <th scope="col">Nisha</th>
				      <th scope="col">38</th>
				      <th scope="col">05</th>
				      <th scope="col">48</th>
				      <th scope="col">30</th>
				      <th scope="col">07</th>
				    </tr>
				     <tr>
				      <th scope="col">9</th>
				      <th scope="col">1113</th>
				      <th scope="col">Isha</th>
				      <th scope="col">36</th>
				      <th scope="col">04</th>
				      <th scope="col">45</th>
				      <th scope="col">30</th>
				      <th scope="col">07</th>
				    </tr>
				     <tr>
				      <th scope="col">10</th>
				      <th scope="col">1114</th>
				      <th scope="col">Manisha</th>
				      <th scope="col">38</th>
				      <th scope="col">05</th>
				      <th scope="col">48</th>
				      <th scope="col">30</th>
				      <th scope="col">07</th>
				    </tr>
				  </tbody>
				</table>
				  	</div>
		  		</div>
		  	    
		  		<input class="btn btn-primary" type="submit" value="Submit">
		</div>
</body>
</html>