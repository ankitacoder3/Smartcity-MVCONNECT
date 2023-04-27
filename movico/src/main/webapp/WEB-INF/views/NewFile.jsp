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

<table class="table table-sm table-light">
<thead class="thead-dark">
<tr>
<th scope="col">S.no</th>
<th scope="col">City name</th>
<th scope="col">Number of hotels</th>
<th scope="col">Number of restaurants</th>
<th scope="col">Action</th>
</tr>
</thead>
<tbody>
  <c:forEach var="p" items="${products}">
    <tr>
       <td>${p.id}</td>
       <td>${p.cityname}</td>
       <td>${p.hotels}</td>
       <td>${p.restaurant}</td>
       <td>
         <a href="delete/${p.id}" ><i class="fa-sharp fa-solid fa-trash"></i></a>
         <a href="update/${p.id}" ><i class="fa-sharp fa-solid fa-pen-nib"></i></a>
        </td>
       
    </tr>
  </c:forEach>
</tbody>
</table>
<div class="container text-center">
<a href="add-product" class="btn btn-primary">Add City</a>
</div>

<h2></h2>
</body>
</html>



<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body> 
<button></button>
<a href="admin">Admin</a>
</button>
 ||
<button> 
<a href="user">User</a>  
</button> 
 
</html>  
</body>
</html>
