/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package millionwinner;

/**
 *
 * @author user
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        LogoutBtn = new javax.swing.JButton();
        WelcomeText = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        ScoreValue = new javax.swing.JLabel();
        ScoreText = new javax.swing.JLabel();
        showScoreboardBtn = new javax.swing.JButton();
        StartBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 4, 130));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(194, 217, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        LogoutBtn.setBackground(new java.awt.Color(119, 82, 254));
        LogoutBtn.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogoutBtn.setText("LogOut");
        LogoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        WelcomeText.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        WelcomeText.setForeground(new java.awt.Color(0, 0, 0));
        WelcomeText.setText("Welcome!");

        usernameLabel.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setText("User");

        ScoreValue.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        ScoreValue.setForeground(new java.awt.Color(0, 0, 0));
        ScoreValue.setText("0");

        ScoreText.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        ScoreText.setForeground(new java.awt.Color(0, 0, 0));
        ScoreText.setText("Scroe:");

        showScoreboardBtn.setBackground(new java.awt.Color(119, 82, 254));
        showScoreboardBtn.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        showScoreboardBtn.setForeground(new java.awt.Color(0, 0, 0));
        showScoreboardBtn.setText("Scoreboard");
        showScoreboardBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showScoreboardBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showScoreboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showScoreboardBtnActionPerformed(evt);
            }
        });

        StartBtn.setBackground(new java.awt.Color(119, 82, 254));
        StartBtn.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        StartBtn.setForeground(new java.awt.Color(0, 0, 0));
        StartBtn.setText("Start");
        StartBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ExitBtn.setBackground(new java.awt.Color(119, 82, 254));
        ExitBtn.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(0, 0, 0));
        ExitBtn.setText("Exit");
        ExitBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScoreText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScoreValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 309, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(WelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showScoreboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(345, 345, 345))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScoreText)
                    .addComponent(ScoreValue))
                .addGap(90, 90, 90)
                .addComponent(WelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameLabel)
                .addGap(18, 18, 18)
                .addComponent(StartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showScoreboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void showScoreboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showScoreboardBtnActionPerformed
        scoreboard scoreboardFrame = new scoreboard();
        scoreboardFrame.setVisible(true);
        scoreboardFrame.pack();
        scoreboardFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_showScoreboardBtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        User currentUser = UserSession.getInsance().getCurrentUser();
        usernameLabel.setText(currentUser.getUsername());
        String ScoreText = String.valueOf(currentUser.getScore());
        ScoreValue.setText(ScoreText);
    }//GEN-LAST:event_formWindowActivated



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JLabel ScoreText;
    private javax.swing.JLabel ScoreValue;
    private javax.swing.JButton StartBtn;
    private javax.swing.JLabel WelcomeText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton showScoreboardBtn;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
