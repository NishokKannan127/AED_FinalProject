/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.POJO.Routes;
import Business.UserAccount.User;

/**
 *
 * @author nisho
 */
public class LastMileDelivery extends DeliveryMen{
    Routes route;
    public LastMileDelivery(int id){
        super(id);
    }
    public FulfillmentCenter fcOrig;
    public Delivery del;
    LastMileDeliveryOrganization lastMileOrg;

    public LastMileDeliveryOrganization getLastMileOrg() {
        return lastMileOrg;
    }

    public void setLastMileDeliveryOrg(LastMileDeliveryOrganization lastMileOrg) {
        this.lastMileOrg = lastMileOrg;
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
        this.fcOrig=EcoSystem.getInstance().getFcDirectory().getFCById(id);
    }
    public FulfillmentCenter getFCByID(){
        return this.fcOrig;
    }
    public void setDestinationOfDelivery(){
        
    }
}
