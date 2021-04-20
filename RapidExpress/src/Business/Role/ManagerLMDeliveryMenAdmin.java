/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import Business.UserAccount.User;

/**
 *
 * @author nisho
 */
public class ManagerLMDeliveryMenAdmin extends User{
    private Delivery delivery;
    LastMileDeliveryOrganization lastMileOrg;

    public LastMileDeliveryOrganization getLastMileOrg() {
        return lastMileOrg;
    }

    public void setLastMileDeliveryOrg(LastMileDeliveryOrganization lastMileOrg) {
        this.lastMileOrg = lastMileOrg;
    }
   // public Manager(){
        
   // }
    public Delivery getDelivery() {
        return delivery;
    }
    public void setDeliveryByID(int id){
        this.delivery=EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(id);// getRestaurantDirectory().getRestaurantById(id);
    }
    public int getDeliveryByID(int id){
        return EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(id).getDeliveryId();// getRestaurantDirectory().getRestaurantById(id).getId();
    }
    public void setDelivery(Delivery del) {
        this.delivery = del;
    }
    public ManagerLMDeliveryMenAdmin(int id){
        super(id);
    }
}
