package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Nota> notas = new ArrayList<>();
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



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
            if (a.getCodigo().equals(codigoAsig)) {
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

        Nota nuevaNota = new Nota(estudianteEncontrado, asignaturaEncontrada, valor, periodo);
        notas.add(nuevaNota);

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
}