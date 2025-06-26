package com.coltech4.gestormantenimiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class JefeEnfermeria extends Persona {
    
    public JefeEnfermeria(String nombre, int documento, String nickname, String cargo) {
        super(nombre, documento, nickname, "Jefe de Enfermería");
        
    }

    void VerDatosJefeEnfermeria() {
        String mensaje = "     DATOS DEL JEFE DE INFERMERIA\n"
                   + "Nombre: " + this.nombre + "\n"
                   + "Identificación: " + this.documento + "\n"
                   + "Nickname: " + this.nickname + "\n"
                   + "Cargo: " + this.cargo;
                
        JOptionPane.showMessageDialog(
                   null, // Componente padre (null lo centra en pantalla)
                   mensaje, // Texto a mostrar
                   "Información del Jefe de Enfermeria", // Título del cuadro
                   JOptionPane.INFORMATION_MESSAGE // Ícono de información
               );
    }
    }
    

