
package com.mycompany.consultorioodontologicojpajava.Logica;

import java.util.Date;


public class Responsable extends Persona
{
    private int idResponsable;
    private String tipoResponsable;

    public Responsable()
    {
    }

    public Responsable(int idResponsable, String tipoResponsable, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento)
    {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.idResponsable = idResponsable;
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

    public int getIdResponsable()
    {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable)
    {
        this.idResponsable = idResponsable;
    }

   
    
    
    
    
}
