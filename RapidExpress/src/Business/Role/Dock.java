/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import Business.POJO.Order;
import Business.POJO.Shipment;
import Business.UserAccount.User;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class Dock extends User{
    
    ArrayList<Order> listOfPackedOrders;
    ArrayList<Shipment>listOfShipments;
    FulfillmentCenter fc;
    OutboundOrganization outOrg;

    public OutboundOrganization getOutboundOrg(){
        return outOrg;
    }
    public void setOutboundOrg(OutboundOrganization outOrg){
        this.outOrg=outOrg;
    }
private boolean isAvailable=true; 

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public FulfillmentCenter getFC() {
        return fc;
    }

    public void setFC(FulfillmentCenter fc) {
        this.fc = fc;
    }
    public Dock(int id){
        super(id);
        listOfPackedOrders=new ArrayList<Order>();
        listOfShipments=new ArrayList<Shipment>();
    }
    public void addPackedOrders(Order order){
        this.listOfPackedOrders.add(order);
    }
    public ArrayList<Order> getPackedOrderList(){
        return this.listOfPackedOrders;
    }
}
