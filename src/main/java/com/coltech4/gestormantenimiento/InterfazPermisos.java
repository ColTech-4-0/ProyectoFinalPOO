
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;

public class InterfazPermisos extends javax.swing.JFrame {
       private BaseDeDatos BaseDatos;
       private Administrador admin;
       private String estadoActual;
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazOpcionesAdministrador.class.getName());

       int xMouse, yMouse;
   
    public InterfazPermisos() {
        // Inicializa los componentes de la interfaz gráfica
        initComponents();
        TxtEstado.setText((String) PermisoItem.getSelectedItem());
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
        PermisoItem = new javax.swing.JComboBox<>();
        Separator10 = new javax.swing.JSeparator();
        Separator9 = new javax.swing.JSeparator();
        Separator4 = new javax.swing.JSeparator();
        Separator3 = new javax.swing.JSeparator();
        Separator5 = new javax.swing.JSeparator();
        TxtEstado = new javax.swing.JTextField();
        CambiarPermisoTxt = new javax.swing.JLabel();
        PermisoTxt = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JLabel();
        IngreseNmTxt = new javax.swing.JTextField();
        IngreseDocTxt = new javax.swing.JTextField();
        PlacaTxt = new javax.swing.JLabel();
        RegresarBtn = new javax.swing.JButton();
        CambiarBtn = new javax.swing.JButton();
        TxtCambiarPermisos = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        Separator1 = new javax.swing.JSeparator();
        FondoInterfazIngeniero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 661));
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

        PermisoItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PermisoItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Habilitado", "Deshabilitado" }));
        PermisoItem.setToolTipText("");
        PermisoItem.setBorder(null);
        jPanel1.add(PermisoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 130, 30));

        Separator10.setBackground(new java.awt.Color(58, 128, 177));
        Separator10.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 420, 10));

        Separator9.setBackground(new java.awt.Color(58, 128, 177));
        Separator9.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 130, 10));

        Separator4.setBackground(new java.awt.Color(58, 128, 177));
        Separator4.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 180, 10));

        Separator3.setBackground(new java.awt.Color(58, 128, 177));
        Separator3.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 180, 10));

        Separator5.setBackground(new java.awt.Color(58, 128, 177));
        Separator5.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 180, 10));

        TxtEstado.setEditable(false);
        TxtEstado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TxtEstado.setForeground(new java.awt.Color(102, 102, 102));
        TxtEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtEstado.setText("Deshabilitado");
        TxtEstado.setToolTipText("");
        TxtEstado.setBorder(null);
        TxtEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtEstado.setEnabled(false);
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

        CambiarPermisoTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        CambiarPermisoTxt.setText("Cambiar permiso:");
        jPanel1.add(CambiarPermisoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 170, 30));

        PermisoTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        PermisoTxt.setText("Permiso actual:");
        jPanel1.add(PermisoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 130, 30));

        NombreTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        NombreTxt.setText("Nombre:");
        jPanel1.add(NombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 80, 30));

        IngreseNmTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        IngreseNmTxt.setForeground(new java.awt.Color(204, 204, 204));
        IngreseNmTxt.setText("Ingrese el nombre");
        IngreseNmTxt.setToolTipText("");
        IngreseNmTxt.setBorder(null);
        IngreseNmTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IngreseNmTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNmTxtMousePressed(evt);
            }
        });
        IngreseNmTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreseNmTxtActionPerformed(evt);
            }
        });
        IngreseNmTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngreseNmTxtKeyTyped(evt);
            }
        });
        jPanel1.add(IngreseNmTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 180, 30));

        IngreseDocTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        IngreseDocTxt.setForeground(new java.awt.Color(204, 204, 204));
        IngreseDocTxt.setText("Ingrese el documento");
        IngreseDocTxt.setToolTipText("");
        IngreseDocTxt.setBorder(null);
        IngreseDocTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IngreseDocTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseDocTxtMousePressed(evt);
            }
        });
        IngreseDocTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreseDocTxtActionPerformed(evt);
            }
        });
        IngreseDocTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngreseDocTxtKeyTyped(evt);
            }
        });
        jPanel1.add(IngreseDocTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 180, 30));

        PlacaTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        PlacaTxt.setText("Identificación:");
        jPanel1.add(PlacaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 120, 30));

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
        jPanel1.add(RegresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 130, 50));

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
        jPanel1.add(CambiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 100, 30));

        TxtCambiarPermisos.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        TxtCambiarPermisos.setForeground(new java.awt.Color(3, 155, 215));
        TxtCambiarPermisos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtCambiarPermisos.setText("Cambiar Permisos");
        jPanel1.add(TxtCambiarPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 310, 70));

        Separator2.setBackground(new java.awt.Color(58, 128, 177));
        Separator2.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 420, 30));

        Separator1.setBackground(new java.awt.Color(58, 128, 177));
        Separator1.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 310, 10));

        FondoInterfazIngeniero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpciones.jpg"))); // NOI18N
        jPanel1.add(FondoInterfazIngeniero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

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
        String seleccion = (String) PermisoItem.getSelectedItem();
        
        TxtEstado.setText(seleccion);
        
        estadoActual = seleccion;       
        
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

    private void IngreseDocTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreseDocTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngreseDocTxtActionPerformed

    private void IngreseDocTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseDocTxtMousePressed
         if (IngreseDocTxt.getText().equals("Ingrese el documento")) {
            IngreseDocTxt.setText("");
            IngreseDocTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_IngreseDocTxtMousePressed

    private void IngresePlacaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresePlacaTxtMouseClicked

    }//GEN-LAST:event_IngresePlacaTxtMouseClicked

    private void IngreseNmTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNmTxtMousePressed
        if (IngreseNmTxt.getText().equals("Ingrese el nombre")) {
            IngreseNmTxt.setText("");
            IngreseNmTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_IngreseNmTxtMousePressed

    private void IngreseNmTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreseNmTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngreseNmTxtActionPerformed

    private void TxtEstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtEstadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEstadoMousePressed

    private void TxtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEstadoActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_RegresarBtnActionPerformed

    private void IngreseDocTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngreseDocTxtKeyTyped
        if  (Character.isDigit(evt.getKeyChar())!= true) {
            evt.consume();
        }
    }//GEN-LAST:event_IngreseDocTxtKeyTyped

    private void IngreseNmTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngreseNmTxtKeyTyped
        if  (Character.isDigit(evt.getKeyChar())== true) {    
            evt.consume(); 
        }
    }//GEN-LAST:event_IngreseNmTxtKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarBtn;
    private javax.swing.JLabel CambiarPermisoTxt;
    private javax.swing.JLabel FondoInterfazIngeniero;
    private javax.swing.JTextField IngreseDocTxt;
    private javax.swing.JTextField IngreseNmTxt;
    private javax.swing.JLabel NombreTxt;
    private javax.swing.JComboBox<String> PermisoItem;
    private javax.swing.JLabel PermisoTxt;
    private javax.swing.JLabel PlacaTxt;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator10;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JSeparator Separator9;
    private javax.swing.JLabel TxtCambiarPermisos;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
