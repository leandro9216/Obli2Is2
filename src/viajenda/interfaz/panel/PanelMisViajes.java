package viajenda.interfaz.panel;

import viajenda.dominio.Evento;
import viajenda.dominio.ISistema;
import viajenda.dominio.Viaje;
import viajenda.interfaz.ventana.VentanaMenu;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import viajenda.dominio.SistemaImp;

/**
 * La clase PanelJugadores se encarga de pedir y validar los datos para la
 * creación de nuevos jugadores y de mostrar los datos de jugadores existentes.
 */
public class PanelMisViajes extends javax.swing.JPanel {

    /**
     * Crea un nuevo objeto PanelJugadores
     */
    public PanelMisViajes(ISistema sistema, VentanaMenu ventana) {
        initComponents();

        this.sistema = SistemaImp.getInstance();
        this.ventana = ventana;
        refrescarListaViajes();
        btnEliminarViaje.setVisible(false);
        btnEliminarEvento.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        panelPrincipal = new javax.swing.JPanel();
        PanelConsultaJugadores = new javax.swing.JPanel();
        btnVerViaje = new javax.swing.JButton();
        scrollListaJugadores = new javax.swing.JScrollPane();
        listaViajes = new javax.swing.JList();
        etqNombreViaje = new javax.swing.JLabel();
        etqDestinoViaje = new javax.swing.JLabel();
        etqFechas = new javax.swing.JLabel();
        etqDescripcionViaje = new javax.swing.JLabel();
        separadorJugadoresActivos = new javax.swing.JSeparator();
        scrollListaJugadores1 = new javax.swing.JScrollPane();
        listaEventos = new javax.swing.JList();
        btnEliminarViaje = new javax.swing.JButton();
        btnEliminarEvento = new javax.swing.JButton();
        etqEvento = new javax.swing.JLabel();
        etqViaje = new javax.swing.JLabel();
        etqTipoEvento = new javax.swing.JLabel();
        etqNombreEvento = new javax.swing.JLabel();
        etqFechaEvento = new javax.swing.JLabel();
        etqLugarEvento = new javax.swing.JLabel();
        etqDescripcionEvento = new javax.swing.JLabel();
        etqError = new javax.swing.JLabel();
        panelTitulo2 = new javax.swing.JPanel();
        etqTitulo2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(460, 679));

        panelPrincipal.setBackground(new java.awt.Color(245, 245, 245));

