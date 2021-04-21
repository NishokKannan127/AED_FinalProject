/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseFulfillmentCenter;

import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseFulfillmentCenter.Organization.InboundOrganization;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import Business.POJO.Address;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.Organizations.HubOrganizationDirectory;
import Business.Organizations.InboundOrganizationDirectory;
import Business.Organizations.LastMileOrganizationDirectory;
import Business.Organizations.OutboundOrganizationDirectory;
import Business.POJO.Order;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.Role.Recieve;
import Business.Role.Stow;
import java.util.ArrayList;
import java.util.List;
import Business.Role.PickAndPack;
import Business.Role.Dock;
import Business.Role.FCManager;
import java.util.HashMap;

/**
 *
 * @author nisho
 */
public class FulfillmentCenter extends Enterprise{
    ArrayList<Order> orderListToSend;    
    HashMap<Product,Integer> productsAndQuantity;
    ArrayList<VendorShipment> vendShip;
    HubAndLastMile hubAndLMEnterpriseConnectedTo;

    public HubAndLastMile getHubAndLMEnterpriseConnectedTo() {
        return hubAndLMEnterpriseConnectedTo;
    }

    public void setHubAndLMEnterpriseConnectedTo(HubAndLastMile hubAndLMEnterpriseConnectedTo) {
        this.hubAndLMEnterpriseConnectedTo = hubAndLMEnterpriseConnectedTo;
    }

    public HashMap<Product, Integer> getProductsAndQuantity() {
        return productsAndQuantity;
    }
    public Integer getQuantityOfProduct(Product prod){
        return this.productsAndQuantity.get(prod);
    }
    public void addProduct(Product prod){
        if(productsAndQuantity.containsKey(prod)){
            productsAndQuantity.put(prod,productsAndQuantity.get(prod)+1);
        }
        else{
            productsAndQuantity.put(prod,1);
        }
    }
    public void addVendorShipment(VendorShipment vendorShi){
        this.vendShip.add(vendorShi);
    }
    public void removeProduct(Product prod){
        if(productsAndQuantity.containsKey(prod)){
            if(productsAndQuantity.get(prod)>0){
                productsAndQuantity.put(prod,productsAndQuantity.get(prod)-1);
            }
            else{
                System.out.println("Quantity less than 0");
            }
        }
        else{
            System.out.println("Product not present in FC");
        }
    }
    public void setProductsAndQuantity(HashMap<Product, Integer> productsAndQuantity) {
        this.productsAndQuantity = productsAndQuantity;
    }
    Delivery deliveryCompenyAssociatedToFC;

    public Delivery getDeliveryCompenyAssociatedToFC() {
        return deliveryCompenyAssociatedToFC;
    }

    public void setDeliveryCompenyAssociatedToFC(Delivery deliveryCompenyAssociatedToFC) {
        this.deliveryCompenyAssociatedToFC = deliveryCompenyAssociatedToFC;
    }
    ArrayList<Shipment> shipmentList;
    ArrayList<VendorShipment> vendorDeliveryList;
    ArrayList<HubAndLastMile> hubList;
    Stow stow;
    Recieve recieve;
    PickAndPack pickAndPack;
    Dock dock;
    //Address address;
    int fulfillmentCenterId;
    private static int counter=0;
    String name;
    ArrayList<Order> ordersToShipToCustomers;
    FCManager fcManager;

    public FCManager getFcManager() {
        return fcManager;
    }

    public void setFcManager(FCManager fcManager) {
        this.fcManager = fcManager;
    }
    //FulfillmentByRapidExpressOrganizationDirectory fulfillByREOrgDir;
    InboundOrganizationDirectory inOrgDir;
    OutboundOrganizationDirectory outOrgDir;
    InboundOrganization inboundTempOrg;
    OutboundOrganization outboundTempOrg;
    //List<items which vendor sent> recieve;
   //stow
    //pick and pack
    //dock - allocate based on location
    //List<Hub>

    public ArrayList<Order> getOrdersToShipToCustomers() {
        return ordersToShipToCustomers;
    }

    public void setOrdersToShipToCustomers(ArrayList<Order> ordersToShipToCustomers) {
        this.ordersToShipToCustomers = ordersToShipToCustomers;
    }
    
    public FulfillmentCenter(String name, Address address){
        super(name,EnterpriseType.FulfillmentCenter,  address);
        fulfillmentCenterId=++counter;
//        this.address=address;
        this.name=name;
        this.inOrgDir=new InboundOrganizationDirectory();
        this.outOrgDir=new OutboundOrganizationDirectory();
        this.orderListToSend=new ArrayList<Order>();
        this.productsAndQuantity=new HashMap<Product,Integer>();
        this.vendShip=new ArrayList<VendorShipment>();
//        this.inboundTempOrg=new InboundOrganization();
//        this.outboundTempOrg=new OutboundOrganization();
    }
    public FulfillmentCenter(){
        
    }
    public InboundOrganizationDirectory getInboundOrgDirectory(){
        return this.inOrgDir;
    }
    public OutboundOrganizationDirectory getOutboundOrgDirectory(){
        return this.outOrgDir;
    }
    public InboundOrganization addInboundOrgToDir(String inOrg, FulfillmentCenter d){
        inboundTempOrg=inOrgDir.createOrganization(inOrg, d);
        return inboundTempOrg;
        
    }
    public OutboundOrganization addOutboundOrgToDir(String outOrg, FulfillmentCenter d){
        outboundTempOrg=outOrgDir.createOrganization(outOrg, d);
        return outboundTempOrg;
    }
    //inventory
    
    
    //collate delivery by vendors based on order it and pick and pack
    
    
    
    
    //List<Orders>
    //List<Shipment>
    //List<items which vendor sent> recieve;
   //stow
    //pick and pack
    //dock - allocate based on location
    //List<Hub>
    
    //inventory
    
    public void addOrderToOrderList(Order order){
        this.orderListToSend.add(order);
    }
    //collate delivery by vendors based on order it and pick and pack
    public ArrayList<Order> getOrderListToSend() {
        return orderListToSend;
    }

    public void setOrderListToSend(ArrayList<Order> orderListToSend) {
        this.orderListToSend = orderListToSend;
    }

    public ArrayList<Shipment> getShipmentList() {
        return shipmentList;
    }

    public void setShipmentList(ArrayList<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }

    public ArrayList<VendorShipment> getVendorDeliveryList() {
        return vendorDeliveryList;
    }

    public void setVendorDeliveryList(ArrayList<VendorShipment> vendorDeliveryList) {
        this.vendorDeliveryList = vendorDeliveryList;
    }

    public ArrayList<HubAndLastMile> getHubList() {
        return hubList;
    }

    public void setHubList(ArrayList<HubAndLastMile> hubList) {
        this.hubList = hubList;
    }

    public Stow getStow() {
        return stow;
    }

    public void setStow(Stow stow) {
        this.stow = stow;
    }

    public Recieve getRecieve() {
        return recieve;
    }

    public void setRecieve(Recieve recieve) {
        this.recieve = recieve;
    }

    public PickAndPack getPickAndPack() {
        return pickAndPack;
    }

    public void setPickAndPack(PickAndPack pickAndPack) {
        this.pickAndPack = pickAndPack;
    }

    public Dock getDock() {
        return dock;
    }

    public void setDock(Dock dock) {
        this.dock = dock;
    }

    

    public int getFulfillmentCenterId() {
        return fulfillmentCenterId;
    }

    public void setFulfillmentCenterId(int fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        FulfillmentCenter.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
