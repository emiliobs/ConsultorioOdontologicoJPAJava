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
    

    public Paciente(int idPaciente, boolean tieneOS, String tipoDeSangre, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento)
    {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.idPaciente = idPaciente;
        this.tieneOS = tieneOS;
        this.tipoDeSangre = tipoDeSangre;
    }

    public String getTipoDeSangre()
    {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre)
    {
        this.tipoDeSangre = tipoDeSangre;
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

   
}
