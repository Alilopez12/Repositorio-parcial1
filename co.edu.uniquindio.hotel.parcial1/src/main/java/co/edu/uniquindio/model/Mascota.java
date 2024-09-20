package co.edu.uniquindio.model;

import java.time.LocalDate;
import java.util.Collection;

public class Mascota {
    private String nombre;
    private static String idMascota;
    private String raza;
    private LocalDate fechaDeNacimiento;
    private Cliente clienteAsociado;
    private Collection<Consulta> listaConsultas;

    public Mascota(String nombre, String idMascota, String raza, LocalDate fechaDeNacimiento, Cliente clienteAsociado, Collection<Consulta> listaConsultas) {
        this.nombre = nombre;
        this.idMascota = idMascota;
        this.raza = raza;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.clienteAsociado = clienteAsociado;
        this.listaConsultas = listaConsultas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public Collection<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(Collection<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", idMascota='" + idMascota + '\'' +
                ", raza='" + raza + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", clienteAsociado=" + clienteAsociado +
                ", listaConsultas=" + listaConsultas +
                '}';
    }
}
