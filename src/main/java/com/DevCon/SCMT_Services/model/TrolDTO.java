package com.DevCon.SCMT_Services.model;

public class TrolDTO {
    private Integer id;
    private String descripcion;
    private Integer estado;

    public TrolDTO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public TrolDTO(Integer id, String descripcion, Integer estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
    }
}
