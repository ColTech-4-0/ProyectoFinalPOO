
package com.coltech4.gestormantenimiento;


public class Equipos {
    String marca;
    String placa;
    String nombre;
    String funcion;
    String estado;
    String fechaMantenimiento;
    
    public Equipos(String marca,String placa,String nombre, String funcion, String estado, String fechaMantenimiento ){
       this.marca = marca;
       this.placa = placa;
       this.nombre = nombre;
       this.funcion = funcion;
       this.estado = estado;
       this.fechaMantenimiento = "No se ha asignado fecha de mantenimiento";
    }
    
    
}
