/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole;

import Business.Network.Network;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.DirectDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.Organization.InboundOrganization;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.EnterpriseVendor.Organization.SupplyChainOrganization;
import Business.EnterpriseVendor.Vendor;
import Business.Network.Network;
import Business.POJO.Address;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.HomePages.TableFormat;
import static userinterface.SysadminRole.ManageEnterpriseJPanel.emailValidator;
import static userinterface.SysadminRole.ManageEnterpriseJPanel.phoneNumberValidator;
import static userinterface.SysadminRole.ManageEnterpriseJPanel.zipCodeValidator;


/**
 *
 * @author nisho
 */
public class Create_Vendor extends javax.swing.JPanel {

    /**
     * Creates new form ManageVendor
     */
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public Create_Vendor(EcoSystem system) {
        initComponents();
    populateNetworkComboBox();
        //populateFCComboBox();
    }
private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();
        
        for (Network network : EcoSystem.getInstance().getNetworkList()) {
            networkJComboBox.addItem(network);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        btnCreateEnterprise = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(139, 216, 189));
        setMinimumSize(new java.awt.Dimension(2000, 1000));
        setPreferredSize(new java.awt.Dimension(2000, 1000));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jPanel2.setForeground(new java.awt.Color(204, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(36, 54, 101));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Create Vendor");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 408, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Network:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 163, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 163, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel2.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 163, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Zipcode:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtZipCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 163, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Location:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtLocation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel2.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 163, 20));

        btnCreateEnterprise.setBackground(new java.awt.Color(36, 54, 101));
        btnCreateEnterprise.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateEnterprise.setText("Create Vendor");
        btnCreateEnterprise.setBorder(null);
        btnCreateEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEnterpriseActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 120, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("City:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Area:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 163, 20));

        txtArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });
        jPanel2.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 163, 20));

        jPanel3.setBackground(new java.awt.Color(36, 54, 101));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Manage Enterprise");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1570, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnCreateEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEnterpriseActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        String check1 = "";
Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Vendor;
        if(networkJComboBox.getSelectedItem().equals(null)){

            //JOptionPane.showMessageDialog(null, "Select a Network Please!");
            networkJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            networkJComboBox.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Select a<font color='red'> Network</font> please!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            check1 = "no";
        }

        

        if(txtName.getText().isEmpty())
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtName.setForeground(Color.red);
        }

        if(txtContact.getText().isEmpty())
        {
            txtContact.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtContact.setForeground(Color.red);
        }
        if(txtLocation.getText().isEmpty())
        {
            txtLocation.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtLocation.setForeground(Color.red);
        }
        if(txtZipCode.getText().isEmpty())
        {
            txtZipCode.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtZipCode.setForeground(Color.red);
        }

        if(txtName.getText().isEmpty() || txtContact.getText().isEmpty() || txtLocation.getText().isEmpty() || txtZipCode.getText().isEmpty()
            || network == null ){
            //JOptionPane.showMessageDialog(null, "All fields are mandatory!");
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><h2><I>All fields are</I><font color='red'> compulsary</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

            check1 = "no";
            //return;
        }

        else   if ( !phoneNumberValidator(txtContact.getText())  ){
            //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit " , "Error", JOptionPane.ERROR_MESSAGE);
            check1 = "no";
            txtContact.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtContact.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Contact Number</I></font> should be<font color='green'> 10 digit</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

            //    return;
        }

        else   if (  !zipCodeValidator(txtZipCode.getText()) ){
            //JOptionPane.showMessageDialog(null, " Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
            check1 = "no";
            txtZipCode.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtZipCode.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Zip</I></font> should be<font color='green'> 5 digit</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

            //  return;
        }

     //   else   if ( !emailValidator(txtEmail.getText()) ){
            //JOptionPane.showMessageDialog(null, "Email ID must be in correct format!" , "Error", JOptionPane.ERROR_MESSAGE);
     //       check1 = "no";
     //       txtLocation.setBorder(BorderFactory.createLineBorder(Color.RED));
     //       txtLocation.setForeground(Color.red);
     //       JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Email ID</I></font> must be in<font color='green'> correct format</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

            //return;
     //   }

        else {

            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (ent.getName().equals(txtName.getText())) {
                    JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Enterprise Name</I></font><font color='red'> already exists</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                    check1 = "no";
                    txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
                    txtName.setForeground(Color.red);
                    return;
                }
            }

            // the main process after validation checks-
            if(check1.equals(""))
            {
                String name = txtName.getText();
                Long contact = Long.parseLong(txtContact.getText());
                //state, String city, String area, String location
                String city=txtCity.getText();
                String area=txtArea.getText();
                String location=txtLocation.getText();
                String state=network.getState();//network.getCountry();
                Address add = new Address(state,city,area,location);
 //               Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type,add, contact);
 //               enterprise.setContact( (Long.parseLong(txtContact.getText())));
                //enterprise.setZipcode(Integer.parseInt(txtZipCode.getText()));
 //               enterprise.setEmail(txtLocation.getText());

                
                    Vendor v1 = EcoSystem.getInstance().getVendorDirectory().createVendor(name, add, contact);
                    network.addEnterpriseToNetwork(v1);

                    SupplyChainOrganization suppChainOrg1;
                    suppChainOrg1=v1.addSupplyChainOrgToDir(name+" - Supply Chain Org", v1);
               

                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>New Enterprise</I><font color='green'> created </font><I>successfully!/I<></h2></html>"));

                //JOptionPane.showMessageDialog(null, "New Enterprise Created Successfully!");

                dB4OUtil.storeSystem(EcoSystem.getInstance());

                txtName.setText("");
                txtContact.setText("");
                txtZipCode.setText("");
                txtLocation.setText("");

            }}
    }//GEN-LAST:event_btnCreateEnterpriseActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEnterprise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
