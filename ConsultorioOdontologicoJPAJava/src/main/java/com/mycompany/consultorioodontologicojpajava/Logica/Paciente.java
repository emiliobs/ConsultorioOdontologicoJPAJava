package com.mycompany.consultorioodontologicojpajava.Logica;

import java.util.Date;
import java.util.List;

public class Paciente extends Persona
{

    private int idPaciente;
    private boolean tieneOS;
    private String tipoDeSangre;
    
    //relacion:
    private Responsable unResponsable;
    private List<Turno> listaTurno;

    public Paciente(int idPaciente, boolean tieneOS, String tipoDeSangre, Responsable unResponsable, List<Turno> listaTurno, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento)
    {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.idPaciente = idPaciente;
        this.tieneOS = tieneOS;
        this.tipoDeSangre = tipoDeSangre;
        this.unResponsable = unResponsable;
        this.listaTurno = listaTurno;
    }

    public int getIdPaciente()
    {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente)
    {
        this.idPaciente = idPaciente;
    }

    public boolean isTieneOS()
    {
        return tieneOS;
    }

    public void setTieneOS(boolean tieneOS)
    {
        this.tieneOS = tieneOS;
    }

    public String getTipoDeSangre()
    {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre)
    {
        this.tipoDeSangre = tipoDeSangre;
    }

    public Responsable getUnResponsable()
    {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable)
    {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurno()
    {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno)
    {
        this.listaTurno = listaTurno;
    }

     

   
}
