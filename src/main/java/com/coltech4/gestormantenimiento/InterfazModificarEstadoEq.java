
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;

public class InterfazModificarEstadoEq extends javax.swing.JFrame {
       private BaseDeDatos BaseDatos;
       private Administrador admin;
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazOpcionesAdministrador.class.getName());

       int xMouse, yMouse;
   
    public InterfazModificarEstadoEq() {
        // Inicializa los componentes de la interfaz gráfica
        initComponents();
        
    }

    public void setBaseDeDatos(BaseDeDatos bd){  
           this.BaseDatos = bd;
    }
    
    public void setAdministrador(Administrador admin) {
    this.admin = admin;
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        xExit = new javax.swing.JLabel();
        Separator10 = new javax.swing.JSeparator();
        Separator9 = new javax.swing.JSeparator();
        Separator4 = new javax.swing.JSeparator();
        Separator3 = new javax.swing.JSeparator();
        Separator5 = new javax.swing.JSeparator();
        TxtEstado = new javax.swing.JTextField();
        nuevoEstadoTxt = new javax.swing.JLabel();
        estadoActualTxt = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JLabel();
        nNombreTxt = new javax.swing.JTextField();
        placaTxt = new javax.swing.JLabel();
        RegresarBtn = new javax.swing.JButton();
        CambiarBtn = new javax.swing.JButton();
        modificarEstadoTxt = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        nPlacaTxt = new javax.swing.JTextField();
        EstadoItem = new javax.swing.JComboBox<>();
        FondoInterfazIngeniero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 630));
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xExit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        xExit.setForeground(new java.awt.Color(255, 255, 255));
        xExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xExit.setText("X");
        xExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        Separator10.setBackground(new java.awt.Color(58, 128, 177));
        Separator10.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 420, 10));

        Separator9.setBackground(new java.awt.Color(58, 128, 177));
        Separator9.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 180, 10));

        Separator4.setBackground(new java.awt.Color(58, 128, 177));
        Separator4.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 180, 10));

        Separator3.setBackground(new java.awt.Color(58, 128, 177));
        Separator3.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 180, 10));

        Separator5.setBackground(new java.awt.Color(58, 128, 177));
        Separator5.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 180, 10));

        TxtEstado.setBackground(new java.awt.Color(3, 104, 199));
        TxtEstado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TxtEstado.setForeground(new java.awt.Color(243, 243, 243));
        TxtEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtEstado.setText("TEXTO");
        TxtEstado.setToolTipText("");
        TxtEstado.setBorder(null);
        TxtEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtEstadoMousePressed(evt);
            }
        });
        TxtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 180, 30));

        nuevoEstadoTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nuevoEstadoTxt.setForeground(new java.awt.Color(3, 155, 215));
        nuevoEstadoTxt.setText("Nuevo Estado:");
        jPanel1.add(nuevoEstadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 170, 30));

        estadoActualTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        estadoActualTxt.setForeground(new java.awt.Color(3, 155, 215));
        estadoActualTxt.setText("Estado actual:");
        jPanel1.add(estadoActualTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 130, 30));

        nombreTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(3, 155, 215));
        nombreTxt.setText("Nombre:");
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 80, 30));

        nNombreTxt.setBackground(new java.awt.Color(3, 104, 199));
        nNombreTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nNombreTxt.setForeground(new java.awt.Color(243, 243, 243));
        nNombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nNombreTxt.setText("Nombre");
        nNombreTxt.setToolTipText("");
        nNombreTxt.setBorder(null);
        nNombreTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nNombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nNombreTxtMousePressed(evt);
            }
        });
        nNombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nNombreTxtActionPerformed(evt);
            }
        });
        nNombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nNombreTxtKeyTyped(evt);
            }
        });
        jPanel1.add(nNombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 180, 30));

        placaTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        placaTxt.setForeground(new java.awt.Color(3, 155, 215));
        placaTxt.setText("Placa:");
        jPanel1.add(placaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 120, 30));

        RegresarBtn.setBackground(new java.awt.Color(3, 155, 215));
        RegresarBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        RegresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegresarBtn.setText("Regresar");
        RegresarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 130, 50));

        CambiarBtn.setBackground(new java.awt.Color(3, 155, 215));
        CambiarBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        CambiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        CambiarBtn.setText("CAMBIAR");
        CambiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CambiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CambiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 100, 30));

        modificarEstadoTxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        modificarEstadoTxt.setForeground(new java.awt.Color(3, 155, 215));
        modificarEstadoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarEstadoTxt.setText("Modificar Estado de Equipo");
        jPanel1.add(modificarEstadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 330, 70));

        Separator1.setBackground(new java.awt.Color(58, 128, 177));
        Separator1.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 330, 10));

        nPlacaTxt.setBackground(new java.awt.Color(3, 104, 199));
        nPlacaTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nPlacaTxt.setForeground(new java.awt.Color(243, 243, 243));
        nPlacaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nPlacaTxt.setText("Placa");
        nPlacaTxt.setToolTipText("");
        nPlacaTxt.setBorder(null);
        nPlacaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nPlacaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nPlacaTxtMousePressed(evt);
            }
        });
        nPlacaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPlacaTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nPlacaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 180, 30));

        EstadoItem.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        EstadoItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "En funcionamiento", "Averiado", "Desajustado", "Fuera de servicio", "Dado de baja" }));
        EstadoItem.setToolTipText("");
        EstadoItem.setBorder(null);
        jPanel1.add(EstadoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 180, 30));

        FondoInterfazIngeniero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpciones.jpg"))); // NOI18N
        jPanel1.add(FondoInterfazIngeniero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CambiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarBtnActionPerformed
     
        
    }//GEN-LAST:event_CambiarBtnActionPerformed

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

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void IngresePlacaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresePlacaTxtMouseClicked

    }//GEN-LAST:event_IngresePlacaTxtMouseClicked

    private void nNombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nNombreTxtMousePressed
        if (nNombreTxt.getText().equals("Ingrese el nombre")) {
            nNombreTxt.setText("");
            nNombreTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_nNombreTxtMousePressed

    private void nNombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nNombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nNombreTxtActionPerformed

    private void TxtEstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtEstadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEstadoMousePressed

    private void TxtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEstadoActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_RegresarBtnActionPerformed

    private void nNombreTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nNombreTxtKeyTyped
        if  (Character.isDigit(evt.getKeyChar())== true) {    
            evt.consume(); 
        }
    }//GEN-LAST:event_nNombreTxtKeyTyped

    private void nPlacaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nPlacaTxtMousePressed
        if (nPlacaTxt.getText().equals("Ingrese la placa")) {
            nPlacaTxt.setText("");
            nPlacaTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_nPlacaTxtMousePressed

    private void nPlacaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPlacaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPlacaTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarBtn;
    private javax.swing.JComboBox<String> EstadoItem;
    private javax.swing.JLabel FondoInterfazIngeniero;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator10;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JSeparator Separator9;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JLabel estadoActualTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel modificarEstadoTxt;
    private javax.swing.JTextField nNombreTxt;
    private javax.swing.JTextField nPlacaTxt;
    private javax.swing.JLabel nombreTxt;
    private javax.swing.JLabel nuevoEstadoTxt;
    private javax.swing.JLabel placaTxt;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
