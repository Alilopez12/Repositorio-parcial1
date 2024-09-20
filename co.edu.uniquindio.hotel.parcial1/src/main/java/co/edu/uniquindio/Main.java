package co.edu.uniquindio;

import co.edu.uniquindio.factory.ModelFactory;
import co.edu.uniquindio.model.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ModelFactory modelFactory = ModelFactory.getInstance();
        crudCliente(modelFactory);
    }
    public static void crudCliente(ModelFactory modelFactory) {
        crearCliente(modelFactory);
        eliminarCliente(modelFactory);
        obtenerTodosClientes(modelFactory);
        modificarCliente(modelFactory);
    }
    private static void modificarCliente(ModelFactory modelFactory) {
        boolean modificado = modelFactory.modificarCliente("123", "Vanessa");
        System.out.println("El proceso de modificacion del Cliente finalizó con un estado de: " + modificado);
    }
    public static void crearCliente(ModelFactory modelFactory) {
        boolean response = modelFactory.crearCliente("123", "Maria");
        System.out.println("El proceso de eliminacion ha finalizado con un estado de: " + response);
    }
    public static void eliminarCliente(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarCliente("123");
        System.out.println("El proceso de eliminacion ha finalizado con un estado de: " + eliminado);
    }
    public static void obtenerTodosClientes(ModelFactory modelFactory) {
        Collection<Cliente> clientes = modelFactory.getClientes();
        System.out.println("Clientes en el sistema:");
        for (Cliente cliente : clientes) {
            System.out.println("Nombre: " + cliente.getNombre() + ", DNI: " + cliente.getDni());
        }
    }
}