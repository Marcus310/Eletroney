
package Interfaces;

import Interfaces.UI_criar_uma_conta;
import java.applet.Applet;
import javax.swing.JOptionPane;
import java.net.URL;
import java.applet.AudioClip;

public class UI_login extends javax.swing.JFrame {
    
  /*  URL som1 = UI_login.class.getResource("lofi-1.wav");
    AudioClip Som1 = Applet.newAudioClip(som1);*/

    public UI_login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_barra_de_tarrefas = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        campo_usuario = new javax.swing.JTextField();
        campo_senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        btn_esqueci = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_crie_conta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel_barra_de_tarrefas.setBackground(new java.awt.Color(55, 16, 117));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/xr30.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 102, 255, 200));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/seta.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_barra_de_tarrefasLayout = new javax.swing.GroupLayout(painel_barra_de_tarrefas);
        painel_barra_de_tarrefas.setLayout(painel_barra_de_tarrefasLayout);
        painel_barra_de_tarrefasLayout.setHorizontalGroup(
            painel_barra_de_tarrefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_barra_de_tarrefasLayout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painel_barra_de_tarrefasLayout.setVerticalGroup(
            painel_barra_de_tarrefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_barra_de_tarrefasLayout.createSequentialGroup()
                .addGroup(painel_barra_de_tarrefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(painel_barra_de_tarrefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));

        campo_usuario.setBackground(new java.awt.Color(0, 0, 0, 85));
        campo_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_usuario.setForeground(new java.awt.Color(255, 255, 255));
        campo_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, 30));

        campo_senha.setBackground(new java.awt.Color(0, 0, 0, 85));
        campo_senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_senha.setForeground(new java.awt.Color(255, 255, 255));
        campo_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_senhaActionPerformed(evt);
            }
        });
        getContentPane().add(campo_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 220, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0,150));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 60, 30));

        btn_entrar.setBackground(new java.awt.Color(154, 10, 250, 200));
        btn_entrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 100, 30));

        btn_esqueci.setBackground(new java.awt.Color(36, 56, 100, 150));
        btn_esqueci.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_esqueci.setForeground(new java.awt.Color(255, 255, 255));
        btn_esqueci.setText("Esqueci usuário ou senha"); // NOI18N
        btn_esqueci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_esqueciActionPerformed(evt);
            }
        });
        getContentPane().add(btn_esqueci, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, 30));

        btn_sair.setBackground(new java.awt.Color(154, 10, 250, 200));
        btn_sair.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(255, 255, 255));
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 100, 30));

        btn_crie_conta.setBackground(new java.awt.Color(36, 56, 100, 150));
        btn_crie_conta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_crie_conta.setForeground(new java.awt.Color(255, 255, 255));
        btn_crie_conta.setText("Crie sua conta");
        btn_crie_conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crie_contaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_crie_conta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 210, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/loginn.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_usuarioActionPerformed

    }//GEN-LAST:event_campo_usuarioActionPerformed

    private void campo_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_senhaActionPerformed

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        if(campo_usuario.getText().equals("Usuario") && campo_senha.getText().equals("1234")){

            JOptionPane.showMessageDialog (null, " Seu acesso foi permitido :) "
                + "seja bem vindo a Eletroney");

            UI_produtos Produtos = new UI_produtos();
            Produtos.setVisible(true);

            dispose();

        }else if(campo_usuario.getText().equals("admin") && campo_senha.getText().equals("senha")){

            JOptionPane.showMessageDialog (null, " Seja bem vindo ao modo administrador ");

            UI_administrador administrador = new UI_administrador();
            administrador.setVisible(true);

            dispose();
        }
        else{
            JOptionPane.showMessageDialog (null, " Seu acesso foi negado...");
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void btn_esqueciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_esqueciActionPerformed
        UI_esqueci esqueci = new UI_esqueci();
        esqueci.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_esqueciActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
       dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_crie_contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crie_contaActionPerformed
    UI_criar_uma_conta criar = new UI_criar_uma_conta();
    criar.setVisible(true);
    dispose();
    }//GEN-LAST:event_btn_crie_contaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        UI_login login = new UI_login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
        
        UI_login tocar = new UI_login();
        //tocar.Som.loop();
        
        java.awt.EventQueue.invokeLater(() -> {
            new UI_login().setVisible(true);
        });
        
        java.awt.EventQueue.invokeLater(() -> {
            new UI_login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crie_conta;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_esqueci;
    private javax.swing.JButton btn_sair;
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel painel_barra_de_tarrefas;
    // End of variables declaration//GEN-END:variables
}
