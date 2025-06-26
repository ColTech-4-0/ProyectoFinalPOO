
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;




public class InterfazOpcionesJefeDeEnfermeria extends javax.swing.JFrame {
    //BaseDeDatos BaseDatos;
    private BaseDeDatos BaseDatos;
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazLoginAdministrador.class.getName());

    int xMouse, yMouse;
   
    public InterfazOpcionesJefeDeEnfermeria () {
        
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
        jSeparator1 = new javax.swing.JSeparator();
        IconoInicioSesion = new javax.swing.JLabel();
        InicioSecionLabel = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        BotonVisualizardatos = new javax.swing.JButton();
        BotonOrdenDeTrabajo = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        FondoInterfazRAdministrador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel1.add(xExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 40, 40));

        jSeparator1.setBackground(new java.awt.Color(58, 128, 177));
        jSeparator1.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 240, 20));

        IconoInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo1.jpg"))); // NOI18N
        jPanel1.add(IconoInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 150, 160));

        InicioSecionLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 24)); // NOI18N
        InicioSecionLabel.setForeground(new java.awt.Color(49, 153, 214));
        InicioSecionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSecionLabel.setText("Opciones Jefe de enfermeria");
        jPanel1.add(InicioSecionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 360, 40));

        frase.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 18)); // NOI18N
        frase.setForeground(new java.awt.Color(49, 153, 214));
        frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frase.setText("Sistema de Gestion de Mantenimiento de Equipos Medicos ");
        jPanel1.add(frase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 540, 50));

        BotonVisualizardatos.setBackground(new java.awt.Color(3, 155, 215));
        BotonVisualizardatos.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonVisualizardatos.setForeground(new java.awt.Color(255, 255, 255));
        BotonVisualizardatos.setText("Visualizar Datos");
        BotonVisualizardatos.setBorder(null);
        BotonVisualizardatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonVisualizardatos.setFocusPainted(false);
        BotonVisualizardatos.setOpaque(true);
        BotonVisualizardatos.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonVisualizardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVisualizardatosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVisualizardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 240, 50));

        BotonOrdenDeTrabajo.setBackground(new java.awt.Color(3, 155, 215));
        BotonOrdenDeTrabajo.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonOrdenDeTrabajo.setForeground(new java.awt.Color(255, 255, 255));
        BotonOrdenDeTrabajo.setText("Crear orden de trabajo");
        BotonOrdenDeTrabajo.setBorder(null);
        BotonOrdenDeTrabajo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonOrdenDeTrabajo.setFocusPainted(false);
        BotonOrdenDeTrabajo.setOpaque(true);
        BotonOrdenDeTrabajo.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonOrdenDeTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOrdenDeTrabajoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonOrdenDeTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 240, 50));

        BotonCancelar.setBackground(new java.awt.Color(3, 155, 215));
        BotonCancelar.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotonCancelar.setText("Cancelar");
        BotonCancelar.setBorder(null);
        BotonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonCancelar.setFocusPainted(false);
        BotonCancelar.setOpaque(true);
        BotonCancelar.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 240, 50));

        FondoInterfazRAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpciones.jpg"))); // NOI18N
        jPanel1.add(FondoInterfazRAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, -1));

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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 40));

        jSeparator2.setBackground(new java.awt.Color(58, 128, 177));
        jSeparator2.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 340, 10));

        jSeparator3.setBackground(new java.awt.Color(58, 128, 177));
        jSeparator3.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 240, 20));

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

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void BotonVisualizardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVisualizardatosActionPerformed
       this.BaseDatos.jefeenfermeria.get(InterfazLoginJefeEnEnfermeria.guardar).VerDatosJefeEnfermeria();
    }//GEN-LAST:event_BotonVisualizardatosActionPerformed

    private void xExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_xExitMouseClicked

    private void xExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseEntered
        xExit.setForeground(Color.black);
    }//GEN-LAST:event_xExitMouseEntered

    private void xExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseExited
        xExit.setForeground(Color.white);
    }//GEN-LAST:event_xExitMouseExited

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void BotonOrdenDeTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOrdenDeTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonOrdenDeTrabajoActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BotonCancelarActionPerformed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonOrdenDeTrabajo;
    private javax.swing.JButton BotonVisualizardatos;
    private javax.swing.JLabel FondoInterfazRAdministrador;
    private javax.swing.JLabel IconoInicioSesion;
    private javax.swing.JLabel InicioSecionLabel;
    private javax.swing.JLabel frase;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
