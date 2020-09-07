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

public class CadastroDeFuncionarios extends javax.swing.JFrame {

ConsultarFuncionarios c_cdfun = new ConsultarFuncionarios(); //Consultar cadastro de funcionários

    public CadastroDeFuncionarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        J_codigo = new javax.swing.JTextField();
        J_rg = new javax.swing.JTextField();
        J_ctps = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        J_ctps_serie = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        J_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        J_nome_pai = new javax.swing.JTextField();
        J_nome_mae = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        J_cargo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        J_salario = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        J_comentarios = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        J_bairro = new javax.swing.JTextField();
        J_cidade = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        J_logadouro = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        mensagem_status = new javax.swing.JLabel();
        J_Cadastrar_Funcionarios_ = new javax.swing.JButton();
        J_consultar_funcionarios = new javax.swing.JButton();
        J_limpar_tela = new javax.swing.JButton();
        J_data_admissao = new javax.swing.JFormattedTextField();
        J_data_nascimento = new javax.swing.JFormattedTextField();
        J_data_demissao = new javax.swing.JFormattedTextField();
        J_sexo = new javax.swing.JComboBox();
        J_uf = new javax.swing.JComboBox();
        J_cep = new javax.swing.JFormattedTextField();
        J_tel_residencial = new javax.swing.JFormattedTextField();
        J_cpf = new javax.swing.JFormattedTextField();
        J_tel_celular = new javax.swing.JFormattedTextField();
        J_escolaridade = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar funcionários");

        jLabel2.setText("Código");

        jLabel6.setText("CPF");

        jLabel7.setText("RG");

        J_codigo.setEditable(false);
        J_codigo.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setText("CTPS");

        jLabel13.setText("CTPS série");

        jLabel3.setText("Nome");

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

        jLabel4.setText("Nome pai");

        jLabel5.setText("Nome mãe");

