package pkgCentroConvenciones;

import java.io.Serializable;

public class Conferencista extends Persona implements Serializable
{
    public String conferencia;
    
    public Conferencista()
    {
        //constructor por defecto
    }
    
    public Conferencista(String nombre, int codigo, String conferencia)
    {
        super(nombre, codigo);
        this.conferencia = conferencia;
    }
}