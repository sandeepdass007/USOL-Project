/**
 *  Student Page Handler
 */
$("document").ready(function(){
	
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
		$.ajax({
			url: '/logout/',
			async: true,
			type: 'GET',
			processData: false,
			dataType: 'json',
			contentType: 'application/json',
			success: function (data) {
				console.log(data);
				var success = data["success"];
				if(success == true || success == "true") {
					window.location.href = "/";
				} else {
					alert("Logout Failed!");
				}
			}
		});
	});
});