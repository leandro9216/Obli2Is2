/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package viajenda.interfaz.panel;

import viajenda.dominio.Usuario;
import viajenda.dominio.Viaje;
import viajenda.dominio.ISistema;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import viajenda.dominio.SistemaImp;

public final class SubPanelInformacion extends javax.swing.JPanel {

    public SubPanelInformacion(ISistema sistema, Viaje viaje) {
        initComponents();
        this.sistema = SistemaImp.getInstance();
        this.viaje = viaje;

        ArrayList<Usuario> listaGurpoDeViaje = sistema.obtenerGrupoDeViaje(viaje);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIni = dateFormat.format(viaje.getFechaInicio());
        String fechaFin = dateFormat.format(viaje.getFechaFin());
        listaGrupo.setListData(listaGurpoDeViaje.toArray());
        this.etqIni.setText(fechaIni);
        this.etqFin.setText(fechaFin);
        this.etqNombre.setText(this.viaje.getNombre().toString());
        this.etqDestino.setText(this.viaje.getDestino().toString());
        this.etqDescripcion.setText(this.viaje.getDescripcion().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        panelMuro = new javax.swing.JPanel();
        scrollListaViajes = new javax.swing.JScrollPane();
        listaGrupo = new javax.swing.JList();
        etqMiembros = new javax.swing.JLabel();
        etqNombreApellido = new javax.swing.JLabel();
        etqEmail = new javax.swing.JLabel();
        etqBusqueda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        etqDescripcion = new javax.swing.JLabel();
        etqDestino = new javax.swing.JLabel();
        etqIni = new javax.swing.JLabel();
        etqFin = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jButton1.setText("jButton1");

        panelMuro.setBackground(new java.awt.Color(255, 255, 255));
        panelMuro.setPreferredSize(new java.awt.Dimension(338, 490));

        listaGrupo.setToolTipText("");
        listaGrupo.setFocusable(false);
        listaGrupo.setSelectionBackground(new java.awt.Color(39, 39, 39));
        listaGrupo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaGrupoValueChanged(evt);
            }
        });
        scrollListaViajes.setViewportView(listaGrupo);

        etqMiembros.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqMiembros.setText("Miembros:");

        etqBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etqBusqueda.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel1.setText("Información:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setText("Destino:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("Fecha inicio:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setText("Fecha fin:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel6.setText("Descripción:");

        javax.swing.GroupLayout panelMuroLayout = new javax.swing.GroupLayout(panelMuro);
        panelMuro.setLayout(panelMuroLayout);
        panelMuroLayout.setHorizontalGroup(
            panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMuroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMuroLayout.createSequentialGroup()
                        .addComponent(etqBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(160, 160, 160))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMuroLayout.createSequentialGroup()
                                .addComponent(scrollListaViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqNombreApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMuroLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMuroLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMuroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqIni, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMuroLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqFin, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMuroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelMuroLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        panelMuroLayout.setVerticalGroup(
            panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMuroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(etqDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(etqIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(etqFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(etqDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(etqMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(scrollListaViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(etqBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMuro, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMuro, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaGrupoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaGrupoValueChanged
        if (!listaGrupo.isSelectionEmpty()) {
            Usuario aux = (Usuario) listaGrupo.getSelectedValue();
            String nombre = aux.getNombre();
            String apellido = aux.getApellido();
            String email = aux.getEmail().toString();
            etqNombreApellido.setText(nombre + "  " + apellido);
            etqEmail.setText(email);

        } else {
            etqNombreApellido.setText("");
            etqEmail.setText("");
        }
    }//GEN-LAST:event_listaGrupoValueChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqBusqueda;
    private javax.swing.JLabel etqDescripcion;
    private javax.swing.JLabel etqDestino;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqFin;
    private javax.swing.JLabel etqIni;
    private javax.swing.JLabel etqMiembros;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNombreApellido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JList listaGrupo;
    private javax.swing.JPanel panelMuro;
    private javax.swing.JScrollPane scrollListaViajes;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;
    private Viaje viaje;
}
