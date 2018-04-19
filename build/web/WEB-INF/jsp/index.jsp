<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-eo Sprquiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expedia Hotels</title
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
.flex {
  display: flex;
  justify-content: center;
}

.flex-item + .flex-item {
  margin-left: 10px;
}

.input {
  margin-top: 15px;
  background-color: #0066FF;
  border: none;
  color: white;
  padding: 20px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  cursor: pointer;
}
            </style>
    </head>

    <body>
        <!--<h1>Hello there, Fill out the fields below and click search</h1>-->
        <form name="Name Input Form" action="response.jsp" method="POST">
            <!-- Destination Name:
            <input type="text" name="destination"  />
             Trip Start:
            <input type="date" name="tripstart"  />
            Trip End
            <input type="date" name="tripend"  />
            <input type="submit" value="OK" />-->
            
            <table border="0" align="center"  cellspacing="10">
                <tbody>
                    <tr>
                        <td>Destination Name</td>
                        <td><input type="text" name="destinatioName"/></td>
                    </tr>
                    <tr>
                        <td>Minimum Trip Start Date</td>
                        <td><input type="text" name="startDate" value="MM/DD/YYYY" /></td>
                    </tr>
                    <tr>
                        <td>Maximum Trip Start Date</td>
                        <td><input type="text" name="endDate" value="MM/DD/YYYY" /></td>
                    </tr>
                    <tr>
                        <td>Length of Stay</td>
                        <td><input type="text" name="stayLength" value="" /></td>
                    </tr>
                    <tr>
                        <td>Minimum Star Rating</td>
                        <td><input type="text" name="minStarRate"/></td>
                    </tr>
                    <tr>
                        <td>Maximum Star Rating</td>
                        <td><input type="text" name="maxStarRate"/></td>
                    </tr>
                    <tr>
                        <td>Minimum Total Rate</td>
                        <td><input type="text" name="minTotalRate"/></td>
                    </tr>
                    <tr>
                        <td>Maximum Total Rate</td>
                        <td><input type="text" name="maxTotalRate"/></td>
                    </tr>
                    <tr>
                        <td>Minimum Guest Rating</td>
                        <td><input type="text" name="minGuestRate"/></td>
                    </tr>
                    <tr>
                        <td>Maximum Guest Rating</td>
                        <td><input type="text" name="maxGuestRate"/></td>
                    </tr>
                </tbody>
            </table>
            
            <div class="flex">
  
    <input type="reset" value="Clear"/>
  <input type="submit" value="Search"/>
</div

        </form>
        
    </body>
</html>
