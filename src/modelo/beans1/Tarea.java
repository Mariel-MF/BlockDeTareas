package modelo.beans1;

/**
 *
 * @author HP OMEN I7
 */
public class Tarea {
    private String nombre;
    private String descripcion;
    private String prioridad;
    private String estado;
    private String comentario;
    private String fechaEn;
    private String fechaIni;

    public Tarea(String nombre, String descripcion, String prioridad, String estado,String fechaEn, String fechaIni) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fechaEn = fechaEn;
        this.fechaIni = fechaIni;
        comentario = null;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public String getFechaEn() {
        return fechaEn;
    }

    public void setFechaEn(String fecha) {
        this.fechaEn = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
}
