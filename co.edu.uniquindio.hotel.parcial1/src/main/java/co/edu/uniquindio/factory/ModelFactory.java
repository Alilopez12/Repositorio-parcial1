package co.edu.uniquindio.factory;
import co.edu.uniquindio.model.*;
import co.edu.uniquindio.services.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ModelFactory implements ICrudMascota {
    private static ModelFactory instance;
    private static Clinica hotel;

    public ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }



    //Implementación de ICrudMascota
    @Override
    public boolean crearMascota(String nombre, String idMascota, String raza, LocalDate fechaDeNacimiento, Cliente clienteAsociado, Collection<Consulta> listaConsultas) {
        return clinica.crearMascota(nombre, idMascota, raza, fechaDeNacimiento,null, null);
    }

    @Override
    public Mascota getMascota(String idMascota) {
        return hotel.getMascota(idMascota);
    }

    @Override
    public boolean modificarMascota(String nombre, String idMascota, String raza, LocalDate fechaDeNacimiento, Cliente clienteAsociado, Collection<Consulta> listaConsultas) {
        return hotel.modificarMascota(nombre, idMascota, raza, fechaDeNacimiento,null, null);
    }

    @Override
    public boolean eliminarMascota(String idMascota) {
        return hotel.eliminarMascota(idMascota);
    }

    @Override
    public Collection<Mascota> obtenerTodasMascotas() {
        return List.of();
    }


}