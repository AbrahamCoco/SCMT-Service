package com.DevCon.SCMT_Services.model;

public class TincidenteDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String hora;
    private Integer estado;

    private Integer truta_id;
    private String truta_nombre;
    private String truta_descripcion;
    private String truta_puntoacceso;
    private String truta_vehiculo;

    private Integer tusuario_id;
    private String tusuario_nombre;
    private String tusuario_primerapellido;
    private String tusuario_segundoapellido;
    private String tusuario_usuario;

    public TincidenteDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getTruta_id() {
        return truta_id;
    }

    public void setTruta_id(Integer truta_id) {
        this.truta_id = truta_id;
    }

    public String getTruta_nombre() {
        return truta_nombre;
    }

    public void setTruta_nombre(String truta_nombre) {
        this.truta_nombre = truta_nombre;
    }

    public String getTruta_descripcion() {
        return truta_descripcion;
    }

    public void setTruta_descripcion(String truta_descripcion) {
        this.truta_descripcion = truta_descripcion;
    }

    public String getTruta_puntoacceso() {
        return truta_puntoacceso;
    }

    public void setTruta_puntoacceso(String truta_puntoacceso) {
        this.truta_puntoacceso = truta_puntoacceso;
    }

    public String getTruta_vehiculo() {
        return truta_vehiculo;
    }

    public void setTruta_vehiculo(String truta_vehiculo) {
        this.truta_vehiculo = truta_vehiculo;
    }

    public Integer getTusuario_id() {
        return tusuario_id;
    }

    public void setTusuario_id(Integer tusuario_id) {
        this.tusuario_id = tusuario_id;
    }

    public String getTusuario_nombre() {
        return tusuario_nombre;
    }

    public void setTusuario_nombre(String tusuario_nombre) {
        this.tusuario_nombre = tusuario_nombre;
    }

    public String getTusuario_primerapellido() {
        return tusuario_primerapellido;
    }

    public void setTusuario_primerapellido(String tusuario_primerapellido) {
        this.tusuario_primerapellido = tusuario_primerapellido;
    }

    public String getTusuario_segundoapellido() {
        return tusuario_segundoapellido;
    }

    public void setTusuario_segundoapellido(String tusuario_segundoapellido) {
        this.tusuario_segundoapellido = tusuario_segundoapellido;
    }

    public String getTusuario_usuario() {
        return tusuario_usuario;
    }

    public void setTusuario_usuario(String tusuario_usuario) {
        this.tusuario_usuario = tusuario_usuario;
    }

    public TincidenteDTO(Integer id, String nombre, String descripcion, String fecha, String hora, Integer estado, Integer truta_id, String truta_nombre, String truta_descripcion, String truta_puntoacceso, String truta_vehiculo, Integer tusuario_id, String tusuario_nombre, String tusuario_primerapellido, String tusuario_segundoapellido, String tusuario_usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.truta_id = truta_id;
        this.truta_nombre = truta_nombre;
        this.truta_descripcion = truta_descripcion;
        this.truta_puntoacceso = truta_puntoacceso;
        this.truta_vehiculo = truta_vehiculo;
        this.tusuario_id = tusuario_id;
        this.tusuario_nombre = tusuario_nombre;
        this.tusuario_primerapellido = tusuario_primerapellido;
        this.tusuario_segundoapellido = tusuario_segundoapellido;
        this.tusuario_usuario = tusuario_usuario;
    }
}
