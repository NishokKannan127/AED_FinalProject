/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole.AdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.DirectDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.Organization.FulfillmentByRapidExpressOrganization;
import Business.EnterpriseFulfillmentCenter.Organization.InboundOrganization;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.EnterpriseVendor.Organization.SupplyChainOrganization;
import Business.EnterpriseVendor.Vendor;
import Business.Network.Network;
import Business.Organization;
import static Business.Organization.VendorEnt.SupplyChainOrganization;
import Business.Role.DirectDelivery;
import Business.Role.FirstMileDelivery;
import Business.Role.LastMileDelivery;
import Business.Role.ManagerDirectDeliveryMenAdmin;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.Role.ManagerLMDeliveryMenAdmin;
import Business.Role.Rolellllll;
import Business.Role.VendorManager;
import Business.UserAccount.User;
import Business.UserAccount.User.Role;
import static Business.UserAccount.User.Role.DirectDelivery;
import static Business.UserAccount.User.Role.DirectDeliveryManager;
import static Business.UserAccount.User.Role.FMDelivery;
import static Business.UserAccount.User.Role.FMDeliveryManager;
import static Business.UserAccount.User.Role.LMDelivery;
import static Business.UserAccount.User.Role.LMDeliveryManager;
import static Business.UserAccount.User.Role.VendorManager;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.HomePages.TableFormat;

/**
 *
 * @author Administrator
 */
public class Create_DeliveryAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private Delivery delivery;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Organization orgg=null;
    
    
    public Create_DeliveryAdmin(JPanel container, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.delivery=(Delivery)enterprise;
        this.container = container;
        this.system = system;
        this.system=EcoSystem.getInstance();

        enterpriseNameTextField1.setText(enterprise.getName());
        popOrganizationComboBox();
        //populateRoleComboBox();
//        userJTable.getTableHeader().setDefaultRenderer(new TableFormat());
//        popData();
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

//        EcoSystem.getInstance().getDeliveryDirectory().createDelivery(name, add)
        //for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
        for(Organization organization : this.delivery.getDirDeliveryOrgDir().geDirDeliveryOrganizationList()){// getSuppChOrgDir().getSupplyChainOrganizationList()){// getOrganizationDirectory().getOrganizationList()){
            organizationJComboBox.addItem(organization);
            orgg=organization;
            //organization.Type.
        }
        for(Organization organization : this.delivery.getFirstDeliveryOrgDir().geFMDeliverytOrganizationList()){// getSuppChOrgDir().getSupplyChainOrganizationList()){// getOrganizationDirectory().getOrganizationList()){
            organizationJComboBox.addItem(organization);
            orgg=organization;
            //organization.Type.
        }
        for(Organization organization : this.delivery.getLastDeliveryOrgDir().geLMDeliverytOrganizationList()){// getSuppChOrgDir().getSupplyChainOrganizationList()){// getOrganizationDirectory().getOrganizationList()){
            organizationJComboBox.addItem(organization);
            orgg=organization;
            //organization.Type.
        }
    }
    
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        //if (organization)
        if (organization instanceof DirectDeliveryOrganization) {
            for(Role role:((DirectDeliveryOrganization) organization).getSupportedRole()){                
                roleJComboBox.addItem(role);
            }
        }
        else if (organization instanceof FirstMileDeliveryOrganization) {
            for(Role role:((FirstMileDeliveryOrganization) organization).getSupportedRole()){                
                roleJComboBox.addItem(role);
            }
        }
        else if (organization instanceof LastMileDeliveryOrganization) {
            for(Role role:((LastMileDeliveryOrganization) organization).getSupportedRole()){                
                roleJComboBox.addItem(role);
            }
        }
        
        
 //       fcJComboBox.removeAllItems();
        
        

   //     for (FulfillmentCenter fc : EcoSystem.getInstance().getFcDirectory().getFulfillmentCenterList()) {
    //        fcJComboBox.addItem(fc);
    //    }
        
    }

//    public void popData() {

//        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

//        model.setRowCount(0);

