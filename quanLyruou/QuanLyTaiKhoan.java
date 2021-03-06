/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static nhom19.BaoTriRuouFrame.deleteRuouFromDB;

/**
 *
 * @author Administrator
 */
public class QuanLyTaiKhoan extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyTaiKhoan
     */
    
    
    public QuanLyTaiKhoan() {
        initComponents();
        loadTable(getData());
    }
    public void loadTable(ArrayList<TaiKhoan> list) {
        jTable1.setModel(new TaiKhoanTable(list));
    }
    public ArrayList<TaiKhoan> getData() {
        ArrayList<TaiKhoan> dsTk = new ArrayList<TaiKhoan>();
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/QLRuou";
            String user = "nhom19";
            String password = "1";
            Connection con = DriverManager.getConnection(url, user, password );
            String query = "select * from TaiKhoan";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            TaiKhoan t;
            while(rs.next()) {
                t = new TaiKhoan(rs.getString("maTaiKhoan"), rs.getString("tenTaiKhoan"), rs.getString("matKhau"));
                dsTk.add(t);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dsTk;
    }
    public void clearTextDetail() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }
    private void setTextDetail(TaiKhoan t){
        jTextField1.setText(t.getMaTaiKhoan().trim());
        jTextField2.setText(t.getTenTaiKhoan().trim());
        jTextField3.setText(t.getMatKhau().trim());
    }
    private TaiKhoan getTaiKhoanDetail(){
        String maTaiKhoan = jTextField1.getText().trim();
        String tenTaiKhoan = jTextField2.getText().trim();
        String matKhau = jTextField3.getText().trim();
        
        return new TaiKhoan(maTaiKhoan, tenTaiKhoan, matKhau);
    }
    static void insertTaiKhoanIntoDB(String maTaiKhoan, String tenTaiKhoan, String matKhau){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/QLRuou";
            String user = "nhom19";
            String password = "1";
            Connection con = DriverManager.getConnection(url, user, password );
            String query = "insert into TaiKhoan values(?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, maTaiKhoan);
            pst.setString(2, tenTaiKhoan);
            pst.setString(3, matKhau);
            
            pst.executeUpdate();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    static void updateTaiKhoan(String maTaiKhoan, String tenTaiKhoan, String matKhau){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/QLRuou";
            String user = "nhom19";
            String password = "1";
            Connection con = DriverManager.getConnection(url, user, password );
            String query = "update TaiKhoan set tenTaiKhoan=?, matKhau=? where maTaiKhoan=?";
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(3, maTaiKhoan);
            pst.setString(1, tenTaiKhoan);
            pst.setString(2, matKhau);
            
            pst.executeUpdate();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    static void deleteTaiKhoan (String maRuou){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/QLRuou";
            String user = "nhom19";
            String password = "1";
            Connection con = DriverManager.getConnection(url, user, password );
            String query = "delete from TaiKhoan where maTaiKhoan=?";
            PreparedStatement pst = con.prepareStatement(query);
            
            
            pst.setString(1, maRuou);
            
            
            pst.executeUpdate();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý tài khoản");

        jLabel1.setText("Mã tài khoản");

        jLabel2.setText("Tên tài khoản");

        jLabel3.setText("Mật khẩu");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tìm kiếm");

        jButton4.setText("Tìm kiếm");

        jButton5.setText("Đăng xuất");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jButton5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TaiKhoan t = getTaiKhoanDetail();
        insertTaiKhoanIntoDB(t.getMaTaiKhoan(), t.getTenTaiKhoan(), t.getMatKhau());
        loadTable(getData());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TaiKhoan t = getTaiKhoanDetail();
        updateTaiKhoan(t.getMaTaiKhoan(), t.getTenTaiKhoan(), t.getMatKhau());
        loadTable(getData());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        TaiKhoan t = getData().get(row);
        setTextDetail(t);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
            int click=JOptionPane.showConfirmDialog(null,"Chắc chắn xóa tài khoản này","Xoá?",JOptionPane.YES_NO_OPTION);
            if (click==JOptionPane.YES_OPTION) {
                //lấy dòng chọn hiện thời trong table
                int row= jTable1.getSelectedRow();
                String maTaiKhoan = jTable1.getValueAt(row, 0).toString();
                deleteTaiKhoan (maTaiKhoan);
                loadTable(getData());
                clearTextDetail();
            }
        } catch (Exception ex) {            
            JOptionPane.showMessageDialog(null, "Không xoá duoc "+ ex.toString() );
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
