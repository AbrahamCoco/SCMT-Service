package com.DevCon.SCMT_Services.model;

import javax.persistence.*;

@Entity
@Table(name = "truta")
@NamedQueries({
        @NamedQuery(
                name = "TrutaVO.consultarRutas",
                query = "select c from TrutaVO c where c.Tcompania.id = :tcompania_id and c.estado = 1"
        ),
        @NamedQuery(
                name = "TrutaVO.eliminarRuta",
                query = "update TrutaVO c set c.estado = 0 where c.id = :id"
        )
})
public class TrutaVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "tcompania_id", referencedColumnName = "id")
    private TcompaniaVO Tcompania;
    @ManyToOne
    @JoinColumn(name = "tusuario_id_conductor", referencedColumnName = "id")
    private TusuarioVO Tusuario_conductor;
    private String nombre;
    private String descripcion;
    private String punto_acceso;
    private String vehiculo;
    private String qr;
    private Integer estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TcompaniaVO getTcompania() {
        return Tcompania;
    }

    public void setTcompania(TcompaniaVO tcompania) {
        Tcompania = tcompania;
    }

    public TusuarioVO getTusuario_conductor() {
        return Tusuario_conductor;
    }

    public void setTusuario_conductor(TusuarioVO tusuario_conductor) {
        Tusuario_conductor = tusuario_conductor;
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
}
