
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class admission_info extends javax.swing.JFrame {
     private Connection connection = null;
    private PreparedStatement pst = null;
    private ResultSet resultSet = null;

    /**
     * Creates new form admission_info
     */
    public admission_info() {
        initComponents();
        init();
        
        connection = Javadbclass.dbclass();
        updateAdmissionInfoTbl();
       
        
    }
    public void init(){
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }
      public void updateAdmissionInfoTbl() {

        try {
            String sql = "select  AdmissionID,Name,Father_Name,Class,Gurdian_Name,Telephone_No,Present_Adress,Parmanent_Adress,Religion,Nationality,DOB,AdmissionDate from  admissioninfo";
        
            pst = connection.prepareStatement(sql);
            resultSet = pst.executeQuery();
            Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);

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
        Updateadmissioninfotable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        setForeground(new java.awt.Color(255, 102, 0));

        Updateadmissioninfotable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Updateadmissioninfotable);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Search");

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("Admission Data Table");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Search By");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admission ID", "Name", "Father Name", "Class", "Gurdian Name", "Telephone No", "Present Adress", "Parmanent Adress", "Religion", "Date Of Birth", "Admission Date", " " }));

        jTextField4.setText("Search.....");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        admission obj=new  admission();
        obj.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        dispose();
        Activity obj=new Activity();
        obj.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:

        String s = (String)jComboBox4.getSelectedItem();
        if("Admission ID".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where AdmissionID LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
        else if("Name".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where Name LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
        else if("Father Name".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where Father_Name LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
        else if("Gurdian Name".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where Gurdian_Name LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
        else if("Class".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where Class LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
        else if("Telephone No".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where Telephone_No LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
        else if("Present Adress".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where Present_Adress  LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
        else if("Parmanent Adress".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where Parmanent_adress LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
         else if("Religion".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where Religion LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
         else if("Date Of Birth".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where DOB LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }
         else if("Admission Date".equals(s)){
            String tf=jTextField4.getText();
            try{
                String query = "Select * from admissioninfo Where AdmissionDate LIKE '%"+tf+"%'";
                pst = connection.prepareStatement(query);
                resultSet = pst.executeQuery();
                Updateadmissioninfotable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    if(pst!=null) {
                        resultSet.close();
                        pst.close();
                    }
                }catch(Exception e){

                }
            }
        }

    }//GEN-LAST:event_jTextField4KeyReleased

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
            java.util.logging.Logger.getLogger(admission_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admission_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admission_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admission_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admission_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Updateadmissioninfotable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}