/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FCRole.Inbound;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseVendor.Vendor;
import Business.POJO.Order;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.Role.FirstMileDelivery;
import Business.Role.Recieve;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisho
 */

//STATUS - ARRIVED, NOT ARRIVED, RECIEVED
public class RecieveAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecieveAreaJPanel
     */
    Recieve recieve;
    List<Product> arrivedProducts=new ArrayList<Product>();
    //ArrayList<FirstMileDelivery> fmDeliveryManList;
    private Delivery delivery;
    FulfillmentCenter fc;
    public RecieveAreaJPanel(Recieve recieve){
        initComponents();
        this.recieve=recieve;
        this.delivery=recieve.getFC().getDeliveryCompenyAssociatedToFC();
        //this.delivery = EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);//recieve.getFc().getDeliveryCompenyAssociatedToFC().  dList.get(0).getDeliveryByID();// getRestaurant();
        //this.fmDeliveryManList = dList;
        this.fc=delivery.getVendorShipmentList().get(0).getFc();//this.recieve.getFc();
        this.recieve.setFC(this.fc);
        refreshShipments();
        
//        Delivery del = EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);
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

        setBackground(new java.awt.Color(139, 216, 189));
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1500, 1000));

        jLabel1.setBackground(new java.awt.Color(36, 54, 101));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reciever");
        jLabel1.setOpaque(true);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shipment ID", "Fulfillment Center ID", "Status", "Product ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
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

        AddButton2.setBackground(new java.awt.Color(255, 87, 87));
        AddButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddButton2.setForeground(new java.awt.Color(255, 255, 255));
        AddButton2.setText("Send Arrived Shipments to Stow Queue");
        AddButton2.setBorder(null);
        AddButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton2ActionPerformed(evt);
            }
        });

        AddButton3.setBackground(new java.awt.Color(255, 87, 87));
        AddButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddButton3.setForeground(new java.awt.Color(255, 255, 255));
        AddButton3.setText("Get Products from Shipments");
        AddButton3.setBorder(null);
        AddButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(235, 235, 235)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AddButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                .addComponent(AddButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(891, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(AddButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(646, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void refreshShipments(){
        List<VendorShipment> shipments = delivery.getVendorShipmentList();// getOrders();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for(VendorShipment o :shipments){
            //if(o.getFMDeliveryMan()!=null && o.getFMDeliveryMan().equals(this.fmDeliveryMan))
            if(o.getStatus()==VendorShipment.Status.Active || o.getStatus()==VendorShipment.Status.Assigned){
                o.setStatus(VendorShipment.Status.NotArrivedAtFC);
                model.addRow(new Object[]{o.getShipmentId(), o.getFCId(),o.getStatus()});
            }
            
            else{
                o.setStatus(VendorShipment.Status.ArrivedAtFC);
                model.addRow(new Object[]{o.getShipmentId(), o.getFCId(),o.getStatus()});
            }
            //if(o.getStatus()==VendorShipment.Status.Assigned)jComboBox2.addItem(o);
        }
    }
    private void refreshShipmentsAndProducts(){
        List<VendorShipment> shipments = delivery.getVendorShipmentList();// getOrders();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        arrivedProducts=new ArrayList<Product>();
        
        model.setRowCount(0);
        for(VendorShipment o :shipments){
            //for(Order or: o.get)
            for(Product prod: o.getProductsInShipment()){
            if(o.getStatus()==VendorShipment.Status.NotArrivedAtFC){
                model.addRow(new Object[]{o.getShipmentId(), o.getFCId(),o.getStatus()});
            }
            else if(o.getStatus()==VendorShipment.Status.ArrivedAtFC){
                arrivedProducts.add(prod);
                recieve.addProductsThatAreRecieved(prod);
                model.addRow(new Object[]{o.getShipmentId(), o.getFCId(),o.getStatus(),prod.getProductId()});
            }
            else if (o.getStatus()==VendorShipment.Status.ProductsSentToStowQueue){
                model.addRow(new Object[]{o.getShipmentId(), o.getFCId(),o.getStatus(),prod.getProductId()});
            }
            }
            
            //if(o.getStatus()==VendorShipment.Status.Assigned)jComboBox2.addItem(o);
        }
    }
    
    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
        List<VendorShipment> shipments = delivery.getVendorShipmentList(); 
        Shipment temp2=null;
        
        for(VendorShipment o : shipments){
            int column = 0;
            int row = jTable1.getSelectedRow();
            int selectedId = (Integer)jTable1.getModel().getValueAt(row, column);
            if(o.getShipmentId()==selectedId){
                temp2 = o;
                o.setStatus(Shipment.Status.ProductsSentToStowQueue);
                //temp2.setStatus(Order.Status.Active);// Rejected);
                break;
            }
            
        }
        
//        Stow st = new //(Vendor) jComboBox1.getSelectedItem();
//            v.addOrder(newOrder);
        //refreshOrders();
        refreshShipmentsAndProducts();
        
        
          
        //for(VendorShipment o :shipments){
            //for(Product prod: o.getProductsInShipment()){
            //if(o.getStatus()==VendorShipment.Status.ArrivedAtFC){
            //    model.addRow(new Object[]{o.getShipmentId(), o.getFCId(),o.getStatus()});
            //}
         //   o.setStatus(Shipment.Status.ProductsSentToStowQueue);
         //   }
        //refreshShipmentsAndProducts();
            
            //if(o.getStatus()==VendorShipment.Status.Assigned)jComboBox2.addItem(o);
        
        
        
//        VendorShipment o = (VendorShipment) jComboBox1.getSelectedItem();
//        o.setStatus(VendorShipment.Status.Completed);
//        o.setShipmentDeliveredTime((new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date())));
//        fmDeliveryMan.setIsAvailable(true);// setAvailable(true);
//        refreshShipments();
//        refreshShipmentsAndProducts();
        //List<VendorShipment> shipments = delivery.getVendorShipmentList();
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
        // TODO add your handling code here:
        refreshShipmentsAndProducts();
    }//GEN-LAST:event_AddButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton2;
    private javax.swing.JButton AddButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
