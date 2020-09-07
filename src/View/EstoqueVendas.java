package View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class EstoqueVendas extends javax.swing.JFrame {

    public String P_COD;
    public String P_DESCR;
    public String P_PRECO;

    public EstoqueVendas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        J_pesquisar_todos_produtos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        J_mostrar_produtos_ = new javax.swing.JTable();
        J_selecionar_item = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque vendas");

        J_pesquisar_todos_produtos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_todos_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Estoque.png"))); // NOI18N
        J_pesquisar_todos_produtos.setText("PESQUISAR");
        J_pesquisar_todos_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_todos_produtosActionPerformed(evt);
            }
        });

        J_mostrar_produtos_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓD. PRO.", "DESCRIÇÃO", "PREÇO", "ESTOQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        J_mostrar_produtos_.getTableHeader().setReorderingAllowed(false);
        J_mostrar_produtos_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_mostrar_produtos_MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(J_mostrar_produtos_);

        J_selecionar_item.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_selecionar_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cadastrar.png"))); // NOI18N
        J_selecionar_item.setText("SELECIONAR");
        J_selecionar_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_selecionar_itemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_pesquisar_todos_produtos, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_selecionar_item, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addGap(330, 330, 330))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_selecionar_item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J_pesquisar_todos_produtos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_pesquisar_todos_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_todos_produtosActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstoqueProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null;
        String Query = "select * from estoquedeprodutos";
        PreparedStatement cmd;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");

            cmd = conn.prepareStatement(Query);
            ResultSet rs;
            rs = cmd.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) J_mostrar_produtos_.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {
                modelo.addRow(
                        new Object[]{
                            rs.getString("codigo_produto"),
                            rs.getString("descricao_produto"),
                            rs.getString("preco_max_consumidor"),
                            rs.getString("estoque"),});
            }
        } catch (SQLException error) {
            // JOptionPane.showMessageDialog("Ocorreu um erro de SQL !"+error.getMessage());
        }
}//GEN-LAST:event_J_pesquisar_todos_produtosActionPerformed

    private void J_selecionar_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_selecionar_itemActionPerformed
        P_COD = (String) J_mostrar_produtos_.getValueAt(J_mostrar_produtos_.getSelectedRow(), 0);
        P_DESCR = (String) J_mostrar_produtos_.getValueAt(J_mostrar_produtos_.getSelectedRow(), 1);
        P_PRECO = (String) J_mostrar_produtos_.getValueAt(J_mostrar_produtos_.getSelectedRow(), 2);

        dispose();
    }//GEN-LAST:event_J_selecionar_itemActionPerformed

    private void J_mostrar_produtos_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_mostrar_produtos_MouseClicked

/*
        P_COD = (String) J_mostrar_produtos_.getValueAt(J_mostrar_produtos_.getSelectedRow(), 0);
        P_DESCR = (String) J_mostrar_produtos_.getValueAt(J_mostrar_produtos_.getSelectedRow(), 1);
        P_PRECO = (String) J_mostrar_produtos_.getValueAt(J_mostrar_produtos_.getSelectedRow(), 2);

        dispose();
*/

    }//GEN-LAST:event_J_mostrar_produtos_MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EstoqueVendas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable J_mostrar_produtos_;
    private javax.swing.JButton J_pesquisar_todos_produtos;
    private javax.swing.JButton J_selecionar_item;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
