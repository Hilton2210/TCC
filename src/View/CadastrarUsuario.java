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
import java.awt.event.KeyEvent;


public class CadastrarUsuario extends javax.swing.JFrame {
ConsultarUsuario consultar_usuario = new ConsultarUsuario(); //Consultar usuário

    public CadastrarUsuario() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        J_codigo = new javax.swing.JTextField();
        J_nome = new javax.swing.JTextField();
        J_login = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        J_data_cadastro = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        J_cadastrar_usuario = new javax.swing.JButton();
        J_senha = new javax.swing.JPasswordField();
        mensagem_status = new javax.swing.JLabel();
        J_pesquisar_clientes = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar usuário");

        J_codigo.setEditable(false);
        J_codigo.setBackground(new java.awt.Color(204, 204, 204));
        J_codigo.setDisabledTextColor(java.awt.Color.darkGray);

        J_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_nomeKeyReleased(evt);
            }
        });

        jLabel2.setText("Código");

        jLabel3.setText("Nome usuário");

        jLabel4.setText("Data cadastro");

        J_data_cadastro.setEditable(false);
        J_data_cadastro.setBackground(new java.awt.Color(204, 204, 204));
        try {
            J_data_cadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        J_data_cadastro.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        J_data_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_data_cadastroActionPerformed(evt);
            }
        });

        jLabel5.setText("Login");

        jLabel6.setText("Senha");

        J_cadastrar_usuario.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_cadastrar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cadastrar.png"))); // NOI18N
        J_cadastrar_usuario.setText("CADASTRAR");
        J_cadastrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_cadastrar_usuarioActionPerformed(evt);
            }
        });
        J_cadastrar_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_cadastrar_usuarioKeyReleased(evt);
            }
        });

        mensagem_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        J_pesquisar_clientes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        J_pesquisar_clientes.setText("PESQUISAR");
        J_pesquisar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_clientesActionPerformed(evt);
            }
        });
        J_pesquisar_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_pesquisar_clientesKeyReleased(evt);
            }
        });

        jSeparator2.setForeground(java.awt.Color.gray);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(J_login, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(J_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(J_cadastrar_usuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(J_pesquisar_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(J_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(J_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(J_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(J_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(J_cadastrar_usuario))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(J_pesquisar_clientes)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nomeKeyReleased
J_nome.setText(J_nome.getText().toUpperCase());
        
    }//GEN-LAST:event_J_nomeKeyReleased

    private void J_cadastrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_cadastrar_usuarioActionPerformed
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
            Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            //cria a string para inserir no banco;
            String sql = "insert into cadastrarusuario(nome_usuario,login,senha)values(?,?,?)";

            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção;
            //stmt.setInt(1, Integer.parseInt(J_codigo.getText()));
            stmt.setString(1, J_nome.getText());
            stmt.setString(2, J_login.getText());
            stmt.setString(3, J_senha.getText());
            //stmt.setString(5, J_data_cadastro.getText());



            //executa o comando no banco de dados;
            stmt.executeUpdate();
            //fecha o comando e conexão;
            stmt.close();
            con.close();
            mensagem_status.setForeground(Color.blue);
            mensagem_status.setText("CADASTRADO REALIZADO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar a classe ");
            } catch (SQLException e) {
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO REALIZAR CADASTRO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Verifique se os campos foram preenchidos corretamente!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            //System.out.println("Ocorreu um erro ao acessar o banco de dados" + e.getMessage());
               JOptionPane.showMessageDialog(this, "Ocorreu um erro ao acessar o banco de dados", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            }
            //exibir mensagem se o funcionario foi cadastrado corretamente.
            mensagem_status.setText("CADASTRADO REALIZADO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (Exception erro) {//se o funcionario não foi cadastrado corretamente exibir esta mensagem.
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO REALIZAR CADASTRO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Atenção, cadastro não realizado, " + "\n"
            + "Verifique se os campos foram preenchidos corretamente!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            }


            
    }//GEN-LAST:event_J_cadastrar_usuarioActionPerformed

    private void J_pesquisar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_clientesActionPerformed
//Abrir tela -------------------------------------------------------------------
    if (consultar_usuario == null){
        consultar_usuario = new ConsultarUsuario();
        consultar_usuario.setLocationRelativeTo(null);
        consultar_usuario.setVisible(true);
        consultar_usuario.setResizable(false);
    }else{
        consultar_usuario.setVisible(true);
        consultar_usuario.setLocationRelativeTo(null);
        consultar_usuario.setResizable(false);}
//------------------------------------------------------------------------------

    }//GEN-LAST:event_J_pesquisar_clientesActionPerformed

    private void J_data_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_data_cadastroActionPerformed

    }//GEN-LAST:event_J_data_cadastroActionPerformed

    private void J_pesquisar_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_pesquisar_clientesKeyReleased

       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
//Abrir tela -------------------------------------------------------------------
    if (consultar_usuario == null){
        consultar_usuario = new ConsultarUsuario();
        consultar_usuario.setLocationRelativeTo(null);
        consultar_usuario.setVisible(true);
        consultar_usuario.setResizable(false);
    }else{
        consultar_usuario.setVisible(true);
        consultar_usuario.setLocationRelativeTo(null);
        consultar_usuario.setResizable(false);}
//------------------------------------------------------------------------------


        }

    }//GEN-LAST:event_J_pesquisar_clientesKeyReleased

    private void J_cadastrar_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_cadastrar_usuarioKeyReleased
if (evt.getKeyCode() == KeyEvent.VK_ENTER){


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
            Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            //cria a string para inserir no banco;
            String sql = "insert into cadastrarusuario(nome_usuario,login,senha)values(?,?,?)";

            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção;
            //stmt.setInt(1, Integer.parseInt(J_codigo.getText()));
            stmt.setString(1, J_nome.getText());
            stmt.setString(2, J_login.getText());
            stmt.setString(3, J_senha.getText());
            //stmt.setString(5, J_data_cadastro.getText());



            //executa o comando no banco de dados;
            stmt.executeUpdate();
            //fecha o comando e conexão;
            stmt.close();
            con.close();
            mensagem_status.setForeground(Color.blue);
            mensagem_status.setText("CADASTRO REALIZADO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar a classe ");
            } catch (SQLException e) {
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO REALIZAR CADASTRO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Existem campos sem preencher.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            //System.out.println("Ocorreu um erro ao acessar o banco de dados" + e.getMessage());
               JOptionPane.showMessageDialog(this, "Ocorreu um erro ao acessar o banco de dados", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            }
            //exibir mensagem se o funcionario foi cadastrado corretamente.
            mensagem_status.setText("CADASTRO REALIZADO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (Exception erro) {//se o funcionario não foi cadastrado corretamente exibir esta mensagem.
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO REALIZAR CADASTRO");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Cadastro não realizado, " + "\n"
            + "Preencha os campos obrigatórios", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            }


        }
    }//GEN-LAST:event_J_cadastrar_usuarioKeyReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton J_cadastrar_usuario;
    private javax.swing.JTextField J_codigo;
    private javax.swing.JFormattedTextField J_data_cadastro;
    private javax.swing.JTextField J_login;
    private javax.swing.JTextField J_nome;
    private javax.swing.JButton J_pesquisar_clientes;
    private javax.swing.JPasswordField J_senha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables

}
