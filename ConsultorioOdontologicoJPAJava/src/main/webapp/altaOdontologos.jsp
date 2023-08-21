
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp"  %>
<%@include file="Components/bodyPrimeraParte.jsp"  %>

<div class="container">

    <div class="col-lg-12">
        <div class="card text-center">
            <div class="card-title">
                <h1 class="font-weight-bold font-italic"  style="color: #4368D6;">Alta Odontológos</h1>
            </div>
            <div class="card-body ">
                <form class="user">
                    <div class="form-group col">
                        <div class="col-sm-4 ml-5 mb-sm-3">
                            <input type="text" class="form-control form-control-user" id="dni"
                                   placeholder="DNI">
                        </div>             
                        <div class="col-sm-8 ml-5 mt-sm-3">
                            <input type="text" class="form-control form-control-user" id="nombre"
                                   placeholder="Nombre">
                        </div>
                        <div class="col-sm-8  ml-5 mt-sm-3">
                            <input type="text" class="form-control form-control-user" id="apellidos"
                                   placeholder="Apellidos">
                        </div>
                        <div class="col-sm-8 ml-5 mt-sm-3">
                            <input type="tel" class="form-control form-control-user" id="telefono"
                                   placeholder="Télefeno">
                        </div>
                        <div class="col-sm-8 ml-5 mt-sm-3">
                            <input type="text" class="form-control form-control-user"
                                   id="direccion" placeholder="Dirección">
                        </div>
                        <div class="col-sm-8 ml-5 mt-sm-3">
                            <input type="datetime-local" class="form-control form-control-user"
                                   id="fechanacimiento" placeholder="Fecha de Nacimiento">
                        </div>
                        <div class="col-sm-8 ml-5 mt-sm-3">
                            <input type="text" class="form-control form-control-user"
                                   id="especialidad" placeholder="Especialidad">
                        </div>

                        <!-- Aqui va todo lo que se respecta a horarios y usuarios -->
                    </div>

                    <div class="form-group">
                        <a href="#" class="col-sm-9 mb-3  btn btn-primary btn-user btn-block">
                            Crear Odontológo
                        </a>         
                    </div>
            </div>
            </form>
        </div> 
    </div>

</div>





<%@include file="Components/bodyfinal.jsp"  %>
