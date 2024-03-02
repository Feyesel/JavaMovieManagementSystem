
package main;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Feyesel Sultan
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form mainMenu
     */
    
    int mouseX, mouseY;
    
    public mainMenu() {
        initComponents();
    }
    
    public mainMenu(String fname, String lname) {
        initComponents();
        l_adminName.setText(fname.toUpperCase()+" "+lname.toUpperCase());
    }
    
    
    
    private void onClick(JPanel panel){
        panel.setBackground(new Color(51,255,255));
    }
    private void onLeaveClick(JPanel panel){
        panel.setBackground(new Color(0,153,153)); //[0,153,153]
    }
    //initComponent defination dont edit!
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        l_admin = new javax.swing.JLabel();
        l_adminName = new javax.swing.JLabel();
        btn2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 2, new java.awt.Color(153, 153, 153)));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 204, 204));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/admin.png"))); // NOI18N
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 5, 130, 67));

        l_admin.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        l_admin.setForeground(new java.awt.Color(255, 255, 255));
        l_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_admin.setText("ADMIN");
        sidePanel.add(l_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 15));

        l_adminName.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        l_adminName.setForeground(new java.awt.Color(255, 255, 255));
        l_adminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_adminName.setText("Admin Name");
        sidePanel.add(l_adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 130, 15));

        btn2.setBackground(new java.awt.Color(0, 153, 153));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        btn2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Producer.png"))); // NOI18N
        btn2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 130, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PRODUCER INFO");
        btn2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 10));

        sidePanel.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, 60));

        btn3.setBackground(new java.awt.Color(0, 153, 153));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Available.png"))); // NOI18N
        btn3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 130, 30));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRODUCTION STUDIO");
        btn3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 10));

        sidePanel.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 130, 60));

        btn4.setBackground(new java.awt.Color(0, 153, 153));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        btn4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/movie.png"))); // NOI18N
        btn4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 130, 30));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MOVIE DETAIL");
        btn4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 10));

        sidePanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 130, 60));

        btnLogOut.setBackground(new java.awt.Color(0, 153, 153));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Back.png"))); // NOI18N
        jLabel11.setText("Log Out");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnLogOutLayout = new javax.swing.GroupLayout(btnLogOut);
        btnLogOut.setLayout(btnLogOutLayout);
        btnLogOutLayout.setHorizontalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnLogOutLayout.setVerticalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 130, -1));

        btn6.setBackground(new java.awt.Color(0, 153, 153));
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });
        btn6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/users.png"))); // NOI18N
        btn6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 130, 30));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("USERS");
        btn6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 10));

        sidePanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 130, 60));

        btn1.setBackground(new java.awt.Color(0, 153, 153));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/dashboard (2).png"))); // NOI18N
        btn1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 130, 30));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DASHBOARD");
        btn1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 10));

        sidePanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 130, 60));

        mainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 2, new java.awt.Color(153, 153, 153)));
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
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Exit1.png"))); // NOI18N
        jLabel2.setToolTipText("Exit");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        headerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 900, 35));

        jDesktopPane1.setBackground(new java.awt.Color(242, 242, 242));

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("WLLCOME TO ARIF MOVIE MANAGEMENT SYSTEM");

        jLabel17.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DEVELOPED BY : THE FOLLOWING SMU STUDENTS");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("1.  AMANUEL ALEMACHEW                             RCD / 0749/2014");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("2.  BISRAT BOGE                                               RCD / 0758/2014");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("3.  FEYESEL SULATN                                          RAD / 0321/2014");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("4.  FITSUM HABTAMU                                      RCD / 0766/2014");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("5.  HAYAT BERHANU                                        RCD / 0768/2014");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("6.  HENOK SEBSIBE                                            RCD / 0769/2014");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("8.  MIKIYAS FETENE                                            RCD / 3127/2013");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("9.  NATNAEL TIBEBU                                          RCD / 0791/2014");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("10. YABSIRA FIKRU                                            RCD / 0749/2014");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("7.  HUSSEIN HABTAMU                                     RCD / 0770/2014");

        jLabel28.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel28.setText("INSTRUCTED BY :   TEACHER MARTA");

        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(54, 54, 54))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(35, 35, 35)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        mainPanel.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 36, 769, 564));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //WHEN x clicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        // log out btn clicked
        loginForm login = new loginForm();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        onClick(btn1);
        onLeaveClick(btn2);
        onLeaveClick(btn3);
        onLeaveClick(btn4);
        onLeaveClick(btn6);
        
        Dashboard menu = new Dashboard();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(menu).setVisible(true);
    }//GEN-LAST:event_btn1MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        // TODO add your handling code here:
        onLeaveClick(btn1);
        onLeaveClick(btn2);
        onLeaveClick(btn3);
        onLeaveClick(btn4);
        onClick(btn6);
        
        Users user = new Users();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(user).setVisible(true);
    }//GEN-LAST:event_btn6MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        // TODO add your handling code here:
        onLeaveClick(btn1);
        onLeaveClick(btn2);
        onLeaveClick(btn3);
        onClick(btn4);
        onLeaveClick(btn6);
        
        Movie movie = new Movie();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(movie).setVisible(true);
    }//GEN-LAST:event_btn4MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        // TODO add your handling code here:
        onLeaveClick(btn1);
        onLeaveClick(btn2);
        onClick(btn3);
        onLeaveClick(btn4);
        onLeaveClick(btn6);
        
        Studio studio = new Studio();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(studio).setVisible(true);
    }//GEN-LAST:event_btn3MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        // TODO add your handling code here:
        onLeaveClick(btn1);
        onClick(btn2);
        onLeaveClick(btn3);
        onLeaveClick(btn4);
        onLeaveClick(btn6);
        
        Producer producer = new Producer();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(producer).setVisible(true);
    }//GEN-LAST:event_btn2MouseClicked

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn2;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JPanel btn6;
    private javax.swing.JPanel btnLogOut;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel l_admin;
    private javax.swing.JLabel l_adminName;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
