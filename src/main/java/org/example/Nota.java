package org.example;

public class Nota {
     Estudiante estudiante;
     Asignatura asignatura;
     Double valor;
     String periodo;

    public Nota() {
    }

    public Nota(Estudiante estudiante, Asignatura asignatura, Double valor, String periodo) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.valor = valor;
        this.periodo = periodo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
}
