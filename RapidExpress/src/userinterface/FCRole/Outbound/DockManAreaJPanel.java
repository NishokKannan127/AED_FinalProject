/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FCRole.Outbound;

import Business.EcoSystem;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenterDirectory;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.EnterpriseHubAndLastMile.HubAndLastMileDirectory;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.EnterpriseVendor.Vendor;
import Business.POJO.Address;
import Business.POJO.FCShipment;
import Business.POJO.Order;
import Business.POJO.Shipment.Status;
import Business.Role.Dock;
import Business.Role.HubMan;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisho
 */
public class DockManAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DockAreaJPanel
     */
    Dock dock;
    //orderList=this.fc.getOrderListToSend();
    ArrayList<Order> listOfPackedOrders;
    ArrayList<FCShipment> listOfShipments;
    ArrayList<Address> addressList;
    ArrayList<String> cityList;
    HashMap<String,FCShipment> shipmentForCity;
//    HashMap<String,FCShipment> shipmentForLocation;
    FulfillmentCenter fc;
    HubAndLastMile hAndLM;
    ArrayList<HubOrganization> hubOrg;
    ArrayList<LastMileOrganization> lmOrg;
    ArrayList<Order>pickedorderList;
    
    
    public DockManAreaJPanel(Dock dock) {
        initComponents();
        this.dock=dock;
        this.listOfPackedOrders=new ArrayList<Order>();
//        this.listOfPackedOrders=dock.getPackedOrderList();
        this.listOfShipments=new ArrayList<FCShipment>();
        addressList=new ArrayList<Address>();
        cityList=new ArrayList<String>();
        shipmentForCity=new HashMap<String,FCShipment>();
        fc=this.dock.getFC();
        //fc = EcoSystem.getInstance().getFcDirectory().getFCById(1);
        pickedorderList=new ArrayList<Order>();
        pickedorderList=fc.getOrderListToSend();// getOrderList();
        hubOrg=new ArrayList<HubOrganization>();
        lmOrg=new ArrayList<LastMileOrganization>();
        
        //hAndLM=new ArrayList<HubAndLastMile>();
        //List<Hub> hubFolks = EcoSystem.getInstance().getHubManDir().gethubManList();// getVendorDirectory().geVendorList();// getRestaurantDirectory().getRestaurantList();
        
        
        hAndLM =new HubAndLastMile();//, address);//= EcoSystem.getInstance().getFcDirectory().getFCById(1);
            HubAndLastMileDirectory hAndLMDir = EcoSystem.getInstance().gethAndLmDir();
            for(int i=0; i<hAndLMDir.getHubAndLastMileList().size();i++){
                if(hAndLMDir.getHubAndLastMileList().get(i).getEntAddress().getCity()==dock.getFC().getEntAddress().getCity()){
                    hAndLM=hAndLMDir.getHubAndLastMileList().get(i);
                }
            }
            
        //hAndLM=EcoSystem.getInstance().gethAndLmDir().getHubAndLastMileList().get(0);// getHubList();
        
        hubOrg=hAndLM.getHubOrgDir().getHubOrganizationList();// getHubList();
        lmOrg=hAndLM.getLmOrgDir().getLMOrganizationList();// getLmOrgList();
        
        makeShipmentForUniqueCities();
        refreshOrders();
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void makeShipmentForUniqueCities(){
        for(int i=0;i<pickedorderList.size();i++){
            if(pickedorderList.get(i).getStatus()==Order.Status.SentToDock){
            if(!shipmentForCity.containsKey(pickedorderList.get(i).getCustomer().getAddress().getCity())){
                Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                String strDate = dateFormat.format(date);  
                FCShipment shipmm=new FCShipment(fc.getEntAddress(), pickedorderList.get(i).getCustomer().getAddress(), strDate, "");
                shipmentForCity.put(pickedorderList.get(i).getCustomer().getAddress().getCity(), shipmm);
                listOfShipments.add(shipmm);    
//cityList.add(listOfPackedOrders.get(0).getCustomer().getAddress().getCity());
            }
            }
            //for each unique city, create a shipment  listOfPackedOrders.get(0).getCustomer().getAddress().getCity();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(139, 216, 189));
        setPreferredSize(new java.awt.Dimension(1500, 1000));

        AddButton3.setBackground(new java.awt.Color(255, 87, 87));
        AddButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddButton3.setForeground(new java.awt.Color(255, 255, 255));
        AddButton3.setText("Assign Orders to Shipments");
        AddButton3.setBorder(null);
        AddButton3.setPreferredSize(new java.awt.Dimension(286, 30));
        AddButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton3ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(36, 54, 101));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dock");
        jLabel1.setOpaque(true);

        jTable1.setBackground(new java.awt.Color(139, 216, 189));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Status", "Shipment ID", "Hub ID"
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

        AddButton4.setBackground(new java.awt.Color(255, 87, 87));
        AddButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddButton4.setForeground(new java.awt.Color(255, 255, 255));
        AddButton4.setText("Send Shipments to respective Hubs");
        AddButton4.setBorder(null);
        AddButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddButton4)
                            .addComponent(AddButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1006, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddButton3, AddButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(AddButton4)
                .addContainerGap(695, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddButton3, AddButton4});

    }// </editor-fold>//GEN-END:initComponents
