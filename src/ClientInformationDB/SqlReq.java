/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// https://www.youtube.com/watch?v=NkDnVFAwfas&t=97s
// https://stackoverflow.com/questions/52782697/avoid-nullpointerexception-when-jtable-exports-to-excel-file
package ClientInformationDB;

import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.UIManager;
import java.awt.*;
import java.io.*;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author lyl-Lynx
 */
public class SqlReq extends javax.swing.JFrame {

    ResultSet rs;
    Connect db;
    java.awt.Color nimbusOrange = new java.awt.Color(191, 98, 4);
    infoCli inf = new infoCli();

    public class MyRunnable1 implements Runnable {

        @Override
        public void run() {
            JFrame loadingFrame = new JFrame("Loading screen");
            ImageIcon loading = new ImageIcon("ajax-loader.gif");
            try {
                rs = db.executionQuery(sql.getText());

                loadingFrame.add(new JLabel("loading... ", loading, JLabel.CENTER));
                loadingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                loadingFrame.setSize(440, 200);
                loadingFrame.setLocationRelativeTo(null);
                loadingFrame.setVisible(true);

                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                loadingFrame.dispose();
            } catch (java.lang.IllegalArgumentException ex) {
                loadingFrame.dispose();
                JOptionPane.showMessageDialog(null, "Invalid SQL query");
            }
        }
    }

    public class MyRunnable2 implements Runnable {

        @Override
        public void run() {
            FileOutputStream excelFOU = null;
            BufferedOutputStream excelBOU = null;
            XSSFWorkbook excelJTableExporter = null;
            JFileChooser excelFileChooser = new JFileChooser("D:\\Documents\\Pro\\Productions\\Java\\JTableToExcel\\Results");
            excelFileChooser.setDialogTitle("Save As");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
            excelFileChooser.setFileFilter(fnef);
            int excelChooser = excelFileChooser.showSaveDialog(null);

            if (excelChooser == JFileChooser.APPROVE_OPTION) {

                try {
                    JProgressBar progressBar2 = new JProgressBar();
                    JFrame progressBarFrame2 = new JFrame("Process progress...");
                    excelJTableExporter = new XSSFWorkbook();

                    UIManager.put("nimbusOrange", nimbusOrange);

                    progressBar2.setValue(0);
                    progressBar2.setBounds(0, 75, 425, 50);
                    progressBar2.setStringPainted(true);

                    progressBar2.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 25));

                    progressBarFrame2.add(progressBar2);
                    progressBarFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    progressBarFrame2.setSize(440, 200);
                    progressBarFrame2.setLocationRelativeTo(null);
                    progressBarFrame2.setLayout(null);
                    progressBarFrame2.setVisible(true);

                    int countCells = jTable1.getRowCount() * jTable1.getColumnCount();

                    XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Sheet");
                    for (int i = 0; i < jTable1.getRowCount(); i++) {
                        XSSFRow excelRow = excelSheet.createRow(i);
                        for (int j = 0; j < jTable1.getColumnCount(); j++) {
                            XSSFCell excelCell = excelRow.createCell(j);

                            excelCell.setCellValue(jTable1.getValueAt(i, j) == null ? "" : jTable1.getValueAt(i, j).toString());

                            progressBar2.setValue(((i * jTable1.getColumnCount() + (j + 1)) * 99) / countCells);
                        }
                    }

                    excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                    excelBOU = new BufferedOutputStream(excelFOU);
                    excelJTableExporter.write(excelBOU);
                    progressBar2.setValue(100);
                    UIManager.put("nimbusOrange", java.awt.Color.GREEN);
                    JOptionPane.showMessageDialog(null, "Exported Successfully.");
                    progressBarFrame2.dispose();

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                } finally {
                    try {

                        if (excelBOU != null) {
                            excelBOU.close();
                        }

                        if (excelFOU != null) {
                            excelFOU.close();
                        }

                        if (excelJTableExporter != null) {
                            excelJTableExporter.close();
                        }

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * Creates new form SqlReq
     */
    public SqlReq() {

        initComponents();
        db = new Connect("jdbc:sqlite:.\\bdd.db");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sql = new javax.swing.JTextField();
        ButtonExecute = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button_export = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clients information base");

        sql.setText("select * from clients");
        sql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqlActionPerformed(evt);
            }
        });

        ButtonExecute.setLabel("Execute");
        ButtonExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExecuteActionPerformed(evt);
            }
        });

        jLabel1.setText("ReqSql");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        button_export.setLabel("Export into excel file");
        button_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_export, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(sql, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(ButtonExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonExecute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sql))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(button_export, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExecuteActionPerformed
        MyRunnable1 runnable1 = new MyRunnable1();
        Thread queryThread = new Thread(runnable1);
        queryThread.start();

// TODO add your handling code here:
    }//GEN-LAST:event_ButtonExecuteActionPerformed


    private void button_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exportActionPerformed
        MyRunnable2 runnable2 = new MyRunnable2();
        Thread exportThread = new Thread(runnable2);
        exportThread.start();
    }//GEN-LAST:event_button_exportActionPerformed

    private void sqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sqlActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        
        infoCli infoClient = new infoCli();
        int a = 0;
        Component[] layerComponents = infoClient.jLayeredPane.getComponents();
        for (int i = 0; i < layerComponents.length; i++) {
            System.out.println(i);
            JPanel panel = (JPanel) layerComponents[i];
            Component[] panelComponents = panel.getComponents();
            for (int j = 0; j < panelComponents.length; j++) {

                if (panelComponents[j] instanceof JLabel) {
                    JLabel labelRewrite = (JLabel) panel.getComponents()[j];
                    //System.out.println(jTable1.getColumnModel().getColumn(a).getHeaderValue());
                    labelRewrite.setText((String) jTable1.getColumnModel().getColumn(a).getHeaderValue());
                } else if (panelComponents[j] instanceof JTextField) {
                    JTextField textFieldRewrite = (JTextField) panel.getComponents()[j];
                    //System.out.println(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), a));
                    if (jTable1.getModel().getValueAt(jTable1.getSelectedRow(), a) == null) {
                        textFieldRewrite.setText("None");
                    } else {
                        textFieldRewrite.setText((jTable1.getModel().getValueAt(jTable1.getSelectedRow(), a).toString()));
                    }
                    a++;
                }
            }
        }
        infoClient.setVisible(true);
    }//GEN-LAST:event_jTable1MousePressed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ButtonExecute;
    private java.awt.Button button_export;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField sql;
    // End of variables declaration//GEN-END:variables
}
