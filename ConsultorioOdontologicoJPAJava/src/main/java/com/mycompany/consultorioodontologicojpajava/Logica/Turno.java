
package com.mycompany.consultorioodontologicojpajava.Logica;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurno;
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;
    private String horaTurno;
    private String afeccion;
    
    //relacion
    @ManyToOne
    @JoinColumn(name = "idTurno")
    private Odontologo odontologo;
    @OneToOne
    @JoinColumn(name = "idTurno2")
    private Paciente paciente;

    public Turno()
    {
    }

    public Turno(int idTurno, Date fechaTurno, String horaTurno, String afeccion)
    {
        this.idTurno = idTurno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.afeccion = afeccion;
    }

    public String getAfeccion()
    {
        return afeccion;
    }

    public void setAfeccion(String afeccion)
    {
        this.afeccion = afeccion;
    }

    public int getIdTurno()
    {
        return idTurno;
    }

    public void setIdTurno(int idTurno)
    {
        this.idTurno = idTurno;
    }

    public Date getFechaTurno()
    {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno)
    {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno()
    {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno)
    {
        this.horaTurno = horaTurno;
    }
    
    
}
