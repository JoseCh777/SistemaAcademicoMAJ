package org.example;

import java.util.ArrayList;

public class mainTemporal {
     String codigo;
     String nombre;
     String apellido;
     int edad;
     int semestre;

    static ArrayList<Asignatura> lista = new ArrayList<>();

    public static void registrarAsignatura() {

        Scanner sc = new Scanner(System.in);

        if (codigo.isEmpty()) {
            System.out.println("Codigo no valido.");
            return;
        }
        System.out.print("Ingrese codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        lista.add(new Asignatura(codigo, nombre));

        System.out.println("\nAsignatura registrada:");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
    }


    public static void listarAsignaturas() {

        if (listaAsignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
            return;
        }

        for (Asignatura a : listaAsignaturas) {
            System.out.println("Codigo: " + a.getCodigo());
            System.out.println("Nombre: " + a.getNombre());
        }
    }

    public static void buscarAsignatura() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese codigo a buscar: ");
        String codigoBuscado = sc.nextLine();

        for (Asignatura a : listaAsignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codigoBuscado)) {

                System.out.println("Asignatura encontrada:");
                System.out.println("Codigo: " + a.getCodigo());
                System.out.println("Nombre: " + a.getNombre());
                return;
            }
        }

        System.out.println("Asignatura no encontrada.");
    }




}
