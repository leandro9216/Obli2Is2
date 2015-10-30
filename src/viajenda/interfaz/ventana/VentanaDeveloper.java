package viajenda.interfaz.ventana;

import viajenda.dominio.ISistema;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * La clase VentanaDeveloper maneja la interfaz de la ventana de introducción al
 * juego.
 *
 */
public class VentanaDeveloper extends javax.swing.JFrame {

    public VentanaDeveloper(ISistema sistema) {
        initComponents();
        this.sistema = sistema;

        /*
         * Icono de la ventana
         */
        BufferedImage image;
        try {
            image = ImageIO.read(getClass().getResource("/viajenda/interfaz/img/icono.png"));
            setIconImage(image);
        } catch (IOException e) {
        }
        this.txtProxy.setVisible(false);
        this.etqPuntos.setVisible(false);
        this.txtPuerto.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnModoDesarrollador = new javax.swing.JButton();
        btnModoNormal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        checkNoMostrar = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtProxy = new javax.swing.JTextField();
        etqPuntos = new javax.swing.JLabel();
        txtPuerto = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rey del Tablero");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setText("¿Desea iniciar en modo de desarrollador?");

        btnModoDesarrollador.setText("Modo Desarrollador");
        btnModoDesarrollador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoDesarrolladorActionPerformed(evt);
            }
        });

        btnModoNormal.setText("Modo Normal");
        btnModoNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoNormalActionPerformed(evt);
            }
        });

        jLabel2.setText("En modo desarrollador se ofrecen facilidades para probar el programa.");

        checkNoMostrar.setBackground(new java.awt.Color(255, 255, 255));
        checkNoMostrar.setText("No volver a mostrar este diálogo.");
        checkNoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNoMostrarActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Utilizar proxy");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        txtProxy.setText("192.168.57.2");
        txtProxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProxyActionPerformed(evt);
            }
        });

        etqPuntos.setText(":");

        txtPuerto.setText("80");
        txtPuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuertoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(txtProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqPuntos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(checkNoMostrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                            .addComponent(btnModoDesarrollador)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModoNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModoDesarrollador)
                    .addComponent(btnModoNormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(txtProxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqPuntos)
                    .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkNoMostrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModoDesarrolladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoDesarrolladorActionPerformed
        this.sistema.setModoDesarrollador(true);
        if (this.jCheckBox1.isSelected()) {
            this.sistema.setProxy(this.txtProxy.getText());
            this.sistema.setPuerto(Integer.parseInt(this.txtPuerto.getText()));
        } else {
            this.sistema.setProxy("");
        }
        this.setVisible(false);
        VentanaLogin ventana = new VentanaLogin(sistema);
        ventana.setLocationRelativeTo(null); // Centrar ventana.
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModoDesarrolladorActionPerformed

    private void btnModoNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoNormalActionPerformed
        this.sistema.setModoDesarrollador(false);
        if (this.jCheckBox1.isSelected()) {
            this.sistema.setProxy(this.txtProxy.getText());
            this.sistema.setPuerto(Integer.parseInt(this.txtPuerto.getText()));
        } else {
            this.sistema.setProxy("");
        }
        this.setVisible(false);
        VentanaLogin ventana = new VentanaLogin(sistema);
        ventana.setLocationRelativeTo(null); // Centrar ventana.
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModoNormalActionPerformed

    private void checkNoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNoMostrarActionPerformed
        this.sistema.setMostrarCartelInicio(!checkNoMostrar.isSelected());
    }//GEN-LAST:event_checkNoMostrarActionPerformed

    private void txtProxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProxyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProxyActionPerformed

    private void txtPuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuertoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (this.jCheckBox1.isSelected()) {
            this.txtProxy.setVisible(true);
            this.etqPuntos.setVisible(true);
            this.txtPuerto.setVisible(true);
        } else {
            this.txtProxy.setVisible(false);
            this.etqPuntos.setVisible(false);
            this.txtPuerto.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModoDesarrollador;
    private javax.swing.JButton btnModoNormal;
    private javax.swing.JCheckBox checkNoMostrar;
    private javax.swing.JLabel etqPuntos;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtProxy;
    private javax.swing.JTextField txtPuerto;
    // End of variables declaration//GEN-END:variables
    ISistema sistema;
}
