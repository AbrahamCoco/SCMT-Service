package mx.devcon.scmt.model;

public class Tusuario_conductorDTO {
    private int id;
    private int id_empleado;
    private String fotografia;
    private String direccion;
    private String telefono;
    private String id_licencia;
    private int estado;

    public Tusuario_conductorDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId_licencia() {
        return id_licencia;
    }

    public void setId_licencia(String id_licencia) {
        this.id_licencia = id_licencia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Tusuario_conductorDTO(int id, int id_empleado, String fotografia, String direccion, String telefono, String id_licencia, int estado) {
        this.id = id;
        this.id_empleado = id_empleado;
        this.fotografia = fotografia;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_licencia = id_licencia;
        this.estado = estado;
    }
}
