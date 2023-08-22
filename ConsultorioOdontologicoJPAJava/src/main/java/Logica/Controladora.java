
package Logica;


import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;


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

    public List<Usuario> GetUsuarios()
    {
        return controladoraPersistencia.GetUsuarios();
    }

    public void BorrarUsuario(int idUsuario)
    {
        controladoraPersistencia.BorrarUsuario(idUsuario);
    }
    
    
   
    
}
