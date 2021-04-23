/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FCRole.Inbound;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.Role.Stow;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisho
 */
public class StowAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StowAreaJPanel
     */
    Stow stow;
    private Delivery delivery;
    private ArrayList<Product>arrivedProducts;
    private FulfillmentCenter fc;
    
    public StowAreaJPanel(Stow stow) {
        initComponents();
        this.stow=stow;
        this.delivery = stow.getFC().getDeliveryCompenyAssociatedToFC();//EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);//recieve.getFc().getDeliveryCompenyAssociatedToFC().  dList.get(0).getDeliveryByID();// getRestaurant();
        //this.fmDeliveryManList = dList;
        this.fc= delivery.getVendorShipmentList().get(0).getFc();
                //calculateProdQuantity();
        arrivedProducts=new ArrayList<Product>();
        refreshProducts();
//        this.fc.getProductsAndQuantity()
    }
    private void calculateProdQuantity(){
        List<VendorShipment> shipments = delivery.getVendorShipmentList();// getOrders();
        //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        
        //model.setRowCount(0);
        for(VendorShipment o :shipments){
            //for(Order or: o.get)
            for(Product prod: o.getProductsInShipment()){
            if (o.getStatus()==VendorShipment.Status.ProductsSentToStowQueue){
                arrivedProducts.add(prod);
                
                this.fc.addProduct(prod);
                //model.addRow(new Object[]{prod.getProductId(), prod.getProductName(),o.getFCId()});
            }
            }
            o.setStatus(VendorShipment.Status.ProductsAddedToFCInventory);
            //if(o.getStatus()==VendorShipment.Status.Assigned)jComboBox2.addItem(o);
        }
    }
    private void refreshProducts(){
        List<VendorShipment> shipments = delivery.getVendorShipmentList();// getOrders();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //arrivedProducts=new ArrayList<Product>();
        
        model.setRowCount(0);
        for(VendorShipment o :shipments){
            //for(Order or: o.get)
            for(Product prod: o.getProductsInShipment()){
            if (o.getStatus()==VendorShipment.Status.ProductsSentToStowQueue || o.getStatus()==VendorShipment.Status.ProductsAddedToFCInventory){
                //arrivedProducts.add(prod);
                //this.fc.addProduct(prod);
                model.addRow(new Object[]{prod.getProductId(), prod.getProductName(),o.getFCId(),this.fc.getQuantityOfProduct(prod)});
            }
            }
            
            //if(o.getStatus()==VendorShipment.Status.Assigned)jComboBox2.addItem(o);
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

        setBackground(new java.awt.Color(139, 216, 189));
        setPreferredSize(new java.awt.Dimension(1500, 1000));

        jLabel1.setBackground(new java.awt.Color(36, 54, 101));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stow");
        jLabel1.setOpaque(true);

        jTable1.setBackground(new java.awt.Color(139, 216, 189));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Fulfillment Center Id", "Quantity"
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

        AddButton2.setBackground(new java.awt.Color(255, 87, 87));
        AddButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddButton2.setForeground(new java.awt.Color(255, 255, 255));
        AddButton2.setText("Sent products to Picker and Packers");
        AddButton2.setBorder(null);
        AddButton2.setMaximumSize(new java.awt.Dimension(243, 17));
        AddButton2.setMinimumSize(new java.awt.Dimension(243, 17));
        AddButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton2ActionPerformed(evt);
            }
        });

        AddButton3.setBackground(new java.awt.Color(255, 87, 87));
        AddButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddButton3.setForeground(new java.awt.Color(255, 255, 255));
        AddButton3.setText("Get product quantity");
        AddButton3.setBorder(null);
        AddButton3.setMaximumSize(new java.awt.Dimension(243, 17));
        AddButton3.setMinimumSize(new java.awt.Dimension(243, 17));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))))
                .addContainerGap(995, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddButton2, AddButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(707, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddButton2, AddButton3});

    }// </editor-fold>//GEN-END:initComponents

    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
        List<VendorShipment> shipments = delivery.getVendorShipmentList(); 
        Product temp2=null;
        List<Product> arrivedProd=arrivedProducts;
        
        for(Product o : arrivedProd){
            int column = 0;
            int row = jTable1.getSelectedRow();
            int selectedId = (Integer)jTable1.getModel().getValueAt(row, column);
            if(o.getProductId()==selectedId){
                temp2 = o;
                
                //do quantity --
                break;
            }
            
        }
        
//        Stow st = new //(Vendor) jComboBox1.getSelectedItem();
//            v.addOrder(newOrder);
        //refreshOrders();
        refreshProducts();

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
        calculateProdQuantity();
        refreshProducts();
    }//GEN-LAST:event_AddButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton2;
    private javax.swing.JButton AddButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
