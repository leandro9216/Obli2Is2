package viajenda.interfaz.panel;

import viajenda.dominio.Usuario;
import viajenda.dominio.Viaje;
import viajenda.dominio.ISistema;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.border.LineBorder;
import viajenda.dominio.SistemaImp;

public final class SubPanelInvitarAmigo extends javax.swing.JPanel {

    public SubPanelInvitarAmigo(ISistema sistema, Viaje viaje) {
        initComponents();
        this.sistema = SistemaImp.getInstance();
        this.viaje = viaje;

        actualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAmigos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarAmigos = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        etqCorrecto = new javax.swing.JLabel();
        etqError = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jButton1.setText("jButton1");

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(338, 490));

        jScrollPane1.setViewportView(listaAmigos);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel1.setText("Amigos:");

        txtBuscarAmigos.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtBuscarAmigos.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarAmigos.setText("Buscar...");
        txtBuscarAmigos.setToolTipText("");
        txtBuscarAmigos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtBuscarAmigos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarAmigosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarAmigosFocusLost(evt);
            }
        });
        txtBuscarAmigos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAmigosKeyReleased(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jButton2.setText("Invitar al grupo de viaje");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        etqCorrecto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etqCorrecto.setForeground(new java.awt.Color(0, 153, 0));

        etqError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etqError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqCorrecto, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBuscarAmigos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etqError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(etqCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        txtBuscarAmigos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarAmigos.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarAmigos.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtBuscarAmigos.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtBuscarAmigos.isFocusOwner()) {
                    txtBuscarAmigos.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtBuscarAmigos.isFocusOwner()) {
                    txtBuscarAmigos.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!this.listaAmigos.isSelectionEmpty()) {
            ((Usuario) listaAmigos.getSelectedValue()).agregarViajes(viaje);
            etqError.setText(null);
            etqCorrecto.setText(((Usuario) listaAmigos.getSelectedValue()).getNombre() + " "
                    + ((Usuario) listaAmigos.getSelectedValue()).getApellido() + " fue agregado al viaje.");

            String accion = "<html><b>" + ((Usuario) listaAmigos.getSelectedValue()).toString() + "</b> se unió al viaje.";
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
            Date hoy = new Date();
            String strDia = sdfDate.format(hoy);
            viaje.agregarLogAViaje(accion, strDia);
            this.actualizarLista();
        } else {
            etqError.setText("Debes seleccionar un amigo.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtBuscarAmigosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarAmigosFocusGained
        this.txtBuscarAmigos.setText(null);
        this.txtBuscarAmigos.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtBuscarAmigosFocusGained

    private void txtBuscarAmigosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarAmigosFocusLost
        if (this.txtBuscarAmigos.getText().equals("")) {
            this.txtBuscarAmigos.setText("Buscar...");
            this.txtBuscarAmigos.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtBuscarAmigosFocusLost

    private void actualizarLista() {
        ArrayList<Usuario> listaDeAmigos = (ArrayList<Usuario>) sistema.getUsuarioIdentificado().getListaAmigos().clone();
        //Saco de la lista a los que ya están adentro
        Iterator<Usuario> it = this.sistema.obtenerGrupoDeViaje(viaje).iterator();
        while (it.hasNext()) {
            listaDeAmigos.remove(it.next());
        }
        listaAmigos.setListData(listaDeAmigos.toArray());

    }

    private void txtBuscarAmigosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAmigosKeyReleased
        actualizarLista();
    }//GEN-LAST:event_txtBuscarAmigosKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqCorrecto;
    private javax.swing.JLabel etqError;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JList listaAmigos;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtBuscarAmigos;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;
    private Viaje viaje;
}
