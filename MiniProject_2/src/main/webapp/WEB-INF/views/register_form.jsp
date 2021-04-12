<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Registration form</h1>
		<form:form action="register_save" method="post" modelAttribute="user">
			<form:label path="first_name">Full name:</form:label>
			<form:input path="first_name" />
			<br />

			<form:label path="last_name">E-last_name:</form:label>
			<form:input path="last_name" />
			<br />


			<form:label path="email">E-email:</form:label>
			<form:input path="email" />
			<br />


			<form:label path="password">Password:</form:label>
			<form:password path="password" />
			<br />

			<form:label path="phn_no">phn_no:</form:label>
			<form:password path="phn_no" />
			<br />


			<form:label path="dob">Birthday (yyyy-mm-dd):</form:label>
			<form:input path="dob" />
			<br />

			<form:label path="gender">Gender:</form:label>
			<form:radiobutton path="gender" value="Male" />Male
            <form:radiobutton path="gender" value="Female" />Female<br />

			<form:label path="country">country:</form:label>
			<form:select path="country" items="${professionList}" />
			<br />

			<form:label path="state">State:</form:label>
			<form:select path="state" items="${professionList}" />
			<br />

			<form:label path="city">city:</form:label>
			<form:select path="city" items="${professionList}" />
			<br />

			<form:button>Register</form:button>
		</form:form>
	</div>
</body>
</html>