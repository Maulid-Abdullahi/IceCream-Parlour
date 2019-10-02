<%-- 
    Document   : MockOrder
    Created on : Mar 21, 2019, 9:04:42 PM
    Author     : Abdullahi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center><form action="OrderForm" method="post">
            <h1>Order</h1>
            <b> Email:</b> <input type="email" name="Email" placeholder="John"><br/>
            <br/>
            <b>Mobile NO: </b><input type="text" name="Phone" placeholder="0700000000"><br/>
            <br/>
           <br/>
           <textarea name="type" placeholder="Vanilla,Chocolate,Kiwi,Strawberry,Coffe,Cherry,walnut"></textarea>

           <b><p>Quantity:</br><input type="text" name="Comments"></p></b>

                    <p></p>
            <input type="submit" value="Order">
          </form>
        </center>
    </body>
</html>
