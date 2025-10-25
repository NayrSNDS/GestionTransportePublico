package utp.ac.pa.sistema;

import utp.ac.pa.sistema.utils.IOUtils;
import utp.ac.pa.sistema.domain.*;
import utp.ac.pa.sistema.services.AuthenticationService;

public class App {
    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Transporte Público");
        System.out.println("===========================================");
        
        // Inicializar servicios
        AuthenticationService authService = new AuthenticationService();
        IOUtils ioUtils = new IOUtils();
        
        // Ejemplo de uso
        Administrador admin = new Administrador();
        admin.setNombre("Admin Principal");
        
        System.out.println("Sistema iniciado correctamente.");
    }
}
