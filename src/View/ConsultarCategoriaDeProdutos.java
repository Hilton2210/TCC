package View;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultarCategoriaDeProdutos extends javax.swing.JFrame {

    public ConsultarCategoriaDeProdutos() {
        initComponents();
        add(jPanel1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        J_cod_pesquisa_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        J_descricao_pesquisa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        J_pesquisar_coud = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        J_mostra_todas_categoria_de_produtos_ = new javax.swing.JTable();
        J_pesquisar_todos_categoria_produtos_ = new javax.swing.JButton();
        J_remover = new javax.swing.JButton();
        J_alterar = new javax.swing.JButton();
        mensagem_status = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        J_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        J_data = new javax.swing.JFormattedTextField();
        J_descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        J_comentarios = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar categoria de produtos");

        jLabel5.setText("Código");

        J_descricao_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_descricao_pesquisaActionPerformed(evt);
            }
        });

        jLabel8.setText("Descrição");

        J_pesquisar_coud.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_coud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        J_pesquisar_coud.setText("PESQUISAR");
        J_pesquisar_coud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_coudActionPerformed(evt);
            }
        });

        J_mostra_todas_categoria_de_produtos_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {"", null, null, null},
                {"", null, null, null},
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
                "Código", "Descrição", "Data cadastro", "Comentários"
            }
        ));
        J_mostra_todas_categoria_de_produtos_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_mostra_todas_categoria_de_produtos_MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(J_mostra_todas_categoria_de_produtos_);

        J_pesquisar_todos_categoria_produtos_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_todos_categoria_produtos_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/PesquisarTodos.png"))); // NOI18N
        J_pesquisar_todos_categoria_produtos_.setText("TODOS");
        J_pesquisar_todos_categoria_produtos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_todos_categoria_produtos_ActionPerformed(evt);
            }
        });

        J_remover.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Lixeira.png"))); // NOI18N
        J_remover.setText("REMOVER");
        J_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_removerActionPerformed(evt);
            }
        });

        J_alterar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Atualizar dados.png"))); // NOI18N
        J_alterar.setText("ALTERAR");
        J_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_alterarActionPerformed(evt);
            }
        });

        mensagem_status.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mensagem_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar dados cadastrados"));

        J_codigo.setEditable(false);
        J_codigo.setBackground(new java.awt.Color(204, 204, 204));
        J_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        jLabel4.setText("Data cadastro");

        J_data.setEditable(false);
        J_data.setBackground(new java.awt.Color(204, 204, 204));
        try {
            J_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        J_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_descricaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição");

        J_comentarios.setColumns(20);
        J_comentarios.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        J_comentarios.setLineWrap(true);
        J_comentarios.setRows(1);
        jScrollPane1.setViewportView(J_comentarios);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Comentários");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J_codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(J_data, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(J_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(J_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_cod_pesquisa_, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_descricao_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_pesquisar_coud, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_pesquisar_todos_categoria_produtos_, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_remover, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J_cod_pesquisa_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_descricao_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(J_pesquisar_coud)
                        .addComponent(J_pesquisar_todos_categoria_produtos_)
                        .addComponent(J_alterar)
                        .addComponent(J_remover)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_descricao_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_descricao_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_descricao_pesquisaActionPerformed

    private void J_pesquisar_coudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_coudActionPerformed
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConsultarCategoriaDeProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
                Connection conn = null;
            try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");


// INICIO DA PESQUISA PERSONALIZADA
                String Query = null;
                if((J_cod_pesquisa_.getText().length()) > 0 ){
                    Query="select * from categoriaprodutos where codigo_categoria = " + J_cod_pesquisa_.getText();
                } else {
                    Query="select * from categoriaprodutos where descricao_categoria = "  + "'" + J_descricao_pesquisa.getText() + "'";
                }
// FIM DA PESQUISA PERSONALISADA


                PreparedStatement cmd;
                cmd = conn.prepareStatement(Query);
                ResultSet rs;
                rs = cmd.executeQuery();
                DefaultTableModel modelo =(DefaultTableModel) J_mostra_todas_categoria_de_produtos_.getModel();
            modelo.setNumRows(0);

            while(rs.next()){

                //DECLARANDO A INVERSÃO DA DATA
                String exibirdata = rs.getString("data_cadastro").replace("-", "");

                modelo.addRow(
                        new Object[]{
                            rs.getString("codigo_categoria"),
                            rs.getString("descricao_categoria"),
                            (exibirdata.substring(6,8) + "/" + exibirdata.substring(4,6) + "/" + exibirdata.substring(0,4)),
                            rs.getString("comentarios"),
});
}
            }catch(SQLException error){
               // JOptionPane.showMessageDialog("Ocorreu um erro de SQL !"+error.getMessage());
}
    }//GEN-LAST:event_J_pesquisar_coudActionPerformed

    private void J_pesquisar_todos_categoria_produtos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_todos_categoria_produtos_ActionPerformed
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConsultarCategoriaDeProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
                Connection conn = null;
            try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");
            
                String Query="select * from categoriaprodutos";
                PreparedStatement cmd;
                cmd = conn.prepareStatement(Query);
                ResultSet rs;
                rs = cmd.executeQuery();
                DefaultTableModel modelo =(DefaultTableModel) J_mostra_todas_categoria_de_produtos_.getModel();
            modelo.setNumRows(0);

            while(rs.next()){

                //DECLARANDO A INVERSÃO DA DATA
                String exibirdata = rs.getString("data_cadastro").replace("-", "");

                modelo.addRow(
                        new Object[]{
                            rs.getString("codigo_categoria"),
                            rs.getString("descricao_categoria"),
                            (exibirdata.substring(6,8) + "/" + exibirdata.substring(4,6) + "/" + exibirdata.substring(0,4)),
                            rs.getString("comentarios"),
});
}
            }catch(SQLException error){
               // JOptionPane.showMessageDialog("Ocorreu um erro de SQL !"+error.getMessage());
}
    }//GEN-LAST:event_J_pesquisar_todos_categoria_produtos_ActionPerformed

    private void J_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_removerActionPerformed
            try {
            try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");
            } catch (SQLException ex) {
            Logger.getLogger(ConsultarCategoriaDeProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }

            String sql = "DELETE FROM categoriaprodutos WHERE codigo_categoria=" + J_cod_pesquisa_.getText();

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.executeUpdate();

            stmt.close();
            con.close();
            mensagem_status.setForeground(Color.blue);
            mensagem_status.setText("CADASTRO REMOVIDO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar a classe ");
            } catch (SQLException e) {
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO REMOVER CADASTRO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Não foi possível remover o cadastro.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            // System.out.println("Ocorreu um erro ao acessar o banco de dados" + e.getMessage());
            JOptionPane.showMessageDialog(this, "Verifique os creitérios utilizados para remossão", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            }
           
            mensagem_status.setText("CADASTRO REMOVIDO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (Exception erro) {
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO REMOVERCADASTRO");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Cadastro não removido, " + "\n"
            + "Verifique os creitérios utilizados para remossão", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            }
    }//GEN-LAST:event_J_removerActionPerformed

    private void J_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_alterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_alterarActionPerformed

    private void J_mostra_todas_categoria_de_produtos_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_mostra_todas_categoria_de_produtos_MouseClicked
