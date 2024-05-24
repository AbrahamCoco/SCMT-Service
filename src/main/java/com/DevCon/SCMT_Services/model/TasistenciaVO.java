package com.DevCon.SCMT_Services.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasistencia")
public class TasistenciaVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "truta_id", referencedColumnName = "id")
    private TrutaVO Truta;
    @ManyToOne
    @JoinColumn(name = "tusuario_id", referencedColumnName = "id")
    private TusuarioVO Tusuario;
    private Integer asistencia;
    private String fecha;
    private String hora;
    private Integer estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TrutaVO getTruta() {
        return Truta;
    }

    public void setTruta(TrutaVO truta) {
        Truta = truta;
    }

    public TusuarioVO getTusuario() {
        return Tusuario;
    }

    public void setTusuario(TusuarioVO tusuario) {
        Tusuario = tusuario;
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
