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
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <%
                        List<Usuario> listsUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                    %>
                    <tbody>
                        <%  for (Usuario usuario : listsUsuarios)
                       {%>
                        <tr>
                            <td><%=usuario.getIdUsuario()%></td>
                            <td><%=usuario.getNombreUsuario()%></td>
                            <td><%=usuario.getRol()%></td>
                            <td>
                                <button type="submit" class="btn btn-primary">Editar</button>
                                <button type="submit" class="btn btn-danger">Elimiar</button>
                            </td>
                        </tr>   
                        <%}%>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th>Id </th>
                            <th>Nombre del Usuario</th>
                            <th>Rol del Usaurio</th>
                            <th>Acciones</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
        </div>
    </div>
</div>






<%@include file="Components/bodyfinal.jsp"  %>