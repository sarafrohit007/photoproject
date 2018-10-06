<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head> 
    <title>Google Login</title>
    <!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> --> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="google-signin-client_id" content="113048161998-luqutkemc9l8ev5e6gkuknehet0p9vdl.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
    <!-- <script src="login.js"></script> -->
    <style type="text/css">
    
    	.g-signin2{
    		margin-left: 500px;
    		margin-top: 200px;
    	}
    	
    	.data{
    		display: none;
    	}
    </style>
    <script type="text/javascript">
    
     function onSignIn(googleUser){
    	alert("Successfully signed in");
    	var profile = googleUser.getBasicProfile();
    	$(".g-signin2").css("display":"none");
    	$(".data").css("display":"block");
    	$("#pic").attr("source",profile.getImageUrl());
    	$("#email").text(profile.getEmail());
    }
    
    function signOut(){
    	var auth2 =  gapi.auth2.getAuthInstance();
    	auth.signOut.then(function(){
    		alert("You have successfully signed out....");
    		$(".g-signin2").css("display":"block");
    		$(".data").css("display":"none");
    	});
    }
    
    </script>
</head>
<body>
    <div class="g-signin2" data-onsuccess="onSignIn"> </div>
    <div class = "data"> 
    	<p> Profile Details:- </p>
    	<img id ="pic" class="img-circle" width="100" height = "100"/>
    	<p>Email id:-</p>
    	<p id = "email" class ="alert alert-danger"></p>
    	<button onclick= "signOut()" class="btn btn-danger">SignOut</button>
    </div>
</body>
</html>