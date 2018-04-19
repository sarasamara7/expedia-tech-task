<%-- 
    Document   : response
    Created on : Apr 18, 2018, 7:32:53 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><jsp:useBean id="mybean" scope="session" class="org.mypackage.expedia.HotelsOffersHandler" />
        <jsp:setProperty name="mybean" property="name"  />
         <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1>
    </body>
</html>
