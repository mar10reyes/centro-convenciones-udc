
package pkgCentroConvenciones;
import java.io.Serializable;
import java.util.ArrayList;
import pkgCentroConvGUI.*;


public class CentroConvenciones implements Serializable
{
    //arrays de objetos (arrglar)
    private ArrayList<Evento> eventos = new ArrayList<>();
    
    private ArrayList<EvAcademico> eventosAcademicos = new ArrayList<>();
    private ArrayList<EvCultural> eventosCulturales = new ArrayList<>();
    private ArrayList<Congreso> congresos = new ArrayList<>();
    
    public CentroConvenciones()
    {
        //contructor por defecto
    }
    
    //agregar un evento
    public void crearEvento(Evento E)
    {
        eventos.add(E);
    }
    
    //agregregar evento academico
    public void crearEventoAcademico(EvAcademico E)
    {
        eventosAcademicos.add(E);
        eventos.add(E);
    }
    
    //agregregar evento cultural
    public void crearEventoCultural(EvCultural E)
    {
        eventosCulturales.add(E);
        eventos.add(E);
    }
    
    //crear evento tipo congreso
    public void crearCongreso(Congreso E)
    {
        congresos.add(E);
        eventos.add(E);
    }
    
    //eliminar un evento
    public void eliminarEvento(String nombre)
    {
        
        for(int i=0; i<eventos.size(); i++)
        {
            if(eventos.get(i).getNombre().equals(nombre))
            {
                eventos.remove(i);
            }
        }
    }
    
    //buscar un evento
    public int buscarEvento(String nombre)
    {
        for(int i=0; i<eventos.size(); i++)
        {
            if(eventos.get(i).getNombre().equals(nombre))
            {
                return i;
            }
        }
        return -1; //no lo encontro
    }
    
    public int cantidadEventos()
    {
        return eventos.size();
    }

    public Evento getEvento(int n) {
        return eventos.get(n);
    }
    
    public EvAcademico getEventoAcademico(int n) {
        return eventosAcademicos.get(n);
    }
    
    public EvCultural getEventoCultural(int n) {
        return eventosCulturales.get(n);
    }
    
    public Congreso getCongreso(int n) {
        return congresos.get(n);
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    
}
