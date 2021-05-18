
package pkgCentroConvenciones;
import java.util.ArrayList;

public class evCultural extends Evento
{
    private ArrayList<Actividad> actividades = new ArrayList<>();
    
    public evCultural()
    {
        //constructor por defecto
    }
    
    public evCultural(String nombre, String descripcion, int capacidadMax, int tipo, int fechaInicio, int fechaFin, int horaInicio, int horaFin)
    {
        super(nombre, descripcion, capacidadMax, tipo, fechaInicio, fechaFin, horaInicio, horaFin);
    }
}
