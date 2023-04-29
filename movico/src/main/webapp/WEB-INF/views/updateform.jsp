<!--update form-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<h1>Edit City details</h1>

<form action="${pageContext.request.contextPath }/handle-hotel" method="post">
<input type="text" value="${product.id }" name="id"/>
<div class="form-group">
<label for="name">City Name</label>
<input type="text" class="form-control" id="name" name="name" placeholder="Enter the city name here" value="${product.cityname }">
</div>
<div class="form-group">
<label for="description">No of hotels</label>
<textarea class="form-control" name="description" id="description" id="description" rows="2" placeholder="Enter the no of hotels" >${product.hotels }</textarea>
</div>

<div class="form-group">
<label for="restaurants">No of Restaurants</label>
<textarea class="form-control" name="price" id="price" id="price" rows="2" placeholder="Enter the no of restaurants" >${product.restaurant }</textarea>
</div>
<div class="container text-center">
<a href="${pageContext.request.contextPath }/hotel"
   class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Update</button>


</div>
</form>

</head>
<body>
   
</body>
</html>