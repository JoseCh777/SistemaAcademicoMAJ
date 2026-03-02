package org.example;

public class Asignatura {
    private String codigo;
    private String nombre;

    public Asignatura() {}

    public Asignatura(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getcodigo()           { return codigo; }
    public void   setcodigo(String c)   { this.codigo = c; }

    public String getnombre()           { return nombre; }
    public void   setnombre(String n)   { this.nombre = n; }

    @Override
    public String toString() {
        return  "Asignatura"+
                "\nCodigo: " + codigo + " | Nombre: " + nombre;
    }
}