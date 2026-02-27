package org.example;


public class Asignatura {
         String codigo;
         String nombre;
         int credito;
         String docente;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, int credito, String docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.credito = credito;
        this.docente = docente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
    
    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", docente='" + docente + '\'' +
                '}';
    }
}
