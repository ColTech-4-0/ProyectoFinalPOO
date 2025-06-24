package com.coltech4.gestormantenimiento;

import java.util.ArrayList;

public class BaseDeDatos {
    
    ArrayList<Administrador> administrador;
    ArrayList<Ingenieros> ingenieros;
    ArrayList<Equipos> equipos;
    ArrayList<JefeEnfermeria> jefeenfermeria;
    

    public BaseDeDatos(){ 
        
        // Inicializamos las listas para almacenar los datos del sistema
        this.administrador = new ArrayList<Administrador>();
        this.ingenieros = new ArrayList<Ingenieros>();
        this.equipos = new ArrayList<Equipos>();
        this.jefeenfermeria = new ArrayList<JefeEnfermeria>();
          
    }

    public void RegistrarAdministrador(){
                
        // Creamos una nueva ventana para registrar administrador
        InterfazRegistrarAdministrador administrador = new InterfazRegistrarAdministrador();
        
        // Le pasamos esta misma instancia de BaseDeDatos para que pueda usar sus datos
        administrador.setBaseDeDatos(this); 
        
        // Mostramos la nueva interfaz en pantalla
        administrador.setVisible(true);
    }
    
    public void AbrirLoginAdministrador() {
    InterfazLoginAdministrador login = new InterfazLoginAdministrador(); 
    login.setBaseDeDatos(this);
    login.setVisible(true);
    }
    
    public void MostrarOpcionesAdministrador(){
        InterfazOpcionesAdministrador opcion = new InterfazOpcionesAdministrador();
        opcion.setBaseDeDatos(this);
        opcion.setAdministrador(this.administrador.get(0));
        opcion.setVisible(true);

    }
    
    public void MostrarOpcionesIngeniero(){
        InterfazLoginIngeniero opcion = new InterfazLoginIngeniero();
        opcion.setBaseDeDatos(this);
        opcion.setVisible(true);
        
    }
    
}
