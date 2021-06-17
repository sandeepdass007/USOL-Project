<html>
	<head>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		
		<title>Statistical Result Management - Student Profile</title>
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
			<h1 class="display-3 text-center tracking-in-contract-bck">Student Profile Page</h1>
			<div class="container slide-in-bck-center">
				<div class="row">
					<div class="col">
						<div class="accordion">
							<div class="accordion-item">
								<h4 class="accordion-header display-4" id="studentNamePanelHeading">
									<button class="accordion-button fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#studentNamePanel" aria-expanded="true" aria-controls="studentNamePanel">
										<span>Student Name</span>
									</button>
								</h4>
								<div id="studentNamePanel" class="accordion-collapse collapse show" aria-labelledby="studentNamePanelHeading">
									<div class="accordion-body">
										<div class="container-fluid">
											<div class="row">
												<div class="col-4">
													<div class="input-group">
														<span class="input-group-text">First Name</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getFirstName()}" readonly/>
													</div>
												</div>
												<div class="col-4">
													<div class="input-group">
														<span class="input-group-text">Middle Name</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getMiddleName()}" readonly/>
													</div>
												</div>
												<div class="col-4">
													<div class="input-group">
														<span class="input-group-text">Last Name</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getLastName()}" readonly/>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<div class="accordion">
							<div class="accordion-item">
								<h4 class="accordion-header display-4" id="studentDOBPanelHeading">
									<button class="accordion-button fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#studentDOBPanel" aria-expanded="true" aria-controls="studentDOBPanel">
										<span>Date Of Birth</span>
									</button>
								</h4>
								<div id="studentDOBPanel" class="accordion-collapse collapse show" aria-labelledby="studentDOBPanelHeading">
									<div class="accordion-body">
										<div class="container-fluid">
											<div class="row">
												<div class="col-4">
													<div class="input-group">
														<span class="input-group-text">Date</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getDateOfBirth().getDate()}" readonly/>
													</div>
												</div>
												<div class="col-4">
													<div class="input-group">
														<span class="input-group-text">Month</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getDateOfBirth().getMonthName()}" readonly/>
													</div>
												</div>
												<div class="col-4">
													<div class="input-group">
														<span class="input-group-text">Year</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getDateOfBirth().getYear()}" readonly/>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<div class="accordion">
							<div class="accordion-item">
								<h4 class="accordion-header display-4" id="studentParentsPanelHeading">
									<button class="accordion-button fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#studentParentsPanel" aria-expanded="true" aria-controls="studentParentsPanel">
										<span>Parent Details</span>
									</button>
								</h4>
								<div id="studentParentsPanel" class="accordion-collapse collapse show" aria-labelledby="studentParentsPanelHeading">
									<div class="accordion-body">
										<div class="container-fluid">
											<div class="row">
												<div class="col-3">
													<div class="input-group">
														<span class="input-group-text">Father</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getParentDetailDao().getFatherName() }" readonly/>
													</div>
												</div>
												<div class="col-3">
													<div class="input-group">
														<span class="input-group-text">Occupation</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getParentDetailDao().getFatherOccupation()}" readonly/>
													</div>
												</div>
												<div class="col-3">
													<div class="input-group">
														<span class="input-group-text">Mother</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getParentDetailDao().getMotherName()}" readonly/>
													</div>
												</div>
												<div class="col-3">
													<div class="input-group">
														<span class="input-group-text">Occupation</span>
														<input type="text" class="form-control" placeholder="Not Applicable" value="${studentDetailDao.getParentDetailDao().getMotherOccupation()}" readonly/>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<div class="accordion">
							<div class="accordion-item">
								<h4 class="accordion-header display-4" id="studentContactPanelHeading">
									<button class="accordion-button fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#studentContactPanel" aria-expanded="true" aria-controls="studentContactPanel">
										<span>Contact Details</span>
									</button>
								</h4>
								<div id="studentContactPanel" class="accordion-collapse collapse show" aria-labelledby="studentContactPanelHeading">
									<div class="accordion-body">
										<div class="container-fluid">
											<c:forEach var="phoneDetail" items="${studentDetailDao.getContactDetailDao().getPhoneDetailDaoList()}">
												<div class="row">
													<div class="col-2">
														<div class="input-group mb-3">
															<span class="input-group-text">Type</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${phoneDetail.getPhoneType()}" readonly/>
														</div>
													</div>
													<div class="col-2">
														<div class="input-group mb-3">
															<span class="input-group-text">Landline Ext</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${phoneDetail.getLandlineExt()}" readonly/>
														</div>
													</div>
													<div class="col-3">
														<div class="input-group mb-3">
															<span class="input-group-text">Landline</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${phoneDetail.getLandlineNo()}" readonly/>
														</div>
													</div>
													<div class="col-2">
														<div class="input-group mb-3">
															<span class="input-group-text">Mobile Code</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${phoneDetail.getMobileCode()}" readonly/>
														</div>
													</div>
													<div class="col-3">
														<div class="input-group mb-3">
															<span class="input-group-text">Mobile No</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${phoneDetail.getMobileNo()}" readonly/>
														</div>
													</div>
												</div>
											</c:forEach>
											<c:forEach var="addressDetail" items="${studentDetailDao.getContactDetailDao().getAddressDetailDaoList()}">
												<div class="row">
													<div class="col-4">
														<div class="input-group mb-3">
															<span class="input-group-text">Type</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${addressDetail.getType()}" readonly/>
														</div>
													</div>
													<div class="col-4">
														<div class="input-group mb-3">
															<span class="input-group-text">Building/House No</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${addressDetail.getBuildingHouseNo()}" readonly/>
														</div>
													</div>
													<div class="col-4">
														<div class="input-group mb-3">
															<span class="input-group-text">Landmark</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${addressDetail.getLandmark()}" readonly/>
														</div>
													</div>
												</div>
												<div class="row">
													<div class="col-3">
														<div class="input-group mb-3">
															<span class="input-group-text">Pincode</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${addressDetail.getPincode()}" readonly/>
														</div>
													</div>
													<div class="col-3">
														<div class="input-group mb-3">
															<span class="input-group-text">City</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${addressDetail.getCity()}" readonly/>
														</div>
													</div>
													<div class="col-3">
														<div class="input-group mb-3">
															<span class="input-group-text">State</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${addressDetail.getState()}" readonly/>
														</div>
													</div>
													<div class="col-3">
														<div class="input-group mb-3">
															<span class="input-group-text">Country</span>
															<input type="text" class="form-control" placeholder="Not Applicable" value="${addressDetail.getCountry()}" readonly/>
														</div>
													</div>
												</div>
											</c:forEach>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>