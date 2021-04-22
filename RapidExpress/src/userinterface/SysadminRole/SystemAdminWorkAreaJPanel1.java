/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole;

import userinterface.SysadminRole.Customer.Create_CustomerJPanel;
import userinterface.SysadminRole.Customer.Delete_CustomerJPanel;
import userinterface.SysadminRole.Customer.Update_CustomerJPanel;
import Business.UserAccount.User.Role;
import javax.swing.JPanel;
import userinterface.SysadminRole.Dock.Create_DockManJPanel;
import userinterface.SysadminRole.Dock.Delete_DockManJPanel;
import userinterface.SysadminRole.Dock.Update_DockManJPanel;
import userinterface.SysadminRole.FC.Create_FCManJPanel;
import userinterface.SysadminRole.FC.Delete_FCManJPanel;
import userinterface.SysadminRole.FC.Update_FCManJPanel;
import userinterface.SysadminRole.FMDelivery.Create_FMDeliveryJPanel;
import userinterface.SysadminRole.FMDelivery.Delete_FMDeliveryJPanel;
import userinterface.SysadminRole.FMDelivery.Update_FMDeliveryJPanel;
import userinterface.SysadminRole.Hub.Create_HubManJPanel;
import userinterface.SysadminRole.Hub.Delete_HubManJPanel;
import userinterface.SysadminRole.Hub.Update_HubManJPanel;
import userinterface.SysadminRole.LM.Create_LM;
import userinterface.SysadminRole.LM.Delete_LM;
import userinterface.SysadminRole.LM.Update_LM;
import userinterface.SysadminRole.LMDelivery.Create_LMDeliveryJPanel;
import userinterface.SysadminRole.LMDelivery.Delete_LMDeliveryJPanel;
import userinterface.SysadminRole.LMDelivery.Update_LMDeliveryJPanel;
import userinterface.SysadminRole.PickAndPack.Create_PickAndPackManJPanel;
import userinterface.SysadminRole.PickAndPack.Delete_PickAndPackManJPanel;
import userinterface.SysadminRole.PickAndPack.Update_PickAndPackManJPanel;
import userinterface.SysadminRole.Recieve.Create_RecieveJPanel;
import userinterface.SysadminRole.Recieve.Delete_RecieveJPanel;
import userinterface.SysadminRole.Recieve.Update_RecieveJPanel;
import userinterface.SysadminRole.Stow.Create_StowManJPanel;
import userinterface.SysadminRole.Stow.Delete_StowManJPanel;
import userinterface.SysadminRole.Stow.Update_StowManJPanel;
import userinterface.SysadminRole.VendorRole.Create_VendorAdminJPanel;
import userinterface.SysadminRole.VendorRole.Delete_VendorAdminJPanel;
import userinterface.SysadminRole.VendorRole.Update_VendorAdminJPanel;

/**
 *
 * @author nisho
 */
public class SystemAdminWorkAreaJPanel1 extends javax.swing.JPanel {
    
    private JPanel activePanel=null;

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel1() {
        initComponents();
        //person= new BasicInformation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(139, 216, 189));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "DeliveryMen", "DockMen", "FirstMileDeliveryMen", "FulfillmentCenterAdmins", "HubAdmins", "LastMileAdmins", "LastMileDevlieryMen", "PickAndPackMen", "RecieveMen", "StowMen", "VendorAdmins" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(36, 54, 101));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("System Admin Dashboard");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage User type");

        createButton.setBackground(new java.awt.Color(255, 102, 102));
        createButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.setBorder(null);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 102, 102));
        updateButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 102, 102));
        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(255, 102, 102));
        viewButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View All");
        viewButton.setBorder(null);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(474, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {createButton, deleteButton, updateButton, viewButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createButton, deleteButton, updateButton, viewButton});

    }// </editor-fold>//GEN-END:initComponents
