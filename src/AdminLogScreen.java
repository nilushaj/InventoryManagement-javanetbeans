import java.sql.*;
import javax.swing.JOptionPane;



public class AdminLogScreen extends javax.swing.JFrame {

    
    public AdminLogScreen() {
       
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnllogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnlog = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        btnlogexit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Log In");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frmlogin"); // NOI18N

        pnllogin.setBackground(java.awt.SystemColor.inactiveCaption);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setText("User ID     :");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setText("Password :");

        txtusername.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btnlog.setBackground(java.awt.SystemColor.textHighlight);
        btnlog.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnlog.setMnemonic('1');
        btnlog.setText("Log In");
        btnlog.setToolTipText("");
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });

        txtpassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btnlogexit.setBackground(java.awt.SystemColor.textHighlight);
        btnlogexit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnlogexit.setMnemonic('2');
        btnlogexit.setText("Exit");
        btnlogexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlloginLayout = new javax.swing.GroupLayout(pnllogin);
        pnllogin.setLayout(pnlloginLayout);
        pnlloginLayout.setHorizontalGroup(
            pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlloginLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlloginLayout.createSequentialGroup()
                        .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtpassword))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlloginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(btnlog)
                        .addGap(18, 18, 18)
                        .addComponent(btnlogexit)
                        .addGap(48, 48, 48))))
        );
        pnlloginLayout.setVerticalGroup(
            pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlloginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlog)
                    .addComponent(btnlogexit))
                .addGap(27, 27, 27))
        );

        jLabel3.setBackground(java.awt.SystemColor.activeCaption);
        jLabel3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin-icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(pnllogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel3)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnllogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogActionPerformed
        
        
        
        
        boolean b=false;
           if(txtusername.getText().equals("")&& txtpassword.getText().equals(""))
           {
           
               JOptionPane.showMessageDialog( null,"Please Enter UserID/Password!");
               
           }
           else{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampathstores","root","123");
            Statement stmt=con.createStatement();
            String strsql="Select * from adminfl";
            ResultSet rs=stmt.executeQuery(strsql);
           
               
           
           
            while(rs.next())
            {
              String uid=rs.getString("User_ID");
              String up=rs.getString("Password");
                
              if(txtusername.getText().equals(uid)&& txtpassword.getText().equals(up))
              {
                  b=true;
              }
              }
            if(b==true)
            {
        String userid=txtusername.getText();
        new Home(userid).setVisible(true);
        this.setVisible(false);
                
                
            }
            else
            {   
                JOptionPane.showMessageDialog( null,"User ID Or Passwerd is Invalid");
                txtpassword.setText("");
            }
            
            
   
             }
            
         
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog( null,"Connection Error!!");
          
        }
       
        
           }
    }//GEN-LAST:event_btnlogActionPerformed

    private void btnlogexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogexitActionPerformed
                this.setVisible(false);
                new Usertype().setVisible(true);
    }//GEN-LAST:event_btnlogexitActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlog;
    private javax.swing.JButton btnlogexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnllogin;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
