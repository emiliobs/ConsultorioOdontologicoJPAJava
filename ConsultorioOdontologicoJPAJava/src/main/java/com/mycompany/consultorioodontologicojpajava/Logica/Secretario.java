
package com.mycompany.consultorioodontologicojpajava.Logica;

import java.util.Date;


public class Secretario extends Persona
{
    private int idSecretario;
    private String sector;
    //Relacion
    private Usuario usuario;

    public Secretario()
    {
    }

    public Secretario(int idSecretario, String sector, Usuario usuario, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento)
    {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.idSecretario = idSecretario;
        this.sector = sector;
        this.usuario = usuario;
    }

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    public int getIdSecretario()
    {
        return idSecretario;
    }

    public void setIdSecretario(int idSecretario)
    {
        this.idSecretario = idSecretario;
    }

    public String getSector()
    {
        return sector;
    }

    public void setSector(String sector)
    {
        this.sector = sector;
    }

    
    
    
}
