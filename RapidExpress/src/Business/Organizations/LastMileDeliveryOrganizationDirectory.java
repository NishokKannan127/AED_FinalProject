/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class LastMileDeliveryOrganizationDirectory {
    private ArrayList<LastMileDeliveryOrganization> lmDeliveryOrganizationList;
    private Delivery del;
    
    public LastMileDeliveryOrganizationDirectory() {
        lmDeliveryOrganizationList = new ArrayList();
    }

    public ArrayList<LastMileDeliveryOrganization> geFMDeliverytOrganizationList() {
        return lmDeliveryOrganizationList;
    }
    
    public LastMileDeliveryOrganization createOrganization(String realName, Delivery del){
        LastMileDeliveryOrganization temp = new LastMileDeliveryOrganization(realName, del);
        lmDeliveryOrganizationList.add(temp);  
        return temp;
    }
}
