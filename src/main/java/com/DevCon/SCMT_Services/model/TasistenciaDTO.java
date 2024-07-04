package com.DevCon.SCMT_Services.model;

public class TasistenciaDTO {
    private Integer id;
    private Integer truta_id;
    private Integer tusuario_id;
    private Integer asistencia;
    private String fecha;
    private String hora;
    private Integer estado;

    public TasistenciaDTO() {

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

    public TasistenciaDTO(Integer id, Integer truta_id, Integer tusuario_id, Integer asistencia, String fecha, String hora, Integer estado) {
        this.id = id;
        this.truta_id = truta_id;
        this.tusuario_id = tusuario_id;
        this.asistencia = asistencia;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }
}
