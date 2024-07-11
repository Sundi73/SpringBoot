<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
    crossorigin="anonymous">

    <title>Search Engine!!</title>
  </head>
  <body class="bg-secondary">
    
    <div class="container mt-5">
    	<div class="row">
    		<div class="col-md-6 offset-md-3">
    			<div class="card">
    				<div class="card-body">
    					<h3 class="text-center">Complex Form</h3>
    						<form action="handle" method="post">                <!-- Form Handle  -->
    							<div class="form-group">
    								<label for="exampleInputEmail1">Your Name</label>
    								<input name="name" type="text" class="form-control" id="name1" placeholder="Enter your name"
    								   />
    								   <div class="form-group">
    								   	<label for="exampleInputEmail1">Id</label>
    								   	<input name="id" type="text" class="form-control" id="id1" placeholder="Enter id">
    								   </div>
    								<div class="form-group">
    									<label for="exampleInputEmail1">DOB</label>
    									<input name="date" type="text" class="form-control" id="dob1" placeholder="dd/mm/yyyy">
    									
    								<div class="form-group">
    								<label for="exampleFormControlSelect1">Course</label>
    								<select name="courses" class="form-control" id="course1" multiple>
    								<option>Java</option>
    								<option>Python</option>
    								<option>JavaScript</option>
    								<option>C++</option>
    								<option>Ruby</option>
    								</select>
    								
    								<div class="form-group mt-2">
    									<span class="mr-3">Select Gender</span>
    										<div class="form-check form-check-inline">
    											 <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male"
    											 >
    											 <label class="form-check-label" for="inlineRadio1">Male</label>
    											</div>
    								<div class="form-check form-check-inline">
    											 <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female"
    											 >
    											 <label class="form-check-label" for="inlineRadio2">Female</label>
    											</div>			
    										</div>
    										
    								<div class="container text-center">
    									<button type="submit" class="btn btn-primary">Submit</button> 
    								</div>		
    									</div>	
    								</div>   
       							</div>
    						</form>
    				</div>
    			</div>
    		</div>
    	</div>
    
    </div>
    

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>