/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DirectDelivery.DirectDeliveryMan;

//import Business.WorkQueue.LabTestWorkRequest;

import userinterface.LMDeliveryRole.LMDeliveryMan.*;
import userinterface.FMDeliveryRole.FMDeliveryMan.*;
import Business.EnterpriseDelivery.Delivery;
import Business.ExtraFeatures.Mail.Mail;
import Business.POJO.Order;
import Business.POJO.Product;
import Business.POJO.VendorShipment;
import Business.Role.DirectDelivery;
import Business.Role.FirstMileDelivery;
import Business.Role.LastMileDelivery;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */


public class OrderPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    //LabTestWorkRequest request;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    //public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request) {
    //    initComponents();
    //    this.userProcessContainer = userProcessContainer;
    //    this.request = request;
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    DirectDelivery lmDeliveryMan;
    private Delivery delivery;
    ArrayList<Order> orders;
    
    public OrderPanel(DirectDelivery d){
        initComponents();
        this.delivery = d.getDeliveryByID();// getRestaurant();
        this.lmDeliveryMan = d;
        this.orders = delivery.getDirectDeliveryOrderList();// OrderList();
        refreshOrders();
        
        displayPicture();
        
//        initComponents();
//        this.delivery = d.getDeliveryByID();// getRestaurant();
//        this.fmDeliveryMan = d;
       //        fc= this.delivery.getFulfillmentCenterToCaterTo();// d.getFCByID();// delivery.getVendorShipmentList().get(0).getFc();// getFCId();//this.fmDeliveryMan.getFCByID();
       //        this.fmDeliveryMan.setFCByID(fc.getFulfillmentCenterId());
       //        refreshShipments();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FullDetailsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(139, 216, 189));
        setMinimumSize(new java.awt.Dimension(394, 281));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FullDetailsButton.setBackground(new java.awt.Color(255, 102, 102));
        FullDetailsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FullDetailsButton.setForeground(new java.awt.Color(255, 255, 255));
        FullDetailsButton.setText("Full Order Details");
        FullDetailsButton.setBorder(null);
        FullDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullDetailsButtonActionPerformed(evt);
            }
        });
        add(FullDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 150, 30));

        jLabel4.setBackground(new java.awt.Color(36, 54, 101));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("My Orders");
        jLabel4.setOpaque(true);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 40));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 69, 30));

        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 68, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deliver Order ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Activate Order ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 20));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Deliver");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 110, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Activate");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 110, 30));

        jTable1.setBackground(new java.awt.Color(139, 216, 189));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer Id", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 350, 120));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 150, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshOrders(){
        //ArrayList<Order> orders = delivery.getVendorShipmentList();// getOrders();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        model.setRowCount(0);
        for(Order o :orders){
            if(o.getDirectDeliveryMan()!=null && o.getDirectDeliveryMan().equals(this.lmDeliveryMan) && o.getStatus()!=Order.Status.Completed)
                model.addRow(new Object[]{o.getId(), o.getCustomer().getId(),o.getStatus()});
            else continue;
            if(o.getStatus()==Order.Status.AssignedToDirectDeliveryMan)jComboBox2.addItem(o);
            if(o.getStatus()==Order.Status.Active)jComboBox1.addItem(o);
        }
    }
    
    private void FullDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullDetailsButtonActionPerformed
        Order temp=null;
        for(Order o : this.orders){
            int column = 0;
            int row = jTable1.getSelectedRow();
            int selectedId = (Integer)jTable1.getModel().getValueAt(row, column);
            if(o.getId()==selectedId){
                temp = o;
                break;
            }
        }
        if (temp==null)return;
        OrderDetailsPopup popup = new OrderDetailsPopup(temp);
        popup.setBounds(500, 500, 347, 440);
        JOptionPane jop = new JOptionPane();
        JDialog dialog = jop.createDialog("Order Details");
        dialog.setSize(347, 440);
        dialog.setContentPane(popup);
        dialog.setVisible(true);

    }//GEN-LAST:event_FullDetailsButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Order o = (Order) jComboBox1.getSelectedItem();
        o.setStatus(Order.Status.Completed);
        o.setOrderDeliveredDateTIme((new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date())));
        lmDeliveryMan.setIsAvailable(true);// setAvailable(true);
        refreshOrders();
        



        //String y="";
        //    for(Product item:o.getProductListInOrder()){
        //        y+=item.getProductName()+"                  "+item.getProductCost()+"               "+item.getVendor().getVendorName()+"\n";
        //    }
            //String s = o.getCustomer().getFirstName()+" "+o.getCustomer().getLastName()+"\n"+"Order items are as follows :- "+"\n"+"\n"+"Product name      "+"Product cost      "+"Vendor name      "+"\n"+"\n"+y+"\n"+"\n"+"Thank you for shopping with us!";
       
            String s="<p style=\"color:#001f3f\">"+o.getCustomer().getFirstName()+" "+o.getCustomer().getLastName()+"</p>"+"<p style=\"color:#001f3f\">Order details are as follows :</p><p></p><p></p>";
            String htmlCode=
         "<table width='100%' border='10' style=\"background-color:#DDDDDD\" BORDERCOLORLIGHT='#AAAAAA'  BORDERCOLORDARK='#DDDDDD' align='center'>"
                + "<tr align='center'>"
                + "<td style=\"color:#001f3f\"><b>Product Name<b></td>"
                + "<td style=\"color:#001f3f\"><b>Product Cost<b></td>"
                + "<td style=\"color:#001f3f\"><b>Vendor Name<b></td>"
                + "<td style=\"color:#001f3f\"><b>Order Status<b></td>"    
                + "</tr>";

            for(Product item:o.getProductListInOrder()){                
                    htmlCode=htmlCode+"<tr align='center'>"+"<td>" + item.getProductName() + "</td>"
                                + "<td>" + item.getProductCost() + "</td>"
                                + "<td>" + item.getVendor().getVendorName()+"</td>"
                                +"<td>" + o.getStatus()+"</td>"
                            +"</tr>";

                }
            htmlCode+="</table>";
            String ending="<p></p><p></p><p style=\"color:#001f3f\"> Thank you for shopping with us! </p>";
            

        try {
            Mail.sendMail("nishok217@gmail.com",htmlCode,"Order Placed",s,ending);         
        } catch (MessagingException ex) {
            Logger.getLogger(userinterface.CustomerRole.OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

// try {
       //     Mail.sendMail("nishok127@gmail.com",s,"Order Delivered");
       // } catch (MessagingException ex) {
       //     Logger.getLogger(userinterface.CustomerRole.OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
       // }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Order o = (Order) jComboBox2.getSelectedItem();
        o.setStatus(Order.Status.Active);
        lmDeliveryMan.setIsAvailable(false);
        refreshOrders();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FullDetailsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Order> jComboBox1;
    private javax.swing.JComboBox<Order> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
private void displayPicture(){

        scaleIcon(219, 164, "F:\\AED_Final\\AED_FinalProject\\RapidExpress\\src\\uimages\\cartimg1.jpg", jLabel6);
    }
   
    public void scaleIcon(int Width, int height, String imgPath, javax.swing.JLabel iconimg){
        File file = new File(imgPath);
        String absolutePath = file.getAbsolutePath();
        ImageIcon image = new ImageIcon(absolutePath);
        System.out.println(absolutePath);
        Image icon = image.getImage();
        icon = icon.getScaledInstance(Width, height, Image.SCALE_SMOOTH);
        image = new ImageIcon(icon);
        jLabel6.setIcon(image);
        jLabel6.setText("");
    }

}
