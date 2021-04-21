/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole;

import Business.EcoSystem;
import Business.UserAccount.User;
import Business.UserAccount.User.Role;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class viewJPanel extends javax.swing.JPanel {

    Role role;

    public viewJPanel(Role role) {
        initComponents();
        setPreferredSize( new Dimension(180, 180) );
        this.role = role;
        populateList();
    }
    public viewJPanel(){
        initComponents();
        
    }
    
    void populateList(){
        //if(role==null){
        //    List<Restaurant> list = EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList();
        //    for(Restaurant r : list){
        //        resultText.append("ID: "+r.getId()+" | "+" Name: "+r.getName()+" | "+" Location: "+r.getLocation()+" | "+" Type: "+r.getRestaurantType()+" | "+" Phone number: "+r.getBookingPhoneNumber()+"\n");
        //    }
        //}
        if(role==Role.Customer){
            ArrayList<UserAccount> list = EcoSystem.getInstance().getUserAccountDirectory().getUserAccountList();
            for(UserAccount u : list){
                if(u.getRole()==role.Customer)
                    resultText.append("ID: "+u.getAccountId()+" | "+"Username: "+u.getUsername()+" | "+" Password: "+u.getPassword()+"\n");
            }
        }
        //else if(role==Role.Manager){
        //    ArrayList<UserAccount> list = EcoSystem.getInstance().getUserAccountDirectory().getUserAccountList();
        //    for(UserAccount u : list){
        //        if(u.getRole()==role.Manager)
        //            resultText.append("ID: "+u.getAccountId()+" | "+"Username: "+u.getUsername()+" | "+" Password: "+u.getPassword()+"\n");
        //   }
        //}
        //else if(role==Role.DeliveryMan){
        //    ArrayList<UserAccount> list = EcoSystem.getInstance().getUserAccountDirectory().getUserAccountList();
        //    for(UserAccount u : list){
        //        if(u.getRole()==role.DeliveryMan)
        //            resultText.append("ID: "+u.getAccountId()+" | "+"Username: "+u.getUsername()+" | "+" Password: "+u.getPassword()+"\n");
        //    }
        
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
        resultText = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(139, 216, 189));
        setMaximumSize(new java.awt.Dimension(2000, 1000));
        setPreferredSize(new java.awt.Dimension(1500, 1000));

        resultText.setEditable(false);
        resultText.setColumns(20);
        resultText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        resultText.setRows(5);
        jScrollPane1.setViewportView(resultText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultText;
    // End of variables declaration//GEN-END:variables
}
