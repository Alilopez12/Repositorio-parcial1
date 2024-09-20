package co.edu.uniquindio.model;

import java.util.Collection;

public class Veterinario {
    private String nombre;
    private String apellidos;
    private String idVeterinario;
    private String direccion;
    private String telefono;
    private String especialidad;
    private Collection<Consulta> listaConsultas;

    public Veterinario(String nombre, String apellidos, String idVeterinario, String direccion, String telefono, String especialidad, Collection<Consulta> listaConsultas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idVeterinario = idVeterinario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.listaConsultas = listaConsultas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(String idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Collection<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(Collection<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", idVeterinario='" + idVeterinario + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", listaConsultas=" + listaConsultas +
                '}';
    }
}

