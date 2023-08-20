
package Logica;


import Persistencia.ControladoraPersistencia;


public class Controladora
{
    
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    
    public  void  CrearUsuario(int id, String nombreUsaurio, String contrasenia, String rol)
    {
        Usuario usuario = new Usuario(id, nombreUsaurio, contrasenia, rol);
        controladoraPersistencia.CrearUsuario(usuario);
    }
    
}