private void refreshOrders(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(Order order: pickedorderList){
           // for(int i=0; i<ship.getOrderListInShipment().size();i++){
                //if(order.getStatus()!=Order.Status.Packed){
                //    order.setStatus(Order.Status.Picked);
                //}
                if(order.getStatus()==Order.Status.SentToDock || order.getStatus()==Order.Status.OrderConvertedToShipment )
                model.addRow(new Object[]{order.getId(),order.getStatus(),"",""});//       ship.getOrderListInShipment().get(i).getOrderId(),ship.getStatus(),ship.getShipmentId(),ship.getHubLinked().getOrganizationID()});
            
            }
        }

private void refreshData(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for(FCShipment ship: listOfShipments){
            for(int i=0; i<ship.getOrderListInShipment().size();i++){
                //if(order.getStatus()!=Order.Status.Packed){
                //    order.setStatus(Order.Status.Picked);
                //}
                model.addRow(new Object[]{ship.getOrderListInShipment().get(i).getOrderId(),ship.getOrderListInShipment().get(i).getStatus(),ship.getShipmentId()});//CHANGE THIS HARDCODE ship.getHubLinked().getOrganizationID()});
            
            }
        }
    }
private void refreshDataAndHub(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for(FCShipment ship: listOfShipments){
            for(int i=0; i<ship.getOrderListInShipment().size();i++){
                //if(order.getStatus()!=Order.Status.Packed){
                //    order.setStatus(Order.Status.Picked);
                //}
//                ship.setStatus(Status.SentToHub);
                model.addRow(new Object[]{ship.getOrderListInShipment().get(i).getOrderId(),ship.getStatus(),ship.getShipmentId(),ship.getHubLinked().getHubOrgId()});//CHANGE THIS HARDCODE ship.getHubLinked().getOrganizationID()});
            
            }
        }
    }
    private void AddButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton3ActionPerformed
        //Assign orders to shipments based on location
        for(int i=0;i<pickedorderList.size();i++){
            if(pickedorderList.get(i).getStatus()==Order.Status.SentToDock){
            for(int j=0; j<shipmentForCity.size();j++){
                if(shipmentForCity.containsKey(pickedorderList.get(i).getCustomer().getAddress().getCity())){
                    pickedorderList.get(i).setStatus(Order.Status.OrderConvertedToShipment);
                    
                    shipmentForCity.get(pickedorderList.get(i).getCustomer().getAddress().getCity()).addOrderInShipment(pickedorderList.get(i));//listOfShipments.add(new FCShipment());
                }
            }
            }
            //for each unique city, create a shipment  listOfPackedOrders.get(0).getCustomer().getAddress().getCity();
        }
        refreshData();
    }//GEN-LAST:event_AddButton3ActionPerformed

    private void AddButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton4ActionPerformed
        // TODO add your handling code here:
        
        //ADD LOGIC TO ASSIGN SHIPMENT TO HUB
        
        for(int i=0;i<hAndLM.getHubOrgDir().getHubOrganizationList().size();i++){
            for(int j=0;j<shipmentForCity.size();j++){
                if(shipmentForCity.containsKey(hAndLM.getEntAddress().getCity())){
                    hAndLM.addShipmentToHubAndLM(shipmentForCity.get(hAndLM.getEntAddress().getCity()));
                if(shipmentForCity.containsKey(hAndLM.getHubOrgDir().getHubOrganizationList().get(i).getOrgAddress().getCity())){
                hAndLM.getHubOrgDir().getHubOrganizationList().get(i).addShipmentToHub(shipmentForCity.get(hAndLM.getHubOrgDir().getHubOrganizationList().get(i).getOrgAddress().getCity()));
                shipmentForCity.get(hAndLM.getHubOrgDir().getHubOrganizationList().get(i). getOrgAddress().getCity()).setStatus(Status.SentToHub);
                shipmentForCity.get(hAndLM.getHubOrgDir().getHubOrganizationList().get(i).getOrgAddress().getCity()).setHubLinked(hAndLM.getHubOrgDir().getHubOrganizationList().get(i));
            }
                }
            }
        }
        
        refreshDataAndHub();
    }//GEN-LAST:event_AddButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton3;
    private javax.swing.JButton AddButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
