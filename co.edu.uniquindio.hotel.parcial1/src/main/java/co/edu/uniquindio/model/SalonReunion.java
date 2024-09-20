package co.edu.uniquindio.model;

public class SalonReunion {
    private int idSalon;
    private int capacidad;
    private String estado;
    private String descripcion;

    public SalonReunion(int idSalon, int capacidad, String estado, String descripcion) {
        this.idSalon = idSalon;
        this.capacidad = capacidad;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    // Getters
    public int getIdSalon() {
        return idSalon;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }
}