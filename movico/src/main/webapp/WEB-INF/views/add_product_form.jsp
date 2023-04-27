<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<h1>Add City details</h1>

<form action="handle-product" method="post">
<div class="form-group">
<label for="name">City Name</label>
<input type="text" class="form-control" id="name" name="name" placeholder="Enter the product name here">
</div>
<div class="form-group">
<label for="description">No of hotels</label>
<textarea class="form-control" name="description" id="description" id="description" rows="2" placeholder="Enter the product description"></textarea>
</div>

<div class="form-group">
<label for="restaurants">No of Restaurants</label>
<textarea class="form-control" name="price" id="price" id="price" rows="2" placeholder="Enter the product price"></textarea>
</div>
<div class="container text-center">
<a href="${pageContext.request.contextPath }/"
   class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Add</button>
</div>
</form>

</head>
<body>
   
</body>
</html>