
package main;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Feyesel Sultan
 */
public class loginForm extends javax.swing.JFrame {
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet Rs=null;
    int mouseX, mouseY;
    
   
    public loginForm() {
        initComponents();
        con = MyConnection.getConnection();
        l_visible.setVisible(false);
    }

   
    //initcomponent to handle UI not edit this stuff
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l_username = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        l_pass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l_username1 = new javax.swing.JLabel();
        txtCombo = new javax.swing.JComboBox<>();
        l_visible = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        headerPanel.setBackground(new java.awt.Color(0, 204, 204));
        headerPanel.setForeground(new java.awt.Color(255, 255, 255));
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });
        headerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPanelMousePressed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Exit1.png"))); // NOI18N
        jLabel1.setToolTipText("EXIT");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login Here !");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(17, 17, 17))
        );

        l_username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_username.setForeground(new java.awt.Color(102, 102, 102));
        l_username.setText("USERNAME :");

        txtUname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUname.setForeground(new java.awt.Color(102, 102, 102));
        txtUname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        l_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_pass.setForeground(new java.awt.Color(102, 102, 102));
        l_pass.setText("PASSWORD :");

        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPass.setForeground(new java.awt.Color(102, 102, 102));
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Forgot");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Password ?");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 204, 204));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log In");
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Don't have an account ?");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SIGN UP NOW");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        l_username1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_username1.setForeground(new java.awt.Color(102, 102, 102));
        l_username1.setText("DESIGNATION :");

        txtCombo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCombo.setForeground(new java.awt.Color(102, 102, 102));
        txtCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        txtCombo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));

        l_visible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Visible 0.png"))); // NOI18N
        l_visible.setToolTipText("PASSWORD VISIBLE ON MOUSE HOVER");
        l_visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_visibleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_visibleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel4))
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l_username1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l_username, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l_pass, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_visible)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(l_username)
                .addGap(12, 12, 12)
                .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_pass)
                .addGap(12, 12, 12)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_visible, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(l_username1)
                .addGap(12, 12, 12)
                .addComponent(txtCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //mouse click x button
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        //login button clicked
        String uname, pass, role;
        uname = txtUname.getText();
        pass = String.valueOf(txtPass.getPassword());
        role=(String)txtCombo.getSelectedItem();
        
        if(uname.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "USERNAME FIELD IS EMPTY","INFORMATIVE MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        }else if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "PASSWORD FIELD IS EMPTY","INFORMATIVE MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(role.equals("User")){//user try to login
                String query = "SELECT * FROM `user` WHERE `uname`=? AND `pass`=?";
                try {
                    pst = con.prepareStatement(query);
                    pst.setString(1, uname);
                    pst.setString(2, pass);
                    Rs = pst.executeQuery(); 

                    if(Rs.next()){
                      String fname,lname;
                      fname=Rs.getString("fname");
                      lname=Rs.getString("lname");
                      JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL"); 
                      //main menu for user
                      userMenu usermenu= new userMenu(fname,lname); 
                      usermenu.setVisible(true);
                      this.dispose();
                    }else{
                       JOptionPane.showMessageDialog(null, "LOGIN FAILED");
                       txtUname.setText("");
                       txtPass.setText("");
                       txtUname.requestFocus();
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }else{
                String query = "SELECT * FROM `admin` WHERE `uname`=? AND `pass`=?";
                try {
                    pst = con.prepareStatement(query);
                    pst.setString(1, uname);
                    pst.setString(2, pass);
                    Rs = pst.executeQuery(); 

                    if(Rs.next()){
                      String fname,lname;
                      fname=Rs.getString("fname");
                      lname=Rs.getString("lname");
                      JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL"); 
                      //main menu for admin
                      mainMenu menu = new mainMenu(fname,lname);
                      menu.setVisible(true);
                      this.dispose();
                    }else{
                       JOptionPane.showMessageDialog(null, "LOGIN FAILED");
                       txtUname.setText("");
                       txtPass.setText("");
                       txtUname.requestFocus();
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // click signup lable
        signupForm signup = new signupForm();
        signup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // click forgot password
        forgotForm forgot = new forgotForm();
        forgot.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        // CLIK PASSWORD FIELD
        l_visible.setVisible(true);
    }//GEN-LAST:event_txtPassMouseClicked

    private void l_visibleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_visibleMouseEntered
        // mouse Enter to lable
        txtPass.setEchoChar((char)0);
    }//GEN-LAST:event_l_visibleMouseEntered

    private void l_visibleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_visibleMouseExited
        // mouse out from lable
        txtPass.setEchoChar('*');
    }//GEN-LAST:event_l_visibleMouseExited

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        // Drag the header panel
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - mouseX,y - mouseY);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        // mouse press header panel
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l_pass;
    private javax.swing.JLabel l_username;
    private javax.swing.JLabel l_username1;
    private javax.swing.JLabel l_visible;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> txtCombo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
