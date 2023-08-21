
package Persistencia;

import Logica.Usuario;

public class ControladoraPersistencia
{
//    HorarioJpaController horarioJpaController;
//    OdontologoJpaController odontologoJpaController;
//    PacienteJpaController pacienteJpaController; 
//    PersonaJpaController personaJpaController; 
//    ResponsableJpaController responsableJpaController; 
//    SecretarioJpaController secretarioJpaController; 
//    TurnoJpaController turnoJpaController; 
    UsuarioJpaController usuarioJpaController; 

    public ControladoraPersistencia()
    {
//        horarioJpaController = new HorarioJpaController();
//        odontologoJpaController = new OdontologoJpaController();
//        pacienteJpaController = new PacienteJpaController();
//        responsableJpaController = new ResponsableJpaController();
//        secretarioJpaController = new  SecretarioJpaController();
//        turnoJpaController = new TurnoJpaController();
        usuarioJpaController = new UsuarioJpaController();
    }
    
    
    

    public void CreateUsuario(Usuario datosUsuario)
    {
        usuarioJpaController.create(datosUsuario);
    }

    
    
    
    
}
