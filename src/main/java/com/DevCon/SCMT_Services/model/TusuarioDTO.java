package com.DevCon.SCMT_Services.model;

public class TusuarioDTO {
    private Integer id;
    private Integer tcompania_id;
    private Integer trol_id;
    private Integer tusuario_admin_id;
    private Integer tusuario_conductor_id;
    private Integer tusuario_pasajero_id;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String usuario;
    private String contraseña;
    private Integer estado;

    public TusuarioDTO() {

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

    public Integer getTrol_id() {
        return trol_id;
    }

    public void setTrol_id(Integer trol_id) {
        this.trol_id = trol_id;
    }

    public Integer getTusuario_admin_id() {
        return tusuario_admin_id;
    }

    public void setTusuario_admin_id(Integer tusuario_admin_id) {
        this.tusuario_admin_id = tusuario_admin_id;
    }

    public Integer getTusuario_conductor_id() {
        return tusuario_conductor_id;
    }

    public void setTusuario_conductor_id(Integer tusuario_conductor_id) {
        this.tusuario_conductor_id = tusuario_conductor_id;
    }

    public Integer getTusuario_pasajero_id() {
        return tusuario_pasajero_id;
    }

    public void setTusuario_pasajero_id(Integer tusuario_pasajero_id) {
        this.tusuario_pasajero_id = tusuario_pasajero_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public TusuarioDTO(Integer id, Integer tcompania_id, Integer trol_id, Integer tusuario_admin_id, Integer tusuario_conductor_id, Integer tusuario_pasajero_id, String nombre, String primer_apellido, String segundo_apellido, String usuario, String contraseña, Integer estado) {
        this.id = id;
        this.tcompania_id = tcompania_id;
        this.trol_id = trol_id;
        this.tusuario_admin_id = tusuario_admin_id;
        this.tusuario_conductor_id = tusuario_conductor_id;
        this.tusuario_pasajero_id = tusuario_pasajero_id;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
    }
}
