/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseDelivery;

import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.POJO.Shipment;
import Business.Role.Customer;
import Business.Role.DeliveryMen;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import java.util.ArrayList;
import Business.EnterpriseVendor.Vendor;
import Business.Organizations.FirstMileDeliveryOrganizationDirectory;
import Business.Organizations.LastMileDeliveryOrganizationDirectory;
import Business.POJO.Address;
import Business.POJO.Order;
import Business.POJO.VendorShipment;
import Business.Role.FirstMileDelivery;
import Business.Role.LastMileDelivery;
//import EnterpriseDelivery.Organization;
/**
 *
 * @author nisho
 */
public class Delivery extends Enterprise{
    //this will contain the DeliveryMentemp directory
//FulfillmentCenters list
//Hub list
//LastMile list
    int deliveryId;
    
    FulfillmentCenter fulfillmentCenterToCaterTo;

    public Delivery() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public FulfillmentCenter getFulfillmentCenterToCaterTo() {
        return fulfillmentCenterToCaterTo;
    }

    public void setFulfillmentCenterToCaterTo(FulfillmentCenter fulfillmentCenterToCaterTo) {
        this.fulfillmentCenterToCaterTo = fulfillmentCenterToCaterTo;
    }
    ArrayList<Vendor> vendor;//to deliver from vendor to fulfillment center
    ArrayList<HubAndLastMile> hubList;
    ArrayList<Shipment> shipmentList;
    ArrayList<VendorShipment> vendorShipmentList;
    ArrayList<Order> orderList;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    String name;
    FirstMileDeliveryOrganizationDirectory fmOrgDir;
    LastMileDeliveryOrganizationDirectory lmOrgDir;
    FirstMileDeliveryOrganization tempFM;
    LastMileDeliveryOrganization tempLM;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private static int ctr = 0;

    public Delivery(String nameOfCompany, Address address){
        super(nameOfCompany,EnterpriseType.Delivery, address);
        this.deliveryId=++ctr;
        //this.name=nameOfCompany;
        this.shipmentList=new ArrayList<Shipment>();
        this.vendorShipmentList=new ArrayList<VendorShipment>();
        this.fmOrgDir=new FirstMileDeliveryOrganizationDirectory();
        this.lmOrgDir=new LastMileDeliveryOrganizationDirectory();
        this.orderList=new ArrayList<Order>();
    }
    
    public FirstMileDeliveryOrganization addFMDeliveryOrgToDir(String fmOrg, Delivery d){
        tempFM=fmOrgDir.createOrganization(fmOrg, d);
        return tempFM;
    }
    public LastMileDeliveryOrganization addLMDeliveryOrgToDir(String lmOrg, Delivery d){
        tempLM=lmOrgDir.createOrganization(lmOrg, d);
        return tempLM;
    }
    
    public void addFMShipmentsToDelivery(VendorShipment ship){
        this.vendorShipmentList.add(ship);
    }
    public void addLMOrdersToDelivery(Order order){
        this.orderList.add(order);
    }
    public ArrayList<Shipment> getShipmentList(){
        return this.shipmentList;
    }
    public ArrayList<VendorShipment> getVendorShipmentList(){
        return this.vendorShipmentList;
    }
    
    public enum DeliveryType{
        FirstMile("V2FC"),
        LastMile("LM2Cust");
    
        
        
        private String value;
        
        private DeliveryType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
}
    public int getDeliveryId(){
        return deliveryId;
    }
    public void deliverFromVendorToFulfillmentCenter(Vendor vendor, FulfillmentCenter fc, DeliveryMen dm){
        
    }
    public void deliverFromFulfillmentCenterToHub(FulfillmentCenter fc, HubAndLastMile hub, DeliveryMen dm){
        
    }
    //public void deliverFromHubToLastMileStation(HubAndLastMile hub, LastMile lm, DeliveryMen dm){
        
    //}
    //public void deliverFromLastMileStatioToCustomer(LastMile lm, Customer cust, DeliveryMen dm){
        
    //}
    public void deliverFromVendorToCustomer(Vendor ven, Customer cust, DeliveryMen dm){
        
    }
}
