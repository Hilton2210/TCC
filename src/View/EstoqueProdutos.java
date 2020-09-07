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

public class EstoqueProdutos extends javax.swing.JFrame {



    public EstoqueProdutos() {
        initComponents();



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        J_mostrar_estoque_de_produtos_ = new javax.swing.JTable();
        J_pesquisar_todos_produtos = new javax.swing.JButton();
        J_gerarCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");

        J_mostrar_estoque_de_produtos_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓD. PRO.", "DESCRIÇÃO", "CÓD. CAT.", "ESTOQUE", "MARCA", "PREÇO MIN. CONS.", "PREÇO MAX. CONS.", "PREÇO CUSTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        J_mostrar_estoque_de_produtos_.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(J_mostrar_estoque_de_produtos_);

        J_pesquisar_todos_produtos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_todos_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Estoque.png"))); // NOI18N
        J_pesquisar_todos_produtos.setText("EXIBIR PRODUTOS");
        J_pesquisar_todos_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_todos_produtosActionPerformed(evt);
            }
        });

        J_gerarCSV.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_gerarCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Excel.png"))); // NOI18N
        J_gerarCSV.setText("EXPORTAR ");
        J_gerarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_gerarCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(J_pesquisar_todos_produtos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_gerarCSV)
                        .addGap(672, 672, 672))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J_pesquisar_todos_produtos)
                    .addComponent(J_gerarCSV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                String Query="select * from estoquedeprodutos";
                PreparedStatement cmd;
            try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");

                cmd = conn.prepareStatement(Query);
                ResultSet rs;
                rs = cmd.executeQuery();
                DefaultTableModel modelo =(DefaultTableModel) J_mostrar_estoque_de_produtos_.getModel();
            modelo.setNumRows(0);

            while(rs.next()){
                modelo.addRow(
                        new Object[]{
                            rs.getString("codigo_produto"),
                            rs.getString("descricao_produto"),
                            rs.getString("cod_categoria"),
                            rs.getString("estoque"),
                            rs.getString("marca"),
                            rs.getString("preco_mim_consumidor"),
                            rs.getString("preco_max_consumidor"),
                            rs.getString("preco_custo"),
});
}
            }catch(SQLException error){
               // JOptionPane.showMessageDialog("Ocorreu um erro de SQL !"+error.getMessage());
}
}//GEN-LAST:event_J_pesquisar_todos_produtosActionPerformed

    private void J_gerarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_gerarCSVActionPerformed

PrintStream escreve = null;
        try {
            escreve = new PrintStream("Estoque.csv");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EstoqueProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }

escreve.println("CODIGO; DESCRICAO; COD. CATEGORIA; ESTOQUE; MARCA; PRECO MIN; PRECO MAX; PRECO CUSTO");

        for (int a= 0; a < J_mostrar_estoque_de_produtos_.getRowCount(); a++) {


        for (int i= 0; i < J_mostrar_estoque_de_produtos_.getColumnCount(); i++) {
        
            escreve.print(J_mostrar_estoque_de_produtos_.getValueAt(a, i) + ";");

        }
escreve.println("");
        }

escreve.close();
        try {
            java.awt.Desktop.getDesktop().open(new File("Estoque.csv"));
        } catch (IOException ex) {
            Logger.getLogger(EstoqueProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_J_gerarCSVActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton J_gerarCSV;
    private javax.swing.JTable J_mostrar_estoque_de_produtos_;
    private javax.swing.JButton J_pesquisar_todos_produtos;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
