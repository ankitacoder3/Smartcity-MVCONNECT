<!--form to update mall object-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<h1>Edit Mall details</h1>

<form action="${pageContext.request.contextPath }/handle-mall" method="post">
<input type="text" value="${mall.id }" name="id"/>
<div class="form-group">
<label for="name">Mall Name</label>
<input type="text" class="form-control" id="name" name="name"  value="${mall.name }">
</div>
<div class="form-group">
<label for="description">Address</label>
<textarea class="form-control" name="address" id="address"  rows="2"  >${mall.address}</textarea>
</div>
<div class="form-group">
<label for="description">Open timings</label>
<textarea class="form-control" name="open" id="open" id="open" rows="2"  >${mall.open}</textarea>
</div>
<div class="form-group">
<label for="description">Close timings</label>
<textarea class="form-control" name="close" id="close"  rows="2"  >${mall.close}</textarea>
</div>

<div class="container text-center">
<a href="${pageContext.request.contextPath }/mall"
   class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Update</button>
</div>
</form>

</head>
<body>
   
</body>
</html>