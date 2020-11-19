
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danu
 */
public class SecurityForm extends javax.swing.JFrame {

    /**
     * Creates new form SecurityForm
     */
    public SecurityForm() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchVehicalTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        addNewVehicalBtn = new javax.swing.JButton();
        searchVehicalBtn = new javax.swing.JButton();
        parkIntBtn = new javax.swing.JButton();
        checkBtn = new javax.swing.JButton();
        vehicalTypeCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        slotLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(669, 500));

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));

        jPanel2.setBackground(new java.awt.Color(19, 15, 64));

        jLabel1.setBackground(new java.awt.Color(214, 48, 49));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 48, 49));
        jLabel1.setText("The Sunrise Shopping Complex Parking System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        searchVehicalTxt.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        backBtn.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        nextBtn.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        nextBtn.setForeground(new java.awt.Color(255, 0, 0));
        nextBtn.setText("Get Out");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        addNewVehicalBtn.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        addNewVehicalBtn.setForeground(new java.awt.Color(255, 0, 0));
        addNewVehicalBtn.setText("Add New Vehical");
        addNewVehicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewVehicalBtnActionPerformed(evt);
            }
        });

        searchVehicalBtn.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        searchVehicalBtn.setForeground(new java.awt.Color(56, 56, 56));
        searchVehicalBtn.setText("Search Vehical Number");
        searchVehicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVehicalBtnActionPerformed(evt);
            }
        });

        parkIntBtn.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        parkIntBtn.setForeground(new java.awt.Color(255, 0, 0));
        parkIntBtn.setText("Park In");
        parkIntBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkIntBtnActionPerformed(evt);
            }
        });

        checkBtn.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        checkBtn.setForeground(new java.awt.Color(56, 56, 56));
        checkBtn.setText("Check");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        vehicalTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Van", "Bus", "Lorry" }));
        vehicalTypeCombo.setSelectedItem(null);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 30, 30));
        jLabel2.setText("(Select Vehical Type to check remaining Slots)");

        slotLbl.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        slotLbl.setForeground(new java.awt.Color(235, 16, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(addNewVehicalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(parkIntBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchVehicalBtn)
                                .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchVehicalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(vehicalTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(slotLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBtn)
                    .addComponent(vehicalTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slotLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchVehicalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchVehicalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewVehicalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parkIntBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(backBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        new MainFrameForm().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addNewVehicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewVehicalBtnActionPerformed
        dispose();
        new AddNewVehicalForm().setVisible(true);
    }//GEN-LAST:event_addNewVehicalBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        dispose();
        new GetOutForm().setVisible(true);
    }//GEN-LAST:event_nextBtnActionPerformed

    private void searchVehicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVehicalBtnActionPerformed
        try {
            VehicalModule vehical = VehicalController.searchVehical(searchVehicalTxt.getText());
            if(vehical!=null){
               JOptionPane.showMessageDialog(this, "This Vehical is Already Added...\nPress Park In Button To Continue...");
               searchVehicalTxt.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "This Vehical is Not Added Yet...\nPress Add New Vehical Button To Continue...");
                searchVehicalTxt.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Driver not found...");
        }
    }//GEN-LAST:event_searchVehicalBtnActionPerformed

    private void parkIntBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkIntBtnActionPerformed
        dispose();
        new ParkRejisterForm().setVisible(true);
    }//GEN-LAST:event_parkIntBtnActionPerformed

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        String vehicalType = (String) vehicalTypeCombo.getSelectedItem();
        
        if("Car".equals(vehicalType)){
            try {
             ArrayList<SlotsModule>slotsList= VehicalController.getAllItem();
                slotsList.stream().map(item -> item.getCar()).forEachOrdered(x -> {
                    slotLbl.setText(String.valueOf(x));
                });

         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Car Slots Not Exists");
         } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(this, "Driver not found...");
         }
        }
        
         if("Van".equals(vehicalType)){
            try {
             ArrayList<SlotsModule>slotsList= VehicalController.getAllItem();
                slotsList.stream().map(item -> item.getVan()).forEachOrdered(x -> {
                    slotLbl.setText(String.valueOf(x));
                });

         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Van Slots Not Exists");
         } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(this, "Driver not found...");
         }
        }
         
         if("Bus".equals(vehicalType)){
            try {
             ArrayList<SlotsModule>slotsList= VehicalController.getAllItem();
                slotsList.stream().map(item -> item.getBus()).forEachOrdered(x -> {
                    slotLbl.setText(String.valueOf(x));
                });

         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Bus Slots Not Exists");
         } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(this, "Driver not found...");
         }
        }
        
         if("Lorry".equals(vehicalType)){
            try {
             ArrayList<SlotsModule>slotsList= VehicalController.getAllItem();
                slotsList.stream().map(item -> item.getLorry()).forEachOrdered(x -> {
                    slotLbl.setText(String.valueOf(x));
                });

         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Lorry Slots Not Exists");
         } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(this, "Driver not found...");
         }
        }
    }//GEN-LAST:event_checkBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SecurityForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecurityForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewVehicalBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton checkBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton parkIntBtn;
    private javax.swing.JButton searchVehicalBtn;
    private javax.swing.JTextField searchVehicalTxt;
    private javax.swing.JLabel slotLbl;
    private javax.swing.JComboBox<String> vehicalTypeCombo;
    // End of variables declaration//GEN-END:variables
}
