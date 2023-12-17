/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package millionwinner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
public class python_quiz extends javax.swing.JFrame {

    Connection con = null;
  
   
    String answer,studentanswer;
    int correct,sumscore=0;
    int questionid=9;
    
    public void checkanswer()
    {
        if(jRadioButton1.isSelected())
        {
            studentanswer=jRadioButton1.getText();
        }else if(jRadioButton2.isSelected())
                {
                     studentanswer=jRadioButton2.getText();
                }
        else if(jRadioButton3.isSelected())
                {
                     studentanswer=jRadioButton3.getText();
                }
        else if(jRadioButton4.isSelected())
                {
                     studentanswer=jRadioButton4.getText();
                }
        else{
            JOptionPane.showMessageDialog(new JFrame(), "Answer is required","Error",JOptionPane.ERROR_MESSAGE);
            studentanswer=null;
        }
        
        if(studentanswer.equals(answer))
        {
            sumscore+=correct;
            
            if(questionid == 12)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Your are winner!!","Achived All",JOptionPane.ERROR_MESSAGE);
         Home HomeFrame = new Home();
        HomeFrame.setVisible(true);
        HomeFrame.pack();
        HomeFrame.setLocationRelativeTo(null);
        this.dispose();
        User currentUser = UserSession.getInsance().getCurrentUser();
        currentUser.setScore(sumscore);
        int id=currentUser.getId();
                           try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            con = DriverManager.getConnection("jdbc:mysql://localhost/MillionWinner?user=root&password=123456789");
            Statement st = con.createStatement();
            String update = "update user set score='"+sumscore+"' where id='"+id+"'";
            st.execute(update);
            }
        catch(Exception e){
            System.out.println("Error!"+e.getMessage());
        }
        }
        }else if(!studentanswer.equals(null) && !studentanswer.equals(answer)){
        JOptionPane.showMessageDialog(new JFrame(), "Your score: "+sumscore,"Good Luck!",JOptionPane.ERROR_MESSAGE);
        Home HomeFrame = new Home();
        HomeFrame.setVisible(true);
        HomeFrame.pack();
        HomeFrame.setLocationRelativeTo(null);
        this.dispose();
        User currentUser = UserSession.getInsance().getCurrentUser();
        currentUser.setScore(sumscore);
        int id=currentUser.getId();
                           try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            con = DriverManager.getConnection("jdbc:mysql://localhost/MillionWinner?user=root&password=123456789");
            Statement st = con.createStatement();
            String update = "update user set score='"+sumscore+"' where id='"+id+"'";
            st.execute(update);
            }
        catch(Exception e){
            System.out.println("Error!"+e.getMessage());
        }
        }
        
           
        
        
    // question changes
    questionid++;
    
    //clear radiobutton
    jRadioButton1.setSelected(false);
    jRadioButton2.setSelected(false);
    jRadioButton3.setSelected(false);
    jRadioButton4.setSelected(false);
    }
    
    public void question()
    {
                        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            con = DriverManager.getConnection("jdbc:mysql://localhost/MillionWinner?user=root&password=123456789");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM question where id='"+questionid+"'");
                while(rs.next()){
                    jLabel1.setText(rs.getString("question"));
                    jRadioButton1.setText(rs.getString("option1")); 
                    jRadioButton2.setText(rs.getString("option2"));
                    jRadioButton3.setText(rs.getString("option3"));
                    jRadioButton4.setText(rs.getString("option4"));
                    answer=rs.getString("correctOptionIndex");
                    correct=rs.getInt("questionscore");
                }
                
            }
        catch(Exception e){
            System.out.println("Error!"+e.getMessage());
        }
        }
    
    public python_quiz() {
        initComponents();
        if(questionid==9)
        {
            question();
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
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 217, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        jRadioButton1.setBackground(new java.awt.Color(194, 217, 255));
        jRadioButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(194, 217, 255));
        jRadioButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(194, 217, 255));
        jRadioButton3.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(194, 217, 255));
        jRadioButton4.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(119, 82, 254));
        jButton1.setFont(new java.awt.Font("Showcard Gothic", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 285, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
           {
              jRadioButton2.setSelected(false);
              jRadioButton3.setSelected(false);
              jRadioButton4.setSelected(false);
           }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected())
           {
              jRadioButton1.setSelected(false);
              jRadioButton3.setSelected(false);
              jRadioButton4.setSelected(false);
           }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected())
           {
              jRadioButton1.setSelected(false);
              jRadioButton2.setSelected(false);
              jRadioButton4.setSelected(false);
           }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected())
           {
              jRadioButton1.setSelected(false);
              jRadioButton2.setSelected(false);
              jRadioButton3.setSelected(false);
           }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        checkanswer();
        question();
        if(questionid == 12)
        {
            jButton1.setText("Finish");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(python_quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(python_quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(python_quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(python_quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new python_quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
