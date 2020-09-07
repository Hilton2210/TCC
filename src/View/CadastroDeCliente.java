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

public class CadastroDeCliente extends javax.swing.JFrame {

ConsultarCliente c_cdc = new ConsultarCliente(); //Consultar categoria de clientes

    public CadastroDeCliente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        J_codigo = new javax.swing.JTextField();
        J_nome = new javax.swing.JTextField();
        J_faixa_salarial = new javax.swing.JTextField();
        J_email = new javax.swing.JTextField();
        J_nome_pai = new javax.swing.JTextField();
        J_nome_mae = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        J_setor = new javax.swing.JTextField();
        J_cidade = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        J_logadouro = new javax.swing.JTextField();
        mensagem_status = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        J_comentarios = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        Cadastrar_ = new javax.swing.JButton();
        J_pesquisar_clientes = new javax.swing.JButton();
        J_limpartela = new javax.swing.JButton();
        J_data_nascimento = new javax.swing.JFormattedTextField();
        J_data_cadastro = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        J_sexo = new javax.swing.JComboBox();
        J_uf = new javax.swing.JComboBox();
        J_cpf = new javax.swing.JFormattedTextField();
        J_tel_res = new javax.swing.JFormattedTextField();
        J_tel_com = new javax.swing.JFormattedTextField();
        J_tel_cel = new javax.swing.JFormattedTextField();
        J_cep = new javax.swing.JFormattedTextField();
        J_rg = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        ssp = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar clientes");

        jLabel2.setText("Código");

        jLabel3.setText("Nome cliente");

        jLabel4.setText("CPF");

        jLabel5.setText("RG");

        jLabel6.setText("Sexo");

        jLabel7.setText("Faixa salarial R$");

        jLabel8.setText("e-mail");

        jLabel9.setText("Nome pai");

        jLabel10.setText("Nome mãe");

        jLabel11.setText("Tel. celular");

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

        J_faixa_salarial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_faixa_salarialActionPerformed(evt);
            }
        });
        J_faixa_salarial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_faixa_salarialKeyReleased(evt);
            }
        });

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

        jLabel12.setText("Tel. residencial");

        jLabel13.setText("Tel. comercial");

        jLabel14.setText("Data nascimento");

        jLabel15.setText("Data cadastro");

        jLabel16.setText("Comentários");

        jLabel17.setText("Bairro/Setor");

        jLabel18.setText("CEP");

        jLabel19.setText("Cidade");

        jLabel20.setText("UF");

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

        mensagem_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensagem_status.setForeground(java.awt.Color.red);
        mensagem_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel23.setText("Exemplo logradouro.: Rua 140, Quadra 36, Lote 3");

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

        jSeparator4.setForeground(java.awt.Color.gray);

        Cadastrar_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Cadastrar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cadastrar.png"))); // NOI18N
        Cadastrar_.setText("CADASTRAR");
        Cadastrar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_ActionPerformed(evt);
            }
        });
        Cadastrar_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cadastrar_KeyReleased(evt);
            }
        });

        J_pesquisar_clientes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        J_pesquisar_clientes.setText("PESQUISAR");
        J_pesquisar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_clientesActionPerformed(evt);
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

        try {
            J_data_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        J_data_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_data_nascimentoActionPerformed(evt);
            }
        });

        J_data_cadastro.setEditable(false);
        J_data_cadastro.setBackground(new java.awt.Color(204, 204, 204));
        try {
            J_data_cadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        J_data_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_data_cadastroActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(java.awt.Color.gray);

        J_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMININO" }));

        J_uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GO" }));

        try {
            J_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_tel_res.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_tel_com.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_tel_cel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            J_rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel22.setText("Org. E");

        ssp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SSP", "PM" }));
        ssp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sspActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ssp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(J_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_faixa_salarial, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J_logadouro, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(J_setor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19))
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(J_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_tel_res, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_tel_com, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_tel_cel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J_nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_email)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cadastrar_, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_pesquisar_clientes)
                        .addGap(6, 6, 6)
                        .addComponent(J_limpartela, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_faixa_salarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_tel_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_tel_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_tel_cel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)))
                    .addComponent(J_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(J_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_logadouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel23))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cadastrar_)
                    .addComponent(J_pesquisar_clientes)
                    .addComponent(J_limpartela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nomeActionPerformed

    }//GEN-LAST:event_J_nomeActionPerformed

    private void J_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_codigoActionPerformed

    private void Cadastrar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_ActionPerformed
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
            Logger.getLogger(CadastroDeCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            //cria a string para inserir no banco;
            String sql = "insert into cadastrarclientes(nome_cliente,cpf,rg,"
                    + "sexo,faixa_salarial,nome_pai,nome_mae,tel_residencial,tel_celular,"
                    + "tel_comercial,email,data_nascimento,end_cidade,end_bairro,end_uf,end_logadouro,"
                    + "end_cep,comentarios)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção;
            //stmt.setInt(1, Integer.parseInt(J_codigo.getText())); CAMPO SERÁ PREENCHIDO AUTOMÁTICAMENTE
            stmt.setString(1, J_nome.getText());
            stmt.setString(2, J_cpf.getText());
            stmt.setString(3, J_rg.getText());
            stmt.setString(4, (String)J_sexo.getSelectedItem());
            stmt.setDouble(5, Double.parseDouble(J_faixa_salarial.getText()));
            stmt.setString(6, J_nome_pai.getText());
            stmt.setString(7, J_nome_mae.getText());
            stmt.setString(8, J_tel_res.getText());
            stmt.setString(9, J_tel_cel.getText());
            stmt.setString(10, J_tel_com.getText());
            stmt.setString(11, J_email.getText());
            stmt.setString(12, J_data_nascimento.getText());
            //stmt.setString(14, J_data_cadastro.getText());
            stmt.setString(13, J_cidade.getText());
            stmt.setString(14, J_setor.getText());
            stmt.setString(15, (String)J_uf.getSelectedItem());
            stmt.setString(16, J_logadouro.getText());
            stmt.setString(17, J_cep.getText());
            stmt.setString(18, J_comentarios.getText());


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

}//GEN-LAST:event_Cadastrar_ActionPerformed

    private void J_pesquisar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_clientesActionPerformed
