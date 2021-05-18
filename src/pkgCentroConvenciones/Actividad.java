
package pkgCentroConvenciones;
import java.io.Serializable;
import java.util.ArrayList;

public class Actividad implements Serializable
{
    protected String nombre;
    protected String tipo;
    protected int precio;
    protected String actividad;
    
    protected ArrayList<Participante> participantes = new ArrayList<>();
    
    public Actividad(String nombre, String tipo, int precio, String actividad)
    {
        this.nombre    = nombre;
        this.tipo      = tipo;
        this.precio    = precio;
        this.actividad = actividad;
    }
    
    //añadir participante a la lista
    public void addParticipante(Participante p)
    {
        participantes.add(p);
    }
    
    //buscar participante en la lista
    public int buscarParticipante(int codigo)
    {
        for(int i=0; i<participantes.size(); i++)
        {
            if(participantes.get(i).getCodigo() == codigo)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    //--------------setter y getters
    public Participante getParticipante(int n)
    {
        return participantes.get(n);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    
    
}
