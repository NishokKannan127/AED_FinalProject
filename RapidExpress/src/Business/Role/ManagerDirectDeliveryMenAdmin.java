/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.DirectDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.UserAccount.User;

/**
 *
 * @author nisho
 */
public class ManagerDirectDeliveryMenAdmin extends User{
    private Delivery delivery;
    DirectDeliveryOrganization dirOrg;

    public DirectDeliveryOrganization getDirDelOrg() {
        return dirOrg;
    }

    public void setDirDeliveryOrg(DirectDeliveryOrganization dirOrg) {
        this.dirOrg = dirOrg;
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
    public ManagerDirectDeliveryMenAdmin(int id){
        super(id);
    }
}
