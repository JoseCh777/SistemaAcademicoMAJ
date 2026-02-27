import java.util.ArrayList;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

    Scanner scan = new Scanner(System.in);

    ArrayList<String> estudiantes = new ArrayList<>();
    ArrayList<String> asignaturas = new ArrayList<>();
    ArrayList<Double> notas = new ArrayList<>();

    public static void main(String[] args) {
        Main sistema = new Main();   // crear objeto
        sistema.mostrarMenu();       // llamar metodo
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
                                //registrarEstudiante();
                                break;

                            case 2:
                                //listarEstudiantes();
                                break;

                            case 3:
                                //buscarEstudiante();
                                break;

                            case 4:
                                //actualizarEstudiante();
                                break;

                            case 5:
                                //eliminarEstudiante();
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
                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                break;

                            case 4:
                                break;

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

                        switch (opcion) {       //Sub switch 2
                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                break;

                            case 4:
                                break;

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


}