        PanelConsultaJugadores.setBackground(new java.awt.Color(255, 255, 255));
        PanelConsultaJugadores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));
        PanelConsultaJugadores.setPreferredSize(new java.awt.Dimension(390, 203));

        btnVerViaje.setBackground(new java.awt.Color(242, 242, 242));
        btnVerViaje.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnVerViaje.setText("Ver viaje");
        btnVerViaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnVerViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerViaje.setFocusPainted(false);
        btnVerViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerViajeActionPerformed(evt);
            }
        });

        listaViajes.setFocusable(false);
        listaViajes.setSelectionBackground(new java.awt.Color(39, 39, 39));
        listaViajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaViajesValueChanged(evt);
            }
        });
        scrollListaJugadores.setViewportView(listaViajes);

        etqNombreViaje.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        etqDestinoViaje.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        etqFechas.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        etqDescripcionViaje.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        listaEventos.setFocusable(false);
        listaEventos.setSelectionBackground(new java.awt.Color(39, 39, 39));
        listaEventos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaEventosValueChanged(evt);
            }
        });
        scrollListaJugadores1.setViewportView(listaEventos);

        btnEliminarViaje.setBackground(new java.awt.Color(242, 242, 242));
        btnEliminarViaje.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEliminarViaje.setText("Eliminar viaje");
        btnEliminarViaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnEliminarViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarViaje.setFocusPainted(false);
        btnEliminarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarViajeActionPerformed(evt);
            }
        });

        btnEliminarEvento.setBackground(new java.awt.Color(242, 242, 242));
        btnEliminarEvento.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEliminarEvento.setText("Eliminar Evento");
        btnEliminarEvento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnEliminarEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarEvento.setFocusPainted(false);
        btnEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEventoActionPerformed(evt);
            }
        });

        etqEvento.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqEvento.setText("Eventos");

        etqViaje.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqViaje.setText("Viajes");

        etqError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etqError.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout PanelConsultaJugadoresLayout = new javax.swing.GroupLayout(PanelConsultaJugadores);
        PanelConsultaJugadores.setLayout(PanelConsultaJugadoresLayout);
        PanelConsultaJugadoresLayout.setHorizontalGroup(
            PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsultaJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConsultaJugadoresLayout.createSequentialGroup()
                        .addComponent(etqViaje)
                        .addContainerGap(373, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConsultaJugadoresLayout.createSequentialGroup()
                        .addGroup(PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollListaJugadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(PanelConsultaJugadoresLayout.createSequentialGroup()
                                .addComponent(etqEvento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEliminarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etqDescripcionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqNombreEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(etqTipoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqLugarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqFechaEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelConsultaJugadoresLayout.createSequentialGroup()
                        .addGroup(PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEliminarViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollListaJugadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnVerViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelConsultaJugadoresLayout.createSequentialGroup()
                                .addGroup(PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqDestinoViaje, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(etqFechas, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(separadorJugadoresActivos, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(etqNombreViaje, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(etqDescripcionViaje, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                                .addGap(41, 41, 41))
                            .addGroup(PanelConsultaJugadoresLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        PanelConsultaJugadoresLayout.setVerticalGroup(
            PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConsultaJugadoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqViaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConsultaJugadoresLayout.createSequentialGroup()
                        .addComponent(etqNombreViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etqDestinoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separadorJugadoresActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqDescripcionViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(PanelConsultaJugadoresLayout.createSequentialGroup()
                        .addComponent(scrollListaJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(etqEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConsultaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollListaJugadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelConsultaJugadoresLayout.createSequentialGroup()
                        .addComponent(etqNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqLugarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqDescripcionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        panelTitulo2.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo2.setForeground(new java.awt.Color(255, 255, 255));

        etqTitulo2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo2.setText("Mis viajes");

        javax.swing.GroupLayout panelTitulo2Layout = new javax.swing.GroupLayout(panelTitulo2);
        panelTitulo2.setLayout(panelTitulo2Layout);
        panelTitulo2Layout.setHorizontalGroup(
            panelTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo2)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        panelTitulo2Layout.setVerticalGroup(
            panelTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelConsultaJugadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addComponent(panelTitulo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelConsultaJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaViajesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaViajesValueChanged
       if (!listaViajes.isSelectionEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Viaje viaje = ((Viaje) listaViajes.getSelectedValue());

            String ciudad = viaje.getDestino();
            

            etqNombreViaje.setText(viaje.getNombre());
            etqFechas.setText((dateFormat.format(viaje.getFechaInicio())
                    + " - " + (dateFormat.format(viaje.getFechaFin()))));

            etqDestinoViaje.setText(ciudad);
            etqDescripcionViaje.setText(viaje.getDescripcion());
            refrescarListaEventos();
            btnEliminarViaje.setVisible(true);
        } else {
            btnEliminarViaje.setVisible(false);
            etqNombreViaje.setText(null);
            etqFechas.setText(null);
            etqDestinoViaje.setText(null);
            etqDescripcionViaje.setText(null);
        }
    }//GEN-LAST:event_listaViajesValueChanged

    private void listaEventosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaEventosValueChanged
        if (!listaEventos.isSelectionEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Evento evento = ((Evento) listaEventos.getSelectedValue());

            String tipoEvento = evento.getTipoEvento();
            
            etqTipoEvento.setText("Tipo: " + tipoEvento);
            etqNombreEvento.setText(evento.getNombre());
            etqFechaEvento.setText(dateFormat.format(evento.getFecha()));

            etqLugarEvento.setText(evento.getLugar());
            etqDescripcionEvento.setText(evento.getDescripcion());
            btnEliminarEvento.setVisible(true);
        } else {
            etqTipoEvento.setText(null);
            etqNombreEvento.setText(null);
            etqFechaEvento.setText(null);

            etqLugarEvento.setText(null);
            etqDescripcionEvento.setText(null);
            btnEliminarEvento.setVisible(false);
            this.refrescarListaEventos();
        }
    }//GEN-LAST:event_listaEventosValueChanged

    private void btnEliminarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarViajeActionPerformed
        if (listaViajes.getSelectedValue() != null) {
            sistema.getUsuarioIdentificado().bajaViaje(((Viaje) listaViajes.getSelectedValue()));
        }
        this.refrescarListaViajes();
        this.refrescarListaEventos();

    }//GEN-LAST:event_btnEliminarViajeActionPerformed

    private void btnEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEventoActionPerformed
        if (listaEventos.getSelectedValue() != null) {
            ((Viaje) listaViajes.getSelectedValue()).bajaEvento((Evento) listaEventos.getSelectedValue());
        }

        String accion = "<html><b>" + this.sistema.getUsuarioIdentificado().getNombre() + " "
                + this.sistema.getUsuarioIdentificado().getApellido() + "</b> eliminó el evento <i>" + ((Evento) listaEventos.getSelectedValue()).getNombre() + "</i> del viaje.";
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        Date hoy = new Date();
        String strDia = sdfDate.format(hoy);
        ((Viaje) listaViajes.getSelectedValue()).agregarLogAViaje(accion, strDia);

        String mensaje = this.sistema.getUsuarioIdentificado().getNombre() + " " + this.sistema.getUsuarioIdentificado().getApellido() + " elimino el evento " + ((Evento) listaEventos.getSelectedValue()).getNombre() + " del viaje "
                + ((Viaje) listaViajes.getSelectedValue()).getNombre();

        String mensajeEmail = "Le notificamos que el usuario " + this.sistema.getUsuarioIdentificado().getNombre() + " " + this.sistema.getUsuarioIdentificado().getApellido() + " eliminó el evento " + ((Evento) listaEventos.getSelectedValue()).getNombre() + " del viaje "
                + ((Viaje) listaViajes.getSelectedValue()).getNombre() + "\n\n Le recordamos que si no desea ser notificado mediante este medio puede darse"
                + "de baja seleccionando la opción en 'Mi Cuenta' \n\nGracias,\n\nViajenda.";
        String titulo = this.sistema.getUsuarioIdentificado().getNombre() + " " + this.sistema.getUsuarioIdentificado().getApellido() + " ha modificado un viaje.";
        this.sistema.notificarNovedad(mensaje, mensajeEmail, titulo, (Viaje) listaViajes.getSelectedValue());

        this.refrescarListaEventos();
    }//GEN-LAST:event_btnEliminarEventoActionPerformed

    private void btnVerViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerViajeActionPerformed
        if (listaViajes.getSelectedValue() != null) {
            this.ventana.verViaje((Viaje) listaViajes.getSelectedValue());
            this.etqError.setText(null);
        } else {
            this.etqError.setText("Debes seleccionar un viaje.");
        }
    }//GEN-LAST:event_btnVerViajeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelConsultaJugadores;
    private javax.swing.JButton btnEliminarEvento;
    private javax.swing.JButton btnEliminarViaje;
    private javax.swing.JButton btnVerViaje;
    private javax.swing.JLabel etqDescripcionEvento;
    private javax.swing.JLabel etqDescripcionViaje;
    private javax.swing.JLabel etqDestinoViaje;
    private javax.swing.JLabel etqError;
    private javax.swing.JLabel etqEvento;
    private javax.swing.JLabel etqFechaEvento;
    private javax.swing.JLabel etqFechas;
    private javax.swing.JLabel etqLugarEvento;
    private javax.swing.JLabel etqNombreEvento;
    private javax.swing.JLabel etqNombreViaje;
    private javax.swing.JLabel etqTipoEvento;
    private javax.swing.JLabel etqTitulo2;
    private javax.swing.JLabel etqViaje;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaEventos;
    private javax.swing.JList listaViajes;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo2;
    private javax.swing.JScrollPane scrollListaJugadores;
    private javax.swing.JScrollPane scrollListaJugadores1;
    private javax.swing.JSeparator separadorJugadoresActivos;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;
    private VentanaMenu ventana;

    /**
     * Le carga a listaJugadores la lista de jugadores del dominio ordenada.
     */
    private void refrescarListaViajes() {
        ArrayList<Viaje> aux = new ArrayList<Viaje>();

        Iterator<Viaje> it = sistema.getUsuarioIdentificado().getListaViajes().iterator();
        while (it.hasNext()) {
            aux.add(it.next());
        }
        if (aux != null) {
            listaViajes.setListData(aux.toArray());
        }
    }

    private void refrescarListaEventos() {
        ArrayList<Evento> aux;
        if (!listaViajes.isSelectionEmpty()) {
            aux = ((Viaje) listaViajes.getSelectedValue()).getListaEventos();
        } else {
            aux = new ArrayList<Evento>();
        }
        if (aux != null) {
            listaEventos.setListData(aux.toArray());
        }
    }
}
