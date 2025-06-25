
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;




public class InterfazRegistrarEquipoTrabajo extends javax.swing.JFrame {
       private BaseDeDatos BaseDatos;
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazRegistrarAdministrador.class.getName());

       int xMouse, yMouse;
       
    public InterfazRegistrarEquipoTrabajo() {
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
        NombreLabel = new javax.swing.JLabel();
        DocumentoLabel = new javax.swing.JLabel();
        NicknameLabel = new javax.swing.JLabel();
        CampoCargo = new javax.swing.JLabel();
        ComboCargo = new javax.swing.JComboBox<>();
        CampoNombre = new javax.swing.JTextField();
        CampoDocumento = new javax.swing.JTextField();
        CampoNickname = new javax.swing.JTextField();
        FraseRegistroUno = new javax.swing.JLabel();
        FraseRegistroUno2 = new javax.swing.JLabel();
        FraseRegistroDos = new javax.swing.JLabel();
        FraseRegistroDos1 = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        FondoInterfazREquipoTrabajo = new javax.swing.JLabel();
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

        NombreLabel.setBackground(new java.awt.Color(255, 255, 255));
        NombreLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(3, 155, 215));
        NombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NombreLabel.setText("Nombre");
        jPanel1.add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 110, -1));

        DocumentoLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        DocumentoLabel.setForeground(new java.awt.Color(3, 155, 215));
        DocumentoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DocumentoLabel.setText("Documento");
        jPanel1.add(DocumentoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 160, -1));

        NicknameLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        NicknameLabel.setForeground(new java.awt.Color(3, 155, 215));
        NicknameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NicknameLabel.setText("Nickname");
        jPanel1.add(NicknameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 140, -1));

        CampoCargo.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        CampoCargo.setForeground(new java.awt.Color(3, 155, 215));
        CampoCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CampoCargo.setText("Nickname");
        jPanel1.add(CampoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 140, -1));

        ComboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniero", "Jefe de Enfermería", " " }));
        jPanel1.add(ComboCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 200, 30));

        CampoNombre.setBackground(new java.awt.Color(3, 155, 215));
        CampoNombre.setBorder(null);
        CampoNombre.setPreferredSize(new java.awt.Dimension(108, 38));
        CampoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoNombreKeyTyped(evt);
            }
        });
        jPanel1.add(CampoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 200, 30));

        CampoDocumento.setBackground(new java.awt.Color(3, 155, 215));
        CampoDocumento.setBorder(null);
        CampoDocumento.setPreferredSize(new java.awt.Dimension(108, 38));
        CampoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoDocumentoKeyTyped(evt);
            }
        });
        jPanel1.add(CampoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 200, 30));

        CampoNickname.setBackground(new java.awt.Color(3, 155, 215));
        CampoNickname.setBorder(null);
        CampoNickname.setPreferredSize(new java.awt.Dimension(108, 38));
        jPanel1.add(CampoNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 200, 30));

        FraseRegistroUno.setBackground(new java.awt.Color(255, 255, 255));
        FraseRegistroUno.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 24)); // NOI18N
        FraseRegistroUno.setForeground(new java.awt.Color(3, 155, 215));
        FraseRegistroUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FraseRegistroUno.setText("REGISTRAR EQUIPO DE TRABAJO");
        jPanel1.add(FraseRegistroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 450, 70));

        FraseRegistroUno2.setBackground(new java.awt.Color(255, 255, 255));
        FraseRegistroUno2.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        FraseRegistroUno2.setForeground(new java.awt.Color(225, 162, 118));
        FraseRegistroUno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FraseRegistroUno2.setText(" equipos médicos. ");
        jPanel1.add(FraseRegistroUno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 360, 450, 70));

        FraseRegistroDos.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        FraseRegistroDos.setForeground(new java.awt.Color(225, 162, 118));
        FraseRegistroDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FraseRegistroDos.setText("sistema y añadir a tu equipo de trabajo. ");
        jPanel1.add(FraseRegistroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 400, 460, 80));

        FraseRegistroDos1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        FraseRegistroDos1.setForeground(new java.awt.Color(225, 162, 118));
        FraseRegistroDos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FraseRegistroDos1.setText("Este registro te permitirá configurar el ");
        jPanel1.add(FraseRegistroDos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 360, 460, 80));

        Separador1.setBackground(new java.awt.Color(51, 51, 51));
        Separador1.setForeground(new java.awt.Color(153, 153, 153));
        Separador1.setFont(new java.awt.Font("Roboto SemiBold", 0, 14)); // NOI18N
        Separador1.setInheritsPopupMenu(true);
        Separador1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel1.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 420, 20));

        Separador2.setForeground(new java.awt.Color(225, 162, 118));
        Separador2.setFont(new java.awt.Font("Roboto SemiBold", 0, 14)); // NOI18N
        Separador2.setInheritsPopupMenu(true);
        Separador2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel1.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 360, 420, -1));

        BotonRegistrar.setBackground(new java.awt.Color(225, 162, 118));
        BotonRegistrar.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrar.setText("Registrar");
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
        jPanel1.add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 150, 50));

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
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 150, 50));

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

    private void CampoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNombreKeyTyped
        
        // Este evento se ejecuta cuando el usuario escribe en el campo de nombre.
        // Si el carácter ingresado es un número, se bloquea para que no se escriba.
        if  (Character.isDigit(evt.getKeyChar())== true) {
            
            evt.consume(); // Impide que se ingresen números en el campo de nombre
        }  
    }//GEN-LAST:event_CampoNombreKeyTyped

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
       
        // Cierra solo esta ventana sin finalizar todo el programa
        this.setVisible(false); 
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void CampoDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoDocumentoKeyTyped
        
        // Este evento se activa cada vez que el usuario escribe algo en el campo de texto.
        // Si el carácter ingresado NO es un número, lo bloqueamos con 'evt.consume()'.
        if  (Character.isDigit(evt.getKeyChar())!= true) {
            
            evt.consume(); // Impide que se escriban letras u otros símbolos en este campo
        }
    }//GEN-LAST:event_CampoDocumentoKeyTyped

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed

        // Verifica si alguno de los campos obligatorios está vacío
        if (CampoNombre.getText().equals("")||CampoDocumento.getText().equals("")||CampoNickname.getText().equals("")){
            // Muestra una advertencia si hay campos sin llenar
            JOptionPane.showMessageDialog(
                rootPane,
                "Por favor, complete todos los campos obligatorios.",
                "Campos incompletos",
                JOptionPane.WARNING_MESSAGE
            );
        }else{
            // Si la lista de administradores está vacía, se permite el registro
            if (BaseDatos.administrador.isEmpty()){
                // Se crea un nuevo objeto Administrador con los datos ingresados
                Administrador adm = new Administrador(CampoNombre.getText(), Integer.parseInt(CampoDocumento.getText()), CampoNickname.getText(), "Administrador");

                // Se añade el nuevo administrador a la lista en la base de datos
                this.BaseDatos.administrador.add(adm);

                // Muestra un mensaje informativo indicando que el registro fue exitoso
                JOptionPane.showMessageDialog(
                    rootPane,
                    "Administrador registrado con éxito",
                    "Registro completado",
                    JOptionPane.INFORMATION_MESSAGE // Ícono de información
                );

                // Se muestran los datos registrados del administrador en pantalla
                adm.verDatosAdministrador();
            }else{

                // Si ya hay un administrador registrado, se muestra una advertencia
                JOptionPane.showMessageDialog(
                    rootPane,
                    "Ya existe un administrador registrado", // Mensaje que se muestra
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE // Ícono de advertencia
                );
            }
        }
        // Cierra la ventana actual después del proceso de registro
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegistrarActionPerformed

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
    private javax.swing.JLabel CampoCargo;
    private javax.swing.JTextField CampoDocumento;
    private javax.swing.JTextField CampoNickname;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JComboBox<String> ComboCargo;
    private javax.swing.JLabel DocumentoLabel;
    private javax.swing.JLabel FondoInterfazREquipoTrabajo;
    private javax.swing.JLabel FraseRegistroDos;
    private javax.swing.JLabel FraseRegistroDos1;
    private javax.swing.JLabel FraseRegistroUno;
    private javax.swing.JLabel FraseRegistroUno2;
    private javax.swing.JLabel NicknameLabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
