import java.awt.HeadlessException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PROPERTY_TYPE_WINDOW extends javax.swing.JFrame {
    /**
     * Creates new form PROPERTY_TYPE_WINDOW
     */
    public PROPERTY_TYPE_WINDOW() {
        initComponents();
        fillTypeList();
    }
//creat a function to populate the Jlist using the type hashmap
public void fillTypeList() {
    P_TYPE type = new P_TYPE();
    HashMap<String, Integer> map = type.getTypeMap(); 
    
    DefaultTableModel tableModel = (DefaultTableModel) jList1.getModel();
//We assume that jList1 is already initialized with a DefaultTableModel
// We cast jList1.getModel() to DefaultTableModel so that we can manipulate its data.
    tableModel.setRowCount(0); // Clear existing rows
    
    for(String typename : map.keySet()) {//We iterate through the map and add rows to the table model using tableModel.addRow(new Object[] {typename}).
        tableModel.addRow(new Object[] {typename});
    }
}

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_Id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JTable();
        jButton_Edit_Type = new javax.swing.JButton();
        jButton_Add_Type = new javax.swing.JButton();
        jButton_Remove_Type = new javax.swing.JButton();
        jButton_Refresh_Type = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 180, 180));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 130, 130)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property Type");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(529, 529, 529)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Description:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("ID:");

        jTextField_Name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        jList1.setModel(new javax.swing.table.DefaultTableModel(
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
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jButton_Edit_Type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_Type.setText("Edit");
        jButton_Edit_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_TypeActionPerformed(evt);
            }
        });

        jButton_Add_Type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Type.setText("Add");
        jButton_Add_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_TypeActionPerformed(evt);
            }
        });

        jButton_Remove_Type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Type.setText("Remove");
        jButton_Remove_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_TypeActionPerformed(evt);
            }
        });

        jButton_Refresh_Type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refresh_Type.setText("Refresh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Name)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Add_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jButton_Edit_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jButton_Remove_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jButton_Refresh_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Id))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Add_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Remove_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Edit_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Refresh_Type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jButton_Edit_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_TypeActionPerformed
       try {
            Integer id = Integer.valueOf(jTextField_Id.getText());
        String name = jTextField_Name.getText();
        String description = jTextArea_Description.getText();
        P_TYPE type = new P_TYPE (id,name,description);
        if(!name.trim().equals(""))//if the name is not empty 
        {
        if (type.execTypeQuery("edit", type )){
                    JOptionPane.showMessageDialog(null,"Type Udapted","Edit Type",1);
        }else {
         JOptionPane.showMessageDialog(null,"Operation failed ","Edit Type",2);//error when i click on the add button "com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure"
         //
        } 
        }
        else {
                JOptionPane.showMessageDialog(null,"Enter the type Name" ,"Empty Name",2);
                }

       }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()+"enter a valid type ID" ,"Inavalid ID",0);
       }
    }//GEN-LAST:event_jButton_Edit_TypeActionPerformed

    private void jButton_Add_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_TypeActionPerformed
        String name = jTextField_Name.getText();
        String description = jTextArea_Description.getText();
        P_TYPE type = new P_TYPE (0,name,description);
        if(!name.trim().equals(""))//if the name is not empty 
        {
        if (type.execTypeQuery("add", type )){
                    JOptionPane.showMessageDialog(null,"New Type Added","Add Type",1);
        }else {
         JOptionPane.showMessageDialog(null,"Operation Failed","Add Type",2);//error when i click on the add button "com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure"
         //

        }
        }
        else {
                JOptionPane.showMessageDialog(null,"Enter the type Name" ,"Empty Name",2);
                }
    }//GEN-LAST:event_jButton_Add_TypeActionPerformed

    private void jButton_Remove_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_TypeActionPerformed
      //remove the selected type 
     try{
      Integer id = Integer.valueOf(jTextField_Id.getText());
        P_TYPE type = new P_TYPE (id,"","");
        if(!jTextField_Id.getText().trim().equals(""))//if the tyoe id is not empty 
        {
            int yes_or_no = JOptionPane.showConfirmDialog(null,"Do you want to delete the type","Delete Type" ,JOptionPane.YES_NO_OPTION);
            if (yes_or_no ==JOptionPane.YES_OPTION){
                    if (type.execTypeQuery("remove", type )){
                    JOptionPane.showMessageDialog(null,"Type Deleted ","Delete Type",1);
        }else {
         JOptionPane.showMessageDialog(null,"Operation failed ","Delete Type",2);//error when i click on the add button "com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure"
         //
        } 
        }
        }
            else { 
                JOptionPane.showMessageDialog(null,"Enter the type ID" ,"Deleted Type",2);
                }
    }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()+"enter a valid type ID" ,"Inavalid ID",0);
       }
    }//GEN-LAST:event_jButton_Remove_TypeActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
    P_TYPE type = new P_TYPE(); 
    HashMap<String, Integer> map = type.getTypeMap(); 
    
    // Get the selected row index
    int selectedIndex = jList1.getSelectedRow();
    
    // Check if a row is actually selected
    if (selectedIndex != -1) {
        // Get the type ID associated with the selected row
        Integer typeId = map.get(jList1.getValueAt(selectedIndex, 0).toString());
        
        // Get the type information by ID
        type = type.getTypeById(typeId); 
        
        // Update the text fields with type information
        jTextField_Id.setText(String.valueOf(type.getId()));
        jTextField_Name.setText(type.getName()); 
        jTextArea_Description.setText(type.getDescription());  
    }                               
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_TYPE_WINDOW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Type;
    private javax.swing.JButton jButton_Edit_Type;
    private javax.swing.JButton jButton_Refresh_Type;
    private javax.swing.JButton jButton_Remove_Type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Name;
    // End of variables declaration//GEN-END:variables
}
