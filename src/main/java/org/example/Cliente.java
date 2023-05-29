package org.example;

public class Cliente {
    //ATRIBUTOS(Variables que almacenan datos)
    private String nombre;
    public int edad; //DATO PRIMITIVO
    public String telefono; //DATO EN ENVOLTURA
    public String direccion;
    public Integer comprasAlMes;

    //METODOS ESPECIALES
    //1. constructor VACIO
    public Cliente() {
    }

    //2.constructor LLENO

    public Cliente(String nombre, int edad, String telefono, String direccion, Integer comprasAlMes) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comprasAlMes = comprasAlMes;
    }


    //METODOS ORDINARIOS
}
