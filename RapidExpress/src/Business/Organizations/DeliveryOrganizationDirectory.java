/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.DirectDeliveryOrganization;
import Business.Organization;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class DeliveryOrganizationDirectory {
    private ArrayList<Organization> deliveryOrganizationList;
    private Delivery del;

    public DeliveryOrganizationDirectory() {
        deliveryOrganizationList = new ArrayList();
    }
    public void addDelOrg(Organization delOrg){
        this.deliveryOrganizationList.add(delOrg);
    }
    public ArrayList<Organization> geDeliveryOrganizationList() {
        return deliveryOrganizationList;
    }
    
    //public DeliveryOrganizationDirectory createOrganization(String realName, Delivery del){
    //    DirectDeliveryOrganization temp = new DirectDeliveryOrganization(realName, del);
    //    directDeliveryOrganizationList.add(temp);        
    //    return temp;
    //}
}
