
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona implements Serializable
{
    //private int idOdontologo;
    private String especialidad;
    
    //relaciones
    @OneToMany(mappedBy = "odontologo")
    private List<Turno> listaTurnos;
    @OneToOne
    private Usuario usuario;
    @OneToOne
    private Horario unHorario;

    public Odontologo()
    {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario usuario, Horario unHorario, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento)
    {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.usuario = usuario;
        this.unHorario = unHorario;
    }

    public String getEspecialidad()
    {
        return especialidad;
    }

    public void setEspecialidad(String especialidad)
    {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos()
    {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos)
    {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    public Horario getUnHorario()
    {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario)
    {
        this.unHorario = unHorario;
    }

          
    
    
}
