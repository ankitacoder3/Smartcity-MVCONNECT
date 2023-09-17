<!--index for mall class-->
<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div class ="container mt-3">
<div class="row">
<div class="col-md-12">
<h1 class="text-center mb-3">Welcome to MV-CITY</h1>
<h1 class="text-center mb-3">Malls in the city</h1>

<table class="table table-sm table-light">
<thead class="thead-dark">
<tr>
<th scope="col">S.no</th>
<th scope="col">Mall name</th>
<th scope="col">Address</th>
<th scope="col">Open</th>
<th scope="col">Close</th>
<th scope="col">Action</th>
</tr>
</thead>
<tbody>
  <c:forEach var="m" items="${mall}">
    <tr>
       <td>${m.id}</td>
       <td>${m.name}</td>
       <td>${m.address}</td>
       <td>${m.open}</td>
       <td>${m.close}</td>
       <td>
         <a href="deletemall/${m.id}" ><i class="fa-sharp fa-solid fa-trash"></i></a>
         <a href="updatemall/${m.id}" ><i class="fa-sharp fa-solid fa-pen-nib"></i></a>
        </td>
       
    </tr>
  </c:forEach>
</tbody>
</table>
<div class="container text-center">
<a href="add-mall" class="btn btn-primary">Add Mall</a>
</div>

<h2></h2>
</body>
</html>
