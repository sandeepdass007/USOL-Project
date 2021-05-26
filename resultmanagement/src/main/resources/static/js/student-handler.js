/**
 * 
 */
$("document").ready(function() {
	
	$("#loginSubmitBtn").click(function(e) {
		var username = $("#loginUsername").val();
		var password = $("#loginPassword").val();
		console.log(username + ", " + password);
		
		var jsonData = {
		    "username": username,
		    "password": password,
		    "debug" : {
		        "enable": "false",
		        "forceFail": "true"
		    }
		};
		
		$.ajax({
            url: '/login/',
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
					alert("Login Failed!");
				}
            },
            data: JSON.stringify(jsonData)
        });
		
		e.preventDefault();
	});
	
});