<%-- 
    Document   : index
    Created on : 03-may-2014, 20:31:04
    Author     : juanH
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="Servlet1" method="post" >
            <center><table bgcolor="#cccccc" border="0" cellpadding="6"
                           cellspacing="0" width="400">

                    <tr>
                        <td align="right" valign="top"><b>Codigo: </b></td>
                        <td><input type="text" size="25" name="codigo"> </td>
                    </tr>
                    <tr>
                        <td align="right" valign="top"><b>Nombre: </b></td>
                        <td><input type="text" size="25" name="nombre"> </td>
                    </tr>


                    <tr>
                        <td align="right" valign="top"><b>Añadir Stock: </b></td>
                        <td><input type="text" size="25" name="stock"> </td>
                    </tr>
                    <tr>

                        <td align="right" valign="top"><b>Precio: </b></td>
                        <td><input type="text" size="25" name="precio"> </td>
                    </tr>
                    <input type="hidden" name="tipo" value="total">
                    <td align="right" valign="top">
                        <b></b> 
                    </td>
                    <td align="center">&nbsp; 
                        <input type="submit" name="Enviar datos" value=" Enviar ">
                        <input type="reset" value="Borrar" name="B1"> 

                    </td>
                    </tr>
                    </form>
                    <tr>
                        <td>
                            <table>
                                <tr>
                                    <td>
                                        <form action="NewServlet" >
                                            <input type="submit" value="Datos"/>
                                        </form> 
                                    </td>
                                    <td>
                                        <form action="Total" >
                                            <input type="submit" value="Total"/>
                                        </form> 

                                    </td>
                                   
                                </tr>
                            </table>

                        </td>
                        <td>
                            <table>
                                <tr>
                                    <td>
                                        <form action="Minimos" >
                                            <input type="submit" value="Stock Min."/>
                                        </form>   
                                    </td>
                                    <td>
                                          <form action="Ordenar" >
                                            <input type="submit" value="Ordenar"/>
                                        </form> 
                                    </td>
                                </tr>
                            </table>

                        </td>

                        
                    </tr>
                    <tr>
                        <td>
                             <form action="Buscar" >
                                 <input name="codigo" size="15"/>
                            
                        </td>
                        <td>
                                <input type="submit" value="Busca por Codigo"/>
                            </form>  
                        </td>
                    </tr>

                </table>
            </center>









</html>
