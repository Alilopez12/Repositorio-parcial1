package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Mascota;

import java.util.Collection;

public class ClienteBuilder {
    protected String nombre;
    protected String idCliente;
    protected String apellidos;
    protected String direccion;
    protected String telefono;
    protected Collection<Mascota> listaMascotas;

    public Cliente build (){
        return new Cliente(nombre, idCliente, apellidos, direccion, telefono, null);
    }

    public ClienteBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public ClienteBuilder idCliente(String idCliente){
        this.idCliente = idCliente;
        return this;
    }

}
