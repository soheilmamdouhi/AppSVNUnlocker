/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsvnunlocker;

import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Soheil Mamdouhi
 */
public class jfMainForm extends javax.swing.JFrame {

    /**
     * Creates new form jfMainForm
     */
    public jfMainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtXLSFile = new javax.swing.JTextField();
        lblImportXLSFile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblXLSShow = new javax.swing.JTable();
        btnUnlock = new javax.swing.JButton();
        lblBrowse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SVN Unlocker");
        setName("frmMainForm"); // NOI18N
        setResizable(false);

        txtXLSFile.setName("txtXLSFile"); // NOI18N

        lblImportXLSFile.setText("Import Excel File");
        lblImportXLSFile.setName("lblImportXLSFile"); // NOI18N

        tblXLSShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
            },
            new String [] {
                "Title 1"
            }
        ));
        tblXLSShow.setName("tblXLSShow"); // NOI18N
        jScrollPane1.setViewportView(tblXLSShow);

        btnUnlock.setText("Unlock");
        btnUnlock.setName("btnUnlock"); // NOI18N
        btnUnlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnlockActionPerformed(evt);
            }
        });

        lblBrowse.setText("Browse");
        lblBrowse.setName("lblBrowse"); // NOI18N
        lblBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblImportXLSFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXLSFile, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUnlock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImportXLSFile)
                    .addComponent(txtXLSFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrowse))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUnlock)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnlockActionPerformed
        try{
            System.out.println("Hello");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "First select a file to import.", "Error", JOptionPane.ERROR);
            return;
        }
    }//GEN-LAST:event_btnUnlockActionPerformed

    private void lblBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBrowseActionPerformed
//        JFileChooser objFileChooser = new JFileChooser();
//        objFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
//        int result = objFileChooser.showOpenDialog(parent);
        JFileChooser objFileChooser = new JFileChooser();
        objFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter objFileFilter = new FileNameExtensionFilter("EXCEL FILES", "xlsx", "excel");
        objFileChooser.addChoosableFileFilter(objFileFilter);
        objFileChooser.setFileFilter(objFileFilter);
        int result = objFileChooser.showOpenDialog(this);
//        objFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("*.xls", "XLS"));
//        objFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("*.xlsx", "XLSX"));

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = objFileChooser.getSelectedFile();
            txtXLSFile.setText(selectedFile.getAbsolutePath());
        }
        
    }//GEN-LAST:event_lblBrowseActionPerformed

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
            java.util.logging.Logger.getLogger(jfMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUnlock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lblBrowse;
    private javax.swing.JLabel lblImportXLSFile;
    private javax.swing.JTable tblXLSShow;
    private javax.swing.JTextField txtXLSFile;
    // End of variables declaration//GEN-END:variables
}
