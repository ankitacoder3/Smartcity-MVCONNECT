<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<h1>Edit Hotel details</h1>

<form action="${pageContext.request.contextPath }/handle-hotel" method="post">
<input type="text" value="${hotel.id }" name="id"/>
<div class="form-group">
<label for="name">Hotel Name</label>
<input type="text" class="form-control" id="name" name="name"  value="${hotel.name }">
</div>
<div class="form-group">
<label for="description">Address</label>
<textarea class="form-control" name="address" id="address" id="address" rows="2"  >${hotel.address}</textarea>
</div>

<div class="form-group">
<label for="restaurants">Email-id</label>
<textarea class="form-control" name="email" id="email" id="price" rows="2"  >${hotel.email }</textarea>
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