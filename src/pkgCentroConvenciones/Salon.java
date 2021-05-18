
package pkgCentroConvenciones;

import java.io.Serializable;

public class Salon implements Serializable
{
    private boolean disponibilidad;
    private int capacidadMax;
    private int ocupados;
    private int codigo;
    private String fechaInicio;
    private String fechaFin;
    
    public Salon(int capacidadMax, int codigo, String fechaInicio, String fechaFin)
    {
        this.disponibilidad = true;
        this.ocupados       = 0;
        
        this.capacidadMax   = capacidadMax;
        this.codigo         = codigo;
        this.fechaInicio    = fechaInicio;
        this.fechaFin       = fechaFin;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getOcupados() {
        return ocupados;
    }

    public void setOcupados(int ocupados) {
        this.ocupados = ocupados;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
    
    
}
