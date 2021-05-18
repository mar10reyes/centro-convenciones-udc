
package pkgCentroConvenciones;

import java.io.Serializable;

public class Patrocinador implements Serializable
{
    protected String nombre;
    protected String tipo;
    
    public Patrocinador()
    {
        // constructor por defecto
    }

    public Patrocinador(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo   = tipo;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }  

}
