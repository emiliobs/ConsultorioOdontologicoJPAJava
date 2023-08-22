
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp"  %>
<%@include file="Components/bodyPrimeraParte.jsp"  %>

<div class="container">

    <div class="col-lg-12">
        <div class="card text-center">
            <div class="card-title">
                <h1 class="font-weight-bold font-italic"  style="color: #4368D6;">Editar Usuarios</h1>
            </div>
            <hr/>
            <div class="card-body ">
                <% Usuario  usuario = (Usuario)request.getSession().getAttribute("editarUsuario"); %>
                <form class="user" action="SvEditarUsuario" method="post">
                    <div class="form-group col">
                        <div class="col-sm-8 ml-5 mb-sm-3">
                            <input type="text" class="form-control form-control-user" id="nombreusaurio"
                                   placeholder="Nombre Usuario....." name="txtNombreUsuario" required="Ingrese Nombre" value="<%=usuario.getNombreUsuario()%>">
                        </div>             
                        <div class="col-sm-8 ml-5 mt-sm-3">
                            <input type="password" class="form-control form-control-user" id="comtrasenia"
                                   placeholder="Contrasenia....." name="txtContrasenia" required="Ingrese una Contrasena" value="<%=usuario.getContrasenia()%>">
                        </div>
                        <div class="col-sm-8  ml-5 mt-sm-3">
                            <input type="text" class="form-control form-control-user" id="ROL"
                                   placeholder="Rol....." name="txtRol" required="Ingrese un Rol" value="<%=usuario.getRol()%>">
                        </div>


                        <!-- Aqui va todo lo que se respecta a horarios y usuarios -->
                    </div>

                    <div class="form-group">
                        <button type="submit" class="col-sm-9 mb-3  btn btn-primary btn-user btn-block"> Editar Usuarios</button>            
                    </div>
                </form>
            </div>

        </div> 
    </div>

</div>





<%@include file="Components/bodyfinal.jsp"  %>
