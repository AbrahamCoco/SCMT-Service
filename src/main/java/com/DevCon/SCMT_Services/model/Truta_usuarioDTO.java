package com.DevCon.SCMT_Services.model;

public class Truta_usuarioDTO {
    private Integer id;
    private Integer truta_id;
    private Integer tusuario_id;
    private Integer estado;

    public Truta_usuarioDTO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTruta_id() {
        return truta_id;
    }

    public void setTruta_id(Integer truta_id) {
        this.truta_id = truta_id;
    }

    public Integer getTusuario_id() {
        return tusuario_id;
    }

    public void setTusuario_id(Integer tusuario_id) {
        this.tusuario_id = tusuario_id;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Truta_usuarioDTO(Integer id, Integer truta_id, Integer tusuario_id, Integer estado) {
        this.id = id;
        this.truta_id = truta_id;
        this.tusuario_id = tusuario_id;
        this.estado = estado;
    }
}