//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
//                Object row[] = new Object[3];
//                row[1] = ua.getRole();
//                row[2] = ua;
//            //    row[2] = ua.getUsername();
//                ((DefaultTableModel) userJTable.getModel()).addRow(row);
//            }
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nameSeparator = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        nameSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        createUserJButton = new javax.swing.JButton();
        lastNameJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        nameJTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nameSeparator4 = new javax.swing.JSeparator();
        enterpriseNameTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(139, 216, 189));
        setMinimumSize(new java.awt.Dimension(1500, 1020));
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 70, 50));

        jPanel3.setBackground(new java.awt.Color(36, 54, 101));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Users");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 746, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1830, -1));

        jPanel2.setBackground(new java.awt.Color(255, 87, 87));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(36, 54, 101));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Employee Credentials");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Last Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, 21));

        nameSeparator.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(nameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 370, 10));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 60, 26));

        nameSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(nameSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 370, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Organization");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        organizationJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        organizationJComboBox.setBorder(null);
        organizationJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                organizationJComboBoxItemStateChanged(evt);
            }
        });
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Role");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 20));

        roleJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 160, 20));

        createUserJButton.setBackground(new java.awt.Color(36, 54, 101));
        createUserJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(255, 255, 255));
        createUserJButton.setText("Create");
        createUserJButton.setBorder(null);
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 110, 35));

        lastNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastNameJTextField.setBorder(null);
        jPanel2.add(lastNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, 20));

        passwordJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordJTextField.setBorder(null);
        jPanel2.add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Username");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 70, 21));

        nameJTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameJTextField1.setBorder(null);
        jPanel2.add(nameJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("First Name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 21));

        firstNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstNameJTextField.setBorder(null);
        jPanel2.add(firstNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 390, 470));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enterprise:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 30));

        nameSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(nameSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 260, 10));

        enterpriseNameTextField1.setBackground(new java.awt.Color(139, 216, 189));
        enterpriseNameTextField1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        enterpriseNameTextField1.setBorder(null);
        enterpriseNameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseNameTextField1ActionPerformed(evt);
            }
        });
        add(enterpriseNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 230, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 130, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
    
        
        if(organizationJComboBox.getSelectedItem().equals(null))
        {organizationJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            organizationJComboBox.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Please select an Organization");
        }
                  
         else if(roleJComboBox.getSelectedItem().equals(null))
        {roleJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            roleJComboBox.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Please select a Role");
        }
           
        else if (lastNameJTextField.getText().isEmpty()) {
             lastNameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            lastNameJTextField.setForeground(Color.red);
            
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2>User Name<font color='red'> can not </font>be empty!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                   
            //JOptionPane.showMessageDialog(null, "Username cannot be empty");
            //return;
        }
        
         else if (passwordJTextField.getText().length() < 4 ){
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordJTextField.setForeground(Color.red);
            
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'> Password</font> must be atleast 4 digits!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                   
            //JOptionPane.showMessageDialog(null, "Password should be more than 4 Digit");
            //return;
        
        }
         else if (!checkUserIdExists(nameJTextField1.getText())){
            
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2>User Name<font color='red'> already present!</font></h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                   
             //JOptionPane.showMessageDialog(null, "UserName Already Present","Warning",JOptionPane.WARNING_MESSAGE);
            //return;
            }
         else{
        String firstName = firstNameJTextField.getText();
        String lastName = lastNameJTextField.getText();
        String userName = nameJTextField1.getText();
        String password = passwordJTextField.getText();
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
//        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();
 //       Enterprise ent = organization.
        
        //nish start
        
            if(role==Role.FMDeliveryManager){
            UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount(firstName, lastName, userName, password, User.Role.FMDeliveryManager);
            User qq = managerDel1.getUser();
            ManagerFMDeliveryMenAdmin temp=((ManagerFMDeliveryMenAdmin)(qq));
            temp.setDelivery(delivery);// setVendor(vendor);
            ((FirstMileDeliveryOrganization)organization).addFMDeliveryManager(temp);// addVendorManager(temp);// addFMDeliveryManager(temp);            
        }
            else if(role==Role.LMDeliveryManager){
            UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount(firstName, lastName, userName, password, User.Role.LMDeliveryManager);
            User qq = managerDel1.getUser();
            ManagerLMDeliveryMenAdmin temp=((ManagerLMDeliveryMenAdmin)(qq));
            temp.setDelivery(delivery);
            ((LastMileDeliveryOrganization)organization).addLMDeliveryManager(temp);// addVendorManager(temp);// addFMDeliveryManager(temp);            
        }
            else if(role==Role.DirectDeliveryManager){
            UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount(firstName, lastName, userName, password, User.Role.DirectDeliveryManager);
            User qq = managerDel1.getUser();
            ManagerDirectDeliveryMenAdmin temp=((ManagerDirectDeliveryMenAdmin)(qq));
            temp.setDelivery(delivery);
            ((DirectDeliveryOrganization)organization).addDirDeliveryManager(temp);// addVendorManager(temp);// addFMDeliveryManager(temp);            
        }
            else if(role==Role.FMDelivery){
            UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount(firstName, lastName, userName, password, User.Role.FMDelivery);
            User qq = managerDel1.getUser();
            FirstMileDelivery temp=((FirstMileDelivery)(qq));
            temp.setDelivery(delivery);
            ((FirstMileDeliveryOrganization)organization).addFMDeliveryMent(temp);// addVendorManager(temp);// addFMDeliveryManager(temp);            
        }
            else if(role==Role.LMDelivery){
            UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount(firstName, lastName, userName, password, User.Role.LMDelivery);
            User qq = managerDel1.getUser();
            LastMileDelivery temp=((LastMileDelivery)(qq));
            temp.setDelivery(delivery);
            ((LastMileDeliveryOrganization)organization).addLMDeliveryMent(temp);// addVendorManager(temp);// addFMDeliveryManager(temp);            
        }
            else if(role==Role.DirectDelivery){
            UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount(firstName, lastName, userName, password, User.Role.DirectDelivery);
            User qq = managerDel1.getUser();
            DirectDelivery temp=((DirectDelivery)(qq));
            temp.setDelivery(delivery);
            ((DirectDeliveryOrganization)organization).addDirectDeliveryMent(temp); //addVendorManager(temp);// addFMDeliveryManager(temp);            
        }
//        else if(role==Role.){
//            UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount(firstName, lastName, userName, password, User.Role.FMDeliveryManager);
//            User qq = managerDel1.getUser();
//            ManagerFMDeliveryMenAdmin temp=((ManagerFMDeliveryMenAdmin)(qq));
//            ((FirstMileDeliveryOrganization)organization).addFMDeliveryManager(temp);
//        }
        //nish end
        
//        organization.getUserAccountDirectory().createUserAccount(firstName,lastName,userName, password, role);
  
        
        
//        popData();
        
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2>User Account<font color='green'> created successfully!</font></h2></html>") );//, "Error", JOptionPane.ERROR_MESSAGE);
                   
        //JOptionPane.showMessageDialog(null, "User account for " + userName + " created Successfully");

         dB4OUtil.storeSystem(system);
        
        
        lastNameJTextField.setText("");
        passwordJTextField.setText("");
      //  organizationJComboBox.removeItem(organizationJComboBox.getSelectedItem());
       //  employeeJComboBox.removeItem(employeeJComboBox.getSelectedItem());
       //  if(employeeJComboBox.getSelectedItem()== null){
         //    organizationJComboBox.removeItem(organizationJComboBox.getSelectedItem());
        // }
      //  roleJComboBox.removeItem(roleJComboBox.getSelectedItem());
         }
        
    }//GEN-LAST:event_createUserJButtonActionPerformed
private boolean checkUserIdExists(String userName) {
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                for (Network network : system.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (this.system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                               //if(authenticateUser(userName)){
                            if (enterprise.getOrganizationDirectory().getOrganizationList().size() > 0) {
                                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                    if (organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                                        return true;

                                    } else {
                                        return false;
                                    }

                                }
                            } else {
                                return true;
                            }
                        } else {
                            return false;

                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return false;
    }
    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            //populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void organizationJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_organizationJComboBoxItemStateChanged
        // TODO add your handling code here:
        
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
//        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

//        model.setRowCount(0);

        
        for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[3];
                //row[0] = ua.getEmployee();
                row[1] = ua.getRole();
                row[2] = ua;
            //    row[2] = ua.getUsername();
//                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
    }//GEN-LAST:event_organizationJComboBoxItemStateChanged

    private void enterpriseNameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseNameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextField1ActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createUserJButton;
    private javax.swing.JTextField enterpriseNameTextField1;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JTextField nameJTextField1;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JSeparator nameSeparator1;
    private javax.swing.JSeparator nameSeparator4;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    // End of variables declaration//GEN-END:variables
}
