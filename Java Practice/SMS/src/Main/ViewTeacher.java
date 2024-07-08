package Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewTeacher extends javax.swing.JFrame {

    /**
     * Creates new form ViewTimeTable
     */
    ResultSet rs;
    public ViewTeacher() {
        initComponents();
        try {
            Connection conn = DB.getConnection();
            String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id;";
;
            PreparedStatement stmt = conn.prepareStatement(query);
            DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
              rs = stmt.executeQuery();
             while(rs.next()){
                 String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6)};
                 tbl.addRow(data);
             }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
                        System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error retrieving Student");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblViewTimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Address", "Email", "Phone Number", "Subject"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
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
                        .addComponent(btnSearch)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new StudentManagementFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCLASSESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCLASSESMouseClicked
        // TODO add your handling code here:
        if(cmbCLASSES.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Select Class to see the Students");
        }
        else if(cmbCLASSES.getSelectedIndex() == 0){

        }
    }//GEN-LAST:event_cmbCLASSESMouseClicked

    private void cmbCLASSESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCLASSESActionPerformed
        // TODO add your handling code here:
        if(cmbCLASSES.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Select Class to see the Students");
        }
        else if(cmbCLASSES.getSelectedIndex() == 0){

        }
    }//GEN-LAST:event_cmbCLASSESActionPerformed

    private void cmbCLASSESKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCLASSESKeyPressed
        // TODO add your handling code here:
        if(cmbCLASSES.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Select Class to see the Students");
        }
        else if(cmbCLASSES.getSelectedIndex() == 0){

        }
    }//GEN-LAST:event_cmbCLASSESKeyPressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if(cmbCLASSES.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Select Class to see the Teachers");
        }
        else if(cmbCLASSES.getSelectedIndex() == 1){
            try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =1;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }

        }
        else if(cmbCLASSES.getSelectedIndex() == 2){
                 try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =2;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }}

        else if(cmbCLASSES.getSelectedIndex() == 3){

             try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =3;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }}

        else if(cmbCLASSES.getSelectedIndex() == 4){
             try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =4;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }
        }

        else if(cmbCLASSES.getSelectedIndex() == 5){
             try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =5;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }
        }

        else if(cmbCLASSES.getSelectedIndex() == 6){
             try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =6;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }

        }

        else if(cmbCLASSES.getSelectedIndex() == 7){
            try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =7;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }
        }

        else if(cmbCLASSES.getSelectedIndex() == 8){
             try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =8;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }
        }

        else if(cmbCLASSES.getSelectedIndex() == 9){
             try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =9;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }

        }
        else if(cmbCLASSES.getSelectedIndex() == 10){
             try {

                Connection conn = DB.getConnection();
                String query = "SELECT teachers.first_name, teachers.last_name, teachers.address, teachers.email, teachers.phone_number, subjects.subject_name\n" +
"from teachers\n" +
"INNER join subjects on teachers.subject_id = subjects.subject_id\n" +
"INNER JOIN classes on classes.teacher_id = teachers.teacher_id\n" +
"where teachers.teacher_id =10;";

                PreparedStatement stmt = conn.prepareStatement(query);
                DefaultTableModel tbl = (DefaultTableModel) tblViewTimeTable.getModel();
                tbl.setRowCount(0);
                rs = stmt.executeQuery();
                while(rs.next()){
                    String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                    tbl.addRow(data);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error retrieving Teachers");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid selection!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCLASSES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewTimeTable;
    // End of variables declaration//GEN-END:variables
}
