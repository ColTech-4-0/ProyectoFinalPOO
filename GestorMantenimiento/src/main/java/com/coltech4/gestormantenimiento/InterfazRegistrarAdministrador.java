
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;




public class InterfazRegistrarAdministrador extends javax.swing.JFrame {
       private BaseDeDatos BaseDatos;
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazRegistrarAdministrador.class.getName());

       int xMouse, yMouse;
       
    public InterfazRegistrarAdministrador() {
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
        Nombre = new javax.swing.JTextField();
        Documento = new javax.swing.JTextField();
        Nickname = new javax.swing.JTextField();
        FraseRegistroUno = new javax.swing.JLabel();
        FraseRegistroUno2 = new javax.swing.JLabel();
        FraseRegistroDos = new javax.swing.JLabel();
        FraseRegistroDos1 = new javax.swing.JLabel();
        IconoRegistro = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        FondoInterfazRAdministrador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

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

        NombreLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 32)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        NombreLabel.setText("Nombre");
        jPanel1.add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 110, -1));

        DocumentoLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 32)); // NOI18N
        DocumentoLabel.setForeground(new java.awt.Color(255, 255, 255));
        DocumentoLabel.setText("Documento");
        jPanel1.add(DocumentoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 160, -1));

        NicknameLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 32)); // NOI18N
        NicknameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NicknameLabel.setText("Nickname");
        jPanel1.add(NicknameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 140, -1));

        Nombre.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        Nombre.setBorder(null);
        Nombre.setPreferredSize(new java.awt.Dimension(108, 38));
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 200, 30));

        Documento.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        Documento.setBorder(null);
        Documento.setPreferredSize(new java.awt.Dimension(108, 38));
        Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DocumentoKeyTyped(evt);
            }
        });
        jPanel1.add(Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 200, 30));

        Nickname.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        Nickname.setBorder(null);
        Nickname.setPreferredSize(new java.awt.Dimension(108, 38));
        jPanel1.add(Nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 200, 30));

        FraseRegistroUno.setBackground(new java.awt.Color(255, 255, 255));
        FraseRegistroUno.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        FraseRegistroUno.setForeground(new java.awt.Color(225, 162, 118));
        FraseRegistroUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FraseRegistroUno.setText("Inicia la gestión centralizada de tus");
        jPanel1.add(FraseRegistroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 450, 70));

        FraseRegistroUno2.setBackground(new java.awt.Color(255, 255, 255));
        FraseRegistroUno2.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 18)); // NOI18N
        FraseRegistroUno2.setForeground(new java.awt.Color(225, 162, 118));
        FraseRegistroUno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FraseRegistroUno2.setText(" equipos médicos. ");
        jPanel1.add(FraseRegistroUno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 450, 70));

        FraseRegistroDos.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        FraseRegistroDos.setForeground(new java.awt.Color(225, 162, 118));
        FraseRegistroDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FraseRegistroDos.setText("sistema y añadir a tu equipo de trabajo. ");
        jPanel1.add(FraseRegistroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 460, 80));

        FraseRegistroDos1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        FraseRegistroDos1.setForeground(new java.awt.Color(225, 162, 118));
        FraseRegistroDos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FraseRegistroDos1.setText("Este registro te permitirá configurar el ");
        jPanel1.add(FraseRegistroDos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 460, 80));

        IconoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Registro.png"))); // NOI18N
        jPanel1.add(IconoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 110, -1));

        Separador1.setForeground(new java.awt.Color(225, 162, 118));
        Separador1.setFont(new java.awt.Font("Roboto SemiBold", 0, 14)); // NOI18N
        Separador1.setInheritsPopupMenu(true);
        Separador1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel1.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 420, 20));

        Separador2.setForeground(new java.awt.Color(225, 162, 118));
        Separador2.setFont(new java.awt.Font("Roboto SemiBold", 0, 14)); // NOI18N
        Separador2.setInheritsPopupMenu(true);
        Separador2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel1.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 420, -1));

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

        FondoInterfazRAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistrarAdministrador.jpg"))); // NOI18N
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
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

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

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        
        // Este evento se ejecuta cuando el usuario escribe en el campo de nombre.
        // Si el carácter ingresado es un número, se bloquea para que no se escriba.
        if  (Character.isDigit(evt.getKeyChar())== true) {
            
            evt.consume(); // Impide que se ingresen números en el campo de nombre
        }  
    }//GEN-LAST:event_NombreKeyTyped

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
       
        // Cierra solo esta ventana sin finalizar todo el programa
        this.setVisible(false); 
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void DocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DocumentoKeyTyped
        
        // Este evento se activa cada vez que el usuario escribe algo en el campo de texto.
        // Si el carácter ingresado NO es un número, lo bloqueamos con 'evt.consume()'.
        if  (Character.isDigit(evt.getKeyChar())!= true) {
            
            evt.consume(); // Impide que se escriban letras u otros símbolos en este campo
        }
    }//GEN-LAST:event_DocumentoKeyTyped

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed

        // Verifica si alguno de los campos obligatorios está vacío
        if (Nombre.getText().equals("")||Documento.getText().equals("")||Nickname.getText().equals("")){
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
                Administrador adm = new Administrador(Nombre.getText(), Integer.parseInt(Documento.getText()), Nickname.getText(), "Administrador");

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
                adm.VerDatosAdministrador();
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

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

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
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JTextField Documento;
    private javax.swing.JLabel DocumentoLabel;
    private javax.swing.JLabel FondoInterfazRAdministrador;
    private javax.swing.JLabel FraseRegistroDos;
    private javax.swing.JLabel FraseRegistroDos1;
    private javax.swing.JLabel FraseRegistroUno;
    private javax.swing.JLabel FraseRegistroUno2;
    private javax.swing.JLabel IconoRegistro;
    private javax.swing.JTextField Nickname;
    private javax.swing.JLabel NicknameLabel;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
