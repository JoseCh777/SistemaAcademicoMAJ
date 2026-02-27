package org.example;

public class mainTemporal {
     String codigo;
     String nombre;
     String apellido;
     int edad;
     int semestre;

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

        System.out.println("\nAsignatura registrada:");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
    }




}
