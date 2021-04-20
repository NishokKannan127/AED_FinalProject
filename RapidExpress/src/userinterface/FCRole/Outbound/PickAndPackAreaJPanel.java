/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FCRole.Outbound;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import Business.Organizations.FirstMileDeliveryOrganizationDirectory;
import Business.Organizations.InboundOrganizationDirectory;
import Business.POJO.Order;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.Role.DeliveryMen;
import Business.Role.Dock;
import Business.Role.FirstMileDelivery;
import Business.Role.PickAndPack;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisho
 */
public class PickAndPackAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PickAndPackAreaJPanel
     */
    
    //nishok picker and packer. need to make changes from hardcode to logic
    PickAndPack pickAndPackMan;
    FulfillmentCenter fc;
    Delivery delivery;
    ArrayList<Order>orderList;
    Dock dock;
    private ArrayList<Product>arrivedProducts;
    int countProductsInOrder=0;
    OutboundOrganization outOrg;
    ArrayList<Dock>dockMen;
    public PickAndPackAreaJPanel(PickAndPack pickAndPackMan) {
        initComponents();
        this.pickAndPackMan=pickAndPackMan;
        this.fc=pickAndPackMan.getFC();
        orderList=new ArrayList<Order>();
        //orderList=this.fc.getOrderListToSend();
        this.delivery =    this.fc.getDeliveryCompenyAssociatedToFC();//EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);//recieve.getFc().getDeliveryCompenyAssociatedToFC().  dList.get(0).getDeliveryByID();// getRestaurant();;
        //fc = EcoSystem.getInstance().getFcDirectory().getFCById(1);
        orderList=fc.getOrderListToSend();// getOrderList();
        dockMen=new ArrayList<Dock>();
        refreshOrderAndInventoryQuant();
        //HARDCODED
//        this.fc.getOutboundOrgDirectory().getOutboundOrganizationList();// InboundOrganizationDirectory;

        dockMen=this.pickAndPackMan.getOutboundOrg().getDockMenList();
        
        //OutboundOrganizationDirectory        ;
        this.dock=dockMen.get(0);//     EcoSystem.getInstance().getDockPeopleDirectory().getDockMenList().get(0);
    }

    
    
    @SuppressWarnings("unchecked")
    private void refreshOrderAndInventoryQuant(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //jComboBox1.removeAllItems();
        model.setRowCount(0);
        for(Order order: orderList){
            for(int i=0; i<order.getProductListInOrder().size();i++){
//                if(order.getStatus()!=Order.Status.Packed || order.getStatus()!=Order.Status.SentToDock){
//                    order.setStatus(Order.Status.Picked);
//                }
                model.addRow(new Object[]{order.getOrderId(),order.getProductListInOrder().get(i).getProductId(),order.getProductListInOrder().get(i),1,this.fc.getQuantityOfProduct(order.getProductListInOrder().get(i)),order.getStatus()});
                //if(order.getStatus()==Order.Status.OrderSentToShipmentFromVendor)jComboBox1.addItem(order);
            }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddButton2 = new javax.swing.JButton();
        AddButton3 = new javax.swing.JButton();
        AddButton4 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Picker and Packer");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product Id", "Product Name", "Quantity Required", "Quantity Present in Inventory", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        AddButton2.setText("Pick");
        AddButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton2ActionPerformed(evt);
            }
        });

        AddButton3.setBackground(new java.awt.Color(0, 0, 153));
        AddButton3.setForeground(new java.awt.Color(102, 204, 0));
        AddButton3.setText("Pack");
        AddButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton3ActionPerformed(evt);
            }
        });

        AddButton4.setBackground(new java.awt.Color(0, 0, 153));
        AddButton4.setForeground(new java.awt.Color(102, 204, 0));
        AddButton4.setText("Sent To Dock");
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
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(AddButton2)
                        .addGap(120, 120, 120)
                        .addComponent(AddButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(AddButton4)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton2)
                    .addComponent(AddButton3))
                .addGap(18, 18, 18)
                .addComponent(AddButton4)
                .addContainerGap(316, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
//set status to PICK
        List<VendorShipment> shipments = delivery.getVendorShipmentList(); 
        Product temp2=null;
        List<Product> arrivedProd=arrivedProducts;
        
        for(Order o : orderList){
            for(Product p: o.getProductListInOrder()){
                int column = 1;
                int row = jTable1.getSelectedRow();
                int selectedId = (Integer)jTable1.getModel().getValueAt(row, column);
                if(o.getId()==selectedId){
                    o.setStatus(Order.Status.Picked);
                
                //do quantity --
                    break;
            }
            
        }
    }
        
//        Stow st = new //(Vendor) jComboBox1.getSelectedItem();
//            v.addOrder(newOrder);
        //refreshOrders();
        refreshOrderAndInventoryQuant();

        // TODO add your handling code here:
        //ArrayList<Order> orders = (ArrayList<Order>) vendor.getOrders();
        //ship = new VendorShipment(orders,vendor.getAddress(), orders.get(0).getFc().getAddress(), orders.get(0).getTimePlaced(),orders.get(0).getTimePlaced());
        //ship.setFc(orders.get(0).getFc());
        //ship.setStatus(Shipment.Status.Pending);
        //Delivery del = EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);
        //del.addFMShipmentsToDelivery(ship);

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

    private void AddButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton3ActionPerformed
//set status to PACK
        List<VendorShipment> shipments = delivery.getVendorShipmentList(); 
        Product temp2=null;
        List<Product> arrivedProd=arrivedProducts;
        
        for(Order o : orderList){
            for(Product p: o.getProductListInOrder()){
                int column = 0;
                int column2=1;
                int row = jTable1.getSelectedRow();
                int selectedId = (Integer)jTable1.getModel().getValueAt(row, column);
   //             Product selectedProd = (Product)jTable1.getModel().getValueAt(row, column2);
            
                if(o.getId()==selectedId){
                    o.setStatus(Order.Status.Packed);
                //dock.addPackedOrders(o);
                //this.fc.removeProduct(selectedProd);
                // set getQuantityOfProduct(order.getProductListInOrder().get(i));
                
                //do quantity --
                //break;
            }
            refreshOrderAndInventoryQuant();
            
        }
            
//        Stow st = new //(Vendor) jComboBox1.getSelectedItem();
//            v.addOrder(newOrder);
        //refreshOrders();
        refreshOrderAndInventoryQuant();


        }
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButton3ActionPerformed

    private void AddButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton4ActionPerformed
        // TODO add your handling code here:
        List<VendorShipment> shipments = delivery.getVendorShipmentList(); 
        Product temp2=null;
        List<Product> arrivedProd=arrivedProducts;
        int column = 0;
            int column2=1;
            int column3=2;
            int row = jTable1.getSelectedRow();
        for(Order o : orderList){
            
            for(Product p: o.getProductListInOrder()){
                
            int selectedId = (Integer)jTable1.getModel().getValueAt(row, column2);
            Product selectedProd = (Product)jTable1.getModel().getValueAt(row, column3);
            
            //if(o.getId()==selectedId){                
            if(p.getProductId()==selectedId){                
                this.fc.removeProduct(selectedProd);
                countProductsInOrder+=1;
                // set getQuantityOfProduct(order.getProductListInOrder().get(i));
                
                //do quantity --
                //break;
                
            }            
            }
            refreshOrderAndInventoryQuant();
            if(countProductsInOrder==o.getProductListInOrder().size()){
                o.setStatus(Order.Status.SentToDock);
                //dock.addPackedOrders(o);
            }
        }
        //if(dock.getPackedOrderList().size()>0){
        //    dock.setIsAvailable(false);
       // }
        refreshOrderAndInventoryQuant();
    }//GEN-LAST:event_AddButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton2;
    private javax.swing.JButton AddButton3;
    private javax.swing.JButton AddButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
