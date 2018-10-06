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