/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole;

/**
 *
 * @author DELL
 */

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    boolean a= true;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    EcoSystem ecosystem;
    
    public SystemAdminWorkAreaJPanel(EcoSystem ecosystem) {
        initComponents();
        this.ecosystem=ecosystem;
        this.ecosystem=EcoSystem.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    public void changeimage(JLabel button, String resourcecheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcecheimg));
        button.setIcon(aimg);
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        
        if(dashboard == true){
            
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
        }
        
        else{
            
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
            
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        panelSysadminControl = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        BtnManageNetwork = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        BtnManageEnterprise = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        BtnManageAuthentication = new javax.swing.JLabel();
        panelSysadminWorkContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(36, 54, 101));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(2100, 2100));
        setPreferredSize(new java.awt.Dimension(1500, 1000));

        menu.setPreferredSize(new java.awt.Dimension(270, 500));

        panelSysadminControl.setBackground(new java.awt.Color(36, 54, 101));
        panelSysadminControl.setMinimumSize(new java.awt.Dimension(120, 270));
        panelSysadminControl.setPreferredSize(new java.awt.Dimension(100, 270));
        panelSysadminControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 87, 87));

        BtnManageNetwork.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageNetwork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageNetwork.setText("Manage Network");
        BtnManageNetwork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageNetworkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(BtnManageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnManageNetwork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelSysadminControl.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 30));

        jPanel9.setBackground(new java.awt.Color(255, 87, 87));

        BtnManageEnterprise.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageEnterprise.setText("Manage Enterprise");
        BtnManageEnterprise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageEnterpriseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnManageEnterprise)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnManageEnterprise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelSysadminControl.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 30));

        jPanel10.setBackground(new java.awt.Color(255, 87, 87));

        BtnManageAuthentication.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnManageAuthentication.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageAuthentication.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageAuthentication.setText("Manage Authentication");
        BtnManageAuthentication.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageAuthentication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageAuthenticationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnManageAuthentication, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnManageAuthentication, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelSysadminControl.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 30));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSysadminControl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addComponent(panelSysadminControl, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelSysadminWorkContainer.setBackground(new java.awt.Color(139, 216, 189));
        panelSysadminWorkContainer.setForeground(new java.awt.Color(255, 255, 255));
        panelSysadminWorkContainer.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1357, Short.MAX_VALUE)
                .addComponent(panelSysadminWorkContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(479, Short.MAX_VALUE))
            .addComponent(panelSysadminWorkContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnManageNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageNetworkMouseClicked
        // TODO add your handling code here:
        ManageNetworkJPanel manageNetwork = new ManageNetworkJPanel(ecosystem);
        panelSysadminWorkContainer.add("ManageNetworkJPanel",manageNetwork);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnManageNetworkMouseClicked

    private void BtnManageAuthenticationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageAuthenticationMouseClicked
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEntAuth = new ManageEnterpriseAdminJPanel(panelSysadminWorkContainer,ecosystem);
        panelSysadminWorkContainer.add("ManageEnterpriseAdminJPanel",manageEntAuth);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnManageAuthenticationMouseClicked

    private void BtnManageEnterpriseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageEnterpriseMouseClicked
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterprise = new ManageEnterpriseJPanel(ecosystem);
        panelSysadminWorkContainer.add("ManageEnterpriseJPanel",manageEnterprise);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnManageEnterpriseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnManageAuthentication;
    private javax.swing.JLabel BtnManageEnterprise;
    private javax.swing.JLabel BtnManageNetwork;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelSysadminControl;
    private javax.swing.JPanel panelSysadminWorkContainer;
    // End of variables declaration//GEN-END:variables
}
