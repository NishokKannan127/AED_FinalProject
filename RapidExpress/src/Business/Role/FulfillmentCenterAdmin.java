/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.UserAccount.User;

/**
 *
 * @author nisho
 */
public class FulfillmentCenterAdmin extends User{
    public FulfillmentCenterAdmin(int id, Enterprise ent){
        super(id);
        this.fc=(FulfillmentCenter) ent;
    }
    
    private FulfillmentCenter fc;
    public FulfillmentCenter getFC() {
        return fc;
    }
    public void setFCByID(int id){
        this.fc=EcoSystem.getInstance().getFcDirectory().getFCById(id);// getDeliveryDirectory().getDeliveryById(id);// getVendorDirectory().getVendorById(id);//; getRestaurantDirectory().getRestaurantById(id);
    }
    public int getFCByID(int id){
        return EcoSystem.getInstance().getVendorDirectory().getVendorById(id).getVendorId();// getId();
    }
    public void setFC(FulfillmentCenter fc) {
        this.fc = fc;
    }
}
