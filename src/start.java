
import drone.cab_agent;
import drone.drone;
import drone.travel_agent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import traveller_package.choices;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D C NIKITHA
 */
public class start extends javax.swing.JFrame {
        
    public login form2 = new login();
    
    /**
     * Creates new form start
     */
    public start() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mainpasswordfield = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        jLabel1.setText("SMART CITY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("MADE BY:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel3.setText("D C Nikitha");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("1610110109");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Enter password to login");

        mainpasswordfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mainpasswordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainpasswordfieldActionPerformed(evt);
            }
        });

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5)
                        .addGap(77, 77, 77)
                        .addComponent(mainpasswordfield, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)))
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)))
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mainpasswordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pass = new String();
        pass ="smartcity";
        
        //start form1 = new start();
        //JPasswordField mainpasswordfield = new JPasswordField();
         String pwd = new String(mainpasswordfield.getPassword());
         //char[] password= this.mainpasswordfield.getPassword();
        
        //char[] password = mainpasswordfield.getPassword();
        //String passi = password.toString();
        System.out.println(pwd+" "+pass);
        if(pass.equals(pwd))       
        {
            form2.setVisible(true);
            this.setVisible(false);
            drone d1;
            
            try
            {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/final_project","root","dcn@2098"); 
                System.out.println("Conected sucessfully");
                Statement stat =(Statement) con.createStatement(); 
                
                String query = "SELECT * FROM location;"; 
                ResultSet rs = stat.executeQuery(query); 
                 d1 = new travel_agent();
                System.out.println(1);
                while(rs.next())
                {
                    String name = rs.getString("Name");
                    int type = rs.getInt("Type");
                    int typesp = rs.getInt("type_specific");
                    float rating = rs.getFloat("Rating");
                    d1.add_location(name,type,typesp,rating);
                }
                
                /*   
                 d1.add_location("Airport",4,1, (float) 4.5);
                    d1.add_location("railway_station", 4, 2, (float) 4.4);
                    d1.add_location("Ginger hotel",4,3, (float) 4.0);
                    d1.add_location("Surya palace", 4, 3, (float) 4.3);
                    d1.add_location("royal Orchid",4,3,(float) 4.1);
                    d1.add_location("Express Residency",4,3, (float) 4.4);
                    d1.add_location("Kirti Stambh",1,3, (float) 4.4);
                    d1.add_location("Iscon Temple",1,2, (float) 4.5);
                    d1.add_location("22 parallel",2,2, (float) 4.3);
                    d1.add_location("Sursagar Lake",1,3, (float) 4.2);
                    d1.add_location("Sayaji Baug",1,1, (float) 4.4);
                    d1.add_location("Vadodara Central",3,2, (float) 4.2);
                    d1.add_location("Mainland China",2,1, (float) 4.0);
                    d1.add_location("Mirch Masala",1,3, (float) 4.0);
                    d1.add_location("Lakshmi Vilas Palace",1,3, (float) 4.5);
                    d1.add_location("Shree Ram Stores",3,1, (float) 4.4);
                    d1.add_location("Mandap",2,3, (float) 4.3);
                    d1.add_location("Inorbit Mall",3,2, (float) 4.2);
                    d1.add_location("Fiorella",2,2, (float) 4.3);
                    d1.add_location("Mangal Bazar",3,3, (float) 4.0);
                    d1.add_location("Swaminarayan Temple",1,2, (float) 4.6);
                    d1.add_location("Eme Temple",1,2, (float) 4.7);
                    d1.add_location("Mandvi Gate",3,3, (float) 4.2);
                    d1.add_location("Sasuma Gujarati",2,3, (float) 4.0);
                    
                    */
                d1 = new cab_agent("name",5);
                d1.add_edge();
            }
            catch(Exception e)
                    {
                        
                    }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ERROR","Your password is wrong.",JOptionPane.OK_OPTION);
            //form1.setVisible(false);
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mainpasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainpasswordfieldActionPerformed
        





        // TODO add your handling code here:
    }//GEN-LAST:event_mainpasswordfieldActionPerformed

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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField mainpasswordfield;
    // End of variables declaration//GEN-END:variables
}
