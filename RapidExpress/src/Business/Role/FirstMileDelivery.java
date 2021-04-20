/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseVendor.Vendor;
import Business.UserAccount.User;

/**
 *
 * @author nisho
 */
 public class FirstMileDelivery extends DeliveryMen{
    public FirstMileDelivery(int id){
        super(id);
    }
    public FulfillmentCenter fcDest;
    public Delivery del;
    FirstMileDeliveryOrganization firstMileOrg;

    public FirstMileDeliveryOrganization getFirstMileOrg() {
        return firstMileOrg;
    }

    public void setFirstMileDeliveryOrg(FirstMileDeliveryOrganization firstMileOrg) {
        this.firstMileOrg = firstMileOrg;
    }
    public void setDeliveryByID(int id){
        this.del=EcoSystem.getInstance().getDeliveryDirectory().getDeliveryById(id);// getVendorDirectory().getVendorById(id);
    }
    public Delivery getDeliveryByID(){
        return this.del;//.getVendorId();
    }
    public void setDelivery(Delivery del) {
        this.del = del;
    }
    public void setFCByID(int id){
        this.fcDest=EcoSystem.getInstance().getFcDirectory().getFCById(id);
    }
    public FulfillmentCenter getFCByID(){
        return this.fcDest;
    }
}
