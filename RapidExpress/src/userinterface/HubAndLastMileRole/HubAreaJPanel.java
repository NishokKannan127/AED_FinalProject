/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HubAndLastMileRole;

import Business.EcoSystem;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.Organizations.LastMile;
import Business.POJO.FCShipment;
import Business.POJO.Order;
import Business.POJO.Shipment;
import userinterface.FCRole.Outbound.*;
import Business.Role.Dock;
import Business.Role.HubMan;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisho
 */
public class HubAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DockAreaJPanel
     */
    Dock dock;
    //input is List of shipments
    HubAndLastMile hAndLM;
    ArrayList<FCShipment> shipmentList;
    ArrayList<Order>outputOrders;
    HashMap<String,Order> orderForArea;
    HashMap<String,ArrayList<Order>> ordersForArea;
    ArrayList<LastMile> lmList;
    HubMan hubMan;
    ArrayList<HubOrganization> hubOrg;
    ArrayList<LastMileOrganization> lmOrg;
    
    public HubAreaJPanel(HubMan h) {
        initComponents();
        //this.dock=dock;
        this.hAndLM=h.gethAndLM();//EcoSystem.getInstance().gethAndLmDir().getHubAndLastMileList().get(0);
        this.hubMan=h;
        //this.hAndLM.
        this.shipmentList=new ArrayList<FCShipment>();
        this.shipmentList=this.hAndLM.returnShipmentList();
        this.outputOrders=new ArrayList<Order>();
        this.lmList=new ArrayList<LastMile>();
        //hubOrg=hAndLM.getHubList();
        //lmOrg=hAndLM.getLmOrgList();
        orderForArea=new HashMap<String,Order>();
        ordersForArea=new HashMap<String,ArrayList<Order>>();
        //this.lmList=hAndLM.get
            //hAndLM=EcoSystem.getInstance().gethAndLmDir().getHubAndLastMileList().get(0);// getHubList();
        //hubOrg=hAndLM.getHubList();
        //lmOrg=hAndLM.getLmOrgList();
        initializeOrdersFromShipment();
        refreshPage();
    }
    public void initializeOrdersFromShipment(){
        for(int i=0;i<shipmentList.size();i++){
            for(int j=0;j<shipmentList.get(i).getOrderListInShipment().size();j++){
                if(!ordersForArea.containsKey(shipmentList.get(i).getOrderListInShipment().get(j).getCustomer().getAddress().getArea())){
                    ordersForArea.put(shipmentList.get(i).getOrderListInShipment().get(j).getCustomer().getAddress().getArea(), new ArrayList<Order>());
                }
//                else{                   
//               }
            }
        }
    }
    public void breakShipmentIntoOrders(){
        
        for(int i=0;i<shipmentList.size();i++){
            for(int j=0;j<shipmentList.get(i).getOrderListInShipment().size();j++){
//                if(!orderForArea.containsKey(shipmentList.get(i).getOrderListInShipment().get(j).getCustomer().getAddress().getArea())){
//                    orderForArea.put(shipmentList.get(i).getOrderListInShipment().get(j).getCustomer().getAddress().getArea(), shipmentList.get(i).getOrderListInShipment().get(j));
//                }
//                else{
//                    
//                }
                ordersForArea.get(shipmentList.get(i).getOrderListInShipment().get(j).getCustomer().getAddress().getArea()).add( shipmentList.get(i).getOrderListInShipment().get(j));
            }
        }
        refreshShipmentsToOrders();
    }
    public void refreshShipmentsToOrders(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();        
        model.setRowCount(0);
        for(int i=0; i<shipmentList.size();i++){
            for(int j=0; j<shipmentList.get(i).getOrderListInShipment().size(); j++){
                model.addRow(new Object[]{shipmentList.get(i).getShipmentId(), shipmentList.get(i).getStatus(),shipmentList.get(i).getOrderListInShipment().get(j).getId(),""});
            }
        }
    }
    public void refreshPage(){
        //ArrayList<Order> orders = del.getOrderList();// getVendorShipmentList();// getShipmentList();// getOrders();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();        
        model.setRowCount(0);
        for(FCShipment o :shipmentList){
            model.addRow(new Object[]{o.getShipmentId(), o.getStatus()});
           //if(o.getStatus()==Order.Status.Pending)jComboBox1.addItem(o);
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

        AddButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddButton2 = new javax.swing.JButton();

        AddButton3.setBackground(new java.awt.Color(0, 0, 153));
        AddButton3.setForeground(new java.awt.Color(102, 204, 0));
        AddButton3.setText("Assign Orders to respective Lastmile stations");
        AddButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hub");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shipment ID", "Status", "Order ID", "Last Mile ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        AddButton2.setBackground(new java.awt.Color(0, 0, 153));
        AddButton2.setForeground(new java.awt.Color(102, 204, 0));
        AddButton2.setText("Break Shipment to Orders");
        AddButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddButton2)
                .addGap(18, 18, 18)
                .addComponent(AddButton3)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton3ActionPerformed
        // TODO add your handling code here:
        assignOrdersToLastMileNew();
        refreshPageFinally();
    }//GEN-LAST:event_AddButton3ActionPerformed
    public void assignOrdersToLastMile(){
        for(int i=0;i<hAndLM.getHubOrgDir().getHubOrganizationList().size();i++){
            for(int j=0;j<orderForArea.size();j++){
                if(orderForArea.containsKey(hAndLM.getHubOrgDir().getHubOrganizationList().get(i). getOrgAddress().getCity())){
                    hAndLM.getLmOrgDir().getLMOrganizationList().get(i).addOrderToLM(orderForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i).getOrgAddress().getArea()));// getHubOrgDir().getHubOrganizationList().get(i). getOrgAddress().getCity()))));//  getFmDeliveryOrganizationList() HubOrgDir().getHubOrganizationList().get(i).addShipmentToHub(orderForArea.get(hAndLM.getHubOrgDir().getHubOrganizationList().get(i). getOrgAddress().getCity()));
                    hAndLM.addOrderToLM(orderForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i).getOrgAddress().getArea()));
                    orderForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i). getOrgAddress().getArea()).setStatus(Order.Status.SentToLastMile);
                    orderForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i).getOrgAddress().getArea()).setLMLinked(hAndLM.getLmOrgDir().getLMOrganizationList().get(i));
                //shipmentForLocation.setHubAndLastMile(hAndLM.get(i));
            }
            }
        }
        refreshPageFinally();
    }
    
    public void assignOrdersToLastMileNew(){
        for(int i=0;i<hAndLM.getHubOrgDir().getHubOrganizationList().size();i++){
             for(int j=0;j<ordersForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i). getOrgAddress().getArea()).size();j++){
                if(ordersForArea.containsKey(hAndLM.getHubOrgDir().getHubOrganizationList().get(i). getOrgAddress().getArea())){
                    hAndLM.getLmOrgDir().getLMOrganizationList().get(i).addOrderToLM(ordersForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i). getOrgAddress().getArea()).get(j));// getHubOrgDir().getHubOrganizationList().get(i). getOrgAddress().getCity()))));//  getFmDeliveryOrganizationList() HubOrgDir().getHubOrganizationList().get(i).addShipmentToHub(orderForArea.get(hAndLM.getHubOrgDir().getHubOrganizationList().get(i). getOrgAddress().getCity()));
                    hAndLM.addOrderToLM(ordersForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i).getOrgAddress().getArea()).get(j));
                    
                        ordersForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i). getOrgAddress().getArea()).get(j).setStatus(Order.Status.SentToLastMile);
                        ordersForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i).getOrgAddress().getArea()).get(j).setLMLinked(hAndLM.getLmOrgDir().getLMOrganizationList().get(i));
                    }
                //shipmentForLocation.setHubAndLastMile(hAndLM.get(i));
            }
 //           }
        }
        refreshPageFinally();
    }
    public void refreshPageFinally(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();        
        model.setRowCount(0);
        for(int i=0; i<shipmentList.size();i++){
            //for(int j=0;j<ordersForArea.size();j++){
                for(int k=0;k<ordersForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i). getOrgAddress().getArea()).size();k++){
                   model.addRow(new Object[]{shipmentList.get(i).getShipmentId(), ordersForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i).getOrgAddress().getArea()).get(k).getStatus(),ordersForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i).getOrgAddress().getArea()).get(k).getId(),ordersForArea.get(hAndLM.getLmOrgDir().getLMOrganizationList().get(i).getOrgAddress().getArea()).get(k).getLMLinked().getLmOrgId()});
                }
                
            }
        }
    
    
    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
        breakShipmentIntoOrders();
        //refreshPage();
// TODO add your handling code here:
        //        ArrayList<Order> orders = (ArrayList<Order>) vendor.getOrders();
        //        ship = new VendorShipment(orders,vendor.getAddress(), orders.get(0).getFc().getAddress(), orders.get(0).getTimePlaced(),orders.get(0).getTimePlaced());
        //        ship.setFc(orders.get(0).getFc());
        //        ship.setStatus(Shipment.Status.Pending);
        //        Delivery del = EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);
        //        del.addFMShipmentsToDelivery(ship);

        //
        //Order temp = (Order)jComboBox1.getSelectedItem();
        //if (temp==null)return;
        //        DeliveryMan deliveryMan = (DeliveryMan) DeliveryMenList.getSelectedItem();
        //        if (deliveryMan==null) return;
        //        temp.setDeliveryMan(deliveryMan);
        //        temp.setStatus(Order.Status.Assigned);
        //        refreshOrders();
        //        refreshDeliveryMen();
        //
    }//GEN-LAST:event_AddButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton2;
    private javax.swing.JButton AddButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
