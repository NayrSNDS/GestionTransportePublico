package utp.ac.pa.sistema.domain;

public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String email;
    protected String telefono;
    protected String tipoUsuario;
    
    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    // Métodos abstractos
    public abstract boolean login(String usuario, String contraseña);
    public abstract void logout();
}
