<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<title>Home</title>
		<!-- Compiled and Minified Bootstrap CSS -->
		<link rel = "stylesheet" 
   			href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
   			integrity = "sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
   			crossorigin = "anonymous">

		<!-- jQuery Library -->
		<script src = "https://code.jquery.com/jquery-3.2.1.slim.min.js" 
   			integrity = "sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" 
   			crossorigin = "anonymous">
		</script>

		<!-- Popper -->
		<script src = "https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" 
  			integrity = "sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" 
   			crossorigin = "anonymous">
		</script>

		<!-- Compiled and Minified Bootstrap JavaScript -->
		<script src = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" 
   			integrity = "sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" 
   			crossorigin = "anonymous">
		</script>
		<script>
			function Success(){
				alert("Data Submitted Successfully!");
			}
		</script>
	</head>
<body>
	<div class="jumbotron">
	<div class="row">
	<div class="col"> 
	<img src="data:image/png;base64,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" 
		class="img-fluid" alt="Responsive image">
	</div>
	<div class="col"> 
	<button type="button" class="btn btn-warning pull-right"><a href="<c:url value="/view"/>" >Check customers</a></button>
	</div>
	</div>
	<br>
		<center><h4><p class="font-italic">We are sorry for your loss. During this emotional time, HSBC bank stands beside you!</p></h4></center>
	</div>
	<div class="container">
	<form action="add" method="post">
	<div class="row">
	<div class="col">
	<div class="alert alert-success" role="alert">
	<h3><b>Personal Representative Details</b></h3>
	<div class="form-group">
	<label for="pr_firstName">First Name</label>
	<input type="text" class="form-control" name="pr_firstName" id="pr_firstName">
	</div>
	<div class="form-group">
	<label for="pr_lastName">Last Name</label>
	<input type="text" class="form-control" name="pr_lastName" id="pr_lastName">
	</div>
	<div class="form-group">
	<label for="pr_mobileNumber">Mobile Number</label>
	<input type="text" class="form-control" name="pr_mobileNumber" id="pr_mobileNumber">
	</div>
	<div class="form-group">
	<label for="pr_email">Email</label>
	<input type="text" class="form-control" name="pr_email" id="pr_email">
	</div>
	<div class="form-group">
	<label for="pr_addressLine1">Address Line 1</label>
	<input type="text" class="form-control" name="pr_addressLine1" id="pr_addressLine1">
	</div>
	<div class="form-group">
	<label for="pr_addressLine2">Address Line 2</label>
	<input type="text" class="form-control" name="pr_addressLine2" id="pr_addressLine2">
	</div>
	<div class="form-group">
	<label for="pr_addressLine3">Address Line 3</label>
	<input type="text" class="form-control" name="pr_addressLine3" id="pr_addressLine3">
	</div>
	<div class="form-group">
	<label for="pr_postCode">Post Code</label>
	<input type="text" class="form-control" name="pr_postCode" id="pr_postCode">
	</div>
	<div class="form-group">
	<label for="pr_relationship">Relationship with the deceased person</label>
	<input type="text" class="form-control" name="pr_relationship" id="pr_relationship">
	</div>
	</div>
	</div>
	<div class="col">
	<div class="alert alert-danger" role="alert">
	<h3><b>Deceased Customer Details</b></h3>
	<div class="form-group">
	<label for="dc_firstName">First Name</label>
	<input type="text" class="form-control" name="dc_firstName" id="dc_firstName">
	</div>
	<div class="form-group">
	<label for="dc_lastName">Last Name</label>
	<input type="text" class="form-control" name="dc_lastName" id="dc_lastName">
	</div>
	<div class="form-group">
	<label for="dc_dateOfBirth">Date of Birth</label>
	<input type="text" class="form-control" name="dc_dateOfBirth" id="dc_dateOfBirth">
	</div>
	<div class="form-group">
	<label for="dc_dateOfDeath">Date of Death</label>
	<input type="text" class="form-control" name="dc_dateOfDeath" id="dc_dateOfDeath">
	</div>
	<div class="form-group">
	<label for="dc_addressLine1">Address Line 1</label>
	<input type="text" class="form-control" name="dc_addressLine1" id="dc_addressLine1">
	</div>
	<div class="form-group">
	<label for="dc_addressLine2">Address Line 2</label>
	<input type="text" class="form-control" name="dc_addressLine2" id="dc_addressLine2">
	</div>
	<div class="form-group">
	<label for="dc_addressLine3">Address Line 3</label>
	<input type="text" class="form-control" name="dc_addressLine3" id="dc_addressLine3">
	</div>
	<div class="form-group">
	<label for="dc_postCode">Post Code</label>
	<input type="text" class="form-control" name="dc_postCode" id="dc_postCode">
	</div>
	</div>
	</div>
	</div>
	<button class="btn btn-outline-primary btn-primary btn-lg btn-block" id="submitButton" type="submit" onclick="Success()">Create User</button>
	</form>
	</div>
</body>
</html>
