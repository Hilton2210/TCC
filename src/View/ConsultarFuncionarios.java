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

public class ConsultarFuncionarios extends javax.swing.JFrame {

    public ConsultarFuncionarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        J_consultar_codigo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        J_consultar_nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        J_mostra_todos_funcionarios_ = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        J_pesquisar_todos_funcionarios_ = new javax.swing.JButton();
        mensagem_status = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        J_remover = new javax.swing.JButton();
        J_consultar_cpf = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        J_codigo = new javax.swing.JTextField();
        J_nome_mae = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        J_escolaridade = new javax.swing.JTextField();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        J_rg = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        J_ctps_serie = new javax.swing.JTextField();
        J_consultar_cpf1 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        J_ctps = new javax.swing.JTextField();
        J_bairro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        J_cidade = new javax.swing.JTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        J_nome = new javax.swing.JTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        J_cargo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        J_salario = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        J_sexo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        J_nome_pai = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        J_logadouro = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        J_uf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        J_comentarios = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar funcionários");

        jLabel14.setText("CPF");

        jLabel15.setText("Código");

        jLabel23.setText("Nome");

        J_consultar_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_consultar_nomeActionPerformed(evt);
            }
        });
        J_consultar_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_consultar_nomeKeyReleased(evt);
            }
        });

        J_mostra_todos_funcionarios_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME", "RG", "ESCOLARIDADE", "CARGO", "SALÁRIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(J_mostra_todos_funcionarios_);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        jButton1.setText("PESQUISAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        J_pesquisar_todos_funcionarios_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_todos_funcionarios_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/PesquisarTodos.png"))); // NOI18N
        J_pesquisar_todos_funcionarios_.setText("TODOS");
        J_pesquisar_todos_funcionarios_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_todos_funcionarios_ActionPerformed(evt);
            }
        });

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

        try {
            J_consultar_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar dados cadastrados"));

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

        jLabel24.setText("Data admissão");

        jLabel5.setText("Nome mãe");

        jLabel22.setText("Data nascimento");

        J_escolaridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_escolaridadeActionPerformed(evt);
            }
        });
        J_escolaridade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_escolaridadeKeyReleased(evt);
            }
        });

        try {
            jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel25.setText("Data demissão");

        jLabel11.setText("Tel. Residencial");

        jLabel17.setText("Bairro/Setor");

        jLabel3.setText("Nome");

        jLabel13.setText("CTPS série");

        try {
            J_consultar_cpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setText("CTPS");

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

        jLabel19.setText("Cidade");

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

        try {
            jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        jLabel9.setText("Escolaridade");

        J_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_salarioActionPerformed(evt);
            }
        });

        jLabel26.setText("Cargo");

        jLabel10.setText("Tel. celular");

        J_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_sexoActionPerformed(evt);
            }
        });
        J_sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_sexoKeyReleased(evt);
            }
        });

        jLabel4.setText("Nome pai");

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

        jLabel27.setText("Salário");

        jLabel8.setText("Sexo");

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

        jLabel29.setText("Comentários");

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

        J_comentarios.setColumns(20);
        J_comentarios.setLineWrap(true);
        J_comentarios.setRows(1);
        J_comentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_comentariosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(J_comentarios);

        jLabel18.setText("CEP");

        jLabel6.setText("CPF");

        jLabel20.setText("UF");

        jLabel7.setText("RG");

        jLabel2.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J_nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J_logadouro, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J_consultar_cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_ctps, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_ctps_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_escolaridade))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(J_cargo)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_consultar_cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_ctps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_ctps_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_escolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel22)
                    .addComponent(jLabel26)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel29))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(J_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(jLabel19))
                            .addComponent(jLabel21)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_logadouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(J_consultar_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(J_consultar_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(J_consultar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_pesquisar_todos_funcionarios_, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_remover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(J_remover)
                    .addComponent(J_pesquisar_todos_funcionarios_)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(6, 6, 6)
                                .addComponent(J_consultar_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addComponent(J_consultar_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(6, 6, 6)
                                .addComponent(J_consultar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_salarioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_salarioActionPerformed

    private void J_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_cargoActionPerformed

}//GEN-LAST:event_J_cargoActionPerformed

    private void J_cargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_cargoKeyReleased
        J_cargo.setText(J_cargo.getText().toUpperCase());
}//GEN-LAST:event_J_cargoKeyReleased

    private void J_comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_comentariosKeyReleased
        J_comentarios.setText(J_comentarios.getText().toUpperCase());
}//GEN-LAST:event_J_comentariosKeyReleased

    private void J_logadouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_logadouroActionPerformed

}//GEN-LAST:event_J_logadouroActionPerformed

    private void J_logadouroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_logadouroKeyReleased
        J_logadouro.setText(J_logadouro.getText().toUpperCase());
}//GEN-LAST:event_J_logadouroKeyReleased

    private void J_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_sexoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_sexoActionPerformed

    private void J_sexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_sexoKeyReleased
        J_sexo.setText(J_sexo.getText().toUpperCase());
}//GEN-LAST:event_J_sexoKeyReleased

    private void J_nome_paiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nome_paiActionPerformed

}//GEN-LAST:event_J_nome_paiActionPerformed

    private void J_nome_paiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nome_paiKeyReleased
        J_nome_pai.setText(J_nome_pai.getText().toUpperCase());
}//GEN-LAST:event_J_nome_paiKeyReleased

    private void J_nome_maeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nome_maeActionPerformed

}//GEN-LAST:event_J_nome_maeActionPerformed

    private void J_nome_maeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nome_maeKeyReleased
        J_nome_mae.setText(J_nome_mae.getText().toUpperCase());
}//GEN-LAST:event_J_nome_maeKeyReleased

    private void J_escolaridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_escolaridadeActionPerformed

}//GEN-LAST:event_J_escolaridadeActionPerformed

    private void J_escolaridadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_escolaridadeKeyReleased
        J_escolaridade.setText(J_escolaridade.getText().toUpperCase());
}//GEN-LAST:event_J_escolaridadeKeyReleased

    private void J_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nomeActionPerformed

}//GEN-LAST:event_J_nomeActionPerformed

    private void J_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nomeKeyReleased
        J_nome.setText(J_nome.getText().toUpperCase());
}//GEN-LAST:event_J_nomeKeyReleased

    private void J_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_bairroActionPerformed

}//GEN-LAST:event_J_bairroActionPerformed

    private void J_bairroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_bairroKeyReleased
        J_bairro.setText(J_bairro.getText().toUpperCase());
}//GEN-LAST:event_J_bairroKeyReleased

    private void J_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_cidadeActionPerformed

}//GEN-LAST:event_J_cidadeActionPerformed

    private void J_cidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_cidadeKeyReleased
        J_cidade.setText(J_cidade.getText().toUpperCase());
}//GEN-LAST:event_J_cidadeKeyReleased

    private void J_ufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_ufActionPerformed

}//GEN-LAST:event_J_ufActionPerformed

    private void J_ufKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_ufKeyReleased
        J_uf.setText(J_uf.getText().toUpperCase());
}//GEN-LAST:event_J_ufKeyReleased

    private void J_consultar_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_consultar_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_consultar_nomeActionPerformed

    private void J_consultar_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_consultar_nomeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_J_consultar_nomeKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void J_pesquisar_todos_funcionarios_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_todos_funcionarios_ActionPerformed
	try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConsultarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
                Connection conn = null;
            try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");

                String Query="select * from cadastrodefuncionarios";
                PreparedStatement cmd;
                cmd = conn.prepareStatement(Query);
                ResultSet rs;
                rs = cmd.executeQuery();
                DefaultTableModel modelo =(DefaultTableModel) J_mostra_todos_funcionarios_.getModel();
            modelo.setNumRows(0);

            while(rs.next()){
                modelo.addRow(
                        new Object[]{
                            rs.getString("codigo_funcionario"),
                            rs.getString("nome"),
                            rs.getString("rg"),
                            rs.getString("escolaridade"),
			    rs.getString("cargo"),
                            rs.getString("salario"),
});
}
            }catch(SQLException error){
               // JOptionPane.showMessageDialog("Ocorreu um erro de SQL !"+error.getMessage());
}
}//GEN-LAST:event_J_pesquisar_todos_funcionarios_ActionPerformed

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
            Logger.getLogger(ConsultarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }

            String sql = "DELETE FROM cadastrodefuncionarios WHERE codigo_funcionario=" + J_consultar_codigo.getText();

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField J_bairro;
    private javax.swing.JTextField J_cargo;
    private javax.swing.JTextField J_cidade;
    private javax.swing.JTextField J_codigo;
    private javax.swing.JTextArea J_comentarios;
    private javax.swing.JTextField J_consultar_codigo;
    private javax.swing.JFormattedTextField J_consultar_cpf;
    private javax.swing.JFormattedTextField J_consultar_cpf1;
    private javax.swing.JTextField J_consultar_nome;
    private javax.swing.JTextField J_ctps;
    private javax.swing.JTextField J_ctps_serie;
    private javax.swing.JTextField J_escolaridade;
    private javax.swing.JTextField J_logadouro;
    private javax.swing.JTable J_mostra_todos_funcionarios_;
    private javax.swing.JTextField J_nome;
    private javax.swing.JTextField J_nome_mae;
    private javax.swing.JTextField J_nome_pai;
    private javax.swing.JButton J_pesquisar_todos_funcionarios_;
    private javax.swing.JButton J_remover;
    private javax.swing.JTextField J_rg;
    private javax.swing.JTextField J_salario;
    private javax.swing.JTextField J_sexo;
    private javax.swing.JTextField J_uf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables

}
