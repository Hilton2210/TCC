package View;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class VendasRealizar extends javax.swing.JFrame {

    EstoqueVendas aev = new EstoqueVendas(); //pep = atalho para abrir o estoque de produtos
    double valor_venda;
    int ID_ITEM = 1;

    public VendasRealizar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        J_codigo_cliente = new javax.swing.JTextField();
        J_nome_cliente = new javax.swing.JTextField();
        J_codigo_funcionario = new javax.swing.JTextField();
        J_codigo_produto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        J_quantidade = new javax.swing.JTextField();
        J_preco_produto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        J_incluir_iten = new javax.swing.JButton();
        J_exluir_iten = new javax.swing.JButton();
        J_gerar_pedido = new javax.swing.JButton();
        Atalho_VendasRealizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        J_comentarios = new javax.swing.JTextField();
        mensagem_status = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        J_exibicao_de_itens = new javax.swing.JScrollPane();
        J_itensdepedido = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        J_descricao_item = new javax.swing.JTextField();
        J_tipo_pagamento = new javax.swing.JComboBox();
        J_data_pedido = new javax.swing.JFormattedTextField();
        J_codigo_pedido = new javax.swing.JTextField();
        j_blocodenotas = new javax.swing.JButton();
        J_calc = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        J_gerarCSV = new javax.swing.JButton();
        J_limpar = new javax.swing.JButton();
        J_conluir = new javax.swing.JButton();
        J_quantidade1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar vendas");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jLabel2.setText("Cód. Cliente");

        jLabel3.setText("Nome Cliente");

        jLabel4.setText("Cód. Func.");

        jLabel5.setText("Código produto");

        J_codigo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigo_clienteActionPerformed(evt);
            }
        });

        J_nome_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_nome_clienteActionPerformed(evt);
            }
        });
        J_nome_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_nome_clienteKeyReleased(evt);
            }
        });

        J_codigo_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigo_funcionarioActionPerformed(evt);
            }
        });

        J_codigo_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigo_produtoActionPerformed(evt);
            }
        });

        jLabel7.setText("Quant.");

        J_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_quantidadeActionPerformed(evt);
            }
        });

        J_preco_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_preco_produtoActionPerformed(evt);
            }
        });

        jLabel8.setText("Preço R$");

        J_incluir_iten.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_incluir_iten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Incluir.png"))); // NOI18N
        J_incluir_iten.setText("INCLUIR ITEM");
        J_incluir_iten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_incluir_itenActionPerformed(evt);
            }
        });

        J_exluir_iten.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_exluir_iten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Sair.png"))); // NOI18N
        J_exluir_iten.setText("EXCLUIR");
        J_exluir_iten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_exluir_itenActionPerformed(evt);
            }
        });

        J_gerar_pedido.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_gerar_pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/CetaParaCima.png"))); // NOI18N
        J_gerar_pedido.setText("GERAR PEDIDO");
        J_gerar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_gerar_pedidoActionPerformed(evt);
            }
        });

        Atalho_VendasRealizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Atalho_VendasRealizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Procurar.png"))); // NOI18N
        Atalho_VendasRealizar.setText("PESQUISAR");
        Atalho_VendasRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atalho_VendasRealizarActionPerformed(evt);
            }
        });

        jLabel10.setText("Data venda");

        jLabel11.setText("Comentários");

        J_comentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_comentariosActionPerformed(evt);
            }
        });
        J_comentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_comentariosKeyReleased(evt);
            }
        });

        mensagem_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensagem_status.setForeground(java.awt.Color.red);
        mensagem_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        J_itensdepedido.setModel(new javax.swing.table.DefaultTableModel(
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
                "Id Ped.", "Cód. Prod.", "Descrição", "Quantidade", "Preço", "Preço Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        J_exibicao_de_itens.setViewportView(J_itensdepedido);
        if (J_itensdepedido.getColumnModel().getColumnCount() > 0) {
            J_itensdepedido.getColumnModel().getColumn(0).setResizable(false);
            J_itensdepedido.getColumnModel().getColumn(1).setResizable(false);
            J_itensdepedido.getColumnModel().getColumn(2).setResizable(false);
            J_itensdepedido.getColumnModel().getColumn(3).setResizable(false);
            J_itensdepedido.getColumnModel().getColumn(4).setResizable(false);
            J_itensdepedido.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ITENS DO PEDIDO");

        jLabel17.setText("Forma de pag.");

        jLabel19.setText("Descrição");

        J_descricao_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_descricao_itemActionPerformed(evt);
            }
        });

        J_tipo_pagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A VISTA", "A PRAZO", "CARTÃO", "CHEQUE" }));

        J_data_pedido.setEditable(false);
        J_data_pedido.setBackground(new java.awt.Color(204, 204, 204));
        try {
            J_data_pedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        J_data_pedido.setText("    ");
        J_data_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_data_pedidoActionPerformed(evt);
            }
        });

        J_codigo_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigo_pedidoActionPerformed(evt);
            }
        });

        j_blocodenotas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        j_blocodenotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Bloco de notas.png"))); // NOI18N
        j_blocodenotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_blocodenotasActionPerformed(evt);
            }
        });

        J_calc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_calc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Calculadora.png"))); // NOI18N
        J_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_calcActionPerformed(evt);
            }
        });

        jLabel9.setText("Cod. Ped");

        J_gerarCSV.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_gerarCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Excel.png"))); // NOI18N
        J_gerarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_gerarCSVActionPerformed(evt);
            }
        });

        J_limpar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cancelar.png"))); // NOI18N
        J_limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_limparMouseClicked(evt);
            }
        });
        J_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_limparActionPerformed(evt);
            }
        });

        J_conluir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_conluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cadastrar.png"))); // NOI18N
        J_conluir.setText("CONCLUIR");
        J_conluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_conluirActionPerformed(evt);
            }
        });

        J_quantidade1.setEditable(false);
        J_quantidade1.setBackground(new java.awt.Color(204, 204, 204));
        J_quantidade1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        J_quantidade1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        J_quantidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_quantidade1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("Total do pedido R$.:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15)
            .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_codigo_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_data_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_tipo_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_codigo_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_gerar_pedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_conluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_descricao_item, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_preco_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(Atalho_VendasRealizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_incluir_iten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_exluir_iten, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_exibicao_de_itens, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_calc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_gerarCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_limpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j_blocodenotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(565, 565, 565)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_quantidade1)))
                .addContainerGap())
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J_codigo_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J_data_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_tipo_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(7, 7, 7)
                        .addComponent(J_codigo_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(J_gerar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_conluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(J_codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(6, 6, 6)
                        .addComponent(J_descricao_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Atalho_VendasRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_exluir_iten, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_incluir_iten, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(3, 3, 3)
                                .addComponent(J_preco_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(3, 3, 3)
                                .addComponent(J_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_exibicao_de_itens, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(J_gerarCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(j_blocodenotas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(J_calc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(J_comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(J_quantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_codigo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_codigo_clienteActionPerformed

    private void J_nome_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_nome_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_nome_clienteActionPerformed

    private void J_codigo_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigo_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_codigo_funcionarioActionPerformed

    private void J_codigo_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigo_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_codigo_produtoActionPerformed

    private void J_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_quantidadeActionPerformed

    private void J_preco_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_preco_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_preco_produtoActionPerformed

    private void J_incluir_itenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_incluir_itenActionPerformed
        int R = 0;
        while (J_itensdepedido.getRowCount() > R) {
            if (J_itensdepedido.getValueAt(R, 0) == null) {
                J_itensdepedido.setValueAt(ID_ITEM++, R, 0);
                J_itensdepedido.setValueAt(J_codigo_produto.getText(), R, 1);
                J_itensdepedido.setValueAt(J_descricao_item.getText(), R, 2);
                J_itensdepedido.setValueAt(J_quantidade.getText(), R, 3);
                J_itensdepedido.setValueAt(J_preco_produto.getText(), R, 4);
                J_itensdepedido.setValueAt(Double.parseDouble(J_quantidade.getText()) * Double.parseDouble(J_preco_produto.getText()), R, 5);


                valor_venda = Double.parseDouble(J_quantidade.getText()) * Double.parseDouble(J_preco_produto.getText()) + valor_venda;
                J_quantidade1.setText(Double.toString(valor_venda));

                return;
            }
            R++;

        //LIMPAR OS CAMPOS APÓS A INCLUSÃO NA TABELA
J_codigo_produto.setText(null);
J_descricao_item.setText(null);
J_preco_produto.setText(null);
J_quantidade.setText(null);
        }




    }//GEN-LAST:event_J_incluir_itenActionPerformed

    private void J_exluir_itenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_exluir_itenActionPerformed
//LIMPANDO A LINHA SELECIONA DE PRODUTOS

DefaultTableModel lddp = (DefaultTableModel) J_itensdepedido.getModel();

//captura as linhas selecionadas
int[] x = J_itensdepedido.getSelectedRows();

for(int i =(x.length-1);i>=0;--i){

//remove todas as linhas selecionadas
lddp.removeRow(x[i]);
}

J_quantidade1.setText(null);




    }//GEN-LAST:event_J_exluir_itenActionPerformed

    private void J_gerar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_gerar_pedidoActionPerformed
//CONEXÃO PARA ENVIAR OS DADOS PARA A TABELA DE PEDIDO
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
            String sql = "insert into pedidocliente(codigo_cliente,nome_cliente_x,codigo_funcionario,"
                    + "forma_de_pagamento,codigo_pedido,comentarios_pedido,valortotal_pedido)"
                    + "values(?,?,?,?,?,?,?)";
            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção;
            stmt.setInt(1, Integer.parseInt(J_codigo_cliente.getText()));
            stmt.setString(2, J_nome_cliente.getText());
            stmt.setInt(3, Integer.parseInt(J_codigo_funcionario.getText()));
            stmt.setString(4, (String) J_tipo_pagamento.getSelectedItem());
            stmt.setInt(5, Integer.parseInt(J_codigo_pedido.getText()));
            stmt.setString(6, J_comentarios.getText());
            stmt.setDouble(7, Double.parseDouble( J_quantidade1.getText())); //J_quantidade1 = VALOR TOTAL DO PEDIDO
//FIM DO ENVIO DAS INFORMAÇÕES DO PEDIDO DO CLIENTE
//----------------------------------------------------------------------------------------------------------------------------------------------------------


//O COMANDO ABAIXO É UTILIZADO PARA PARA INSERIR NO BANCO DE DADOS AS INFORMAÇÕES DO CABEÇALHO DO PEDIDO.


//----------------------------------------------------------------------------------------------------------------------------------------------------------
            //executa o comando no banco de dados;
            stmt.executeUpdate();
            //fecha o comando e conexão;
            stmt.close();
            con.close();
            mensagem_status.setForeground(Color.blue);
            mensagem_status.setText("PEDIDO ENVIADO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar a classe ");
            } catch (SQLException e) {
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO ENVIAR PEDIDO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Existem campos sem preencher.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            //System.out.println("Ocorreu um erro ao acessar o banco de dados" + e.getMessage());
               JOptionPane.showMessageDialog(this, "Ocorreu um erro ao acessar o banco de dados", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            }
            //exibir mensagem se o funcionario foi cadastrado corretamente.
            mensagem_status.setText("PEDIDO ENVIADO COM SUCESSO!");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));

            } catch (Exception erro) {//se o funcionario não foi cadastrado corretamente exibir esta mensagem.
            mensagem_status.setForeground(Color.red);
            mensagem_status.setText("ERRO AO ENVIAR PEDIDO");
            mensagem_status.setFont(new Font("Tahoma", 1, 18));
            JOptionPane.showMessageDialog(this, "Atenção, erro ao finalizar o pedido, " + "\n"
            + "Verifique se todas as informações foram inseridas corretamente!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            mensagem_status.setText("");
            }
    }//GEN-LAST:event_J_gerar_pedidoActionPerformed

    private void Atalho_VendasRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atalho_VendasRealizarActionPerformed
//Abrir tela -------------------------------------------------------------------
        aev = new EstoqueVendas();
        aev.setLocationRelativeTo(null);
        aev.setVisible(true);
        aev.setResizable(false);
        /*}else{
        aev.setVisible(true);
        aev.setLocationRelativeTo(null);
        aev.setResizable(false);}*/
//------------------------------------------------------------------------------
    }//GEN-LAST:event_Atalho_VendasRealizarActionPerformed

    private void J_descricao_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_descricao_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_descricao_itemActionPerformed

    private void J_data_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_data_pedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_data_pedidoActionPerformed

    private void J_codigo_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigo_pedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_codigo_pedidoActionPerformed

    private void j_blocodenotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_blocodenotasActionPerformed
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ex) {
            Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_j_blocodenotasActionPerformed

    private void J_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_calcActionPerformed
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (IOException ex) {
            Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_J_calcActionPerformed

    private void J_gerarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_gerarCSVActionPerformed
    }//GEN-LAST:event_J_gerarCSVActionPerformed

    private void J_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_limparActionPerformed
    }//GEN-LAST:event_J_limparActionPerformed




    private void J_conluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_conluirActionPerformed
    }//GEN-LAST:event_J_conluirActionPerformed









    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        J_codigo_produto.setText(aev.P_COD);
        J_descricao_item.setText(aev.P_DESCR);
        J_preco_produto.setText(aev.P_PRECO);
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        J_codigo_produto.setText(aev.P_COD);
        J_descricao_item.setText(aev.P_DESCR);
        J_preco_produto.setText(aev.P_PRECO);
    }//GEN-LAST:event_formWindowLostFocus

    private void J_quantidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_quantidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_quantidade1ActionPerformed

    private void J_comentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_comentariosActionPerformed

    }//GEN-LAST:event_J_comentariosActionPerformed

    private void J_comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_comentariosKeyReleased
J_comentarios.setText(J_comentarios.getText().toUpperCase());
    }//GEN-LAST:event_J_comentariosKeyReleased

    private void J_nome_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_nome_clienteKeyReleased
