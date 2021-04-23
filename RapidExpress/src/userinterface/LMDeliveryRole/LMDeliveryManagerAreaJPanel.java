/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LMDeliveryRole;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.ExtraFeatures.Mail.Mail;
import Business.POJO.Order;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.Role.DeliveryMen;
import Business.Role.FirstMileDelivery;
import Business.Role.LastMileDelivery;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.Role.ManagerLMDeliveryMenAdmin;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.table.DefaultTableModel;
import userinterface.CustomerRole.OrderPanel;

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

        jPanel1.setBackground(new java.awt.Color(139, 216, 189));

        jLabel1.setBackground(new java.awt.Color(36, 54, 101));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delivery Dashboard");
        jLabel1.setOpaque(true);

        CartTable.setBackground(new java.awt.Color(139, 216, 189));
        CartTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
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

        DeliveryMenList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeliveryMenList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryMenListActionPerformed(evt);
            }
        });

        AssignButton.setBackground(new java.awt.Color(255, 87, 87));
        AssignButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AssignButton.setForeground(new java.awt.Color(255, 255, 255));
        AssignButton.setText("Assign");
        AssignButton.setBorder(null);
        AssignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Available Delivery Men");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(DeliveryMenList, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(112, 112, 112)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115)
                            .addComponent(AssignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addContainerGap(556, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DeliveryMenList, jComboBox1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeliveryMenList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(560, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AssignButton, DeliveryMenList, jComboBox1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1277, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
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
        lmDelivery.setIsAvailable(false);
        temp.setStatus(Order.Status.AssignedToLastMileDeliveryMan);
        refreshOrders();
        refreshDeliveryMen();
        
        
        
        
        
        
        
        //send email
        String s="<p style=\"color:#001f3f\">"+temp.getCustomer().getFirstName()+" "+temp.getCustomer().getLastName()+"</p>"+"<p style=\"color:#001f3f\">Order details are as follows :</p><p></p><p></p>";
            String htmlCode=
         "<table width='100%' border='10' style=\"background-color:#DDDDDD\" BORDERCOLORLIGHT='#AAAAAA'  BORDERCOLORDARK='#DDDDDD' align='center'>"
                + "<tr align='center'>"
                + "<td style=\"color:#001f3f\"><b>Product Name<b></td>"
                + "<td style=\"color:#001f3f\"><b>Product Cost<b></td>"
                + "<td style=\"color:#001f3f\"><b>Vendor Name<b></td>"
                + "<td style=\"color:#001f3f\"><b>Order Status<b></td>"    
                + "</tr>";

            for(Product item:temp.getProductListInOrder()){                
                    htmlCode=htmlCode+"<tr align='center'>"+"<td>" + item.getProductName() + "</td>"
                                + "<td>" + item.getProductCost() + "</td>"
                                + "<td>" + item.getVendor().getVendorName()+"</td>"
                                +"<td>" + temp.getStatus()+"</td>"
                            +"</tr>";

                }
            htmlCode+="</table>";
            String ending="";
            

        try {
            Mail.sendMail("nishok217@gmail.com",htmlCode,"Order assigned to delivery man",s,ending);         
        } catch (MessagingException ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
