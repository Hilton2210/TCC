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

public class ConsultarFornecedores extends javax.swing.JFrame {

    public ConsultarFornecedores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        J_pesquisar_codigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        J_mostra_todos_fornecedores_ = new javax.swing.JTable();
        J_pesquisar_todos_fornecedores_ = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        mensagem_status = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        J_remover = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        J_forma_pagamento = new javax.swing.JTextField();
        J_uf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        J_comentarios = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        J_email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        J_logadouro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        J_home_page = new javax.swing.JTextField();
        J_setor = new javax.swing.JTextField();
        J_cidade = new javax.swing.JTextField();
        J_categoria_produtos = new javax.swing.JTextField();
        J_razao_social = new javax.swing.JTextField();
        J_data_ult_alteracao = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        J_contato_fornecedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        J_codigo = new javax.swing.JTextField();
        J_cnpj = new javax.swing.JFormattedTextField();
        J_tel_fornecedor = new javax.swing.JFormattedTextField();
        J_data_cadastrado = new javax.swing.JFormattedTextField();
        J_tel_contato = new javax.swing.JFormattedTextField();
        J_cep = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar forncedores");

        jLabel15.setText("Código");

        jLabel16.setText("CNPJ");

        J_mostra_todos_fornecedores_.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "RAZÃO SOCIAL", "CONTATO", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(J_mostra_todos_fornecedores_);

