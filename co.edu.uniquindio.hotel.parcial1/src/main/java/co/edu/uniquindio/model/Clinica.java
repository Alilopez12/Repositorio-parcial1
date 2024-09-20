package co.edu.uniquindio.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Clinica {
    private String nombre;
    private Collection<Cliente> listaClientes;
    private Collection<Mascota> listaMascotas;
    private Collection<Veterinario> listaVeterinarios;
    private Collection<Consulta> listaConsultas;
    private Collection<Proveedor> listaProveedores;

    public Clinica(String nombre, Collection<Cliente> listaClientes, Collection<Mascota> listaMascotas, Collection<Veterinario> listaVeterinarios, Collection<Consulta> listaConsultas, Collection<Proveedor> listaProveedores) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
        this.listaMascotas = listaMascotas;
        this.listaVeterinarios = listaVeterinarios;
        this.listaConsultas = listaConsultas;
        this.listaProveedores = listaProveedores;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Collection<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(Collection<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public Collection<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    public void setListaVeterinarios(Collection<Veterinario> listaVeterinarios) {
        this.listaVeterinarios = listaVeterinarios;
    }

    public Collection<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(Collection<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

    public Collection<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(Collection<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    //CRUD Mascota
    public boolean crearMascota(String nombre, String idMascota, String raza, LocalDate fechaDeNacimiento, Cliente clienteAsociado, Collection<Consulta> listaConsultas) {

        Mascota newMascota = new Mascota(nombre, idMascota, raza, fechaDeNacimiento, null, null);
        Mascota mascotaExistente = verificarMascota(idMascota);

        if (mascotaExistente == null) {
            newMascota.setIdMascota(idMascota);
            newMascota.setNombre(nombre);
            newMascota.setRaza(raza);
            newMascota.setFechaDeNacimiento(fechaDeNacimiento);
            newMascota.setClienteAsociado(clienteAsociado);
            newMascota.setListaConsultas(listaConsultas);
            listaMascotas.add(newMascota);

            return true;
        }

        return false;
    }

    private Mascota verificarMascota(String idMascota) {
        Mascota mascotaExistente = null;

        for (Mascota mascota: listaMascotas) {
            if (Mascota.getIdMascota().equals(idMascota)) {
                mascotaExistente = mascota;
                break;
            }
        }

        return mascotaExistente;
    }

    public boolean eliminarMascota(String idMascota) {

        for (Mascota mascota: listaMascotas) {
            if (mascota.getIdMascota().equals(idMascota)) {
                listaMascotas.remove(mascota);
                return true;
            }
        }

        return false;
    }

    public boolean modificarMascota(String nombre, String idMascota, String raza, LocalDate fechaDeNacimiento, Cliente clienteAsociado, Collection<Consulta> listaConsultas) {
        for (Mascota mascota : listaMascotas) {
            if (mascota.getIdMascota().equals(idMascota)) {
                mascota.setNombre(nombre);
                return true;
            }
        }
        return false;
    }

    public Mascota getMascota(String idMascota) {
        for (Mascota mascota: listaMascotas) {
            if (mascota.getIdMascota().equals(idMascota)) {
                return mascota;
            }
        }
        return null;
    }

    public Collection<Mascota> getMascotas() {
        return listaMascotas;
    }

    @Override
    public String toString() {
        return "Clinica{" +
                "nombre='" + nombre + '\'' +
                ", listaClientes=" + listaClientes +
                ", listaMascotas=" + listaMascotas +
                ", listaVeterinarios=" + listaVeterinarios +
                ", listaConsultas=" + listaConsultas +
                ", listaProveedores=" + listaProveedores +
                '}';
    }
}