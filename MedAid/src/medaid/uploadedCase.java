/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medaid;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static medaid.enterNewCaseFrame.myConn;
import static medaid.uploadResearch.myConn;

/**
 *
 * @author Sazib
 */
public class uploadedCase extends javax.swing.JFrame {

    /**
     * Creates new form uploadedCase
     */
    public uploadedCase() throws SQLException {
        initComponents();
        myConn = Conn.getConnection();
        jComboBox1.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent e) {
                    int i = diseases.indexOf(e.getItem());
                    jTextArea1.setText(symptoms.get(i));
                    jLabel2.setText(dates.get(i));
                }
            }
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UploadedCase");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 220, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print file.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 70, 70));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 180, 50));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 350, 40));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 153, 153));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 610, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 220, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uploaded Case.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       checkMethod(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        checkMethod(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void checkMethod(int i){
        
        if(!(jTextField1.getText().equals(""))){
            
            try {
                stmt = (com.mysql.jdbc.PreparedStatement) myConn.prepareStatement("select * from patient_info where patient_id=?");
                stmt.setInt(1, Integer.parseInt(jTextField1.getText()));
                myRs = stmt.executeQuery();
                
                if (!myRs.isBeforeFirst() )   
                    JOptionPane.showMessageDialog(null, "Unknown patient ID");
                else{
                    if(i==0)
                        createPDF();
                    else
                        fetchRecord();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(uploadResearch.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Please enter patient ID!");
        }
    }
    
    public void fetchRecord(){
        try {
            CallableStatement myStmt;
            myStmt = myConn.prepareCall("{call patient_record(?)}");
            myStmt.setInt(1, Integer.parseInt(jTextField1.getText()));
            myStmt.execute();
            ResultSet myRs1 = myStmt.getResultSet();
            diseases = new ArrayList<String>();
            symptoms = new ArrayList<String>();
            dates = new ArrayList<String>();
            while (myRs1.next()) {
                diseases.add(myRs1.getString("disease_name"));
                symptoms.add(myRs1.getString("symptoms"));
                dates.add(myRs1.getString("case_date"));
            }
            jComboBox1.setModel(new DefaultComboBoxModel(diseases.toArray()));
            jTextArea1.setText(symptoms.get(0));
        } catch (SQLException ex) {
            Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void createPDF(){
        try {                                         
            
            stmt = myConn.prepareStatement("select * from patient_info where patient_id=?");
            stmt.setInt(1, Integer.parseInt(jTextField1.getText()));
            myRs = stmt.executeQuery();
            myRs.next();
            
            chooser = new JFileChooser(); 
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Choose destination");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            
                        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
                  System.out.println("getCurrentDirectory(): " 
                     +  chooser.getCurrentDirectory());
                  System.out.println("getSelectedFile() : " 
                     +  chooser.getSelectedFile());
                  }
                else {
                  System.out.println("No Selection ");
                  }
            
            
            String FILE = "" + chooser.getSelectedFile() + "\\" + jTextField1.getText() + ".pdf";
            
           
            document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(FILE));
            } catch (Exception ex) {
                Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            document.open();
            // Left
            Paragraph paragraph1 = new Paragraph("Patient Name: " + myRs.getString("patient_name") + "\nPatient Sex: " + myRs.getString("patient_sex")
                                                + "\nPatient Location: " + myRs.getString("patient_location") + "\nPatient age: " + myRs.getString("patient_age") + "\n\n") ;
            paragraph1.setAlignment(Element.ALIGN_LEFT);
            
            try {
                document.add(paragraph1);
            } catch (DocumentException ex) {
                Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            CallableStatement myStmt;
            myStmt = myConn.prepareCall("{call patient_record(?)}");
            myStmt.setInt(1, Integer.parseInt(jTextField1.getText()));
            myStmt.execute();
            myRs = myStmt.executeQuery();
            
            while(myRs.next()){
                
                Paragraph paragraph2 = new Paragraph("Doctor: " + myRs.getString("doc_name") + "\nFound Disease: " + myRs.getString("disease_name")
                                                    + "\nFound Symptoms: " + myRs.getString("symptoms") + "\nDate: " + myRs.getString("case_date") + "\n\n");
                paragraph2.setAlignment(Element.ALIGN_LEFT);
                
                try {
                    document.add(paragraph2);
                } catch (DocumentException ex) {
                    Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            document.close();
        } catch (SQLException ex) {
            Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(uploadedCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uploadedCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uploadedCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uploadedCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new uploadedCase().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    ResultSet myRs;
    Document document;
    PreparedStatement stmt;
    JFileChooser chooser;
    List<String> diseases, symptoms, dates;
    static Connection myConn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
