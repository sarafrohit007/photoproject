<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head> 
    <title>Google Login</title>
    <!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> -->
    <meta name="google-signin-scope" content="profile email"> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="google-signin-client_id" content="776956796816-af1e4l7rvlunhr82dhhtuukbh4dscvli.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer>    </script>
    <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
    <!-- <script src="login.js"></script> -->
    <style type="text/css">
    
    	.g-signin2{
    		margin-left: 600px;
    		margin-top: 250px;
    	}
    	
    	.data{
    		display: none;
    	}
    </style>
     <script type="text/javascript">
     function onSignIn(googleUser){
     	var profile = googleUser.getBasicProfile();
    	console.log('ID: ' + profile.getId());
    }
    </script> 
</head>
<body>
    <div class="g-signin2" data-onsuccess="onSignIn"></div>
   <!--  <div class = "data"> 
    	<p> Profile Details:- </p>
    	<img id ="pic" class="img-circle" width="100" height = "100"/>
    	<p>Email id:-</p>
    	<p id = "email" class ="alert alert-danger"></p>
    	<button onclick= "signOut()" class="btn btn-danger">SignOut</button>
    </div> -->
</body>
</html>