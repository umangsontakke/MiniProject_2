<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: left;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Registration Succeeded!</h2>
        <span>first_name:</span><span>${user.first_name}</span><br/>
        <span>last_name:</span><span>${user.last_name}</span><br/>
        <span>email:</span><span>${user.email}</span><br/>
        <span>password:</span><span>${user.password}</span><br/>
        <span>phn_no:</span><span>${user.phn_no}</span><br/>
        <span>dob:</span><span>${user.dob}</span><br/>
        <span>gender:</span><span>${user.gender}</span><br/>
        <span>country:</span><span>${user.country}</span><br/>
         <span>state:</span><span>${user.state}</span><br/>
          <span>city:</span><span>${user.city}</span><br/>
        
    </div>
</body>
</html>