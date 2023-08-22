<%@page import="Logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp"  %>
<%@include file="Components/bodyPrimeraParte.jsp"  %>


<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- DataTales Example -->
    <div class="card shadow">
        <div class="card-header py-3 text-center">
            <h2 class="m-0 font-weight-bold text-primary font-italic" >Ver Usuarios</h2>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table btn-dark" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre del Usuario</th>
                            <th>Rol del Usuario</th>
                            <th style="width: 210px:">Acción</th>
                        </tr>
                    </thead>
                    <%
                        List<Usuario> listsUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                    %>
                    <tbody>
                        <%  for (Usuario usuario : listsUsuarios)
                            {%>
                        <tr>
                            <td id="IdUsuario"><%=usuario.getIdUsuario()%><%=usuario.getIdUsuario()%></td>
                            <td><%=usuario.getNombreUsuario()%></td>
                            <td><%=usuario.getRol()%></td>
                            <td>
                                <div style="display: flex; width: 230px;">
                                    <form action="SvEditarUsuario" method="post" name="editar">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-right: 5px; "><i class="fas fa-pencil-alt"></i> Editar</button>
                                        <input type="hidden" name="id" value="<%=usuario.getIdUsuario()%>">
                                    </form> 
                                    <form action="SvEliminarUsuario" method="post" name="eliminar">
                                        <button type="submit" class="btn btn-danger btn-user btn-block" style="margin-left: 5px;"><i class="fas fa-trash-alt "></i> Eliminar</button>
                                        <input type="hidden" name="id" value="<%=usuario.getIdUsuario()%>">
                                    </form> 
                                </div>
                            </td>
                        </tr>   
                        <%}%>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th>Id </th>
                            <th>Nombre del Usuario</th>
                            <th>Rol del Usaurio</th>
                            <th style="width: 210px;">Acción</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
        </div>
    </div>
</div>






<%@include file="Components/bodyfinal.jsp"  %>