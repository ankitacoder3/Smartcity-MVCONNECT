<!--add mall form-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<h1>Add Mall details</h1>

<form action="handle-mall" method="post">
<div class="form-group">
<label for="tname">Mall Name</label>
<input type="text" class="form-control" id="name" name="name" placeholder="Enter the Atm name here">
</div> 
<div class="form-group">
<label for="taddress">Address</label>
<textarea class="form-control" name="address"  id="address" rows="2" placeholder="Enter the Address"></textarea>
</div>
<div class="form-group">
<label for="taddress">Open</label>
<textarea class="form-control" name="open"  id="open" rows="2" placeholder="Enter the Open timings"></textarea>
</div>
<div class="form-group">
<label for="taddress">Close</label>
<textarea class="form-control" name="close"  id="close" rows="2" placeholder="Enter the Close timings"></textarea>
</div>


<div class="container text-center">
<a href="${pageContext.request.contextPath }/mall"
   class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary" >Add</button>
</div>
</form>

</head>
<body>
   
</body>
</html>