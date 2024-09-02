package com.DevCon.SCMT_Services.model;

public class TrutaDTO {
    private Integer id;
    private Integer tcompania_id;

    private Integer tusuario_id_conductor;
    private String tusuario_nombre_conductor;
    private String tusuario_primerapellido_conductor;
    private String tusuario_segundoapellido_conductor;

    private String nombre;
    private String descripcion;
    private String punto_acceso;
    private String vehiculo;
    private String qr;
    private Integer estado;

    public TrutaDTO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTcompania_id() {
        return tcompania_id;
    }

    public void setTcompania_id(Integer tcompania_id) {
        this.tcompania_id = tcompania_id;
    }

    public Integer getTusuario_id_conductor() {
        return tusuario_id_conductor;
    }

    public void setTusuario_id_conductor(Integer tusuario_id_conductor) {
        this.tusuario_id_conductor = tusuario_id_conductor;
    }

    public String getTusuario_nombre_conductor() {
        return tusuario_nombre_conductor;
    }

    public void setTusuario_nombre_conductor(String tusuario_nombre_conductor) {
        this.tusuario_nombre_conductor = tusuario_nombre_conductor;
    }

    public String getTusuario_primerapellido_conductor() {
        return tusuario_primerapellido_conductor;
    }

    public void setTusuario_primerapellido_conductor(String tusuario_primerapellido_conductor) {
        this.tusuario_primerapellido_conductor = tusuario_primerapellido_conductor;
    }

    public String getTusuario_segundoapellido_conductor() {
        return tusuario_segundoapellido_conductor;
    }

    public void setTusuario_segundoapellido_conductor(String tusuario_segundoapellido_conductor) {
        this.tusuario_segundoapellido_conductor = tusuario_segundoapellido_conductor;
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

    public String getPunto_acceso() {
        return punto_acceso;
    }

    public void setPunto_acceso(String punto_acceso) {
        this.punto_acceso = punto_acceso;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public TrutaDTO(Integer id, Integer tcompania_id, Integer tusuario_id_conductor, String nombre, String descripcion, String punto_acceso, String vehiculo, String qr, Integer estado) {
        this.id = id;
        this.tcompania_id = tcompania_id;
        this.tusuario_id_conductor = tusuario_id_conductor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.punto_acceso = punto_acceso;
        this.vehiculo = vehiculo;
        this.qr = qr;
        this.estado = estado;
    }
}
