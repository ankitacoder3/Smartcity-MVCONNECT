<!--index form-->
<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <title>Welcome to MV-CITY</title>
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }

        .container {
            margin-top: 100px;
            text-align: center;
        }

        .title {
            font-size: 36px;
            font-weight: bold;
            color: #007bff;
        }

        .subtitle {
            font-size: 24px;
            color: #007bff;
        }

        .login-button {
            margin-top: 30px;
            padding: 10px 30px;
            font-size: 18px;
            font-weight: bold;
            color: #ffffff;
            background-color: #007bff;
            border: none;
            cursor: pointer;
        }

        .login-button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="title">Welcome to MV-CITY</div>
        <div class="subtitle">Login to access the system</div>
        <form action="/admin_operations" method="post">
            <!-- Add your login form fields here, e.g. username and password -->
            <input type="text" name="username" placeholder="Username" required><br>
            <input type="password" name="password" placeholder="Password" required><br>
            <br>
            <a href="admin_operations" class="login-button">Login</a>
        </form>
    </div>
</body>
</html>
