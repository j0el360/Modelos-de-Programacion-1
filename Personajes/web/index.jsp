<%-- 
    Document   : index
    Created on : 5/03/2017, 02:11:25 PM
    Author     : Joel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
        function dibujar(){
                    
                    // var canvas = document.getElementById("micanvas");
                     //var lapiz = canvas.getContext("2d");
                    //var img = new Image();
                    //img.src ="hechicero.png";
                   
                    //lapiz.drawImage(img, 0, 0);
                    // <input type="button" value="dibujar" onclick="dibujar()">
      // <canvas height="200px" width="200px" id="micanvas"></canvas>
                    }
        </script>
    </head>
    <body  onload="dibujar();">
       
        <form method="POST" action="servletRol">
        <select name="personaje">
            <option value="1" name="Hechicero">Hechicero</option>
            <option value="2" name="Humano">Humano</option>
            <option value="3" name="Enano">Enano</option>
            <option value="4" name="Elfo">Elfo</option>
        </select>
            
       
            <input type="submit" value="crear" id="no" onfocus="dibujar()"/>
        </form>
    </body>
</html>
