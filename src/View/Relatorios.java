package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;


public class Relatorios extends javax.swing.JFrame {

    public Relatorios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        R_CLI = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Fornecedors3 = new javax.swing.JTable();
        Res_Cli = new javax.swing.JTextField();
        R_CLI1 = new javax.swing.JButton();
        Res_Pro = new javax.swing.JTextField();
        R_CLI2 = new javax.swing.JButton();
        Res_Cat = new javax.swing.JTextField();
        R_CLI3 = new javax.swing.JButton();
        Res_For = new javax.swing.JTextField();
        Res_For1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RELATÓRIO DE VENDAS");

        R_CLI.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        R_CLI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Relato2.png"))); // NOI18N
        R_CLI.setText("CLIENTES");
        R_CLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_CLIActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Relato2.png"))); // NOI18N
        jButton7.setText("GERAR");

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Relato2.png"))); // NOI18N
        jButton8.setText("TOTAL REGISTRADO NO SISTEMA");

        jLabel9.setText("Por data");

        Fornecedors3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Data", "Valor R$"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(Fornecedors3);
        if (Fornecedors3.getColumnModel().getColumnCount() > 0) {
            Fornecedors3.getColumnModel().getColumn(0).setResizable(false);
            Fornecedors3.getColumnModel().getColumn(1).setResizable(false);
        }

        Res_Cli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Res_Cli.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        R_CLI1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        R_CLI1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Relato2.png"))); // NOI18N
        R_CLI1.setText("PRODUTOS");
        R_CLI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_CLI1ActionPerformed(evt);
            }
        });

        Res_Pro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Res_Pro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        R_CLI2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        R_CLI2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Relato2.png"))); // NOI18N
        R_CLI2.setText("CAT. PRODUTOS");
        R_CLI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_CLI2ActionPerformed(evt);
            }
        });

        Res_Cat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Res_Cat.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        R_CLI3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        R_CLI3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/Relato2.png"))); // NOI18N
        R_CLI3.setText("FORNECEDORES");
        R_CLI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_CLI3ActionPerformed(evt);
            }
        });

        Res_For.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Res_For.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Res_For1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Res_For1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Res_For1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Res_Cli)
                                    .addComponent(R_CLI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Res_Pro)
                                    .addComponent(R_CLI1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Res_Cat)
                                    .addComponent(R_CLI2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Res_For)
                                    .addComponent(R_CLI3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane7))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_CLI)
                    .addComponent(R_CLI1)
                    .addComponent(R_CLI2)
                    .addComponent(R_CLI3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Res_Cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Res_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Res_Cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Res_For, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Res_For1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void R_CLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_CLIActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");

            String Query = "select COUNT(*) as contagem from cadastrarclientes";

            PreparedStatement cmd;
            cmd = conn.prepareStatement(Query);
            ResultSet rs;

            rs = cmd.executeQuery();

            rs.next();

            Res_Cli.setText(rs.getString("contagem"));

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_R_CLIActionPerformed

    private void R_CLI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_CLI1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");

            String Query = "select COUNT(*) as contagem from cadastrarprodutos";

            PreparedStatement cmd;
            cmd = conn.prepareStatement(Query);
            ResultSet rs;

            rs = cmd.executeQuery();

            rs.next();

            Res_Pro.setText(rs.getString("contagem"));

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_R_CLI1ActionPerformed

    private void R_CLI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_CLI2ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");

            String Query = "select COUNT(*) as contagem from categoriaprodutos";

            PreparedStatement cmd;
            cmd = conn.prepareStatement(Query);
            ResultSet rs;

            rs = cmd.executeQuery();

            rs.next();

            Res_Cat.setText(rs.getString("contagem"));

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_R_CLI2ActionPerformed

    private void R_CLI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_CLI3ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");

            String Query = "select COUNT(*) as contagem from cadastrarfornecedores";

            PreparedStatement cmd;
            cmd = conn.prepareStatement(Query);
            ResultSet rs;

            rs = cmd.executeQuery();

            rs.next();

            Res_For.setText(rs.getString("contagem"));

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_R_CLI3ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Fornecedors3;
    private javax.swing.JButton R_CLI;
    private javax.swing.JButton R_CLI1;
    private javax.swing.JButton R_CLI2;
    private javax.swing.JButton R_CLI3;
    private javax.swing.JTextField Res_Cat;
    private javax.swing.JTextField Res_Cli;
    private javax.swing.JTextField Res_For;
    private javax.swing.JTextField Res_For1;
    private javax.swing.JTextField Res_Pro;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
