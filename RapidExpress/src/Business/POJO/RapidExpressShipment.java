/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.POJO;

import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class RapidExpressShipment extends Shipment{
    ArrayList<Order> orderListInShipment;//this is used to deliver from vendor to FC
    
    public RapidExpressShipment(ArrayList<Order>orderListInShipment, Address srcAddress, Address destAddress, String shipmentCreatedTime, String shipmentDeliveredTime){
        super(srcAddress,destAddress,shipmentCreatedTime,shipmentDeliveredTime);
        this.orderListInShipment=orderListInShipment;
    }
    public void addOrderToShipment(Order order){
        this.orderListInShipment.add(order);
    }
    public void removeOrderFromShipment(Order order){
        this.orderListInShipment.remove(order);
    }
}
