package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class Controladora
{

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public Controladora()
    {

    }

    public void CrearUsuario(String nombreUsuario, String contrasenia, String rol)
    {
        Usuario datosUsuario = new Usuario();
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

    public Usuario TraerUsuarioPorId(int idUsuario)
    {
        return controladoraPersistencia.TraerUsuarioPorId(idUsuario);
    }

    public void EditarUsuario(Usuario usuario)
    {
        controladoraPersistencia.EditarUsuario(usuario);
    }

    public boolean ComprobarIngreso(String usuario, String password)
    {
        boolean ingreso = false;

        List<Usuario> listaUsuario = new ArrayList();
        listaUsuario = controladoraPersistencia.GetUsuarios();

        for (Usuario getUsuario : listaUsuario)
        {
            if (getUsuario.getNombreUsuario().equals(usuario) && getUsuario.getContrasenia().equals(password))
            {
                ingreso = true;
            }
            else
            {
                ingreso = false;
            }

        }

        return ingreso;
    }

   
}
