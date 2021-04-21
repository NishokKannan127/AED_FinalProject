/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole.AdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Delivery;
import static Business.Enterprise.Enterprise.EnterpriseType.FulfillmentCenter;
import static Business.Enterprise.Enterprise.EnterpriseType.HubAndLastMile;
import Business.Organization;
import Business.Organization.DeliveryEnt;
import Business.Organization.FulfillmentCenterEnt;
import Business.Organization.HubAndLastMileEnt;
import Business.Organization.VendorEnt;
import Business.Organizations.OrganizationDirectory;
import static Business.UserAccount.User.Role.VendorAdmin;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.HomePages.TableFormat;



public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory, Enterprise enterprise, EcoSystem system ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;
        this.system = system;
        this.system=EcoSystem.getInstance();
        organizationJTable.getTableHeader().setDefaultRenderer(new TableFormat());
        enterpriseNameTextField1.setText(enterprise.getName());
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
       // for (Type type : Organization.Type.values()){
        //    if (!type.getValue().equals(Type.Admin.getValue()))
        //        organizationJComboBox.addItem(type);
       // }
       
       System.out.println(enterprise.getEnterpriseType());
       //System.out.println(enterprise.getEnterpriseType().toString().equals(PlasmaBank.toString()));
       
       //Delivery("Delivery"),
       //FulfillmentCenter("FulfillmentCenter"),
       //HubAndLastMile("HubAndLastMile"),
       //Vendor
                
       if(enterprise.getEnterpriseType().toString().equals(Delivery.toString())){
        for(Organization.DeliveryEnt delType: Organization.DeliveryEnt.values()){
            if (delType.getValue().equals(Organization.DeliveryEnt.FirstMileDeliveryOrg.getValue())){
                organizationJComboBox.addItem(delType);
            }
            else if(delType.getValue().equals(Organization.DeliveryEnt.LastMileDeliveryOrg.getValue())){
                organizationJComboBox.addItem(delType);
            }
        }
        }
       
       else if(enterprise.getEnterpriseType().toString().equals(FulfillmentCenter.toString())){
           System.out.println("1");
        for(Organization.FulfillmentCenterEnt fcType: Organization.FulfillmentCenterEnt.values()){
//            System.out.println("1");
//            System.out.println(plasmaType.getValue());
//            System.out.println(Organization.PlasmaBankType.PlasmaBank.getValue());
            if (fcType.getValue().equals(Organization.FulfillmentCenterEnt.FulfillmentByRapidEx.getValue())){
                organizationJComboBox.addItem(fcType);
            }
            else if (fcType.getValue().equals(Organization.FulfillmentCenterEnt.Inbound.getValue())){
                organizationJComboBox.addItem(fcType);
            }
            else if (fcType.getValue().equals(Organization.FulfillmentCenterEnt.Outbound.getValue())){
                organizationJComboBox.addItem(fcType);
            }
        }
        }
       else if(enterprise.getEnterpriseType().toString().equals(HubAndLastMile.toString())){
        for(Organization.HubAndLastMileEnt hubAndLmType: Organization.HubAndLastMileEnt.values()){
            if (hubAndLmType.getValue().equals(Organization.HubAndLastMileEnt.Hub.getValue())){
                organizationJComboBox.addItem(hubAndLmType);
            }
            else if (hubAndLmType.getValue().equals(Organization.HubAndLastMileEnt.LastMile.getValue())){
                organizationJComboBox.addItem(hubAndLmType);
            }
        }
        }
       else if(enterprise.getEnterpriseType().toString().equals(VendorAdmin.toString())){
        for(Organization.VendorEnt vendorType: Organization.VendorEnt.values()){
            
            if (vendorType.getValue().equals(Organization.VendorEnt.MerchantFulfillment.getValue())){
                organizationJComboBox.addItem(vendorType);
            }
        }
        }
       //else{
       // for (Organization.Type type : Organization.Type.values()){            
       //     if (type.getValue().equals(Organization.Type.SystemCoordinator.getValue())
       //             ||type.getValue().equals(Organization.Type.Doctor.getValue())
       //             ||type.getValue().equals(Organization.Type.Pathologist.getValue())
       //             )
       //         organizationJComboBox.addItem(type);
       // }
       //
       //}
    }
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getName();
            row[1] = organization.getRealName();
            
            model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        panel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOrgRealName = new javax.swing.JTextField();
        nameSeparator = new javax.swing.JSeparator();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        nameSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameSeparator4 = new javax.swing.JSeparator();
        enterpriseNameTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(139, 216, 189));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBackground(new java.awt.Color(0, 0, 0));
        organizationJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        organizationJTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(255, 255, 255));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Type", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setGridColor(new java.awt.Color(0, 0, 0));
        organizationJTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        organizationJTable.setRowHeight(30);
        organizationJTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 400, 370));

        panel1.setBackground(new java.awt.Color(255, 87, 87));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        panel1.setPreferredSize(new java.awt.Dimension(250, 400));
        panel1.setRequestFocusEnabled(false);
        panel1.setVerifyInputWhenFocusTarget(false);
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(36, 54, 101));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Organization");
        jLabel3.setOpaque(true);
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name of Organization");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 26));

        txtOrgRealName.setBackground(new java.awt.Color(0, 0, 0));
        txtOrgRealName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtOrgRealName.setForeground(new java.awt.Color(255, 255, 255));
        txtOrgRealName.setBorder(null);
        txtOrgRealName.setCaretColor(new java.awt.Color(30, 59, 92));
        txtOrgRealName.setOpaque(false);
        txtOrgRealName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOrgRealNameFocusGained(evt);
            }
        });
        txtOrgRealName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgRealNameActionPerformed(evt);
            }
        });
        panel1.add(txtOrgRealName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 330, 30));

        nameSeparator.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(nameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 330, 10));

        organizationJComboBox.setBackground(new java.awt.Color(0, 0, 0));
        organizationJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        organizationJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        panel1.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 330, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Organization Type ");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, -1));

        addJButton.setBackground(new java.awt.Color(36, 54, 101));
        addJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addJButton.setForeground(new java.awt.Color(255, 255, 255));
        addJButton.setText("Add Organization");
        addJButton.setBorder(null);
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        panel1.add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, 40));

        nameSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(nameSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 330, 10));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 46));

        add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 400, 460));

        jPanel3.setBackground(new java.awt.Color(36, 54, 101));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel5.setBackground(new java.awt.Color(36, 54, 101));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Organization");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1656, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enterprise:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        nameSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(nameSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 270, 10));

        enterpriseNameTextField1.setBackground(new java.awt.Color(255, 87, 87));
        enterpriseNameTextField1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        enterpriseNameTextField1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseNameTextField1.setBorder(null);
        enterpriseNameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseNameTextField1ActionPerformed(evt);
            }
        });
        add(enterpriseNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 260, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/organization.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 120, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        String check1 = "";    
        
        if (txtOrgRealName.getText().isEmpty()) {
            txtOrgRealName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtOrgRealName.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Organization Name<font color='red'> can not </font>be empty!/I<></h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                   

            //JOptionPane.showMessageDialog(null, "Organization name cannot be empty!");
            check1 = "do not go further!";
            return;
        }

        
        for (Organization organization : directory.getOrganizationList()) {

            if (organization.getName().equals(txtOrgRealName.getText())) {
                
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Organization name</I><font color='red'> already</font><I> exists!/I<></h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                   
                //JOptionPane.showMessageDialog(null, "Organization name already exists!");
                check1 = "do not go further!";
                return;
            }
        }

// Main Process after validation checks
//Delivery("Delivery"),
       //FulfillmentCenter("FulfillmentCenter"),
       //HubAndLastMile("HubAndLastMile"),
       //Vendor
       
       
        if(check1.equals("")){
        if(enterprise.getEnterpriseType().toString().equals(Delivery.toString())){
//            directory. createLegalOrganization((DeliveryEnt)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText());
            directory.createDeliveryOrganization((DeliveryEnt)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText(), (Business.EnterpriseDelivery.Delivery) enterprise);
        }
        else if(enterprise.getEnterpriseType().toString().equals(FulfillmentCenter.toString())){
            directory.createFulfillmentCenterOrganization((FulfillmentCenterEnt)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText(),(Business.EnterpriseFulfillmentCenter.FulfillmentCenter) enterprise);
        }
        else if(enterprise.getEnterpriseType().toString().equals(HubAndLastMile.toString())){
            directory.createHubLastMileOrganization((HubAndLastMileEnt)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText(),(Business.EnterpriseHubAndLastMile.HubAndLastMile) enterprise);
        }
        else if(enterprise.getEnterpriseType().toString().equals(VendorAdmin.toString())){
            directory.createVendorOrganization((VendorEnt)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText(),(Business.EnterpriseVendor.Vendor) enterprise);
        }
//        else{
            
//        Type type = (Type) organizationJComboBox.getSelectedItem();
//        directory.createOrganization(type, txtOrgRealName.getText());
//        }
        populateTable();
        
        
       JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>A new Organization</I><font color='green'> created </font><I>successfully!/I<></h2></html>"));
                   
        //JOptionPane.showMessageDialog(null, "Organization created successfully!");
        
        
        dB4OUtil.storeSystem(system);
        
        
        txtOrgRealName.setText("");
        organizationJComboBox.removeItem(organizationJComboBox.getSelectedItem());
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtOrgRealNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrgRealNameFocusGained
        // TODO add your handling code here:
        txtOrgRealName.setText("");
    }//GEN-LAST:event_txtOrgRealNameFocusGained

    private void txtOrgRealNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgRealNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgRealNameActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void enterpriseNameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseNameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JTextField enterpriseNameTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JSeparator nameSeparator1;
    private javax.swing.JSeparator nameSeparator4;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txtOrgRealName;
    // End of variables declaration//GEN-END:variables
}
