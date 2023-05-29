package org.example;

import org.example.Clases.Empleado;

public class Main {
    public static void main(String[] args) {
       //DENTRO DEL METODO MAIN ESCRIBO MI PROGRAMA Y CREO LOS OBJETOS
        //CREANDO UNA VARIABLE
        int edad=5;
        System.out.println(edad);

        //CREANDO NUESTRO PRIMER OBJETO UTILIZANDO EL CONSTRUCTOR VACIO
        Cliente objeto = new Cliente();
        //Yo uso un objeto para acceder a los atributos y metodos de la clase POR SEPARADO
        objeto.edad=19;
        System.out.println(objeto.edad);
        objeto.nombre="Jimena Sepulveda Garcia";
        System.out.println(objeto.nombre);

        //CREANDO UN OBJETO UTILIZANDO EL CONSTRUCTOR LLENO
        Cliente objetoDos = new Cliente("Sara", 30, "3107838960", "Clle50",10 );
        System.out.println(objetoDos.edad);
        System.out.println(objetoDos.nombre);

        //CREANDO UN OBJETO DE LA CLASE EMPLEADOS
        Empleado objetoTres= new Empleado();
        System.out.println(objetoTres.nombre);
    }
}