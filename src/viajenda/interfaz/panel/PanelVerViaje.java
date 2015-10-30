package viajenda.interfaz.panel;

import viajenda.dominio.Viaje;
import viajenda.dominio.ISistema;
import viajenda.interfaz.ventana.VentanaMenu;
import javax.swing.JPanel;
import viajenda.dominio.SistemaImp;

/**
 * La clase PanelJugadores se encarga de pedir y validar los datos para la
 * creación de nuevos jugadores y de mostrar los datos de jugadores existentes.
 *
 */
public class PanelVerViaje extends javax.swing.JPanel {

    /**
     * Crea un nuevo objeto PanelJugadores
     */
    public PanelVerViaje(ISistema sistema, Viaje viaje, VentanaMenu ventana) {
        initComponents();

        this.sistema = SistemaImp.getInstance();
        this.viaje = viaje;
	this.ventana = ventana;
        JPanel jp1 = new SubPanelMuro(sistema, viaje);
        JPanel jp2 = new SubPanelInformacion(sistema, viaje);
        JPanel jp3 = new SubPanelLog(sistema, viaje);
	JPanel jp4 = new SubPanelInvitarAmigo(sistema, viaje);
        this.panelPestañas.addTab(viaje.getNombre(), jp1);
	this.etqTitulo.setText(viaje.getNombre());
        this.panelPestañas.addTab("Información", jp2);
	this.panelPestañas.addTab("Invitar amigo", jp4);
        this.panelPestañas.addTab("Novedades", jp3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        panelCrearJugador = new javax.swing.JPanel();
        panelPestañas = new javax.swing.JTabbedPane();

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(460, 679));

        panelPrincipal.setBackground(new java.awt.Color(245, 245, 245));

        panelTitulo.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo.setForeground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText(" ");

        btnBusqueda.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viajenda/interfaz/img/btnAtras.jpg"))); // NOI18N
        btnBusqueda.setAlignmentX(0.5F);
        btnBusqueda.setFocusable(false);
        btnBusqueda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBusqueda.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnBusqueda.setMaximumSize(new java.awt.Dimension(180, 32));
        btnBusqueda.setMinimumSize(new java.awt.Dimension(180, 32));
        btnBusqueda.setPreferredSize(new java.awt.Dimension(180, 32));
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viajenda/interfaz/img/btnAtrasHover.jpg")));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viajenda/interfaz/img/btnAtras.jpg")));
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viajenda/interfaz/img/btnAtrasApretado.jpg")));
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viajenda/interfaz/img/btnAtras.jpg")));
            }
        });
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseEntered(evt);
            }
        });
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCrearJugador.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearJugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));
        panelCrearJugador.setMaximumSize(new java.awt.Dimension(380, 290));
        panelCrearJugador.setPreferredSize(new java.awt.Dimension(380, 290));

        javax.swing.GroupLayout panelCrearJugadorLayout = new javax.swing.GroupLayout(panelCrearJugador);
        panelCrearJugador.setLayout(panelCrearJugadorLayout);
        panelCrearJugadorLayout.setHorizontalGroup(
            panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPestañas, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCrearJugadorLayout.setVerticalGroup(
            panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPestañas, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCrearJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCrearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseClicked

    }//GEN-LAST:event_btnBusquedaMouseClicked

    private void btnBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseEntered

    }//GEN-LAST:event_btnBusquedaMouseEntered

    private void btnBusquedaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseReleased

    }//GEN-LAST:event_btnBusquedaMouseReleased

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
	this.ventana.verMisViajes();
    }//GEN-LAST:event_btnBusquedaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCrearJugador;
    private javax.swing.JTabbedPane panelPestañas;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;
    private Viaje viaje;
    private VentanaMenu ventana;
}
