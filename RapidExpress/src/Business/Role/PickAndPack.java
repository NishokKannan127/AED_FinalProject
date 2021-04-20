/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.POJO.Order;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.UserAccount.User;
import java.util.ArrayList;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import java.util.HashMap;

/**
 *
 * @author nisho
 */
public class PickAndPack extends User{
    ArrayList<Product> listOfProductsRecieved;
    ArrayList<Order> listOfCustomerOrders;
    HashMap<Order,String>orderAndStatus;
    ArrayList<Order> listOfPackedOrders;//this is the output
    FulfillmentCenter fc;
    OutboundOrganization outOrg;

    public FulfillmentCenter getFC() {
        return fc;
    }
    private boolean isAvailable=true; 

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public OutboundOrganization getOutboundOrg(){
        return outOrg;
    }
    public void setOutboundOrg(OutboundOrganization outOrg){
        this.outOrg=outOrg;
    }
    public void setFC(FulfillmentCenter fc) {
        this.fc = fc;
    }
    public PickAndPack(int id){
        super(id);
    }
    public ArrayList<Order>getAllOrdersPlacedForThisFC(){
        return this.fc.getOrderListToSend();
    }
}
