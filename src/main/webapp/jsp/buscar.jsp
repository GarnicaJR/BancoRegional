<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%--Esto es una directiva para utilizar la clase Date --%>
<%@ page import="java.util.Date"  %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:set var="context" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Banco Regional</title>
        
        <style>
            .message{
                color: blue;
            }
        </style>
    </head>
    <body>
        <h1>Banco Regional</h1>

        <div class="menu">
            <ul>
                <li><a href="${context}/buscar">Buscar</a></li>
                <li><a href="${context}/crear">Crear</a></li>
                <li><a href="${context}/depositar">Depositar</a></li>
            </ul>
        </div>


        <form name="search_form" method="post" action="${context}/buscar">
            <input type="text" placeholder="Rut Cliente" name="rut" />
            <input type="submit" value="Buscar" />
        </form>

        </br>
        <c:if test="${not empty cliente}">
            var1 is empty or null.
        </c:if>

        <p class="message">Hola a todos</p>

    </body>
</html>