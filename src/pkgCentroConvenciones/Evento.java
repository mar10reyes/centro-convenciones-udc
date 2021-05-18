package pkgCentroConvenciones;
import java.io.Serializable;
import java.util.ArrayList;

public class Evento implements Serializable
{
    protected String nombre;
    protected String descripcion;
    protected int capacidadMax;
    protected int tipo;
    protected String fechaInicio;
    protected String fechaFin;
    protected int horaInicio;
    protected int horaFin;
    protected ArrayList<Actividad> actividades = new ArrayList<>();
    protected ArrayList<Patrocinador> patrocinadores = new ArrayList<>();
    protected ArrayList<Salon> salones = new ArrayList<>();
    protected ArrayList<Participante> participantes = new ArrayList<>();
    
    public Evento()
    {
        //constructor por defecto
    }
    
    public Evento(String nombre, String descripcion, int capacidadMax, int tipo, String fechaInicio, String fechaFin, int horaInicio, int horaFin)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capacidadMax = capacidadMax;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    public void addActividad(Actividad act)
    {
        actividades.add(act);
    }
    
    //da la posicion de una actividad, devuelve -1 si no lo encuentra
    public int buscarActividad(String nombre)
    {
        for(int i=0; i<actividades.size(); i++)
        {
            if(actividades.get(i).getNombre().equals(nombre))
                return i;
        }
        
        return -1;  //no se encontro
    }
    
    public int cantidadActividades()
    {
        return actividades.size();
    }
            
    
    public void addPatrocinador(Patrocinador p)
    {
        patrocinadores.add(p);
    }
    
    public int buscarPatrocinador(String nombre)
    {
        for(int i=0; i<patrocinadores.size(); i++)
        {
            if(patrocinadores.get(i).getNombre().equals(nombre))
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public int cantidadPatrocinadores()
    {
        return patrocinadores.size();
    }
    
    public Patrocinador getPatrocinador(int n)
    {
        return patrocinadores.get(n);
    }
    
    public void addParticipante(Participante p)
    {
        participantes.add(p);
    }
    
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
    
    public Participante getParticipante(int n)
    {
        return participantes.get(n);
    }
    
    public int cantidadParticipantes()
    {
        return participantes.size();
    }
    
    public int buscarSalon(int codigo)
    {
        for(int i=0; i<salones.size(); i++)
        {
            if(salones.get(i).getCodigo() == codigo)
                return i;
        }
        
        return -1;  //no se encontro
    }
    
    public int cantidadSalones()
    {
        return salones.size();
    }
    
    public Salon getSalon(int n)
    {
        return salones.get(n);
    }
    
    //setters y getters
    public void addSalon(Salon s)
    {
        salones.add(s);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getTipo() {
        return tipo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public Actividad getActividad(int n)
    {
        return actividades.get(n);
    }

    public ArrayList<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    public ArrayList<Salon> getSalonArray() {
        return salones;
    }
    
    
}
