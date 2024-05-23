package mx.devcon.scmt.model;

public class Tusuario_adminDTO {
    private int id;
    private String fotografia;
    private String descripcion;
    private String telefono;
    private int estado;

    public Tusuario_adminDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
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

    public Tusuario_adminDTO(int id, String fotografia, String descripcion, String telefono, int estado) {
        this.id = id;
        this.fotografia = fotografia;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.estado = estado;
    }
}
