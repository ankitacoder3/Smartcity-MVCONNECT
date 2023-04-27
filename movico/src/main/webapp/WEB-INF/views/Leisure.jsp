<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Smart City Management System</title>
    <style>
        body {
            background-color: #f8f9fa; /* Replace with your desired background color */
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
            margin-top: 30px;
        }

        .button-container {
            margin-top: 50px;
        }

        .button {
            margin: 0 10px;
            padding: 10px 30px;
            font-size: 18px;
            font-weight: bold;
            color: #ffffff;
            background-color: #007bff;
            border: none;
            cursor: pointer;
        }

        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="title">Smart City Management System</div>
        <div class="subtitle">Select an option:</div>
        <div class="button-container">
            <a href="theatre" class="button">Theatres</a>
            <a href="mall" class="button">Malls</a>
        </div>
    </div>
</body>
</html>
