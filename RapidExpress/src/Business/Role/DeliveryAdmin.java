/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseVendor.Vendor;
import Business.UserAccount.User;

/**
 *
 * @author nisho
 */
public class DeliveryAdmin extends User{
    private Delivery delivery;
    public DeliveryAdmin(int id){
        super(id);
    }
    public Delivery getDelivery() {
        return delivery;
    }
    public void setDeliveryByID(int id){
        this.delivery=EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(id);// getVendorDirectory().getVendorById(id);//; getRestaurantDirectory().getRestaurantById(id);
    }
    public int getDeliveryByID(int id){
        return EcoSystem.getInstance().getVendorDirectory().getVendorById(id).getVendorId();// getId();
    }
    public void setDelivery(Delivery vendor) {
        this.delivery = vendor;
    }
    
}
