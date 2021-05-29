/**
 * 
 */
 // Registering the event when document is  ready
$("document").ready(function() {
	
	// Registering the click event on login button
	$("#loginSubmitBtn").click(function(e) {
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
                console.log(data);
				var success = data["success"];
				if(success == true || success == "true") {
					window.location.href = "/student/";
				} else {
					showLoginErrorModal();
				}
            },
            data: JSON.stringify(jsonData)
        });
		
		e.preventDefault();
	});
	
});
function showLoginErrorModal(){
	var modalEl = document.getElementById("loginErrorModal");
	var myModal = new bootstrap.Modal(modalEl);
	myModal.show();
}