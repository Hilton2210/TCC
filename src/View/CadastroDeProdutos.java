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

public class CadastroDeProdutos extends javax.swing.JFrame {

ConsultarProdutos c_cdpro = new ConsultarProdutos(); //Consultar cadastro de produtos

    public CadastroDeProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        J_codigo = new javax.swing.JTextField();
        J_descricao = new javax.swing.JTextField();
        J_preco_custo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        J_codigo_fornecedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        J_comentarios = new javax.swing.JTextArea();
        J_codigo_categoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        J_estoque = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        mensagem_status = new javax.swing.JLabel();
        Cadastrar_ = new javax.swing.JButton();
        J_pesquisar_produtos = new javax.swing.JButton();
        J_limparTela = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        J_preco_min_consumidor = new javax.swing.JTextField();
        J_preco_max_consumidor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        J_margem_lucro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        J_materia_prima = new javax.swing.JTextField();
        J_cores = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        J_peso_produto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        J_fabricante = new javax.swing.JTextField();
        J_marca = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        J_data_validade = new javax.swing.JFormattedTextField();
        J_data_fabricacao = new javax.swing.JFormattedTextField();
        J_data_cadastro = new javax.swing.JFormattedTextField();
        J_codigo1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar produtos");

        jLabel2.setText("Código");

        jLabel3.setText("Descrição");

        jLabel7.setText("Preço custo R$");

