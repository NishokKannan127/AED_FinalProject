/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.Organization.InboundOrganization;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.POJO.Shipment.Status;
import Business.UserAccount.User;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author nisho
 */
public class Recieve extends User{
    ArrayList<Shipment> listOfShipmentsRecieved;
    //HashMap<Shipment,String>shipmentAndStatus;
    Shipment currentShipment;
    FulfillmentCenter fc;
private boolean isAvailable=true; 

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    InboundOrganization inOrg;

    public InboundOrganization getInboundOrg(){
        return inOrg;
    }
    public void setInboundOrg(InboundOrganization inOrg){
        this.inOrg=inOrg;
    }

    public FulfillmentCenter getFC() {
        return fc;
    }

    public void setFC(FulfillmentCenter fc) {
        this.fc = fc;
    }
    Product prod;
    public Recieve(int id){
        super(id);
    }
    public void addProductsThatAreRecieved(Product prod){
        this.prod=prod;
    }
    public void setShipmentStatus(Status status){
        currentShipment.setStatus(status);
    }
    public Status getShipmentStatus(){
        return this.currentShipment.getStatus();
    }
    
}
