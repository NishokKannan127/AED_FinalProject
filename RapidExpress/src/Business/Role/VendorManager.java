/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterpriseVendor.Vendor;
import Business.UserAccount.User;

/**
 *
 * @author nisho
 */
public class VendorManager extends User{
    public VendorManager(int id){
        super(id);
    }
    private Vendor vendor;
    public Vendor getVendor() {
        return vendor;
    }
    public void setVendorByID(int id){
        this.vendor=EcoSystem.getInstance().getVendorDirectory().getVendorById(id);//; getRestaurantDirectory().getRestaurantById(id);
    }
    public int getVendorByID(int id){
        return EcoSystem.getInstance().getVendorDirectory().getVendorById(id).getVendorId();// getId();
    }
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
