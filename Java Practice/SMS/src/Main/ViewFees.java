package Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewFees extends javax.swing.JFrame {

    /**
     * Creates new form ViewTimeTable
     */
    ResultSet rs;
    public ViewFees() {
        initComponents();
        try {
            Connection conn = DB.getConnection();
            String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id;";
;
            PreparedStatement stmt = conn.prepareStatement(query);
            DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
              rs = stmt.executeQuery();
             while(rs.next()){
                 String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                 tbl.addRow(data);
             }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
                        System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error retrieving Time Table");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewTimeTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        cmbCLASSES = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnPaid = new javax.swing.JButton();
        btnUnpaid = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblViewTimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Amount", "Status", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewTimeTable);

        btnBack.setText("<---");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cmbCLASSES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[...Select One..]", "Class 1", "Class 2", "Class 3", "Class 4", "Class 5", "Class 6", "Class 7", "Class 8", "Class 9", "Class 10" }));
        cmbCLASSES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCLASSESMouseClicked(evt);
            }
        });
        cmbCLASSES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCLASSESActionPerformed(evt);
            }
        });
        cmbCLASSES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbCLASSESKeyPressed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnPaid.setBackground(new java.awt.Color(0, 153, 51));
        btnPaid.setForeground(new java.awt.Color(255, 255, 255));
        btnPaid.setText("Paid");
        btnPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaidActionPerformed(evt);
            }
        });

        btnUnpaid.setBackground(new java.awt.Color(255, 0, 0));
        btnUnpaid.setForeground(new java.awt.Color(255, 255, 255));
        btnUnpaid.setText("Unpaid");
        btnUnpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnpaidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbCLASSES, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUnpaid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCLASSES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)
                        .addComponent(btnPaid)
                        .addComponent(btnUnpaid)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new FeeManagementFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCLASSESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCLASSESMouseClicked
        // TODO add your handling code here:
        if(cmbCLASSES.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Select Class to see the timetable");
        }
        else if(cmbCLASSES.getSelectedIndex() == 0){

        }
    }//GEN-LAST:event_cmbCLASSESMouseClicked

    private void cmbCLASSESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCLASSESActionPerformed
        // TODO add your handling code here:
        if(cmbCLASSES.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Select Class to see the timetable");
        }
        else if(cmbCLASSES.getSelectedIndex() == 0){

        }
    }//GEN-LAST:event_cmbCLASSESActionPerformed

    private void cmbCLASSESKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCLASSESKeyPressed
        // TODO add your handling code here:
        if(cmbCLASSES.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Select Class to see the timetable");
        }
        else if(cmbCLASSES.getSelectedIndex() == 0){

        }
    }//GEN-LAST:event_cmbCLASSESKeyPressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if(cmbCLASSES.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Select Class to see the Fee");
        }
        else if(cmbCLASSES.getSelectedIndex() == 1){
            try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 1;";
;


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }

        }
        else if(cmbCLASSES.getSelectedIndex() == 2){
            try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 2;";
;


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }

        }

        else if(cmbCLASSES.getSelectedIndex() == 3){
           
                  try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 3;";
;


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }

            }

        else if(cmbCLASSES.getSelectedIndex() == 4){
              try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 4;";
;


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }


        }

        else if(cmbCLASSES.getSelectedIndex() == 5){
              try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 5;";



                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }


        }

        else if(cmbCLASSES.getSelectedIndex() == 6){
             try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 6;";
;


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }

        }

        else if(cmbCLASSES.getSelectedIndex() == 7){
              try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 7;";
;


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }
        }

        else if(cmbCLASSES.getSelectedIndex() == 8){
              try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 8;";
;


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }

        }

        else if(cmbCLASSES.getSelectedIndex() == 9){
              try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 9;";
;


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }

        }
        else if(cmbCLASSES.getSelectedIndex() == 10){
              try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE classes.class_id = 10;";
;


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }


        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid selection!");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaidActionPerformed
        // TODO add your handling code here:
        try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE fees.status = 'Paid' ";
                


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }
                cmbCLASSES.setSelectedIndex(0);

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }
        
    }//GEN-LAST:event_btnPaidActionPerformed

    private void btnUnpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnpaidActionPerformed
        // TODO add your handling code here:
         try {

                Connection conn = DB.getConnection();
                String query = "SELECT " +
                  "students.first_name, " +
                  "students.last_name, " +
                  "fees.amount, " +
                  "fees.status, " +
                  "fees.due_date " +
                  "FROM " +
                  "fees " +
                  "INNER JOIN " +
                  "students ON students.student_id = fees.student_id " +
                  "INNER JOIN " +
                  "classes ON classes.class_id = students.class_id " +
                  "WHERE fees.status = 'Unpaid' ";
                


                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)};
                    tbl.addRow(data);
                }
                cmbCLASSES.setSelectedIndex(0);

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Fees");
            }
    }//GEN-LAST:event_btnUnpaidActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPaid;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUnpaid;
    private javax.swing.JComboBox<String> cmbCLASSES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewTimeTable;
    // End of variables declaration//GEN-END:variables
}
