<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<h1>Add Hotel details</h1>

<form action="handle-hotel" method="post">
<div class="form-group">
<label for="name">Hotel Name</label>
<input type="text" class="form-control" id="name" name="name" placeholder="Enter the Hotel name here">
</div> 
<div class="form-group">
<label for="description">Address</label>
<textarea class="form-control" name="address"  id="address" rows="5" placeholder="Enter the Address"></textarea>
</div>

<div class="form-group">
<label for="restaurants">Email</label>
<textarea class="form-control" name="email"  id="email" rows="2" placeholder="Enter the email id"></textarea>
</div>
<div class="container text-center">
<a href="${pageContext.request.contextPath }/hotel"
   class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary" >Add</button>
</div>
</form>

</head>
<body>
   
</body>
</html>