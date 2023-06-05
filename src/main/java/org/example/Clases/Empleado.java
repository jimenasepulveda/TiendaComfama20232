package org.example.Clases;

public class Empleado {
    //Atributos
    private Integer salario;
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

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        if (salario<0){
            System.out.println("revise porfavor");
        }else {
            this.salario = salario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //METODOS ORDINARIOS
    //Los metodos ordinarios seran funciones que el desarrollador programe para ejecutar la LOGICA DE NEGOCIO

    //calcular el salario de mensual de un empleado
    public Double calcularSalario(Integer salarioBase, Integer deducciones){
        final Double descuentoSalud = 0.04;
        final Double descuentoPencion = 0.04;

        Double descuentoSeguridadSocial = (salarioBase * descuentoSalud * descuentoPencion);
        Double salario = salarioBase-deducciones-descuentoSeguridadSocial;
        return salario;
    }
}
