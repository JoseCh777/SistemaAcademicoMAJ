package org.example;

import java.util.ArrayList;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

    Scanner scan = new Scanner(System.in);

    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    ArrayList<Asignatura> asignaturas = new ArrayList<>();
    ArrayList<Nota> notas = new ArrayList<>();

    public static void main(String[] args) {
        Main sistema = new Main();   // crear objeto
        sistema.mostrarMenu();       // llamar metodo

        String codigo;
        String nombre;
        String apellido;
        int edad;
        int semestre;

        static ArrayList<Asignatura> lista = new ArrayList<>();

        public static void registrarAsignatura() {

            Scanner sc = new Scanner(System.in);

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

        public static void actualizarAsignatura() {

            Scanner sc = new Scanner(System.in);

            if (codigo.isEmpty()) {
                System.out.println("Codigo no valido.");
                return;
            }
            System.out.print("Ingrese codigo de la asignatura a actualizar: ");
            String codigoBuscado = sc.nextLine();

            for (Asignatura a : listaAsignaturas) {

                if (a.getCodigo().equalsIgnoreCase(codigoBuscado)) {

                    System.out.print("Ingrese nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();

                    a.setNombre(nuevoNombre);

                    System.out.println("Asignatura actualizada correctamente.");
                    return;
                }
            }

            System.out.println("Asignatura no encontrada.");
        }

        public static void eliminarAsignatura() {

            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese codigo de la asignatura a eliminar: ");
            String codigoBuscado = sc.nextLine();

            for (int i = 0; i < listaAsignaturas.size(); i++) {

                if (listaAsignaturas.get(i).getCodigo().equalsIgnoreCase(codigoBuscado)) {

                    listaAsignaturas.remove(i);

                    System.out.println("Asignatura eliminada correctamente.");
                    return;
                }
            }

            System.out.println("Asignatura no encontrada.");
        }

    }

    int opcion = 0;
    int opcion1 = 0;

    private void mostrarMenu() {
        do {
            System.out.println("\n---MENU PRINCIPAL---");
            System.out.println("1.GESTION DE ESTUDIANTES");    //MENU PRINCIPAL
            System.out.println("2.GESTION DE ASIGNATURAS");
            System.out.println("3.GESTION DE NOTAS");
            System.out.println("0.SALIR");
            System.out.println("Escoge una opcion - ");
            opcion1 = scan.nextInt();

            switch (opcion1) {  //Switch principal
//-----------------------------------------------------------------------
                //GESTION ESTUDIANTE
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
                        opcion = scan.nextInt();

                        switch (opcion) {    //sub Swtich 1
                            case 1:
                                registrarEstudiante();
                                break;

                            case 2:
                                listarEstudiantes();
                                break;

                            case 3:
                                buscarEstudiante();
                                break;

                            case 4:
                                actualizarEstudiante();
                                break;

                            case 5:
                                eliminarEstudiante();
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opcion Invalida");
                        }
                    } while (opcion != 0);
                    break;
                //-----------------------------------------------------------------------
                //GESTION ASIGNATURA
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
                        opcion = scan.nextInt();

                        switch (opcion) {       //Sub switch 2
                            case 1: //registrarAsignatura()
                                break;

                            case 2: //listarAsignaturas()
                                break;

                            case 3: //buscarAsignatura()
                                break;

                            case 4: //actualizarAsignatura()
                                break;

                            case 5: //eliminarAsignatura()

                            case 0:
                                break;

                            default:
                                System.out.println("Opcion Invalida");
                        }
                    } while (opcion != 0);
                    break;

                //-----------------------------------------------------------------------
                //GESTION NOTAS
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
                        opcion = scan.nextInt();

                        switch (opcion) {       //Sub switch 3
                            case 1: //registrarNota()
                                break;

                            case 2: //listarNotas()
                                break;

                            case 3: //buscarNota()
                                break;

                            case 4: //actualizarNota()
                                break;

                            case 5: //eliminarNota()

                            case 0:
                                break;

                            default:
                                System.out.println("Opcion Invalida");
                        }
                    } while (opcion != 0);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opcion1 != 0);
    }

//-----------------------------------------------------------------------------------------------------------
    public void registrarEstudiante()
    {
        System.out.println("\n---AGREGAR ESTUDIANTES---");
        System.out.println("Codigo :");
        String codigo = scan.nextLine();
        System.out.println("Nombre :");
        String nombre = scan.nextLine();
        System.out.println("Apellido :");
        String apellido = scan.nextLine();
        System.out.println("Edad :");
        String edad = scan.nextLine();
        System.out.println("Semestre");
        String Semestre = scan.nextLine();

        Estudiante estudiante = new Estudiante(codigo, nombre, apellido, edad, Semestre);
        estudiantes.add(estudiante);
        System.out.println("Registro Exitoso\n");
    }
//-----------------------------------------------------------------------------------------------------------

    public void listarEstudiantes() {
        System.out.println("\n---MOSTRAR ESTUDIANTES---");

        if (estudiantes.isEmpty()){
            System.out.println("No hay Datos\n");
        }else
        {
            for (Estudiante estudiante : estudiantes)
            {
                System.out.println(estudiante);
            }
        }
    }
//-----------------------------------------------------------------------------------------------------------

    public void buscarEstudiante() {
        System.out.println("\n---BUSCAR ESTUDIANTE POR CODIGO---");
        System.out.print("Ingrese el codigo: ");
        scan.nextLine();
        String codigo = scan.nextLine();

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
//-----------------------------------------------------------------------------------------------------------

    public void actualizarEstudiante()
    {
        System.out.println("\n---MODIFICAR ESTUDIANTE---");
        System.out.println("Ingrese el codigo del Estudiante");
        scan.nextLine();
        String codigo = scan.nextLine();


        for (Estudiante estudiante : estudiantes)
        {
            if (estudiante.getcodigo().equals(codigo))
            {
                System.out.println("Ingrese Nueva Nombre   :");
                estudiante.setnombre(scan.nextLine());
                System.out.println("Ingrese Nuevo Apellido :");
                estudiante.setapellido(scan.nextLine());
                System.out.println("Ingrese Nuevo Edad : ");
                estudiante.setedad(scan.nextLine());
                System.out.println("Ingrese Nuevo semestre : ");
                estudiante.setsemestre(scan.nextLine());
                System.out.println("Modificacion Exitosa");
                return;
            }
        }
        System.out.println("Estudiante no Encontrado\n");
    }
//-----------------------------------------------------------------------------------------------------------

    public void eliminarEstudiante()
    {
        System.out.println("\n---ELIMINAR ESTUDIANTE---");
        System.out.println("Ingrese el codigo");
        String codigo = scan.nextLine();

        for(Estudiante estudiante : estudiantes)
        {
            if(estudiante.getcodigo().equals(codigo))
            {
                estudiantes.remove(estudiante);
                System.out.println("Estudiante Eliminado");
                return;
            }
        }
        System.out.println("Estudiante no Encontrado\n");
    }
}



