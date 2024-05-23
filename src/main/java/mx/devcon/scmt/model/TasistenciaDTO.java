package mx.devcon.scmt.model;

public class TasistenciaDTO {
    private int id;
    private int truta_id;
    private int tusuario_id;
    private int asistencia;
    private String fecha;
    private String hora;
    private int estado;

    public TasistenciaDTO() {

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

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public TasistenciaDTO(int id, int truta_id, int tusuario_id, int asistencia, String fecha, String hora, int estado) {
        this.id = id;
        this.truta_id = truta_id;
        this.tusuario_id = tusuario_id;
        this.asistencia = asistencia;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }
}
