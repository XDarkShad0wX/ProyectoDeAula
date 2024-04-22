/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.vistas.gui;
import co.clb.ude.pb.Proyecto_De_Aula.vistas.componentes.Estudiante;
import co.clb.ude.pb.Proyecto_De_Aula.vistas.componentes.Profesor;
import java.awt.BorderLayout;
import javax.swing.JLabel;

/**
 *
 * @author daniel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        content.requestFocusInWindow();
        
        Estudiante estudiante = new Estudiante();
        estudiante.setSize(590, 410);
        estudiante.setLocation(0, 0);
        
        content.removeAll();
        content.add(estudiante, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This metho is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        estudiante = new javax.swing.JButton();
        profesor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 590, 410));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon("C:\\Users\\daniel\\OneDrive\\Escritorio\\Proyecto_de_aula\\src\\main\\java\\co\\clb\\ude\\pb\\Proyecto_De_Aula\\vistas\\iconos\\usuarios.png")); // NOI18N
        bg.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 310, 140));

        estudiante.setBackground(new java.awt.Color(1, 174, 250));
        estudiante.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 10)); // NOI18N
        estudiante.setForeground(new java.awt.Color(255, 255, 255));
        estudiante.setText("ESTUDIANTE");
        estudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        estudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });
        bg.add(estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 110, 40));

        profesor.setBackground(new java.awt.Color(1, 174, 250));
        profesor.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 10)); // NOI18N
        profesor.setForeground(new java.awt.Color(255, 255, 255));
        profesor.setText("PROFESOR");
        profesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        profesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesorActionPerformed(evt);
            }
        });
        bg.add(profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 110, 40));

        jLabel4.setFont(new java.awt.Font("Vensim Sans ExtraBold", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SELECCIONE EL TIPO DE USUARIO");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 310, 90));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\daniel\\OneDrive\\Escritorio\\Proyecto_de_aula\\src\\main\\java\\co\\clb\\ude\\pb\\Proyecto_De_Aula\\vistas\\imagenes\\fondo (1).jpg")); // NOI18N
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 310, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicio");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 310, 60));

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\daniel\\OneDrive\\Escritorio\\Proyecto_de_aula\\src\\main\\java\\co\\clb\\ude\\pb\\Proyecto_De_Aula\\vistas\\imagenes\\fondo-azul-formal-min.png")); // NOI18N
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 310, 530));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIAR SESIÓN");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\daniel\\OneDrive\\Escritorio\\Proyecto_de_aula\\src\\main\\java\\co\\clb\\ude\\pb\\Proyecto_De_Aula\\vistas\\iconos\\usuario3.png")); // NOI18N
        jLabel3.setText("Plataforma Estudiantil");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesorActionPerformed
        Profesor profesor = new Profesor();
        profesor.setSize(590, 410);
        profesor.setLocation(0, 0);
        
        content.removeAll();
        content.add(profesor, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_profesorActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed
        Estudiante estudiante = new Estudiante();
        estudiante.setSize(590, 410);
        estudiante.setLocation(0, 0);
        
        content.removeAll();
        content.add(estudiante, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_estudianteActionPerformed
                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    public JLabel getFondo() {
        return fondo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    private javax.swing.JButton estudiante;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton profesor;
    // End of variables declaration//GEN-END:variables
}
