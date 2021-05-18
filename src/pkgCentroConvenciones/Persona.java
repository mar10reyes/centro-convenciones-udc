
package pkgCentroConvenciones;

import java.io.Serializable;

public class Persona implements Serializable
{
    protected String nombre;
    protected int codigo;
    
    public Persona()
    {
        //constructor por defecto
    }
    
    public Persona(String nombre, int codigo)
    {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
}
