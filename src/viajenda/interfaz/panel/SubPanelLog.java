package viajenda.interfaz.panel;

import viajenda.dominio.Viaje;
import viajenda.dominio.ISistema;
import viajenda.dominio.ReporteLog;
import java.util.Iterator;
import viajenda.dominio.SistemaImp;

public final class SubPanelLog extends javax.swing.JPanel {

    public SubPanelLog(ISistema sistema, Viaje viaje) {
        initComponents();
        this.sistema = SistemaImp.getInstance();
        this.viaje = viaje;
        int cont = 10;
        Iterator<ReporteLog> iteradorLog = this.viaje.obtenerLog().iterator();
        while (iteradorLog.hasNext() && cont >= 2) {
            System.out.println("sii");
            ReporteLog reporte = iteradorLog.next();
            String contenido = reporte.getAccion();
            String fecha = reporte.getFecha();
            switch (cont) {
                case 10:
                    this.etqContenido10.setText(contenido);
                    this.etqFecha10.setText(fecha);
                    break;
                case 9:
                    this.etqContenido9.setText(contenido);
                    this.etqFecha9.setText(fecha);
                    break;
                case 8:
                    this.etqContenido8.setText(contenido);
                    this.etqFecha8.setText(fecha);
                    break;
                case 7:
                    this.etqContenido7.setText(contenido);
                    this.etqFecha7.setText(fecha);
                    break;
                case 6:
                    this.etqContenido6.setText(contenido);
                    this.etqFecha6.setText(fecha);
                    break;
                case 5:
                    this.etqContenido5.setText(contenido);
                    this.etqFecha5.setText(fecha);
                    break;
                case 4:
                    this.etqContenido4.setText(contenido);
                    this.etqFecha4.setText(fecha);
                    break;
                case 3:
                    this.etqContenido3.setText(contenido);
                    this.etqFecha3.setText(fecha);
                    break;
                case 2:
                    this.etqContenido2.setText(contenido);
                    this.etqFecha2.setText(fecha);
                    break;
            }
            cont--;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMuro = new javax.swing.JPanel();
        etqFecha2 = new javax.swing.JLabel();
        etqContenido2 = new javax.swing.JLabel();
        etqContenido3 = new javax.swing.JLabel();
        etqFecha3 = new javax.swing.JLabel();
        etqContenido4 = new javax.swing.JLabel();
        etqFecha4 = new javax.swing.JLabel();
        etqContenido5 = new javax.swing.JLabel();
        etqFecha5 = new javax.swing.JLabel();
        etqContenido6 = new javax.swing.JLabel();
        etqFecha6 = new javax.swing.JLabel();
        etqFecha7 = new javax.swing.JLabel();
        etqContenido7 = new javax.swing.JLabel();
        etqFecha8 = new javax.swing.JLabel();
        etqContenido8 = new javax.swing.JLabel();
        etqFecha9 = new javax.swing.JLabel();
        etqContenido9 = new javax.swing.JLabel();
        etqContenido10 = new javax.swing.JLabel();
        etqFecha10 = new javax.swing.JLabel();

        panelMuro.setBackground(new java.awt.Color(255, 255, 255));

        etqFecha2.setForeground(new java.awt.Color(153, 153, 153));

        etqContenido2.setToolTipText("");
        etqContenido2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqContenido3.setToolTipText("");
        etqContenido3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha3.setForeground(new java.awt.Color(153, 153, 153));

        etqContenido4.setToolTipText("");
        etqContenido4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha4.setForeground(new java.awt.Color(153, 153, 153));

        etqContenido5.setToolTipText("");
        etqContenido5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha5.setForeground(new java.awt.Color(153, 153, 153));

        etqContenido6.setToolTipText("");
        etqContenido6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha6.setForeground(new java.awt.Color(153, 153, 153));

        etqFecha7.setForeground(new java.awt.Color(153, 153, 153));

        etqContenido7.setToolTipText("");
        etqContenido7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha8.setForeground(new java.awt.Color(153, 153, 153));

        etqContenido8.setToolTipText("");
        etqContenido8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha9.setForeground(new java.awt.Color(153, 153, 153));

        etqContenido9.setToolTipText("");
        etqContenido9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqContenido10.setToolTipText("");
        etqContenido10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etqFecha10.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panelMuroLayout = new javax.swing.GroupLayout(panelMuro);
        panelMuro.setLayout(panelMuroLayout);
        panelMuroLayout.setHorizontalGroup(
            panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMuroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFecha2))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFecha3))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFecha4))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFecha5))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFecha6))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFecha7))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFecha8))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido9, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFecha9))
                    .addGroup(panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFecha10)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        panelMuroLayout.setVerticalGroup(
            panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelMuroLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqContenido10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFecha10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqContenido9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFecha9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqContenido8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFecha8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqContenido7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFecha7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqContenido6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFecha6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqContenido5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFecha5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMuroLayout.createSequentialGroup()
                        .addComponent(etqFecha4)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMuroLayout.createSequentialGroup()
                        .addComponent(etqContenido4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqFecha3)
                    .addComponent(etqContenido3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqFecha2)
                    .addComponent(etqContenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqContenido10;
    private javax.swing.JLabel etqContenido2;
    private javax.swing.JLabel etqContenido3;
    private javax.swing.JLabel etqContenido4;
    private javax.swing.JLabel etqContenido5;
    private javax.swing.JLabel etqContenido6;
    private javax.swing.JLabel etqContenido7;
    private javax.swing.JLabel etqContenido8;
    private javax.swing.JLabel etqContenido9;
    private javax.swing.JLabel etqFecha10;
    private javax.swing.JLabel etqFecha2;
    private javax.swing.JLabel etqFecha3;
    private javax.swing.JLabel etqFecha4;
    private javax.swing.JLabel etqFecha5;
    private javax.swing.JLabel etqFecha6;
    private javax.swing.JLabel etqFecha7;
    private javax.swing.JLabel etqFecha8;
    private javax.swing.JLabel etqFecha9;
    private javax.swing.JPanel panelMuro;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;
    private Viaje viaje;
}
