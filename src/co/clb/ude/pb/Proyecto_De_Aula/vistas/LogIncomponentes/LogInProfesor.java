/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.vistas.LogIncomponentes;
import co.clb.ude.pb.Proyecto_De_Aula.vistas.gui.VentanaMenuProfesor;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.SwingUtilities;

/**
 *
 * @author daniel
 */
public class LogInProfesor extends javax.swing.JPanel {

    /**
     * Creates new form Profesor
     */
    public LogInProfesor() {
        initComponents();
        configurarCamposTexto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        correoTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        contraseñaTxt = new javax.swing.JPasswordField();
        loginBoton = new javax.swing.JPanel();
        loginTxt = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/clb/ude/pb/Proyecto_De_Aula/vistas/iconos/profesor.png"))); // NOI18N
        jLabel1.setText("Profesor");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("NUMERO DE ID");

        IDTxt.setForeground(new java.awt.Color(204, 204, 204));
        IDTxt.setText("Ingrese su numero de ID");
        IDTxt.setBorder(null);
        IDTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IDTxtMousePressed(evt);
            }
        });
        IDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTxtActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        correoTxt.setForeground(new java.awt.Color(204, 204, 204));
        correoTxt.setText("Ingrese su correo");
        correoTxt.setBorder(null);
        correoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoTxtMousePressed(evt);
            }
        });
        correoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoTxtActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("CORREO");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CONTRASEÑA");

        contraseñaTxt.setForeground(new java.awt.Color(204, 204, 204));
        contraseñaTxt.setText("jPasswordField1");
        contraseñaTxt.setBorder(null);
        contraseñaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaTxtMousePressed(evt);
            }
        });
        contraseñaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaTxtActionPerformed(evt);
            }
        });

        loginBoton.setBackground(new java.awt.Color(1, 174, 250));

        loginTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        loginTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTxt.setText("Acceder");
        loginTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        loginTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBotonLayout = new javax.swing.GroupLayout(loginBoton);
        loginBoton.setLayout(loginBotonLayout);
        loginBotonLayout.setHorizontalGroup(
            loginBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        loginBotonLayout.setVerticalGroup(
            loginBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(contraseñaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(IDTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(loginBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(loginBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void IDTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDTxtMousePressed
        if (IDTxt.getText().equals("Ingrese su codigo estudiante")) {
            IDTxt.setText("");
            IDTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_IDTxtMousePressed

    private void IDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTxtActionPerformed

    private void correoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoTxtMousePressed
        if (correoTxt.getText().equals("Ingrese su correo")) {
            correoTxt.setText("");
            correoTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_correoTxtMousePressed

    private void correoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoTxtActionPerformed

    private void contraseñaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaTxtMousePressed
        if (String.valueOf(contraseñaTxt.getPassword()).equals("•••••••••••••••")) {
            contraseñaTxt.setText("");
            contraseñaTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_contraseñaTxtMousePressed

    private void contraseñaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaTxtActionPerformed

    private void loginTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseClicked
        if (!esCorreoValido(correoTxt.getText())) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Correo electrónico inválido");
            correoTxt.requestFocus();
        } else {
        
            SwingUtilities.getWindowAncestor(this).dispose();
            VentanaMenuProfesor ventanaMenuProfesor = new VentanaMenuProfesor();
            ventanaMenuProfesor.setVisible(true);
        }
    }//GEN-LAST:event_loginTxtMouseClicked

    private void loginTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseEntered
        loginBoton.setBackground(new Color(1, 105, 150));
    }//GEN-LAST:event_loginTxtMouseEntered

    private void loginTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseExited
        loginBoton.setBackground(new Color(1, 174, 250));
    }//GEN-LAST:event_loginTxtMouseExited

    private void configurarCamposTexto() {
        IDTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (!Character.isDigit(caracter)) {
                    e.consume();
                }
            }
        });
        
        TextosPredeterminado(IDTxt, "Ingrese su codigo estudiante");
        TextosPredeterminado(correoTxt, "Ingrese su correo");
        TextosPredeterminado(contraseñaTxt, "•••••••••••••••");
        
        agregarFocusListener(IDTxt, "Ingrese su codigo estudiante");
        agregarFocusListener(correoTxt, "Ingrese su correo");
        agregarFocusListener(contraseñaTxt, "•••••••••••••••");

    }

    private void TextosPredeterminado(javax.swing.JTextField campo, String texto) {
        campo.setForeground(Color.gray);
        campo.setText(texto);
    }

    private void agregarFocusListener(javax.swing.JTextField campo, String texto) {
        campo.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(texto)) {
                    campo.setText("");
                    campo.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (campo.getText().isEmpty()) {
                    campo.setText(texto);
                    campo.setForeground(Color.gray);
                }
            }
        });
    }

    private void limpiarCampos() {
        TextosPredeterminado(IDTxt, "Ingrese su codigo estudiante");
        TextosPredeterminado(correoTxt, "Ingrese su correo");
        TextosPredeterminado(contraseñaTxt, "•••••••••••••••");
    }

    private void restaurarTextoPredeterminado() {
        if (IDTxt.getText().isEmpty()) {
            TextosPredeterminado(IDTxt, "Ingrese su codigo estudiante");
        }
        if (correoTxt.getText().isEmpty()) {
            TextosPredeterminado(correoTxt, "Ingrese su correo");
        }
        if (String.valueOf(contraseñaTxt.getPassword()).isEmpty()) {
            TextosPredeterminado(contraseñaTxt, "•••••••••••••••");
        }
    }
    
    // Fin de metodos visuales


    private static boolean esCorreoValido(String correoElectronico) {
        String patron = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(patron);

        Matcher matcher = pattern.matcher(correoElectronico);

        return matcher.matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDTxt;
    private javax.swing.JPasswordField contraseñaTxt;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel loginBoton;
    private javax.swing.JLabel loginTxt;
    // End of variables declaration//GEN-END:variables
}
