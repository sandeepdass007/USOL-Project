<nav id="studentNavBar" class="navbar navbar-expand-lg navbar-dark bg-dark">
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
	<span class="navbar-brand text-end ps-2">Welcome ${studentFullName} (${studentDetailDao.getUniversityRegNo()})</span>
	<span id="logoutBtn" class="me-2 text-white" style="cursor: pointer;" data-bs-toggle="tooltip" title="Logout" data-bs-placement="top" data-bs-container="#studentNavBar" ><i class="fas fa-door-open"></i></span>
</nav>

<div class="modal fade" id="logoutConfirmModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="staticBackdropLabel">Important <i class="fas fa-exclamation"></i></h5>
				<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			</div>
			<div class="modal-body">
				<label id="modal-message">Are you sure you want to logout?</label>
			</div>
			<div class="modal-footer">
				<button type="button" id="okLogout" class="btn btn-secondary bg-success" data-bs-dismiss="modal"
					data-bs-toggle="tooltip" title="Yes" data-bs-placement="top" data-bs-container="#logoutConfirmModal" >
					<span><i class="fas fa-thumbs-up"></i></span>
					<span id="logoutLoadingSpinner" class="spinner-grow spinner-grow-sm d-none" role="status" aria-hidden="true"></span>
				</button>
				<button type="button" id="cancelLogout" class="btn btn-secondary bg-danger" data-bs-dismiss="modal"
					data-bs-toggle="tooltip" title="No" data-bs-placement="bottom" data-bs-container="#logoutConfirmModal" >
					<span><i class="fas fa-thumbs-down"></i></span>
				</button>
			</div>
		</div>
	</div>
</div>