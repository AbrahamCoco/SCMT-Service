package mx.devcon.scmt.model;

public class TincidenteDTO {
    private int id;
    private int truta_id;
    private int tusuario_id;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String hora;
    private int estado;

    public TincidenteDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTruta_id() {
        return truta_id;
    }

    public void setTruta_id(int truta_id) {
        this.truta_id = truta_id;
    }

    public int getTusuario_id() {
        return tusuario_id;
    }

    public void setTusuario_id(int tusuario_id) {
        this.tusuario_id = tusuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public TincidenteDTO(int id, int truta_id, int tusuario_id, String nombre, String descripcion, String fecha, String hora, int estado) {
        this.id = id;
        this.truta_id = truta_id;
        this.tusuario_id = tusuario_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }
}
