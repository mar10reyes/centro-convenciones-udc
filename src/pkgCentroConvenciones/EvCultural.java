
package pkgCentroConvenciones;
import java.io.Serializable;
import java.util.ArrayList;

public class EvCultural extends Evento implements Serializable
{
    private ArrayList<Actividad> actividades = new ArrayList<>();
    
    public EvCultural()
    {
        //constructor por defecto
    }
    
    public EvCultural(String nombre, String descripcion, int capacidadMax, int tipo, String fechaInicio, String fechaFin, int horaInicio, int horaFin)
    {
        super(nombre, descripcion, capacidadMax, tipo, fechaInicio, fechaFin, horaInicio, horaFin);
    }
}