J_nome_cliente.setText(J_nome_cliente.getText().toUpperCase());
    }//GEN-LAST:event_J_nome_clienteKeyReleased

    private void J_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_limparMouseClicked

        J_quantidade1.setText(null);

    }//GEN-LAST:event_J_limparMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VendasRealizar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atalho_VendasRealizar;
    private javax.swing.JButton J_calc;
    private javax.swing.JTextField J_codigo_cliente;
    private javax.swing.JTextField J_codigo_funcionario;
    private javax.swing.JTextField J_codigo_pedido;
    private javax.swing.JTextField J_codigo_produto;
    private javax.swing.JTextField J_comentarios;
    private javax.swing.JButton J_conluir;
    private javax.swing.JFormattedTextField J_data_pedido;
    private javax.swing.JTextField J_descricao_item;
    private javax.swing.JScrollPane J_exibicao_de_itens;
    private javax.swing.JButton J_exluir_iten;
    private javax.swing.JButton J_gerarCSV;
    private javax.swing.JButton J_gerar_pedido;
    private javax.swing.JButton J_incluir_iten;
    private javax.swing.JTable J_itensdepedido;
    private javax.swing.JButton J_limpar;
    private javax.swing.JTextField J_nome_cliente;
    private javax.swing.JTextField J_preco_produto;
    private javax.swing.JTextField J_quantidade;
    private javax.swing.JTextField J_quantidade1;
    private javax.swing.JComboBox J_tipo_pagamento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton j_blocodenotas;
    private javax.swing.JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables
}
