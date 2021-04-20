/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LMDeliveryRole;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.POJO.Order;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.Role.DeliveryMen;
import Business.Role.FirstMileDelivery;
import Business.Role.LastMileDelivery;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.Role.ManagerLMDeliveryMenAdmin;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisho
 */
public class LMDeliveryManagerAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LMDeliveryManagerAreaJPanel
     */
    LastMileDelivery lmDelivery;
    ManagerLMDeliveryMenAdmin managerLmDelivery;
    Delivery del;
    
    ArrayList<Order> orders= new ArrayList<Order>();
    
    public LMDeliveryManagerAreaJPanel(LastMileDelivery lmDelivery) {
        initComponents();
        this.lmDelivery=lmDelivery;
        refreshOrders();
        refreshDeliveryMen();
    }    
    public LMDeliveryManagerAreaJPanel(ManagerLMDeliveryMenAdmin managerlmDelivery) {
        initComponents();
        this.managerLmDelivery=managerlmDelivery;
        this.del=managerLmDelivery.getDelivery();
        refreshOrders();
        refreshDeliveryMen();
        //shipments=managerLmDelivery.getDelivery().getVendorShipmentList();
    }
    public LMDeliveryManagerAreaJPanel(Delivery del) {
        initComponents();
        this.del=del;
        refreshOrders();
        refreshDeliveryMen();
        //shipments=del.getVendorShipmentList();// getShipmentList();
        //refreshShipments();
        //refreshDeliveryMen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void refreshOrders(){
        ArrayList<Order> orders = del.getOrderList();// getVendorShipmentList();// getShipmentList();// getOrders();
        DefaultTableModel model = (DefaultTableModel) CartTable.getModel();
        jComboBox1.removeAllItems();
        model.setRowCount(0);
        for(Order o :orders){
            model.addRow(new Object[]{o.getOrderId(), o.getFc().getFulfillmentCenterId()});
            if(o.getStatus()==Order.Status.SentToLastMileDelivery)jComboBox1.addItem(o);
        }
    }
    
    private void refreshDeliveryMen(){
        List<LastMileDelivery> deliveryMen = EcoSystem.getInstance().getLmDeliveryMenDirectory().getLastMileDeliveryList();// getDeliveryManDirectory().getDeliveryManList();
        DeliveryMenList.removeAllItems();
        for(LastMileDelivery d : deliveryMen){
            if(d.getDeliveryByID().equals(del)&& d.getIsAvailable())DeliveryMenList.addItem(d);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CartTable = new javax.swing.JTable();
        DeliveryMenList = new javax.swing.JComboBox<>();
        AssignButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delivery Dashboard");

        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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

        DeliveryMenList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryMenListActionPerformed(evt);
            }
        });

        AssignButton.setBackground(new java.awt.Color(0, 0, 153));
        AssignButton.setForeground(new java.awt.Color(102, 204, 0));
        AssignButton.setText("Assign");
        AssignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Available Delivery Men");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Order ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(AssignButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(39, 39, 39))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DeliveryMenList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(50, 50, 50)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeliveryMenList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(AssignButton)
                .addContainerGap(321, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(422, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DeliveryMenListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryMenListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeliveryMenListActionPerformed

    private void AssignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignButtonActionPerformed
        // TODO add your handling code here:
        Order temp = (Order)jComboBox1.getSelectedItem();
        if (temp==null)return;
        lmDelivery = (LastMileDelivery) (DeliveryMen) DeliveryMenList.getSelectedItem();
        if (lmDelivery==null) return;
        temp.setLMDeliveryMan(lmDelivery);// setDeliveryMan(fmDelivery);
        temp.setStatus(Order.Status.AssignedToLastMileDeliveryMan);
        refreshOrders();
        refreshDeliveryMen();
    }//GEN-LAST:event_AssignButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignButton;
    private javax.swing.JTable CartTable;
    private javax.swing.JComboBox<LastMileDelivery> DeliveryMenList;
    private javax.swing.JComboBox<Order> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
