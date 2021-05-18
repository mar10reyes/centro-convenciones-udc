
package pkgCentroConvenciones;

import java.io.Serializable;

public class Congreso extends Evento implements Serializable
{
    public Congreso()
    {
        //constructor por defecto
    }
    
    public Congreso(String nombre, String descripcion, int capacidadMax, int tipo, String fechaInicio, String fechaFin, int horaInicio, int horaFin)
    {
        super(nombre, descripcion, capacidadMax, tipo, fechaInicio, fechaFin, horaInicio, horaFin);
    }
}
