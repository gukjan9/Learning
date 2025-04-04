<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    List<Map<String, String>> list = (List<Map<String, String>>) request.getAttribute("list");
%>

<!doctype html>
<html lang="ar" dir="ltr">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.rtl.min.css" integrity="sha384-dpuaG1suU0eT09tx5plTaGMLBsfDLzUCCUXOY2j/LSvXYuG6Bqs43ALlhIqAJVRb" crossorigin="anonymous">

    <title>Home!</title>
</head>
<body>
<div class="container">
    <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
        <div class="col-md-3 mb-2 mb-md-0">
            <a href="/" class="d-inline-flex link-body-emphasis text-decoration-none">
                <svg class="bi" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"/></svg>
            </a>
        </div>
    </header>

<%@ include file="/WEB-INF/views/comm/header.jsp"%>

    <div class="container text-center">
        <div class="row">
            <div class="col">Id</div>
            <div class="col">공부일자</div>
            <div class="col">공부내용</div>
            <div class="col">등록일자</div>
        </div>

        <% for(Map<String, String> map : list){ %>
        <div class="row">
                    <div class="col"><%= String.valueOf(map.get("id")) %></div>
                    <div class="col"><%= map.get("study_day") %></div>
                    <div class="col"><%= map.get("content") %></div>
                    <div class="col"><%= map.get("created_at") %></div>
                </div>
        <% } %>
    </div>

    <%@ include file="/WEB-INF/views/comm/footer.jsp"%>
</body>
</html>