
package com.mycompany.consultorioodontologicojpajava.Logica;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Horario implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHorario;
    private String horaInicio;
    private String horarioFin;

    public Horario()
    {
    }

    public Horario(int idHorario, String horaInicio, String horarioFin)
    {
        this.idHorario = idHorario;
        this.horaInicio = horaInicio;
        this.horarioFin = horarioFin;
    }

    public String getHorarioFin()
    {
        return horarioFin;
    }

    public void setHorarioFin(String horarioFin)
    {
        this.horarioFin = horarioFin;
    }

    public int getIdHorario()
    {
        return idHorario;
    }

    public void setIdHorario(int idHorario)
    {
        this.idHorario = idHorario;
    }

    public String getHoraInicio()
    {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio)
    {
        this.horaInicio = horaInicio;
    }
    
    
}
