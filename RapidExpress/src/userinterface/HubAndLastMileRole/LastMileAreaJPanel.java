/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HubAndLastMileRole;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.DeliveryDirectory;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.POJO.FCShipment;
import Business.POJO.Order;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.Role.LastMileMan;
import userinterface.FCRole.Outbound.*;
import Business.Role.PickAndPack;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisho
 */
public class LastMileAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LastMileAreaJPanel
     */
    PickAndPack pickAndPackMan;
    LastMileMan lm;
    HubAndLastMile hAndLM;
    ArrayList<Order>orderList;
    //MAKE LOGIC TO SEND TO LM DELIVERY
    public LastMileAreaJPanel(LastMileMan lm) {
        initComponents();
        this.lm=lm;
        this.hAndLM=this.lm.gethAndLM();
        this.orderList=new ArrayList<Order>();
        this.orderList=this.hAndLM.returnOrdersToSendToLM();// returnShipmentList();
        refreshPage();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        CartTable = new javax.swing.JTable();
        AddButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(139, 216, 189));
        setPreferredSize(new java.awt.Dimension(1785, 1068));

        jLabel1.setBackground(new java.awt.Color(36, 54, 101));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Last Mile");
        jLabel1.setOpaque(true);

        CartTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product", "CustomerID", "Order Date", "Status", "Stock Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
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
        AddButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AddButton2.setForeground(new java.awt.Color(255, 255, 255));
        AddButton2.setText("Send Orders To Delivery");
        AddButton2.setBorder(null);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(807, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void refreshPage(){
        //ArrayList<Order> orders = del.getOrderList();// getVendorShipmentList();// getShipmentList();// getOrders();
        DefaultTableModel model = (DefaultTableModel) CartTable.getModel();        
        model.setRowCount(0);
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        
        for(Order o :orderList){
            for(Product p:o.getProductListInOrder()){
                model.addRow(new Object[]{o.getOrderId(),p.getProductId(),o.getCustomer().getId(),strDate, o.getStatus(),"quantity"});
            
            }
           //if(o.getStatus()==Order.Status.Pending)jComboBox1.addItem(o);
        }
    }
    public void refreshPageFinally(){
        DefaultTableModel model = (DefaultTableModel) CartTable.getModel();        
        model.setRowCount(0);
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        for(Order o :orderList){
            for(Product p:o.getProductListInOrder()){
                model.addRow(new Object[]{o.getOrderId(),p.getProductId(),o.getCustomer().getId(),strDate, o.getStatus(),"quantity"});
            
            }
           //if(o.getStatus()==Order.Status.Pending)jComboBox1.addItem(o);
        }
    }
    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
        ArrayList<Order> orders = this.orderList;
        //ship = new VendorShipment(orders,vendor.getEntAddress(), orders.get(0).getFc().getEntAddress(), orders.get(0).getTimePlaced(),orders.get(0).getTimePlaced());
        //ship.setFc(orders.get(0).getFc());
        //ship.setStatus(Shipment.Status.Pending);
        Delivery deli =new Delivery();//, address);//= EcoSystem.getInstance().getFcDirectory().getFCById(1);
        DeliveryDirectory deliDir = EcoSystem.getInstance().getDeliveryDirectory();
            for(int i=0; i<deliDir.getDeliveryList().size();i++){
                if(deliDir.getDeliveryList().get(i).getEntAddress().getArea()==orders.get(0).getFc().getEntAddress().getArea()){
                    deli=deliDir.getDeliveryList().get(i);
                }
            }
//        Delivery del = EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);
        
        
        
        //Delivery del = EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);
        for(int i=0;i<orders.size();i++){
            orders.get(i).setStatus(Order.Status.SentToLastMileDelivery);
            deli.addLMOrdersToDelivery(orders.get(i));// FMShipmentsToDelivery(ship);
        }
        refreshPageFinally();
        
        
        //ArrayList<Order> orders = (ArrayList<Order>) vendor.getOrders();
        //ship = new VendorShipment(orders,vendor.getEntAddress(), orders.get(0).getFc().getEntAddress(), orders.get(0).getTimePlaced(),orders.get(0).getTimePlaced());
        //ship.setFc(orders.get(0).getFc());
        //ship.setStatus(Shipment.Status.Pending);
        //Delivery del = EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(1);
        //del.addFMShipmentsToDelivery(ship);
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
    private javax.swing.JTable CartTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
