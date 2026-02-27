package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        static ArrayList<Nota> notas = new ArrayList<>();
        static ArrayList<Estudiante> estudiantes = new ArrayList<>();
        static ArrayList<Asignatura> asignaturas = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);
        public static void registrarNota() {

            System.out.println("Ingrese código del estudiante:");
            String codigoEst = scanner.nextLine();

            Estudiante estudianteEncontrado = null;
            for (Estudiante e : estudiantes) {
                if (e.getCodigo().equals(codigoEst)) {
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
    }
}