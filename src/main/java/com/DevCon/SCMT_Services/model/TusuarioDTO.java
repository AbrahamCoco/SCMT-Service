package com.DevCon.SCMT_Services.model;

public class TusuarioDTO {
    private Integer id;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String usuario;
    private String contraseña;
    private Integer estado;

    private Integer tcompania_id;
    private String tcompania_nombre;
    private String tcompania_descripcion;
    private String tcompania_telefono;
    private Integer tcompania_estado;

    private Integer trol_id;
    private String trol_descripcion;
    private Integer trol_estado;

    private Integer tusuario_admin_id;
    private String tusuario_admin_fotografia;
    private String tusuario_admin_descripcion;
    private String tusuario_admin_telefono;
    private Integer tusuario_admin_estado;

    private Integer tusuario_conductor_id;
    private Integer tusuario_conductor_id_empleado;
    private String tusuario_conductor_fotografia;
    private String tusuario_conductor_direccion;
    private String tusuario_conductor_telefono;
    private String tusuario_conductor_id_licencia;
    private Integer tusuario_conductor_estado;

    private Integer tusuario_pasajero_id;
    private Integer tusuario_pasajero_id_pasajero;
    private String tusuario_pasajero_fotografia;
    private String tusuario_pasajero_telefono;
    private String tusuario_pasajero_area;
    private String tusuario_pasajero_jefe_inmediato;
    private String tusuario_pasajero_turno;
    private Integer tusuario_pasajero_estado;

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

    public String getTcompania_nombre() {
        return tcompania_nombre;
    }

    public void setTcompania_nombre(String tcompania_nombre) {
        this.tcompania_nombre = tcompania_nombre;
    }

    public String getTcompania_descripcion() {
        return tcompania_descripcion;
    }

    public void setTcompania_descripcion(String tcompania_descripcion) {
        this.tcompania_descripcion = tcompania_descripcion;
    }

    public String getTcompania_telefono() {
        return tcompania_telefono;
    }

    public void setTcompania_telefono(String tcompania_telefono) {
        this.tcompania_telefono = tcompania_telefono;
    }

    public Integer getTcompania_estado() {
        return tcompania_estado;
    }

    public void setTcompania_estado(Integer tcompania_estado) {
        this.tcompania_estado = tcompania_estado;
    }

    public String getTrol_descripcion() {
        return trol_descripcion;
    }

    public void setTrol_descripcion(String trol_descripcion) {
        this.trol_descripcion = trol_descripcion;
    }

    public Integer getTrol_estado() {
        return trol_estado;
    }

    public void setTrol_estado(Integer trol_estado) {
        this.trol_estado = trol_estado;
    }

    public String getTusuario_admin_fotografia() {
        return tusuario_admin_fotografia;
    }

    public void setTusuario_admin_fotografia(String tusuario_admin_fotografia) {
        this.tusuario_admin_fotografia = tusuario_admin_fotografia;
    }

    public String getTusuario_admin_descripcion() {
        return tusuario_admin_descripcion;
    }

    public void setTusuario_admin_descripcion(String tusuario_admin_descripcion) {
        this.tusuario_admin_descripcion = tusuario_admin_descripcion;
    }

    public String getTusuario_admin_telefono() {
        return tusuario_admin_telefono;
    }

    public void setTusuario_admin_telefono(String tusuario_admin_telefono) {
        this.tusuario_admin_telefono = tusuario_admin_telefono;
    }

    public Integer getTusuario_admin_estado() {
        return tusuario_admin_estado;
    }

    public void setTusuario_admin_estado(Integer tusuario_admin_estado) {
        this.tusuario_admin_estado = tusuario_admin_estado;
    }

    public Integer getTusuario_conductor_id_empleado() {
        return tusuario_conductor_id_empleado;
    }

    public void setTusuario_conductor_id_empleado(Integer tusuario_conductor_id_empleado) {
        this.tusuario_conductor_id_empleado = tusuario_conductor_id_empleado;
    }

    public String getTusuario_conductor_fotografia() {
        return tusuario_conductor_fotografia;
    }

    public void setTusuario_conductor_fotografia(String tusuario_conductor_fotografia) {
        this.tusuario_conductor_fotografia = tusuario_conductor_fotografia;
    }

    public String getTusuario_conductor_direccion() {
        return tusuario_conductor_direccion;
    }

    public void setTusuario_conductor_direccion(String tusuario_conductor_direccion) {
        this.tusuario_conductor_direccion = tusuario_conductor_direccion;
    }

    public String getTusuario_conductor_telefono() {
        return tusuario_conductor_telefono;
    }

    public void setTusuario_conductor_telefono(String tusuario_conductor_telefono) {
        this.tusuario_conductor_telefono = tusuario_conductor_telefono;
    }

    public String getTusuario_conductor_id_licencia() {
        return tusuario_conductor_id_licencia;
    }

    public void setTusuario_conductor_id_licencia(String tusuario_conductor_id_licencia) {
        this.tusuario_conductor_id_licencia = tusuario_conductor_id_licencia;
    }

    public Integer getTusuario_conductor_estado() {
        return tusuario_conductor_estado;
    }

