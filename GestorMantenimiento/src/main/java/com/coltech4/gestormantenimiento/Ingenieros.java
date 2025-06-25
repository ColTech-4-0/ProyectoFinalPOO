package com.coltech4.gestormantenimiento;
import javax.swing.JOptionPane;


public class Ingenieros extends Persona {
    String FechaInicio;
    String FechaFin;
    String permiso;

    public Ingenieros(String FechaInicio, String FechaFin, String permiso, String nombre, int documento, String nickname, String cargo) {
        super(nombre, documento, nickname, cargo);
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
    
    public void VerDatosIngeniero() {
        String mensaje = "     DATOS DEL INGENIERO\n"
                   + "Nombre: " + this.nombre + "\n"
                   + "Identificación: " + this.documento + "\n"
                   + "Nickname: " + this.nickname + "\n"
                   + "Cargo: " + this.cargo + "\n"
                   + "Fecha de Inicio de contrato: " + this.FechaInicio + "\n"
                   + "Fecha de Fin de contrato: " + this.FechaFin + "\n"
                   + "Estado de Permiso: " + this.permiso;

        JOptionPane.showMessageDialog(
                   null, // Componente padre (null lo centra en pantalla)
                   mensaje, // Texto a mostrar
                   "Información del Ingeniero", // Título del cuadro
                   JOptionPane.INFORMATION_MESSAGE // Ícono de información
               );
    }
}
