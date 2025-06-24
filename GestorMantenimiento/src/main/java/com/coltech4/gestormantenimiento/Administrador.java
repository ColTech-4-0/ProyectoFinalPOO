package com.coltech4.gestormantenimiento;
import javax.swing.JOptionPane;

public class Administrador extends Persona {
    public Administrador(String nombre, int documento, String nickname, String cargo) {
        super(nombre, documento, nickname, "Administrador");
        
    }
    
    public void verDatosAdministrador() {
    String mensaje = "     DATOS DEL ADMINISTRADOR\n"
                   + "Nombre: " + this.nombre + "\n"
                   + "Identificación: " + this.documento + "\n"
                   + "Nickname: " + this.nickname + "\n"
                   + "Cargo: " + this.cargo;

    JOptionPane.showMessageDialog(
        null, // Componente padre (null lo centra en pantalla)
        mensaje, // Texto a mostrar
        "Información del Administrador", // Título del cuadro
        JOptionPane.INFORMATION_MESSAGE // Ícono de información
    );
}
    
}