    public void setTusuario_conductor_estado(Integer tusuario_conductor_estado) {
        this.tusuario_conductor_estado = tusuario_conductor_estado;
    }

    public Integer getTusuario_pasajero_id_pasajero() {
        return tusuario_pasajero_id_pasajero;
    }

    public void setTusuario_pasajero_id_pasajero(Integer tusuario_pasajero_id_pasajero) {
        this.tusuario_pasajero_id_pasajero = tusuario_pasajero_id_pasajero;
    }

    public String getTusuario_pasajero_fotografia() {
        return tusuario_pasajero_fotografia;
    }

    public void setTusuario_pasajero_fotografia(String tusuario_pasajero_fotografia) {
        this.tusuario_pasajero_fotografia = tusuario_pasajero_fotografia;
    }

    public String getTusuario_pasajero_telefono() {
        return tusuario_pasajero_telefono;
    }

    public void setTusuario_pasajero_telefono(String tusuario_pasajero_telefono) {
        this.tusuario_pasajero_telefono = tusuario_pasajero_telefono;
    }

    public String getTusuario_pasajero_area() {
        return tusuario_pasajero_area;
    }

    public void setTusuario_pasajero_area(String tusuario_pasajero_area) {
        this.tusuario_pasajero_area = tusuario_pasajero_area;
    }

    public String getTusuario_pasajero_jefe_inmediato() {
        return tusuario_pasajero_jefe_inmediato;
    }

    public void setTusuario_pasajero_jefe_inmediato(String tusuario_pasajero_jefe_inmediato) {
        this.tusuario_pasajero_jefe_inmediato = tusuario_pasajero_jefe_inmediato;
    }

    public String getTusuario_pasajero_turno() {
        return tusuario_pasajero_turno;
    }

    public void setTusuario_pasajero_turno(String tusuario_pasajero_turno) {
        this.tusuario_pasajero_turno = tusuario_pasajero_turno;
    }

    public Integer getTusuario_pasajero_estado() {
        return tusuario_pasajero_estado;
    }

    public void setTusuario_pasajero_estado(Integer tusuario_pasajero_estado) {
        this.tusuario_pasajero_estado = tusuario_pasajero_estado;
    }

    public TusuarioDTO(Integer id, String nombre, String primer_apellido, String segundo_apellido, String usuario, String contraseña, Integer estado, Integer tcompania_id, String tcompania_nombre, String tcompania_descripcion, String tcompania_telefono, Integer tcompania_estado, Integer trol_id, String trol_descripcion, Integer trol_estado, Integer tusuario_admin_id, String tusuario_admin_fotografia, String tusuario_admin_descripcion, String tusuario_admin_telefono, Integer tusuario_admin_estado, Integer tusuario_conductor_id, Integer tusuario_conductor_id_empleado, String tusuario_conductor_fotografia, String tusuario_conductor_direccion, String tusuario_conductor_telefono, String tusuario_conductor_id_licencia, Integer tusuario_conductor_estado, Integer tusuario_pasajero_id, Integer tusuario_pasajero_id_pasajero, String tusuario_pasajero_fotografia, String tusuario_pasajero_telefono, String tusuario_pasajero_area, String tusuario_pasajero_jefe_inmediato, String tusuario_pasajero_turno, Integer tusuario_pasajero_estado) {
        this.id = id;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
        this.tcompania_id = tcompania_id;
        this.tcompania_nombre = tcompania_nombre;
        this.tcompania_descripcion = tcompania_descripcion;
        this.tcompania_telefono = tcompania_telefono;
        this.tcompania_estado = tcompania_estado;
        this.trol_id = trol_id;
        this.trol_descripcion = trol_descripcion;
        this.trol_estado = trol_estado;
        this.tusuario_admin_id = tusuario_admin_id;
        this.tusuario_admin_fotografia = tusuario_admin_fotografia;
        this.tusuario_admin_descripcion = tusuario_admin_descripcion;
        this.tusuario_admin_telefono = tusuario_admin_telefono;
        this.tusuario_admin_estado = tusuario_admin_estado;
        this.tusuario_conductor_id = tusuario_conductor_id;
        this.tusuario_conductor_id_empleado = tusuario_conductor_id_empleado;
        this.tusuario_conductor_fotografia = tusuario_conductor_fotografia;
        this.tusuario_conductor_direccion = tusuario_conductor_direccion;
        this.tusuario_conductor_telefono = tusuario_conductor_telefono;
        this.tusuario_conductor_id_licencia = tusuario_conductor_id_licencia;
        this.tusuario_conductor_estado = tusuario_conductor_estado;
        this.tusuario_pasajero_id = tusuario_pasajero_id;
        this.tusuario_pasajero_id_pasajero = tusuario_pasajero_id_pasajero;
        this.tusuario_pasajero_fotografia = tusuario_pasajero_fotografia;
        this.tusuario_pasajero_telefono = tusuario_pasajero_telefono;
        this.tusuario_pasajero_area = tusuario_pasajero_area;
        this.tusuario_pasajero_jefe_inmediato = tusuario_pasajero_jefe_inmediato;
        this.tusuario_pasajero_turno = tusuario_pasajero_turno;
        this.tusuario_pasajero_estado = tusuario_pasajero_estado;
    }
}
