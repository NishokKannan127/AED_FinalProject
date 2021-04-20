/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.POJO;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.EnterpriseVendor.Vendor;
import Business.Role.Customer;
import Business.Role.Dock;
import Business.Role.FirstMileDelivery;
import Business.Role.LastMileDelivery;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nisho
 */
public class Order {
    int orderId;
    List<Product> productListInOrder;
    Customer customer;// - includes where to send the order since customer h
    String orderDateTime;
    String orderDeliveredDateTIme;
    private static int counter=0;
    private Status status;
    private String comment;
    private String timePlaced;
    private String timeCompleted;
    //fc is used to set which fc the products are to be sent to from the vendor
    private FulfillmentCenter fc;
    FirstMileDelivery fmDeliveryMan;
    LastMileDelivery lmDeliveryMan;
    LastMileOrganization lmLinked;
    Dock dockMan;
    public Dock getDockMan(){
        return this.dockMan;
    }
    public void setDockMan(Dock man){
        this.dockMan=man;
    }
    //float cost;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProductListInOrder() {
        return productListInOrder;
    }

    public void setProductListInOrder(List<Product> productListInOrder) {
        this.productListInOrder = productListInOrder;
    }

    public String getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(String orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public String getOrderDeliveredDateTIme() {
        return orderDeliveredDateTIme;
    }

    public void setOrderDeliveredDateTIme(String orderDeliveredDateTIme) {
        this.orderDeliveredDateTIme = orderDeliveredDateTIme;
    }

    public FulfillmentCenter getFc() {
        return fc;
    }

    public void setFc(FulfillmentCenter fc) {
        this.fc = fc;
    }
    
    public int getId() {
        return orderId;
    }
    public Order(Customer customer,List<Product> prod, Vendor ven){
        //orderId=++counter;
        this(prod);
        this.customer=customer;
        this.orderDateTime=new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date());
        this.status = Status.Pending;
        
    }
//    public Order(Customer customer, List<Product> productListInOrder){
        //orderId=++counter;
//        this.productListInOrder = new ArrayList<Product>();
//        this.productListInOrder=productListInOrder;
//        this.customer = customer;        
//        this.orderDateTime=new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date());
//        this.status = Status.Pending;
//    }
    public Order(List<Product> productListInOrder){
        orderId=++counter;
        this.productListInOrder = new ArrayList<Product>();
        this.productListInOrder=productListInOrder;
        this.orderDateTime=new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date());
        this.status = Status.Pending;
    }
    public List<Vendor> getVendorList(){
        List<Vendor> vendors = new ArrayList<Vendor>();
        for(Product p: this.productListInOrder){
            vendors.add(p.getVendor());
        }
        return vendors;
    }
    public void addProductToOrder(Product prod){
        this.productListInOrder.add(prod);
    }
    public void deleteProductFromOrder(Product prod){
        this.productListInOrder.remove(prod);
    }
    public int deleteProductFromOrderById(int id){
        int checkIfProductFound=0;
        for(Product r : this.productListInOrder){
            if(r.productId==id){
                checkIfProductFound=1;
                this.productListInOrder.remove(r);
                break;
            }
        }
        return checkIfProductFound;
    }
    public void addProductList(ArrayList<Product> productList){
        this.productListInOrder=productList;
    }
    public List<Product> returnProductList(){
        return this.productListInOrder;
    }
    public float returnCost(){
        return 0f;
    }
    
    public FirstMileDelivery getFMDeliveryMan() {
        return fmDeliveryMan;
    }

    public void setFMDeliveryMan(FirstMileDelivery deliveryMan) {
        this.fmDeliveryMan = deliveryMan;
    }
    public LastMileDelivery getLMDeliveryMan() {
        return lmDeliveryMan;
    }

    public void setLMDeliveryMan(LastMileDelivery deliveryMan) {
        this.lmDeliveryMan = deliveryMan;
    }
    public LastMileOrganization getLMLinked() {
        return lmLinked;
    }

    public void setLMLinked(LastMileOrganization hubLinked) {
        this.lmLinked = hubLinked;
    }
    
    
    @Override
    public String toString(){
        return ""+this.getOrderId();
    }
    
    
    
    
    public Customer getCustomer() {
        return customer;
    }

    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public String getTimePlaced() {
        return orderDateTime;
    }

    public void setTimePlaced(String timePlaced) {
        this.orderDateTime = timePlaced;
    }

    public String getTimeCompleted() {
        return timeCompleted;
    }

    public void setTimeCompleted(String timeCompleted) {
        this.timeCompleted = timeCompleted;
    }
    
    public enum Status{
        Pending("Pending"),
        Assigned("Assigned"),
        Active("Active"),
        Rejected("Rejected"),
        SentRequestToVendor("SentRequestToVendor"),
        Completed("Completed"),
        Picked("Picked"),
        Packed("Packed"),
        OrderConvertedToShipment("OrderConvertedToShipment"),
        SentToLastMile("SentToLastMile"),
        SentToLastMileDelivery("SentToLastMileDelivery"),
        AssignedToLastMileDeliveryMan("AssignedToLastMileDeliveryMan"),
        OrderSentToShipmentFromVendor("OrderSentToShipmentFromVendor"),
        SentToDock("SentToDock");
        
        private String value;
        private Status(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
}
