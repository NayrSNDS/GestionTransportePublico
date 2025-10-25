package utp.ac.pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private String idRuta;
    private String nombre;
    private String origen;
    private String destino;
    private List<String> paradas;
    private double distanciaKm;
    private int tiempoEstimadoMin;
    private double precioBase;

    public Ruta() {
        this.paradas = new ArrayList<>();
    }

    // Getters y Setters
    public String getIdRuta() { return idRuta; }
    public void setIdRuta(String idRuta) { this.idRuta = idRuta; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public List<String> getParadas() { return paradas; }
    public double getDistanciaKm() { return distanciaKm; }
    public void setDistanciaKm(double distanciaKm) { this.distanciaKm = distanciaKm; }

    public int getTiempoEstimadoMin() { return tiempoEstimadoMin; }
    public void setTiempoEstimadoMin(int tiempoEstimadoMin) { this.tiempoEstimadoMin = tiempoEstimadoMin; }

    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    // Métodos
    public void agregarParada(String parada) {
        paradas.add(parada);
        System.out.println("Parada agregada: " + parada);
    }

    public boolean eliminarParada(String parada) {
        return paradas.remove(parada);
    }

    public int calcularTiempoEstimado() {
        return (int) (distanciaKm * 2) + (paradas.size() * 5);
    }

    public double calcularPrecio() {
        return precioBase + (distanciaKm * 0.1);
    }

    public boolean verificarParada(String parada) {
        return paradas.contains(parada);
    }

    public String obtenerInformacionCompleta() {
        return "Ruta: " + nombre + " | De: " + origen + " a " + destino + 
               " | Distancia: " + distanciaKm + "km | Tiempo: " + tiempoEstimadoMin + "min";
    }
}
