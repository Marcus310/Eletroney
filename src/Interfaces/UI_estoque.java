
package Interfaces;

import Conexão.EletroSql;
import Conexão.ModeloTabela;
import Produto.Eproduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;




public class UI_estoque extends javax.swing.JFrame {


    EletroSql conectar = new EletroSql(); //acessar os métodos de conexao com o banco
    Eproduto novoEproduto = new Eproduto(); //acessar os atributos da classe produto
   
    
    public UI_estoque() {
        initComponents();
        conectar.conectaBanco();
        //preencherTabela("select * from estados order by id");
    }
    /*
     private void buscarProduto(Eproduto novoEproduto){
             this.conectar.conectaBanco();
          
        
        String consultaId = this.jTable1.getToolTipText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT"
                    + "id,"                    
                    + "nome,"
                    + "descricao,"
                    + "preco"
                 + " FROM"
                     + "produtos"
                 + " WHERE"
                     + " id = '" + consultaId + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                  String id = String.valueOf(this.conectar.getResultSet().getInt("id"));
                String nome = this.conectar.getResultSet().getString("nome");
                String descricao = this.conectar.getResultSet().getString("descricao");
               String preco = this.conectar.getResultSet().getString("preco");
                 String tbData[] = {"id","nome","descricao","preco"};
                 DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
           }
            
           if(novoEproduto.getId()== ""){
                JOptionPane.showMessageDialog(null, "produto não encontrado!");
           }
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto");
            
        }finally{

            this.conectar.fechaBanco();   
        }               
          
     }*/


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Monitor 1 Gamer Gigabyte ", "R$: 2.399,99", "Tamanho do painel  (diagonal): 27 ”IPS - Exibir área de  visualização (HxV): 597,6 x 336,15 (mm) - Luz de fundo / tipo do painel"},
                {"2", "Mousepad Gamer Dinamic", "R$: 125,99", " Modelo: HX-MPFS-S-XL - Cor: Preto e vermelh - Tamanhos: XL - Espessura: 3-4 mm - Largura x Comprimento: XL: 900 mm  420 mm - Material: tecido, borracha"},
                {"3", "Teclado Mecânico Gamer", "R$: 310,99", " Teclado Mecânico de Alto Desempenho - Tecnologia Outemu MK.2 DIY Brown - 12 Teclas para controle Multimídia - Controle de Iluminação \"On-The-Fly "},
                {"4", "Gabinete 2 HP", "R$: 1.888,99", null},
                {"5", "Caixa de som 1 Husky & sony", "R$: 324,99", null},
                {"6", "Placa de Video PVD Gamer", "R$: 2..222,99", null},
                {"7", "Mousepad Gamer HyperX Fury", "R$: 199,99", null},
                {"8", "Teclado 2 Mecânico Gamer T-Dagger", "R$: 400,99", null},
                {"9", "Caixa de som 1 Husky", "R$: 200,10", null},
                {"10", "Pc Gamer completo", "R$: 9.99,90", null},
                {"11", "Monitor 2 Gamer Sasumg", "R$: 3.000,99", null},
                {"12", "Placa de Video 2 PVD Gamer", "R$: 3.330,99", null},
                {"13", "Gabinete 1 Gamer Corsair", "R$: 2.000.99", null},
                {"14", null, null, null},
                {null, null, null, null},
                {"", null, null, null},
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
                "ID", "Nome", "Preço", "Descrição"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(300);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1060, 340));

        jPanel5.setBackground(new java.awt.Color(55, 16, 117));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/xr30.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 102, 255, 200));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/33seta.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 978, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 250, 160));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        UI_administrador adm = new UI_administrador();
        adm.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed
   /* 
    public void preencherTabela(String SQL){
    ArrayList dados = new ArrayList();
    
    String [] Colunas = new String[]{"id","nome","descricao","preco"};
    
    
        try {
          this.conectar.conectaBanco();
         
        
                do {                
                dados.add(new Object[]{conectar.rs})
            } while (rootPaneCheckingEnabled);
           

            
        } catch (Exception e) {
             System.out.println("Erro ao cadastrar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto");
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "produto cadastrado com sucesso");
        }
      
     ModeloTabela modelo = new ModeloTabela(dados, Colunas);
     jTable1.setModel(modelo);
     jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
     jTable1.getColumnModel().getColumn(0).setResizable(false);
     jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
     jTable1.getColumnModel().getColumn(1).setResizable(false);
     jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
     jTable1.getColumnModel().getColumn(2).setResizable(false);
      jTable1.getColumnModel().getColumn(3).setPreferredWidth(180);
     jTable1.getColumnModel().getColumn(3).setResizable(false);
     jTable1.getTableHeader().setReorderingAllowed(false);
     jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
     jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
*/
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
