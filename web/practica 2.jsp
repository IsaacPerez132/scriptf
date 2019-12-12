<%-- 
    Document   : practica 2
    Created on : 11-23-2019, 09:04:36 AM
    Author     : isaac.doñousam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <input type="text" id="nombre">
        <label id="texto"></label>
        <script>
            $(document).ready(function ()){
               $("#nombre").keyup(function ()){
             //declarar variables con $ se elije variable y se selecciona val retiene valor de variable, luego 
             // se seleeciona variable y se combierte en texto
             $a  = $("#nombre").val()  
                   $("#texto").text($a);
                   //.css('color','red'); 
                   //.css({color: ---, font-family : ---- , font-side:---- })
               } 
            });
            
        </script>
    </body>
</html>
