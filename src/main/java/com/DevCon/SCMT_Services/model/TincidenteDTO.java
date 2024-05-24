package com.DevCon.SCMT_Services.model;

public class TincidenteDTO {
    private Integer id;
    private Integer truta_id;
    private Integer tusuario_id;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String hora;
    private Integer estado;

    public TincidenteDTO() {

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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public TincidenteDTO(Integer id, Integer truta_id, Integer tusuario_id, String nombre, String descripcion, String fecha, String hora, Integer estado) {
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
