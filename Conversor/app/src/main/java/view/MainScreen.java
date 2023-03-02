/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/* Click https://icons8.com/icon/x8PWa4ZypXUE/copyright to catch copyright icon
 * by Icons8 ( https://icons8.com )
*/
package view;

import java.awt.BorderLayout;
import javax.swing.text.html.HTML;

/**
 *
 * @author amand
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        jPanelConversao.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuTeste = new javax.swing.JPopupMenu();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelCabecalho = new javax.swing.JPanel();
        jComboBoxEscolha = new javax.swing.JComboBox<>();
        jButtonCheck = new javax.swing.JButton();
        jPanelImagem = new javax.swing.JPanel();
        jLabelImagem = new javax.swing.JLabel();
        jPanelConversao = new javax.swing.JPanel();
        jTextFieldUnidade1 = new javax.swing.JTextField();
        jTextFieldUnidade2 = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jLabelSigla = new javax.swing.JLabel();
        jComboBoxSigla1 = new javax.swing.JComboBox<>();
        jComboBoxSigla2 = new javax.swing.JComboBox<>();
        jButtonConverter = new javax.swing.JButton();
        jTextFieldResultado = new javax.swing.JTextField();
        jPanelRodape = new javax.swing.JPanel();
        jLabelCopyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");
        setBackground(new java.awt.Color(67, 66, 66));

        jPanelTitulo.setBackground(new java.awt.Color(67, 66, 66));
        jPanelTitulo.setMaximumSize(new java.awt.Dimension(800, 600));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(243, 239, 224));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setLabelFor(this);
        jLabelTitulo.setText("Conversor");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(239, 239, 239))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCabecalho.setBackground(new java.awt.Color(243, 239, 224));

        jComboBoxEscolha.setEditable(true);
        jComboBoxEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o conversor", "Moeda", "Sistema Numérico", "Dados" }));
        jComboBoxEscolha.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(67, 66, 66)));
        jComboBoxEscolha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxEscolha.setMaximumSize(new java.awt.Dimension(144, 44));
        jComboBoxEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEscolhaActionPerformed(evt);
            }
        });

        jButtonCheck.setBackground(new java.awt.Color(34, 163, 159));
        jButtonCheck.setForeground(new java.awt.Color(34, 163, 159));
        jButtonCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jButtonCheck.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.darkGray));
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCabecalhoLayout = new javax.swing.GroupLayout(jPanelCabecalho);
        jPanelCabecalho.setLayout(jPanelCabecalhoLayout);
        jPanelCabecalhoLayout.setHorizontalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalhoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jComboBoxEscolha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCheck)
                .addGap(63, 63, 63))
        );
        jPanelCabecalhoLayout.setVerticalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanelImagem.setBackground(new java.awt.Color(243, 239, 224));
        jPanelImagem.setMaximumSize(new java.awt.Dimension(800, 600));

        jLabelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N
        jLabelImagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelImagem.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabelImagem.setMinimumSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanelImagemLayout = new javax.swing.GroupLayout(jPanelImagem);
        jPanelImagem.setLayout(jPanelImagemLayout);
        jPanelImagemLayout.setHorizontalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagemLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );
        jPanelImagemLayout.setVerticalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagemLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelConversao.setBackground(new java.awt.Color(243, 239, 224));
        jPanelConversao.setMaximumSize(new java.awt.Dimension(1000, 700));

        jTextFieldUnidade1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldUnidade1.setMaximumSize(new java.awt.Dimension(200, 200));
        jTextFieldUnidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUnidade1ActionPerformed(evt);
            }
        });

        jLabelValor.setBackground(getBackground());
        jLabelValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(34, 34, 34));
        jLabelValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelValor.setText("Valor");

        jLabelSigla.setBackground(getBackground());
        jLabelSigla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSigla.setForeground(new java.awt.Color(34, 34, 34));
        jLabelSigla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSigla.setText("Moeda");

        jComboBoxSigla1.setEditable(true);
        jComboBoxSigla1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a moeda", "Dólar (USD)", "Euro (EU)", "Real (BRL)" }));

        jComboBoxSigla2.setEditable(true);
        jComboBoxSigla2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a moeda", "Dólar (USD)", "Euro (EU)", "Real (BRL)" }));

        jButtonConverter.setBackground(new java.awt.Color(34, 163, 159));
        jButtonConverter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonConverter.setForeground(new java.awt.Color(34, 34, 34));
        jButtonConverter.setText("Converter");
        jButtonConverter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.darkGray));
        jButtonConverter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConverterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConversaoLayout = new javax.swing.GroupLayout(jPanelConversao);
        jPanelConversao.setLayout(jPanelConversaoLayout);
        jPanelConversaoLayout.setHorizontalGroup(
            jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConversaoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonConverter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelConversaoLayout.createSequentialGroup()
                        .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUnidade2)
                            .addComponent(jTextFieldUnidade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelConversaoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSigla1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSigla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxSigla2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(57, 57, 57))
        );
        jPanelConversaoLayout.setVerticalGroup(
            jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConversaoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jLabelSigla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUnidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSigla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUnidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSigla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButtonConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRodape.setBackground(new java.awt.Color(67, 66, 66));

        jLabelCopyright.setBackground(new java.awt.Color(243, 239, 224));
        jLabelCopyright.setForeground(new java.awt.Color(243, 239, 224));
        jLabelCopyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCopyright.setIcon(new javax.swing.ImageIcon(getClass().getResource("/copyright.png"))); // NOI18N
        jLabelCopyright.setText("Copyright");

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabelCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(293, 293, 293))
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelConversao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelConversao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
        // TODO add your handling code here:
        jPopupMenuTeste.setToolTipText("Funcionou!!!");
    }//GEN-LAST:event_jButtonCheckActionPerformed

    private void jTextFieldUnidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUnidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUnidade1ActionPerformed

    private void jComboBoxEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEscolhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEscolhaActionPerformed

    private void jButtonConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConverterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConverterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JButton jButtonConverter;
    private javax.swing.JComboBox<String> jComboBoxEscolha;
    private javax.swing.JComboBox<String> jComboBoxSigla1;
    private javax.swing.JComboBox<String> jComboBoxSigla2;
    private javax.swing.JLabel jLabelCopyright;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelSigla;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanelCabecalho;
    private javax.swing.JPanel jPanelConversao;
    private javax.swing.JPanel jPanelImagem;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPopupMenu jPopupMenuTeste;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldUnidade1;
    private javax.swing.JTextField jTextFieldUnidade2;
    // End of variables declaration//GEN-END:variables
}
