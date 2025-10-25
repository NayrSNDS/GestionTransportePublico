package utp.ac.pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario {
    private String documentoIdentidad;
    private List<String> historialRutas;
    private List<String> boletosComprados;
    private double saldo;

    public Pasajero() {
        this.tipoUsuario = "PASAJERO";
        this.historialRutas = new ArrayList<>();
        this.boletosComprados = new ArrayList<>();
    }

    // Getters y Setters
    public String getDocumentoIdentidad() { return documentoIdentidad; }
    public void setDocumentoIdentidad(String documentoIdentidad) { this.documentoIdentidad = documentoIdentidad; }

    public List<String> getHistorialRutas() { return historialRutas; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // Métodos específicos
    public String comprarBoleto(String ruta, double precio) {
        if (saldo >= precio) {
            saldo -= precio;
            String boletoId = "BOL-" + System.currentTimeMillis();
            boletosComprados.add(boletoId);
            historialRutas.add(ruta);
            return boletoId;
        }
        return null;
    }

    public List<String> consultarRutas(String origen, String destino) {
        System.out.println("Consultando rutas de " + origen + " a " + destino);
        return new ArrayList<>();
    }

    public boolean validarBoleto(String boletoId) {
        return boletosComprados.contains(boletoId);
    }

    public void recargarSaldo(double monto) {
        this.saldo += monto;
        System.out.println("Saldo recargado: $" + monto + ". Saldo total: $" + saldo);
    }

    @Override
    public boolean login(String usuario, String contraseña) {
        return usuario.equals(this.email) && contraseña.length() >= 4;
    }

    @Override
    public void logout() {
        System.out.println("Pasajero " + nombre + " ha cerrado sesión.");
    }
}
