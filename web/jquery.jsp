<%-- 
    Document   : jquery
    Created on : 11-25-2019, 08:30:21 AM
    Author     : isaac.doñousam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="jquery-1.4.2.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>

           <div style="width: 50px;height: 300px;background-color: black"> 
            
        <div id="verde" style="border-radius: 150PX; width: 50px; height: 50px; background:black">
            
        </div>
        <DIV id="amarillo" style="border-radius: 150px; width: 50px; height: 50px; background: black ">
            
        </DIV>
        <div id="rojo" style="border-radius: 150px; width: 50px;height: 50px;background: black" >
            
        </div>
         </div>
        <script>
         
    $(document).ready(function (){
        $("#verde").click(function (){
            $("#verde").css("background",'green');
            $("#amarillo").css("background",'black');
            $("#rojo").css("background",'black');
            
        })
    });        
    $("#amarillo").click(function (){
            $("#verde").css("background",'black');
            $("#amarillo").css("background",'yellow');
            $("#rojo").css("background",'black');
            
        })
    });   
    $("#rojo").click(function (){
            $("#verde").css("background",'black');
            $("#amarillo").css("background",'black');
            $("#rojo").css("background",'red');
            
        })
    });   
        </script>
        
    </body>
</html>