int JMTD = J_mostra_todas_categoria_de_produtos_.getSelectedRow();

J_cod_pesquisa_.setText((String) J_mostra_todas_categoria_de_produtos_.getValueAt(JMTD, 0));
//J_descricao_pesquisa.setText((String) J_mostra_todas_categoria_de_produtos_.getValueAt(JMTD, 1));

J_codigo.setText((String) J_mostra_todas_categoria_de_produtos_.getValueAt(JMTD, 0));
J_descricao.setText((String) J_mostra_todas_categoria_de_produtos_.getValueAt(JMTD, 1));
J_data.setText((String) J_mostra_todas_categoria_de_produtos_.getValueAt(JMTD, 2));
J_comentarios.setText((String) J_mostra_todas_categoria_de_produtos_.getValueAt(JMTD, 3));

    }//GEN-LAST:event_J_mostra_todas_categoria_de_produtos_MouseClicked

    private void J_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_descricaoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_descricaoActionPerformed

    private void J_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_codigoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCategoriaDeProdutos().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton J_alterar;
    private javax.swing.JTextField J_cod_pesquisa_;
    private javax.swing.JTextField J_codigo;
    private javax.swing.JTextArea J_comentarios;
    private javax.swing.JFormattedTextField J_data;
    private javax.swing.JTextField J_descricao;
    private javax.swing.JTextField J_descricao_pesquisa;
    private javax.swing.JTable J_mostra_todas_categoria_de_produtos_;
    private javax.swing.JButton J_pesquisar_coud;
    private javax.swing.JButton J_pesquisar_todos_categoria_produtos_;
    private javax.swing.JButton J_remover;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables

}
