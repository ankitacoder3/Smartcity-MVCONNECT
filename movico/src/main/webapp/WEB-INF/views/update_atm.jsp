<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<h1>Edit Atm details</h1>

<form action="${pageContext.request.contextPath }/handle-atm" method="post">
<input type="text" value="${atm.id }" name="id"/>
<div class="form-group">
<label for="name">Atm Name</label>
<input type="text" class="form-control" id="name" name="name"  value="${atm.name }">
</div>
<div class="form-group">
<label for="description">Address</label>
<textarea class="form-control" name="address" id="address" id="address" rows="2"  >${atm.address}</textarea>
</div>

<div class="container text-center">
<a href="${pageContext.request.contextPath }/atm"
   class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Update</button>
</div>
</form>

</head>
<body>
   
</body>
</html>