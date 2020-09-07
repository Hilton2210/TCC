
package View;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Font;

public class DiarioDeBordo extends javax.swing.JFrame {

        ConsultarDiariosAnteriores cdba = new ConsultarDiariosAnteriores();

    public DiarioDeBordo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        J_codigo = new javax.swing.JTextField();
        J_nome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        J_data = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        J_descricao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        J_salvar = new javax.swing.JButton();
        mensagem_status = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        J_limparTela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Diário");

        jLabel2.setText("Código");

        J_codigo.setEditable(false);
        J_codigo.setBackground(new java.awt.Color(204, 204, 204));
        J_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigoActionPerformed(evt);
            }
        });

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

        jLabel9.setText("Nome");

        jLabel10.setText("Data");

        J_data.setEditable(false);
        J_data.setBackground(new java.awt.Color(204, 204, 204));
        try {
            J_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        J_descricao.setColumns(20);
        J_descricao.setLineWrap(true);
        J_descricao.setRows(5);
        J_descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_descricaoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(J_descricao);

        jLabel3.setText("Descrição (2.000 caracteres)");

        J_salvar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cadastrar.png"))); // NOI18N
        J_salvar.setText("SALVAR");
        J_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_salvarActionPerformed(evt);
            }
        });

        mensagem_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/PesquisarTodos.png"))); // NOI18N
        jButton2.setText("DIÁRIOS ARMAZENADOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        J_limparTela.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_limparTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cancelar.png"))); // NOI18N
        J_limparTela.setText("LIMPAR TELA");
        J_limparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_limparTelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_data, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_limparTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
            .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel2)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(J_salvar)
                        .addComponent(J_limparTela)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_codigoActionPerformed

    private void J_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nomeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_nomeActionPerformed

    private void J_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_salvarActionPerformed
try {

            try {
            //procura por uma classe no projeto
            Class.forName("com.mysql.jdbc.Driver");
            //cria uma variavel;
            Connection con = null;
            try {

            //cria conexão com o banco;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");
            } catch (SQLException ex) {
            Logger.getLogger(DiarioDeBordo.class.getName()).log(Level.SEVERE, null, ex);
            }
            //cria a string para inserir no banco;
            String sql = "insert into diariodebordo(nome,descricao)values(?,?)";

            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção;

            stmt.setString(1, J_nome.getText());
            stmt.setString(2, J_descricao.getText());




            //executa o comando no banco de dados;
            stmt.executeUpdate();
            //fecha o comando e conexão;
            stmt.close();
            con.close();
            mensagem_status.setForeground(Color.blue);
            mensagem_status.setText("DIÁRIO DE BORDO ENVIADO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar a classe ");
            } catch (SQLException e) {
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO ENVIAR DIÁRIO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Existem campos sem preencher.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            System.out.println("Ocorreu um erro ao acessar o banco de dados" + e.getMessage());

            }
            //exibir mensagem se o funcionario foi cadastrado corretamente.
            mensagem_status.setText("DIÁRIO DE BORDO ENVIADO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (Exception erro) {//se o funcionario não foi cadastrado corretamente exibir esta mensagem.
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO ENVIAR DIÁRIO");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Cadastro não realizado, " + "\n"
            + "Preencha os campos obrigatórios", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            }
}//GEN-LAST:event_J_salvarActionPerformed

    private void J_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nomeKeyReleased
J_nome.setText(J_nome.getText().toUpperCase());
    }//GEN-LAST:event_J_nomeKeyReleased

    private void J_descricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_descricaoKeyReleased
J_descricao.setText(J_descricao.getText().toUpperCase());
    }//GEN-LAST:event_J_descricaoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cdba = new ConsultarDiariosAnteriores();
        cdba.setLocationRelativeTo(null);
        cdba.setVisible(true);
        cdba.setResizable(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void J_limparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_limparTelaActionPerformed

        J_nome.setText(null);
        J_descricao.setText(null);
        J_data.setText(null);
        J_codigo.setText(null);
        mensagem_status.setText(null);

    }//GEN-LAST:event_J_limparTelaActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiarioDeBordo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField J_codigo;
    private javax.swing.JFormattedTextField J_data;
    private javax.swing.JTextArea J_descricao;
    private javax.swing.JButton J_limparTela;
    private javax.swing.JTextField J_nome;
    private javax.swing.JButton J_salvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables

}
