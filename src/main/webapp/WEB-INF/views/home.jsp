<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<c:url var="url" value="/team" ></c:url>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>Home page</title>
</head>
<body>
	<h1>Home page</h1>
<p>
	${message}<br/>
	<a href="${url}/add.html">Add new team</a><br/>
	<a href="${url}/list.html">List teams</a><br/>
	<a href="<c:url value="/" />/populate.html">Populate the db</a>
</p>
</body>
</html>