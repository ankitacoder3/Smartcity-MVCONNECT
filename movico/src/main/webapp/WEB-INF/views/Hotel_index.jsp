<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div class ="container mt-3">
<div class="row">
<div class="col-md-12">
<h1 class="text-center mb-3">Welcome to Smart City Management System</h1>
<h1 class="text-center mb-3">Hotels in the city</h1>

<table class="table table-sm table-light">
<thead class="thead-dark">
<tr>
<th scope="col">S.no</th>
<th scope="col">Hotel name</th>
<th scope="col">Address</th>
<th scope="col">Email</th>
<th scope="col">Action</th>
</tr>
</thead>
<tbody>
  <c:forEach var="h" items="${hotel}">
    <tr>
       <td>${h.id}</td>
       <td>${h.name}</td>
       <td>${h.address}</td>
       <td>${h.email}</td>
       <td>
         <a href="deletehotel/${h.id}" ><i class="fa-sharp fa-solid fa-trash"></i></a>
         <a href="updatehotel/${h.id}" ><i class="fa-sharp fa-solid fa-pen-nib"></i></a>
        </td>
       
    </tr>
  </c:forEach>
</tbody>
</table>
<div class="container text-center">
<a href="add-hotel" class="btn btn-primary">Add Hotel</a>
</div>

<h2></h2>
</body>
</html>
