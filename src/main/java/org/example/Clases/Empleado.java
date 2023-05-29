package org.example.Clases;

public class Empleado {
    //Atributos
    public Integer salario;
    private String nombre;

    //Metodos especiales
    //1.Constructor VACIO
    public Empleado() {
    }

    //2.Constructor LLENO

    public Empleado(Integer salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }
}
