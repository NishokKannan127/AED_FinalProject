/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseHubAndLastMile;

//import Business.Organization.LastMile;
import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.Organizations.FirstMileDeliveryOrganizationDirectory;
import Business.Organizations.HubOrganizationDirectory;
import java.util.ArrayList;
import Business.Organizations.LastMile;
import Business.Organizations.LastMileDeliveryOrganizationDirectory;
import Business.Organizations.LastMileOrganizationDirectory;
import Business.POJO.Address;
import Business.POJO.FCShipment;
import Business.POJO.Order;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.Role.Customer;
import java.util.HashMap;

/**
 *
 * @author nisho
 */
public class HubAndLastMile extends Enterprise{
    FulfillmentCenter fc;

    public FulfillmentCenter getFc() {
        return fc;
    }
    ArrayList<Order> ordersToSendToLMStation;
    public void addOrdersToLM(Order order){
        this.ordersToSendToLMStation.add(order);
    }
    public ArrayList<Order> returnOrdersToSendToLM(){
        return this.ordersToSendToLMStation;
    }
    
    public void setFc(FulfillmentCenter fc) {
        this.fc = fc;
    }
    ArrayList<LastMile> lmList;

    public ArrayList<LastMile> getLmList() {
        return lmList;
    }

    public void setLmList(ArrayList<LastMile> lmList) {
        this.lmList = lmList;
    }

    public ArrayList<HubOrganization> getHubList() {
        return hubList;
    }

    public void setHubList(ArrayList<HubOrganization> hubList) {
        this.hubList = hubList;
    }
    ArrayList<HubOrganization> hubList;
    ArrayList<LastMileOrganization>lmOrgList;

    public ArrayList<LastMileOrganization> getLmOrgList() {
        return lmOrgList;
    }

    public void setLmOrgList(ArrayList<LastMileOrganization> lmOrgList) {
        this.lmOrgList = lmOrgList;
    }
    
    FirstMileDeliveryOrganization fmDelivery;
    
    HubAndLastMile hub;
    ArrayList<Customer> custList;
    
    LastMileDeliveryOrganization lmDelivery;
    
    
    ArrayList<Shipment>shipments;
    HashMap<String,Shipment>shipmentForHubCity;
    int hubAndLastMileId;
    private static int ctr=0;
    
    HubOrganizationDirectory hubOrgDir;

    public HubOrganizationDirectory getHubOrgDir() {
        return hubOrgDir;
    }

    public void setHubOrgDir(HubOrganizationDirectory hubOrgDir) {
        this.hubOrgDir = hubOrgDir;
    }

    public LastMileOrganizationDirectory getLmOrgDir() {
        return lmOrgDir;
    }

    public void setLmOrgDir(LastMileOrganizationDirectory lmOrgDir) {
        this.lmOrgDir = lmOrgDir;
    }
    LastMileOrganizationDirectory lmOrgDir;
    HubOrganization tempHub;
    LastMileOrganization templm;
    ArrayList<FCShipment>listOfShipmentsOfThisHAndLM;
    ArrayList<Order>listOfOrdersOfThisHAndLM;
    
   
    public HubAndLastMile(String nameOfCompany, Address address){
        super(nameOfCompany,EnterpriseType.HubAndLastMile, address);
        this.hubAndLastMileId=++ctr;
        this.ordersToSendToLMStation=new ArrayList<Order>();
        //this.name=nameOfCompany;
        this.listOfShipmentsOfThisHAndLM=new ArrayList<FCShipment>();
        this.shipments=new ArrayList<Shipment>();
        this.lmList=new ArrayList<LastMile>();
        this.hubList=new ArrayList<HubOrganization>();
        this.hubOrgDir=new HubOrganizationDirectory();
        this.lmOrgDir=new LastMileOrganizationDirectory();
        this.shipmentForHubCity=new HashMap<String,Shipment>();
        this.listOfOrdersOfThisHAndLM=new ArrayList<Order>();
    }
    public HubAndLastMile(){
        
    }
    public int getHubAndLastMileCenterId() {
        return hubAndLastMileId;
    }

    public void setHubAndLastMileCenterId(int hubAndLastMileId) {
        this.hubAndLastMileId = hubAndLastMileId;
    }
    public HubOrganization addHubOrgToDir(String hubOrg, HubAndLastMile hAndLM){
        tempHub=this.hubOrgDir.createOrganization(hubOrg, hAndLM);
        return tempHub;
    }
    public void addShipmentToHubAndLM(FCShipment ship){
        if(this.getEntAddress().getCity()==ship.getDestAddress().getCity())
            this.listOfShipmentsOfThisHAndLM.add(ship);
    }
    public ArrayList<FCShipment> returnShipmentList(){
        return this.listOfShipmentsOfThisHAndLM;
    }
    public ArrayList<Order> returnOrderList(){
        return this.listOfOrdersOfThisHAndLM;
    }
    public LastMileOrganization addLastMileOrgToDir(String lmOrg, HubAndLastMile hAndLM){
        templm=this.lmOrgDir.createOrganization(lmOrg, hAndLM);
        return templm;
    }
}