        J_codigo.setEditable(false);
        J_codigo.setBackground(new java.awt.Color(204, 204, 204));
        J_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigoActionPerformed(evt);
            }
        });

        J_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_descricaoActionPerformed(evt);
            }
        });
        J_descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_descricaoKeyReleased(evt);
            }
        });

        J_preco_custo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_preco_custoActionPerformed(evt);
            }
        });

        jLabel11.setText("Cód. Fornecedor");

        J_codigo_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigo_fornecedorActionPerformed(evt);
            }
        });
        J_codigo_fornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                J_codigo_fornecedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_codigo_fornecedorKeyReleased(evt);
            }
        });

        jLabel13.setText("Data validade");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Comentários");

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

        J_codigo_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigo_categoriaActionPerformed(evt);
            }
        });
        J_codigo_categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                J_codigo_categoriaKeyPressed(evt);
            }
        });

        jLabel4.setText("Cód. categoria");

        J_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_estoqueActionPerformed(evt);
            }
        });
        J_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                J_estoqueKeyPressed(evt);
            }
        });

        jLabel21.setText("Estoque");

        jSeparator2.setForeground(java.awt.Color.gray);

        mensagem_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensagem_status.setForeground(java.awt.Color.red);
        mensagem_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Cadastrar_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Cadastrar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Cadastrar.png"))); // NOI18N
        Cadastrar_.setText("CADASTRAR");
        Cadastrar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_ActionPerformed(evt);
            }
        });

        J_pesquisar_produtos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisar_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Pesquisar.png"))); // NOI18N
        J_pesquisar_produtos.setText("PESQUISAR");
        J_pesquisar_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisar_produtosActionPerformed(evt);
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

        jLabel8.setText("Preço cons. R$");

        J_preco_min_consumidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_preco_min_consumidorActionPerformed(evt);
            }
        });

        J_preco_max_consumidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_preco_max_consumidorActionPerformed(evt);
            }
        });

        jLabel9.setText("Preço mín. R$");

        J_margem_lucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_margem_lucroActionPerformed(evt);
            }
        });

        jLabel10.setText("% de Lucro");

        J_materia_prima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_materia_primaActionPerformed(evt);
            }
        });
        J_materia_prima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_materia_primaKeyReleased(evt);
            }
        });

        J_cores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_coresActionPerformed(evt);
            }
        });
        J_cores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_coresKeyReleased(evt);
            }
        });

        jLabel14.setText("Peso produto");

        jLabel18.setText("Cores");

        jLabel15.setText("Materia prima");

        J_peso_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_peso_produtoActionPerformed(evt);
            }
        });

        jLabel12.setText("Data fabricação");

        jLabel5.setText("Data cadastro");

        jLabel16.setText("Fabricante");

        J_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_fabricanteActionPerformed(evt);
            }
        });
        J_fabricante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_fabricanteKeyReleased(evt);
            }
        });

        J_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_marcaActionPerformed(evt);
            }
        });
        J_marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_marcaKeyReleased(evt);
            }
        });

        jLabel17.setText("Marca");

        jLabel22.setText("Código de barras");

        try {
            J_data_validade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        J_data_validade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_data_validadeActionPerformed(evt);
            }
        });

        try {
            J_data_fabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        J_data_fabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_data_fabricacaoActionPerformed(evt);
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

        J_codigo1.setEditable(false);
        J_codigo1.setBackground(new java.awt.Color(204, 204, 204));
        J_codigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_codigo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_codigo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_codigo_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(J_margem_lucro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_preco_custo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(J_data_validade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_preco_min_consumidor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_data_fabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_preco_max_consumidor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(Cadastrar_)
                        .addGap(6, 6, 6)
                        .addComponent(J_pesquisar_produtos)
                        .addGap(6, 6, 6)
                        .addComponent(J_limparTela))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(J_peso_produto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(J_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(J_codigo1)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J_cores, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(J_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J_materia_prima)))))
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(mensagem_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel21)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_codigo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_codigo_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_margem_lucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22)
                    .addComponent(jLabel17)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_peso_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(J_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(J_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(J_cores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel19)))
                    .addComponent(J_materia_prima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_preco_custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J_data_validade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_data_fabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_preco_min_consumidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_preco_max_consumidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cadastrar_)
                    .addComponent(J_pesquisar_produtos)
                    .addComponent(J_limparTela))
                .addGap(16, 16, 16)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagem_status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_codigoActionPerformed

    private void J_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_descricaoActionPerformed

}//GEN-LAST:event_J_descricaoActionPerformed

    private void J_codigo_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigo_categoriaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_codigo_categoriaActionPerformed

    private void J_preco_custoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_preco_custoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_preco_custoActionPerformed

    private void J_codigo_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigo_fornecedorActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_codigo_fornecedorActionPerformed

    private void J_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_estoqueActionPerformed

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
            Logger.getLogger(CadastroDeProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            //cria a string para inserir no banco;
            String sql = "insert into cadastrarprodutos(descricao_produto,"
                    + "estoque,cores_marca,preco_custo,preco_max_consumidor,preco_mim_consumidor,"
                    + "margen_lucro,data_fabricacao,data_validade,cod_fornecedor,peso_produto,"
                    + "materia_prima,fabricante,marca,comentarios,cod_categoria)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //cria o comando;
            PreparedStatement stmt = con.prepareStatement(sql);
            //seta os valores na String de inserção;
            //stmt.setInt(1, Integer.parseInt(J_codigo.getText()));
            stmt.setString(1, J_descricao.getText());
            stmt.setInt(2, Integer.parseInt(J_estoque.getText()));
            stmt.setString(3, J_cores.getText());
            stmt.setDouble(4, Double.parseDouble(J_preco_custo.getText()));
            stmt.setDouble(5, Double.parseDouble(J_preco_max_consumidor.getText()));
            stmt.setDouble(6, Double.parseDouble(J_preco_min_consumidor.getText()));
            stmt.setInt(7, Integer.parseInt(J_margem_lucro.getText()));
            stmt.setString(8 , J_data_fabricacao.getText());
            stmt.setString(9, J_data_validade.getText());
            //stmt.setString(2, J_data_cadastro.getText());
            stmt.setInt(10, Integer.parseInt(J_codigo_fornecedor.getText()));
            stmt.setInt(11, Integer.parseInt(J_peso_produto.getText()));
            stmt.setString(12, J_materia_prima.getText());
            stmt.setString(13, J_fabricante.getText());
            stmt.setString(14, J_marca.getText());
            //stmt.setInt(15, Integer.parseInt(J_codigo_barras.getText()));
            stmt.setString(15, J_comentarios.getText());
            stmt.setInt(16, Integer.parseInt(J_codigo_categoria.getText()));
  

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

    private void J_pesquisar_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisar_produtosActionPerformed
//Abrir atalho------------------------------------------------------------------
    if (c_cdpro == null){
        c_cdpro = new ConsultarProdutos();
        c_cdpro.setLocationRelativeTo(null);
        c_cdpro.setVisible(true);
        c_cdpro.setResizable(false);
    }else{
        c_cdpro.setVisible(true);
        c_cdpro.setLocationRelativeTo(null);
        c_cdpro.setResizable(false);}
//------------------------------------------------------------------------------
}//GEN-LAST:event_J_pesquisar_produtosActionPerformed

    private void J_limparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_limparTelaActionPerformed

