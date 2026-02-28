package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Nota> notas = new ArrayList<>();
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    int opcion = 0;
    int opcion1 = 0;

    public static void main(String[] args) {
        Main sistema = new Main();
        sistema.mostrarMenu();
    }

    // ------------------------------------------- ASIGNATURAS -------------------------------------------

    public static void registrarAsignatura() {
        System.out.print("Ingrese codigo: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        asignaturas.add(new Asignatura(codigo, nombre));
        System.out.println("\nAsignatura registrada:");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
    }

    public static void listarAsignaturas() {
        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
            return;
        }
        for (Asignatura a : asignaturas) {
            System.out.println("Codigo: " + a.getcodigo());
            System.out.println("Nombre: " + a.getnombre());
        }
    }

    public static void buscarAsignatura() {
        System.out.print("Ingrese codigo a buscar: ");
        String codigoBuscado = scanner.nextLine();
        for (Asignatura a : asignaturas) {
            if (a.getcodigo().equalsIgnoreCase(codigoBuscado)) {
                System.out.println("Asignatura encontrada:");
                System.out.println("Codigo: " + a.getcodigo());
                System.out.println("Nombre: " + a.getnombre());
                return;
            }
        }
        System.out.println("Asignatura no encontrada.");
    }

    public static void actualizarAsignatura() {
        System.out.print("Ingrese codigo de la asignatura a actualizar: ");
        String codigoBuscado = scanner.nextLine();
        if (codigoBuscado.isEmpty()) {
            System.out.println("Codigo no valido.");
            return;
        }
        for (Asignatura a : asignaturas) {
            if (a.getcodigo().equalsIgnoreCase(codigoBuscado)) {
                System.out.print("Ingrese nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                a.setnombre(nuevoNombre);
                System.out.println("Asignatura actualizada correctamente.");
                return;
            }
        }
        System.out.println("Asignatura no encontrada.");
    }

    public static void eliminarAsignatura() {
        System.out.print("Ingrese codigo de la asignatura a eliminar: ");
        String codigoBuscado = scanner.nextLine();
        for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i).getcodigo().equalsIgnoreCase(codigoBuscado)) {
                asignaturas.remove(i);
                System.out.println("Asignatura eliminada correctamente.");
                return;
            }
        }
        System.out.println("Asignatura no encontrada.");
    }

    // ------------------------------------------- NOTAS -------------------------------------------

    public static void registrarNota() {
        System.out.println("Ingrese código del estudiante:");
        String codigoEst = scanner.nextLine();

        Estudiante estudianteEncontrado = null;
        for (Estudiante e : estudiantes) {
            if (e.getcodigo().equals(codigoEst)) {
                estudianteEncontrado = e;
                break;
            }
        }
        if (estudianteEncontrado == null) {
            System.out.println("Estudiante no encontrado");
            return;
        }

        System.out.println("Ingrese código de la asignatura:");
        String codigoAsig = scanner.nextLine();

        Asignatura asignaturaEncontrada = null;
        for (Asignatura a : asignaturas) {
            if (a.getcodigo().equals(codigoAsig)) {
                asignaturaEncontrada = a;
                break;
            }
        }
        if (asignaturaEncontrada == null) {
            System.out.println("Asignatura no encontrada");
            return;
        }

        System.out.println("Ingrese valor de la nota:");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese periodo:");
        String periodo = scanner.nextLine();

        notas.add(new Nota(estudianteEncontrado, asignaturaEncontrada, valor, periodo));
        System.out.println("Nota registrada correctamente");
    }

    public static void listarNotas() {
        for (Nota n : notas) {
            System.out.println(n);
        }
    }

    public static void buscarNota() {
        System.out.println("Ingrese código del estudiante:");
        String codigo = scanner.nextLine();
        for (Nota n : notas) {
            if (n.getEstudiante().getcodigo().equals(codigo)) {
                System.out.println(n);
            }
        }
    }

    public static void actualizarNota() {
        System.out.println("Ingrese código del estudiante:");
        String codigo = scanner.nextLine();
        for (Nota n : notas) {
            if (n.getEstudiante().getcodigo().equals(codigo)) {
                System.out.println("Ingrese nuevo valor:");
                double nuevoValor = scanner.nextDouble();
                scanner.nextLine();
                n.setValor(nuevoValor);
                System.out.println("Nota actualizada");
                return;
            }
        }
        System.out.println("Nota no encontrada");
    }

    public static void eliminarNota() {
        System.out.println("Ingrese código del estudiante:");
        String codigo = scanner.nextLine();
        Nota notaEliminar = null;
        for (Nota n : notas) {
            if (n.getEstudiante().getcodigo().equals(codigo)) {
                notaEliminar = n;
                break;
            }
        }
        if (notaEliminar != null) {
            notas.remove(notaEliminar);
            System.out.println("Nota eliminada");
        } else {
            System.out.println("Nota no encontrada");
        }
    }

    // ------------------------------------------- MENU -------------------------------------------

    private void mostrarMenu() {
        do {
            System.out.println("\n---MENU PRINCIPAL---");
            System.out.println("1.GESTION DE ESTUDIANTES");
            System.out.println("2.GESTION DE ASIGNATURAS");
            System.out.println("3.GESTION DE NOTAS");
            System.out.println("0.SALIR");
            System.out.println("Escoge una opcion - ");
            opcion1 = scanner.nextInt();
            scanner.nextLine();

            switch (opcion1) {
                case 1:
                    do {
                        System.out.println("\n---GESTION DE ESTUDIANTE---");
                        System.out.println("1.Agregar   Estudiante");
                        System.out.println("2.Mostrar   Estudiantes");
                        System.out.println("3.Buscar    Estudiante ");
                        System.out.println("4.Modificar Estudiante ");
                        System.out.println("5.Eliminar  Estudiante ");
                        System.out.println("0.Salir");
                        System.out.println("Escoge una opcion - ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcion) {
                            case 1: registrarEstudiante(); break;
                            case 2: listarEstudiantes();   break;
                            case 3: buscarEstudiante();    break;
                            case 4: actualizarEstudiante(); break;
                            case 5: eliminarEstudiante();  break;
                            case 0: break;
                            default: System.out.println("Opcion Invalida");
                        }
                    } while (opcion != 0);
                    break;

                case 2:
                    do {
                        System.out.println("\n---GESTION DE ASIGNATURAS---");
                        System.out.println("1.Agregar   Asignatura");
                        System.out.println("2.Mostrar   Asignatura");
                        System.out.println("3.Buscar    Asignatura ");
                        System.out.println("4.Modificar Asignatura ");
                        System.out.println("5.Eliminar  Asignatura ");
                        System.out.println("0.Salir");
                        System.out.println("Escoge una opcion - ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcion) {
                            case 1: registrarAsignatura(); break;
                            case 2: listarAsignaturas();   break;
                            case 3: buscarAsignatura();    break;
                            case 4: actualizarAsignatura(); break;
                            case 5: eliminarAsignatura();  break;
                            case 0: break;
                            default: System.out.println("Opcion Invalida");
                        }
                    } while (opcion != 0);
                    break;

                case 3:
                    do {
                        System.out.println("\n---GESTION DE NOTAS---");
                        System.out.println("1.Agregar   Notas");
                        System.out.println("2.Mostrar   Notas");
                        System.out.println("3.Buscar    Notas ");
                        System.out.println("4.Modificar Notas ");
                        System.out.println("5.Eliminar  Notas ");
                        System.out.println("0.Salir");
                        System.out.println("Escoge una opcion - ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcion) {
                            case 1: registrarNota(); break;
                            case 2: listarNotas();   break;
                            case 3: buscarNota();    break;
                            case 4: actualizarNota(); break;
                            case 5: eliminarNota();  break;
                            case 0: break;
                            default: System.out.println("Opcion Invalida");
                        }
                    } while (opcion != 0);
                    break;

                case 0: break;
                default: System.out.println("Opcion Invalida");
            }
        } while (opcion1 != 0);
    }

    // ------------------------------------------- ESTUDIANTES -------------------------------------------

    public void registrarEstudiante() {
        System.out.println("\n---AGREGAR ESTUDIANTES---");
        System.out.println("Codigo :");
        String codigo = scanner.nextLine();
        System.out.println("Nombre :");
        String nombre = scanner.nextLine();
        System.out.println("Apellido :");
        String apellido = scanner.nextLine();
        System.out.println("Edad :");
        String edad = scanner.nextLine();
        System.out.println("Semestre");
        String semestre = scanner.nextLine();
        estudiantes.add(new Estudiante(codigo, nombre, apellido, edad, semestre));
        System.out.println("Registro Exitoso\n");
    }

    public void listarEstudiantes() {
        System.out.println("\n---MOSTRAR ESTUDIANTES---");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay Datos\n");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }

    public void buscarEstudiante() {
        System.out.println("\n---BUSCAR ESTUDIANTE POR CODIGO---");
        System.out.print("Ingrese el codigo: ");
        String codigo = scanner.nextLine();
        boolean encontrado = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getcodigo().equals(codigo)) {
                System.out.println(estudiante);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public void actualizarEstudiante() {
        System.out.println("\n---MODIFICAR ESTUDIANTE---");
        System.out.println("Ingrese el codigo del Estudiante");
        String codigo = scanner.nextLine();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getcodigo().equals(codigo)) {
                System.out.println("Ingrese Nueva Nombre   :");
                estudiante.setnombre(scanner.nextLine());
                System.out.println("Ingrese Nuevo Apellido :");
                estudiante.setapellido(scanner.nextLine());
                System.out.println("Ingrese Nuevo Edad : ");
                estudiante.setedad(scanner.nextLine());
                System.out.println("Ingrese Nuevo semestre : ");
                estudiante.setsemestre(scanner.nextLine());
                System.out.println("Modificacion Exitosa");
                return;
            }
        }
        System.out.println("Estudiante no Encontrado\n");
    }

    public void eliminarEstudiante() {
        System.out.println("\n---ELIMINAR ESTUDIANTE---");
        System.out.println("Ingrese el codigo");
        String codigo = scanner.nextLine();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getcodigo().equals(codigo)) {
                estudiantes.remove(estudiante);
                System.out.println("Estudiante Eliminado");
                return;
            }
        }
        System.out.println("Estudiante no Encontrado\n");
    }
}