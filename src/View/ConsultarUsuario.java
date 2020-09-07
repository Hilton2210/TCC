package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultarUsuario extends javax.swing.JFrame {

    public ConsultarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        J_todos_usuarios = new javax.swing.JTable();
        J_pesquisarTodos_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar usuários");

        J_todos_usuarios.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Login", "Data cadastro"
            }
        ));
        J_todos_usuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(J_todos_usuarios);

        J_pesquisarTodos_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        J_pesquisarTodos_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denise/ImagensDoSistema/Ícones/PesquisarTodos.png"))); // NOI18N
        J_pesquisarTodos_.setText("MOSTRAR TODOS USUÁRIOS");
        J_pesquisarTodos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_pesquisarTodos_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                    .addComponent(J_pesquisarTodos_))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(J_pesquisarTodos_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_pesquisarTodos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_pesquisarTodos_ActionPerformed
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
                Connection conn = null;
            try{
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdenise");

            
                String Query="select * from cadastrarusuario";
                PreparedStatement cmd;
                cmd = conn.prepareStatement(Query);
                ResultSet rs;
                rs = cmd.executeQuery();
                DefaultTableModel modelo =(DefaultTableModel) J_todos_usuarios.getModel();
            modelo.setNumRows(0);

            while(rs.next()){
                modelo.addRow(
                        new Object[]{
                            rs.getString("codigo_usuario"),
                            rs.getString("nome_usuario"),
                            rs.getString("login"),
                            //rs.getString("senha"),
                            rs.getString("data_cadastro"),
                        }
                );
            }
            }catch(SQLException error){
               // JOptionPane.showMessageDialog("Ocorreu um erro de SQL !"+error.getMessage());
            }
}//GEN-LAST:event_J_pesquisarTodos_ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton J_pesquisarTodos_;
    private javax.swing.JTable J_todos_usuarios;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
