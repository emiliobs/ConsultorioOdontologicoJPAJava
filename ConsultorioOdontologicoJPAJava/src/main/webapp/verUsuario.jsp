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
                    <table class="table table-hover" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre del Usuario</th>
                                <th>Rol del Usuario</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>55555</td>
                                <td>Emilio Barrera</td>
                                <td>System Architect</td>
                            </tr>                           
                        </tbody>
                        <tfoot>
                            <tr>
                                <th>Nombre del Usuario</th>
                                <th>Rol del Usaurio</th>
                            </tr>
                        </tfoot>
                    </table>
                </div>
            </div>
        </div>
    </div>






<%@include file="Components/bodyfinal.jsp"  %>