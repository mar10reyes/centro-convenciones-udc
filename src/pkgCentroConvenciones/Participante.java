
package pkgCentroConvenciones;

import java.io.Serializable;

public class Participante extends Persona implements Serializable
{
    int cantidadPagar = 0;
    
    public Participante()
    {
        //constructor por defecto
    }
    
    public Participante(String nombre, int codigo)
    {
        super(nombre, codigo);
        
    }

    public int getCantidadPagar() {
        return cantidadPagar;
    }

    public void setCantidadPagar(int cantidadPagar) {
        this.cantidadPagar = cantidadPagar;
    }
    
}
