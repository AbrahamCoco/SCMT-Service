package com.DevCon.SCMT_Services.model;

import javax.persistence.*;

@Entity
@Table(name = "truta_usuario")
public class Truta_usuarioVO {
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
