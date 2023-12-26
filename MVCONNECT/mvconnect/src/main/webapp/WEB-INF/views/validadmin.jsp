<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Admin Page</title>
	</head>
	<body>
		<h1>Verifying Details</h1>
		<%-- Include the ValidateUser.java class whose method
			boolean validate(String, String) we will be using
		--%>
		<%-- Create and instantiate a bean and assign an id to
			uniquely identify the action element throughout the jsp
		--%>
		<jsp:useBean id="snr" class="mvcity.dao.Validateuser"/>
		
		<%-- Set the value of the created bean using form data --%>
		<jsp:setProperty name="snr" property="user"/>
		<jsp:setProperty name="snr" property="pass"/>
		
		<%-- Display the form data --%>
		The Details Entered Are as Under<br/>
		<p>Username : <jsp:getProperty name="snr" property="user"/></p>
		<p>Password : <jsp:getProperty name="snr" property="pass"/></p>
		
		<%-- Validate the user using the validate() of
			ValidateUser.java class
		--%>
		<%if(snr.validate("GeeksforGeeks", "GfG")){%>
			<a href="admin_operation"></a><br/>
		<%}else{%>
			Error! You are an INVALID USER
			<a href="admin_operation"></a><br/>
		<%}%>
	</body>
</html>
