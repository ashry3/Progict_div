/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author lenovo
 */
public class TeacherFrame extends javax.swing.JFrame {

    /**
     * Creates new form TeacherFrame
     */
    public TeacherFrame() {
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

        BG = new javax.swing.JPanel();
        leftSide = new javax.swing.JPanel();
        AddQBtn = new javax.swing.JButton();
        UpdateQBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        AllStudentBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        AllQBtn = new javax.swing.JButton();
        rightSide = new javax.swing.JPanel();
        frame = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddQBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddQBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8_add_30px_2.png"))); // NOI18N
        AddQBtn.setText("Add Question");
        AddQBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddQBtnActionPerformed(evt);
            }
        });

        UpdateQBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateQBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8_exit_without_update_30px_1.png"))); // NOI18N
        UpdateQBtn.setText("Update/Delete Question");
        UpdateQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateQBtnActionPerformed(evt);
            }
        });

        ExitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8_logout_rounded_up_30px.png"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.setPreferredSize(new java.awt.Dimension(276, 41));
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        AllStudentBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AllStudentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8_scorecard_30px_1.png"))); // NOI18N
        AllStudentBtn.setText("All Student Result");
        AllStudentBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AllStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllStudentBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8_back_30px.png"))); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        AllQBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AllQBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8_exit_without_update_30px_1.png"))); // NOI18N
        AllQBtn.setText("All Questions");
        AllQBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AllQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllQBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftSideLayout = new javax.swing.GroupLayout(leftSide);
        leftSide.setLayout(leftSideLayout);
        leftSideLayout.setHorizontalGroup(
            leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddQBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(UpdateQBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addComponent(ExitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AllStudentBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AllQBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftSideLayout.setVerticalGroup(
            leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(AddQBtn)
                .addGap(40, 40, 40)
                .addComponent(UpdateQBtn)
                .addGap(40, 40, 40)
                .addComponent(AllQBtn)
                .addGap(40, 40, 40)
                .addComponent(AllStudentBtn)
                .addGap(40, 40, 40)
                .addComponent(BackBtn)
                .addGap(40, 40, 40)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        BG.add(leftSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 710));

        rightSide.setBackground(new java.awt.Color(102, 102, 102));

        jDesktopPane1.setAutoscrolls(true);
        jDesktopPane1.setDesktopManager(null);
        jDesktopPane1.setDragMode(0);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rightSideLayout = new javax.swing.GroupLayout(rightSide);
        rightSide.setLayout(rightSideLayout);
        rightSideLayout.setHorizontalGroup(
            rightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rightSideLayout.setVerticalGroup(
            rightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BG.add(rightSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 0, 1000, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddQBtnActionPerformed
        JInternalFrame ji = new NewQ2();
        jDesktopPane1.add(ji);
        ji.setVisible(true);

    }//GEN-LAST:event_AddQBtnActionPerformed

    private void UpdateQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateQBtnActionPerformed
        JInternalFrame ji = new UpdateQ2();
        jDesktopPane1.add(ji);
        ji.setVisible(true);
    }//GEN-LAST:event_UpdateQBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        dispose();
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void AllStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllStudentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AllStudentBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void AllQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllQBtnActionPerformed
        JInternalFrame ji = new AllQ();
        jDesktopPane1.add(ji);
        ji.setVisible(true);
    }//GEN-LAST:event_AllQBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddQBtn;
    private javax.swing.JButton AllQBtn;
    private javax.swing.JButton AllStudentBtn;
    private javax.swing.JPanel BG;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton UpdateQBtn;
    private javax.swing.JPanel frame;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel leftSide;
    private javax.swing.JPanel rightSide;
    // End of variables declaration//GEN-END:variables
}
