package com.coltech4.gestormantenimiento;


public class Ingenieros extends Persona {
    String FechaInicio;
    String FechaFin;
    String permiso;

    public Ingenieros(String FechaInicio, String FechaFin, String permiso, String nombre, int identificacion, String nickname, String cargo) {
        super(nombre, identificacion, nickname, cargo);
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.permiso = permiso;
    }
    
    public Ingenieros(){ 
        super("",0, "", "Ingeniero Tecnico");
        FechaInicio = "";
        FechaFin = "";
        permiso = "";
    }
    
}