//Abrir atalho------------------------------------------------------------------
    if (c_cdc == null){
        c_cdc = new ConsultarCliente();
        c_cdc.setLocationRelativeTo(null);
        c_cdc.setVisible(true);
        c_cdc.setResizable(false);
    }else{
        c_cdc.setVisible(true);
        c_cdc.setLocationRelativeTo(null);
        c_cdc.setResizable(false);}
//------------------------------------------------------------------------------


}//GEN-LAST:event_J_pesquisar_clientesActionPerformed

    private void J_limpartelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_limpartelaActionPerformed
J_codigo.setText(null);
J_nome.setText(null);
J_cpf.setText(null);
J_rg.setText(null);
J_faixa_salarial.setText(null);
J_nome_pai.setText(null);
J_nome_mae.setText(null);
J_tel_res.setText(null);
J_tel_cel.setText(null);
J_tel_com.setText(null);
J_email.setText(null);
J_data_nascimento.setText(null);
J_data_cadastro.setText(null);
J_cidade.setText(null);
J_setor.setText(null);
J_logadouro.setText(null);
J_cep.setText(null);
J_comentarios.setText(null);


}//GEN-LAST:event_J_limpartelaActionPerformed

    private void J_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nomeKeyReleased
        J_nome.setText(J_nome.getText().toUpperCase());

    }//GEN-LAST:event_J_nomeKeyReleased

    private void J_data_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_data_nascimentoActionPerformed

        


    }//GEN-LAST:event_J_data_nascimentoActionPerformed

    private void J_data_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_data_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_data_cadastroActionPerformed

    private void J_nome_paiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nome_paiActionPerformed

    }//GEN-LAST:event_J_nome_paiActionPerformed

    private void J_nome_maeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nome_maeActionPerformed

    }//GEN-LAST:event_J_nome_maeActionPerformed

    private void J_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_emailActionPerformed

    }//GEN-LAST:event_J_emailActionPerformed

    private void J_setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_setorActionPerformed

    }//GEN-LAST:event_J_setorActionPerformed

    private void J_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_cidadeActionPerformed

    }//GEN-LAST:event_J_cidadeActionPerformed

    private void J_logadouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_logadouroActionPerformed

    }//GEN-LAST:event_J_logadouroActionPerformed

    private void J_nome_paiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nome_paiKeyReleased
        J_nome_pai.setText(J_nome_pai.getText().toUpperCase());
    }//GEN-LAST:event_J_nome_paiKeyReleased

    private void J_nome_maeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nome_maeKeyReleased
        J_nome_mae.setText(J_nome_mae.getText().toUpperCase());
    }//GEN-LAST:event_J_nome_maeKeyReleased

    private void J_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_emailKeyReleased
        J_email.setText(J_email.getText().toUpperCase());
    }//GEN-LAST:event_J_emailKeyReleased

    private void J_setorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_setorKeyReleased
        J_setor.setText(J_setor.getText().toUpperCase());
    }//GEN-LAST:event_J_setorKeyReleased

    private void J_cidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_cidadeKeyReleased
        J_cidade.setText(J_cidade.getText().toUpperCase());
    }//GEN-LAST:event_J_cidadeKeyReleased

    private void J_logadouroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_logadouroKeyReleased
        J_logadouro.setText(J_logadouro.getText().toUpperCase());
    }//GEN-LAST:event_J_logadouroKeyReleased

    private void J_comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_comentariosKeyReleased
        J_comentarios.setText(J_comentarios.getText().toUpperCase());
    }//GEN-LAST:event_J_comentariosKeyReleased

    private void Cadastrar_KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cadastrar_KeyReleased
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
            Logger.getLogger(CadastroDeCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            //cria a string para inserir no banco;
            String sql = "insert into cadastrarclientes(nome_cliente,cpf,rg,"
                    + "sexo,faixa_salarial,nome_pai,nome_mae,tel_residencial,tel_celular,"
                    + "tel_comercial,email,data_nascimento,end_cidade,end_bairro,end_uf,end_logadouro,"
                    + "end_cep,comentarios)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção;
            //stmt.setInt(1, Integer.parseInt(J_codigo.getText())); CAMPO SERÁ PREENCHIDO AUTOMÁTICAMENTE
            stmt.setString(1, J_nome.getText());
            stmt.setString(2, J_cpf.getText());
            stmt.setInt(3, Integer.parseInt(J_rg.getText()));
            stmt.setString(4, (String)J_sexo.getSelectedItem());
            stmt.setDouble(5, Double.parseDouble(J_faixa_salarial.getText()));
            stmt.setString(6, J_nome_pai.getText());
            stmt.setString(7, J_nome_mae.getText());
            stmt.setString(8, J_tel_res.getText());
            stmt.setString(9, J_tel_cel.getText());
            stmt.setString(10, J_tel_com.getText());
            stmt.setString(11, J_email.getText());
            stmt.setString(12, J_data_nascimento.getText());
            //stmt.setString(14, J_data_cadastro.getText());
            stmt.setString(13, J_cidade.getText());
            stmt.setString(14, J_setor.getText());
            stmt.setString(15, (String)J_uf.getSelectedItem());
            stmt.setString(16, J_logadouro.getText());
            stmt.setString(17, J_cep.getText());
            stmt.setString(18, J_comentarios.getText());


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
            mensagem_status.setText("CADASTRO NÃO REALIZADO!");
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

    }//GEN-LAST:event_Cadastrar_KeyReleased

    private void J_faixa_salarialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_faixa_salarialKeyReleased



    }//GEN-LAST:event_J_faixa_salarialKeyReleased

    private void J_faixa_salarialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_faixa_salarialActionPerformed




    }//GEN-LAST:event_J_faixa_salarialActionPerformed

    private void sspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sspActionPerformed




    }//GEN-LAST:event_sspActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar_;
    private javax.swing.JFormattedTextField J_cep;
    private javax.swing.JTextField J_cidade;
    private javax.swing.JTextField J_codigo;
    private javax.swing.JTextArea J_comentarios;
    private javax.swing.JFormattedTextField J_cpf;
    private javax.swing.JFormattedTextField J_data_cadastro;
    private javax.swing.JFormattedTextField J_data_nascimento;
    private javax.swing.JTextField J_email;
    private javax.swing.JTextField J_faixa_salarial;
    private javax.swing.JButton J_limpartela;
    private javax.swing.JTextField J_logadouro;
    private javax.swing.JTextField J_nome;
    private javax.swing.JTextField J_nome_mae;
    private javax.swing.JTextField J_nome_pai;
    private javax.swing.JButton J_pesquisar_clientes;
    private javax.swing.JFormattedTextField J_rg;
    private javax.swing.JTextField J_setor;
    private javax.swing.JComboBox J_sexo;
    private javax.swing.JFormattedTextField J_tel_cel;
    private javax.swing.JFormattedTextField J_tel_com;
    private javax.swing.JFormattedTextField J_tel_res;
    private javax.swing.JComboBox J_uf;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel mensagem_status;
    private javax.swing.JComboBox ssp;
    // End of variables declaration//GEN-END:variables

}
