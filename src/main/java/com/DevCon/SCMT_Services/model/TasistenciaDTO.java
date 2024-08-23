package com.DevCon.SCMT_Services.model;

public class TasistenciaDTO {
    private Integer id;

    private Integer truta_id;
    private String truta_nombre;

    private Integer tusuario_id;
    private String tusuario_area;
    private String tusuario_jefeinmediato;
    private String tusuario_nombre;
    private String tusuario_primerapellido;
    private String tusuario_segundoapellido;

    private Integer asistencia;
    private String fecha;
    private String hora;
    private Integer estado;

    public TasistenciaDTO() {

    }

    public TasistenciaDTO(Integer id, Integer truta_id, String truta_nombre, Integer tusuario_id, String tusuario_area, String tusuario_jefeinmediato, String tusuario_nombre, String tusuario_primerapellido, String tusuario_segundoapellido, Integer asistencia, String fecha, String hora, Integer estado) {
        this.id = id;
        this.truta_id = truta_id;
        this.truta_nombre = truta_nombre;
        this.tusuario_id = tusuario_id;
        this.tusuario_area = tusuario_area;
        this.tusuario_jefeinmediato = tusuario_jefeinmediato;
        this.tusuario_nombre = tusuario_nombre;
        this.tusuario_primerapellido = tusuario_primerapellido;
        this.tusuario_segundoapellido = tusuario_segundoapellido;
        this.asistencia = asistencia;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public String getTruta_nombre() {
        return truta_nombre;
    }

    public void setTruta_nombre(String truta_nombre) {
        this.truta_nombre = truta_nombre;
    }

    public String getTusuario_area() {
        return tusuario_area;
    }

    public void setTusuario_area(String tusuario_area) {
        this.tusuario_area = tusuario_area;
    }

    public String getTusuario_jefeinmediato() {
        return tusuario_jefeinmediato;
    }

    public void setTusuario_jefeinmediato(String tusuario_jefeinmediato) {
        this.tusuario_jefeinmediato = tusuario_jefeinmediato;
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

    public Integer getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Integer asistencia) {
        this.asistencia = asistencia;
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


}
