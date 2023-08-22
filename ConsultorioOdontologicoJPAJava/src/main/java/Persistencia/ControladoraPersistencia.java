
package Persistencia;

import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia
{
    HorarioJpaController horarioJpaController;
    OdontologoJpaController odontologoJpaController;
    PacienteJpaController pacienteJpaController; 
    PersonaJpaController personaJpaController; 
    ResponsableJpaController responsableJpaController; 
    SecretarioJpaController secretarioJpaController; 
    TurnoJpaController turnoJpaController; 
    UsuarioJpaController usuarioJpaController; 

    public ControladoraPersistencia()
    {
        horarioJpaController = new HorarioJpaController();
        odontologoJpaController = new OdontologoJpaController();
        pacienteJpaController = new PacienteJpaController();
        responsableJpaController = new ResponsableJpaController();
        secretarioJpaController = new  SecretarioJpaController();
        turnoJpaController = new TurnoJpaController();
        usuarioJpaController = new UsuarioJpaController();
    }
    
    
    

    public void CreateUsuario(Usuario datosUsuario)
    {
        usuarioJpaController.create(datosUsuario);
    }

    public List<Usuario> GetUsuarios()
    {
      return  usuarioJpaController.findUsuarioEntities();
    }

    public void BorrarUsuario(int idUsuario)
    {
        try
        {
            usuarioJpaController.destroy(idUsuario);
        }
        catch (NonexistentEntityException ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario TraerUsuarioPorId(int idUsuario)
    {
        return usuarioJpaController.findUsuario(idUsuario);
    }

    public void EditarUsuario(Usuario usuario)
    {
        try
        {
            usuarioJpaController.edit(usuario);
        }
        catch (Exception ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
}
