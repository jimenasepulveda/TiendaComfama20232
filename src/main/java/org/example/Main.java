package org.example;

import org.example.Clases.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CREAR UN OBJETO ESPECIAL DE JAVA PARA RECIBIR DATOS POR TECLADO
        Scanner entradaPorteclado = new Scanner(System.in);

        // CREAR UN OBJETO DE LA CLASE CLIENTE
        Cliente cliente = new Cliente();

        //PIDIENDOLE EL NOMBRE AL USUARIO:
        System.out.print("Digita tu nombre: ");
        cliente.setNombre(entradaPorteclado.next());
        System.out.println(cliente.getNombre());

        System.out.print("Digita tu edad: ");
        cliente.setEdad(entradaPorteclado.nextInt());
        System.out.println("su edad es: " + cliente.getEdad());
    }
}