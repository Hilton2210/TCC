
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultarDiariosAnteriores extends javax.swing.JFrame {

    public ConsultarDiariosAnteriores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        J_mostra_todos_diarios_ = new javax.swing.JTable();
        J_pesquisar_data = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        J_pesquisardata = new javax.swing.JButton();
        J_pesquisar_todos_produtos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        J_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        J_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        J_descricao = new javax.swing.JTextArea();
        J_data = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Diários armazenados");

        J_mostra_todos_diarios_.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Código", "Data", "Nome", "Descrição"
            }
        ));
        J_mostra_todos_diarios_.getTableHeader().setReorderingAllowed(false);
        J_mostra_todos_diarios_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_mostra_todos_diarios_MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(J_mostra_todos_diarios_);

        try {
            J_pesquisar_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        J_pesquisar_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_dataActionPerformed(evt);
            }
        });

        jLabel11.setText("Data");

        J_pesquisardata.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisardata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        J_pesquisardata.setText("PESQUISAR");
        J_pesquisardata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisardataActionPerformed(evt);
            }
        });

        J_pesquisar_todos_produtos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_todos_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/PesquisarTodos.png"))); // NOI18N
        J_pesquisar_todos_produtos.setText("TODOS");
        J_pesquisar_todos_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_todos_produtosActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados dos diários anteriores"));

        J_codigo.setEditable(false);
        J_codigo.setBackground(new java.awt.Color(204, 204, 204));
        J_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        jLabel10.setText("Data");

        jLabel9.setText("Nome");

        J_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_nomeActionPerformed(evt);
            }
        });
        J_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_nomeKeyReleased(evt);
            }
        });

        jLabel3.setText("Descrição");

        J_descricao.setColumns(20);
        J_descricao.setLineWrap(true);
        J_descricao.setRows(5);
        J_descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_descricaoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(J_descricao);

        J_data.setEditable(false);
        J_data.setBackground(new java.awt.Color(204, 204, 204));
        try {
            J_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        J_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_dataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_data, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(J_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(68, 68, 68))
                            .addComponent(J_pesquisar_data, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_pesquisardata, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_pesquisar_todos_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_pesquisar_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(J_pesquisar_todos_produtos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(J_pesquisardata, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_descricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_descricaoKeyReleased
        J_descricao.setText(J_descricao.getText().toUpperCase());
}//GEN-LAST:event_J_descricaoKeyReleased

    private void J_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nomeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_nomeActionPerformed

    private void J_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nomeKeyReleased
        J_nome.setText(J_nome.getText().toUpperCase());
}//GEN-LAST:event_J_nomeKeyReleased

    private void J_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_codigoActionPerformed

    private void J_pesquisar_todos_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_todos_produtosActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultarDiariosAnteriores.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");

            String Query="select * from diariodebordo";
            PreparedStatement cmd;
            cmd = conn.prepareStatement(Query);
            ResultSet rs;
            rs = cmd.executeQuery();
            DefaultTableModel modelo =(DefaultTableModel) J_mostra_todos_diarios_.getModel();
            modelo.setNumRows(0);

            while(rs.next()){

                String exibirdata2 = rs.getString("data_criacao").replace("-", "");

                modelo.addRow(
                        new Object[]{
                    rs.getString("codigo"),
                    (exibirdata2.substring(6,8) + "/" + exibirdata2.substring(4,6) + "/" + exibirdata2.substring(0,4)),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                });
            }
        }catch(SQLException error){
            // JOptionPane.showMessageDialog("Ocorreu um erro de SQL !"+error.getMessage());
        }
}//GEN-LAST:event_J_pesquisar_todos_produtosActionPerformed

    private void J_mostra_todos_diarios_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_mostra_todos_diarios_MouseClicked
int JMTD = J_mostra_todos_diarios_.getSelectedRow();

J_codigo.setText((String) J_mostra_todos_diarios_.getValueAt(JMTD, 0));
J_data.setText((String) J_mostra_todos_diarios_.getValueAt(JMTD, 1));
J_nome.setText((String) J_mostra_todos_diarios_.getValueAt(JMTD, 2));
J_descricao.setText((String) J_mostra_todos_diarios_.getValueAt(JMTD, 3));



    }//GEN-LAST:event_J_mostra_todos_diarios_MouseClicked

    private void J_pesquisardataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisardataActionPerformed
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConsultarDiariosAnteriores.class.getName()).log(Level.SEVERE, null, ex);
            }
                Connection conn = null;
            try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");


// INICIO DA PESQUISA PERSONALIZADA
                String Query = null;
                
                //DECLARANDO A INVERSÃO DA DATA
                String psd = J_pesquisar_data.getText().replace("/", "");

                    Query="select * from diariodebordo where data_criacao = " + "'" + (psd.substring(4,8)+psd.substring(2,4)+psd.substring(0,2)) + "'";

// FIM DA PESQUISA PERSONALISADA


                PreparedStatement cmd;
                cmd = conn.prepareStatement(Query);
                ResultSet rs;
                rs = cmd.executeQuery();
                DefaultTableModel modelo =(DefaultTableModel) J_mostra_todos_diarios_.getModel();
            modelo.setNumRows(0);

            while(rs.next()){

                //DECLARANDO A INVERSÃO DA DATA
                String exibirdata = rs.getString("data_criacao").replace("-", "");

                modelo.addRow(
                        new Object[]{
                            rs.getString("codigo"),
                            
                            //INVERTE DATA DE ANO/MES/DIA PARA DIA/MES/ANO
                            (exibirdata.substring(6,8) + "/" + exibirdata.substring(4,6) + "/" + exibirdata.substring(0,4)),

                            rs.getString("nome"),
                            rs.getString("descricao"),
});
}
            }catch(SQLException error){
               // JOptionPane.showMessageDialog("Ocorreu um erro de SQL !"+error.getMessage());
}

    }//GEN-LAST:event_J_pesquisardataActionPerformed

    private void J_pesquisar_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_pesquisar_dataActionPerformed

    private void J_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_dataActionPerformed

       public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarDiariosAnteriores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField J_codigo;
    private javax.swing.JFormattedTextField J_data;
    private javax.swing.JTextArea J_descricao;
    private javax.swing.JTable J_mostra_todos_diarios_;
    private javax.swing.JTextField J_nome;
    private javax.swing.JFormattedTextField J_pesquisar_data;
    private javax.swing.JButton J_pesquisar_todos_produtos;
    private javax.swing.JButton J_pesquisardata;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
