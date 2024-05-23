package mx.devcon.scmt.model;

import jakarta.persistence.*;

@Entity
@Table(name = "truta_usuario")
public class Truta_usuarioVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "truta_id", referencedColumnName = "id")
    private TrutaVO Truta;
    @ManyToOne
    @JoinColumn(name = "tusuario_id", referencedColumnName = "id")
    private TusuarioVO Tusuario;
    private int estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
