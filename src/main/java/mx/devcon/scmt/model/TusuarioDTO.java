package mx.devcon.scmt.model;

public class TusuarioDTO {
    private int id;
    private int tcompania_id;
    private int trol_id;
    private int tusuario_admin_id;
    private int tusuario_conductor_id;
    private int tusuario_pasajero_id;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String usuario;
    private String contraseña;
    private int estado;

    public TusuarioDTO() {

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

    public int getTrol_id() {
        return trol_id;
    }

    public void setTrol_id(int trol_id) {
        this.trol_id = trol_id;
    }

    public int getTusuario_admin_id() {
        return tusuario_admin_id;
    }

    public void setTusuario_admin_id(int tusuario_admin_id) {
        this.tusuario_admin_id = tusuario_admin_id;
    }

    public int getTusuario_conductor_id() {
        return tusuario_conductor_id;
    }

    public void setTusuario_conductor_id(int tusuario_conductor_id) {
        this.tusuario_conductor_id = tusuario_conductor_id;
    }

    public int getTusuario_pasajero_id() {
        return tusuario_pasajero_id;
    }

    public void setTusuario_pasajero_id(int tusuario_pasajero_id) {
        this.tusuario_pasajero_id = tusuario_pasajero_id;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public TusuarioDTO(int id, int tcompania_id, int trol_id, int tusuario_admin_id, int tusuario_conductor_id, int tusuario_pasajero_id, String nombre, String primer_apellido, String segundo_apellido, String usuario, String contraseña, int estado) {
        this.id = id;
        this.tcompania_id = tcompania_id;
        this.trol_id = trol_id;
        this.tusuario_admin_id = tusuario_admin_id;
        this.tusuario_conductor_id = tusuario_conductor_id;
        this.tusuario_pasajero_id = tusuario_pasajero_id;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
    }
}
