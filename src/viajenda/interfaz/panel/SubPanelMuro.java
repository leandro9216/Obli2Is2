/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package viajenda.interfaz.panel;

import viajenda.dominio.Viaje;
import viajenda.dominio.ISistema;
import viajenda.dominio.Comentario;
import viajenda.excepciones.comentario.ComentarioException;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import viajenda.dominio.SistemaImp;

public final class SubPanelMuro extends javax.swing.JPanel {

    public SubPanelMuro(ISistema sistema, Viaje viaje) {
        initComponents();
        this.sistema = SistemaImp.getInstance();
        this.viaje = viaje;

        actualizarComentarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMuro = new javax.swing.JPanel();
        lblRedactar = new javax.swing.JLabel();
        txtPublicacion = new javax.swing.JTextArea();
        btnPublicar = new javax.swing.JButton();
        panelComentario1 = new javax.swing.JPanel();
        etqAutor1 = new javax.swing.JLabel();
        etqContenido1 = new javax.swing.JLabel();
        etqFecha1 = new javax.swing.JLabel();
        panelComentario2 = new javax.swing.JPanel();
        etqAutor2 = new javax.swing.JLabel();
        etqContenido2 = new javax.swing.JLabel();
        etqFecha2 = new javax.swing.JLabel();
        panelComentario3 = new javax.swing.JPanel();
        etqAutor3 = new javax.swing.JLabel();
        etqContenido3 = new javax.swing.JLabel();
        etqFecha3 = new javax.swing.JLabel();
        panelComentario4 = new javax.swing.JPanel();
        etqAutor4 = new javax.swing.JLabel();
        etqContenido4 = new javax.swing.JLabel();
        etqFecha4 = new javax.swing.JLabel();
        etqError = new javax.swing.JLabel();

        setLayout(null);

        panelMuro.setBackground(new java.awt.Color(255, 255, 255));

        lblRedactar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblRedactar.setText("Redactar publicación");

        txtPublicacion.setColumns(20);
        txtPublicacion.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtPublicacion.setForeground(new java.awt.Color(153, 153, 153));
        txtPublicacion.setRows(5);
        txtPublicacion.setText("Escribe algo...");
        txtPublicacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPublicacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPublicacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPublicacionFocusLost(evt);
            }
        });

        btnPublicar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPublicar.setText("Publicar");
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });

        panelComentario1.setBackground(new java.awt.Color(255, 255, 255));

        etqAutor1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etqAutor1.setText("Juan Alvarez");

        etqContenido1.setText("<html> Este es un comentario con salto de linea. Me gusta el grupo. <br> probando salto de linea . Jaja<br>Saludos </html>");
        etqContenido1.setToolTipText("");
        etqContenido1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha1.setForeground(new java.awt.Color(153, 153, 153));
        etqFecha1.setText("21/12/2012 17:15");

        javax.swing.GroupLayout panelComentario1Layout = new javax.swing.GroupLayout(panelComentario1);
        panelComentario1.setLayout(panelComentario1Layout);
        panelComentario1Layout.setHorizontalGroup(
            panelComentario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComentario1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelComentario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqContenido1)
                    .addGroup(panelComentario1Layout.createSequentialGroup()
                        .addComponent(etqAutor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etqFecha1)))
                .addContainerGap())
        );
        panelComentario1Layout.setVerticalGroup(
            panelComentario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComentario1Layout.createSequentialGroup()
                .addGroup(panelComentario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAutor1)
                    .addComponent(etqFecha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqContenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComentario2.setBackground(new java.awt.Color(255, 255, 255));

        etqAutor2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etqAutor2.setText("Juan Alvarez");

        etqContenido2.setText("<html> Este es un comentario con salto de linea. Me gusta el grupo. <br> probando salto de linea . Jaja<br>Saludos </html>");
        etqContenido2.setToolTipText("");
        etqContenido2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha2.setForeground(new java.awt.Color(153, 153, 153));
        etqFecha2.setText("21/12/2012 17:15");

        javax.swing.GroupLayout panelComentario2Layout = new javax.swing.GroupLayout(panelComentario2);
        panelComentario2.setLayout(panelComentario2Layout);
        panelComentario2Layout.setHorizontalGroup(
            panelComentario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComentario2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelComentario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqContenido2)
                    .addGroup(panelComentario2Layout.createSequentialGroup()
                        .addComponent(etqAutor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etqFecha2)))
                .addContainerGap())
        );
        panelComentario2Layout.setVerticalGroup(
            panelComentario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComentario2Layout.createSequentialGroup()
                .addGroup(panelComentario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAutor2)
                    .addComponent(etqFecha2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqContenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComentario3.setBackground(new java.awt.Color(255, 255, 255));

        etqAutor3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etqAutor3.setText("Juan Alvarez");

        etqContenido3.setText("<html> Este es un comentario con salto de linea. Me gusta el grupo. <br> probando salto de linea . Jaja<br>Saludos </html>");
        etqContenido3.setToolTipText("");
        etqContenido3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha3.setForeground(new java.awt.Color(153, 153, 153));
        etqFecha3.setText("21/12/2012 17:15");

        javax.swing.GroupLayout panelComentario3Layout = new javax.swing.GroupLayout(panelComentario3);
        panelComentario3.setLayout(panelComentario3Layout);
        panelComentario3Layout.setHorizontalGroup(
            panelComentario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComentario3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelComentario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqContenido3)
                    .addGroup(panelComentario3Layout.createSequentialGroup()
                        .addComponent(etqAutor3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etqFecha3)))
                .addContainerGap())
        );
        panelComentario3Layout.setVerticalGroup(
            panelComentario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComentario3Layout.createSequentialGroup()
                .addGroup(panelComentario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAutor3)
                    .addComponent(etqFecha3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqContenido3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComentario4.setBackground(new java.awt.Color(255, 255, 255));

        etqAutor4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etqAutor4.setText("Juan Alvarez");

        etqContenido4.setText("<html> Este es un comentario con salto de linea. Me gusta el grupo. <br> probando salto de linea . Jaja<br>Saludos </html>");
        etqContenido4.setToolTipText("");
        etqContenido4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha4.setForeground(new java.awt.Color(153, 153, 153));
        etqFecha4.setText("21/12/2012 17:15");

        javax.swing.GroupLayout panelComentario4Layout = new javax.swing.GroupLayout(panelComentario4);
        panelComentario4.setLayout(panelComentario4Layout);
        panelComentario4Layout.setHorizontalGroup(
            panelComentario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComentario4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelComentario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqContenido4)
                    .addGroup(panelComentario4Layout.createSequentialGroup()
                        .addComponent(etqAutor4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etqFecha4)))
                .addContainerGap())
        );
        panelComentario4Layout.setVerticalGroup(
            panelComentario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComentario4Layout.createSequentialGroup()
                .addGroup(panelComentario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAutor4)
                    .addComponent(etqFecha4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqContenido4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        etqError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etqError.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout panelMuroLayout = new javax.swing.GroupLayout(panelMuro);
        panelMuro.setLayout(panelMuroLayout);
        panelMuroLayout.setHorizontalGroup(
            panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelComentario1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelComentario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelComentario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelComentario4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMuroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPublicacion)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMuroLayout.createSequentialGroup()
                        .addComponent(etqError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(lblRedactar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMuroLayout.setVerticalGroup(
            panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMuroLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblRedactar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPublicar)
                    .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(panelComentario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelComentario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelComentario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelComentario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        add(panelMuro);
        panelMuro.setBounds(0, 0, 403, 510);
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarComentarios() {
        this.panelComentario1.setVisible(false);
        this.panelComentario2.setVisible(false);
        this.panelComentario3.setVisible(false);
        this.panelComentario4.setVisible(false);

        int cantComentarios = 1;
        Iterator<Comentario> iteradorComentarios = viaje.getListaComentarios().iterator();
        while (iteradorComentarios.hasNext() && cantComentarios <= 4) {
            Comentario comentario = iteradorComentarios.next();
            switch (cantComentarios) {
                case 1:
                    this.panelComentario1.setVisible(true);
                    this.etqAutor1.setText(comentario.getAutor());
                    this.etqContenido1.setText(comentario.getContenido());
                    this.etqFecha1.setText(comentario.getFecha());
                    break;
                case 2:
                    this.panelComentario2.setVisible(true);
                    this.etqAutor2.setText(comentario.getAutor());
                    this.etqContenido2.setText(comentario.getContenido());
                    this.etqFecha2.setText(comentario.getFecha());
                    break;
                case 3:
                    this.panelComentario3.setVisible(true);
                    this.etqAutor3.setText(comentario.getAutor());
                    this.etqContenido3.setText(comentario.getContenido());
                    this.etqFecha3.setText(comentario.getFecha());
                    break;
                case 4:
                    this.panelComentario4.setVisible(true);
                    this.etqAutor4.setText(comentario.getAutor());
                    this.etqContenido4.setText(comentario.getContenido());
                    this.etqFecha4.setText(comentario.getFecha());
                    break;
            }
            cantComentarios++;
        }
    }

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        String texto = txtPublicacion.getText();

        if (texto.equals("Escribe algo...")) {
            texto = "";
        }

        try {
            String autor = this.sistema.getUsuarioIdentificado().getNombre() + " " + this.sistema.getUsuarioIdentificado().getApellido();
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
            Date hoy = new Date();
            String strDia = sdfDate.format(hoy);

            this.viaje.agregarComentario(autor, strDia, texto);
            this.actualizarComentarios();
            etqError.setText(null);
            txtPublicacion.setText("Escribe algo...");
            txtPublicacion.setForeground(Color.GRAY);
        }catch(ComentarioException e){
            this.etqError.setText(e.toString());
        }
    }//GEN-LAST:event_btnPublicarActionPerformed

    private void txtPublicacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPublicacionFocusLost
        if (txtPublicacion.getText().equals("")) {
            txtPublicacion.setText("Escribe algo...");
            txtPublicacion.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtPublicacionFocusLost

    private void txtPublicacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPublicacionFocusGained
        txtPublicacion.setText("");
        txtPublicacion.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtPublicacionFocusGained
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPublicar;
    private javax.swing.JLabel etqAutor1;
    private javax.swing.JLabel etqAutor2;
    private javax.swing.JLabel etqAutor3;
    private javax.swing.JLabel etqAutor4;
    private javax.swing.JLabel etqContenido1;
    private javax.swing.JLabel etqContenido2;
    private javax.swing.JLabel etqContenido3;
    private javax.swing.JLabel etqContenido4;
    private javax.swing.JLabel etqError;
    private javax.swing.JLabel etqFecha1;
    private javax.swing.JLabel etqFecha2;
    private javax.swing.JLabel etqFecha3;
    private javax.swing.JLabel etqFecha4;
    private javax.swing.JLabel lblRedactar;
    private javax.swing.JPanel panelComentario1;
    private javax.swing.JPanel panelComentario2;
    private javax.swing.JPanel panelComentario3;
    private javax.swing.JPanel panelComentario4;
    private javax.swing.JPanel panelMuro;
    private javax.swing.JTextArea txtPublicacion;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;
    private Viaje viaje;
}
