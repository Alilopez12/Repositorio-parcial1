package co.edu.uniquindio.model;
import co.edu.uniquindio.model.builder.ClienteBuilder;

import java.util.Collection;

public class Cliente {

    private String nombre;
    private String idCliente;
    private String apellidos;
    private String direccion;
    private String telefono;
    private Collection<Mascota> listaMascotas;

    public Cliente(String nombre, String idCliente, String apellidos, String direccion, String telefono, Collection<Mascota> listaMascotas) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaMascotas = listaMascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public Collection<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(Collection<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", idCliente='" + idCliente + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listaMascotas=" + listaMascotas +
                '}';
    }
}
