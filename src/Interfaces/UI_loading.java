
package Interfaces;

import javax.swing.JOptionPane;

public class UI_loading extends javax.swing.JFrame {

    public UI_loading() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barra_progresso = new javax.swing.JProgressBar();
        contador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        painel.setBackground(new java.awt.Color(0, 0, 0));
        painel.setName("Tela de Loading"); // NOI18N
        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fofiis.gif"))); // NOI18N
        painel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 560, 270));

        barra_progresso.setBackground(new java.awt.Color(255, 255, 255));
        barra_progresso.setForeground(new java.awt.Color(123, 45, 140));
        painel.add(barra_progresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 710, -1));

        contador.setBackground(new java.awt.Color(255, 255, 255));
        contador.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        contador.setForeground(new java.awt.Color(156, 27, 242));
        contador.setText("%");
        painel.add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
         UI_loading loading = new UI_loading ();
        loading.setVisible(true);
        try {
            for(int i = 0; i <= 100; i += 2){
               Thread.sleep(70);
               loading.barra_progresso.setValue(i);
               loading.contador.setText(Integer.toString (i) + "%");
            }
            loading.dispose();
            
            UI_login login1 = new UI_login();
            login1.setVisible(true);
            
           // login1.Som1.loop();
            
        } catch (InterruptedException e){
          JOptionPane.showConfirmDialog(null, "Algum tubarão mordeu o cabo...");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra_progresso;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
