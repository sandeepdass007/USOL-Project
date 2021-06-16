/**
 * Student Account Handler
 */

$("document").ready(function() {
	// Registering the submit event on login form
	$("#changePasswordForm").submit(function(e) {
		// get username and password from the provided input fields
		var currentPassword = $("#currentPassword").val();
		var newPassword = $("#newPassword").val();
		var confirmNewPassword = $("#confirmNewPassword").val();
		if(currentPassword.trim() == ""){
			$("#currentPassword").addClass("is-invalid");
		}
		else{
			$("#currentPassword").removeClass("is-invalid");
		}
		
		if(newPassword.trim() == ""){
			$("#newPassword").addClass("is-invalid");
		}
		else{
			$("#newPassword").removeClass("is-invalid");
		}
		
		if(confirmNewPassword.trim() == "" || newPassword != confirmNewPassword){
			$("#confirmNewPassword").addClass("is-invalid");
		}
		else{
			$("#confirmNewPassword").removeClass("is-invalid");
		}
		
		var invalid = $("#currentPassword, #newPassword, #confirmNewPassword").hasClass("is-invalid");
		if(invalid == true){
			e.preventDefault();
			return;
		}
		
		var jsonData = {
			"currentPassword": currentPassword,
			"newPassword": newPassword,
			"confirmNewPassword" : confirmNewPassword
		};
		
		$.ajax({
			url: '/student/account/change-password/',
			async: true,
			type: 'POST',
			processData: false,
			dataType: 'json',
			contentType: 'application/json',
			success: function (data) {
				var success = data["success"];
				var error = data["error"];
				if(success == true || success == "true") {
					showPasswordChangedModal();
					// do nothing
				} else {
					showChangePasswordErrorModal(error);
				}
				enableChangePasswordForm();
			},
			error: function(xhr, textStatus, errorThrown) {
				showChangePasswordErrorModal(Constant.LOGIN_SERVER_ERROR);
				enableChangePasswordForm();
			},
			data: JSON.stringify(jsonData)
		});
		
		disableChangePasswordForm();
		$("#submitLoadingSpinner").removeClass("d-none");
		e.preventDefault();
	});
});

function disableChangePasswordForm() {
	$("#changePasswordForm").addClass("disable-content");
}

function enableChangePasswordForm() {
	$("#changePasswordForm").removeClass("disable-content");
	$("#submitLoadingSpinner").addClass("d-none");
}

function showChangePasswordErrorModal(msg = "Error while changing password"){
	$("#changePasswordErrorModal #modal-message").text(msg);
	var modalEl = document.getElementById("changePasswordErrorModal");
	var myModal = new bootstrap.Modal(modalEl);
	myModal.show();
}

function showPasswordChangedModal(){
	var modalEl = document.getElementById("logoutConfirmModal");
	var myModal = new bootstrap.Modal(modalEl);
	myModal.show();
}