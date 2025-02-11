/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetopi;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel.nsilva20
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public frmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnVendas = new javax.swing.JButton();
        btnConsultarCliente = new javax.swing.JButton();
        btnConsultarVendedores = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnConsultarProdutos = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVendas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVendas.setText("Vendas");
        btnVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendasMouseClicked(evt);
            }
        });
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 220, -1));

        btnConsultarCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsultarCliente.setText("Consultar cliente");
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 93, 220, -1));

        btnConsultarVendedores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsultarVendedores.setText("Consulta vendedores");
        btnConsultarVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVendedoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 199, 220, -1));

        btnEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEstoque.setText("Estoque");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 252, 220, -1));

        btnConsultarProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsultarProdutos.setText("Consulta de produtos");
        btnConsultarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 146, 220, -1));

        btnRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRelatorio.setText("Relatorio");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        jPanel1.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 305, 220, -1));

        btnSair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 358, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        // TODO add your handling code here:
        frmConsultarCliente frmMenu = new frmConsultarCliente();
        frmMenu.setVisible(true);

    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnConsultarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProdutosActionPerformed
        // TODO add your handling code here:
        frmConsultaProdutos frmMenu = new frmConsultaProdutos();
        frmMenu.setVisible(true);
    }//GEN-LAST:event_btnConsultarProdutosActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
        frmRelatorio frmMenu = new frmRelatorio();
        frmMenu.setVisible(true);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVendedoresActionPerformed
        // TODO add your handling code here:
        frmConsultarVendedor frmMenu = new frmConsultarVendedor();
        frmMenu.setVisible(true);
    }//GEN-LAST:event_btnConsultarVendedoresActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        // TODO add your handling code here:
        frmEstoque frmMenu = new frmEstoque();
        frmMenu.setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMouseClicked

        frmVendas frmMenu = new frmVendas();
        frmMenu.setVisible(true);

    }//GEN-LAST:event_btnVendasMouseClicked

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarProdutos;
    private javax.swing.JButton btnConsultarVendedores;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
