<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String rPath = request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<%=rPath %>bs3/css/bootstrap-theme.css">
<link rel="stylesheet" href="<%=rPath %>bs3/css/bootstrap.css">
<script src="<%=rPath %>bs3/js/bootstrap-min.js"></script>

<title>hello</title>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="title" value="ERP EXAM"/>