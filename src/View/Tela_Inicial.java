package View;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Tela_Inicial extends javax.swing.JFrame {

//--------------------------------COM ERRO POR NÃO TER CRIADO AS CLASSES----------------------------------------------
    CadastrarUsuario c_usuario = new CadastrarUsuario(); //Cadastrar usuário
    CadastroDeCategoriaProdutos cdcp = new CadastroDeCategoriaProdutos(); //cdcp = CadastroCategoriaProduto
    CadastroDeCliente cdc = new CadastroDeCliente(); //cdc = CadastroDeCliente
    CadastroDeFornecedores cdf = new CadastroDeFornecedores(); //cdf -> cadastro de fornecedores
    CadastroDeFuncionarios cdfun = new CadastroDeFuncionarios(); //cdfun -> cadastro de funcionários
    CadastroDeProdutos cdp = new CadastroDeProdutos(); //cdp = CadastroDeProdutos
    VendasRealizar vrv = new VendasRealizar();
    VendasConsulta vc = new VendasConsulta(); //vc -> Consultar vendas
    EstoqueProdutos ep = new EstoqueProdutos(); //ep -> Estoque dos produtos
    ConsultarUsuario consultar_usuario = new ConsultarUsuario(); //Consultar usuário
    ConsultarCategoriaDeProdutos cdcdp = new ConsultarCategoriaDeProdutos(); //Consultar cadastro de categoria de produtos
    ConsultarCliente cc = new ConsultarCliente(); //cc -> Consultar cliente
    ConsultarFornecedores ccdfor = new ConsultarFornecedores(); //Consultar cadastro de fornecedores
    ConsultarFuncionarios ccdfun = new ConsultarFuncionarios(); //Consultar cadastro de funcionarios
    ConsultarProdutos cp = new ConsultarProdutos(); //cv -> Consultar produtos
    DiarioDeBordo db = new DiarioDeBordo(); 
    Relatorios rl = new Relatorios();
    Vales vl = new Vales();

//--------------------------------COM ERRO POR NÃO TER CRIADO AS CLASSES----------------------------------------------
    public Tela_Inicial() {

        {
//            Tela_Login es = new Tela_Login(this, true);
//            es.setLocationRelativeTo(null);
//            es.setVisible(true);
            initComponents();
//this.setLocationRelativeTo(this); //Abrir cetralizado
//this.setResizable(false); //Bloquear o tamanho da tela
            setExtendedState(Tela_Inicial.MAXIMIZED_BOTH); //Abrir maximizado
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_cadastro = new javax.swing.JMenu();
        M_cadastrar_clientes = new javax.swing.JMenuItem();
        M_cadastrar_produtos = new javax.swing.JMenuItem();
        M_cadastrar_categoria_de_produtos = new javax.swing.JMenuItem();
        M_cadastrar_funcionarios = new javax.swing.JMenuItem();
        M_cadastrar_fornecedores = new javax.swing.JMenuItem();
        M_cadastrar_usuario = new javax.swing.JMenuItem();
        Menu_consulta = new javax.swing.JMenu();
        M_cliente = new javax.swing.JMenuItem();
        M_consultar_produtos = new javax.swing.JMenuItem();
        M_categoria_de_produtos = new javax.swing.JMenuItem();
        M_funcionarios = new javax.swing.JMenuItem();
        M_fornecedores = new javax.swing.JMenuItem();
        M_consultar_usuario = new javax.swing.JMenuItem();
        Menu_vendas = new javax.swing.JMenu();
        M_realizar_vendas = new javax.swing.JMenuItem();
        M_consultar_vendas = new javax.swing.JMenuItem();
        Menu_estoque = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        J_relatorios = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Menu_ajuda = new javax.swing.JMenu();
        J_calc = new javax.swing.JMenuItem();
        J_bloco_de_notas = new javax.swing.JMenuItem();
        J_Diariodebordo = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        M_sair_do_sistema = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        J_sair_do_sistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DENISE BOLOS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Imagem/Img tela inicial.png"))); // NOI18N

        Menu_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Mais.png"))); // NOI18N
        Menu_cadastro.setText("Cadastrar  ");
        Menu_cadastro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Menu_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_cadastroActionPerformed(evt);
            }
        });

        M_cadastrar_clientes.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_cadastrar_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/cli16.png"))); // NOI18N
        M_cadastrar_clientes.setText("Clientes");
        M_cadastrar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_cadastrar_clientesActionPerformed(evt);
            }
        });
        Menu_cadastro.add(M_cadastrar_clientes);

        M_cadastrar_produtos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_cadastrar_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/pro16.png"))); // NOI18N
        M_cadastrar_produtos.setText("Produtos");
        M_cadastrar_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_cadastrar_produtosActionPerformed1(evt);
            }
        });
        Menu_cadastro.add(M_cadastrar_produtos);

        M_cadastrar_categoria_de_produtos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_cadastrar_categoria_de_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/produtos16.png"))); // NOI18N
        M_cadastrar_categoria_de_produtos.setText("Categoria de produtos");
        M_cadastrar_categoria_de_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_cadastrar_categoria_de_produtosActionPerformed(evt);
            }
        });
        Menu_cadastro.add(M_cadastrar_categoria_de_produtos);

        M_cadastrar_funcionarios.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_cadastrar_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/fun16.png"))); // NOI18N
        M_cadastrar_funcionarios.setText("Funcionários");
        M_cadastrar_funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_cadastrar_funcionariosActionPerformed(evt);
            }
        });
        Menu_cadastro.add(M_cadastrar_funcionarios);

        M_cadastrar_fornecedores.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_cadastrar_fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/forne16.png"))); // NOI18N
        M_cadastrar_fornecedores.setText("Fornecedores");
        M_cadastrar_fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_cadastrar_fornecedoresActionPerformed(evt);
            }
        });
        Menu_cadastro.add(M_cadastrar_fornecedores);

        M_cadastrar_usuario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_cadastrar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/use16.png"))); // NOI18N
        M_cadastrar_usuario.setText("Usuários");
        M_cadastrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_cadastrar_usuarioActionPerformed(evt);
            }
        });
        Menu_cadastro.add(M_cadastrar_usuario);

        jMenuBar1.add(Menu_cadastro);

        Menu_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Biblia.png"))); // NOI18N
        Menu_consulta.setText("Consultar  ");
        Menu_consulta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Menu_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_consultaActionPerformed(evt);
            }
        });

        M_cliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/cli16.png"))); // NOI18N
        M_cliente.setText("Clientes");
        M_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_clienteActionPerformed(evt);
            }
        });
        Menu_consulta.add(M_cliente);

        M_consultar_produtos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_consultar_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/pro16.png"))); // NOI18N
        M_consultar_produtos.setText("Produtos");
        M_consultar_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_consultar_produtosActionPerformed(evt);
            }
        });
        Menu_consulta.add(M_consultar_produtos);

        M_categoria_de_produtos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_categoria_de_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/produtos16.png"))); // NOI18N
        M_categoria_de_produtos.setText("Categoria produtos");
        M_categoria_de_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_categoria_de_produtosActionPerformed(evt);
            }
        });
        Menu_consulta.add(M_categoria_de_produtos);

        M_funcionarios.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/fun16.png"))); // NOI18N
        M_funcionarios.setText("Funcionarios");
        M_funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_funcionariosActionPerformed(evt);
            }
        });
        Menu_consulta.add(M_funcionarios);

        M_fornecedores.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/forne16.png"))); // NOI18N
        M_fornecedores.setText("Fornecedores");
        M_fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_fornecedoresActionPerformed(evt);
            }
        });
        Menu_consulta.add(M_fornecedores);

        M_consultar_usuario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_consultar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/use16.png"))); // NOI18N
        M_consultar_usuario.setText("Usuários");
        M_consultar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_consultar_usuarioActionPerformed(evt);
            }
        });
        Menu_consulta.add(M_consultar_usuario);

        jMenuBar1.add(Menu_consulta);

        Menu_vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Money.png"))); // NOI18N
        Menu_vendas.setText("Vendas  ");
        Menu_vendas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Menu_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_vendasActionPerformed(evt);
            }
        });

        M_realizar_vendas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_realizar_vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/money16.png"))); // NOI18N
        M_realizar_vendas.setText("Realizar venda");
        M_realizar_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_realizar_vendasActionPerformed(evt);
            }
        });
        Menu_vendas.add(M_realizar_vendas);

        M_consultar_vendas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        M_consultar_vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/dindin16.png"))); // NOI18N
        M_consultar_vendas.setText("Consultar vendas");
        M_consultar_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_consultar_vendasActionPerformed(evt);
            }
        });
        Menu_vendas.add(M_consultar_vendas);

        jMenuBar1.add(Menu_vendas);

        Menu_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/estoque2.png"))); // NOI18N
        Menu_estoque.setText("Estoque  ");
        Menu_estoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Menu_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_estoqueActionPerformed(evt);
            }
        });

        jMenuItem18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/esto16.png"))); // NOI18N
        jMenuItem18.setText("Consultar");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        Menu_estoque.add(jMenuItem18);

        jMenuBar1.add(Menu_estoque);

        J_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Relato1.png"))); // NOI18N
        J_relatorios.setText("Relatórios  ");
        J_relatorios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Relato16.png"))); // NOI18N
        jMenuItem2.setText("Relatório sintético");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        J_relatorios.add(jMenuItem2);

        jMenuBar1.add(J_relatorios);

        Menu_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Utilitarios.png"))); // NOI18N
        Menu_ajuda.setText("Utilitários  ");
        Menu_ajuda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        J_calc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        J_calc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/calculadora2.png"))); // NOI18N
        J_calc.setText("Calculadora");
        J_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_calcActionPerformed(evt);
            }
        });
        Menu_ajuda.add(J_calc);

        J_bloco_de_notas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        J_bloco_de_notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/blocodenota.png"))); // NOI18N
        J_bloco_de_notas.setText("Bloco de notas");
        J_bloco_de_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_bloco_de_notasActionPerformed(evt);
            }
        });
        Menu_ajuda.add(J_bloco_de_notas);

        J_Diariodebordo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        J_Diariodebordo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/diario de bordo.png"))); // NOI18N
        J_Diariodebordo.setText("Diário");
        J_Diariodebordo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_DiariodebordoActionPerformed(evt);
            }
        });
        Menu_ajuda.add(J_Diariodebordo);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Vale16.png"))); // NOI18N
        jMenuItem3.setText("Vales");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Menu_ajuda.add(jMenuItem3);

        jMenuBar1.add(Menu_ajuda);

        M_sair_do_sistema.setForeground(java.awt.Color.red);
        M_sair_do_sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Sair.png"))); // NOI18N
        M_sair_do_sistema.setText("Sair  ");
        M_sair_do_sistema.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Atualizar dados16.png"))); // NOI18N
        jMenuItem1.setText("Logoff");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        M_sair_do_sistema.add(jMenuItem1);

        J_sair_do_sistema.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        J_sair_do_sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/bkp_can16.png"))); // NOI18N
        J_sair_do_sistema.setText("Sair do Sistema");
        J_sair_do_sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_sair_do_sistemaActionPerformed(evt);
            }
        });
        M_sair_do_sistema.add(J_sair_do_sistema);

        jMenuBar1.add(M_sair_do_sistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void M_cadastrar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_cadastrar_clientesActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (cdc == null) {
            cdc = new CadastroDeCliente();
            cdc.setLocationRelativeTo(null);
            cdc.setVisible(true);
            cdc.setResizable(false);
        } else {
            cdc.setVisible(true);
            cdc.setLocationRelativeTo(null);
            cdc.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_cadastrar_clientesActionPerformed

    private void M_cadastrar_produtosActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_cadastrar_produtosActionPerformed1
//Abrir tela -------------------------------------------------------------------
        if (cdp == null) {
            cdp = new CadastroDeProdutos();
            cdp.setLocationRelativeTo(null);
            cdp.setVisible(true);
            cdp.setResizable(false);
        } else {
            cdp.setVisible(true);
            cdp.setLocationRelativeTo(null);
            cdp.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_cadastrar_produtosActionPerformed1

    private void M_cadastrar_categoria_de_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_cadastrar_categoria_de_produtosActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (cdcp == null) {
            cdcp = new CadastroDeCategoriaProdutos();
            cdcp.setLocationRelativeTo(null);
            cdcp.setVisible(true);
            cdcp.setResizable(false);
        } else {
            cdcp.setVisible(true);
            cdcp.setLocationRelativeTo(null);
            cdcp.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_cadastrar_categoria_de_produtosActionPerformed

    private void M_cadastrar_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_cadastrar_funcionariosActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (cdfun == null) {
            cdfun = new CadastroDeFuncionarios();
            cdfun.setLocationRelativeTo(null);
            cdfun.setVisible(true);
            cdfun.setResizable(false);
        } else {
            cdfun.setVisible(true);
            cdfun.setLocationRelativeTo(null);
            cdfun.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_cadastrar_funcionariosActionPerformed

    private void M_cadastrar_fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_cadastrar_fornecedoresActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (cdf == null) {
            cdf = new CadastroDeFornecedores();
            cdf.setLocationRelativeTo(null);
            cdf.setVisible(true);
            cdf.setResizable(false);
        } else {
            cdf.setVisible(true);
            cdf.setLocationRelativeTo(null);
            cdf.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_cadastrar_fornecedoresActionPerformed

    private void M_cadastrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_cadastrar_usuarioActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (c_usuario == null) {
            c_usuario = new CadastrarUsuario();
            c_usuario.setLocationRelativeTo(null);
            c_usuario.setVisible(true);
            c_usuario.setResizable(false);
        } else {
            c_usuario.setVisible(true);
            c_usuario.setLocationRelativeTo(null);
            c_usuario.setResizable(false);
        }
//------------------------------------------------------------------------------]
    }//GEN-LAST:event_M_cadastrar_usuarioActionPerformed

    private void Menu_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_cadastroActionPerformed

    private void M_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_clienteActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (cc == null) {
            cc = new ConsultarCliente();
            cc.setLocationRelativeTo(null);
            cc.setVisible(true);
            cc.setResizable(false);
        } else {
            cc.setVisible(true);
            cc.setLocationRelativeTo(null);
            cc.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_clienteActionPerformed

    private void M_consultar_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_consultar_produtosActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (cp == null) {
            cp = new ConsultarProdutos();
            cp.setLocationRelativeTo(null);
            cp.setVisible(true);
            cp.setResizable(false);
        } else {
            cp.setVisible(true);
            cp.setLocationRelativeTo(null);
            cp.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_consultar_produtosActionPerformed

    private void M_categoria_de_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_categoria_de_produtosActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (cdcdp == null) {
            cdcdp = new ConsultarCategoriaDeProdutos();
            cdcdp.setLocationRelativeTo(null);
            cdcdp.setVisible(true);
            cdcdp.setResizable(false);
        } else {
            cdcdp.setVisible(true);
            cdcdp.setLocationRelativeTo(null);
            cdcdp.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_categoria_de_produtosActionPerformed

    private void M_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_funcionariosActionPerformed
//Abrir tela--------------------------------------------------------------------
        if (ccdfun == null) {
            ccdfun = new ConsultarFuncionarios();
            ccdfun.setLocationRelativeTo(null);
            ccdfun.setVisible(true);
            ccdfun.setResizable(false);
        } else {
            ccdfun.setVisible(true);
            ccdfun.setLocationRelativeTo(null);
            ccdfun.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_funcionariosActionPerformed

    private void M_fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_fornecedoresActionPerformed
//Abrir tela--------------------------------------------------------------------
        if (ccdfor == null) {
            ccdfor = new ConsultarFornecedores();
            ccdfor.setLocationRelativeTo(null);
            ccdfor.setVisible(true);
            ccdfor.setResizable(false);
        } else {
            ccdfor.setVisible(true);
            ccdfor.setLocationRelativeTo(null);
            ccdfor.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_fornecedoresActionPerformed

    private void M_consultar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_consultar_usuarioActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (consultar_usuario == null) {
            consultar_usuario = new ConsultarUsuario();
            consultar_usuario.setLocationRelativeTo(null);
            consultar_usuario.setVisible(true);
            consultar_usuario.setResizable(false);
        } else {
            consultar_usuario.setVisible(true);
            consultar_usuario.setLocationRelativeTo(null);
            consultar_usuario.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_consultar_usuarioActionPerformed

    private void Menu_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_consultaActionPerformed

    }//GEN-LAST:event_Menu_consultaActionPerformed

    private void M_realizar_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_realizar_vendasActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (vrv == null) {
            vrv = new VendasRealizar();
            vrv.setLocationRelativeTo(null);
            vrv.setVisible(true);
            vrv.setResizable(false);
        } else {
            vrv.setVisible(true);
            vrv.setLocationRelativeTo(null);
            vrv.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_realizar_vendasActionPerformed

    private void M_consultar_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_consultar_vendasActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (vc == null) {
            vc = new VendasConsulta();
            vc.setLocationRelativeTo(null);
            vc.setVisible(true);
            vc.setResizable(false);
        } else {
            vc.setVisible(true);
            vc.setLocationRelativeTo(null);
            vc.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_M_consultar_vendasActionPerformed

    private void Menu_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_vendasActionPerformed

    }//GEN-LAST:event_Menu_vendasActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (ep == null) {
            ep = new EstoqueProdutos();
            ep.setLocationRelativeTo(null);
            ep.setVisible(true);
            ep.setResizable(false);
        } else {
            ep.setVisible(true);
            ep.setLocationRelativeTo(null);
            ep.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void Menu_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_estoqueActionPerformed

    }//GEN-LAST:event_Menu_estoqueActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (rl == null) {
            rl = new Relatorios();
            rl.setLocationRelativeTo(null);
            rl.setVisible(true);
            rl.setResizable(false);
        } else {
            rl.setVisible(true);
            rl.setLocationRelativeTo(null);
            rl.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void J_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_calcActionPerformed
//Abrir calculadora-------------------------------------------------------------
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (IOException ex) {
            Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_J_calcActionPerformed

    private void J_bloco_de_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_bloco_de_notasActionPerformed
//Abrir bloco de notas----------------------------------------------------------
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ex) {
            Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_J_bloco_de_notasActionPerformed

    private void J_DiariodebordoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_DiariodebordoActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (db == null) {
            db = new DiarioDeBordo();
            db.setLocationRelativeTo(null);
            db.setVisible(true);
            db.setResizable(false);
        } else {
            db.setVisible(true);
            db.setLocationRelativeTo(null);
            db.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_J_DiariodebordoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//Abrir tela -------------------------------------------------------------------
        if (vl == null) {
            vl = new Vales();
            vl.setLocationRelativeTo(null);
            vl.setVisible(true);
            vl.setResizable(false);
        } else {
            vl.setVisible(true);
            vl.setLocationRelativeTo(null);
            vl.setResizable(false);
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void J_sair_do_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_sair_do_sistemaActionPerformed
        //Sair
        System.exit(0);
    }//GEN-LAST:event_J_sair_do_sistemaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem J_Diariodebordo;
    private javax.swing.JMenuItem J_bloco_de_notas;
    private javax.swing.JMenuItem J_calc;
    private javax.swing.JMenu J_relatorios;
    private javax.swing.JMenuItem J_sair_do_sistema;
    private javax.swing.JMenuItem M_cadastrar_categoria_de_produtos;
    private javax.swing.JMenuItem M_cadastrar_clientes;
    private javax.swing.JMenuItem M_cadastrar_fornecedores;
    private javax.swing.JMenuItem M_cadastrar_funcionarios;
    private javax.swing.JMenuItem M_cadastrar_produtos;
    private javax.swing.JMenuItem M_cadastrar_usuario;
    private javax.swing.JMenuItem M_categoria_de_produtos;
    private javax.swing.JMenuItem M_cliente;
    private javax.swing.JMenuItem M_consultar_produtos;
    private javax.swing.JMenuItem M_consultar_usuario;
    private javax.swing.JMenuItem M_consultar_vendas;
    private javax.swing.JMenuItem M_fornecedores;
    private javax.swing.JMenuItem M_funcionarios;
    private javax.swing.JMenuItem M_realizar_vendas;
    private javax.swing.JMenu M_sair_do_sistema;
    private javax.swing.JMenu Menu_ajuda;
    private javax.swing.JMenu Menu_cadastro;
    private javax.swing.JMenu Menu_consulta;
    private javax.swing.JMenu Menu_estoque;
    private javax.swing.JMenu Menu_vendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
