/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VendorRole;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.DeliveryDirectory;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenterDirectory;
import Business.EnterpriseVendor.Vendor;
import Business.POJO.Order;
import Business.POJO.Order.Status;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.Role.Customer;
import Business.Role.VendorAdmin;
import Business.Role.DeliveryMen;
import Business.Role.FirstMileDelivery;
import Business.Role.VendorManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisho
 */
public class VendorAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VendorAreaJPanel
     */
    private Customer customer;
    List<Product> items = new ArrayList();
    VendorShipment ship;
    //List<Order> orderItems=new ArrayList();
    VendorManager vendorAdmin;
    Vendor vendor;
    FulfillmentCenter fc;
    public VendorAreaJPanel(VendorManager vendor) {
        initComponents();
     //   this.vendor=vendor;
    }
    public VendorAreaJPanel(Vendor vendor) {
        initComponents();
        this.vendor=vendor;
        //this.fc=vendor.
        refreshOrders();        
    }

    
    private void refreshOrders(){
        List<Order> orders = vendor.getOrders();
        DefaultTableModel model = (DefaultTableModel) CartTable.getModel();
        //jComboBox1.removeAllItems();
        model.setRowCount(0);
        for(Order o :orders){
            for(Product p: o.returnProductList()){
                model.addRow(new Object[]{o.getId(), p.getProductName(),o.getCustomer().getId(),o.getTimePlaced(),o.getStatus(),o.getTimePlaced(),100,o.getFc()});
            //if(o.getStatus()==Order.Status.Pending)jComboBox1.addItem(o);
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
        AddButton = new javax.swing.JButton();
        AddButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CartTable = new javax.swing.JTable();
        AddButton2 = new javax.swing.JButton();
        AddButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(139, 216, 189));
        setMinimumSize(new java.awt.Dimension(1500, 1000));
        setPreferredSize(new java.awt.Dimension(1500, 1000));

        jLabel1.setBackground(new java.awt.Color(36, 54, 101));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vendor Dashboard");
        jLabel1.setOpaque(true);

        AddButton.setBackground(new java.awt.Color(255, 87, 87));
        AddButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Accept");
        AddButton.setBorder(null);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        AddButton1.setBackground(new java.awt.Color(255, 87, 87));
        AddButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddButton1.setForeground(new java.awt.Color(255, 255, 255));
        AddButton1.setText("Reject");
        AddButton1.setBorder(null);
        AddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton1ActionPerformed(evt);
            }
        });

        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product", "CustomerID", "Order Date", "Status", "Deliver by Date", "Stock Quantity", "FC ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CartTable.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(CartTable);
        CartTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        AddButton2.setBackground(new java.awt.Color(255, 87, 87));
        AddButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddButton2.setForeground(new java.awt.Color(255, 255, 255));
        AddButton2.setText("Send Orders To Shipment via FC");
        AddButton2.setBorder(null);
        AddButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton2ActionPerformed(evt);
            }
        });

        AddButton3.setBackground(new java.awt.Color(255, 87, 87));
        AddButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddButton3.setForeground(new java.awt.Color(255, 255, 255));
        AddButton3.setText("Send Orders To Shipment via Direct Delivery");
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AddButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(AddButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(51, 51, 51))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddButton2, AddButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton3)
                    .addComponent(AddButton1))
                .addGap(196, 196, 196))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddButton, AddButton1, AddButton2, AddButton3});

    }// </editor-fold>//GEN-END:initComponents

  
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
//accept
        //     Product item = (Product) jComboBox2.getSelectedItem();
   //     int quantity = (Integer)jSpinner1.getValue();
   //     for(int i=0;i<quantity;i++){
   //         items.add(item);
   //     }
   //     refreshCart();
   Order temp2=null;
        for(Order o : vendor.getOrders()){
            int column = 0;
            
            int row = CartTable.getSelectedRow();
            int selectedId = (Integer)CartTable.getModel().getValueAt(row, column);
            if(o.getId()==selectedId){
                temp2 = o;
                temp2.setStatus(Status.Active);// Rejected);
                break;
            }
            
        }
        refreshOrders();

    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton1ActionPerformed
