
package Logica;


import Persistencia.ControladoraPersistencia;


public class Controladora
{
    
    ControladoraPersistencia  controladoraPersistencia = new ControladoraPersistencia();

    public Controladora()
    {
       
    }
    
    

    public void CrearUsuario(String nombreUsuario, String contrasenia, String rol)
    {
        Usuario  datosUsuario = new Usuario();
        datosUsuario.setNombreUsuario(nombreUsuario);
        datosUsuario.setContrasenia(contrasenia);
        datosUsuario.setRol(rol);
        
        controladoraPersistencia.CreateUsuario(datosUsuario);
    }
    
    
   
    
}
