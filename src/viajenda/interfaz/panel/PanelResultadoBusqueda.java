package viajenda.interfaz.panel;

import viajenda.dominio.SistemaImp;

/**
 * La clase PanelInicio se encarga de lo referente a la interfaz de incio.
 */
public class PanelResultadoBusqueda extends javax.swing.JPanel {

    public PanelResultadoBusqueda(String[] resultado) {
        initComponents();

        this.panelTitulo1.setVisible(false);
        this.panelContenido1.setVisible(false);
        this.panelTitulo2.setVisible(false);
        this.panelContenido2.setVisible(false);
        this.panelTitulo3.setVisible(false);
        this.panelContenido3.setVisible(false);
        this.panelTitulo4.setVisible(false);
        this.panelContenido4.setVisible(false);


        if (resultado[1] != null) {
            this.panelTitulo1.setVisible(true);
            this.etqTitulo1.setText(resultado[0]);

            this.panelContenido1.setVisible(true);
            this.etqInterpretacion.setText(resultado[1]);
        }
        if (resultado[3] != null) {
            this.panelTitulo2.setVisible(true);
            this.etqTitulo2.setText(resultado[2]);

            this.panelContenido2.setVisible(true);
            resultado[3] = "<html>" + resultado[3] + "</html>";
            resultado[3] = resultado[3].replaceAll("\n", "<br>");
            this.etqResultado2.setText(resultado[3]);
        }
        if (resultado[5] != null) {
            this.panelTitulo3.setVisible(true);
            this.etqTitulo3.setText(resultado[4]);

            this.panelContenido3.setVisible(true);
            resultado[5] = "<html>" + resultado[5] + "</html>";
            resultado[5] = resultado[5].replaceAll("\n", "<br>");
            this.etqResultado3.setText(resultado[5]);
        }
        if (resultado[7] != null) {
            this.panelTitulo4.setVisible(true);
            this.etqTitulo4.setText(resultado[6]);

            this.panelContenido4.setVisible(true);
            resultado[7] = "<html>" + resultado[7] + "</html>";
            resultado[7] = resultado[7].replaceAll("\n", "<br>");
            this.etqResultado4.setText(resultado[7]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo1 = new javax.swing.JPanel();
        etqTitulo1 = new javax.swing.JLabel();
        panelContenido1 = new javax.swing.JPanel();
        etqInterpretacion = new javax.swing.JLabel();
        panelTitulo2 = new javax.swing.JPanel();
        etqTitulo2 = new javax.swing.JLabel();
        panelContenido2 = new javax.swing.JPanel();
        etqResultado2 = new javax.swing.JLabel();
        panelTitulo3 = new javax.swing.JPanel();
        etqTitulo3 = new javax.swing.JLabel();
        panelContenido3 = new javax.swing.JPanel();
        etqResultado3 = new javax.swing.JLabel();
        panelTitulo4 = new javax.swing.JPanel();
        etqTitulo4 = new javax.swing.JLabel();
        panelContenido4 = new javax.swing.JPanel();
        etqResultado4 = new javax.swing.JLabel();
        etqReultado5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 687));
        setMinimumSize(new java.awt.Dimension(400, 687));
        setPreferredSize(new java.awt.Dimension(400, 687));

        panelPrincipal.setBackground(new java.awt.Color(245, 245, 245));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(400, 400));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(400, 400));

        panelTitulo1.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo1.setMaximumSize(new java.awt.Dimension(390, 46));

        etqTitulo1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        etqTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo1.setText(" ");

        javax.swing.GroupLayout panelTitulo1Layout = new javax.swing.GroupLayout(panelTitulo1);
        panelTitulo1.setLayout(panelTitulo1Layout);
        panelTitulo1Layout.setHorizontalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitulo1Layout.setVerticalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelContenido1.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));

        javax.swing.GroupLayout panelContenido1Layout = new javax.swing.GroupLayout(panelContenido1);
        panelContenido1.setLayout(panelContenido1Layout);
        panelContenido1Layout.setHorizontalGroup(
            panelContenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqInterpretacion, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContenido1Layout.setVerticalGroup(
            panelContenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqInterpretacion, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTitulo2.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo2.setMaximumSize(new java.awt.Dimension(390, 46));

        etqTitulo2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        etqTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo2.setText(" ");

        javax.swing.GroupLayout panelTitulo2Layout = new javax.swing.GroupLayout(panelTitulo2);
        panelTitulo2.setLayout(panelTitulo2Layout);
        panelTitulo2Layout.setHorizontalGroup(
            panelTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitulo2Layout.setVerticalGroup(
            panelTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelContenido2.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));

        etqResultado2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etqResultado2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelContenido2Layout = new javax.swing.GroupLayout(panelContenido2);
        panelContenido2.setLayout(panelContenido2Layout);
        panelContenido2Layout.setHorizontalGroup(
            panelContenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenido2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqResultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContenido2Layout.setVerticalGroup(
            panelContenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenido2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqResultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTitulo3.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo3.setMaximumSize(new java.awt.Dimension(390, 46));

        etqTitulo3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        etqTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo3.setText(" ");

        javax.swing.GroupLayout panelTitulo3Layout = new javax.swing.GroupLayout(panelTitulo3);
        panelTitulo3.setLayout(panelTitulo3Layout);
        panelTitulo3Layout.setHorizontalGroup(
            panelTitulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitulo3Layout.setVerticalGroup(
            panelTitulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelContenido3.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));

        etqResultado3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etqResultado3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelContenido3Layout = new javax.swing.GroupLayout(panelContenido3);
        panelContenido3.setLayout(panelContenido3Layout);
        panelContenido3Layout.setHorizontalGroup(
            panelContenido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenido3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqResultado3, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContenido3Layout.setVerticalGroup(
            panelContenido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenido3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqResultado3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
        );

        panelTitulo4.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo4.setMaximumSize(new java.awt.Dimension(390, 46));

        etqTitulo4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        etqTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo4.setText(" ");

        javax.swing.GroupLayout panelTitulo4Layout = new javax.swing.GroupLayout(panelTitulo4);
        panelTitulo4.setLayout(panelTitulo4Layout);
        panelTitulo4Layout.setHorizontalGroup(
            panelTitulo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo4, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitulo4Layout.setVerticalGroup(
            panelTitulo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelContenido4.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));

        etqResultado4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etqResultado4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelContenido4Layout = new javax.swing.GroupLayout(panelContenido4);
        panelContenido4.setLayout(panelContenido4Layout);
        panelContenido4Layout.setHorizontalGroup(
            panelContenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenido4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqResultado4, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContenido4Layout.setVerticalGroup(
            panelContenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenido4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqResultado4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
        );

        etqReultado5.setText("*Si se está utilizando un proxy la búsqueda solo funcionará en inglés.");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContenido3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTitulo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenido2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTitulo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTitulo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenido4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etqReultado5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqReultado5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqInterpretacion;
    private javax.swing.JLabel etqResultado2;
    private javax.swing.JLabel etqResultado3;
    private javax.swing.JLabel etqResultado4;
    private javax.swing.JLabel etqReultado5;
    private javax.swing.JLabel etqTitulo1;
    private javax.swing.JLabel etqTitulo2;
    private javax.swing.JLabel etqTitulo3;
    private javax.swing.JLabel etqTitulo4;
    private javax.swing.JPanel panelContenido1;
    private javax.swing.JPanel panelContenido2;
    private javax.swing.JPanel panelContenido3;
    private javax.swing.JPanel panelContenido4;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo1;
    private javax.swing.JPanel panelTitulo2;
    private javax.swing.JPanel panelTitulo3;
    private javax.swing.JPanel panelTitulo4;
    // End of variables declaration//GEN-END:variables
}
