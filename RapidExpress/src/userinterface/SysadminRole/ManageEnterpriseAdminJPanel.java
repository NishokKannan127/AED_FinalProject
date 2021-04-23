/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import static Business.Enterprise.Enterprise.EnterpriseType.Delivery;
import static Business.Enterprise.Enterprise.EnterpriseType.FulfillmentCenter;
import static Business.Enterprise.Enterprise.EnterpriseType.HubAndLastMile;
import static Business.Enterprise.Enterprise.EnterpriseType.Vendor;
import Business.Network.Network;
import Business.Organization;
import Business.Role.Customer;
import Business.Role.FirstMileDelivery;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.Role.VendorAdmin;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.FCAdmin;
import static Business.UserAccount.User.Role.HubAndLastMileAdmin;
import static Business.UserAccount.User.Role.VendorAdmin;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.HomePages.TableFormat;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    //private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        //this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.system=EcoSystem.getInstance();
        enterpriseJTable.getTableHeader().setDefaultRenderer(new TableFormat());
        //tblAdminUserName.getTableHeader().setDefaultRenderer(new TableFormat());
        
        populateTable();
       
    }
private boolean checkUserIdExists(String userName) {
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                for (Network network : system.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if(this.system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){//if (enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
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
                        }
                       else {
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
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                
                Object[] row = new Object[6];
                row[0] = enterprise;
                row[1] = enterprise.getEnterpriseType().getValue();
                row[2] = network.getName();
                row[5] = enterprise.getEmail();
  //              row[3] = enterprise.getContact();
                //row[4] = enterprise.getZipcode();
             
                model.addRow(row);
                
            }
        }
    }

//        private void populateAdminTable(Enterprise enterprise1) {
     
//            DefaultTableModel model = (DefaultTableModel) tblAdminUserName.getModel();

//            model.setRowCount(0);
            
            
//            int row2 = enterpriseJTable.getSelectedRow();
//        Enterprise enterprise2 = (Enterprise) enterpriseJTable.getValueAt(row2, 0);
//        EnterpriseType x=enterprise2.getEnterpriseType();
       
            //for (UserAccount user : enterprise1.getUserAccountDirectory().getUserAccountList()) {
//            for(UserAccount user: system.getUserAccountDirectory().getUserAccountList()){
                //if(user.){
               // if(enterprise1.getEnterpriseType()==EnterpriseType.FulfillmentCenter){
                 //   if(()enterprise.)
                

//                enterprise1.
//                Object[] row = new Object[3];
//                row[0] = enterprise;
 //               row[1] = user.getEmployee().getName();
//                row[2] = user.getUsername();
//                model.addRow(row);
                
                
                //}
