package mx.devcon.scmt.model;

public class TrutaDTO {
    private int id;
    private int tcompania_id;
    private int tusuario_id_conductor;
    private String nombre;
    private String descripcion;
    private String punto_acceso;
    private String vehiculo;
    private String qr;
    private int estado;

    public TrutaDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTcompania_id() {
        return tcompania_id;
    }

    public void setTcompania_id(int tcompania_id) {
        this.tcompania_id = tcompania_id;
    }

    public int getTusuario_id_conductor() {
        return tusuario_id_conductor;
    }

    public void setTusuario_id_conductor(int tusuario_id_conductor) {
        this.tusuario_id_conductor = tusuario_id_conductor;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public TrutaDTO(int id, int tcompania_id, int tusuario_id_conductor, String nombre, String descripcion, String punto_acceso, String vehiculo, String qr, int estado) {
        this.id = id;
        this.tcompania_id = tcompania_id;
        this.tusuario_id_conductor = tusuario_id_conductor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.punto_acceso = punto_acceso;
        this.vehiculo = vehiculo;
        this.qr = qr;
        this.estado = estado;
    }
}
