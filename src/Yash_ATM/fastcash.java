/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class fastcash extends javax.swing.JFrame {

    /**
     * Creates new form fastcash
     */
    public fastcash() {
        initComponents();
    }
int MyAccNum;
     public fastcash(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
        GetBalance();
    }
      Connection Con = null;
            PreparedStatement pst = null;
            ResultSet Rs = null;
            Statement St = null;
            int OldBalance;
private void GetBalance()
{
    String Query = "select * from accounttbl where AccNum='"+MyAccNum+"'";
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next()){
               OldBalance = Rs.getInt(9);
              bla.setText("Rs. "+OldBalance);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        WITHDRAW = new javax.swing.JButton();
        DEPOSITIN = new javax.swing.JButton();
        DEPOSITIN1 = new javax.swing.JButton();
        WITHDRAW1 = new javax.swing.JButton();
        DEPOSITIN3 = new javax.swing.JButton();
        WITHDRAW3 = new javax.swing.JButton();
        bla = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 0, 255));

        jLabel2.setBackground(new java.awt.Color(0, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("YASH BANK");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("PLEASE SELECT AMOUNT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(222, 222, 222))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("FAST CASH");

        WITHDRAW.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        WITHDRAW.setText("Rs 500");
        WITHDRAW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WITHDRAWMouseClicked(evt);
            }
        });
        WITHDRAW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAWActionPerformed(evt);
            }
        });

        DEPOSITIN.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        DEPOSITIN.setText("Rs 100");
        DEPOSITIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITINMouseClicked(evt);
            }
        });
        DEPOSITIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITINActionPerformed(evt);
            }
        });

        DEPOSITIN1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        DEPOSITIN1.setText("Rs 1000");
        DEPOSITIN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITIN1MouseClicked(evt);
            }
        });
        DEPOSITIN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITIN1ActionPerformed(evt);
            }
        });

        WITHDRAW1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        WITHDRAW1.setText("Rs 2000");
        WITHDRAW1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WITHDRAW1MouseClicked(evt);
            }
        });
        WITHDRAW1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAW1ActionPerformed(evt);
            }
        });

        DEPOSITIN3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        DEPOSITIN3.setText("Rs 5000");
        DEPOSITIN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITIN3MouseClicked(evt);
            }
        });
        DEPOSITIN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITIN3ActionPerformed(evt);
            }
        });

        WITHDRAW3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        WITHDRAW3.setText("Rs 10000");
        WITHDRAW3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WITHDRAW3MouseClicked(evt);
            }
        });
        WITHDRAW3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAW3ActionPerformed(evt);
            }
        });

        bla.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bla.setForeground(new java.awt.Color(51, 0, 255));
        bla.setText("Balance");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 102));
        jLabel8.setText("BACK");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DEPOSITIN3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(DEPOSITIN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DEPOSITIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bla)
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(WITHDRAW3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WITHDRAW1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WITHDRAW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WITHDRAW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITIN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WITHDRAW1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITIN1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bla))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITIN3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WITHDRAW3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WITHDRAWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WITHDRAWMouseClicked
        // TODO add your handling code here:
        if(OldBalance < 500)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else {

            try {
                String Query = "Update AccountTbl set Balance = ? where AccNum = ?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-500);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this, "Collect Your Cash!");
                    new mainmenu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_WITHDRAWMouseClicked

    private void WITHDRAWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WITHDRAWActionPerformed

    private void DEPOSITINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITINMouseClicked
        // TODO add your handling code here:
        if(OldBalance < 100)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else {

            try {
                String Query = "Update AccountTbl set Balance = ? where AccNum = ?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-100);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this, "Collect Your Cash!");
                    new mainmenu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DEPOSITINMouseClicked

    private void DEPOSITINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITINActionPerformed

    private void DEPOSITIN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITIN1MouseClicked
        // TODO add your handling code here:
        if(OldBalance < 1000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else {

            try {
                String Query = "Update AccountTbl set Balance = ? where AccNum = ?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-1000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this, "Collect Your Cash!");
                    new mainmenu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DEPOSITIN1MouseClicked

    private void DEPOSITIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITIN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITIN1ActionPerformed

    private void WITHDRAW1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WITHDRAW1MouseClicked
        // TODO add your handling code here:
        if(OldBalance < 2000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else {

            try {
                String Query = "Update AccountTbl set Balance = ? where AccNum = ?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-2000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this, "Collect Your Cash!");
                    new mainmenu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_WITHDRAW1MouseClicked

    private void WITHDRAW1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAW1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WITHDRAW1ActionPerformed

    private void DEPOSITIN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITIN3MouseClicked
        // TODO add your handling code here:
        if(OldBalance < 5000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else {

            try {
                String Query = "Update AccountTbl set Balance = ? where AccNum = ?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-5000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this, "Collect Your Cash!");
                    new mainmenu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DEPOSITIN3MouseClicked

    private void DEPOSITIN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITIN3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITIN3ActionPerformed

    private void WITHDRAW3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WITHDRAW3MouseClicked
        // TODO add your handling code here:
        if(OldBalance < 10000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else {

            try {
                String Query = "Update AccountTbl set Balance = ? where AccNum = ?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-10000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this, "Collect Your Cash!");
                    new mainmenu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_WITHDRAW3MouseClicked

    private void WITHDRAW3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAW3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WITHDRAW3ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        new mainmenu(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fastcash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DEPOSITIN;
    private javax.swing.JButton DEPOSITIN1;
    private javax.swing.JButton DEPOSITIN3;
    private javax.swing.JButton WITHDRAW;
    private javax.swing.JButton WITHDRAW1;
    private javax.swing.JButton WITHDRAW3;
    private javax.swing.JLabel bla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
