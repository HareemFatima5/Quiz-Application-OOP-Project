import QuizApplication.DatabaseConnection; // Importing the DatabaseConnection class
import javax.swing.JOptionPane; // Importing the JOptionPane class for dialog boxes

public class Login extends javax.swing.JFrame {

    // Constructor for the Login class
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        // Initializing components
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        // Setting properties for jButton3
        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Quiz login");

        // Setting properties and action listener for jButton4 (Exit button)
        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        // Setting properties for jLabel2
        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.activeCaption);
        jLabel2.setText("jLabel2");

        // Setting properties for the main window
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Setting properties and action listener for jButton1 (Admin Login button)
        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setForeground(java.awt.SystemColor.activeCaption);
        jButton1.setText("Admin Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 160, 40));

        // Setting properties and action listener for jButton2 (Student Login button)
        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton2.setForeground(java.awt.SystemColor.activeCaption);
        jButton2.setText("Student Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 180, 40));

        // Setting properties and action listener for jButton5 (Exit button)
        jButton5.setBackground(new java.awt.Color(255, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton5.setForeground(java.awt.SystemColor.activeCaption);
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 130, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 410));

        // Setting properties for jLabel6 (background image)
        jLabel6.setBackground(new java.awt.Color(255, 204, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacground.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>                        

    // Action listener for jButton4 (Exit button)
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Placeholder for exit button action
    }                                        

    // Action listener for jButton5 (Exit button)
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Confirm exit and close application if yes is selected
        int a = JOptionPane.showConfirmDialog(null, "Do you want to exit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }                                        

    // Action listener for jButton1 (Admin Login button)
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Navigate to Admin Login page
        setVisible(false);
        new Loginpage().setVisible(true);
    }                                        

    // Action listener for jButton2 (Student Login button)
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Navigate to Student Login page
        setVisible(false);
        new loginCreateaccount().setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        // Initialize database connection
        DatabaseConnection.getCon();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1; // Admin Login button
    private javax.swing.JButton jButton2; // Student Login button
    private javax.swing.JButton jButton3; // Placeholder button (Quiz login)
    private javax.swing.JButton jButton4; // Placeholder button (Exit)
    private javax.swing.JButton jButton5; // Exit button
    private javax.swing.JLabel jLabel1; // Placeholder label
    private javax.swing.JLabel jLabel2; // Placeholder label
    private javax.swing.JLabel jLabel3; // Placeholder label
    private javax.swing.JLabel jLabel6; // Background image label
    // End of variables declaration                   
}
