/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientInformationDB;

import javax.swing.JPanel;

/**
 *
 * @author lyl-Lynx
 */

public class infoCli extends javax.swing.JFrame {

    public infoCli() {
        initComponents();
        //jPanel1.hide();
    }
    
    public void switchPanels(JPanel panel){
        jLayeredPane.removeAll();
        jLayeredPane.add(panel);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane = new javax.swing.JLayeredPane();
        jPanel0 = new javax.swing.JPanel();
        field0 = new javax.swing.JLabel();
        field1 = new javax.swing.JLabel();
        field2 = new javax.swing.JLabel();
        field3 = new javax.swing.JLabel();
        field4 = new javax.swing.JLabel();
        field5 = new javax.swing.JLabel();
        field6 = new javax.swing.JLabel();
        field7 = new javax.swing.JLabel();
        field8 = new javax.swing.JLabel();
        field9 = new javax.swing.JLabel();
        fieldValue0 = new javax.swing.JTextField();
        fieldValue1 = new javax.swing.JTextField();
        fieldValue2 = new javax.swing.JTextField();
        fieldValue3 = new javax.swing.JTextField();
        fieldValue4 = new javax.swing.JTextField();
        fieldValue5 = new javax.swing.JTextField();
        fieldValue6 = new javax.swing.JTextField();
        fieldValue7 = new javax.swing.JTextField();
        fieldValue8 = new javax.swing.JTextField();
        fieldValue9 = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(374, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(374, 500));

        jLayeredPane.setMaximumSize(new java.awt.Dimension(374, 500));
        jLayeredPane.setMinimumSize(new java.awt.Dimension(374, 500));
        jLayeredPane.setName(""); // NOI18N
        jLayeredPane.setLayout(new java.awt.CardLayout());

        jPanel0.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "InfoCli", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel0.setMaximumSize(new java.awt.Dimension(374, 500));
        jPanel0.setMinimumSize(new java.awt.Dimension(374, 500));
        jPanel0.setPreferredSize(new java.awt.Dimension(374, 500));

        field0.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field0.setText("Field");
        field0.setMaximumSize(new java.awt.Dimension(60, 25));
        field0.setMinimumSize(new java.awt.Dimension(60, 25));
        field0.setPreferredSize(new java.awt.Dimension(60, 25));

        field1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field1.setText("Field");
        field1.setMaximumSize(new java.awt.Dimension(60, 25));
        field1.setMinimumSize(new java.awt.Dimension(60, 25));
        field1.setPreferredSize(new java.awt.Dimension(60, 25));

        field2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field2.setText("Field");
        field2.setMaximumSize(new java.awt.Dimension(60, 25));
        field2.setMinimumSize(new java.awt.Dimension(60, 25));
        field2.setPreferredSize(new java.awt.Dimension(60, 25));

        field3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field3.setText("Field");
        field3.setMaximumSize(new java.awt.Dimension(60, 25));
        field3.setMinimumSize(new java.awt.Dimension(60, 25));
        field3.setPreferredSize(new java.awt.Dimension(60, 25));

        field4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field4.setText("Field");
        field4.setMaximumSize(new java.awt.Dimension(60, 25));
        field4.setMinimumSize(new java.awt.Dimension(60, 25));
        field4.setPreferredSize(new java.awt.Dimension(60, 25));

        field5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field5.setText("Field");
        field5.setMaximumSize(new java.awt.Dimension(60, 25));
        field5.setMinimumSize(new java.awt.Dimension(60, 25));
        field5.setPreferredSize(new java.awt.Dimension(60, 25));

        field6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field6.setText("Field");
        field6.setMaximumSize(new java.awt.Dimension(60, 25));
        field6.setMinimumSize(new java.awt.Dimension(60, 25));
        field6.setPreferredSize(new java.awt.Dimension(60, 25));

        field7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field7.setText("Field");
        field7.setMaximumSize(new java.awt.Dimension(60, 25));
        field7.setMinimumSize(new java.awt.Dimension(60, 25));
        field7.setPreferredSize(new java.awt.Dimension(60, 25));

        field8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field8.setText("Field");
        field8.setMaximumSize(new java.awt.Dimension(60, 25));
        field8.setMinimumSize(new java.awt.Dimension(60, 25));
        field8.setPreferredSize(new java.awt.Dimension(60, 25));

        field9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        field9.setText("Field");
        field9.setMaximumSize(new java.awt.Dimension(60, 25));
        field9.setMinimumSize(new java.awt.Dimension(60, 25));
        field9.setPreferredSize(new java.awt.Dimension(60, 25));

        fieldValue0.setEditable(false);
        fieldValue0.setText("jTextField1");
        fieldValue0.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue0.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue0.setName(""); // NOI18N
        fieldValue0.setPreferredSize(new java.awt.Dimension(160, 30));

        fieldValue1.setEditable(false);
        fieldValue1.setText("jTextField1");
        fieldValue1.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue1.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue1.setName(""); // NOI18N
        fieldValue1.setPreferredSize(new java.awt.Dimension(160, 30));

        fieldValue2.setEditable(false);
        fieldValue2.setText("jTextField1");
        fieldValue2.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue2.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue2.setName(""); // NOI18N
        fieldValue2.setPreferredSize(new java.awt.Dimension(160, 30));

        fieldValue3.setEditable(false);
        fieldValue3.setText("jTextField1");
        fieldValue3.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue3.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue3.setName(""); // NOI18N
        fieldValue3.setPreferredSize(new java.awt.Dimension(160, 30));

        fieldValue4.setEditable(false);
        fieldValue4.setText("jTextField1");
        fieldValue4.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue4.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue4.setName(""); // NOI18N
        fieldValue4.setPreferredSize(new java.awt.Dimension(160, 30));

        fieldValue5.setEditable(false);
        fieldValue5.setText("jTextField1");
        fieldValue5.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue5.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue5.setName(""); // NOI18N
        fieldValue5.setPreferredSize(new java.awt.Dimension(160, 30));

        fieldValue6.setEditable(false);
        fieldValue6.setText("jTextField1");
        fieldValue6.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue6.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue6.setName(""); // NOI18N
        fieldValue6.setPreferredSize(new java.awt.Dimension(160, 30));

        fieldValue7.setEditable(false);
        fieldValue7.setText("jTextField1");
        fieldValue7.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue7.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue7.setName(""); // NOI18N
        fieldValue7.setPreferredSize(new java.awt.Dimension(160, 30));

        fieldValue8.setEditable(false);
        fieldValue8.setText("jTextField1");
        fieldValue8.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue8.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue8.setName(""); // NOI18N
        fieldValue8.setPreferredSize(new java.awt.Dimension(160, 30));

        fieldValue9.setEditable(false);
        fieldValue9.setText("jTextField1");
        fieldValue9.setMaximumSize(new java.awt.Dimension(160, 30));
        fieldValue9.setMinimumSize(new java.awt.Dimension(160, 30));
        fieldValue9.setName(""); // NOI18N
        fieldValue9.setPreferredSize(new java.awt.Dimension(160, 30));

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue0, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addComponent(field9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(fieldValue9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValue9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLayeredPane.add(jPanel0, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel field0;
    public javax.swing.JLabel field1;
    public javax.swing.JLabel field2;
    public javax.swing.JLabel field3;
    public javax.swing.JLabel field4;
    public javax.swing.JLabel field5;
    public javax.swing.JLabel field6;
    public javax.swing.JLabel field7;
    public javax.swing.JLabel field8;
    public javax.swing.JLabel field9;
    public javax.swing.JTextField fieldValue0;
    public javax.swing.JTextField fieldValue1;
    public javax.swing.JTextField fieldValue2;
    public javax.swing.JTextField fieldValue3;
    public javax.swing.JTextField fieldValue4;
    public javax.swing.JTextField fieldValue5;
    public javax.swing.JTextField fieldValue6;
    public javax.swing.JTextField fieldValue7;
    public javax.swing.JTextField fieldValue8;
    public javax.swing.JTextField fieldValue9;
    public javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JPanel jPanel0;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(SqlReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SqlReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SqlReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SqlReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SqlReq iSqlReq = new SqlReq();
                iSqlReq.setLocationRelativeTo(null);
                iSqlReq.setVisible(true);
            }
        });
    }
}