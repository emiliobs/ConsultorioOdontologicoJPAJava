
package com.mycompany.consultorioodontologicojpajava.Logica;


public class Horario
{
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
