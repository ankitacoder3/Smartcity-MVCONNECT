<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<h1>Edit Hotel details</h1>

<form action="${pageContext.request.contextPath }/handle-theatre" method="post">
<input type="text" value="${theatre.id }" name="id"/>
<div class="form-group">
<label for="name">Hotel Name</label>
<input type="text" class="form-control" id="name" name="name"  value="${theatre.name }">
</div>
<div class="form-group">
<label for="address">Address</label>
<textarea class="form-control" name="address" id="address"  rows="4"  >${theatre.address}</textarea>
</div>

<div class="form-group">
<label for="contact">Contact</label>
<textarea class="form-control" name="contact" id="contact"  rows="2"  >${theatre.contact }</textarea>
</div>
<div class="container text-center">
<a href="${pageContext.request.contextPath }/theatre"
   class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Update</button>
</div>
</form>

</head>
<body>
   
</body>
</html>