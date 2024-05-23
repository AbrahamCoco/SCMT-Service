package mx.devcon.scmt.model;

public class Truta_usuarioDTO {
    private int id;
    private int truta_id;
    private int tusuario_id;
    private int estado;

    public Truta_usuarioDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTruta_id() {
        return truta_id;
    }

    public void setTruta_id(int truta_id) {
        this.truta_id = truta_id;
    }

    public int getTusuario_id() {
        return tusuario_id;
    }

    public void setTusuario_id(int tusuario_id) {
        this.tusuario_id = tusuario_id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Truta_usuarioDTO(int id, int truta_id, int tusuario_id, int estado) {
        this.id = id;
        this.truta_id = truta_id;
        this.tusuario_id = tusuario_id;
        this.estado = estado;
    }
}
