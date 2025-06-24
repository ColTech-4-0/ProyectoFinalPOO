
package com.coltech4.gestormantenimiento;
import javax.swing.JOptionPane;




public class InterfazOpcionesAdministrador extends javax.swing.JFrame {
       private BaseDeDatos BaseDatos;
       private Administrador admin;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazOpcionesAdministrador.class.getName());

   
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
        FondoInterfazRAdministrador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1022, 667));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoInterfazRAdministrador.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documentos\\CURSOS Y BECAS\\INGENIERIA INFORMATICA\\PROGRAMACION ORIENTADA A OBJETOS\\PROYECTO FINAL\\PROYECTO FINAL\\GestorMantenimiento\\src\\main\\java\\Imagenes\\FondoOpciones.jpg")); // NOI18N
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

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoInterfazRAdministrador;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
