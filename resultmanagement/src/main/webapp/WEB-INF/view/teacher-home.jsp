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
					<div class="col-6 col-sm-3 col-md-2 col-lg-2">
						<img style="height:8rem; width:8rem" src="/images/pu-logo.png" alt="pu logo"/>
					</div>
					<div class="col-6 col-sm-9 col-md-10 col-lg-10 d-flex align-content-center flex-wrap justify-content-center">
						<h1 class="display-3 text-center">
							<strong> University School Of Open Learning </strong>
						</h1>
					</div>
				</div>
			</div>
	
			<div class="card text-center ms-2 bg-secondary border border-dark border border-1 rounded-1" style="background-color: #dc61614d">
				<div class="card-body">
					<h1 class="card-title">Teacher's Profile</h1>
				</div>
			</div>
	
	
			<div class="container" id="teacher-Profile">
	
				<div class="row mt-2 mb-2">
					<div class="col-md-4">
						<label for="inputCourse" class="form-label text-black">Course</label>
						<select id="inputcourse" class="form-select">
							<option>B.E CSE</option>
							<option>PGDCA</option>
						</select>
					</div>
					<div class="col-md-4">
						<label for="inputSemester" class="form-label text-black">Semester</label>
						<select id="inputSemester" class="form-select">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
						</select>
					</div>
					<div class="col-md-4">
						<label for="inputSubject" class="form-label text-black">Subject</label>
						<select id="inputSubject" class="form-select">
							<option>Subject - 1</option>
							<option>Subject - 2</option>
							<option>Subject - 3</option>
							<option>Subject - 4</option>
							<option>Subject - 5</option>
						</select>
					</div>
				</div>
			</div>
			<div class="container" style="background-color: #00000040;">
				<div class="row">
					<div class="col">
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
									<td scope="row">1</td>
									<td scope="col">1105</td>
									<td scope="col">Naina</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
								<tr>
									<td scope="row">2</td>
									<td scope="col">1106</td>
									<td scope="col">Mehar</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
								<tr>
									<td scope="row">3</td>
									<td scope="col">1107</td>
									<td scope="col">Sandeep</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
								<tr>
									<td scope="row">4</td>
									<td scope="col">1108</td>
									<td scope="col">Mandeep</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
								<tr>
									<td scope="row">5</td>
									<td scope="col">1109</td>
									<td scope="col">Bhanu</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
								<tr>
									<td scope="col">6</td>
									<td scope="col">1110</td>
									<td scope="col">Rabia</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
								<tr>
									<td scope="col">7</td>
									<td scope="col">1111</td>
									<td scope="col">Mehak</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
								<tr>
									<td scope="col">8</td>
									<td scope="col">1112</td>
									<td scope="col">Nisha</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
								<tr>
									<td scope="col">9</td>
									<td scope="col">1113</td>
									<td scope="col">Isha</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
								<tr>
									<td scope="col">10</td>
									<td scope="col">1114</td>
									<td scope="col">Manisha</td>
									<td scope="col"><input type="number" min="0" max="50" placeholder="MST"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="Internal"></td>
									<td scope="col"><input type="number" min="0" max="60" placeholder="Theory"></td>
									<td scope="col"><input type="number" min="0" max="40" placeholder="Practical"></td>
									<td scope="col"><input type="number" min="0" max="10" placeholder="viva"></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-11"></div>
					<div class="col-1">
						<input class="btn btn-primary" type="submit" value="Submit"/>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>