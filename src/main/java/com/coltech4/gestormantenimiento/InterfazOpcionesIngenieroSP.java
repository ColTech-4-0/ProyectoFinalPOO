
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;




public class InterfazOpcionesIngenieroSP extends javax.swing.JFrame {
    //BaseDeDatos BaseDatos;
    private BaseDeDatos BaseDatos;
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazLoginAdministrador.class.getName());

    int xMouse, yMouse;
   
    public InterfazOpcionesIngenieroSP() {
        
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
        jSeparator2 = new javax.swing.JSeparator();
        IconoInicioSesion = new javax.swing.JLabel();
        InicioSecionLabel = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JButton();
        BotonVisualizarDatos = new javax.swing.JButton();
        FondoInterfazRAdministrador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

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
        jPanel1.add(xExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        jSeparator1.setBackground(new java.awt.Color(58, 128, 177));
        jSeparator1.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 290, 10));

        jSeparator2.setBackground(new java.awt.Color(58, 128, 177));
        jSeparator2.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, 10));

        IconoInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo1.png"))); // NOI18N
        jPanel1.add(IconoInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 200, 200));

        InicioSecionLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 24)); // NOI18N
        InicioSecionLabel.setForeground(new java.awt.Color(49, 153, 214));
        InicioSecionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSecionLabel.setText("Opciones ingeniero");
        jPanel1.add(InicioSecionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 320, 40));

        frase.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 18)); // NOI18N
        frase.setForeground(new java.awt.Color(49, 153, 214));
        frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frase.setText("Sistema de Gestion de Mantenimiento de Equipos Medicos ");
        jPanel1.add(frase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 540, 50));

        BotonRegresar.setBackground(new java.awt.Color(3, 155, 215));
        BotonRegresar.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegresar.setText("Regresar");
        BotonRegresar.setBorder(null);
        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.setFocusPainted(false);
        BotonRegresar.setOpaque(true);
        BotonRegresar.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 240, 50));

        BotonVisualizarDatos.setBackground(new java.awt.Color(3, 155, 215));
        BotonVisualizarDatos.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonVisualizarDatos.setForeground(new java.awt.Color(255, 255, 255));
        BotonVisualizarDatos.setText("Visualizar Datos");
        BotonVisualizarDatos.setBorder(null);
        BotonVisualizarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVisualizarDatos.setFocusPainted(false);
        BotonVisualizarDatos.setOpaque(true);
        BotonVisualizarDatos.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonVisualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVisualizarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVisualizarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 240, 50));

        FondoInterfazRAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpciones.jpg"))); // NOI18N
        jPanel1.add(FondoInterfazRAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarActionPerformed

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

    private void BotonVisualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVisualizarDatosActionPerformed
        this.BaseDatos.ingenieros.get(InterfazLoginIngeniero.guardar).VerDatosIngeniero();
    }//GEN-LAST:event_BotonVisualizarDatosActionPerformed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton BotonVisualizarDatos;
    private javax.swing.JLabel FondoInterfazRAdministrador;
    private javax.swing.JLabel IconoInicioSesion;
    private javax.swing.JLabel InicioSecionLabel;
    private javax.swing.JLabel frase;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
