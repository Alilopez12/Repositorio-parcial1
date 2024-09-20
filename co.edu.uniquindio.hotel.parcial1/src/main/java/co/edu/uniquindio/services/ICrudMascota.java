package co.edu.uniquindio.services;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Consulta;
import co.edu.uniquindio.model.Mascota;

import java.time.LocalDate;
import java.util.Collection;

public interface ICrudMascota {

    boolean crearMascota(String nombre, String idMascota, String raza, LocalDate fechaDeNacimiento, Cliente clienteAsociado, Collection<Consulta> listaConsultas);
    Mascota getMascota(String idMascota);
    boolean modificarMascota(String nombre, String idMascota, String raza, LocalDate fechaDeNacimiento, Cliente clienteAsociado, Collection<Consulta> listaConsultas);
    boolean eliminarMascota(String idMascota);
    Collection<Mascota> obtenerTodasMascotas();
    Collection<Mascota> getMascota();
}
