package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class CadastroDeCategoriaProdutos extends javax.swing.JFrame {

ConsultarCategoriaDeProdutos c_cdp = new ConsultarCategoriaDeProdutos(); //Consultar categoria de produtos


public CadastroDeCategoriaProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel7 = new JLabel();
        J_codigo = new JTextField();
        J_descricao = new JTextField();
        jScrollPane1 = new JScrollPane();
        J_comentarios = new JTextArea();
        J_cadastrar_categoria_produtos_ = new JButton();
        mensagem_status = new JLabel();
        J_pesquisar_categoria = new JButton();
        J_limpartela = new JButton();
        J_data_cadastro = new JFormattedTextField();
        jSeparator2 = new JSeparator();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar categoria de produtos");

        jLabel2.setText("Código");

        jLabel3.setText("Descrição");

        jLabel4.setText("Data cadastro");

        jLabel7.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel7.setText("Comentários");

        J_codigo.setEditable(false);
        J_codigo.setBackground(new Color(204, 204, 204));
        J_codigo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J_codigoActionPerformed(evt);
            }
        });

        J_descricao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J_descricaoActionPerformed(evt);
            }
        });
        J_descricao.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                J_descricaoKeyReleased(evt);
            }
        });

        J_comentarios.setColumns(20);
        J_comentarios.setFont(new Font("Tahoma", 0, 11)); // NOI18N
        J_comentarios.setLineWrap(true);
        J_comentarios.setRows(5);
        J_comentarios.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                J_comentariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(J_comentarios);

        J_cadastrar_categoria_produtos_.setFont(new Font("Tahoma", 1, 10)); // NOI18N
        J_cadastrar_categoria_produtos_.setIcon(new ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cadastrar.png"))); // NOI18N
        J_cadastrar_categoria_produtos_.setText("CADASTRAR");
        J_cadastrar_categoria_produtos_.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J_cadastrar_categoria_produtos_ActionPerformed(evt);
            }
        });
        J_cadastrar_categoria_produtos_.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                J_cadastrar_categoria_produtos_KeyReleased(evt);
            }
        });

        mensagem_status.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        mensagem_status.setForeground(Color.red);
        mensagem_status.setHorizontalAlignment(SwingConstants.CENTER);

        J_pesquisar_categoria.setFont(new Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_categoria.setIcon(new ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        J_pesquisar_categoria.setText("PESQUISAR");
        J_pesquisar_categoria.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J_pesquisar_categoriaActionPerformed(evt);
            }
        });
        J_pesquisar_categoria.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                J_pesquisar_categoriaKeyReleased(evt);
            }
        });

        J_limpartela.setFont(new Font("Tahoma", 1, 10)); // NOI18N
        J_limpartela.setIcon(new ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cancelar.png"))); // NOI18N
        J_limpartela.setText("LIMPAR TELA");
        J_limpartela.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J_limpartelaActionPerformed(evt);
            }
        });
        J_limpartela.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                J_limpartelaKeyReleased(evt);
            }
        });

        J_data_cadastro.setEditable(false);
        J_data_cadastro.setBackground(new Color(204, 204, 204));
        try {
            J_data_cadastro.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        J_data_cadastro.setMinimumSize(new Dimension(6, 21));

        jSeparator2.setForeground(Color.gray);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
            .addComponent(jSeparator2, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
            .addComponent(mensagem_status, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(Alignment.LEADING, false)
                            .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_codigo, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
                            .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_data_cadastro, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                            .addComponent(J_descricao, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(J_cadastrar_categoria_produtos_, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(J_pesquisar_categoria, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(J_limpartela, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 375, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(J_codigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_data_cadastro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_descricao))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(J_cadastrar_categoria_produtos_)
                    .addComponent(J_limpartela)
                    .addComponent(J_pesquisar_categoria))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(mensagem_status, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_descricaoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_J_descricaoActionPerformed

    
    }//GEN-LAST:event_J_descricaoActionPerformed

    private void J_cadastrar_categoria_produtos_ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_J_cadastrar_categoria_produtos_ActionPerformed
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
            Logger.getLogger(CadastroDeCategoriaProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            //cria a string para inserir no banco;
            String sql = "insert into categoriaprodutos(descricao_categoria,"
                    + "comentarios)values(?,?)";

            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção;
            //stmt.setInt(1, Integer.parseInt(J_codigo.getText()));
            stmt.setString(1, J_descricao.getText());
            //stmt.setInt(2, Integer.parseInt(J_codigo_fornecedores.getText())); COLUNA REMOVIDA DO BANCO DE DADOS
            //stmt.setInt(4, Integer.parseInt(J_data_cadastro.getText()));
            stmt.setString(2, J_comentarios.getText());


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

    }//GEN-LAST:event_J_cadastrar_categoria_produtos_ActionPerformed

    private void J_pesquisar_categoriaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_categoriaActionPerformed
//Abrir atalho------------------------------------------------------------------
    if (c_cdp == null){
        c_cdp = new ConsultarCategoriaDeProdutos();
        c_cdp.setLocationRelativeTo(null);
        c_cdp.setVisible(true);
        c_cdp.setResizable(false);
    }else{
        c_cdp.setVisible(true);
        c_cdp.setLocationRelativeTo(null);
        c_cdp.setResizable(false);}
//------------------------------------------------------------------------------


        
    }//GEN-LAST:event_J_pesquisar_categoriaActionPerformed

    private void J_limpartelaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_J_limpartelaActionPerformed


J_codigo.setText(null);
J_descricao.setText(null);
//J_codigo_fornecedores.setText(null); --> CAMPO REMOVIDO DO BANCO DE DADOS
J_data_cadastro.setText(null);
J_comentarios.setText(null);
mensagem_status.setText(null);


    }//GEN-LAST:event_J_limpartelaActionPerformed

    private void J_codigoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_J_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_codigoActionPerformed

    private void J_descricaoKeyReleased(KeyEvent evt) {//GEN-FIRST:event_J_descricaoKeyReleased
    J_descricao.setText(J_descricao.getText().toUpperCase());
    
    }//GEN-LAST:event_J_descricaoKeyReleased

    private void J_comentariosKeyReleased(KeyEvent evt) {//GEN-FIRST:event_J_comentariosKeyReleased
    J_comentarios.setText(J_comentarios.getText().toUpperCase());
    }//GEN-LAST:event_J_comentariosKeyReleased

    private void J_limpartelaKeyReleased(KeyEvent evt) {//GEN-FIRST:event_J_limpartelaKeyReleased

//LIMPAR TELA ATRAVÉS DO ENTER
if (evt.getKeyCode() == KeyEvent.VK_ENTER){
J_codigo.setText(null);
J_descricao.setText(null);
//J_codigo_fornecedores.setText(null); --> CAMPO REMOVIDO DO BANCO DE DADOS
J_data_cadastro.setText(null);
J_comentarios.setText(null);
mensagem_status.setText(null);
        }

    }//GEN-LAST:event_J_limpartelaKeyReleased

    private void J_pesquisar_categoriaKeyReleased(KeyEvent evt) {//GEN-FIRST:event_J_pesquisar_categoriaKeyReleased

//ABRIR ATALHO ATRAVÉS DO ENTER
if (evt.getKeyCode() == KeyEvent.VK_ENTER){
//Abrir atalho------------------------------------------------------------------
    if (c_cdp == null){
        c_cdp = new ConsultarCategoriaDeProdutos();
        c_cdp.setLocationRelativeTo(null);
        c_cdp.setVisible(true);
        c_cdp.setResizable(false);
    }else{
        c_cdp.setVisible(true);
        c_cdp.setLocationRelativeTo(null);
        c_cdp.setResizable(false);}
//------------------------------------------------------------------------------
        }


    }//GEN-LAST:event_J_pesquisar_categoriaKeyReleased

    private void J_cadastrar_categoria_produtos_KeyReleased(KeyEvent evt) {//GEN-FIRST:event_J_cadastrar_categoria_produtos_KeyReleased

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
            Logger.getLogger(CadastroDeCategoriaProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            //cria a string para inserir no banco;
            String sql = "insert into categoriaprodutos(descricao_categoria,"
                    + "comentarios)values(?,?)";

            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção;
            //stmt.setInt(1, Integer.parseInt(J_codigo.getText()));
            stmt.setString(1, J_descricao.getText());
            //stmt.setInt(2, Integer.parseInt(J_codigo_fornecedores.getText())); COLUNA REMOVIDA DO BANCO DE DADOS
            //stmt.setInt(4, Integer.parseInt(J_data_cadastro.getText()));
            stmt.setString(2, J_comentarios.getText());


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
    }//GEN-LAST:event_J_cadastrar_categoria_produtos_KeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeCategoriaProdutos().setVisible(true);
 }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton J_cadastrar_categoria_produtos_;
    private JTextField J_codigo;
    private JTextArea J_comentarios;
    private JFormattedTextField J_data_cadastro;
    private JTextField J_descricao;
    private JButton J_limpartela;
    private JButton J_pesquisar_categoria;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel7;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator2;
    private JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables

}
