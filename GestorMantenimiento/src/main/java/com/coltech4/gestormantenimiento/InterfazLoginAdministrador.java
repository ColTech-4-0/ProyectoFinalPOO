
package com.coltech4.gestormantenimiento;
import javax.swing.JOptionPane;




public class InterfazLoginAdministrador extends javax.swing.JFrame {
    //BaseDeDatos BaseDatos;
    private BaseDeDatos BaseDatos;
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazLoginAdministrador.class.getName());

   
    public InterfazLoginAdministrador() {
        
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
        DocumentoLabel = new javax.swing.JLabel();
        NicknameLabel = new javax.swing.JLabel();
        CampoNickname = new javax.swing.JTextField();
        CampoDocumento = new javax.swing.JTextField();
        IconoInicioSesion = new javax.swing.JLabel();
        InicioSecionLabel = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        FondoInterfazRAdministrador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1022, 667));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        BotonCancelar.setFocusPainted(false);
        BotonCancelar.setOpaque(true);
        BotonCancelar.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 110, 40));

        FondoInterfazRAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLoginGeneral.jpg"))); // NOI18N
        jPanel1.add(FondoInterfazRAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    // Validar si hay administradores registrados
    if (BaseDatos.administrador.isEmpty()) {
        JOptionPane.showMessageDialog(
            rootPane,
            "No se ha registrado ningún Administrador.",
            "Advertencia",
            JOptionPane.WARNING_MESSAGE
        );
        return; // ← Salir si no hay administrador
    }

    // Buscar coincidencia
    for (i = 0; i < BaseDatos.administrador.size(); i++) {
        if (BaseDatos.administrador.get(i).documento == Integer.parseInt(CampoDocumento.getText()) &&
            BaseDatos.administrador.get(i).nickname.equals(CampoNickname.getText())) {
            
            // Coincidencia encontrada
            this.BaseDatos.MostrarOpcionesAdministrador();
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

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JTextField CampoDocumento;
    private javax.swing.JTextField CampoNickname;
    private javax.swing.JLabel DocumentoLabel;
    private javax.swing.JLabel FondoInterfazRAdministrador;
    private javax.swing.JLabel IconoInicioSesion;
    private javax.swing.JLabel InicioSecionLabel;
    private javax.swing.JLabel NicknameLabel;
    private javax.swing.JLabel frase;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
