/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TeacherManagementFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public TeacherManagementFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        txtTEACHERID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTEACHERFIRSTN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTEACHERLASTN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTEACHERADDRESS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTEACHEREMAIL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTEACHERPHONEN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTEACHERSUBJECTID = new javax.swing.JTextField();
        btnADDTEACHER = new javax.swing.JButton();
        btnUPDATETEACHER = new javax.swing.JButton();
        btnDELETETEACHER = new javax.swing.JButton();
        btnBACKMAINMENU = new javax.swing.JButton();
        btnVIEWTEACHER = new javax.swing.JButton();

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
        jLabel1.setText("     TEACHER MANAGEMENT ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Teacher Id:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Phone Number:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Subject Id:");

        txtTEACHERSUBJECTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTEACHERSUBJECTIDActionPerformed(evt);
            }
        });

        btnADDTEACHER.setBackground(new java.awt.Color(255, 255, 255));
        btnADDTEACHER.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnADDTEACHER.setText("Add Teacher");
        btnADDTEACHER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnADDTEACHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDTEACHERActionPerformed(evt);
            }
        });

        btnUPDATETEACHER.setBackground(new java.awt.Color(255, 255, 255));
        btnUPDATETEACHER.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUPDATETEACHER.setText("Update Teacher");
        btnUPDATETEACHER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUPDATETEACHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATETEACHERActionPerformed(evt);
            }
        });

        btnDELETETEACHER.setBackground(new java.awt.Color(255, 255, 255));
        btnDELETETEACHER.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDELETETEACHER.setText("Delete Teacher");
        btnDELETETEACHER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDELETETEACHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETETEACHERActionPerformed(evt);
            }
        });

        btnBACKMAINMENU.setBackground(new java.awt.Color(255, 255, 255));
        btnBACKMAINMENU.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBACKMAINMENU.setText("<--- Back");
        btnBACKMAINMENU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBACKMAINMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBACKMAINMENUActionPerformed(evt);
            }
        });

        btnVIEWTEACHER.setBackground(new java.awt.Color(255, 255, 255));
        btnVIEWTEACHER.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVIEWTEACHER.setText("View Teacher");
        btnVIEWTEACHER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVIEWTEACHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVIEWTEACHERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(380, 380, 380)
                            .addComponent(btnBACKMAINMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(txtTEACHERID, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(txtTEACHERFIRSTN, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(txtTEACHERLASTN, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(txtTEACHERADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(txtTEACHEREMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(txtTEACHERPHONEN, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(txtTEACHERSUBJECTID, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(btnADDTEACHER, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnUPDATETEACHER, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnDELETETEACHER, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnVIEWTEACHER, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnBACKMAINMENU)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTEACHERID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTEACHERFIRSTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTEACHERLASTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTEACHERADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTEACHEREMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTEACHERPHONEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTEACHERSUBJECTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnADDTEACHER)
                    .addComponent(btnUPDATETEACHER)
                    .addComponent(btnDELETETEACHER)
                    .addComponent(btnVIEWTEACHER)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTEACHERSUBJECTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTEACHERSUBJECTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTEACHERSUBJECTIDActionPerformed

    private void btnADDTEACHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDTEACHERActionPerformed
        // TODO add your handling code here:
        String firstName = txtTEACHERFIRSTN.getText();
        String lastName = txtTEACHERLASTN.getText();
        String address = txtTEACHERADDRESS.getText();
        String email = txtTEACHEREMAIL.getText();
        String phoneNumber = txtTEACHERPHONEN.getText();
        int subjectId = Integer.parseInt(txtTEACHERSUBJECTID.getText());
        
        try {
            Connection conn = DB.getConnection();
            String query = "INSERT INTO teachers (first_name, last_name, address, email, phone_number, subject_id) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, address);
            stmt.setString(4, email);
            stmt.setString(5, phoneNumber);
            stmt.setInt(6, subjectId);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Teacher Added Successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error adding teacher");
        }
    

    }//GEN-LAST:event_btnADDTEACHERActionPerformed

    private void btnUPDATETEACHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATETEACHERActionPerformed
        // TODO add your handling code here:
        if (txtTEACHERID.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Teacher ID is required");
        return;
    }
        int teacherId = Integer.parseInt(txtTEACHERID.getText());
        String firstName = txtTEACHERFIRSTN.getText();
        String lastName = txtTEACHERLASTN.getText();
        String address = txtTEACHERADDRESS.getText();
        String email = txtTEACHEREMAIL.getText();
        String phoneNumber = txtTEACHERPHONEN.getText();
        int subjectId = Integer.parseInt(txtTEACHERSUBJECTID.getText());
        
        try {
            Connection conn = DB.getConnection();
            String query = "UPDATE teachers SET first_name = ?, last_name = ?, address = ?, email = ?, phone_number = ?, subject_id = ? WHERE teacher_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, address);
            stmt.setString(4, email);
            stmt.setString(5, phoneNumber);
            stmt.setInt(6, subjectId);
            stmt.setInt(7, teacherId);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Teacher Updated Successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error updating teacher");
        }
    }//GEN-LAST:event_btnUPDATETEACHERActionPerformed

    private void btnDELETETEACHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETETEACHERActionPerformed
        // TODO add your handling code here:
        int teacherId = Integer.parseInt(txtTEACHERID.getText());
        
        try {
            Connection conn = DB.getConnection();
            String query = "DELETE FROM teachers WHERE teacher_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, teacherId);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Teacher Deleted Successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error deleting teacher");
        }
    
    }//GEN-LAST:event_btnDELETETEACHERActionPerformed

    private void btnVIEWTEACHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVIEWTEACHERActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ViewTeacher().setVisible(true);
    }//GEN-LAST:event_btnVIEWTEACHERActionPerformed

    private void btnBACKMAINMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBACKMAINMENUActionPerformed
        // TODO add your handling code here:
        DB obj = new DB();
        obj.returningToMainMenu();
        this.dispose();
    }//GEN-LAST:event_btnBACKMAINMENUActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADDTEACHER;
    private javax.swing.JButton btnBACKMAINMENU;
    private javax.swing.JButton btnDELETETEACHER;
    private javax.swing.JButton btnUPDATETEACHER;
    private javax.swing.JButton btnVIEWTEACHER;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTEACHERADDRESS;
    private javax.swing.JTextField txtTEACHEREMAIL;
    private javax.swing.JTextField txtTEACHERFIRSTN;
    private javax.swing.JTextField txtTEACHERID;
    private javax.swing.JTextField txtTEACHERLASTN;
    private javax.swing.JTextField txtTEACHERPHONEN;
    private javax.swing.JTextField txtTEACHERSUBJECTID;
    // End of variables declaration//GEN-END:variables
}
