/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseDelivery;

import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Organization.DirectDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.POJO.Shipment;
import Business.Role.Customer;
import Business.Role.DeliveryMen;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import java.util.ArrayList;
import Business.EnterpriseVendor.Vendor;
import Business.Organizations.DeliveryOrganizationDirectory;
import Business.Organizations.DirectDeliveryOrganizationDirectory;
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
    public ArrayList<Order> getDirectDeliveryOrderList(){
        return this.directDeliveryOrderList;
    }
    ArrayList<Order>directDeliveryOrderList;
    public void setDirectDeliveryOrderList(ArrayList<Order> orderList){
        this.directDeliveryOrderList=orderList;
    }
    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    String name;
    FirstMileDeliveryOrganizationDirectory fmOrgDir;
    DeliveryOrganizationDirectory delOrgDir;
    LastMileDeliveryOrganizationDirectory lmOrgDir;
    DirectDeliveryOrganizationDirectory dirOrgDir;
    FirstMileDeliveryOrganization tempFM;
    LastMileDeliveryOrganization tempLM;
    DirectDeliveryOrganization tempdirdel;
    
    
    private static int ctr = 0;

    public Delivery(String nameOfCompany, Address address){
        super(nameOfCompany,EnterpriseType.Delivery, address);
        this.deliveryId=++ctr;
        this.name=nameOfCompany;
        this.delOrgDir=new DeliveryOrganizationDirectory();
        this.shipmentList=new ArrayList<Shipment>();
        this.vendorShipmentList=new ArrayList<VendorShipment>();
        this.fmOrgDir=new FirstMileDeliveryOrganizationDirectory();
        this.lmOrgDir=new LastMileDeliveryOrganizationDirectory();
        this.dirOrgDir=new DirectDeliveryOrganizationDirectory();
        this.orderList=new ArrayList<Order>();
        this.directDeliveryOrderList=new ArrayList<Order>();
    }
    public DirectDeliveryOrganizationDirectory getDirDeliveryOrgDir(){
        return this.dirOrgDir;
    }
    public LastMileDeliveryOrganizationDirectory getLastDeliveryOrgDir(){
        return this.lmOrgDir;
    }
     public DeliveryOrganizationDirectory getDelOrgDir(){
        return this.delOrgDir;
    }
    public FirstMileDeliveryOrganizationDirectory getFirstDeliveryOrgDir(){
        return this.fmOrgDir;
    }
    public FirstMileDeliveryOrganization addFMDeliveryOrgToDir(String fmOrg, Delivery d){        
        tempFM=fmOrgDir.createOrganization(fmOrg, d);
        this.delOrgDir.addDelOrg(tempFM);
        return tempFM;
    }
    public LastMileDeliveryOrganization addLMDeliveryOrgToDir(String lmOrg, Delivery d){
        tempLM=lmOrgDir.createOrganization(lmOrg, d);
        this.delOrgDir.addDelOrg(tempFM);
        return tempLM;
    }
    public DirectDeliveryOrganization addDirDeliveryOrgToDir(String dirOrg, Delivery d){
        tempdirdel=dirOrgDir.createOrganization(dirOrg, d);
        this.delOrgDir.addDelOrg(tempFM);
        return tempdirdel;
    }
    
    public void addFMShipmentsToDelivery(VendorShipment ship){
        this.vendorShipmentList.add(ship);
    }
    public void addDirectDelShipmentsToDelivery(Order order){
        
    }
    public void addLMOrdersToDelivery(Order order){
        this.orderList.add(order);
    }
    public void addDirectDeliveryOrdersToDelivery(Order order){
        this.directDeliveryOrderList.add(order);
    }
    public ArrayList<Shipment> getShipmentList(){
        return this.shipmentList;
    }
    public ArrayList<VendorShipment> getVendorShipmentList(){
        return this.vendorShipmentList;
    }
    @Override
        public String toString(){
        return name;
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
