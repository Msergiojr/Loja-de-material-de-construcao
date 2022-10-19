/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetopi;

import java.awt.Color;

/**
 *
 * @author daniel.nsilva20
 */
public class frmEstoque extends javax.swing.JFrame {

    /**
     * Creates new form frmEstoque
     */
    public frmEstoque() {
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

        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecoCompra = new javax.swing.JTextField();
        txtPrecoVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtConsultar = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrar.setText("cadastrar");

        btnAlterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");

        btnApagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cod");

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });

        jLabel2.setText("Produto");

        txtProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProdutoFocusLost(evt);
            }
        });
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade");

        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });

        jLabel4.setText("Preço de compra");

        txtPrecoCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoCompraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoCompraFocusLost(evt);
            }
        });

        txtPrecoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoVendaFocusLost(evt);
            }
        });

        jLabel5.setText("Preço da venda");

        txtConsultar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConsultarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConsultarFocusLost(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnApagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(txtConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecoCompra)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 48, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnApagar)
                    .addComponent(btnCancelar)
                    .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
        // TODO add your handling code here:
        txtCodigo.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCodigoFocusGained

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        // TODO add your handling code here:
        txtCodigo.setBackground(Color.white);
    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdutoFocusGained
        // TODO add your handling code here:
        txtProduto.setBackground(Color.yellow);
    }//GEN-LAST:event_txtProdutoFocusGained

    private void txtProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdutoFocusLost
        // TODO add your handling code here:
        txtProduto.setBackground(Color.white);
    }//GEN-LAST:event_txtProdutoFocusLost

    private void txtQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusGained
        // TODO add your handling code here:
        txtQuantidade.setBackground(Color.yellow);
    }//GEN-LAST:event_txtQuantidadeFocusGained

    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost
        // TODO add your handling code here:
        txtQuantidade.setBackground(Color.white);
    }//GEN-LAST:event_txtQuantidadeFocusLost

    private void txtPrecoCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCompraFocusGained
        // TODO add your handling code here:
        txtPrecoCompra.setBackground(Color.yellow);
    }//GEN-LAST:event_txtPrecoCompraFocusGained

    private void txtPrecoCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCompraFocusLost
        // TODO add your handling code here:
        txtPrecoCompra.setBackground(Color.white);
    }//GEN-LAST:event_txtPrecoCompraFocusLost

    private void txtPrecoVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaFocusGained
        // TODO add your handling code here:
        txtPrecoVenda.setBackground(Color.yellow);
    }//GEN-LAST:event_txtPrecoVendaFocusGained

    private void txtPrecoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaFocusLost
        // TODO add your handling code here:
        txtPrecoVenda.setBackground(Color.white);
    }//GEN-LAST:event_txtPrecoVendaFocusLost

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtConsultarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConsultarFocusGained
        // TODO add your handling code here:
        txtConsultar.setBackground(Color.yellow);

    }//GEN-LAST:event_txtConsultarFocusGained

    private void txtConsultarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConsultarFocusLost
        // TODO add your handling code here:
        txtConsultar.setBackground(Color.white);
    }//GEN-LAST:event_txtConsultarFocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtConsultar;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
