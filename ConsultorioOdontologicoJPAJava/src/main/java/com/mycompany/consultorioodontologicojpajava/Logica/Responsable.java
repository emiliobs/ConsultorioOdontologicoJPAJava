
package com.mycompany.consultorioodontologicojpajava.Logica;

import java.util.Date;
import javax.persistence.Entity;


@Entity
public class Responsable extends Persona
{
    //private int idResponsable;
    private String tipoResponsable;

    public Responsable()
    {
    }

    public Responsable(String tipoResponsable, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento)
    {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.tipoResponsable = tipoResponsable;
    }

    public Responsable(String tipoResponsable)
    {
        this.tipoResponsable = tipoResponsable;
    }

    

    public String getTipoResponsable()
    {
        return tipoResponsable;
    }

    public void setTipoResponsable(String tipoResponsable)
    {
        this.tipoResponsable = tipoResponsable;
    }

//    public int getIdResponsable()
//    {
//        return idResponsable;
//    }
//
//    public void setIdResponsable(int idResponsable)
//    {
//        this.idResponsable = idResponsable;
//    }

   
    
    
    
    
}
