package mx.devcon.scmt.model;

public class TcompaniaDTO {
    private int id;
    private String nombre;
    private String descripcion;
    private String telefono;
    private int estado;

    public TcompaniaDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public TcompaniaDTO(int id, String nombre, String descripcion, String telefono, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.estado = estado;
    }
}
