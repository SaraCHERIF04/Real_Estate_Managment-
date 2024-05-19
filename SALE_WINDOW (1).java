
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amina
 */
public class SALE_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form SALE_WINDOW
     */
    public SALE_WINDOW() {
        initComponents();
         fillJtableProperties();
         fillJtableClient();
         fillJtableSale();
        // set border to the button
        //populate the jtable with sale data 
            jTable_Properties.setRowHeight(40);
        // change the jtable selection background 
        jTable_Properties.setSelectionBackground( Color.GREEN);
            jTable_Clients.setRowHeight(40);
        // change the jtable selection background 
        jTable_Clients.setSelectionBackground( Color.GREEN);
        jTable_Sales.setRowHeight(40);
        // change the jtable selection background 
        jTable_Sales.setSelectionBackground( Color.GREEN);
        
        
    }


public void fillJtableProperties() {
    P_PROPERTY property = new P_PROPERTY();
    ArrayList<P_PROPERTY> propertyList = property.propertiesList(); // Changed from 'properties.propertiesList()'

    // Define the JTable columns
    String[] colNames = {"ID", "Owner Id", "Price"};

    // Create a 2D array to hold the data for the JTable rows
    Object[][] rows = new Object[propertyList.size()][3];

    // Add data from the list to the rows
    for (int i = 0; i < propertyList.size(); i++) {
        rows[i][0] = propertyList.get(i).getId();
        rows[i][1] = propertyList.get(i).getOwnerId();
        rows[i][2] = propertyList.get(i).getPrice();
    }

    // Create a DefaultTableModel with the data and column names
    DefaultTableModel model = new DefaultTableModel(rows, colNames);

    // Set the model for the jTable_Properties
    jTable_Properties.setModel(model);
}
public void fillJtableSale() {
    ArrayList<P_SALE> salesList = salesList(); 
    // Define the column names for the JTable
    String[] colNames = {"ID", "Property","Owner", "Price"};

    // Create a 2D array to hold the data for the JTable rows
    Object[][] rows = new Object[salesList.size()][4];

    // Populate the rows with data from the client list
    for (int i = 0; i < salesList.size(); i++) {
            rows[i][0]=salesList.get(i).getId();
            rows[i][1]=salesList.get(i).getPropertyId();            
            rows[i][2]=salesList.get(i).getClientId();
            rows[i][3]=salesList.get(i).getFinalPrice();
    }

    // Create a DefaultTableModel with the data and column names
    DefaultTableModel model = new DefaultTableModel(rows, colNames);

    // Set the model for the client JTable
    jTable_Sales.setModel(model);
}
public void fillJtableClient() {
    ArrayList<P_CLIENT> clientsList = getClientsList(); 
    // Define the column names for the JTable
    String[] colNames = {"ID", "Owner ID", "Price"};

    // Create a 2D array to hold the data for the JTable rows
    Object[][] rows = new Object[clientsList.size()][3];

    // Populate the rows with data from the client list
    for (int i = 0; i < clientsList.size(); i++) {
            rows[i][0]=clientsList.get(i).getId();
            rows[i][1]=clientsList.get(i).getOwnerId();
            rows[i][2]=clientsList.get(i).getPrice();
    }

    // Create a DefaultTableModel with the data and column names
    DefaultTableModel model = new DefaultTableModel(rows, colNames);

    // Set the model for the client JTable
    jTable_Clients.setModel(model);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jButton_Edit_Owner = new javax.swing.JButton();
        jButton_Add_Owner = new javax.swing.JButton();
        jButton_Remove_Owner = new javax.swing.JButton();
        jTextField_FinalPrice = new javax.swing.JTextField();
        jTextField_PropertyID = new javax.swing.JTextField();
        jTextField_ClientID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Properties = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Clients = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Sales = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 150, 100)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sales");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(519, 519, 519)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Property ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("   ID:");

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jButton_Edit_Owner.setBackground(new java.awt.Color(255, 255, 0));
        jButton_Edit_Owner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_Owner.setText("Edit");
        jButton_Edit_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_OwnerActionPerformed(evt);
            }
        });

        jButton_Add_Owner.setBackground(new java.awt.Color(204, 51, 255));
        jButton_Add_Owner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Owner.setText("Add");
        jButton_Add_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_OwnerActionPerformed(evt);
            }
        });

        jButton_Remove_Owner.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Owner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Owner.setText("Remove");
        jButton_Remove_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_OwnerActionPerformed(evt);
            }
        });

        jTextField_FinalPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_FinalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FinalPriceActionPerformed(evt);
            }
        });

        jTextField_PropertyID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_PropertyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PropertyIDActionPerformed(evt);
            }
        });

        jTextField_ClientID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_ClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ClientIDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Final Price:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Client ID:");

        jTable_Properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_PropertiesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Properties);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Properties List : ");

        jTable_Clients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClientsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Clients);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Clients List : ");

        jTable_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SalesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_Sales);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Sales : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(188, 188, 188))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                                .addComponent(jTextField_FinalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField_PropertyID, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField_ClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(10, 10, 10)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextField_PropertyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jTextField_ClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField_FinalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(478, 478, 478))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_PropertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_PropertiesMouseClicked

        int selectedRowIndex = jTable_Properties.getSelectedRow();
        jTextField_Id.setText(jTable_Properties.getValueAt(selectedRowIndex,0).toString());
        jTextField_PropertyID.setText(jTable_Properties.getValueAt(selectedRowIndex,1).toString());
        jTextField_FinalPrice.setText(jTable_Properties.getValueAt(selectedRowIndex,2).toString());
    }//GEN-LAST:event_jTable_PropertiesMouseClicked

    private void jTextField_ClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ClientIDActionPerformed
        int selectedRowIndex = jTable_Clients.getSelectedRow();
        jTextField_Id.setText(jTable_Clients.getValueAt(selectedRowIndex,0).toString());
        
        
        
    }//GEN-LAST:event_jTextField_ClientIDActionPerformed

    private void jTextField_PropertyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PropertyIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PropertyIDActionPerformed

    private void jTextField_FinalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FinalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FinalPriceActionPerformed

    private void jButton_Remove_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_OwnerActionPerformed

        int id =Integer.valueOf(jTextField_Id.getText());
       if(new P_SALE().deleteSaleData(id)){
           JOptionPane.showMessageDialog(null,"A new data deleted ","Delete sale",1);
       }
       else {
           JOptionPane.showMessageDialog(null,"Error deleting a new data ","Delete sale",2);

       }
    }//GEN-LAST:event_jButton_Remove_OwnerActionPerformed

    private void jButton_Add_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_OwnerActionPerformed

        int id =Integer.valueOf(jTextField_Id.getText());
        String finalprice =jTextField_FinalPrice.getText();
        int clientid =Integer.valueOf(jTextField_ClientID.getText());
        int propertyid =Integer.valueOf(jTextField_PropertyID.getText());
       P_SALE sale = new P_SALE (0,propertyid,clientid,finalprice);
       if(new P_SALE().addNewSale(sale)){
           JOptionPane.showMessageDialog(null,"A new sale added ","Add sale",1);
       }
       else {
           JOptionPane.showMessageDialog(null,"Error adding a new sale ","Add sale",2);

       }
    }//GEN-LAST:event_jButton_Add_OwnerActionPerformed

    private void jButton_Edit_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_OwnerActionPerformed

        int id =Integer.valueOf(jTextField_Id.getText());
        String finalprice =jTextField_FinalPrice.getText();
        int clientid =Integer.valueOf(jTextField_ClientID.getText());
        int propertyid =Integer.valueOf(jTextField_PropertyID.getText());
       P_SALE sale = new P_SALE (0,propertyid,clientid,finalprice);
       if(new P_SALE().editSaleData(sale)){
           JOptionPane.showMessageDialog(null,"A new sale edited ","Edit sale",1);
       }
       else {
           JOptionPane.showMessageDialog(null,"Error editing a new sale ","Edit sale",2);

       }
    }//GEN-LAST:event_jButton_Edit_OwnerActionPerformed

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jTable_ClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClientsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_ClientsMouseClicked

    private void jTable_SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SalesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_SalesMouseClicked

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
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALE_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Owner;
    private javax.swing.JButton jButton_Edit_Owner;
    private javax.swing.JButton jButton_Remove_Owner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_Clients;
    private javax.swing.JTable jTable_Properties;
    private javax.swing.JTable jTable_Sales;
    private javax.swing.JTextField jTextField_ClientID;
    private javax.swing.JTextField jTextField_FinalPrice;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_PropertyID;
    // End of variables declaration//GEN-END:variables

private void fillJtablewithOwnersdata() {
    // Your code to populate the JTable with data goes here
    // For example:
    DefaultTableModel model = (DefaultTableModel) jTable_Properties.getModel();
    model.addRow(new Object[]{"1", "John", "Doe", "123-456-7890", "john@example.com", "123 Street, City"});
    model.addRow(new Object[]{"2", "Jane", "Doe", "456-789-0123", "jane@example.com", "456 Avenue, Town"});
}

    private ArrayList<P_SALE> salesList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
