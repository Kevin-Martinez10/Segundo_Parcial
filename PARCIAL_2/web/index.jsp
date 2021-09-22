<%-- 
    Document   : index
    Created on : 21/09/2021, 10:36:20 PM
    Author     : Kevin Matinez
--%>

<%@page import="Modelo.Marca" %>
<%@page import="java.util.HashMap" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Empleados</title>
    </head>
    <body>
        <h1>Formulario empleados</h1>
        <div class="container">
            <form action="sr_marca" metod="POST" class="form-group">
                <label for="lbl_producto"><b>Producto:</b></label>
                <input type="text" name="txt_producto" id="txt_producto" class="form-control" placeholder="Ejemplo: Telefono" required>
                <label for="lbl_marca"><b>Marca:</b></label>
                <select name="drop_marca" id="drop_marca" class="form-control">
                    <%
                        Marca marca = new Marca();
                        HashMap<String,String> drop = marca.drop_marca();
                        for (String i: drop.keySet()){
                        out.println("<option value='" + i + "'>" + drop.get(i) + "</option>");
                        }
                    %>
                    <option value="1">Opcion 1</option>
                </select>
                <label for="lbl_descripcion"><b>Descripcion:</b></label>
                <textarea  name="txt_descripcion" id="txt_descripcion" class="form-control" placeholder="Ejemplo: El mejor producto color rojo" required></textarea>
                <label for="lbl_precio_costo"><b>Precio costo:</b></label>
                <input type="text" name="txt_precio_costo" id="txt_precio_costo" class="form-control" placeholder="Ejemplo: 50" required>
                <label for="lbl_precio_venta"><b>Precio venta</b></label>
                <input type="text" name="txt_precio_venta" id="txt_precio_venta" class="form-control" placeholder="Ejemplo: 100" required>
                <label for="lbl_existencias"><b>Existencias:</b></label>
                <input type="number" name="txt_existencias" id="txt_existencias" class="form-control" placeholder="Ejemplo: 00" required>
                <br/>
                <button name="btn_agregar" id="btn_agregar" value="agregar" class="btn btn-primary btn-sm">Agregar</button>
            </form>
        </div>
     </body>
</html>