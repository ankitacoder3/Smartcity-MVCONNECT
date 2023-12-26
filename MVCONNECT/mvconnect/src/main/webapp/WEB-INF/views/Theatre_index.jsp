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
<h1 class="text-center mb-3">Theatres in the city</h1>

<table class="table table-sm table-light">
<thead class="thead-dark">
<tr>
<th scope="col">S.no</th>
<th scope="col">Theatre name</th>
<th scope="col">Address</th>
<th scope="col">Contact</th>
<th scope="col">Action</th>
</tr>
</thead>
<tbody>
  <c:forEach var="t" items="${theatre}">
    <tr>
       <td>${t.id}</td>
       <td>${t.name}</td>
       <td>${t.address}</td>
       <td>${t.contact}</td>
       <td>
         <a href="deletetheatre/${t.id}" ><i class="fa-sharp fa-solid fa-trash"></i></a>
         <a href="updatetheatre/${t.id}" ><i class="fa-sharp fa-solid fa-pen-nib"></i></a>
        </td>
       
    </tr>
  </c:forEach>
</tbody>
</table>
<div class="container text-center">
<a href="add-theatre" class="btn btn-primary">Add Theatre</a>
</div>

<h2></h2>
</body>
</html>
