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

public class CadastroDeFornecedores extends javax.swing.JFrame {

    ConsultarFornecedores c_cdf = new ConsultarFornecedores(); //Consultar categoria de produtos

    public CadastroDeFornecedores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        J_codigo = new javax.swing.JTextField();
        J_categoria_produtos = new javax.swing.JTextField();
        J_razao_social = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        J_contato_fornecedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        J_setor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        J_logadouro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        J_cidade = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        J_home_page = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        J_email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        J_comentarios = new javax.swing.JTextArea();
        mensagem_status = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        J_Cadastrar_fornecedores_ = new javax.swing.JButton();
        J_pesquisar_forncedores = new javax.swing.JButton();
        J_limpartela = new javax.swing.JButton();
        J_data_cadastro = new javax.swing.JFormattedTextField();
        J_data_ult_alteracao = new javax.swing.JFormattedTextField();
        jSeparator5 = new javax.swing.JSeparator();
        J_uf = new javax.swing.JComboBox();
        J_forma_pagamento = new javax.swing.JComboBox();
        J_cnpj = new javax.swing.JFormattedTextField();
        J_cep = new javax.swing.JFormattedTextField();
        J_tel_fornecedor = new javax.swing.JFormattedTextField();
        J_tel_contato = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar fornecedores");
        setResizable(false);

        jLabel2.setText("Código");

        jLabel3.setText("Razão social");

        jLabel4.setText("CNPJ");

        jLabel5.setText("Cat. produtos");

        J_codigo.setEditable(false);
        J_codigo.setBackground(new java.awt.Color(204, 204, 204));

