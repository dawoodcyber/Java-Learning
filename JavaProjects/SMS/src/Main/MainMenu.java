/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author user
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSM = new javax.swing.JButton();
        btnTM = new javax.swing.JButton();
        btnCM = new javax.swing.JButton();
        btnGM = new javax.swing.JButton();
        btnFM = new javax.swing.JButton();
        btnTM2 = new javax.swing.JButton();
        btnAM = new javax.swing.JButton();
        btnLG = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("SCHOOL MANAGEMENT SYSTEM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSM.setBackground(new java.awt.Color(255, 255, 255));
        btnSM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSM.setText("Student Management");
        btnSM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMActionPerformed(evt);
            }
        });

        btnTM.setBackground(new java.awt.Color(255, 255, 255));
        btnTM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTM.setText("Teacher Management");
        btnTM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTMActionPerformed(evt);
            }
        });

        btnCM.setBackground(new java.awt.Color(255, 255, 255));
        btnCM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCM.setText("Class Management");
        btnCM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCMActionPerformed(evt);
            }
        });

        btnGM.setBackground(new java.awt.Color(255, 255, 255));
        btnGM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGM.setText("Grade Management");
        btnGM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGMActionPerformed(evt);
            }
        });

        btnFM.setBackground(new java.awt.Color(255, 255, 255));
        btnFM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnFM.setText("Fee Management");
        btnFM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFMActionPerformed(evt);
            }
        });

        btnTM2.setBackground(new java.awt.Color(255, 255, 255));
        btnTM2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTM2.setText("TimeTable Management");
        btnTM2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTM2ActionPerformed(evt);
            }
        });

        btnAM.setBackground(new java.awt.Color(255, 255, 255));
        btnAM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAM.setText("Attendance Management");
        btnAM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAMActionPerformed(evt);
            }
        });

        btnLG.setBackground(new java.awt.Color(255, 255, 255));
        btnLG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLG.setText("Logout");
        btnLG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLG, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTM2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTM2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTMActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TeacherManagementFrame().setVisible(true);
    }//GEN-LAST:event_btnTMActionPerformed

    private void btnLGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLGActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LoginFrame().setVisible(true);
        
    }//GEN-LAST:event_btnLGActionPerformed

    private void btnSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new StudentManagementFrame().setVisible(true);
        
    }//GEN-LAST:event_btnSMActionPerformed

    private void btnGMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGMActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GradeManagementFrame().setVisible(true);
    }//GEN-LAST:event_btnGMActionPerformed

    private void btnFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFMActionPerformed
        // TODO add your handling code here:
          this.dispose();
        new FeeManagementFrame().setVisible(true);
    }//GEN-LAST:event_btnFMActionPerformed

    private void btnCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCMActionPerformed
        // TODO add your handling code here:
          this.dispose();
        new ClassManagementFrame().setVisible(true);
    }//GEN-LAST:event_btnCMActionPerformed

    private void btnTM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTM2ActionPerformed
        // TODO add your handling code here:
          this.dispose();
        new TimeTableManagementFrame().setVisible(true);
    }//GEN-LAST:event_btnTM2ActionPerformed

    private void btnAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAMActionPerformed
        // TODO add your handling code here:
          this.dispose();
        new AttendanceManagementFrame().setVisible(true);
    }//GEN-LAST:event_btnAMActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAM;
    private javax.swing.JButton btnCM;
    private javax.swing.JButton btnFM;
    private javax.swing.JButton btnGM;
    private javax.swing.JButton btnLG;
    private javax.swing.JButton btnSM;
    private javax.swing.JButton btnTM;
    private javax.swing.JButton btnTM2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}