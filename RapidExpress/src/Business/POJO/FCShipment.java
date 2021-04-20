/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.POJO;

import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class FCShipment extends Shipment{// extends Shipment{
    HubOrganization hubLinked;
    HubAndLastMile hubAndLMLinked;

    public HubAndLastMile getHubAndLMLinked() {
        return hubAndLMLinked;
    }

    public void setHubAndLMLinked(HubAndLastMile hubAndLMLinked) {
        this.hubAndLMLinked = hubAndLMLinked;
    }

    

    public HubOrganization getHubLinked() {
        return hubLinked;
    }

    public void setHubLinked(HubOrganization hubLinked) {
        this.hubLinked = hubLinked;
    }


    

    public ArrayList<Order> getOrderListInShipment() {
        return orderListInShipment;
    }

    public void setOrderListInShipment(ArrayList<Order> orderListInShipment) {
        this.orderListInShipment = orderListInShipment;
    }
    ArrayList<Order> orderListInShipment;
    public void addOrderInShipment(Order order){
        this.orderListInShipment.add(order);
    }
    public FCShipment(Address srcAddress, Address destAddress, String shipmentCreatedTime, String shipmentDeliveredTime){
        super(srcAddress, destAddress, shipmentCreatedTime, shipmentDeliveredTime);
        orderListInShipment=new ArrayList<Order>();
    }
    
}
