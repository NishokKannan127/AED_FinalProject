/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.POJO;

import Business.EnterpriseVendor.Vendor;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class VendorShipment extends Shipment{
    Vendor vendor;
    ArrayList<Product> productListInShipment;//this is used to deliver from vendor to FC
    ArrayList<Order> orderListInShipment;//this is used to deliver from vendor to FC updated
    int shipmentId;//- shipment contains the list of orders ordered by folks in the nearby region
    //dock makes shipments based on location
    //pick and pack combines orders
//    FulfillmentCenter fc;
    //int source
    private static int counter=0;
    Address sourceAddress;
    Address destAddress;
    String shipmentCreatedTime;
    String shipmentDeliveredTime;
    
    //public VendorShipment(ArrayList<Product>productListInShipment, Address srcAddress, Address destAddress, String shipmentCreatedTime, String shipmentDeliveredTime){
    //    super(srcAddress,destAddress,shipmentCreatedTime,shipmentDeliveredTime);
    //    this.productListInShipment=productListInShipment;
    //}
    public VendorShipment(ArrayList<Order>orderListInShipment, Address srcAddress, Address destAddress, String shipmentCreatedTime, String shipmentDeliveredTime){
        super(srcAddress,destAddress,shipmentCreatedTime,shipmentDeliveredTime);
        this.orderListInShipment=orderListInShipment;
        this.productListInShipment=new ArrayList<Product>();
    }
    public int getFCId(){
        return this.orderListInShipment.get(0).getFc().getFulfillmentCenterId();
    }
    public ArrayList<Order>getOrderList(){
        return orderListInShipment;
    }
    public void addProductToShipment(Product prod){
        this.productListInShipment.add(prod);
    }
    public void removeProductFromShipment(Product prod){
        this.productListInShipment.remove(prod);
    }
    public ArrayList<Product> getProductsInShipment(){
        this.productListInShipment=new ArrayList<Product>();
        for(int i=0;i<this.orderListInShipment.size();i++){
            for(int j=0;j<this.orderListInShipment.get(i).getProductListInOrder().size();j++){
                this.productListInShipment.add(orderListInShipment.get(i).getProductListInOrder().get(j));
            }
        }
        return this.productListInShipment;
    }
    
}
