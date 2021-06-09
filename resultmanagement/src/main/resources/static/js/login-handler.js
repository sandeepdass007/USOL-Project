/**
 * 
 */
 // Registering the event when document is  ready
$("document").ready(function() {
	
	// Registering the submit event on login form
	$("#loginForm").submit(function(e) {
		// get username and password from the provided input fields
		var username = $("#loginUsername").val();
		var password = $("#loginPassword").val();
		// To fetch valid username from user. Shouldn't be whitespaces or empty.
		if(username.trim() == ""){
			$("#loginUsername").addClass("is-invalid");
		}
		else{
			$("#loginUsername").removeClass("is-invalid");
		}
		// To fetch valid password from user. Shouldn't be whitespaces or empty.
		if(password.trim() == ""){
			$("#loginPassword").addClass("is-invalid");
		}
		else{
			$("#loginPassword").removeClass("is-invalid");
		}
		// To prevent the execution of login if either username or password is invalid. 
		var invalid = $("#loginUsername, #loginPassword").hasClass("is-invalid");
		if(invalid == true){
			e.preventDefault();
			return;
		}
		
		var jsonData = {
			"username": username,
			"password": password,
			"debug" : {
				"enable": "false",
				"forceFail": "true"
			}
		};
		
		$.ajax({
			url: '/login/', // -> localhost:8080/login/
			async: true,
			type: 'POST',
			processData: false,
			dataType: 'json',
			contentType: 'application/json',
			success: function (data) {
				var success = data["success"];
				if(success == true || success == "true") {
					if(data["userType"] == 'student') {
						window.location.href = "/student/";
					} else if(data["userType"] == 'teacher') {
						window.location.href = "/teacher/";
					}
				} else {
					showLoginErrorModal();
					enableLoginForm();
				}
			},
			error: function(xhr, textStatus, errorThrown) {
				showLoginErrorModal(Constant.LOGIN_SERVER_ERROR);
				enableLoginForm();
			},
			data: JSON.stringify(jsonData)
		});
		
		disableLoginForm();
		$("#loginLoadingSpinner").removeClass("d-none");
		e.preventDefault();
	});
	
});

function disableLoginForm() {
	$("#loginForm").addClass("disable-content");
}

function enableLoginForm() {
	$("#loginForm").removeClass("disable-content");
	$("#loginLoadingSpinner").addClass("d-none");
}

function showLoginErrorModal(msg = "Invalid username or password. Kindly check and try again."){
	$("#loginErrorModal #modal-message").text(msg);
	var modalEl = document.getElementById("loginErrorModal");
	var myModal = new bootstrap.Modal(modalEl);
	myModal.show();
}