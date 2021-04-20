/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.Organization.InboundOrganization;
import Business.POJO.Product;
import Business.POJO.Shipment;
import Business.POJO.VendorShipment;
import Business.UserAccount.User;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author nisho
 */
public class Stow extends User{
    ArrayList<Product> listOfProductsRecieved;
    ArrayList<VendorShipment> listOfShipmentsRecieved;
    //HashMap<Shipment,String>shipmentAndStatus;
    HashMap<Product,String>producttAndStatus;
    FulfillmentCenter fc;

    InboundOrganization inOrg;

    public InboundOrganization getInboundOrg(){
        return inOrg;
    }
    public void setInboundOrg(InboundOrganization inOrg){
        this.inOrg=inOrg;
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
    public Stow(int id){
        super(id);
        this.listOfProductsRecieved = new ArrayList<Product>();
        this.listOfShipmentsRecieved = new ArrayList<VendorShipment>();
    }
    public void addProductToStowQueue(Product prod){
        this.listOfProductsRecieved.add(prod);
    }
    public void convertShipmentItemsToProductList(){
        for(int i=0; i<listOfShipmentsRecieved.size();i++){            
            for(Product prod:listOfShipmentsRecieved.get(i).getProductsInShipment()){
                listOfProductsRecieved.add(prod);
        }
        }
    }
    public ArrayList<Product> getProductList(){
        return this.listOfProductsRecieved;
    }
    
    
}
