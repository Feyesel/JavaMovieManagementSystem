
package main;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Feyesel Sultan
 */
public class Users extends javax.swing.JInternalFrame {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet Rs=null;
    
    public Users() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        con = MyConnection.getConnection();
        Tableupdate();
    }
    
    //update content of jtable or load data to table
    private void Tableupdate(){
        int CC;
        try{
            pst = con.prepareStatement("SELECT * FROM user");
            Rs = pst.executeQuery(); 
            
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC= RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);
            
            while(Rs.next()){
                Vector v = new Vector();//id	uname	pass	fname	lname	question answer	                
                for(int i=1; i<=CC; i++){ 
                    v.add(Rs.getString("id"));
                    v.add(Rs.getString("fname"));
                    v.add(Rs.getString("lname"));
                    v.add(Rs.getString("uname"));
                    v.add(Rs.getString("pass"));
                    v.add(Rs.getString("question"));
                    v.add(Rs.getString("answer"));
                }
                DFT.addRow(v);
            }
        }catch(Exception e){
           System.out.println("UNABLE TO LOAD DATA FROM DATABASE TO JTABLE!\n CHECK UPDATE TABLE METHOD!");
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        txtComboQuestion = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("REGISTRED USERS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("FIRST NAME :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 13, -1, 27));

        txtFname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFname.setToolTipText("");
        txtFname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));
        jPanel1.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 180, 27));

        txtLname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtLname.setToolTipText("");
        txtLname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));
        jPanel1.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 180, 27));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("LAST NAME :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 51, -1, 27));

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUser.setToolTipText("");
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 180, 27));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("USERNAME :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 27));

        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPass.setToolTipText("");
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 180, 27));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("PASSWORD :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 27));

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 79, 36));

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 79, 38));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("RECOVERY QUESTION :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 27));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("RECOVERY ANSWER :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 27));

        txtAnswer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAnswer.setToolTipText("");
        txtAnswer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));
        jPanel1.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 180, 27));

        txtComboQuestion.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtComboQuestion.setForeground(new java.awt.Color(0, 0, 204));
        txtComboQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WHAT IS YOUR FEVOURITE FOOD ?", "WHAT IS YOUR MOTHER'S NAME?", "WHAT IS YOUR LUCKY NUMBER ?" }));
        txtComboQuestion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 204)));
        jPanel1.add(txtComboQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 79, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 47, 720, 260));

        jTable1.setBackground(new java.awt.Color(0, 0, 204));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Username", "Password", "Question", "Answer"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 720, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //SAVE BUTTON CLIKED
        try {
            String fname,lname,user,pass,question,answer;
            fname = txtFname.getText();
            lname = txtLname.getText();
            user = txtUser.getText();
            pass = txtPass.getText();  
            question=(String)txtComboQuestion.getSelectedItem(); //id	uname	pass	fname	lname	question answer
            answer=txtAnswer.getText();
            pst = con.prepareStatement("insert into user(fname,lname,uname,pass,question,answer) values (?,?,?,?,?,?)");
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, user);
            pst.setString(4, pass);
            pst.setString(5, question);
            pst.setString(6, answer);
            pst.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "RECORD SAVED !","Success Message",JOptionPane.INFORMATION_MESSAGE);
            Tableupdate();
            txtFname.setText("");
            txtLname.setText("");
            txtUser.setText("");
            txtPass.setText("");
            txtComboQuestion.setSelectedIndex(-1);
            txtAnswer.setText("");
            txtFname.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //// table click
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        txtFname.setText(model.getValueAt(selectedIndex, 1).toString());
        txtLname.setText(model.getValueAt(selectedIndex, 2).toString());
        txtUser.setText(model.getValueAt(selectedIndex, 3).toString());
        txtPass.setText(model.getValueAt(selectedIndex, 4).toString());
        txtComboQuestion.setSelectedItem(model.getValueAt(selectedIndex, 5).toString());
        txtAnswer.setText(model.getValueAt(selectedIndex, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // UPDATE Button
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             int selectedIndex = jTable1.getSelectedRow();
        
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            String fname,lname,user,pass,question,answer;
            fname = txtFname.getText();
            lname = txtLname.getText();
            user = txtUser.getText();
            pass = txtPass.getText();  
            question=(String)txtComboQuestion.getSelectedItem(); //id	uname	pass	fname	lname	question answer
            answer=txtAnswer.getText();
            pst = con.prepareStatement("update user set fname=?,lname=?,uname=?,pass=?,question=?,answer=? where id=?");
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, user);
            pst.setString(4, pass);
            pst.setString(5, question);
            pst.setString(6, answer);
            pst.setInt(7, id);
            pst.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "RECORD UPDATED !","Success Message",JOptionPane.INFORMATION_MESSAGE);
            Tableupdate();
            txtFname.setText("");
            txtLname.setText("");
            txtUser.setText("");
            txtPass.setText("");
            txtComboQuestion.setSelectedIndex(-1);
            txtAnswer.setText("");
            txtFname.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Delete Button
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedIndex = jTable1.getSelectedRow();
        
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            
            pst = con.prepareStatement("delete from user where id = ?");
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "RECORD DELETED !","Success Message",JOptionPane.INFORMATION_MESSAGE);
            Tableupdate();
            txtFname.setText("");
            txtLname.setText("");
            txtUser.setText("");
            txtPass.setText("");
            txtComboQuestion.setSelectedIndex(-1);
            txtAnswer.setText("");
            txtFname.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Clear button event
        txtFname.setText("");
        txtLname.setText("");
        txtUser.setText("");
        txtPass.setText("");
        txtComboQuestion.setSelectedIndex(-1);
        txtAnswer.setText("");
        txtFname.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JComboBox<String> txtComboQuestion;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}