package org.example;

public class Estudiante {
      private String codigo;
      private String nombre;
      private String apellido;
      private String edad;      // cambiado de int a String
      private String semestre;  // cambiado de int a String

      public Estudiante() {}

      public Estudiante(String codigo, String nombre, String apellido, String edad, String semestre) {
            this.codigo   = codigo;
            this.nombre   = nombre;
            this.apellido = apellido;
            this.edad     = edad;
            this.semestre = semestre;
      }

      public String getcodigo()              { return codigo; }
      public void   setcodigo(String codigo) { this.codigo = codigo; }

      public String getnombre()              { return nombre; }
      public void   setnombre(String nombre) { this.nombre = nombre; }

      public String getapellido()                { return apellido; }
      public void   setapellido(String apellido) { this.apellido = apellido; }

      public String getedad()            { return edad; }
      public void   setedad(String edad) { this.edad = edad; }   // cambiado de int a String

      public String getsemestre()                { return semestre; }
      public void   setsemestre(String semestre) { this.semestre = semestre; }  // cambiado de int a String

      @Override
      public String toString() {
            return  "Estudiante"+
                    "\nCodigo: "    + codigo   +
                    "\nNombre: "  + nombre   +
                    "\nApellido: "+ apellido +
                    "\nEdad: "    + edad     +
                    "\nSemestre: "+ semestre;
      }
}