        J_categoria_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_categoria_produtosActionPerformed(evt);
            }
        });

        J_razao_social.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_razao_socialActionPerformed(evt);
            }
        });
        J_razao_social.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_razao_socialKeyReleased(evt);
            }
        });

        jLabel6.setText("Contato");

        J_contato_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_contato_fornecedorActionPerformed(evt);
            }
        });
        J_contato_fornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_contato_fornecedorKeyReleased(evt);
            }
        });

        jLabel7.setText("Telefone fornecedor");

        jLabel8.setText("Telefone contato");

        jLabel17.setText("Bairro/Setor");

        jLabel18.setText("CEP");

        J_setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_setorActionPerformed(evt);
            }
        });
        J_setor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_setorKeyReleased(evt);
            }
        });

        jLabel19.setText("Cidade");

        jLabel20.setText("UF");

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

        jLabel21.setText("Logradouro");

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

        jSeparator2.setForeground(java.awt.Color.gray);

        jLabel23.setText("Exemplo preenchimento do logradouro.: Rua 140, Quadra 36, Lote 3");

        jSeparator3.setForeground(java.awt.Color.gray);

        jLabel9.setText("F. de pagamento");

        jLabel10.setText("home Page");

        J_home_page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_home_pageActionPerformed(evt);
            }
        });
        J_home_page.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_home_pageKeyReleased(evt);
            }
        });

        jLabel11.setText("e-mail");

        J_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_emailActionPerformed(evt);
            }
        });
        J_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_emailKeyReleased(evt);
            }
        });

        jLabel12.setText("Comentários");

        J_comentarios.setColumns(20);
        J_comentarios.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        J_comentarios.setLineWrap(true);
        J_comentarios.setRows(1);
        J_comentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_comentariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(J_comentarios);

        mensagem_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensagem_status.setForeground(java.awt.Color.red);
        mensagem_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel13.setText("Data cadastro");

        jLabel14.setText("Ultima alteração");

        J_Cadastrar_fornecedores_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_Cadastrar_fornecedores_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cadastrar.png"))); // NOI18N
        J_Cadastrar_fornecedores_.setText("CADASTRAR");
        J_Cadastrar_fornecedores_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_Cadastrar_fornecedores_ActionPerformed(evt);
            }
        });

        J_pesquisar_forncedores.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_forncedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        J_pesquisar_forncedores.setText("PESQUISAR");
        J_pesquisar_forncedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_forncedoresActionPerformed(evt);
            }
        });

        J_limpartela.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_limpartela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cancelar.png"))); // NOI18N
        J_limpartela.setText("LIMPAR TELA");
        J_limpartela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_limpartelaActionPerformed(evt);
            }
        });

        J_data_cadastro.setEditable(false);
        J_data_cadastro.setBackground(new java.awt.Color(204, 204, 204));
        try {
            J_data_cadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_data_ult_alteracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jSeparator5.setForeground(java.awt.Color.gray);

        J_uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        J_forma_pagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A VISTA", "A PRAZO", "NO CARTÃO", "CHEQUE" }));
        J_forma_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_forma_pagamentoActionPerformed(evt);
            }
        });

        try {
            J_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_tel_fornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_tel_contato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_tel_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(J_tel_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_email, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(J_Cadastrar_fornecedores_, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(J_pesquisar_forncedores, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(J_limpartela)
                .addGap(72, 72, 72))
            .addComponent(jSeparator3)
            .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(J_setor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(J_logadouro, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_categoria_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_forma_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_data_ult_alteracao)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J_razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_contato_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_home_page))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_categoria_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J_forma_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(J_data_ult_alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_home_page)
                    .addComponent(J_contato_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_tel_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(J_tel_contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(J_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jLabel19))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(J_setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(J_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J_logadouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_Cadastrar_fornecedores_)
                    .addComponent(J_pesquisar_forncedores)
                    .addComponent(J_limpartela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_Cadastrar_fornecedores_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_Cadastrar_fornecedores_ActionPerformed
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
                    Logger.getLogger(CadastroDeFornecedores.class.getName()).log(Level.SEVERE, null, ex);
                }

                //cria a string para inserir no banco;
                String sql = "insert into cadastrarfornecedores(razao_social,"
                        + "cnjp_fornecedor,telefone_fornecedor,nome_contato_fornecedor,telefone_contato,"
                        + "categoria_produtos,forma_pagamento,data_ult_alte ,end_cidade,end_bairro,"
                        + "end_uf,end_logadouro,end_cep,homepage,email,comentarios)"
                        + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                //cria o comando;
                PreparedStatement stmt = con.prepareStatement(sql);
                //seta os valores na String de inserção; 
                //stmt.setInt(1, Integer.parseInt(J_codigo.getText()));
                stmt.setString(1, J_razao_social.getText());
                stmt.setString(2, J_cnpj.getText());
                stmt.setString(3, J_tel_fornecedor.getText());
                stmt.setString(4, J_contato_fornecedor.getText());
                stmt.setString(5, J_tel_contato.getText());
                stmt.setInt(6, Integer.parseInt(J_categoria_produtos.getText()));
                stmt.setString(7, (String) J_forma_pagamento.getSelectedItem());
                //stmt.setDat9e(, Date.parse(J_data_cadastro.getText()));
                stmt.setString(8, J_data_ult_alteracao.getText());
                stmt.setString(9, J_cidade.getText());
                stmt.setString(10, J_setor.getText());
                stmt.setString(11, (String) J_uf.getSelectedItem());
                stmt.setString(12, J_logadouro.getText());
                stmt.setString(13, J_cep.getText());
                stmt.setString(14, J_home_page.getText());
                stmt.setString(15, J_email.getText());
                stmt.setString(16, J_comentarios.getText());

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
}//GEN-LAST:event_J_Cadastrar_fornecedores_ActionPerformed

    private void J_pesquisar_forncedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_forncedoresActionPerformed
//Abrir atalho------------------------------------------------------------------
        if (c_cdf == null) {
            c_cdf = new ConsultarFornecedores();
            c_cdf.setLocationRelativeTo(null);
            c_cdf.setVisible(true);
            c_cdf.setResizable(false);
        } else {
            c_cdf.setVisible(true);
            c_cdf.setLocationRelativeTo(null);
            c_cdf.setResizable(false);
        }
//------------------------------------------------------------------------------


}//GEN-LAST:event_J_pesquisar_forncedoresActionPerformed

    private void J_limpartelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_limpartelaActionPerformed

        J_codigo.setText(null);
        J_razao_social.setText(null);
        J_cnpj.setText(null);
        J_tel_fornecedor.setText(null);
        J_contato_fornecedor.setText(null);
        J_tel_contato.setText(null);
        J_categoria_produtos.setText(null);
        J_data_cadastro.setText(null);
        J_data_ult_alteracao.setText(null);
        J_cidade.setText(null);
        J_setor.setText(null);
        J_uf.getSelectedItem();
        J_logadouro.setText(null);
        J_cep.setText(null);
        J_home_page.setText(null);
        J_email.setText(null);
        J_comentarios.setText(null);
        mensagem_status.setText(null);


}//GEN-LAST:event_J_limpartelaActionPerformed

    private void J_categoria_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_categoria_produtosActionPerformed
        J_categoria_produtos.setText(J_categoria_produtos.getText().toUpperCase());
    }//GEN-LAST:event_J_categoria_produtosActionPerformed

    private void J_razao_socialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_razao_socialActionPerformed

    }//GEN-LAST:event_J_razao_socialActionPerformed

    private void J_contato_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_contato_fornecedorActionPerformed

    }//GEN-LAST:event_J_contato_fornecedorActionPerformed

    private void J_home_pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_home_pageActionPerformed

    }//GEN-LAST:event_J_home_pageActionPerformed

    private void J_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_emailActionPerformed

    }//GEN-LAST:event_J_emailActionPerformed

    private void J_setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_setorActionPerformed

    }//GEN-LAST:event_J_setorActionPerformed

    private void J_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_cidadeActionPerformed

    }//GEN-LAST:event_J_cidadeActionPerformed

    private void J_logadouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_logadouroActionPerformed

    }//GEN-LAST:event_J_logadouroActionPerformed

    private void J_razao_socialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_razao_socialKeyReleased
        J_razao_social.setText(J_razao_social.getText().toUpperCase());
    }//GEN-LAST:event_J_razao_socialKeyReleased

    private void J_contato_fornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_contato_fornecedorKeyReleased
        J_contato_fornecedor.setText(J_contato_fornecedor.getText().toUpperCase());
    }//GEN-LAST:event_J_contato_fornecedorKeyReleased

    private void J_home_pageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_home_pageKeyReleased
        J_home_page.setText(J_home_page.getText().toUpperCase());
    }//GEN-LAST:event_J_home_pageKeyReleased

    private void J_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_emailKeyReleased
        J_email.setText(J_email.getText().toUpperCase());
    }//GEN-LAST:event_J_emailKeyReleased

    private void J_comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_comentariosKeyReleased
        J_comentarios.setText(J_comentarios.getText().toUpperCase());
    }//GEN-LAST:event_J_comentariosKeyReleased

    private void J_setorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_setorKeyReleased
        J_setor.setText(J_setor.getText().toUpperCase());
    }//GEN-LAST:event_J_setorKeyReleased

    private void J_cidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_cidadeKeyReleased
        J_cidade.setText(J_cidade.getText().toUpperCase());
    }//GEN-LAST:event_J_cidadeKeyReleased

    private void J_logadouroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_logadouroKeyReleased
        J_logadouro.setText(J_logadouro.getText().toUpperCase());
    }//GEN-LAST:event_J_logadouroKeyReleased

    private void J_forma_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_forma_pagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_forma_pagamentoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton J_Cadastrar_fornecedores_;
    private javax.swing.JTextField J_categoria_produtos;
    private javax.swing.JFormattedTextField J_cep;
    private javax.swing.JTextField J_cidade;
    private javax.swing.JFormattedTextField J_cnpj;
    private javax.swing.JTextField J_codigo;
    private javax.swing.JTextArea J_comentarios;
    private javax.swing.JTextField J_contato_fornecedor;
    private javax.swing.JFormattedTextField J_data_cadastro;
    private javax.swing.JFormattedTextField J_data_ult_alteracao;
    private javax.swing.JTextField J_email;
    private javax.swing.JComboBox J_forma_pagamento;
    private javax.swing.JTextField J_home_page;
    private javax.swing.JButton J_limpartela;
    private javax.swing.JTextField J_logadouro;
    private javax.swing.JButton J_pesquisar_forncedores;
    private javax.swing.JTextField J_razao_social;
    private javax.swing.JTextField J_setor;
    private javax.swing.JFormattedTextField J_tel_contato;
    private javax.swing.JFormattedTextField J_tel_fornecedor;
    private javax.swing.JComboBox J_uf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables

}
