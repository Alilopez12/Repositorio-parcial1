package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Consulta;
import co.edu.uniquindio.model.Mascota;

import java.time.LocalDate;
import java.util.Collection;

public class MascotaBuilder {
    protected String nombre;
    protected String idMascota;
    protected String raza;
    protected LocalDate fechaDeNacimiento;
    protected Cliente clienteAsociado;
    protected Collection<Consulta> listaConsultas;

    public Mascota build (){
        return new Mascota(nombre, idMascota, raza, fechaDeNacimiento, null, null);
    }


    public MascotaBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public MascotaBuilder fechaSalida(LocalDate fechaSalida) {
        this.idMascota = idMascota;
        return this;
    }
}
