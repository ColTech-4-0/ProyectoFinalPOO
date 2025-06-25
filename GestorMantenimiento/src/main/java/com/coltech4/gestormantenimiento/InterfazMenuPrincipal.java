
package com.coltech4.gestormantenimiento;

// Importación de la librería FlatLaf para aplicar un estilo visual moderno (FlatLightLaf)
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;

// Importación de UIManager para gestionar el estilo visual (Look and Feel)
import javax.swing.UIManager;

import javax.swing.JOptionPane;


public class InterfazMenuPrincipal extends javax.swing.JFrame {
    BaseDeDatos BaseDatos;
    
  //  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName());

    int xMouse, yMouse;
    
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
        xExit = new javax.swing.JLabel();
        BotonRegistrarAdministrador1 = new javax.swing.JButton();
        BotonOpcionesAdministrador = new javax.swing.JButton();
        BotonOpcionesIngeniero = new javax.swing.JButton();
        BotonOpcionesJefeE = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        FondoMenuPrincipal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setLocationByPlatform(true);
        setMaximumSize(getPreferredSize());
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 635));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setMinimumSize(new java.awt.Dimension(1020, 631));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 635));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xExit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        xExit.setForeground(new java.awt.Color(255, 255, 255));
        xExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xExit.setText("X");
        xExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        xExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xExitMouseExited(evt);
            }
        });
        jPanel1.add(xExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        BotonRegistrarAdministrador1.setBackground(new java.awt.Color(3, 155, 215));
        BotonRegistrarAdministrador1.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonRegistrarAdministrador1.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarAdministrador1.setText("Registrar Administrador");
        BotonRegistrarAdministrador1.setBorder(null);
        BotonRegistrarAdministrador1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        BotonOpcionesAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        BotonOpcionesIngeniero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        BotonOpcionesJefeE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonOpcionesJefeE.setFocusPainted(false);
        BotonOpcionesJefeE.setOpaque(true);
        BotonOpcionesJefeE.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel1.add(BotonOpcionesJefeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 300, 50));

        BotonSalir.setBackground(new java.awt.Color(3, 155, 215));
        BotonSalir.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.setBorder(null);
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonOpcionesIngenieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOpcionesIngenieroActionPerformed
            this.BaseDatos.MostrarLoginIngeniero();
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

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void xExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseEntered
        xExit.setForeground(Color.black);
    }//GEN-LAST:event_xExitMouseEntered

    private void xExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseExited
        xExit.setForeground(Color.white);
    }//GEN-LAST:event_xExitMouseExited

    private void xExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseClicked
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
    }//GEN-LAST:event_xExitMouseClicked

    
    
    
    
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}