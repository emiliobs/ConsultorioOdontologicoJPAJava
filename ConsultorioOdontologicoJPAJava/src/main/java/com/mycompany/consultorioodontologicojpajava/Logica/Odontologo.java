
package com.mycompany.consultorioodontologicojpajava.Logica;

import java.util.Date;
import java.util.List;

public class Odontologo extends Persona
{
    private int idOdontologo;
    private String especialidad;
    
    //relaciones
    private List<Turno> listaTurnos;
    private Usuario usuario;
    private Horario unHorario;

    public Odontologo()
    {
    }

    public Odontologo(int idOdontologo, String especialidad, List<Turno> listaTurnos, Usuario usuario, Horario unHorario, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento)
    {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.idOdontologo = idOdontologo;
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.usuario = usuario;
        this.unHorario = unHorario;
    }

    public Horario getUnHorario()
    {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario)
    {
        this.unHorario = unHorario;
    }

    public int getIdOdontologo()
    {
        return idOdontologo;
    }

    public void setIdOdontologo(int idOdontologo)
    {
        this.idOdontologo = idOdontologo;
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

   
    
    
    
    
}
