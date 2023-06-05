package org.example;

public class Cliente {
    //ATRIBUTOS(Variables que almacenan datos)
    private String nombre;
    private int edad; //DATO PRIMITIVO
    private String telefono; //DATO EN ENVOLTURA
    private String direccion;
    private Integer comprasAlMes;

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

    //3.METODOS DE ENCAPSULADO (GETTERS Y SETTERS)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //validar que el nombre tenga minimo 4 letras
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>120){
            System.out.println("Un usuario no puede tener esa edad ");
        }else {
            this.edad = edad;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) { // validar que el telefono tenga 10 digitos
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getComprasAlMes() {
        return comprasAlMes;
    }

    public void setComprasAlMes(Integer comprasAlMes) { //validar que no existan compras negativas
        if (comprasAlMes<0){
            System.out.println("No se admiten compras negativas");
        }else {
            this.comprasAlMes = comprasAlMes;
        }
    }

    //METODOS ORDINARIOS
}
