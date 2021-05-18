
package pkgCentroConvenciones;

import java.io.Serializable;

public class Ponente extends Persona implements Serializable
{
    private String ponencia;
    
    public Ponente()
    {
        //constructor por defecto
    }
    
    public Ponente(String nombre, int codigo, String ponencia)
    {
        super(nombre, codigo);
        this.ponencia = ponencia;
    }
}
