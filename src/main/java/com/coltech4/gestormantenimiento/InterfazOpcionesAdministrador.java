package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;


public class InterfazOpcionesAdministrador extends javax.swing.JFrame {
       private BaseDeDatos BaseDatos;
       private Administrador admin;
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazOpcionesAdministrador.class.getName());

   
    public InterfazOpcionesAdministrador() {
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
        RegistrarJefeEnfermeria = new javax.swing.JButton();
        InicioSecionLabel = new javax.swing.JLabel();
        VizDatosJefeEnfermeria = new javax.swing.JButton();
        FechaMantenimiento = new javax.swing.JButton();
        RegistrarEquipo1 = new javax.swing.JButton();
        RegistrarIng = new javax.swing.JButton();
        ModPermisosIng1 = new javax.swing.JButton();
        BotonVisualizarDatosPropios = new javax.swing.JButton();
        VizDatosEquipo1 = new javax.swing.JButton();
        VizDatosIng = new javax.swing.JButton();
        ModEstadoEquipo2 = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();
        BotonVisualizarDatosPropios1 = new javax.swing.JButton();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        Separador3 = new javax.swing.JSeparator();
        Separador4 = new javax.swing.JSeparator();
        InicioSecionLabel1 = new javax.swing.JLabel();
        InicioSecionLabel2 = new javax.swing.JLabel();
        InicioSecionLabel3 = new javax.swing.JLabel();
        FondoInterfazRAdministrador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1022, 667));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xExit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        xExit.setForeground(new java.awt.Color(255, 255, 255));
        xExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xExit.setText("X");
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
        jPanel1.add(xExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 30));

        RegistrarJefeEnfermeria.setBackground(new java.awt.Color(3, 155, 215));
        RegistrarJefeEnfermeria.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        RegistrarJefeEnfermeria.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarJefeEnfermeria.setText("Registrar");
        RegistrarJefeEnfermeria.setBorder(null);
        RegistrarJefeEnfermeria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarJefeEnfermeria.setFocusPainted(false);
        RegistrarJefeEnfermeria.setOpaque(true);
        RegistrarJefeEnfermeria.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel1.add(RegistrarJefeEnfermeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 170, 50));

        InicioSecionLabel.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 24)); // NOI18N
        InicioSecionLabel.setForeground(new java.awt.Color(49, 153, 214));
        InicioSecionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSecionLabel.setText("INGENIERO");
        jPanel1.add(InicioSecionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 320, 40));

        VizDatosJefeEnfermeria.setBackground(new java.awt.Color(3, 155, 215));
        VizDatosJefeEnfermeria.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        VizDatosJefeEnfermeria.setForeground(new java.awt.Color(255, 255, 255));
        VizDatosJefeEnfermeria.setText("Visualizar Datos");
        VizDatosJefeEnfermeria.setBorder(null);
        VizDatosJefeEnfermeria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VizDatosJefeEnfermeria.setFocusPainted(false);
        VizDatosJefeEnfermeria.setOpaque(true);
        VizDatosJefeEnfermeria.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel1.add(VizDatosJefeEnfermeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 170, 50));

        FechaMantenimiento.setBackground(new java.awt.Color(3, 155, 215));
        FechaMantenimiento.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        FechaMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        FechaMantenimiento.setText("Asignar Fecha Mantenimiento");
        FechaMantenimiento.setBorder(null);
        FechaMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FechaMantenimiento.setFocusPainted(false);
        FechaMantenimiento.setOpaque(true);
        FechaMantenimiento.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel1.add(FechaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 240, 50));

        RegistrarEquipo1.setBackground(new java.awt.Color(3, 155, 215));
        RegistrarEquipo1.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        RegistrarEquipo1.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarEquipo1.setText("Registrar");
        RegistrarEquipo1.setBorder(null);
        RegistrarEquipo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarEquipo1.setFocusPainted(false);
        RegistrarEquipo1.setOpaque(true);
        RegistrarEquipo1.setPreferredSize(new java.awt.Dimension(225, 25));
        RegistrarEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEquipo1ActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 170, 50));

        RegistrarIng.setBackground(new java.awt.Color(3, 155, 215));
        RegistrarIng.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        RegistrarIng.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarIng.setText("Registrar");
        RegistrarIng.setBorder(null);
        RegistrarIng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarIng.setFocusPainted(false);
        RegistrarIng.setOpaque(true);
        RegistrarIng.setPreferredSize(new java.awt.Dimension(225, 25));
        RegistrarIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarIngActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, 50));

        ModPermisosIng1.setBackground(new java.awt.Color(3, 155, 215));
        ModPermisosIng1.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        ModPermisosIng1.setForeground(new java.awt.Color(255, 255, 255));
        ModPermisosIng1.setText("Modificar Permisos");
        ModPermisosIng1.setBorder(null);
        ModPermisosIng1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModPermisosIng1.setFocusPainted(false);
        ModPermisosIng1.setOpaque(true);
        ModPermisosIng1.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel1.add(ModPermisosIng1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 170, 50));

        BotonVisualizarDatosPropios.setBackground(new java.awt.Color(3, 155, 215));
        BotonVisualizarDatosPropios.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonVisualizarDatosPropios.setForeground(new java.awt.Color(255, 255, 255));
        BotonVisualizarDatosPropios.setText("Salir");
        BotonVisualizarDatosPropios.setBorder(null);
        BotonVisualizarDatosPropios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVisualizarDatosPropios.setFocusPainted(false);
        BotonVisualizarDatosPropios.setOpaque(true);
        BotonVisualizarDatosPropios.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonVisualizarDatosPropios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVisualizarDatosPropiosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVisualizarDatosPropios, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 170, 50));

        VizDatosEquipo1.setBackground(new java.awt.Color(3, 155, 215));
        VizDatosEquipo1.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        VizDatosEquipo1.setForeground(new java.awt.Color(255, 255, 255));
        VizDatosEquipo1.setText("Visualizar Datos");
        VizDatosEquipo1.setBorder(null);
        VizDatosEquipo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VizDatosEquipo1.setFocusPainted(false);
        VizDatosEquipo1.setOpaque(true);
        VizDatosEquipo1.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel1.add(VizDatosEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 170, 50));

        VizDatosIng.setBackground(new java.awt.Color(3, 155, 215));
        VizDatosIng.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        VizDatosIng.setForeground(new java.awt.Color(255, 255, 255));
        VizDatosIng.setText("Visualizar Datos");
        VizDatosIng.setBorder(null);
        VizDatosIng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VizDatosIng.setFocusPainted(false);
        VizDatosIng.setOpaque(true);
        VizDatosIng.setPreferredSize(new java.awt.Dimension(225, 25));
        VizDatosIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VizDatosIngActionPerformed(evt);
            }
        });
        jPanel1.add(VizDatosIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 170, 50));

        ModEstadoEquipo2.setBackground(new java.awt.Color(3, 155, 215));
        ModEstadoEquipo2.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        ModEstadoEquipo2.setForeground(new java.awt.Color(255, 255, 255));
        ModEstadoEquipo2.setText("Modificar Estado");
        ModEstadoEquipo2.setBorder(null);
        ModEstadoEquipo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModEstadoEquipo2.setFocusPainted(false);
        ModEstadoEquipo2.setOpaque(true);
        ModEstadoEquipo2.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel1.add(ModEstadoEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 170, 50));

        BotonRegresar.setBackground(new java.awt.Color(3, 155, 215));
        BotonRegresar.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegresar.setText("Mis Datos");
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
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 170, 50));

        BotonVisualizarDatosPropios1.setBackground(new java.awt.Color(3, 155, 215));
        BotonVisualizarDatosPropios1.setFont(new java.awt.Font("Roboto Condensed SemiBold", 0, 18)); // NOI18N
        BotonVisualizarDatosPropios1.setForeground(new java.awt.Color(255, 255, 255));
        BotonVisualizarDatosPropios1.setText("Regresar");
        BotonVisualizarDatosPropios1.setBorder(null);
        BotonVisualizarDatosPropios1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVisualizarDatosPropios1.setFocusPainted(false);
        BotonVisualizarDatosPropios1.setOpaque(true);
        BotonVisualizarDatosPropios1.setPreferredSize(new java.awt.Dimension(225, 25));
        BotonVisualizarDatosPropios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVisualizarDatosPropios1ActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVisualizarDatosPropios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 170, 50));

        Separador1.setBackground(new java.awt.Color(51, 51, 51));
        Separador1.setForeground(new java.awt.Color(153, 153, 153));
        Separador1.setFont(new java.awt.Font("Roboto SemiBold", 0, 14)); // NOI18N
        Separador1.setInheritsPopupMenu(true);
        Separador1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel1.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 200, 20));

        Separador2.setBackground(new java.awt.Color(51, 51, 51));
        Separador2.setForeground(new java.awt.Color(153, 153, 153));
        Separador2.setFont(new java.awt.Font("Roboto SemiBold", 0, 14)); // NOI18N
        Separador2.setInheritsPopupMenu(true);
        Separador2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel1.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 870, 20));

        Separador3.setBackground(new java.awt.Color(51, 51, 51));
        Separador3.setForeground(new java.awt.Color(153, 153, 153));
        Separador3.setFont(new java.awt.Font("Roboto SemiBold", 0, 14)); // NOI18N
        Separador3.setInheritsPopupMenu(true);
        Separador3.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel1.add(Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 280, 20));

        Separador4.setBackground(new java.awt.Color(51, 51, 51));
        Separador4.setForeground(new java.awt.Color(153, 153, 153));
        Separador4.setFont(new java.awt.Font("Roboto SemiBold", 0, 14)); // NOI18N
        Separador4.setInheritsPopupMenu(true);
        Separador4.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel1.add(Separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 200, 20));

        InicioSecionLabel1.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 24)); // NOI18N
        InicioSecionLabel1.setForeground(new java.awt.Color(49, 153, 214));
        InicioSecionLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSecionLabel1.setText("JEFE DE ENFERMERIA");
        jPanel1.add(InicioSecionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 320, 40));

        InicioSecionLabel2.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 36)); // NOI18N
        InicioSecionLabel2.setForeground(new java.awt.Color(49, 153, 214));
        InicioSecionLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSecionLabel2.setText("Opciones Administrador");
        jPanel1.add(InicioSecionLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 430, 40));

        InicioSecionLabel3.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 1, 24)); // NOI18N
        InicioSecionLabel3.setForeground(new java.awt.Color(49, 153, 214));
        InicioSecionLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSecionLabel3.setText("EQUIPO");
        jPanel1.add(InicioSecionLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 320, 40));

        FondoInterfazRAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpciones.jpg"))); // NOI18N
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

    private void xExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_xExitMouseClicked

    private void xExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseEntered
        xExit.setForeground(Color.black);
    }//GEN-LAST:event_xExitMouseEntered

    private void xExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseExited
        xExit.setForeground(Color.white);
    }//GEN-LAST:event_xExitMouseExited

    private void RegistrarEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEquipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarEquipo1ActionPerformed

    private void RegistrarIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarIngActionPerformed
        this.admin.RegistrarEquipodeTrabajo(BaseDatos);
    }//GEN-LAST:event_RegistrarIngActionPerformed

    private void BotonVisualizarDatosPropiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVisualizarDatosPropiosActionPerformed
       // Muestra un cuadro de confirmación al usuario antes de cerrar la aplicación
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
    }//GEN-LAST:event_BotonVisualizarDatosPropiosActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        this.admin.VerDatosAdministrador();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void VizDatosIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VizDatosIngActionPerformed
        int ide = -1;
        boolean encontrado = false;

        while (true) {
            String input = JOptionPane.showInputDialog(null, "Ingrese el documento del Ingeniero:");

            if (input == null) {
                // El usuario canceló la operación
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return;
            }

            try {
                ide = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }

        // Búsqueda con índice
        for (int i = 0; i < this.BaseDatos.ingenieros.size(); i++) {
            if (this.BaseDatos.ingenieros.get(i).documento == ide) {
                this.BaseDatos.ingenieros.get(i).VerDatosIngeniero();
                encontrado = true;
                return; // Terminamos si lo encontró
            }
        }

        // Si no se encontró ningún ingeniero
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró un ingeniero con el documento: " + ide);
        }

    }//GEN-LAST:event_VizDatosIngActionPerformed

    private void BotonVisualizarDatosPropios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVisualizarDatosPropios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVisualizarDatosPropios1ActionPerformed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton BotonVisualizarDatosPropios;
    private javax.swing.JButton BotonVisualizarDatosPropios1;
    private javax.swing.JButton FechaMantenimiento;
    private javax.swing.JLabel FondoInterfazRAdministrador;
    private javax.swing.JLabel InicioSecionLabel;
    private javax.swing.JLabel InicioSecionLabel1;
    private javax.swing.JLabel InicioSecionLabel2;
    private javax.swing.JLabel InicioSecionLabel3;
    private javax.swing.JButton ModEstadoEquipo2;
    private javax.swing.JButton ModPermisosIng1;
    private javax.swing.JButton RegistrarEquipo1;
    private javax.swing.JButton RegistrarIng;
    private javax.swing.JButton RegistrarJefeEnfermeria;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator Separador3;
    private javax.swing.JSeparator Separador4;
    private javax.swing.JButton VizDatosEquipo1;
    private javax.swing.JButton VizDatosIng;
    private javax.swing.JButton VizDatosJefeEnfermeria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