//            }
//        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAdminName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnCreateAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(139, 216, 189));
        setMinimumSize(new java.awt.Dimension(2000, 1000));
        setPreferredSize(new java.awt.Dimension(2000, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(36, 54, 101));
        jPanel3.setPreferredSize(new java.awt.Dimension(1550, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Admin for Enterprise");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1510, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 70));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel3.setBackground(new java.awt.Color(36, 54, 101));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Admin");
        jLabel3.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enterprise:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtName.setEnabled(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Admin Name:");

        txtAdminName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAdminName.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUserName.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.setEnabled(false);

        btnCreateAdmin.setBackground(new java.awt.Color(36, 54, 101));
        btnCreateAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAdmin.setText("Create Admin");
        btnCreateAdmin.setBorder(null);
        btnCreateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 380, 400));

        enterpriseJTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Enterprise Type", "Network", "Zipcode", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setGridColor(new java.awt.Color(0, 0, 0));
        enterpriseJTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        enterpriseJTable.setRowHeight(30);
        enterpriseJTable.setShowVerticalLines(false);
        enterpriseJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterpriseJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 900, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAdminActionPerformed
        
        int selectedRow = enterpriseJTable.getSelectedRow();
        
        if(txtAdminName.getText().isEmpty())
        {
        txtAdminName.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtAdminName.setForeground(Color.red);
        } 
        
        if(txtUserName.getText().isEmpty())
        {
        txtUserName.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtUserName.setForeground(Color.red);
        } 
        
        if(txtPassword.getText().isEmpty())
        {
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtPassword.setForeground(Color.red);
        } 
        
        
        if (selectedRow < 0){
            //JOptionPane.showMessageDialog(null, "Please select a row to Process" ,"Warning" , JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> to process! </I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            
            return;
        }
        
        else if (txtUserName.getText().isEmpty() || txtAdminName.getText().isEmpty() || txtPassword.getText().isEmpty()    )
        {
           //JOptionPane.showMessageDialog(null, "All fields are mandatory!","Warning",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><h2><I>All fields are</I><font color='red'> mandatory</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        
        else if (!checkUserIdExists(txtUserName.getText())){
            txtUserName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUserName.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><h2><I>User name</I><font color='red'> already</font> present!</h2></html>"),"Warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
         
        else if (txtPassword.getText().length() < 4 ){
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPassword.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Password</I></font> should be<font color='green'> more than 4 digit!</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Password should be more than 4 characters","Warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
        
        
        
        else    
        {
        
        String username = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());
       
        //Employee employee = enterprise.getEmployeeDirectory().createEmployee(txtAdminName.getText()); 
        int row = enterpriseJTable.getSelectedRow();
        Enterprise enterprise2 = (Enterprise) enterpriseJTable.getValueAt(row, 0);
        EnterpriseType x=enterprise2.getEnterpriseType();
//        Delivery("Delivery"),
//        FulfillmentCenter("FulfillmentCenter"),
//        HubAndLastMile("HubAndLastMile"),
//        Vendor("Vendor");
        UserAccount account=null;
        if(x==EnterpriseType.Vendor){
            //account = enterprise.getUserAccountDirectory().createUserAccount(username,username,username, password, User.Role.Vendor);
            account=system.getUserAccountDirectory().createUserAccount(username, username,username, password,User.Role.VendorAdmin, enterprise2);
            
        }
        else if(x==EnterpriseType.Delivery){
            //account = enterprise.getUserAccountDirectory().createUserAccount(username,username,username, password, DeliveryManager);
            account=system.getUserAccountDirectory().createUserAccount(username, username,username, password,User.Role.DeliveryAdmin,enterprise2);
        }
        else if(x==EnterpriseType.FulfillmentCenter){
            //account = enterprise.getUserAccountDirectory().createUserAccount(username,username,username, password, FCAdmin);
            account=system.getUserAccountDirectory().createUserAccount(username, username,username, password,User.Role.FCAdmin,enterprise2);
        }
        else if(x==EnterpriseType.HubAndLastMile){
            //account = enterprise.getUserAccountDirectory().createUserAccount(username,username,username, password, HubAndLastMileAdmin);
            account=system.getUserAccountDirectory().createUserAccount(username, username,username, password,User.Role.HubAndLastMileAdmin,enterprise2);
        }
        
        //Customer("Customer"),
        //Vendor("Vendor"),
        //Dock("Dock"),
        //FCAdmin("FCAdmin"),
        //FMDelivery("FMDelivery"),
        //HubAdmin("HubAdmin"),       
        //LMAdmin("LMAdmin"),
        //LMDelivery("LMDelivery"),
        //PickAndPack("PickAndPack"),
        //Recieve("Recieve"),
        //Stow("Stow"),
        //SysAdmin("SysAdmin"),
        //DeliveryManager("DeliveryManager");
        
        
        //UserAccount c2 = system.getUserAccountDirectory().createUserAccount("Customer", "C2", "c2", "c", User.Role.Customer);
//        ((Customer)(c2.getUser())).setAddress(add2);
//        UserAccount vAdm1 = system.getUserAccountDirectory().createUserAccount("AppleAcc", "C1", "ap", "a", User.Role.Vendor);
//        ((VendorAdmin)(vAdm1.getUser())).setVendor(v1);
//        UserAccount vAdm2 = system.getUserAccountDirectory().createUserAccount("SamsungAcc", "C1", "sa", "s", User.Role.Vendor);
//        ((VendorAdmin)(vAdm2.getUser())).setVendor(v2);
//        UserAccount del1 = system.getUserAccountDirectory().createUserAccount("Del1", "d1", "d1", "d1", User.Role.FMDelivery);
//        ((FirstMileDelivery)(del1.getUser())).setDelivery(del);
//        UserAccount del2 = system.getUserAccountDirectory().createUserAccount("Del2", "d2", "d2", "d2", User.Role.FMDelivery);
//        ((FirstMileDelivery)(del2.getUser())).setDelivery(del);
//        UserAccount del3 = system.getUserAccountDirectory().createUserAccount("Del3", "d3", "d3", "d3", User.Role.FMDelivery);
//        ((FirstMileDelivery)(del3.getUser())).setDelivery(del);
//        UserAccount del4 = system.getUserAccountDirectory().createUserAccount("Del4", "d4", "d4", "d4", User.Role.FMDelivery);
//        ((FirstMileDelivery)(del4.getUser())).setDelivery(del);        
//        UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount("Del4", "d4", "dm", "dm", User.Role.DeliveryManager);
//        User qq = managerDel1.getUser();
//        ManagerFMDeliveryMenAdmin temp=((ManagerFMDeliveryMenAdmin)(qq));
//        temp.setDelivery(del);
        
        
        //populateAdminTable(enterprise);
        
        //populateAdminTable(enterprise);
          
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2>New Admin<font color='green'><I> credentials</I></font> created!</h2></html>"));
        
        dB4OUtil.storeSystem(system);
        
          txtAdminName.setText("");
          txtUserName.setText(account.getUsername());
          txtPassword.setText(account.getPassword());
          txtName.setText("");  
          txtAdminName.setEnabled(false);
          txtUserName.setEnabled(false);
          txtPassword.setEnabled(false);
          txtName.setEnabled(false);  
        }
             
        
    }//GEN-LAST:event_btnCreateAdminActionPerformed

    private void enterpriseJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseJTableMouseClicked
        // TODO add your handling code here:
        int row = enterpriseJTable.getSelectedRow();
        if (row < 0) {
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> Table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            
            //JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Enterprise enterprise2 = (Enterprise) enterpriseJTable.getValueAt(row, 0);
        enterprise = enterprise2 ;

       txtName.setText(enterprise2.getName());
       txtAdminName.setEnabled(true);
       txtUserName.setEnabled(true);
       txtPassword.setEnabled(true);
       
       //populateAdminTable(enterprise2);
        
    }//GEN-LAST:event_enterpriseJTableMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAdmin;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
