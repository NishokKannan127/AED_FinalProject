/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterpriseVendor.Vendor;
import Business.UserAccount.User;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
/**
 *
 * @author nisho
 */
public class HubAndLastMileAdmin extends User{
    public HubAndLastMileAdmin(int id){
        super(id);
    }
    private HubAndLastMile hubAndLM;

   // public Manager(){
        
   // }
    public HubAndLastMile getHubAndLastMile() {
        return hubAndLM;
    }
    public void setHubAndLastMileByID(int id){
        this.hubAndLM=EcoSystem.getInstance().gethAndLmDir().getHubAndLMById(id);// getVendorDirectory().getVendorById(id);//; getRestaurantDirectory().getRestaurantById(id);
    }
    public int getHubAndLastMileByID(int id){
        return EcoSystem.getInstance().gethAndLmDir().getHubAndLMById(id).getHubAndLastMileCenterId();//getVendorDirectory().getVendorById(id).getVendorId();// getId();
    }
    public void setHubAndLastMile(HubAndLastMile hAndLm) {
        this.hubAndLM = hAndLm;
    }
}
