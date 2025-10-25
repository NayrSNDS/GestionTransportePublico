package utp.ac.pa.sistema.domain;

import java.util.Date;

public class Boleto {
    private String idBoleto;
    private Date fechaEmision;
    private double precio;
    private String asiento;
    private String estado;
    private String rutaAsignada;
    private String pasajero;

    public Boleto() {
        this.fechaEmision = new Date();
        this.estado = "VENDIDO";
    }

    // Getters y Setters
    public String getIdBoleto() { return idBoleto; }
    public void setIdBoleto(String idBoleto) { this.idBoleto = idBoleto; }

    public Date getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(Date fechaEmision) { this.fechaEmision = fechaEmision; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getAsiento() { return asiento; }
    public void setAsiento(String asiento) { this.asiento = asiento; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getRutaAsignada() { return rutaAsignada; }
    public void setRutaAsignada(String rutaAsignada) { this.rutaAsignada = rutaAsignada; }

    public String getPasajero() { return pasajero; }
    public void setPasajero(String pasajero) { this.pasajero = pasajero; }

    // Métodos
    public boolean validar() {
        if ("VENDIDO".equals(estado)) {
            this.estado = "USADO";
            return true;
        }
        return false;
    }

    public void anular() {
        this.estado = "ANULADO";
        System.out.println("Boleto " + idBoleto + " ha sido anulado.");
    }

    public double calcularPrecio(double precioBase) {
        this.precio = precioBase;
        return precio;
    }

    public boolean verificarVigencia() {
        return !"ANULADO".equals(estado) && !"USADO".equals(estado);
    }

    public boolean cambiarAsiento(String nuevoAsiento) {
        if (verificarVigencia()) {
            this.asiento = nuevoAsiento;
            return true;
        }
        return false;
    }

    public String obtenerInformacion() {
        return "Boleto: " + idBoleto + " | Ruta: " + rutaAsignada + 
               " | Asiento: " + asiento + " | Estado: " + estado + " | Precio: $" + precio;
    }
}
