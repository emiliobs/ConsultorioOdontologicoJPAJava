
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp"  %>
<%@include file="Components/bodyPrimeraParte.jsp"  %>

<div class="container">

    <div class="col-lg-12">
        <div class="card text-center">
            <div class="card-title">
                <h1 class="font-weight-bold font-italic"  style="color: #4368D6;">Alta Usuarios</h1>
            </div>
            <hr/>
            <div class="card-body ">
                <form class="user" action="SvUsuario" method="post">
                    <div class="form-group col">
                        <div class="col-sm-8 ml-5 mb-sm-3">
                            <input type="text" class="form-control form-control-user" id="nombreusaurio"
                                   placeholder="Nombre Usuario....." name="txtNombreUsuario" required="Ingrese Nombre">
                        </div>             
                        <div class="col-sm-8 ml-5 mt-sm-3">
                            <input type="password" class="form-control form-control-user" id="comtrasenia"
                                   placeholder="Contrasenia....." name="txtContrasenia" required="Ingrese una Contrasena">
                        </div>
                        <div class="col-sm-8  ml-5 mt-sm-3">
                            <input type="text" class="form-control form-control-user" id="ROL"
                                   placeholder="Rol....." name="txtRol" required="Ingrese un Rol">
                        </div>


                        <!-- Aqui va todo lo que se respecta a horarios y usuarios -->
                    </div>

                    <div class="form-group">
                        <button type="submit" class="col-sm-9 mb-3  btn btn-primary btn-user btn-block"> Crear Usuarios</button>            
                    </div>
                </form>
            </div>

        </div> 
    </div>

</div>





<%@include file="Components/bodyfinal.jsp"  %>
