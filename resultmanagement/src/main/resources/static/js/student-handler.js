/**
 *  Student Page Handler
 */
$("document").ready(function(){
	
	var modalEl = document.getElementById("logoutConfirmModal");
	var myModal = new bootstrap.Modal(modalEl);
	
	enableToolTips();
	
	$("#nav-home").click(function(){
		window.location.href = "/student/home/";
	});
	
	$("#nav-profile").click(function(){
		window.location.href = "/student/profile/";
	});
	
	$("#nav-account").click(function(){
		window.location.href = "/student/account/";
	});
	
	$("#nav-academics").click(function(){
		window.location.href = "/student/academics/";
	});
	
	$("#logoutBtn").click(function() {
		myModal.show();
	});
	
	$("#okLogout").click(function() {
		$("#logoutLoadingSpinner").removeClass("d-none");
		$.ajax({
			url: '/logout/',
			async: true,
			type: 'GET',
			processData: false,
			dataType: 'json',
			contentType: 'application/json',
			success: function (data) {
				
				var success = data["success"];
				if(success == true || success == "true") {
					window.location.href = "/";
				} else {
					myModal.hide();
					alert("Logout Failed!");
				}
			}
		});
	});
	
	$("#cancelLogout").click(function() {
		myModal.hide();
	});
});

function enableToolTips() {
	$("[data-bs-toggle]").each(function(index, el) {
		new bootstrap.Tooltip(el);
	});
}