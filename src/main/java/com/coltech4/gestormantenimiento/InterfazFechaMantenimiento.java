
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;



public class InterfazFechaMantenimiento extends javax.swing.JFrame {
       private BaseDeDatos BaseDatos;
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazRegistrarAdministrador.class.getName());

       int xMouse, yMouse;
       
    public InterfazFechaMantenimiento() {
        // Inicializa los componentes de la interfaz gráfica
        initComponents();
        
    }
    
    public void setBaseDeDatos(BaseDeDatos bd){  
       // Este método nos permite recibir la instancia de BaseDeDatos creada en la interfaz Menu Principal
       // Así no se crea una nueva, sino que se reutiliza la que ya tiene toda la información del sistema
       this.BaseDatos = bd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        xExit = new javax.swing.JLabel();
        FechaInicio1 = new javax.swing.JLabel();
        FechaInicio = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        Separator1 = new javax.swing.JSeparator();
        CampoFechaFin = new com.toedter.calendar.JDateChooser();
        asignarFechaTxt = new javax.swing.JLabel();
        BotonCancelar = new javax.swing.JButton();
        Separator5 = new javax.swing.JSeparator();
        Separator3 = new javax.swing.JSeparator();
        nNombreTxt = new javax.swing.JTextField();
        nPlacaTxt = new javax.swing.JTextField();
        placaTxt = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JLabel();
        TxtEstado = new javax.swing.JTextField();
        Separator4 = new javax.swing.JSeparator();
        CambiarBtn = new javax.swing.JButton();
        FondoInterfazREquipoTrabajo = new javax.swing.JLabel();
        BarraX = new javax.swing.JPanel();

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

        FechaInicio1.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        FechaInicio1.setForeground(new java.awt.Color(3, 155, 215));
        FechaInicio1.setText("Nueva fecha de mantenimiento:");
        jPanel1.add(FechaInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 290, 30));

        FechaInicio.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        FechaInicio.setForeground(new java.awt.Color(3, 155, 215));
        FechaInicio.setText("Fecha de mantenimiento actual:");
        jPanel1.add(FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 290, 30));

        Separator2.setBackground(new java.awt.Color(58, 128, 177));
        Separator2.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 490, 10));

        Separator1.setBackground(new java.awt.Color(58, 128, 177));
        Separator1.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 420, 10));
        jPanel1.add(CampoFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 200, 30));

        asignarFechaTxt.setBackground(new java.awt.Color(255, 255, 255));
        asignarFechaTxt.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 24)); // NOI18N
        asignarFechaTxt.setForeground(new java.awt.Color(3, 155, 215));
        asignarFechaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asignarFechaTxt.setText("Asignar Fecha de Mantenimiento");
        jPanel1.add(asignarFechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 450, 70));

        BotonCancelar.setBackground(new java.awt.Color(3, 155, 215));
        BotonCancelar.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotonCancelar.setText("Cancelar");
        BotonCancelar.setBorder(null);
        BotonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCancelar.setFocusPainted(false);
        BotonCancelar.setOpaque(true);
        BotonCancelar.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 140, 40));

        Separator5.setBackground(new java.awt.Color(58, 128, 177));
        Separator5.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 180, 10));

        Separator3.setBackground(new java.awt.Color(58, 128, 177));
        Separator3.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 180, 10));

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
        jPanel1.add(nNombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 180, 30));

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
        jPanel1.add(nPlacaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 180, 30));

        placaTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        placaTxt.setForeground(new java.awt.Color(3, 155, 215));
        placaTxt.setText("Placa:");
        jPanel1.add(placaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 120, 30));

        nombreTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(3, 155, 215));
        nombreTxt.setText("Nombre:");
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 80, 30));

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
        jPanel1.add(TxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 180, 30));

        Separator4.setBackground(new java.awt.Color(58, 128, 177));
        Separator4.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 180, 10));

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
        jPanel1.add(CambiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 100, 30));

        FondoInterfazREquipoTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpciones.jpg"))); // NOI18N
        jPanel1.add(FondoInterfazREquipoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BarraX.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraXMouseDragged(evt);
            }
        });
        BarraX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraXMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BarraXLayout = new javax.swing.GroupLayout(BarraX);
        BarraX.setLayout(BarraXLayout);
        BarraXLayout.setHorizontalGroup(
            BarraXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BarraXLayout.setVerticalGroup(
            BarraXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(BarraX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

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
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // Cierra solo esta ventana sin finalizar todo el programa
        this.setVisible(false); 
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BarraXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraXMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraXMousePressed

    private void BarraXMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraXMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraXMouseDragged

    private void xExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_xExitMouseClicked

    private void xExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseEntered
        xExit.setForeground(Color.black);
    }//GEN-LAST:event_xExitMouseEntered

    private void xExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseExited
        xExit.setForeground(Color.white);
    }//GEN-LAST:event_xExitMouseExited

    private void nNombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nNombreTxtMousePressed
        if (nNombreTxt.getText().equals("Ingrese el nombre")) {
            nNombreTxt.setText("");
            nNombreTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_nNombreTxtMousePressed

    private void nNombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nNombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nNombreTxtActionPerformed

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

    private void TxtEstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtEstadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEstadoMousePressed

    private void TxtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEstadoActionPerformed

    private void CambiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarBtnActionPerformed

    }//GEN-LAST:event_CambiarBtnActionPerformed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraX;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton CambiarBtn;
    private com.toedter.calendar.JDateChooser CampoFechaFin;
    private javax.swing.JLabel FechaInicio;
    private javax.swing.JLabel FechaInicio1;
    private javax.swing.JLabel FondoInterfazREquipoTrabajo;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JLabel asignarFechaTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nNombreTxt;
    private javax.swing.JTextField nPlacaTxt;
    private javax.swing.JLabel nombreTxt;
    private javax.swing.JLabel placaTxt;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
