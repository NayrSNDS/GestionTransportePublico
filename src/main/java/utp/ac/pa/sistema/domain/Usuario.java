import java.util.Scanner;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String telefono;
    private String tipoUsuario;
    
    public boolean login(String usuario, String contraseña) {
        return usuario != null && contraseña != null && !usuario.isEmpty() && !contraseña.isEmpty();
    }
    
    public void logout() {
        System.out.println("Sesión cerrada");
    }
    
    public String getPerfil() {
        return "ID: " + id + "\nNombre: " + nombre + "\nEmail: " + email + "\nTeléfono: " + telefono + "\nTipo: " + tipoUsuario;
    }
    
    public boolean actualizarDatos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nuevo ID: ");
        this.id = scanner.nextLine();
        
        System.out.print("Nuevo nombre: ");
        this.nombre = scanner.nextLine();
        
        System.out.print("Nuevo email: ");
        this.email = scanner.nextLine();
        
        System.out.print("Nuevo teléfono: ");
        this.telefono = scanner.nextLine();
        
        System.out.print("Nuevo tipo de usuario: ");
        this.tipoUsuario = scanner.nextLine();
        
        return true;
    }
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Usuario: ");
        String user = scanner.nextLine();
        
        System.out.print("Contraseña: ");
        String pass = scanner.nextLine();
        
        if (usuario.login(user, pass)) {
            System.out.println("Login exitoso");
            usuario.actualizarDatos();
            System.out.println("\nPerfil actual:");
            System.out.println(usuario.getPerfil());
            usuario.logout();
        } else {
            System.out.println("Login fallido");
        }
    }
}
