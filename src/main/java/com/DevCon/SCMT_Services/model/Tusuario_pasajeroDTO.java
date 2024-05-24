package com.DevCon.SCMT_Services.model;

public class Tusuario_pasajeroDTO {
    private Integer id;
    private Integer id_pasajero;
    private String fotografia;
    private String telefono;
    private String area;
    private String jefe_inmediato;
    private String turno;
    private Integer estado;

    public Tusuario_pasajeroDTO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(Integer id_pasajero) {
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Tusuario_pasajeroDTO(Integer id, Integer id_pasajero, String fotografia, String telefono, String area, String jefe_inmediato, String turno, Integer estado) {
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
