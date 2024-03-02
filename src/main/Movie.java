
package main;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

	


public class Movie extends javax.swing.JInternalFrame {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet Rs=null;
    String path2 = null;
    
    public Movie() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        con = MyConnection.getConnection();
        Tableupdate();
        updateProducerCombo();
        updateStudioCombo();
    }
    
    //update content of jtable or load data to table
    private void Tableupdate(){
        int CC;
        try{
            pst = con.prepareStatement("SELECT * FROM movies");
            Rs = pst.executeQuery(); 
            
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC= RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);
            
            while(Rs.next()){
                Vector v = new Vector();
                //id	title	catagory producer studio duration actors full	highlight status
                for(int i=1; i<=CC; i++){ 
                    v.add(Rs.getString("id"));
                    v.add(Rs.getString("title"));
                    v.add(Rs.getString("catagory"));
                    v.add(Rs.getString("producer"));
                    v.add(Rs.getString("studio"));
                    v.add(Rs.getString("duration"));
                    v.add(Rs.getString("actors"));
                    v.add(Rs.getString("full"));
                    v.add(Rs.getString("highlight"));
                    v.add(Rs.getString("status"));
                    v.add(Rs.getBlob("image"));
                }
                DFT.addRow(v);
            }
        }catch(Exception e){
           System.out.println("UNABLE TO LOAD DATA FROM DATABASE TO JTABLE!\n CHECK UPDATE TABLE METHOD!");
        }
    }
    
    private void updateProducerCombo(){
        String sql ="SELECT * FROM producers";
        try {
            pst = con.prepareStatement(sql);
            Rs = pst.executeQuery(); 
            while(Rs.next()){
                txtComboProducer.addItem(Rs.getString("fname"));
            }
        } catch (SQLException ex) {
        }
            
    }
    
    private void updateStudioCombo(){
        String sql ="SELECT * FROM studios";
        try {
            pst = con.prepareStatement(sql);
            Rs = pst.executeQuery(); 
            while(Rs.next()){
                txtComboStudio.addItem(Rs.getString("sname"));
            }
        } catch (SQLException ex) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtComboProducer = new javax.swing.JComboBox<>();
        txtComboStudio = new javax.swing.JComboBox<>();
        txtComboCatagory = new javax.swing.JComboBox<>();
        txtDuration = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtActors = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFullUrl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHighlight = new javax.swing.JTextField();
        txtComboStatus = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        l_photo = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOVIES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 170, 20));

        jTable1.setBackground(new java.awt.Color(0, 0, 204));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Catagory", "Producer", "Studio", "Duration", "Actors ", "Full Url", "Highlight ", "Status", "image"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 306, 720, 210));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 204)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("TITLE :");

        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTitle.setToolTipText("");
        txtTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("CATAGORY :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("PRODUCER :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("STUDIO :");

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

        txtComboProducer.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtComboProducer.setForeground(new java.awt.Color(0, 0, 255));
        txtComboProducer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 204)));

        txtComboStudio.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtComboStudio.setForeground(new java.awt.Color(0, 0, 255));
        txtComboStudio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 204)));

        txtComboCatagory.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtComboCatagory.setForeground(new java.awt.Color(0, 0, 204));
        txtComboCatagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Comedy", "Drama", "Horror", "Romantic", "Fantasy", "Adventure" }));
        txtComboCatagory.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 204)));

        txtDuration.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDuration.setToolTipText("");
        txtDuration.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("DURATION :");

        txtActors.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtActors.setToolTipText("");
        txtActors.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("NUMBER OF ACTORS :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("FULL VERSION URL :");

        txtFullUrl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFullUrl.setToolTipText("");
        txtFullUrl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("HIGHLIGHT URL :");

        txtHighlight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtHighlight.setToolTipText("");
        txtHighlight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));

        txtComboStatus.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtComboStatus.setForeground(new java.awt.Color(0, 0, 204));
        txtComboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Not Active" }));
        txtComboStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 204)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("STATUS :");

        l_photo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Upload");
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtComboCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFullUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtActors, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtComboStudio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(118, 118, 118)
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(txtComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtComboProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtHighlight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(l_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtComboCatagory, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtActors, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFullUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtComboProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHighlight, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtComboStudio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //SAVE BUTTON CLIKED
        try {
            String Title,catagory,producer,studio,duration,actors,full,highlight,status;
            Title = txtTitle.getText(); 
            catagory = (String)txtComboCatagory.getSelectedItem();
            producer = (String)txtComboProducer.getSelectedItem();
            studio = (String)txtComboStudio.getSelectedItem();
            duration = txtDuration.getText();
            actors = txtActors.getText();
            full = txtFullUrl.getText();
            highlight = txtHighlight.getText();
            status = (String)txtComboStatus.getSelectedItem();
            InputStream input = new FileInputStream(new File(path2));
            //id	title	catagory producer studio duration actors full	highlight status image
            pst = con.prepareStatement("insert into movies(title,catagory,producer,studio,duration,actors,full,highlight,status,image) values (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, Title);
            pst.setString(2, catagory);
            pst.setString(3, producer);
            pst.setString(4, studio);
            pst.setString(5, duration);
            pst.setString(6, actors);
            pst.setString(7, full);
            pst.setString(8, highlight);
            pst.setString(9, status);
            pst.setBlob(10, input);
            pst.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "RECORD SAVED","Success Message",JOptionPane.INFORMATION_MESSAGE);
            Tableupdate();
            txtTitle.setText("");
            txtComboCatagory.setSelectedIndex(-1);
            txtComboProducer.setSelectedIndex(-1);
            txtComboStudio.setSelectedIndex(-1);
            txtDuration.setText("");
            txtActors.setText("");
            txtFullUrl.setText("");
            txtHighlight.setText("");
            txtComboStatus.setSelectedIndex(-1);
            l_photo.setIcon(null);
            txtTitle.requestFocus();
        } catch (Exception e) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // table click
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow(); //get row
        
        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString()); //0 column is id
        txtTitle.setText(model.getValueAt(selectedIndex, 1).toString()); //1 column is title
        txtComboCatagory.setSelectedItem(model.getValueAt(selectedIndex, 2));
        txtComboProducer.setSelectedItem(model.getValueAt(selectedIndex, 3));
        txtComboStudio.setSelectedItem(model.getValueAt(selectedIndex, 4));
        txtDuration.setText(model.getValueAt(selectedIndex, 5).toString());
        txtActors.setText(model.getValueAt(selectedIndex, 6).toString());
        txtFullUrl.setText(model.getValueAt(selectedIndex, 7).toString());
        txtHighlight.setText(model.getValueAt(selectedIndex, 8).toString());
        txtComboStatus.setSelectedItem(model.getValueAt(selectedIndex, 9));
        Blob image = (Blob)model.getValueAt(selectedIndex, 10);
        String path= "C:\\Users\\Feyesel Sultan\\Desktop\\ImageFile\\img.jpg";
        try {
            byte[] byt = image.getBytes(1, (int)image.length());
            FileOutputStream fos= new FileOutputStream(path);
            fos.write(byt);
            ImageIcon icon = new ImageIcon(byt);
            l_photo.setIcon(icon);
        } catch (Exception E) {
            System.out.println("UNABLE TO LOAD DATA FROM TABLE CHACK TABLE CLICK EVENTS");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // UPDATE Button
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedIndex = jTable1.getSelectedRow(); //getting selected row and assign it to variable
        
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            
            String Title,catagory,producer,studio,duration,actors,full,highlight,status;
            Title = txtTitle.getText(); 
            catagory = (String)txtComboCatagory.getSelectedItem();
            producer = (String)txtComboProducer.getSelectedItem();
            studio = (String)txtComboStudio.getSelectedItem();
            duration = txtDuration.getText();
            actors = txtActors.getText();
            full = txtFullUrl.getText();
            highlight = txtHighlight.getText();
            status = (String)txtComboStatus.getSelectedItem();
            InputStream input = new FileInputStream(new File(path2));
            pst = con.prepareStatement("update movies set title=?,catagory=?,producer=?,studio=?,duration=?,actors=?,full=?,highlight=?,status=?,image=? where id=?");
            pst.setString(1, Title);
            pst.setString(2, catagory);
            pst.setString(3, producer);
            pst.setString(4, studio);
            pst.setString(5, duration);
            pst.setString(6, actors);
            pst.setString(7, full);
            pst.setString(8, highlight);
            pst.setString(9, status);
            pst.setBlob(10, input);
            pst.setInt(11, id);
            pst.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "RECORD UPDATED !","Success Message",JOptionPane.INFORMATION_MESSAGE);
            Tableupdate();
            txtTitle.setText("");
            txtComboCatagory.setSelectedIndex(-1);
            txtComboProducer.setSelectedIndex(-1);
            txtComboStudio.setSelectedIndex(-1);
            txtDuration.setText("");
            txtActors.setText("");
            txtFullUrl.setText("");
            txtHighlight.setText("");
            txtComboStatus.setSelectedIndex(-1);
            l_photo.setIcon(null);
            txtTitle.requestFocus();
        } catch (Exception ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Delete Button
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedIndex = jTable1.getSelectedRow();
        
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            
            pst = con.prepareStatement("delete from movies where id = ?");
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "RECORD DELETED !","Success Message",JOptionPane.INFORMATION_MESSAGE);
            Tableupdate();
            txtTitle.setText("");
            txtComboCatagory.setSelectedIndex(-1);
            txtComboProducer.setSelectedIndex(-1);
            txtComboStudio.setSelectedIndex(-1);
            txtDuration.setText("");
            txtActors.setText("");
            txtFullUrl.setText("");
            txtHighlight.setText("");
            txtComboStatus.setSelectedIndex(-1);
            l_photo.setIcon(null);
            txtTitle.requestFocus();
        } catch (SQLException ex) {
            System.out.println("UPDATE ERROR");
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // UPLOAD PHOTO BUTTON
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(134, 172, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            l_photo.setIcon(icon);
            path2=path;
        } catch (IOException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // clear button
        txtTitle.setText("");
        txtComboCatagory.setSelectedIndex(-1);
        txtComboProducer.setSelectedIndex(-1);
        txtComboStudio.setSelectedIndex(-1);
        txtDuration.setText("");
        txtActors.setText("");
        txtFullUrl.setText("");
        txtHighlight.setText("");
        txtComboStatus.setSelectedIndex(-1);
        l_photo.setIcon(null);
        txtTitle.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l_photo;
    private javax.swing.JTextField txtActors;
    private javax.swing.JComboBox<String> txtComboCatagory;
    private javax.swing.JComboBox<String> txtComboProducer;
    private javax.swing.JComboBox<String> txtComboStatus;
    private javax.swing.JComboBox<String> txtComboStudio;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFullUrl;
    private javax.swing.JTextField txtHighlight;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
