
package pkgCentroConvenciones;
import java.io.Serializable;
import java.util.ArrayList;

public class EvAcademico extends Evento implements Serializable
{
    private ArrayList<Ponente> ponentes = new ArrayList<Ponente>();
    private ArrayList<Conferencista> conferencistas = new ArrayList<>();
    private ArrayList<Participante> participantes = new ArrayList<>();
    
    public EvAcademico()
    {
        //constructor por defecto
    }
    
    public EvAcademico(String nombre, String descripcion, int capacidadMax, int tipo, String fechaInicio, String fechaFin, int horaInicio, int horaFin)
    {
        super(nombre, descripcion, capacidadMax, tipo, fechaInicio, fechaFin, horaInicio, horaFin);
    }
    
    //agregar ponenete
    public void addPonente(Ponente p)
    {
        ponentes.add(p);
    }
    
    //da la posicion de un ponenete, devuelve -1 si no lo encuentra
    public int buscarPonente(int codigo)
    {
        for(int i=0; i<ponentes.size(); i++)
        {
            if(ponentes.get(i).getCodigo() == codigo)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public void addConferencista(Conferencista c)
    {
        conferencistas.add(c);
    }
    
    //da la posicion de un conferencista, devuelve -1 si no lo encuentra
    public int buscarConferencista(int codigo)
    {
        for(int i=0; i<conferencistas.size(); i++)
        {
            if(conferencistas.get(i).getCodigo() == codigo)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public void generarDiploma()
    {
        
    }
}
