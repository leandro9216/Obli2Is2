package viajenda.interfaz.panel;

import viajenda.dominio.Usuario;
import viajenda.dominio.ISistema;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.border.LineBorder;
import viajenda.dominio.SistemaImp;

/**
 * La clase PanelInicio se encarga de lo referente a la interfaz de incio.
 */
public class PanelAmigos extends javax.swing.JPanel {

    public PanelAmigos(ISistema sistema) {
	initComponents();

	this.sistema = SistemaImp.getInstance();
	panelListaAmigosEnComun.setVisible(false);
	//Actualizo la lista de usuarios.
	ArrayList<Usuario> busquedaUsuarios = sistema.listadoBuscarUsuarios("");
	listaUsuarios.setListData(busquedaUsuarios.toArray());
	//Actializo la lista de amigos.
	ArrayList<Usuario> amigos = sistema.getUsuarioIdentificado().getListaAmigos();
	listaAmigos.setListData(amigos.toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarAmigos = new javax.swing.JTextField();
        etqNombreApellido = new javax.swing.JLabel();
        etqEmail = new javax.swing.JLabel();
        etqAmigosEnComun = new javax.swing.JLabel();
        scrollListaAmigos = new javax.swing.JScrollPane();
        listaAmigos = new javax.swing.JList();
        panelListaAmigosEnComun = new javax.swing.JPanel();
        scrollListaAmigosAmigosEnComun = new javax.swing.JScrollPane();
        listaAmigosEnComun = new javax.swing.JList();
        etqBusquedaAmigos = new javax.swing.JLabel();
        panelTitulo1 = new javax.swing.JPanel();
        etqTitulo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        scrollListaUsuarios = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        btnAgregar = new javax.swing.JButton();
        etqBusqueda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(400, 687));

        panelPrincipal.setBackground(new java.awt.Color(245, 245, 245));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(400, 400));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(400, 400));

        panelTitulo.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo.setMaximumSize(new java.awt.Dimension(390, 46));

        etqTitulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("Amigos");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel2.setText("Mis amigos:");

        txtBuscarAmigos.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtBuscarAmigos.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarAmigos.setText("Buscar...");
        txtBuscarAmigos.setToolTipText("");
        txtBuscarAmigos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtBuscarAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarAmigosActionPerformed(evt);
            }
        });
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

        listaAmigos.setToolTipText("");
        listaAmigos.setFocusable(false);
        listaAmigos.setSelectionBackground(new java.awt.Color(39, 39, 39));
        listaAmigos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAmigosValueChanged(evt);
            }
        });
        scrollListaAmigos.setViewportView(listaAmigos);

        panelListaAmigosEnComun.setBackground(new java.awt.Color(255, 255, 255));

        listaAmigosEnComun.setToolTipText("");
        listaAmigosEnComun.setFocusable(false);
        listaAmigosEnComun.setSelectionBackground(new java.awt.Color(39, 39, 39));
        listaAmigosEnComun.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAmigosEnComunValueChanged(evt);
            }
        });
        scrollListaAmigosAmigosEnComun.setViewportView(listaAmigosEnComun);

        javax.swing.GroupLayout panelListaAmigosEnComunLayout = new javax.swing.GroupLayout(panelListaAmigosEnComun);
        panelListaAmigosEnComun.setLayout(panelListaAmigosEnComunLayout);
        panelListaAmigosEnComunLayout.setHorizontalGroup(
            panelListaAmigosEnComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollListaAmigosAmigosEnComun, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );
        panelListaAmigosEnComunLayout.setVerticalGroup(
            panelListaAmigosEnComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListaAmigosEnComunLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(scrollListaAmigosAmigosEnComun, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        etqBusquedaAmigos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etqBusquedaAmigos.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollListaAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(etqBusquedaAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtBuscarAmigos))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etqNombreApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(etqEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqAmigosEnComun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panelListaAmigosEnComun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(etqNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etqAmigosEnComun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelListaAmigosEnComun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollListaAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(etqBusquedaAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
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

        panelTitulo1.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo1.setMaximumSize(new java.awt.Dimension(390, 46));

        etqTitulo1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo1.setText("Buscar amigos");

        javax.swing.GroupLayout panelTitulo1Layout = new javax.swing.GroupLayout(panelTitulo1);
        panelTitulo1.setLayout(panelTitulo1Layout);
        panelTitulo1Layout.setHorizontalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo1)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        panelTitulo1Layout.setVerticalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel1.setText("Nombre:");

        txtBuscar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setText("Buscar nombre...");
        txtBuscar.setToolTipText("");
        txtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarFocusLost(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        listaUsuarios.setToolTipText("");
        listaUsuarios.setFocusable(false);
        listaUsuarios.setSelectionBackground(new java.awt.Color(39, 39, 39));
        listaUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaUsuariosValueChanged(evt);
            }
        });
        scrollListaUsuarios.setViewportView(listaUsuarios);

        btnAgregar.setBackground(new java.awt.Color(242, 242, 242));
        btnAgregar.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnAgregar.setText("Agregar a mis amigos");
        btnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        etqBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etqBusqueda.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(300, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqBusqueda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                        .addGap(220, 220, 220))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(257, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(scrollListaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(scrollListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        // Code adding the component to the parent container - not shown here
        txtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscar.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscar.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtBuscar.isFocusOwner()) {
                    txtBuscar.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtBuscar.isFocusOwner()) {
                    txtBuscar.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTitulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
	txtBuscar.setText("");
	txtBuscar.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtBuscarFocusGained

    private void txtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusLost
	if (txtBuscar.getText().equals("")) {
	    txtBuscar.setText("Buscar nombre...");
	    txtBuscar.setForeground(Color.GRAY);
	}
    }//GEN-LAST:event_txtBuscarFocusLost

    private void listaUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaUsuariosValueChanged
	// TODO add your handling code here:
    }//GEN-LAST:event_listaUsuariosValueChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
	if (!listaUsuarios.isSelectionEmpty()) {
	    Usuario usuario = (Usuario) listaUsuarios.getSelectedValue();
	    sistema.getUsuarioIdentificado().agregarAmigo(usuario);
            usuario.agregarAmigo(sistema.getUsuarioIdentificado());
	    //Actualizo la lista de usuarios.
	    ArrayList<Usuario> busquedaUsuarios = sistema.listadoBuscarUsuarios("");
	    listaUsuarios.setListData(busquedaUsuarios.toArray());
	    //Actializo la lista de amigos.
	    ArrayList<Usuario> listaDeAmigos = sistema.getUsuarioIdentificado().getListaAmigos();
	    listaAmigos.setListData(listaDeAmigos.toArray());
	}
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void listaAmigosEnComunValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAmigosEnComunValueChanged
    }//GEN-LAST:event_listaAmigosEnComunValueChanged

    private void txtBuscarAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarAmigosActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarAmigosActionPerformed

    private void txtBuscarAmigosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarAmigosFocusGained
	txtBuscarAmigos.setText("");
	txtBuscarAmigos.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtBuscarAmigosFocusGained

    private void txtBuscarAmigosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarAmigosFocusLost
	if (txtBuscarAmigos.getText().equals("")) {
	    txtBuscarAmigos.setText("Buscar...");
	    txtBuscarAmigos.setForeground(Color.GRAY);
	}
    }//GEN-LAST:event_txtBuscarAmigosFocusLost

    private void listaAmigosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAmigosValueChanged
	if (!listaAmigos.isSelectionEmpty()) {
	    Usuario aux = (Usuario) listaAmigos.getSelectedValue();
	    String nombre = aux.getNombre();
	    String apellido = aux.getApellido();
	    String email = aux.getEmail().toString();
	    etqNombreApellido.setText(nombre + "  " + apellido);
	    etqEmail.setText(email);

	    ArrayList<Usuario> lista = sistema.getUsuarioIdentificado().listadoAmigosEnComun(aux);
	    if (!lista.isEmpty()) {
		int cantAmigosEnComun = lista.size();
		etqAmigosEnComun.setText(cantAmigosEnComun + " amigo(s) en común.");
		panelListaAmigosEnComun.setVisible(true);
		listaAmigosEnComun.setListData(lista.toArray());
	    } else {
		etqAmigosEnComun.setText(null);
		panelListaAmigosEnComun.setVisible(false);
	    }
	} else {
	    etqNombreApellido.setText("");
	    etqEmail.setText("");
	    etqAmigosEnComun.setText("");
	    panelListaAmigosEnComun.setVisible(false);
	}
    }//GEN-LAST:event_listaAmigosValueChanged

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
	String texto = txtBuscar.getText();
	if (!txtBuscar.getText().equals("Buscar nombre...")) {
	    ArrayList<Usuario> busquedaUsuarios = sistema.listadoBuscarUsuarios(texto);
	    if (!busquedaUsuarios.isEmpty()) {
		etqBusqueda.setText(null);
	    } else {
		etqBusqueda.setText("No se encontraron resultados.");
	    }
	    listaUsuarios.setListData(busquedaUsuarios.toArray());
	} else {
	    etqBusqueda.setText(null);
	}
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarAmigosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAmigosKeyReleased
	String texto = txtBuscarAmigos.getText();
	if (!txtBuscarAmigos.getText().equals("Buscar...")) {
	    ArrayList<Usuario> busquedaAmigos = sistema.getUsuarioIdentificado().listadoBuscarAmigos(texto);
	    if (!busquedaAmigos.isEmpty()) {
		etqBusquedaAmigos.setText(null);
	    } else {
		etqBusquedaAmigos.setText("No hubo resultados.");
	    }
	    listaAmigos.setListData(busquedaAmigos.toArray());
	} else {
	    etqBusquedaAmigos.setText(null);
	    ArrayList<Usuario> listaDeAmigos = sistema.getUsuarioIdentificado().getListaAmigos();
	    listaAmigos.setListData(listaDeAmigos.toArray());
	}
    }//GEN-LAST:event_txtBuscarAmigosKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel etqAmigosEnComun;
    private javax.swing.JLabel etqBusqueda;
    private javax.swing.JLabel etqBusquedaAmigos;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombreApellido;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqTitulo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList listaAmigos;
    private javax.swing.JList listaAmigosEnComun;
    private javax.swing.JList listaUsuarios;
    private javax.swing.JPanel panelListaAmigosEnComun;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTitulo1;
    private javax.swing.JScrollPane scrollListaAmigos;
    private javax.swing.JScrollPane scrollListaAmigosAmigosEnComun;
    private javax.swing.JScrollPane scrollListaUsuarios;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarAmigos;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;
}
