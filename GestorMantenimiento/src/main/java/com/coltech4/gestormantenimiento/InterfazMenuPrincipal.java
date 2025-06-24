
package com.coltech4.gestormantenimiento;

// Importación de la librería FlatLaf para aplicar un estilo visual moderno (FlatLightLaf)
import com.formdev.flatlaf.FlatLightLaf;

// Importación de UIManager para gestionar el estilo visual (Look and Feel)
import javax.swing.UIManager;

import javax.swing.JOptionPane;


public class InterfazMenuPrincipal extends javax.swing.JFrame {
    BaseDeDatos BaseDatos;
    
  //  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName());

    
    
    public InterfazMenuPrincipal() {
        initComponents();
        // Se crea una instancia de la clase BaseDeDatos para acceder a sus métodos,
        // los cuales permiten la conexión y gestión de datos desde otras interfaces del sistema.
        this.BaseDatos = new BaseDeDatos(); 
    }
    
    public void setBaseDeDatos(BaseDeDatos bd) {
    this.BaseDatos = bd;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonRegistrarAdministrador1 = new javax.swing.JButton();
        BotonOpcionesAdministrador = new javax.swing.JButton();
        BotonOpcionesIngeniero = new javax.swing.JButton();
        BotonOpcionesJefeE = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        FondoMenuPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setLocationByPlatform(true);
        setMaximumSize(getPreferredSize());
        setPreferredSize(new java.awt.Dimension(1022, 667));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setMinimumSize(new java.awt.Dimension(1020, 631));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 635));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegistrarAdministrador1.setBackground(new java.awt.Color(3, 155, 215));
        BotonRegistrarAdministrador1.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonRegistrarAdministrador1.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarAdministrador1.setText("Registrar Administrador");
        BotonRegistrarAdministrador1.setBorder(null);
        BotonRegistrarAdministrador1.setFocusPainted(false);
        BotonRegistrarAdministrador1.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonRegistrarAdministrador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarAdministrador1ActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistrarAdministrador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 300, 50));

        BotonOpcionesAdministrador.setBackground(new java.awt.Color(3, 155, 215));
        BotonOpcionesAdministrador.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonOpcionesAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        BotonOpcionesAdministrador.setText("Opciones Administrador");
        BotonOpcionesAdministrador.setBorder(null);
        BotonOpcionesAdministrador.setFocusPainted(false);
        BotonOpcionesAdministrador.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonOpcionesAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOpcionesAdministradorActionPerformed(evt);
            }
        });
        jPanel1.add(BotonOpcionesAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 300, 50));

        BotonOpcionesIngeniero.setBackground(new java.awt.Color(3, 155, 215));
        BotonOpcionesIngeniero.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonOpcionesIngeniero.setForeground(new java.awt.Color(255, 255, 255));
        BotonOpcionesIngeniero.setText("Opciones Ingenieros");
        BotonOpcionesIngeniero.setBorder(null);
        BotonOpcionesIngeniero.setFocusPainted(false);
        BotonOpcionesIngeniero.setOpaque(true);
        BotonOpcionesIngeniero.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonOpcionesIngeniero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOpcionesIngenieroActionPerformed(evt);
            }
        });
        jPanel1.add(BotonOpcionesIngeniero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 300, 50));

        BotonOpcionesJefeE.setBackground(new java.awt.Color(3, 155, 215));
        BotonOpcionesJefeE.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonOpcionesJefeE.setForeground(new java.awt.Color(255, 255, 255));
        BotonOpcionesJefeE.setText("Opciones Jefe de Efermería");
        BotonOpcionesJefeE.setBorder(null);
        BotonOpcionesJefeE.setFocusPainted(false);
        BotonOpcionesJefeE.setOpaque(true);
        BotonOpcionesJefeE.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel1.add(BotonOpcionesJefeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 300, 50));

        BotonSalir.setBackground(new java.awt.Color(3, 155, 215));
        BotonSalir.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.setBorder(null);
        BotonSalir.setFocusPainted(false);
        BotonSalir.setOpaque(true);
        BotonSalir.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 300, 50));

        FondoMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMenuPrincipal.jpg"))); // NOI18N
        FondoMenuPrincipal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(FondoMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonOpcionesIngenieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOpcionesIngenieroActionPerformed

    }//GEN-LAST:event_BotonOpcionesIngenieroActionPerformed
     
    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
       
        // Muestra un cuadro de confirmación al usuario antes de cerrar la aplicación
        int opcion = JOptionPane.showConfirmDialog(
            rootPane, // Componente raíz de la ventana actual
            "¿Estás seguro de que deseas salir?", // Mensaje que se mostrará
            "Confirmar salida", // Título del cuadro de diálogo
            JOptionPane.YES_NO_OPTION, // Opciones: Sí / No
            JOptionPane.QUESTION_MESSAGE// Ícono de signo de pregunta
            );

        // Si el usuario elige "Sí", se cierra la aplicación
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonRegistrarAdministrador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarAdministrador1ActionPerformed
        
        // Llama al método que registra un nuevo administrador en la base de datos.
        this.BaseDatos.RegistrarAdministrador();
    }//GEN-LAST:event_BotonRegistrarAdministrador1ActionPerformed

    private void BotonOpcionesAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOpcionesAdministradorActionPerformed
        this.BaseDatos.AbrirLoginAdministrador();
    }//GEN-LAST:event_BotonOpcionesAdministradorActionPerformed

    
    
    
    
     /**
     * Clase principal del sistema Gestor de Mantenimiento.
     * 
     * Esta clase configura el estilo visual de la aplicación utilizando FlatLightLaf
     * y lanza la interfaz gráfica principal (InterfazMenuPrincipal).
     * 
     * El método main se encarga de:
     * - Establecer un Look and Feel moderno y consistente para los componentes Swing.
     * - Iniciar la interfaz gráfica en el hilo de despacho de eventos (Event Dispatch Thread),
     *   como recomienda la arquitectura de Swing para evitar errores de concurrencia.
     */ 
    public static void main(String args[]) {
      
        try {
            // Establece FlatLightLaf como el tema visual de la aplicación.
            // Esto mejora la apariencia moderna de los componentes gráficos.
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
             // Si no se puede aplicar el tema, se muestra un mensaje de error por consola.
            System.err.println("No se pudo aplicar FlatLaf.");
        }
        // Ejecuta la interfaz gráfica principal (InterfazMenuPrincipal)
        // en el hilo de despacho de eventos (Event Dispatch Thread), como recomienda Swing.
        //java.awt.EventQueue.invokeLater(() -> {
          //  new InterfazMenuPrincipal().setVisible(true);
        //});
        java.awt.EventQueue.invokeLater(() -> {
        BaseDeDatos bd = new BaseDeDatos(); // 1. Crear una sola instancia
        InterfazMenuPrincipal menu = new InterfazMenuPrincipal(); // 2. Crear el menú
        menu.setBaseDeDatos(bd); // 3. Pasar la instancia de BaseDeDatos
        menu.setVisible(true);
    });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonOpcionesAdministrador;
    private javax.swing.JButton BotonOpcionesIngeniero;
    private javax.swing.JButton BotonOpcionesJefeE;
    private javax.swing.JButton BotonRegistrarAdministrador1;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel FondoMenuPrincipal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
