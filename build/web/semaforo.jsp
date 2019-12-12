<%-- 
    Document   : semaforo
    Created on : 11-23-2019, 09:09:26 AM
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

            <div id="verde" style="border-radius: 150PX; width: 50px; height: 50px; background:black" onclick="cambio1()">>

            </div>
            <DIV id="amarillo" style="border-radius: 150px; width: 50px; height: 50px; background: black "onclick="cambio2()">>

            </DIV>
            <div id="rojo" style="border-radius: 150px; width: 50px;height: 50px;background: black" onclick="cambio3()">>

            </div>
        </div>

        <h1>Calculador</h1>
        <label>Numero 1</label>
        <input class="control-form" id="n1" type="number">
        <label>Numero 2</label>
        <input class="control-form" id="n2" type="number">
        <input class="control-form" id="tot" type="button" value="Calcular">

        <label id="result"></label>
        <script>
            function cambio1(){
            document.getElementById("verde").style.backgroundColor = "green";
            document.getElementById("amarillo").style.backgroundColor = "black";
            document.getElementById("rojo").style.backgroundColor = "black";
            };
            function cambio2(){
            document.getElementById("verde").style.backgroundColor = "black";
            document.getElementById("amarillo").style.backgroundColor = "yellow";
            document.getElementById("rojo").style.backgroundColor = "black";
            };
            function cambio3(){
            document.getElementById("verde").style.backgroundColor = "black";
            document.getElementById("amarillo").style.backgroundColor = "black";
            document.getElementById("rojo").style.backgroundColor = "red";
            };
            
            $(document).ready(function (){
            $("#tot").click(function (){
            $ n1 = $("#n1").val();
            var n2 = $("#n2").val();
            $total = parseInt($n1) + parseInt(n2);
            $("#result").text($total);
            });
            });
        </script>
    </body>
</html>
