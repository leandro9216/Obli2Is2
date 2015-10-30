package viajenda.interfaz.ventana;

import viajenda.excepciones.usuario.UsuarioException;
import viajenda.excepciones.usuario.EmailInvalidoException;
import viajenda.excepciones.usuario.NombreVacioException;
import viajenda.excepciones.usuario.NombreUsuarioVacioException;
import viajenda.excepciones.usuario.LargoApellidoInvalidoException;
import viajenda.excepciones.usuario.LargoClaveInvalidoException;
import viajenda.excepciones.usuario.ApellidoVacioException;
import viajenda.excepciones.usuario.LargoNombreInvalidoException;
import viajenda.excepciones.usuario.LargoNombreUsuarioInvalidoException;
import viajenda.excepciones.usuario.ClaveInseguraException;
import viajenda.dominio.Email;
import viajenda.dominio.ISistema;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.border.LineBorder;
import viajenda.dominio.SistemaImp;

/**
 */
public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin(ISistema sistema) {
        this.sistema = SistemaImp.getInstance();

        /*
         * Icono de la ventana.
         */
        BufferedImage image;
        try {
            image = ImageIO.read(getClass().getResource("/viajenda/interfaz/img/icono.png"));
            setIconImage(image);
        } catch (IOException e) {
        }

        initComponents();
        if (this.sistema.esModoDesarrollador()) {
            txtUsuario.requestFocusInWindow();
            txtUsuario.setText("Angus");
            this.pwdContraseñaLogin.setText("angus2012");
            
            txtNombreRegistro.setText("John Henry");
            txtApellidoRegistro.setText("Bonham");
            txtUsuarioRegistro.setText("Bonzo");
            this.pwdContraseñaRegistro.setText("zosozepp73");
            this.txtEmailRegistro.setText("bonzo.zepp@gmail.com");
        } else {
            txtUsuario.requestFocusInWindow();
            txtNombreRegistro.setText("Nombre");
            txtNombreRegistro.setForeground(Color.GRAY);
            txtApellidoRegistro.setText("Apellido");
            txtApellidoRegistro.setForeground(Color.GRAY);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etqUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        etqContraseña = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        etqErrorLogin = new javax.swing.JLabel();
        pwdContraseñaLogin = new javax.swing.JPasswordField();
        panelTitulo1 = new javax.swing.JPanel();
        etqTitulo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etqNormbreRegistro = new javax.swing.JLabel();
        txtEmailRegistro = new javax.swing.JTextField();
        etqEmailRegistro = new javax.swing.JLabel();
        txtApellidoRegistro = new javax.swing.JTextField();
        btnAceptarRegistro = new javax.swing.JButton();
        etqErrorRegistro = new javax.swing.JLabel();
        txtNombreRegistro = new javax.swing.JTextField();
        etqUsuarioRegistro = new javax.swing.JLabel();
        txtUsuarioRegistro = new javax.swing.JTextField();
        etqContraseñaRegistro = new javax.swing.JLabel();
        pwdContraseñaRegistro = new javax.swing.JPasswordField();
        etqCorrecto = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viajenda");
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setVerifyInputWhenFocusTarget(false);

        panelTitulo.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo.setMaximumSize(new java.awt.Dimension(390, 46));

        etqTitulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("Login");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));

        etqUsuario.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqUsuario.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuario.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuario.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtUsuario.isFocusOwner()) {
                    txtUsuario.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtUsuario.isFocusOwner()) {
                    txtUsuario.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqContraseña.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqContraseña.setText("Contraseña:");

        btnAceptar.setBackground(new java.awt.Color(242, 242, 242));
        btnAceptar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(102, 102, 102));
        btnAceptar.setText("Acceder");
        btnAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.setFocusPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        etqErrorLogin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etqErrorLogin.setForeground(new java.awt.Color(204, 0, 0));
        etqErrorLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pwdContraseñaLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        pwdContraseñaLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdContraseñaLogin.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdContraseñaLogin.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        pwdContraseñaLogin.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!pwdContraseñaLogin.isFocusOwner()) {
                    pwdContraseñaLogin.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!pwdContraseñaLogin.isFocusOwner()) {
                    pwdContraseñaLogin.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });
        pwdContraseñaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdContraseñaLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqContraseña)
                            .addComponent(etqUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(pwdContraseñaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqErrorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqErrorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqContraseña)
                    .addComponent(pwdContraseñaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panelTitulo1.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo1.setMaximumSize(new java.awt.Dimension(390, 46));

        etqTitulo1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo1.setText("Registro");

        javax.swing.GroupLayout panelTitulo1Layout = new javax.swing.GroupLayout(panelTitulo1);
        panelTitulo1.setLayout(panelTitulo1Layout);
        panelTitulo1Layout.setHorizontalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo1)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        panelTitulo1Layout.setVerticalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));

        etqNormbreRegistro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqNormbreRegistro.setText("Nombre:");

        txtEmailRegistro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEmailRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtEmailRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailRegistroActionPerformed(evt);
            }
        });
        txtEmailRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailRegistroKeyReleased(evt);
            }
        });
        txtEmailRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailRegistro.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailRegistro.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtEmailRegistro.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtEmailRegistro.isFocusOwner()) {
                    txtEmailRegistro.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtEmailRegistro.isFocusOwner()) {
                    txtEmailRegistro.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqEmailRegistro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqEmailRegistro.setText("E-mail:");

        txtApellidoRegistro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtApellidoRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtApellidoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoRegistroActionPerformed(evt);
            }
        });
        txtApellidoRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoRegistroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoRegistroFocusLost(evt);
            }
        });
        txtApellidoRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoRegistro.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoRegistro.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtApellidoRegistro.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtApellidoRegistro.isFocusOwner()) {
                    txtApellidoRegistro.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtApellidoRegistro.isFocusOwner()) {
                    txtApellidoRegistro.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        btnAceptarRegistro.setBackground(new java.awt.Color(242, 242, 242));
        btnAceptarRegistro.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAceptarRegistro.setForeground(new java.awt.Color(102, 102, 102));
        btnAceptarRegistro.setText("Registro");
        btnAceptarRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnAceptarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptarRegistro.setFocusPainted(false);
        btnAceptarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRegistroActionPerformed(evt);
            }
        });

        etqErrorRegistro.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etqErrorRegistro.setForeground(new java.awt.Color(204, 0, 0));
        etqErrorRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtNombreRegistro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombreRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtNombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegistroActionPerformed(evt);
            }
        });
        txtNombreRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreRegistroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreRegistroFocusLost(evt);
            }
        });
        txtNombreRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreRegistro.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreRegistro.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtNombreRegistro.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtUsuarioRegistro.isFocusOwner()) {
                    txtNombreRegistro.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtUsuarioRegistro.isFocusOwner()) {
                    txtNombreRegistro.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqUsuarioRegistro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqUsuarioRegistro.setText("Usuario:");

        txtUsuarioRegistro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsuarioRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtUsuarioRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioRegistroActionPerformed(evt);
            }
        });
        txtUsuarioRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioRegistroKeyReleased(evt);
            }
        });
        txtUsuarioRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioRegistro.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioRegistro.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtUsuarioRegistro.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtUsuarioRegistro.isFocusOwner()) {
                    txtUsuarioRegistro.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtUsuarioRegistro.isFocusOwner()) {
                    txtUsuarioRegistro.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqContraseñaRegistro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqContraseñaRegistro.setText("Contraseña:");

        pwdContraseñaRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        pwdContraseñaRegistro.setMinimumSize(new java.awt.Dimension(2, 21));
        pwdContraseñaRegistro.setPreferredSize(new java.awt.Dimension(2, 21));
        pwdContraseñaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdContraseñaRegistroActionPerformed(evt);
            }
        });
        pwdContraseñaRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdContraseñaRegistro.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdContraseñaRegistro.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        pwdContraseñaRegistro.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!pwdContraseñaRegistro.isFocusOwner()) {
                    pwdContraseñaRegistro.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!pwdContraseñaRegistro.isFocusOwner()) {
                    pwdContraseñaRegistro.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqCorrecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etqCorrecto.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                            .addComponent(etqNormbreRegistro)
                            .addComponent(etqEmailRegistro)
                            .addComponent(etqUsuarioRegistro)
                            .addComponent(etqContraseñaRegistro)
                            .addComponent(etqCorrecto, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(etqErrorRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmailRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(pwdContraseñaRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addComponent(btnAceptarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etqErrorRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqNormbreRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etqUsuarioRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqContraseñaRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(etqEmailRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(etqCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnAceptarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        imgLogo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        imgLogo.setForeground(new java.awt.Color(204, 204, 204));
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viajenda/interfaz/img/AvionInicio.png"))); // NOI18N
        imgLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(imgLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarSistema();
    }//GEN-LAST:event_formWindowClosing

    private void txtEmailRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRegistroActionPerformed

    private void txtEmailRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailRegistroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRegistroKeyReleased

    private void btnAceptarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRegistroActionPerformed
        if (txtNombreRegistro.getText().equals("Nombre")) {
            txtNombreRegistro.setText("");
        }
        if (txtApellidoRegistro.getText().equals("Apellido")) {
            txtApellidoRegistro.setText("");
        }
        String nombre = txtNombreRegistro.getText();
        String apellido = txtApellidoRegistro.getText();
        String usuario = txtUsuarioRegistro.getText();
        String contraseña = pwdContraseñaRegistro.getText();
        Email email = new Email(txtEmailRegistro.getText());

        try {
            sistema.altaUsuario(usuario, contraseña, email, nombre, apellido);

            sistema.identificacionUsuario(usuario, contraseña);

            VentanaMenu ventanaMenu = new VentanaMenu(sistema, txtUsuarioRegistro.getText());
            ventanaMenu.setLocationRelativeTo(null); // Centrar ventana.
            ventanaMenu.setVisible(true);
            this.setVisible(false);

        } catch (UsuarioException e) {
            if (txtNombreRegistro.getText().equals("")) {
                txtNombreRegistro.setText("Nombre");
            }
            if (txtApellidoRegistro.getText().equals("")) {
                txtApellidoRegistro.setText("Apellido");
            }
            etqErrorRegistro.setText(e.toString());

            //Focus en el campo generador de error.
            if (e.getClass() == ClaveInseguraException.class || e.getClass() == LargoClaveInvalidoException.class) {
                pwdContraseñaRegistro.requestFocusInWindow();
            } else if (e.getClass() == EmailInvalidoException.class) {
                txtEmailRegistro.requestFocusInWindow();
            } else if (e.getClass() == LargoApellidoInvalidoException.class || e.getClass() == ApellidoVacioException.class) {
                txtApellidoRegistro.requestFocusInWindow();
            } else if (e.getClass() == LargoNombreInvalidoException.class || e.getClass() == NombreVacioException.class) {
                txtNombreRegistro.requestFocusInWindow();
            } else if (e.getClass() == LargoNombreUsuarioInvalidoException.class || e.getClass() == NombreUsuarioVacioException.class) {
                txtUsuarioRegistro.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_btnAceptarRegistroActionPerformed

    private void txtUsuarioRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioRegistroActionPerformed

    private void txtUsuarioRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioRegistroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioRegistroKeyReleased

    private void pwdContraseñaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdContraseñaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdContraseñaRegistroActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String usuario = txtUsuario.getText();
        String contraseña = pwdContraseñaLogin.getText();

        try {
            sistema.identificacionUsuario(usuario, contraseña);

            VentanaMenu ventanaMenu = new VentanaMenu(sistema, txtUsuario.getText());
            ventanaMenu.setLocationRelativeTo(null); // Centrar ventana.
            ventanaMenu.setVisible(true);
            this.setVisible(false);
        } catch (UsuarioException e) {
            etqErrorLogin.setText(e.toString());
            txtUsuario.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtApellidoRegistroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoRegistroFocusGained
        if (txtApellidoRegistro.getText().equals("Apellido")) {
            txtApellidoRegistro.setText(null);
        }
        txtApellidoRegistro.setForeground(Color.black);
    }//GEN-LAST:event_txtApellidoRegistroFocusGained

    private void txtNombreRegistroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreRegistroFocusGained
        if (txtNombreRegistro.getText().equals("Nombre")) {
            txtNombreRegistro.setText(null);
        }
        txtNombreRegistro.setForeground(Color.black);
    }//GEN-LAST:event_txtNombreRegistroFocusGained

    private void txtNombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegistroActionPerformed

    private void txtApellidoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoRegistroActionPerformed

    private void txtNombreRegistroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreRegistroFocusLost
        if (txtNombreRegistro.getText().equals("")) {
            txtNombreRegistro.setText("Nombre");
            txtNombreRegistro.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtNombreRegistroFocusLost

    private void txtApellidoRegistroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoRegistroFocusLost
        if (txtApellidoRegistro.getText().equals("")) {
            txtApellidoRegistro.setText("Apellido");
            txtApellidoRegistro.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtApellidoRegistroFocusLost

    private void pwdContraseñaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdContraseñaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdContraseñaLoginActionPerformed

    /*
     * Eventos menú barra superior.
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptarRegistro;
    private javax.swing.JLabel etqContraseña;
    private javax.swing.JLabel etqContraseñaRegistro;
    private javax.swing.JLabel etqCorrecto;
    private javax.swing.JLabel etqEmailRegistro;
    private javax.swing.JLabel etqErrorLogin;
    private javax.swing.JLabel etqErrorRegistro;
    private javax.swing.JLabel etqNormbreRegistro;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqTitulo1;
    private javax.swing.JLabel etqUsuario;
    private javax.swing.JLabel etqUsuarioRegistro;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTitulo1;
    private javax.swing.JPasswordField pwdContraseñaLogin;
    private javax.swing.JPasswordField pwdContraseñaRegistro;
    private javax.swing.JTextField txtApellidoRegistro;
    private javax.swing.JTextField txtEmailRegistro;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioRegistro;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;

    private void inhabilitarCampos() {
        this.txtApellidoRegistro.setEditable(false);
        this.txtEmailRegistro.setEditable(false);
        this.txtNombreRegistro.setEditable(false);
        this.txtUsuarioRegistro.setEditable(false);
        this.pwdContraseñaRegistro.setEditable(false);
        this.btnAceptarRegistro.setEnabled(false);
    }

    private void guardarSistema() {
        ObjectOutputStream grabacionSistema;
        try {
            //Se serializa el objeto sistema.
            grabacionSistema = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream("sistema.txt")));
            grabacionSistema.writeObject(sistema);
            grabacionSistema.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
