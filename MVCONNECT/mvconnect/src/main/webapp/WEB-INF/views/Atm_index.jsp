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
<h1 class="text-center mb-3">Atms in the city</h1>

<table class="table table-sm table-light">
<thead class="thead-dark">
<tr>
<th scope="col">S.no</th>
<th scope="col">Atm name</th>
<th scope="col">Address</th>
<th scope="col">Action</th>
</tr>
</thead>
<tbody>
  <c:forEach var="a" items="${atm}">
    <tr>
       <td>${a.id}</td>
       <td>${a.name}</td>
       <td>${a.address}</td>
       <td>
         <a href="deleteatm/${a.id}" ><i class="fa-sharp fa-solid fa-trash"></i></a>
         <a href="updateatm/${a.id}" ><i class="fa-sharp fa-solid fa-pen-nib"></i></a>
        </td>
       
    </tr>
  </c:forEach>
</tbody>
</table>
<div class="container text-center">
<a href="add-atm" class="btn btn-primary">Add Atm</a>
</div>

<h2></h2>
</body>
</html>
