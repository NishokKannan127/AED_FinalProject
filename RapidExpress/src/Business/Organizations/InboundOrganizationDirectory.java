/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.DirectDeliveryOrganization;
import java.util.ArrayList;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.Organization.InboundOrganization;

/**
 *
 * @author nisho
 */





public class InboundOrganizationDirectory {
    private ArrayList<InboundOrganization> inboundOrganizationList;
    private FulfillmentCenter fc;

    public InboundOrganizationDirectory() {
        inboundOrganizationList = new ArrayList();
    }

    public ArrayList<InboundOrganization> geDirectDeliveryOrganizationList() {
        return inboundOrganizationList;
    }
    
    public InboundOrganization createOrganization(String realName, FulfillmentCenter fc){
        InboundOrganization temp = new InboundOrganization(realName, fc);
        inboundOrganizationList.add(temp);  
        return temp;
    }
}
