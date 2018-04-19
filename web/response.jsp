<%-- 
    Document   : response
    Created on : Apr 18, 2018, 7:32:53 PM
    Author     : DELL
--%>

<%@page import="org.mypackage.expedia.HotelsResultObject.Hotel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.mypackage.expedia.HotelsResultObject"%>
<%@page import="org.mypackage.expedia.HotelsOffersHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expedia Hotels</title>
    </head>
    <body>
        
        
       <%
            String destinatioName =  request.getParameter("destinatioName")==null?"":request.getParameter("destinatioName");
            String startDate =  request.getParameter("startDate") == null?"":request.getParameter("startDate");
            String endDate =  request.getParameter("endDate")==null?"":request.getParameter("endDate");
            String stayLength =  request.getParameter("stayLength")==null?"":request.getParameter("stayLength");
            String minStarRate =  request.getParameter("minStarRate")==null?"":request.getParameter("minStarRate");
            String maxStarRate =  request.getParameter("maxStarRate")==null?"":request.getParameter("maxStarRate");
            String minTotalRate =  request.getParameter("minTotalRate")==null?"":request.getParameter("minTotalRate");
            String maxTotalRate =  request.getParameter("maxTotalRate")==null?"":request.getParameter("maxTotalRate");
            String minGuestRate =  request.getParameter("minGuestRate")==null?"":request.getParameter("minGuestRate");
            String maxGuestRate =  request.getParameter("maxGuestRate")==null?"":request.getParameter("maxGuestRate");
            HotelsOffersHandler handler = new HotelsOffersHandler(destinatioName, startDate,endDate,stayLength,minStarRate,maxStarRate,minTotalRate,maxTotalRate,minGuestRate,maxGuestRate);
            HotelsResultObject result = handler.GetOffers();
             ArrayList<Hotel> hotels = new ArrayList<Hotel>();
             hotels = result.getOffers().getHotel();
       %>
       
       
       <% 
   if( hotels != null && hotels.size()> 0 ) {
%>
       
       <table align="center" cellspacing="10">
             <tr>
    <th>Destination</th>
    <th>Hotel Name</th>
        <th>Stars Rating</th>
<th>Offer Date Range</th>
  </tr>
    <%
    for(int i=0; i<hotels.size();i++){%>
        <tr>
            <td><%= ((Hotel)hotels.get(i)).destination.getCity() %>, <%= ((Hotel)hotels.get(i)).destination.getCountry()%></td>
            <td><%= ((Hotel)hotels.get(i)).hotelInfo.getHotelName() %></td> 
            <td><%= ((Hotel)hotels.get(i)).hotelInfo.getHotelStarRating() %></td> 
            <td>  <%= ((Hotel)hotels.get(i)).offerDateRange.getTravelStartDate().get(2) %> / <%=((Hotel)hotels.get(i)).offerDateRange.getTravelStartDate().get(1) %> /<%=((Hotel)hotels.get(i)).offerDateRange.getTravelStartDate().get(0) %> - 
             <%= ((Hotel)hotels.get(i)).offerDateRange.getTravelEndDate().get(2) %> / <%=((Hotel)hotels.get(i)).offerDateRange.getTravelEndDate().get(1) %> /<%=((Hotel)hotels.get(i)).offerDateRange.getTravelEndDate().get(0) %>
            </td> 
            <td><img src="<%= ((Hotel)hotels.get(i)).hotelInfo.getHotelImageUrl() %>"></img></th>
        </tr>
      <%}%>
</table>
<% 
}
else
{
 %>
 <h1>Oops... No results were founds.</h1>  
 <% 
}
 %>

    </body>
</html>
