
package Persistencia;

import Logica.Usuario;

public class ControladoraPersistencia
{
    HorarioJpaController horarioJpaController = new HorarioJpaController();
    OdontologoJpaController odontologoJpaController = new OdontologoJpaController();
    PacienteJpaController pacienteJpaController = new PacienteJpaController();
    PersonaJpaController personaJpaController = new PersonaJpaController();
    ResponsableJpaController responsableJpaController = new ResponsableJpaController();
    SecretarioJpaController secretarioJpaController = new SecretarioJpaController();
    TurnoJpaController turnoJpaController = new TurnoJpaController();
    UsuarioJpaController usuarioJpaController = new UsuarioJpaController();

    public void CrearUsuario(Usuario usuario)
    {
        usuarioJpaController.create(usuario);
    }
    
    
    
}
