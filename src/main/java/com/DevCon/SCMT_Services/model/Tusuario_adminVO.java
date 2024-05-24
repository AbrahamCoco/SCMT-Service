package com.DevCon.SCMT_Services.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tusuario_admin")
public class Tusuario_adminVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id")
    private Integer id;
    private String fotografia;
    private String descripcion;
    private String telefono;
    private Integer estado;

    public Tusuario_adminVO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Tusuario_adminVO(Integer id, String fotografia, String descripcion, String telefono, Integer estado) {
        this.id = id;
        this.fotografia = fotografia;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.estado = estado;
    }
}
