package gbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Dcheckorder extends javax.swing.JFrame {

    /**
     * Creates new form Dcheckorder
     */
    public Dcheckorder() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bookingid = new javax.swing.JTextField();
        cust_id = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cust_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bookingdate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Customerr Id", "Customer Name", "Order Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setAutoscrolls(false);
        jTable1.setShowGrid(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 580, 120));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 90, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Order Status");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 251, 17));

        jLabel2.setText("Order ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 20));

        jLabel3.setText("Customer ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, -1));

        jLabel4.setText("Status");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));
        getContentPane().add(bookingid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 190, 30));
        getContentPane().add(cust_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 190, 30));

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 190, 30));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 130, 40));

        jButton3.setText("Get Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 140, 40));

        jLabel5.setText("Delivered");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 100, -1));

        jLabel6.setText("Out for Delivery");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 90, -1));

        jLabel7.setText("Customer name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, -1));
        getContentPane().add(cust_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 190, 30));

        jLabel8.setText("Order Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 70, -1));

        bookingdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingdateActionPerformed(evt);
            }
        });
        getContentPane().add(bookingdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 190, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\pexels-james-lee-4723037.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 770, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     DefaultTableModel model1=(DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        bookingid.setText(model1.getValueAt(selectedRowIndex, 0).toString());
        cust_id.setText(model1.getValueAt(selectedRowIndex, 1).toString());
        cust_name.setText(model1.getValueAt(selectedRowIndex, 2).toString());
        bookingdate.setText(model1.getValueAt(selectedRowIndex, 3).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root [root on Default schema]","root","root");
          DefaultTableModel ts = (DefaultTableModel) jTable1.getModel();
            String query1 = "SELECT * FROM gasbooking.bookorder";
    PreparedStatement pst = con.prepareStatement(query1);
      ResultSet rs = pst.executeQuery(query1);
       //DefaultTableModel ts = (DefaultTableModel) jTable1.getModel();
   
    while(rs.next()){
        
       String bookingid = String.valueOf(rs.getInt("bookingid"));
       String cust_id = rs.getString("cust_id");
       String cust_name = rs.getString("cust_name");
       String bookingdate = rs.getString("bookingdate");
       
       
       
       String tbdata[] = {bookingid, cust_id, cust_name, bookingdate };
     ts.addRow(tbdata);
        //DefaultTableModel ts = (DefaultTableModel) jTable1.getModel();
   //ts.addRow(tbdata);
     
       
    }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root [root on Default schema]","root","root");
          
            String query = "insert into gasbooking.orderstatus(bookingid, cust_id, cust_name, bookingdate, status) values (?,?,?,?,?)";
    PreparedStatement pst = con.prepareStatement(query);
    
        pst.setString(1,bookingid.getText());
        pst.setString(2,cust_id.getText());
        pst.setString(3,cust_name.getText());
        pst.setString(4,bookingdate.getText());
        pst.setString(5, status.getText());
          
        pst.executeUpdate();
          JOptionPane.showMessageDialog(null, "successfully saved");
        }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(this, e);
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bookingdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingdateActionPerformed

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
            java.util.logging.Logger.getLogger(Dcheckorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dcheckorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dcheckorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dcheckorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dcheckorder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookingdate;
    private javax.swing.JTextField bookingid;
    private javax.swing.JTextField cust_id;
    private javax.swing.JTextField cust_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables
}
