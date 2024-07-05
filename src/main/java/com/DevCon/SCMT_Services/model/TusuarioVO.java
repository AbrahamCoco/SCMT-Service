package com.DevCon.SCMT_Services.model;

import javax.persistence.*;

@Entity
@Table(name = "tusuario")
@NamedQueries({
        @NamedQuery(
                name = "TusuarioVO.consultarAll",
                query = "select c from TusuarioVO c where c.Tcompania.id = :tcompania_id and estado = 1"
        ),
        @NamedQuery(
                name = "TusuarioVO.consultarC",
                query = "select c from TusuarioVO c where c.usuario = :usuario and c.contraseña = :contraseña and c.estado = 1"
        ),
})
public class TusuarioVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "tcompania_id", referencedColumnName = "id")
    private TcompaniaVO Tcompania;
    @ManyToOne
    @JoinColumn(name = "trol_id", referencedColumnName = "id")
    private TrolVO Trol;
    @ManyToOne
    @JoinColumn(name = "tusuario_admin_id", referencedColumnName = "id")
    private Tusuario_adminVO Tusuario_admin;
    @ManyToOne
    @JoinColumn(name = "tusuario_conductor_id", referencedColumnName = "id")
    private Tusuario_conductorVO Tusuario_conductor;
    @ManyToOne
    @JoinColumn(name = "tusuario_pasajero_id", referencedColumnName = "id")
    private Tusuario_pasajeroVO Tusuario_pasajero;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String usuario;
    private String contraseña;
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

    public TrolVO getTrol() {
        return Trol;
    }

    public void setTrol(TrolVO trol) {
        Trol = trol;
    }

    public Tusuario_adminVO getTusuario_admin() {
        return Tusuario_admin;
    }

    public void setTusuario_admin(Tusuario_adminVO tusuario_admin) {
        Tusuario_admin = tusuario_admin;
    }

    public Tusuario_conductorVO getTusuario_conductor() {
        return Tusuario_conductor;
    }

    public void setTusuario_conductor(Tusuario_conductorVO tusuario_conductor) {
        Tusuario_conductor = tusuario_conductor;
    }

    public Tusuario_pasajeroVO getTusuario_pasajero() {
        return Tusuario_pasajero;
    }

    public void setTusuario_pasajero(Tusuario_pasajeroVO tusuario_pasajero) {
        Tusuario_pasajero = tusuario_pasajero;
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
}