J_codigo.setText(null);
J_descricao.setText(null);
J_estoque.setText(null);
J_cores.setText(null);
J_preco_custo.setText(null);
J_preco_max_consumidor.setText(null);
J_preco_min_consumidor.setText(null);
J_margem_lucro.setText(null);
J_data_fabricacao.setText(null);
J_data_validade.setText(null);
J_data_cadastro.setText(null);
J_codigo_fornecedor.setText(null);
J_peso_produto.setText(null);
J_materia_prima.setText(null);
J_fabricante.setText(null);
J_marca.setText(null);
//J_codigo_barras.setText(null);
J_comentarios.setText(null);
J_codigo_categoria.setText(null);
mensagem_status.setText(null);

}//GEN-LAST:event_J_limparTelaActionPerformed

    private void J_preco_min_consumidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_preco_min_consumidorActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_preco_min_consumidorActionPerformed

    private void J_preco_max_consumidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_preco_max_consumidorActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_preco_max_consumidorActionPerformed

    private void J_margem_lucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_margem_lucroActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_margem_lucroActionPerformed

    private void J_materia_primaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_materia_primaActionPerformed

}//GEN-LAST:event_J_materia_primaActionPerformed

    private void J_coresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_coresActionPerformed

}//GEN-LAST:event_J_coresActionPerformed

    private void J_peso_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_peso_produtoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_J_peso_produtoActionPerformed

    private void J_fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_fabricanteActionPerformed

}//GEN-LAST:event_J_fabricanteActionPerformed

    private void J_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_marcaActionPerformed

}//GEN-LAST:event_J_marcaActionPerformed

    private void J_data_validadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_data_validadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_data_validadeActionPerformed

    private void J_data_fabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_data_fabricacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_data_fabricacaoActionPerformed

    private void J_data_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_data_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_data_cadastroActionPerformed

    private void J_descricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_descricaoKeyReleased
    J_descricao.setText(J_descricao.getText().toUpperCase());
    }//GEN-LAST:event_J_descricaoKeyReleased

    private void J_marcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_marcaKeyReleased
        J_marca.setText(J_marca.getText().toUpperCase());
    }//GEN-LAST:event_J_marcaKeyReleased

    private void J_comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_comentariosKeyReleased
        J_comentarios.setText(J_comentarios.getText().toUpperCase());
    }//GEN-LAST:event_J_comentariosKeyReleased

    private void J_coresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_coresKeyReleased
        J_cores.setText(J_cores.getText().toUpperCase());
    }//GEN-LAST:event_J_coresKeyReleased

    private void J_fabricanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_fabricanteKeyReleased
        J_fabricante.setText(J_fabricante.getText().toUpperCase());
    }//GEN-LAST:event_J_fabricanteKeyReleased

    private void J_materia_primaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_materia_primaKeyReleased
        J_materia_prima.setText(J_materia_prima.getText().toUpperCase());
    }//GEN-LAST:event_J_materia_primaKeyReleased

    private void J_codigo_categoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_codigo_categoriaKeyPressed

        J_codigo_categoria.setText(J_codigo_categoria.getText().replaceAll("[^0-9]", ""));

    }//GEN-LAST:event_J_codigo_categoriaKeyPressed

    private void J_codigo_fornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_codigo_fornecedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_J_codigo_fornecedorKeyReleased

    private void J_codigo_fornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_codigo_fornecedorKeyPressed
J_codigo_fornecedor.setText(J_codigo_fornecedor.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_J_codigo_fornecedorKeyPressed

    private void J_estoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_estoqueKeyPressed
J_estoque.setText(J_estoque.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_J_estoqueKeyPressed

    private void J_codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_codigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_codigo1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar_;
    private javax.swing.JTextField J_codigo;
    private javax.swing.JTextField J_codigo1;
    private javax.swing.JTextField J_codigo_categoria;
    private javax.swing.JTextField J_codigo_fornecedor;
    private javax.swing.JTextArea J_comentarios;
    private javax.swing.JTextField J_cores;
    private javax.swing.JFormattedTextField J_data_cadastro;
    private javax.swing.JFormattedTextField J_data_fabricacao;
    private javax.swing.JFormattedTextField J_data_validade;
    private javax.swing.JTextField J_descricao;
    private javax.swing.JTextField J_estoque;
    private javax.swing.JTextField J_fabricante;
    private javax.swing.JButton J_limparTela;
    private javax.swing.JTextField J_marca;
    private javax.swing.JTextField J_margem_lucro;
    private javax.swing.JTextField J_materia_prima;
    private javax.swing.JTextField J_peso_produto;
    private javax.swing.JButton J_pesquisar_produtos;
    private javax.swing.JTextField J_preco_custo;
    private javax.swing.JTextField J_preco_max_consumidor;
    private javax.swing.JTextField J_preco_min_consumidor;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mensagem_status;
    // End of variables declaration//GEN-END:variables

}