        J_pesquisar_todos_fornecedores_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_todos_fornecedores_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/PesquisarTodos.png"))); // NOI18N
        J_pesquisar_todos_fornecedores_.setText("TODOS");
        J_pesquisar_todos_fornecedores_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_todos_fornecedores_ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        jButton1.setText("PESQUISAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        mensagem_status.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mensagem_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Atualizar dados.png"))); // NOI18N
        jButton3.setText("ATUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        jLabel23.setText("Razão social");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar dados cadastrados"));

        J_forma_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_forma_pagamentoActionPerformed(evt);
            }
        });
        J_forma_pagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_forma_pagamentoKeyReleased(evt);
            }
        });

        J_uf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_ufActionPerformed(evt);
            }
        });
        J_uf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_ufKeyReleased(evt);
            }
        });

        jLabel17.setText("Bairro/Setor");

        jLabel8.setText("Tel. contato");

        jLabel18.setText("CEP");

        jLabel12.setText("Comentários");

        J_comentarios.setColumns(20);
        J_comentarios.setLineWrap(true);
        J_comentarios.setRows(1);
        J_comentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_comentariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(J_comentarios);

        jLabel11.setText("Email");

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

        jLabel19.setText("Cidade");

        jLabel10.setText("Home Page");

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

        jLabel9.setText("Form. de pagamento");

        jLabel21.setText("Logradouro");

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

        try {
            J_data_ult_alteracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel14.setText("Dt. ult. alteração");

        jLabel6.setText("Contato");

        jLabel13.setText("Dt. cadastro");

        jLabel3.setText("Razão social");

        jLabel2.setText("Código");

        jLabel5.setText("Cat. produtos");

        jLabel4.setText("CNPJ");

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

        jLabel7.setText("Tel.fornecedor");

        J_codigo.setEditable(false);
        J_codigo.setBackground(new java.awt.Color(204, 204, 204));

        try {
            J_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_tel_fornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        J_data_cadastrado.setEditable(false);
        J_data_cadastrado.setBackground(new java.awt.Color(204, 204, 204));
        try {
            J_data_cadastrado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_tel_contato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_categoria_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_forma_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_home_page, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_email, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J_razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J_contato_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J_tel_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J_tel_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J_data_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J_data_ult_alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J_setor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_logadouro, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_categoria_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_forma_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_home_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)))
                    .addComponent(J_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(J_razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(J_contato_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(J_tel_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(J_tel_contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(J_data_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(J_data_ult_alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_logadouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_pesquisar_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addGap(6, 6, 6)
                        .addComponent(J_pesquisar_todos_fornecedores_)
                        .addGap(6, 6, 6)
                        .addComponent(J_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(7, 7, 7)
                        .addComponent(J_pesquisar_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(7, 7, 7)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(7, 7, 7)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)
                    .addComponent(J_pesquisar_todos_fornecedores_)
                    .addComponent(J_remover)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_setorActionPerformed

}//GEN-LAST:event_J_setorActionPerformed

    private void J_setorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_setorKeyReleased
        J_setor.setText(J_setor.getText().toUpperCase());
}//GEN-LAST:event_J_setorKeyReleased

    private void J_categoria_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_categoria_produtosActionPerformed
        J_categoria_produtos.setText(J_categoria_produtos.getText().toUpperCase());
}//GEN-LAST:event_J_categoria_produtosActionPerformed

    private void J_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_cidadeActionPerformed

}//GEN-LAST:event_J_cidadeActionPerformed

    private void J_cidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_cidadeKeyReleased
        J_cidade.setText(J_cidade.getText().toUpperCase());
}//GEN-LAST:event_J_cidadeKeyReleased

    private void J_razao_socialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_razao_socialActionPerformed

}//GEN-LAST:event_J_razao_socialActionPerformed

    private void J_razao_socialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_razao_socialKeyReleased
        J_razao_social.setText(J_razao_social.getText().toUpperCase());
}//GEN-LAST:event_J_razao_socialKeyReleased

    private void J_contato_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_contato_fornecedorActionPerformed

}//GEN-LAST:event_J_contato_fornecedorActionPerformed

    private void J_contato_fornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_contato_fornecedorKeyReleased
        J_contato_fornecedor.setText(J_contato_fornecedor.getText().toUpperCase());
}//GEN-LAST:event_J_contato_fornecedorKeyReleased

    private void J_comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_comentariosKeyReleased
        J_comentarios.setText(J_comentarios.getText().toUpperCase());
}//GEN-LAST:event_J_comentariosKeyReleased

    private void J_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_emailActionPerformed

}//GEN-LAST:event_J_emailActionPerformed

    private void J_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_emailKeyReleased
        J_email.setText(J_email.getText().toUpperCase());
}//GEN-LAST:event_J_emailKeyReleased

    private void J_home_pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_home_pageActionPerformed

}//GEN-LAST:event_J_home_pageActionPerformed

    private void J_home_pageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_home_pageKeyReleased
        J_home_page.setText(J_home_page.getText().toUpperCase());
}//GEN-LAST:event_J_home_pageKeyReleased

    private void J_forma_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_forma_pagamentoActionPerformed

    }//GEN-LAST:event_J_forma_pagamentoActionPerformed

    private void J_forma_pagamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_forma_pagamentoKeyReleased
        J_forma_pagamento.setText(J_forma_pagamento.getText().toUpperCase());
}//GEN-LAST:event_J_forma_pagamentoKeyReleased

    private void J_ufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_ufActionPerformed

}//GEN-LAST:event_J_ufActionPerformed

    private void J_ufKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_ufKeyReleased
        J_uf.setText(J_uf.getText().toUpperCase());
}//GEN-LAST:event_J_ufKeyReleased

    private void J_pesquisar_todos_fornecedores_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_todos_fornecedores_ActionPerformed
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConsultarFornecedores.class.getName()).log(Level.SEVERE, null, ex);
            }
                Connection conn = null;
            try{
            conn=DriverManager.getConnection("jdbc:postgresql://127.0.0.1/TCC", "postgres", "tmsb");
           
                String Query="select * from cadastrarfornecedores";
                PreparedStatement cmd;
                cmd = conn.prepareStatement(Query);
                ResultSet rs;
                rs = cmd.executeQuery();
                DefaultTableModel modelo =(DefaultTableModel) J_mostra_todos_fornecedores_.getModel();
            modelo.setNumRows(0);

            while(rs.next()){
                modelo.addRow(
                        new Object[]{
                            rs.getString("codigo_fornecedor"),
                            rs.getString("razao_social"),
                            rs.getString("nome_contato_fornecedor"),
                            rs.getString("telefone_contato"),
});
}
            }catch(SQLException error){
               // JOptionPane.showMessageDialog("Ocorreu um erro de SQL !"+error.getMessage());
}
}//GEN-LAST:event_J_pesquisar_todos_fornecedores_ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void J_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_removerActionPerformed
            try {
            try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");
            } catch (SQLException ex) {
            Logger.getLogger(ConsultarFornecedores.class.getName()).log(Level.SEVERE, null, ex);
            }

            String sql = "DELETE FROM cadastrarfornecedores WHERE codigo_fornecedor=" + J_pesquisar_codigo.getText();

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
            mensagem_status.setText("ERRO AO REMOVERCADASTRO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Existem campos sem preencher.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            System.out.println("Ocorreu um erro ao acessar o banco de dados" + e.getMessage());

            }

            mensagem_status.setText("CADASTRO REMOVIDO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (Exception erro) {
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO REMOVERCADASTRO");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Cadastro não realizado, " + "\n"
            + "Preencha os campos obrigatórios", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            }
}//GEN-LAST:event_J_removerActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField2ActionPerformed

    private void J_logadouroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_logadouroKeyReleased
        J_logadouro.setText(J_logadouro.getText().toUpperCase());
}//GEN-LAST:event_J_logadouroKeyReleased

    private void J_logadouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_logadouroActionPerformed

}//GEN-LAST:event_J_logadouroActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField J_categoria_produtos;
    private javax.swing.JFormattedTextField J_cep;
    private javax.swing.JTextField J_cidade;
    private javax.swing.JFormattedTextField J_cnpj;
    private javax.swing.JTextField J_codigo;
    private javax.swing.JTextArea J_comentarios;
    private javax.swing.JTextField J_contato_fornecedor;
    private javax.swing.JFormattedTextField J_data_cadastrado;
    private javax.swing.JFormattedTextField J_data_ult_alteracao;
    private javax.swing.JTextField J_email;
    private javax.swing.JTextField J_forma_pagamento;
    private javax.swing.JTextField J_home_page;
    private javax.swing.JTextField J_logadouro;
    private javax.swing.JTable J_mostra_todos_fornecedores_;
    private javax.swing.JTextField J_pesquisar_codigo;
    private javax.swing.JButton J_pesquisar_todos_fornecedores_;
    private javax.swing.JTextField J_razao_social;
    private javax.swing.JButton J_remover;
    private javax.swing.JTextField J_setor;
    private javax.swing.JFormattedTextField J_tel_contato;
    private javax.swing.JFormattedTextField J_tel_fornecedor;
    private javax.swing.JTextField J_uf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables

}
