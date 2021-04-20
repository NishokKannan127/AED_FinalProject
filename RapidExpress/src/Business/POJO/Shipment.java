/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.POJO;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.Role.FirstMileDelivery;
import Business.Role.LastMileDelivery;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public abstract class Shipment{
    int shipmentId;
    //ArrayList<Order> orderListInShipment;//- shipment contains the list of orders ordered by folks in the nearby region
    //dock makes shipments based on location
    //pick and pack combines orders
//    FulfillmentCenter fc;
    //int source
    //ArrayList<Product> productListInShipment;
    private static int counter=0;
    Address sourceAddress;
    private Status status;
    
    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Address getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(Address sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public Address getDestAddress() {
        return destAddress;
    }

    public void setDestAddress(Address destAddress) {
        this.destAddress = destAddress;
    }

    public String getShipmentCreatedTime() {
        return shipmentCreatedTime;
    }

    public void setShipmentCreatedTime(String shipmentCreatedTime) {
        this.shipmentCreatedTime = shipmentCreatedTime;
    }

    public String getShipmentDeliveredTime() {
        return shipmentDeliveredTime;
    }

    public void setShipmentDeliveredTime(String shipmentDeliveredTime) {
        this.shipmentDeliveredTime = shipmentDeliveredTime;
    }
    Address destAddress;
    String shipmentCreatedTime;
    String shipmentDeliveredTime;
    FirstMileDelivery fmDeliveryMan;
    LastMileDelivery lmDeliveryMan;
    FulfillmentCenter fc;

    public FulfillmentCenter getFc() {
        return fc;
    }

    public void setFc(FulfillmentCenter fc) {
        this.fc = fc;
    }
    public Shipment(Address srcAddress, Address destAddress, String shipmentCreatedTime, String shipmentDeliveredTime){
        shipmentId=++counter;
        //this.orderListInShipment=new ArrayList<Order>();
        //this.orderListInShipment=orderListInShipment;
        this.sourceAddress=srcAddress;
        this.destAddress=destAddress;
        this.shipmentCreatedTime=shipmentCreatedTime;
        this.shipmentDeliveredTime=shipmentDeliveredTime;
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
    public enum Status{
        Pending("Pending"),
        Assigned("Assigned"),
        Active("Active"),
        Rejected("Rejected"),
        ArrivedAtFC("ArrivedAtRecieveCenter"),
        NotArrivedAtFC("HaventArrivedAtRecieveCenter"),
        Recieved("Recieved"),
        ProductsSentToStowQueue("ProductsSentToStowQueue"),
        AtHub("AtHub"),
        AssignedToHub("AssignedToHub"),
        AtLastMile("AtLastMile"),
        AssignedToLastMile("AssignedToLastMile"),
        ProductsAddedToFCInventory("ProductsAddedToFCInventory"),
        SentToHub("SentToHub"),
        Completed("Completed");
        
        private String value;
        private Status(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return ""+this.getShipmentId();
    }
    
    
//    sourceaddress,destaddress,shipmentcreatedtime,shipmentdeliveredtime
            //ArrayList<Product> productListInShipment;//this is used to deliver from vendor to FC
}