//Customer, DeliveryMen, DockMen, FirstMileDeliveryMen, FulfillmentCenterAdmins, HubAdmins, LastMileAdmins, LastMileDevlieryMen, PickAndPackMen, RecieveMen, StowMen, SysAdmins, VendorAdmins
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String type = jComboBox1.getSelectedItem().toString();
            if(activePanel!=null) remove(activePanel);
        revalidate();
        repaint();
        if(type.equals("Customer")){
            activePanel = new Create_CustomerJPanel();
        }
        else if(type.equals("DeliveryMen")){
            activePanel = new Create_CustomerJPanel();
        }
        else if(type.equals("DockMen")){
            activePanel = new Create_DockManJPanel();
        }
        else if(type.equals("FirstMileDeliveryMen")){
            activePanel = new Create_FMDeliveryJPanel();
        }
        else if(type.equals("FulfillmentCenterAdmins")){
            activePanel = new Create_FCManJPanel();
        }
        else if(type.equals("HubAdmins")){
            activePanel = new Create_HubManJPanel();
        }
        else if(type.equals("LastMileAdmins")){
            activePanel = new Create_LM();
        }
        else if(type.equals("LastMileDelveryMen")){
            activePanel = new Create_LMDeliveryJPanel();
        }
        else if(type.equals("PickAndPackMen")){
            activePanel = new Create_PickAndPackManJPanel();
        }
        else if(type.equals("RecieveMen")){
            activePanel = new Create_RecieveJPanel();
        }
        else if(type.equals("StowMen")){
            activePanel = new Create_StowManJPanel();
        }
        //else if(type.equals("Sys Admins")){
        //    activePanel = new Create_VendorAdminJPanel();
        //}
        else if(type.equals("VendorAdmins")){
            activePanel = new Create_VendorAdminJPanel();
        }
        //else if(type.equals("Vendor")){
        //    activePanel = new Create_CustomerJPanel();
        //}
        activePanel.setBounds(230, 30, 273, 196);
        activePanel.setSize(400, 300);
        this.add(activePanel);
        revalidate();
    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String type = jComboBox1.getSelectedItem().toString();
        if(activePanel!=null) remove(activePanel);
        revalidate();
        repaint();
        if(type.equals("Customer")){
            activePanel = new Update_CustomerJPanel();
        }
        else if(type.equals("DeliveryMen")){
            activePanel = new Update_CustomerJPanel();
        }
        else if(type.equals("DockMen")){
            activePanel = new Update_DockManJPanel();
        }
        else if(type.equals("FirstMileDeliveryMen")){
            activePanel = new Update_FMDeliveryJPanel();
        }
        else if(type.equals("FulfillmentCenterAdmins")){
            activePanel = new Update_FCManJPanel();
        }
        else if(type.equals("HubAdmins")){
            activePanel = new Update_HubManJPanel();
        }
        else if(type.equals("LastMileAdmins")){
            activePanel = new Update_LM();
        }
        else if(type.equals("LastMileDelveryMen")){
            activePanel = new Update_LMDeliveryJPanel();
        }
        else if(type.equals("PickAndPackMen")){
            activePanel = new Update_PickAndPackManJPanel();
        }
        else if(type.equals("RecieveMen")){
            activePanel = new Update_RecieveJPanel();
        }
        else if(type.equals("StowMen")){
            activePanel = new Update_StowManJPanel();
        }
     //   else if(type.equals("SysAdmins")){
     //       activePanel = new Update_CustomerJPanel();
     //   }
        else if(type.equals("VendorAdmins")){
            activePanel = new Update_VendorAdminJPanel();
        }
        else if(type.equals("Vendor")){
            activePanel = new Update_CustomerJPanel();
        }
        activePanel.setBounds(230, 30, 273, 196);
        activePanel.setSize(400, 300);
        this.add(activePanel);
        revalidate();
        activePanel.setBounds(230, 30, 273, 196);
        activePanel.setSize(400, 300);
        this.add(activePanel);
        revalidate();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String type = jComboBox1.getSelectedItem().toString();
        if(activePanel!=null) remove(activePanel);
        revalidate();
        repaint();
        if(type.equals("Customer")){
            activePanel = new Delete_CustomerJPanel();
        }
        else if(type.equals("DeliveryMen")){
            activePanel = new Delete_CustomerJPanel();
        }
        else if(type.equals("DockMen")){
            activePanel = new Delete_DockManJPanel();
        }
        else if(type.equals("FirstMileDeliveryMen")){
            activePanel = new Delete_FMDeliveryJPanel();
        }
        else if(type.equals("FulfillmentCenterAdmins")){
            activePanel = new Delete_FCManJPanel();
        }
        else if(type.equals("HubAdmins")){
            activePanel = new Delete_HubManJPanel();
        }
        else if(type.equals("LastMileAdmins")){
            activePanel = new Delete_LM();
        }
        else if(type.equals("LastMileDelveryMen")){
            activePanel = new Delete_LMDeliveryJPanel();
        }
        else if(type.equals("PickAndPackMen")){
            activePanel = new Delete_PickAndPackManJPanel();
        }
        else if(type.equals("RecieveMen")){
            activePanel = new Delete_RecieveJPanel();
        }
        else if(type.equals("StowMen")){
            activePanel = new Delete_StowManJPanel();
        }
      //  else if(type.equals("SysAdmins")){
      //      activePanel = new Delete_CustomerJPanel();
      //  }
        else if(type.equals("VendorAdmins")){
            activePanel = new Delete_VendorAdminJPanel();
        }
        else if(type.equals("Vendor")){
            activePanel = new Delete_CustomerJPanel();
        }
        activePanel.setBounds(230, 30, 273, 196);
        activePanel.setSize(400, 300);
        this.add(activePanel);
        revalidate();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
//Customer, DeliveryMen, DockMen, FirstMileDeliveryMen, FulfillmentCenterAdmins, HubAdmins, LastMileAdmins, LastMileDevlieryMen, PickAndPackMen, RecieveMen, StowMen, SysAdmins, VendorAdmins        
        if(activePanel!=null) remove(activePanel);
        revalidate();
        repaint();
        String type = jComboBox1.getSelectedItem().toString();
        if(type.equals("Customer")){
            activePanel = new viewJPanel(Role.Customer);
        }
       // else if(type.equals("DeliveryMen")){
       //     activePanel = new viewJPanel(Role.);
       // }
       // else if(type.equals("Delivery Men")){
       // activePanel = new viewJPanel(Role.DeliveryMan);
       // }
        else{
          activePanel = new viewJPanel(null);  
        }
        
        activePanel.setBounds(230, 30, 273, 196);
        activePanel.setSize(400, 300);
        this.add(activePanel);
        
        revalidate();
        
    }//GEN-LAST:event_viewButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