//reject   
//        Order temp = (Order)jComboBox1.getSelectedItem();
//        temp.setStatus(Status.Rejected);
//        refreshOrders();
        
        Order temp2=null;
        for(Order o : vendor.getOrders()){
            int column = 0;
            int row = CartTable.getSelectedRow();
            int selectedId = (Integer)CartTable.getModel().getValueAt(row, column);
            if(o.getId()==selectedId){
                temp2 = o;
                temp2.setStatus(Status.Rejected);
                break;
            }
            
        }
        refreshOrders();
        //if (temp==null)return;
        //OrderDetailsPopup popup = new OrderDetailsPopup(temp);
        //popup.setBounds(500, 500, 347, 440);
        //JOptionPane jop = new JOptionPane();
        //JDialog dialog = jop.createDialog("Order Details");
        //dialog.setSize(347, 440);
        //dialog.setContentPane(popup);
        //dialog.setVisible(true);
// TODO add your handling code here:
        //Order temp = (Order)jComboBox1.getSelectedItem();
        //temp.setStatus(Status.Rejected);
        //refreshOrders();
    }//GEN-LAST:event_AddButton1ActionPerformed

    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<Order> orders = (ArrayList<Order>) vendor.getOrders();
        for(int i=0;i<orders.size();i++){
            orders.get(i).setStatus(Status.OrderSentToShipmentFromVendor);
        }
        ship = new VendorShipment(orders,vendor.getEntAddress(), orders.get(0).getFc().getEntAddress(), orders.get(0).getTimePlaced(),orders.get(0).getTimePlaced());
        ship.setFc(orders.get(0).getFc());
        ship.setStatus(Shipment.Status.Pending);
        
        //
        
        Delivery deli =new Delivery();//, address);//= EcoSystem.getInstance().getFcDirectory().getFCById(1);
        DeliveryDirectory deliDir = EcoSystem.getInstance().getDeliveryDirectory();
            for(int i=0; i<deliDir.getDeliveryList().size();i++){
                if(deliDir.getDeliveryList().get(i).getEntAddress().getState()==orders.get(0).getFc().getEntAddress().getState()){
                    deli=deliDir.getDeliveryList().get(i);
                }
            }
//        Delivery del = EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);
        deli.addFMShipmentsToDelivery(ship);
        refreshOrders();
        //Order temp = (Order)jComboBox1.getSelectedItem();
        //if (temp==null)return;
//        DeliveryMan deliveryMan = (DeliveryMan) DeliveryMenList.getSelectedItem();
//        if (deliveryMan==null) return;
//        temp.setDeliveryMan(deliveryMan);
//        temp.setStatus(Order.Status.Assigned);
//        refreshOrders();
//        refreshDeliveryMen();
        //
        
        
        
        //email with status send to customer
        
    }//GEN-LAST:event_AddButton2ActionPerformed

    private void AddButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton3ActionPerformed
        // TODO add your handling code here:
        ArrayList<Order> orders = (ArrayList<Order>) vendor.getOrders();
        for(int i=0;i<orders.size();i++){
            orders.get(i).setStatus(Status.OrderSentToDirectShipmentFromVendor);
        }
   //     ship = new VendorShipment(orders,vendor.getEntAddress(), orders.get(0).getFc().getEntAddress(), orders.get(0).getTimePlaced(),orders.get(0).getTimePlaced());
   //     ship.setFc(orders.get(0).getFc());
   //     ship.setStatus(Shipment.Status.Pending);
        
        //
        
        Delivery deli =new Delivery();//, address);//= EcoSystem.getInstance().getFcDirectory().getFCById(1);
        DeliveryDirectory deliDir = EcoSystem.getInstance().getDeliveryDirectory();
            for(int i=0; i<deliDir.getDeliveryList().size();i++){
                if(deliDir.getDeliveryList().get(i).getEntAddress().getState()==orders.get(0).getFc().getEntAddress().getState()){
                    deli=deliDir.getDeliveryList().get(i);
                }
            }
        for(int i=0;i<orders.size();i++){
            //orders.get(i).setStatus(Status.OrderSentToShipmentFromVendor);
            deli.addDirectDeliveryOrdersToDelivery(orders.get(i));
        }
//        Delivery del = EcoSystem.getInstance().getDeliveryDirect-ory().getDeliveryById(1);
//        deli.addDirectDelShipmentsToDelivery(ship);
        refreshOrders();
    }//GEN-LAST:event_AddButton3ActionPerformed
    //private void refreshDeliveryMen(){
    //    List<FirstMileDelivery> deliveryMen = EcoSystem.getInstance().getFmDeliveryMenDirectory().getFMDeliveryManList();// getDeliveryManDirectory().getDeliveryManList();
    //    DeliveryMenList.removeAllItems();
    //    for(DeliveryMen d : deliveryMen){
    //        if(d.getRestaurant().equals(restaurant) && d.isAvailable())DeliveryMenList.addItem(d);
    //    }
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddButton1;
    private javax.swing.JButton AddButton2;
    private javax.swing.JButton AddButton3;
    private javax.swing.JTable CartTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
