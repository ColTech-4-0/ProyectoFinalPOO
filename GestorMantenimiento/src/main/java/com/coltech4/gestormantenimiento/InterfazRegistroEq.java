
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;

public class InterfazRegistroEq extends javax.swing.JFrame {
       private BaseDeDatos BaseDatos;
       private Administrador admin;
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazOpcionesAdministrador.class.getName());

       int xMouse, yMouse;
   
    public InterfazRegistroEq() {
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
        Separator8 = new javax.swing.JSeparator();
        FuncionItem = new javax.swing.JComboBox<>();
        EstadoItem = new javax.swing.JComboBox<>();
        Separator9 = new javax.swing.JSeparator();
        Separator4 = new javax.swing.JSeparator();
        Separator3 = new javax.swing.JSeparator();
        Separator5 = new javax.swing.JSeparator();
        NombresItem = new javax.swing.JComboBox<>();
        FuncionTxt = new javax.swing.JLabel();
        EstadoTxt = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JLabel();
        MarcasItem = new javax.swing.JComboBox<>();
        MarcaTxt = new javax.swing.JLabel();
        IngresePlacaTxt = new javax.swing.JTextField();
        PlacaTxt = new javax.swing.JLabel();
        RegistrarBtn = new javax.swing.JButton();
        TxtRegistrarEq = new javax.swing.JLabel();
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

        Separator8.setBackground(new java.awt.Color(58, 128, 177));
        Separator8.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 180, 10));

        FuncionItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        FuncionItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Medición de múltiples parámetros", "Soporte ventilatorio" }));
        FuncionItem.setToolTipText("");
        FuncionItem.setBorder(null);
        jPanel1.add(FuncionItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 180, 30));

        EstadoItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        EstadoItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "En funcionamiento", "Averiado", "Desajustado", "Fuera de servicio", "Dado de baja" }));
        EstadoItem.setToolTipText("");
        EstadoItem.setBorder(null);
        jPanel1.add(EstadoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 180, 30));

        Separator9.setBackground(new java.awt.Color(58, 128, 177));
        Separator9.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 180, 10));

        Separator4.setBackground(new java.awt.Color(58, 128, 177));
        Separator4.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 180, 10));

        Separator3.setBackground(new java.awt.Color(58, 128, 177));
        Separator3.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 180, 10));

        Separator5.setBackground(new java.awt.Color(58, 128, 177));
        Separator5.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 180, 10));

        NombresItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        NombresItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Monitor de signos vitales", "Electrocardiógrafo", "Pulsioxímetro", "Tensiómetro digital", "Glucómetro", "Holter cardíaco", "Monitor fetal", "MAPA", "Capnógrafo", "Central de monitoreo", "Ventilador mecánico", "CPAP / BiPAP", "Resucitador manual", "Concentrador de oxígeno", "Oxímetro de pulso", "Cánula nasal de alto flujo" }));
        NombresItem.setToolTipText("");
        NombresItem.setBorder(null);
        jPanel1.add(NombresItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 180, 30));

        FuncionTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        FuncionTxt.setText("Función:");
        jPanel1.add(FuncionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 80, 30));

        EstadoTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        EstadoTxt.setText("Estado:");
        jPanel1.add(EstadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 80, 30));

        NombreTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        NombreTxt.setText("Nombre:");
        jPanel1.add(NombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 80, 30));

        MarcasItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        MarcasItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Mindray", "Philips", "Welch Allyn", "Schiller", "Masimo", "Nonin", "Omron", "Microlife", "Beurer", "A&D", "Accu-Chek (Roche)", "OneTouch (LifeScan)", "Mortara", "GE", "Edan", "Bionet" }));
        MarcasItem.setToolTipText("");
        MarcasItem.setBorder(null);
        jPanel1.add(MarcasItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 180, 30));

        MarcaTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        MarcaTxt.setText("Marca:");
        jPanel1.add(MarcaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 80, 30));

        IngresePlacaTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        IngresePlacaTxt.setForeground(new java.awt.Color(204, 204, 204));
        IngresePlacaTxt.setText("Ingrese la placa");
        IngresePlacaTxt.setToolTipText("");
        IngresePlacaTxt.setBorder(null);
        IngresePlacaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IngresePlacaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresePlacaTxtMousePressed(evt);
            }
        });
        IngresePlacaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresePlacaTxtActionPerformed(evt);
            }
        });
        jPanel1.add(IngresePlacaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 180, 30));

        PlacaTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        PlacaTxt.setText("Placa:");
        jPanel1.add(PlacaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 80, 30));

        RegistrarBtn.setBackground(new java.awt.Color(3, 155, 215));
        RegistrarBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        RegistrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarBtn.setText("Registrar");
        RegistrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 140, 50));

        TxtRegistrarEq.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        TxtRegistrarEq.setForeground(new java.awt.Color(3, 155, 215));
        TxtRegistrarEq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtRegistrarEq.setText("Registrar Equipo");
        jPanel1.add(TxtRegistrarEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 310, 70));

        Separator2.setBackground(new java.awt.Color(58, 128, 177));
        Separator2.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 420, 30));

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
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarBtnActionPerformed

    private void xExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseEntered
        xExit.setForeground(Color.black);
    }//GEN-LAST:event_xExitMouseEntered

    private void xExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseExited
        xExit.setForeground(Color.white);
    }//GEN-LAST:event_xExitMouseExited

    private void xExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseClicked
        this.setVisible(false);
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

    private void IngresePlacaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresePlacaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresePlacaTxtActionPerformed

    private void IngresePlacaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresePlacaTxtMousePressed
         if (IngresePlacaTxt.getText().equals("Ingrese la placa")) {
            IngresePlacaTxt.setText("");
            IngresePlacaTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_IngresePlacaTxtMousePressed

    private void IngresePlacaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresePlacaTxtMouseClicked

    }//GEN-LAST:event_IngresePlacaTxtMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EstadoItem;
    private javax.swing.JLabel EstadoTxt;
    private javax.swing.JLabel FondoInterfazIngeniero;
    private javax.swing.JComboBox<String> FuncionItem;
    private javax.swing.JLabel FuncionTxt;
    private javax.swing.JTextField IngresePlacaTxt;
    private javax.swing.JLabel MarcaTxt;
    private javax.swing.JComboBox<String> MarcasItem;
    private javax.swing.JLabel NombreTxt;
    private javax.swing.JComboBox<String> NombresItem;
    private javax.swing.JLabel PlacaTxt;
    private javax.swing.JButton RegistrarBtn;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JSeparator Separator8;
    private javax.swing.JSeparator Separator9;
    private javax.swing.JLabel TxtRegistrarEq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
