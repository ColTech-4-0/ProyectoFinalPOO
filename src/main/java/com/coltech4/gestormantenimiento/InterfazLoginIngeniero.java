
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;




public class InterfazLoginIngeniero extends javax.swing.JFrame {
    //BaseDeDatos BaseDatos;
    private BaseDeDatos BaseDatos;
    public int indice;
    public static int guardar; // esta variable es para guardar el indice o posicion en la lista de Ingenieros del ingeniero que se acaba de logear
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazLoginAdministrador.class.getName());

    int xMouse, yMouse;
   
    public InterfazLoginIngeniero() {
        
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
        DocumentoLabel = new javax.swing.JLabel();
        NicknameLabel = new javax.swing.JLabel();
        CampoNickname = new javax.swing.JTextField();
        CampoDocumento = new javax.swing.JTextField();
        IconoInicioSesion = new javax.swing.JLabel();
        InicioSecionLabel = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        FondoInterfazLoginIngeniero = new javax.swing.JLabel();
        BarraX = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 635));
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

        DocumentoLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 24)); // NOI18N
        DocumentoLabel.setForeground(new java.awt.Color(255, 255, 255));
        DocumentoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DocumentoLabel.setText("Documento");
        jPanel1.add(DocumentoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 160, -1));

        NicknameLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 24)); // NOI18N
        NicknameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NicknameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NicknameLabel.setText("Nickname");
        jPanel1.add(NicknameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 140, -1));

        CampoNickname.setBorder(null);
        CampoNickname.setPreferredSize(new java.awt.Dimension(108, 38));
        jPanel1.add(CampoNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 140, 40));

        CampoDocumento.setBorder(null);
        CampoDocumento.setPreferredSize(new java.awt.Dimension(108, 38));
        CampoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoDocumentoKeyTyped(evt);
            }
        });
        jPanel1.add(CampoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 140, 40));

        IconoInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoInicioSesion.png"))); // NOI18N
        jPanel1.add(IconoInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 120, 130));

        InicioSecionLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 24)); // NOI18N
        InicioSecionLabel.setForeground(new java.awt.Color(49, 153, 214));
        InicioSecionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSecionLabel.setText("Iniciar Sesión");
        jPanel1.add(InicioSecionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 190, 40));

        frase.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 18)); // NOI18N
        frase.setForeground(new java.awt.Color(49, 153, 214));
        frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frase.setText("Introduzca su documento y nickname");
        jPanel1.add(frase, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 320, 20));

        BotonRegistrar.setBackground(new java.awt.Color(225, 162, 118));
        BotonRegistrar.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrar.setText("Ingresar");
        BotonRegistrar.setBorder(null);
        BotonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistrar.setFocusPainted(false);
        BotonRegistrar.setOpaque(true);
        BotonRegistrar.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 110, 40));

        BotonCancelar.setBackground(new java.awt.Color(225, 162, 118));
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
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 110, 40));

        FondoInterfazLoginIngeniero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLoginGeneral.jpg"))); // NOI18N
        jPanel1.add(FondoInterfazLoginIngeniero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        BarraXLayout.setVerticalGroup(
            BarraXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
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

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        int i;
    
    // Validar campos vacíos
    if (CampoNickname.getText().equals("") || CampoDocumento.getText().equals("")) {
        JOptionPane.showMessageDialog(
            rootPane,
            "Por favor, complete todos los campos obligatorios.",
            "Campos incompletos",
            JOptionPane.WARNING_MESSAGE
        );
        return; // ← Salir si los campos están vacíos
    }

    // Validar si hay ingenieros registrados
    if (BaseDatos.ingenieros.isEmpty()) {
        JOptionPane.showMessageDialog(
            rootPane,
            "No se ha registrado ningún ingeniero.",
            "Advertencia",
            JOptionPane.WARNING_MESSAGE
        );
        return; // ← Salir si no hay administrador
    }

    // Buscar coincidencia
    for (i = 0; i < BaseDatos.ingenieros.size(); i++) {
        if (BaseDatos.ingenieros.get(i).documento == Integer.parseInt(CampoDocumento.getText()) &&
            BaseDatos.ingenieros.get(i).nickname.equals(CampoNickname.getText())) {
            
            indice = i;// se asigna un valor a la variable public
            guardar = i; // se asigna un valor a la varible static 
            
            // Coincidencia encontrada
            if (BaseDatos.ingenieros.get(i).permiso.equals("Deshabilitado")){
                this.BaseDatos.MostrarOpcionesIngenieroSP();
            }else{
                this.BaseDatos.MostrarOpcionesIngeniero();
            }          
            
            this.setVisible(false); // Cerrar esta ventana
            return; // ← Salir del método
        }
    }

    // Si terminó el for sin encontrar coincidencia
    JOptionPane.showMessageDialog(
        null,
        "Credenciales incorrectas. Por favor, verifique su identificación y nickname.",
        "Atención",
        JOptionPane.ERROR_MESSAGE
    );
         
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void CampoDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoDocumentoKeyTyped
        // Este evento se activa cada vez que el usuario escribe algo en el campo de texto.
        // Si el carácter ingresado NO es un número, lo bloqueamos con 'evt.consume()'.
        if  (Character.isDigit(evt.getKeyChar())!= true) {
            evt.consume(); // Impide que se escriban letras u otros símbolos en este campo
        }
    }//GEN-LAST:event_CampoDocumentoKeyTyped

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

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraX;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JTextField CampoDocumento;
    private javax.swing.JTextField CampoNickname;
    private javax.swing.JLabel DocumentoLabel;
    private javax.swing.JLabel FondoInterfazLoginIngeniero;
    private javax.swing.JLabel IconoInicioSesion;
    private javax.swing.JLabel InicioSecionLabel;
    private javax.swing.JLabel NicknameLabel;
    private javax.swing.JLabel frase;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
