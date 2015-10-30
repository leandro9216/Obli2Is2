package viajenda.interfaz.panel;

import viajenda.dominio.ISistema;
import viajenda.excepciones.fecha.FechaException;
import viajenda.excepciones.viaje.ViajeException;
import java.awt.Color;
import java.util.Iterator;
import javax.swing.border.LineBorder;
import viajenda.dominio.SistemaImp;

/**
 *
 */
public class PanelAgendarViaje extends javax.swing.JPanel {

    public PanelAgendarViaje(ISistema sistema) {
        initComponents();
        this.sistema = SistemaImp.getInstance();
        Iterator<String> listado = sistema.listadoDestino();
        while(listado.hasNext()){
            String ciudad=listado.next();
            comboDestino.addItem(ciudad);
        }
        
        if (this.sistema.esModoDesarrollador()) {
            this.txtNombre.requestFocusInWindow();
            this.txtNombre.setText("Vacaciones");
            this.txtDescripcion.setText("Nos vamos de vacaciones con la familia.");
            this.txtAñoFin.setText("2014");
            this.txtAñoIni.setText("2012");
            this.txtMesFin.setText("3");
            this.txtDiaFin.setText("17");
            this.txtDiaIni.setText("21");
            this.txtMesIni.setText("12");
        } else {
            this.txtNombre.requestFocusInWindow();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        panelCrearJugador = new javax.swing.JPanel();
        txtMesIni = new javax.swing.JTextField();
        etqDestino = new javax.swing.JLabel();
        etqFechaIni = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        etqError = new javax.swing.JLabel();
        etqCorrecto = new javax.swing.JLabel();
        comboDestino = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtDiaIni = new javax.swing.JTextField();
        txtAñoIni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etqFechaFin = new javax.swing.JLabel();
        txtDiaFin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMesFin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAñoFin = new javax.swing.JTextField();
        etqDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        etqNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(460, 679));

        panelPrincipal.setBackground(new java.awt.Color(245, 245, 245));

        panelTitulo.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo.setForeground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("Agendar viaje");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCrearJugador.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearJugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));
        panelCrearJugador.setMaximumSize(new java.awt.Dimension(380, 290));
        panelCrearJugador.setPreferredSize(new java.awt.Dimension(380, 290));

        txtMesIni.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtMesIni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtMesIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesIniActionPerformed(evt);
            }
        });
        txtMesIni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMesIniFocusGained(evt);
            }
        });
        txtMesIni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMesIni.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMesIni.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtMesIni.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtMesIni.isFocusOwner()) {
                    txtMesIni.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtMesIni.isFocusOwner()) {
                    txtMesIni.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqDestino.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        etqDestino.setText("Destino:");

        etqFechaIni.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        etqFechaIni.setText("Fecha inicio:");

        btnAceptar.setBackground(new java.awt.Color(242, 242, 242));
        btnAceptar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAceptar.setText("Agendar");
        btnAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.setFocusPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        etqError.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etqError.setForeground(new java.awt.Color(204, 0, 0));
        etqError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        etqCorrecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etqCorrecto.setForeground(new java.awt.Color(0, 153, 0));

        jLabel1.setText("/");

        txtDiaIni.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDiaIni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtDiaIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaIniActionPerformed(evt);
            }
        });
        txtDiaIni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaIniFocusGained(evt);
            }
        });
        txtDiaIni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaIni.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaIni.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtDiaIni.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtDiaIni.isFocusOwner()) {
                    txtDiaIni.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtDiaIni.isFocusOwner()) {
                    txtDiaIni.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        txtAñoIni.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtAñoIni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtAñoIni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAñoIniFocusGained(evt);
            }
        });
        txtAñoIni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAñoIni.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAñoIni.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtAñoIni.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtAñoIni.isFocusOwner()) {
                    txtAñoIni.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtAñoIni.isFocusOwner()) {
                    txtAñoIni.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        jLabel2.setText("/");

        etqFechaFin.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        etqFechaFin.setText("Fecha fin:");

        txtDiaFin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDiaFin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtDiaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaFinActionPerformed(evt);
            }
        });
        txtDiaFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaFinFocusGained(evt);
            }
        });
        txtDiaFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaFin.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaFin.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtDiaFin.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtDiaFin.isFocusOwner()) {
                    txtDiaFin.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtDiaFin.isFocusOwner()) {
                    txtDiaFin.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        jLabel3.setText("/");

        txtMesFin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtMesFin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtMesFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesFinActionPerformed(evt);
            }
        });
        txtMesFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMesFinFocusGained(evt);
            }
        });
        txtMesFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMesFin.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMesFin.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtMesFin.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtMesFin.isFocusOwner()) {
                    txtMesFin.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtMesFin.isFocusOwner()) {
                    txtMesFin.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        jLabel4.setText("/");

        txtAñoFin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtAñoFin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtAñoFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoFinActionPerformed(evt);
            }
        });
        txtAñoFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAñoFinFocusGained(evt);
            }
        });
        txtAñoFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAñoFin.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAñoFin.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtAñoFin.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtAñoFin.isFocusOwner()) {
                    txtAñoFin.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtAñoFin.isFocusOwner()) {
                    txtAñoFin.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqDescripcion.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        etqDescripcion.setText("Descripción:");

        txtDescripcion.setText("Vamos toda la familia de vacaciones.");
        jScrollPane2.setViewportView(txtDescripcion);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcion.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcion.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtDescripcion.isFocusOwner()) {
                    txtDescripcion.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtDescripcion.isFocusOwner()) {
                    txtDescripcion.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqNombre.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        etqNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombre.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombre.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtNombre.isFocusOwner()) {
                    txtNombre.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtNombre.isFocusOwner()) {
                    txtNombre.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        javax.swing.GroupLayout panelCrearJugadorLayout = new javax.swing.GroupLayout(panelCrearJugador);
        panelCrearJugador.setLayout(panelCrearJugadorLayout);
        panelCrearJugadorLayout.setHorizontalGroup(
            panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqFechaIni)
                                    .addComponent(etqFechaFin)
                                    .addComponent(etqDescripcion)
                                    .addComponent(etqNombre))
                                .addGap(38, 38, 38)
                                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboDestino, 0, 282, Short.MAX_VALUE)
                                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCrearJugadorLayout.createSequentialGroup()
                                                .addComponent(txtDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAñoFin))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCrearJugadorLayout.createSequentialGroup()
                                                .addComponent(txtDiaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMesIni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAñoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 150, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                            .addComponent(etqCorrecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)))
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCrearJugadorLayout.setVerticalGroup(
            panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addComponent(etqFechaIni)
                        .addGap(26, 26, 26)
                        .addComponent(etqFechaFin))
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMesIni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAñoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAñoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(36, 36, 36)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDescripcion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(etqCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCrearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCrearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String destino = (String) comboDestino.getSelectedItem();

        
        String nombre = txtNombre.getText();
        String diaIni = txtDiaIni.getText();
        String mesIni = txtMesIni.getText();
        String añoIni = txtAñoIni.getText();
        String diaFin = txtDiaFin.getText();
        String mesFin = txtMesFin.getText();
        String añoFin = txtAñoFin.getText();

        String descripcion = txtDescripcion.getText();

        try {
            sistema.getUsuarioIdentificado().altaViaje(nombre, destino, diaIni, mesIni, añoIni, diaFin, mesFin, añoFin, descripcion);
            etqCorrecto.setText("Registro exitoso.");
            etqError.setText(null);
            this.inhabilitarCampos();
        } catch (ViajeException e) {
            etqError.setText(e.toString());
        } catch (FechaException e) {
            etqError.setText(e.toString());
        }
}//GEN-LAST:event_btnAceptarActionPerformed

    private void txtMesIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesIniActionPerformed

    private void txtMesFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesFinActionPerformed

    private void txtAñoFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoFinActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtDiaIniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaIniFocusGained
        if (txtDiaIni.getText().equals("DD")) {
            txtDiaIni.setText("");
        }
    }//GEN-LAST:event_txtDiaIniFocusGained

    private void txtMesIniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesIniFocusGained
        if (txtMesIni.getText().equals("MM")) {
            txtMesIni.setText("");
        }
    }//GEN-LAST:event_txtMesIniFocusGained

    private void txtAñoIniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoIniFocusGained
        if (txtAñoIni.getText().equals("AAAA")) {
            txtAñoIni.setText("");
        }
    }//GEN-LAST:event_txtAñoIniFocusGained

    private void txtDiaFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaFinFocusGained
        if (txtDiaFin.getText().equals("DD")) {
            txtDiaFin.setText("");
        }
    }//GEN-LAST:event_txtDiaFinFocusGained

    private void txtMesFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesFinFocusGained
        if (txtMesFin.getText().equals("MM")) {
            txtMesFin.setText("");
        }
    }//GEN-LAST:event_txtMesFinFocusGained

    private void txtAñoFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoFinFocusGained
        if (txtAñoFin.getText().equals("AAAA")) {
            txtAñoFin.setText("");
        }
    }//GEN-LAST:event_txtAñoFinFocusGained

    private void txtDiaIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaIniActionPerformed

    private void txtDiaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaFinActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox comboDestino;
    private javax.swing.JLabel etqCorrecto;
    private javax.swing.JLabel etqDescripcion;
    private javax.swing.JLabel etqDestino;
    private javax.swing.JLabel etqError;
    private javax.swing.JLabel etqFechaFin;
    private javax.swing.JLabel etqFechaIni;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelCrearJugador;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField txtAñoFin;
    private javax.swing.JTextField txtAñoIni;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtDiaFin;
    private javax.swing.JTextField txtDiaIni;
    private javax.swing.JTextField txtMesFin;
    private javax.swing.JTextField txtMesIni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;

    /**
     * Inhabilita los campos de ingeso de datos.
     */
    private void inhabilitarCampos() {
        txtDiaIni.setEditable(false);
        txtMesIni.setEditable(false);
        txtAñoIni.setEditable(false);
        txtDiaFin.setEditable(false);
        txtMesFin.setEditable(false);
        txtAñoFin.setEditable(false);
        txtDescripcion.setEditable(false);
        txtNombre.setEditable(false);
        btnAceptar.setEnabled(false);
    }
}