        J_nome_pai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_nome_paiActionPerformed(evt);
            }
        });
        J_nome_pai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_nome_paiKeyReleased(evt);
            }
        });

        J_nome_mae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_nome_maeActionPerformed(evt);
            }
        });
        J_nome_mae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_nome_maeKeyReleased(evt);
            }
        });

        jLabel22.setText("Data nascimento");

        jLabel24.setText("Data admissão");

        jLabel25.setText("Data demissão");

        jLabel11.setText("Tel. Residencial");

        jLabel10.setText("Tel. celular");

        jLabel9.setText("Escolaridade");

        J_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_cargoActionPerformed(evt);
            }
        });
        J_cargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_cargoKeyReleased(evt);
            }
        });

        jLabel26.setText("Cargo");

        J_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_salarioActionPerformed(evt);
            }
        });

        jLabel27.setText("Salário");

        jLabel8.setText("Sexo");

        jLabel29.setText("Comentários");

        J_comentarios.setColumns(20);
        J_comentarios.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        J_comentarios.setLineWrap(true);
        J_comentarios.setRows(1);
        J_comentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_comentariosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(J_comentarios);

        jSeparator2.setForeground(java.awt.Color.gray);

        jLabel17.setText("Bairro/Setor");

        J_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_bairroActionPerformed(evt);
            }
        });
        J_bairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_bairroKeyReleased(evt);
            }
        });

        J_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_cidadeActionPerformed(evt);
            }
        });
        J_cidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_cidadeKeyReleased(evt);
            }
        });

        jLabel19.setText("Cidade");

        jLabel18.setText("CEP");

        jLabel20.setText("UF");

        jLabel21.setText("Logradouro");

        J_logadouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_logadouroActionPerformed(evt);
            }
        });
        J_logadouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_logadouroKeyReleased(evt);
            }
        });

        jSeparator3.setForeground(java.awt.Color.gray);

        mensagem_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensagem_status.setForeground(java.awt.Color.red);
        mensagem_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        J_Cadastrar_Funcionarios_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_Cadastrar_Funcionarios_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cadastrar.png"))); // NOI18N
        J_Cadastrar_Funcionarios_.setText("CADASTRAR");
        J_Cadastrar_Funcionarios_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_Cadastrar_Funcionarios_ActionPerformed(evt);
            }
        });

        J_consultar_funcionarios.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_consultar_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        J_consultar_funcionarios.setText("PESQUISAR");
        J_consultar_funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_consultar_funcionariosActionPerformed(evt);
            }
        });

        J_limpar_tela.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_limpar_tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cancelar.png"))); // NOI18N
        J_limpar_tela.setText("LIMPAR TELA");
        J_limpar_tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_limpar_telaActionPerformed(evt);
            }
        });

        try {
            J_data_admissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_data_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_data_demissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        J_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMININO" }));

        J_uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GO" }));

        try {
            J_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_tel_residencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_tel_celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        J_escolaridade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENS. MÉDIO", "CURS. SUPERIOR", "SUPERIOR COM." }));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(J_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_logadouro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(J_Cadastrar_Funcionarios_)
                        .addGap(6, 6, 6)
                        .addComponent(J_consultar_funcionarios)
                        .addGap(6, 6, 6)
                        .addComponent(J_limpar_tela))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J_ctps, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_ctps_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(192, 192, 192))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_tel_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_escolaridade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(J_nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_tel_residencial, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(J_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J_data_admissao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25)
                                    .addComponent(J_data_demissao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(mensagem_status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_ctps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(J_ctps_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(J_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28))
                    .addComponent(J_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel26)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_tel_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(J_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(J_escolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel29)
                    .addComponent(jLabel11)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(J_nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel5)
                            .addGap(6, 6, 6)
                            .addComponent(J_nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(J_tel_residencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel22)
                            .addGap(6, 6, 6)
                            .addComponent(J_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(J_data_admissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel25)
                            .addGap(6, 6, 6)
                            .addComponent(J_data_demissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(J_logadouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_Cadastrar_Funcionarios_)
                    .addComponent(J_consultar_funcionarios)
                    .addComponent(J_limpar_tela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_salarioActionPerformed

    private void J_Cadastrar_Funcionarios_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_Cadastrar_Funcionarios_ActionPerformed
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
            Logger.getLogger(CadastroDeFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            //cria a string para inserir no banco;
            String sql = "insert into cadastrodefuncionarios("
                    + "cpf,rg,ctps,ctps_serie,nome,nome_pai,nome_mae,"
                    + "escolaridade,cargo,tel_celular,tel_residencial,data_nascimento,"
                    + "data_demissao,sexo,salario,end_cidade,end_bairro,end_uf,end_logadouro,"
                    + "end_cep,comentarios)values"
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção; 
            //stmt.setInt(1, Integer.parseInt(J_codigo.getText()));
            stmt.setString(1, J_cpf.getText());
            stmt.setInt(2, Integer.parseInt(J_rg.getText()));
            stmt.setInt(3, Integer.parseInt(J_ctps.getText()));
            stmt.setInt(4, Integer.parseInt(J_ctps_serie.getText()));
            stmt.setString(5, J_nome.getText());
            stmt.setString(6, J_nome_pai.getText());
            stmt.setString(7, J_nome_mae.getText());
            stmt.setString(8, (String) J_escolaridade.getSelectedItem());
            stmt.setString(9, J_cargo.getText());
            stmt.setString(10, J_tel_celular.getText());
            stmt.setString(11, J_tel_residencial.getText());
            stmt.setString(12, J_data_nascimento.getText());
            //stmt.setString(14, J_data_admissao.getText());
            stmt.setString(13, J_data_demissao.getText());
            stmt.setString(14, (String)J_sexo.getSelectedItem());
            stmt.setDouble(15, Double.parseDouble(J_salario.getText()));
            stmt.setString(16, J_cidade.getText());
            stmt.setString(17, J_bairro.getText());
            stmt.setString(18, (String)J_uf.getSelectedItem());
            stmt.setString(19, J_logadouro.getText());
            stmt.setString(20, J_cep.getText());
            stmt.setString(21, J_comentarios.getText());
                                 
            
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
    }//GEN-LAST:event_J_Cadastrar_Funcionarios_ActionPerformed

    private void J_consultar_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_consultar_funcionariosActionPerformed
//Abrir atalho------------------------------------------------------------------
    if (c_cdfun == null){
        c_cdfun = new ConsultarFuncionarios();
        c_cdfun.setLocationRelativeTo(null);
        c_cdfun.setVisible(true);
        c_cdfun.setResizable(false);
    }else{
        c_cdfun.setVisible(true);
        c_cdfun.setLocationRelativeTo(null);
        c_cdfun.setResizable(false);}
//------------------------------------------------------------------------------


}//GEN-LAST:event_J_consultar_funcionariosActionPerformed

    private void J_limpar_telaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_limpar_telaActionPerformed
            
            J_codigo.setText(null);
            J_cpf.setText(null);
            J_rg.setText(null);
            J_ctps.setText(null);
            J_ctps_serie.setText(null);
            J_nome.setText(null);
            J_nome_pai.setText(null);
            J_nome_mae.setText(null);
            //J_escolaridade.setText(null);
            J_cargo.setText(null);
            J_tel_celular.setText(null);
            J_tel_residencial.setText(null);
            J_data_nascimento.setText(null);
            J_data_admissao.setText(null);
            J_data_demissao.setText(null);
            J_salario.setText(null);
            J_cidade.setText(null);
            J_bairro.setText(null);
            J_logadouro.setText(null);
            J_cep.setText(null);
            J_comentarios.setText(null);
            mensagem_status.setText(null);
            
}//GEN-LAST:event_J_limpar_telaActionPerformed

    private void J_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nomeActionPerformed

    }//GEN-LAST:event_J_nomeActionPerformed

    private void J_nome_paiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nome_paiActionPerformed

    }//GEN-LAST:event_J_nome_paiActionPerformed

    private void J_nome_maeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nome_maeActionPerformed

    }//GEN-LAST:event_J_nome_maeActionPerformed

    private void J_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_cargoActionPerformed

    }//GEN-LAST:event_J_cargoActionPerformed

    private void J_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_bairroActionPerformed

    }//GEN-LAST:event_J_bairroActionPerformed

    private void J_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_cidadeActionPerformed

    }//GEN-LAST:event_J_cidadeActionPerformed

    private void J_logadouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_logadouroActionPerformed

    }//GEN-LAST:event_J_logadouroActionPerformed

    private void J_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nomeKeyReleased
        J_nome.setText(J_nome.getText().toUpperCase());
    }//GEN-LAST:event_J_nomeKeyReleased

    private void J_cargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_cargoKeyReleased
        J_cargo.setText(J_cargo.getText().toUpperCase());
    }//GEN-LAST:event_J_cargoKeyReleased

    private void J_nome_paiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nome_paiKeyReleased
        J_nome_pai.setText(J_nome_pai.getText().toUpperCase());
    }//GEN-LAST:event_J_nome_paiKeyReleased

    private void J_comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_comentariosKeyReleased
        J_comentarios.setText(J_comentarios.getText().toUpperCase());
    }//GEN-LAST:event_J_comentariosKeyReleased

    private void J_nome_maeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nome_maeKeyReleased
        J_nome_mae.setText(J_nome_mae.getText().toUpperCase());
    }//GEN-LAST:event_J_nome_maeKeyReleased

    private void J_bairroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_bairroKeyReleased
        J_bairro.setText(J_bairro.getText().toUpperCase());
    }//GEN-LAST:event_J_bairroKeyReleased

    private void J_cidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_cidadeKeyReleased
        J_cidade.setText(J_cidade.getText().toUpperCase());
    }//GEN-LAST:event_J_cidadeKeyReleased

    private void J_logadouroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_logadouroKeyReleased
        J_logadouro.setText(J_logadouro.getText().toUpperCase());
    }//GEN-LAST:event_J_logadouroKeyReleased


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton J_Cadastrar_Funcionarios_;
    private javax.swing.JTextField J_bairro;
    private javax.swing.JTextField J_cargo;
    private javax.swing.JFormattedTextField J_cep;
    private javax.swing.JTextField J_cidade;
    private javax.swing.JTextField J_codigo;
    private javax.swing.JTextArea J_comentarios;
    private javax.swing.JButton J_consultar_funcionarios;
    private javax.swing.JFormattedTextField J_cpf;
    private javax.swing.JTextField J_ctps;
    private javax.swing.JTextField J_ctps_serie;
    private javax.swing.JFormattedTextField J_data_admissao;
    private javax.swing.JFormattedTextField J_data_demissao;
    private javax.swing.JFormattedTextField J_data_nascimento;
    private javax.swing.JComboBox J_escolaridade;
    private javax.swing.JButton J_limpar_tela;
    private javax.swing.JTextField J_logadouro;
    private javax.swing.JTextField J_nome;
    private javax.swing.JTextField J_nome_mae;
    private javax.swing.JTextField J_nome_pai;
    private javax.swing.JTextField J_rg;
    private javax.swing.JTextField J_salario;
    private javax.swing.JComboBox J_sexo;
    private javax.swing.JFormattedTextField J_tel_celular;
    private javax.swing.JFormattedTextField J_tel_residencial;
    private javax.swing.JComboBox J_uf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables

}
