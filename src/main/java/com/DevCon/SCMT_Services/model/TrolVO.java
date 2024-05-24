package com.DevCon.SCMT_Services.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trol")
public class TrolVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id")
    private Integer id;
    private String descripcion;
    private Integer estado;

    public TrolVO() {

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

    public TrolVO(Integer id, String descripcion, Integer estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
    }
}
