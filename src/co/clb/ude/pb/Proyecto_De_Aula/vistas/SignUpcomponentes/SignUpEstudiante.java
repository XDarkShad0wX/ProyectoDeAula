/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.vistas.SignUpcomponentes;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.toedter.calendar.JTextFieldDateEditor;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;

/**
 *
 * @author daniel
 */
public class SignUpEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form Estudiante
     */
    public SignUpEstudiante() {
        initComponents();
        configurarCamposTexto();
        grupoGenero();

        configurarDateChooser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        nombreEstTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        correoEstTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelCorrreo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelContraseña = new javax.swing.JLabel();
        contraseñaEstTxt = new javax.swing.JPasswordField();
        SignUpBoton = new javax.swing.JPanel();
        SignUpTxt = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        apellidoEstTxt = new javax.swing.JTextField();
        jLabelGenero = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabelConfirmarContraseña = new javax.swing.JLabel();
        confirmarContraseñaEstTxt = new javax.swing.JPasswordField();
        jLabelID = new javax.swing.JLabel();
        IDEstTxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        gMujer = new javax.swing.JRadioButton();
        gHombre = new javax.swing.JRadioButton();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jDateChooserEst = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagen.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/clb/ude/pb/Proyecto_De_Aula/vistas/iconos/tipo.png"))); // NOI18N
        jLabelImagen.setText("Estudiante");
        jPanel1.add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 23, 115, 36));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombre.setText("Nombre(s)");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 132, 33));

        nombreEstTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreEstTxt.setText("Ingrese su(s) Nombre(s)");
        nombreEstTxt.setBorder(null);
        nombreEstTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreEstTxtMousePressed(evt);
            }
        });
        nombreEstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEstTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nombreEstTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 166, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 166, -1));

        correoEstTxt.setForeground(new java.awt.Color(204, 204, 204));
        correoEstTxt.setText("Ingrese su correo");
        correoEstTxt.setBorder(null);
        correoEstTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoEstTxtMousePressed(evt);
            }
        });
        correoEstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoEstTxtActionPerformed(evt);
            }
        });
        jPanel1.add(correoEstTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, -1));

        jLabelCorrreo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelCorrreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCorrreo.setText("Correo");
        jPanel1.add(jLabelCorrreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 96, 33));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, -1));

        jLabelContraseña.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelContraseña.setText("Contraseña");
        jPanel1.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 96, 33));

        contraseñaEstTxt.setForeground(new java.awt.Color(204, 204, 204));
        contraseñaEstTxt.setText("jPasswordField1");
        contraseñaEstTxt.setBorder(null);
        contraseñaEstTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaEstTxtMousePressed(evt);
            }
        });
        contraseñaEstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaEstTxtActionPerformed(evt);
            }
        });
        jPanel1.add(contraseñaEstTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        SignUpBoton.setBackground(new java.awt.Color(1, 174, 250));

        SignUpTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        SignUpTxt.setForeground(new java.awt.Color(255, 255, 255));
        SignUpTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUpTxt.setText("Guardar");
        SignUpTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SignUpTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SignUpBotonLayout = new javax.swing.GroupLayout(SignUpBoton);
        SignUpBoton.setLayout(SignUpBotonLayout);
        SignUpBotonLayout.setHorizontalGroup(
            SignUpBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        SignUpBotonLayout.setVerticalGroup(
            SignUpBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel1.add(SignUpBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 350, -1, -1));

        jLabelApellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelApellido.setText("Apellido(s)");
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 132, 33));

        apellidoEstTxt.setForeground(new java.awt.Color(204, 204, 204));
        apellidoEstTxt.setText("Ingrese su(s) Apellido(s)");
        apellidoEstTxt.setBorder(null);
        apellidoEstTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoEstTxtMousePressed(evt);
            }
        });
        apellidoEstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoEstTxtActionPerformed(evt);
            }
        });
        jPanel1.add(apellidoEstTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 166, 30));

        jLabelGenero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelGenero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelGenero.setText("Genero");
        jPanel1.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 132, 33));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 180, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 170, -1));

        jLabelConfirmarContraseña.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelConfirmarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelConfirmarContraseña.setText("Confirmar Contraseña");
        jPanel1.add(jLabelConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 120, 33));

        confirmarContraseñaEstTxt.setForeground(new java.awt.Color(204, 204, 204));
        confirmarContraseñaEstTxt.setText("jPasswordField1");
        confirmarContraseñaEstTxt.setBorder(null);
        confirmarContraseñaEstTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmarContraseñaEstTxtMousePressed(evt);
            }
        });
        confirmarContraseñaEstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarContraseñaEstTxtActionPerformed(evt);
            }
        });
        jPanel1.add(confirmarContraseñaEstTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 170, 30));

        jLabelID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelID.setText("ID");
        jPanel1.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 132, 33));

        IDEstTxt.setForeground(new java.awt.Color(204, 204, 204));
        IDEstTxt.setText("Numero de Identificacion");
        IDEstTxt.setBorder(null);
        IDEstTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IDEstTxtMousePressed(evt);
            }
        });
        IDEstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDEstTxtActionPerformed(evt);
            }
        });
        jPanel1.add(IDEstTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 166, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 166, -1));

        gMujer.setText("Mujer");
        gMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gMujerActionPerformed(evt);
            }
        });
        jPanel1.add(gMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 80, 30));

        gHombre.setText("Hombre");
        gHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gHombreActionPerformed(evt);
            }
        });
        jPanel1.add(gHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, 30));

        jLabelFechaNacimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaNacimiento.setText("Fecha de nacimiento");
        jPanel1.add(jLabelFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 132, 33));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 166, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 180, 10));
        jPanel1.add(jDateChooserEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 180, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEstTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreEstTxtMousePressed
        if (nombreEstTxt.getText().equals("Ingrese su(s) Nombre(s)")) {
            nombreEstTxt.setText("");
            nombreEstTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();

    }//GEN-LAST:event_nombreEstTxtMousePressed

    private void nombreEstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEstTxtActionPerformed

    private void correoEstTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoEstTxtMousePressed
        if (correoEstTxt.getText().equals("Ingrese su correo")) {
            correoEstTxt.setText("");
            correoEstTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_correoEstTxtMousePressed

    private void correoEstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoEstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoEstTxtActionPerformed

    private void contraseñaEstTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaEstTxtMousePressed
        if (String.valueOf(contraseñaEstTxt.getPassword()).equals("•••••••••••••••")) {
            contraseñaEstTxt.setText("");
            contraseñaEstTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_contraseñaEstTxtMousePressed

    private void contraseñaEstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaEstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaEstTxtActionPerformed

    private void SignUpTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpTxtMouseClicked
        if (!validarEntrada()) {
            return;
        }

        if (!insertarEstudianteEnBD()) {
            // javax.swing.JOptionPane.showMessageDialog(jPanel1, "No se pudo registrar el estudiante en la base de datos", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Registrado Correctamente");
        }
    }//GEN-LAST:event_SignUpTxtMouseClicked

    private void SignUpTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpTxtMouseEntered
        SignUpBoton.setBackground(new Color(1, 105, 150));
    }//GEN-LAST:event_SignUpTxtMouseEntered

    private void SignUpTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpTxtMouseExited
        SignUpBoton.setBackground(new Color(1, 174, 250));
    }//GEN-LAST:event_SignUpTxtMouseExited

    private void apellidoEstTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoEstTxtMousePressed
        if (apellidoEstTxt.getText().equals("Ingrese su(s) Apellido(s)")) {
            apellidoEstTxt.setText("");
            apellidoEstTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_apellidoEstTxtMousePressed

    private void apellidoEstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoEstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoEstTxtActionPerformed

    private void confirmarContraseñaEstTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarContraseñaEstTxtMousePressed
        if (String.valueOf(confirmarContraseñaEstTxt.getPassword()).equals("•••••••••••••••")) {
            confirmarContraseñaEstTxt.setText("");
            confirmarContraseñaEstTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_confirmarContraseñaEstTxtMousePressed

    private void confirmarContraseñaEstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarContraseñaEstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarContraseñaEstTxtActionPerformed

    private void IDEstTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDEstTxtMousePressed
        if (IDEstTxt.getText().equals("Numero de Identificacion")) {
            IDEstTxt.setText("");
            IDEstTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_IDEstTxtMousePressed

    private void IDEstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDEstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDEstTxtActionPerformed

    private void gMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gMujerActionPerformed

    private void gHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gHombreActionPerformed

    private void configurarDateChooser() {
        jDateChooserEst.setDateFormatString("d/MM/yyyy");
        jDateChooserEst.getDateEditor().setEnabled(false);
        jDateChooserEst.setSelectableDateRange(new java.util.Date(0), new java.util.Date()); // Esto permite seleccionar fechas hasta la fecha actual
    }

    private void grupoGenero() {
        botonesGenero = new ButtonGroup();
        botonesGenero.add(gHombre);
        botonesGenero.add(gMujer);
    }

    private void configurarCamposTexto() {
        IDEstTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (!Character.isDigit(caracter)) {
                    e.consume();
                }
            }
        });

        nombreEstTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (!Character.isLetter(caracter) && !Character.isWhitespace(caracter)) {
                    e.consume();
                }
            }
        });

        apellidoEstTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (!Character.isLetter(caracter) && !Character.isWhitespace(caracter)) {
                    e.consume();
                }
            }
        });

        TextosPredeterminado(nombreEstTxt, "Ingrese su(s) Nombre(s)");
        TextosPredeterminado(apellidoEstTxt, "Ingrese su(s) Apellido(s)");
        TextosPredeterminado(correoEstTxt, "Ingrese su correo");
        TextosPredeterminado(contraseñaEstTxt, "•••••••••••••••");
        TextosPredeterminado(confirmarContraseñaEstTxt, "•••••••••••••••");
        TextosPredeterminado(IDEstTxt, "Numero de Identificacion");

        agregarFocusListener(nombreEstTxt, "Ingrese su(s) Nombre(s)");
        agregarFocusListener(apellidoEstTxt, "Ingrese su(s) Apellido(s)");
        agregarFocusListener(correoEstTxt, "Ingrese su correo");
        agregarFocusListener(contraseñaEstTxt, "•••••••••••••••");
        agregarFocusListener(confirmarContraseñaEstTxt, "•••••••••••••••");
        agregarFocusListener(IDEstTxt, "Numero de Identificacion");
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
        TextosPredeterminado(nombreEstTxt, "Ingrese su(s) Nombre(s)");
        TextosPredeterminado(apellidoEstTxt, "Ingrese su(s) Apellido(s)");
        TextosPredeterminado(correoEstTxt, "Ingrese su correo");
        TextosPredeterminado(contraseñaEstTxt, "•••••••••••••••");
        TextosPredeterminado(confirmarContraseñaEstTxt, "•••••••••••••••");
        TextosPredeterminado(IDEstTxt, "Numero de Identificacion");
        botonesGenero.clearSelection();

        if (jDateChooserEst != null) {
            JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooserEst.getDateEditor();
            editor.setText("dd/mm/yyyy");
            editor.setForeground(Color.gray);
            jDateChooserEst.setDate(null);
        }
    }

    private void restaurarTextoPredeterminado() {
        if (nombreEstTxt.getText().isEmpty()) {
            TextosPredeterminado(nombreEstTxt, "Ingrese su(s) Nombre(s)");
        }
        if (apellidoEstTxt.getText().isEmpty()) {
            TextosPredeterminado(apellidoEstTxt, "Ingrese su(s) Apellido(s)");
        }
        if (correoEstTxt.getText().isEmpty()) {
            TextosPredeterminado(correoEstTxt, "Ingrese su correo");
        }
        if (String.valueOf(contraseñaEstTxt.getPassword()).isEmpty()) {
            TextosPredeterminado(contraseñaEstTxt, "•••••••••••••••");
        }
        if (String.valueOf(confirmarContraseñaEstTxt.getPassword()).isEmpty()) {
            TextosPredeterminado(confirmarContraseñaEstTxt, "•••••••••••••••");
        }
        if (IDEstTxt.getText().isEmpty()) {
            TextosPredeterminado(IDEstTxt, "Numero de Identificacion");
        }

        if (jDateChooserEst.getDate() == null) {
            JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooserEst.getDateEditor();
            editor.setText("dd/mm/yyyy");
            editor.setForeground(Color.gray);
        }
    }

    // Fin de metodos visuales
    private class ValidacionContrseña {

        public static boolean contraseñasCoinciden(String contraseña, String confirmarContraseña) {
            return contraseña.equals(confirmarContraseña);
        }
    }

    private class ValidadorJDateChooser {

        public static boolean esFechaValida(JDateChooser jDateChooser) {
            if (jDateChooser.getDate() == null) {
                return false;
            }

            java.util.Date fechaNacimiento = jDateChooser.getDate();
            java.util.Calendar calNacimiento = java.util.Calendar.getInstance();
            calNacimiento.setTime(fechaNacimiento);

            java.util.Calendar calActual = java.util.Calendar.getInstance();

            int edad = calActual.get(java.util.Calendar.YEAR) - calNacimiento.get(java.util.Calendar.YEAR);
            int mesActual = calActual.get(java.util.Calendar.MONTH);
            int mesNacimiento = calNacimiento.get(java.util.Calendar.MONTH);
            int diaActual = calActual.get(java.util.Calendar.DAY_OF_MONTH);
            int diaNacimiento = calNacimiento.get(java.util.Calendar.DAY_OF_MONTH);

            if (mesNacimiento > mesActual || (mesNacimiento == mesActual && diaNacimiento > diaActual)) {
                edad--;
            }

            int edadMinima = 14;
            int edadMaxima = 100;

            return (edad >= edadMinima && edad <= edadMaxima);
        }
    }

    private static boolean esCorreoValido(String correoElectronico) {
        String patron = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(correoElectronico);
        return matcher.matches();
    }

    private boolean validarGenero() {
        return gHombre.isSelected() || gMujer.isSelected();
    }

    private boolean validarEntrada() {
        if (!ValidadorJDateChooser.esFechaValida(jDateChooserEst)) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe seleccionar una fecha valida", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!validarGenero()) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe seleccionar su genero", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar que el ID sea de 10 dígitos
        if (IDEstTxt.getText().trim().length() != 8 && IDEstTxt.getText().trim().length() != 10 && IDEstTxt.getText().trim().length() != 11) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe ingresar un numero de Identificacion valido", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar que la contraseña tenga al menos 6 caracteres
        if (String.valueOf(contraseñaEstTxt.getPassword()).trim().length() < 6) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe ingresar una contraseña más larga (al menos 6 caracteres)", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!esCorreoValido(correoEstTxt.getText())) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe Ingresar un correo electrónico válido.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String contraseña = String.valueOf(contraseñaEstTxt.getPassword());
        String confirmarContraseña = String.valueOf(confirmarContraseñaEstTxt.getPassword());

        if (!ValidacionContrseña.contraseñasCoinciden(contraseña, confirmarContraseña)) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Las contraseñas no coinciden", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (nombreEstTxt.getText().equals("Ingrese su(s) Nombre(s)")
                || apellidoEstTxt.getText().equals("Ingrese su(s) Apellido(s)")
                || correoEstTxt.getText().equals("Ingrese su correo")
                || String.valueOf(contraseñaEstTxt.getPassword()).equals("•••••••••••••••")
                || String.valueOf(confirmarContraseñaEstTxt.getPassword()).equals("•••••••••••••••")
                || IDEstTxt.getText().equals("Numero de Identificacion")) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe llenar todos los campos de informacion", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!ValidacionContrseña.contraseñasCoinciden(contraseña, confirmarContraseña)) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Las contraseñas no coinciden");
            return false;
        }

        return true;
    }

    private void mostrarCodigoEstudiante(ResultSet rs) throws SQLException {
        if (rs.next()) {
            int codigoEstudiante = rs.getInt(1);
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Su código de estudiante es: " + codigoEstudiante + ". \nADVERTENCIA: Guarde el código antes de presionar el botón 'OK'.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean usuarioExisteBd(String cedula, String correo, String nombre, String apellidos) {
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer conexión con la base de datos
            cn = DriverManager.getConnection("jdbc:mysql://localhost/plataforma", "root", "");

            // Consultar si existe un usuario con la misma cédula, correo, nombre y apellidos
            String query = "SELECT * FROM estudiantes WHERE Identificacion = ? OR Email = ? OR (Nombre = ? AND Apellidos = ?)";
            pst = cn.prepareStatement(query);
            pst.setString(1, cedula);
            pst.setString(2, correo);
            pst.setString(3, nombre);
            pst.setString(4, apellidos);
            rs = pst.executeQuery();

            // Si hay resultados, significa que el usuario ya existe
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Error al verificar el usuario: " + e.getMessage());
            return true; // En caso de error, asumimos que el usuario existe para evitar problemas
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(jPanel1, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    private boolean insertarEstudianteEnBD() {
        // Verifica si el usuario ya existe en la base de datos
        if (usuarioExisteBd(IDEstTxt.getText(), correoEstTxt.getText(), nombreEstTxt.getText(), apellidoEstTxt.getText())) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "El usuario que intenta ingresar, ya existe", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false; // No se inserta el usuario
        }

        Connection cn = null;
        PreparedStatement pst = null;

        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost/plataforma", "root", "");
            pst = cn.prepareStatement("INSERT INTO estudiantes (Nombre, Apellidos, Email, Contraseña, Identificacion, Nacimiento, Genero, Tipo_Usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            pst.setString(1, nombreEstTxt.getText());
            pst.setString(2, apellidoEstTxt.getText());
            pst.setString(3, correoEstTxt.getText());
            pst.setString(4, new String(contraseñaEstTxt.getPassword()));

            pst.setString(5, IDEstTxt.getText());

            pst.setDate(6, new java.sql.Date(jDateChooserEst.getDate().getTime()));

            String genero = gHombre.isSelected() ? "Hombre" : "Mujer";
            pst.setString(7, genero);

            pst.setString(8, "Estudiante");

            pst.executeUpdate();

            // Obtener el código de estudiante generado
            ResultSet rs = pst.getGeneratedKeys();
            limpiarCampos();
            mostrarCodigoEstudiante(rs);

            return true; // Inserción exitosa
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Error al registrar el estudiante: " + e.getMessage());
            return false; // Inserción fallida
        } finally {
            // Cierre de conexiones
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDEstTxt;
    private javax.swing.JPanel SignUpBoton;
    private javax.swing.JLabel SignUpTxt;
    private javax.swing.JTextField apellidoEstTxt;
    private javax.swing.ButtonGroup botonesGenero;
    private javax.swing.JPasswordField confirmarContraseñaEstTxt;
    private javax.swing.JPasswordField contraseñaEstTxt;
    private javax.swing.JTextField correoEstTxt;
    private javax.swing.JRadioButton gHombre;
    private javax.swing.JRadioButton gMujer;
    private com.toedter.calendar.JDateChooser jDateChooserEst;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelConfirmarContraseña;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCorrreo;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombreEstTxt;
    // End of variables declaration//GEN-END:variables
}
