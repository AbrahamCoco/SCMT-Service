package mx.devcon.scmt.model;

public class Tusuario_pasajeroDTO {
    private int id;
    private int id_pasajero;
    private String fotografia;
    private String telefono;
    private String area;
    private String jefe_inmediato;
    private String turno;
    private int estado;

    public Tusuario_pasajeroDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getJefe_inmediato() {
        return jefe_inmediato;
    }

    public void setJefe_inmediato(String jefe_inmediato) {
        this.jefe_inmediato = jefe_inmediato;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Tusuario_pasajeroDTO(int id, int id_pasajero, String fotografia, String telefono, String area, String jefe_inmediato, String turno, int estado) {
        this.id = id;
        this.id_pasajero = id_pasajero;
        this.fotografia = fotografia;
        this.telefono = telefono;
        this.area = area;
        this.jefe_inmediato = jefe_inmediato;
        this.turno = turno;
        this.estado = estado;
    }
}
