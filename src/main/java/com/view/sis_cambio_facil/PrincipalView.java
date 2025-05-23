/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.view.sis_cambio_facil;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author INTEL
 */
public class PrincipalView extends javax.swing.JPanel {
private CardLayout cardLayout;
    /**
     * Creates new form UsuariosView
     */
    public PrincipalView() {
        initComponents();
    }
   private void InitContent(JPanel p){
        p.setSize(750,430);
        p.setLocation(0, 0);
        UsuariosView usuario = new UsuariosView();
        usuario.setVisible(true);
        //content.removeAll();
       // content.add(p, BorderLayout.CENTER);
       // content.revalidate();
        //content.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelButton1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnUsuariosActivos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelButton4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnUsuariosActivos3 = new javax.swing.JButton();
        panelButton5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnUsuariosActivos4 = new javax.swing.JButton();
        head = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Cambio Fácil es una casa de cambio establecida en Lima - Perú,");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("dedicada a ofrecer servicios de cambio de divisas de manera rápida y segura.");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intercambiar.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Tu Socio en el Manejo de Divisas");

        panelButton1.setBackground(new java.awt.Color(233, 236, 239));

        jLabel5.setBackground(new java.awt.Color(233, 236, 239));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");

        btnUsuariosActivos.setBackground(new java.awt.Color(233, 236, 239));
        btnUsuariosActivos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnUsuariosActivos.setText("Usuarios Activos");
        btnUsuariosActivos.setBorder(null);
        btnUsuariosActivos.setBorderPainted(false);
        btnUsuariosActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuariosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButton1Layout = new javax.swing.GroupLayout(panelButton1);
        panelButton1.setLayout(panelButton1Layout);
        panelButton1Layout.setHorizontalGroup(
            panelButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuariosActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelButton1Layout.setVerticalGroup(
            panelButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButton1Layout.createSequentialGroup()
                .addComponent(btnUsuariosActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Aquí podrás gestionar usuarios, tipos de cambio, transacciones y generar reportes.");

        panelButton4.setBackground(new java.awt.Color(233, 236, 239));

        jLabel8.setBackground(new java.awt.Color(233, 236, 239));
        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("47");

        btnUsuariosActivos3.setBackground(new java.awt.Color(233, 236, 239));
        btnUsuariosActivos3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnUsuariosActivos3.setText("Transacciones Hoy");
        btnUsuariosActivos3.setBorder(null);
        btnUsuariosActivos3.setBorderPainted(false);
        btnUsuariosActivos3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelButton4Layout = new javax.swing.GroupLayout(panelButton4);
        panelButton4.setLayout(panelButton4Layout);
        panelButton4Layout.setHorizontalGroup(
            panelButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuariosActivos3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelButton4Layout.setVerticalGroup(
            panelButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButton4Layout.createSequentialGroup()
                .addComponent(btnUsuariosActivos3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelButton5.setBackground(new java.awt.Color(233, 236, 239));

        jLabel9.setBackground(new java.awt.Color(233, 236, 239));
        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("1 USD = 3.8 Soles");

        btnUsuariosActivos4.setBackground(new java.awt.Color(233, 236, 239));
        btnUsuariosActivos4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnUsuariosActivos4.setText("Tipo de Cambio USD");
        btnUsuariosActivos4.setBorder(null);
        btnUsuariosActivos4.setBorderPainted(false);
        btnUsuariosActivos4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelButton5Layout = new javax.swing.GroupLayout(panelButton5);
        panelButton5.setLayout(panelButton5Layout);
        panelButton5Layout.setHorizontalGroup(
            panelButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuariosActivos4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelButton5Layout.setVerticalGroup(
            panelButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButton5Layout.createSequentialGroup()
                .addComponent(btnUsuariosActivos4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        head.setBackground(new java.awt.Color(24, 24, 23));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(247, 216, 26));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PRINCIPAL");

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(panelButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActivosActionPerformed
        // TODO add your handling code here:
        Dashboard main = new Dashboard();
        main.InitContent( new UsuariosView());
    }//GEN-LAST:event_btnUsuariosActivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuariosActivos;
    private javax.swing.JButton btnUsuariosActivos3;
    private javax.swing.JButton btnUsuariosActivos4;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelButton1;
    private javax.swing.JPanel panelButton4;
    private javax.swing.JPanel panelButton5;
    // End of variables declaration//GEN-END:variables
}
