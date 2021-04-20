/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.DirectDeliveryOrganization;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import java.util.ArrayList;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;

/**
 *
 * @author nisho
 */
public class OutboundOrganizationDirectory {
    private ArrayList<OutboundOrganization> outboundOrganizationList;
    private FulfillmentCenter fc;

    public OutboundOrganizationDirectory() {
        outboundOrganizationList = new ArrayList();
    }

    public ArrayList<OutboundOrganization> getOutboundOrganizationList() {
        return outboundOrganizationList;
    }
    
    public OutboundOrganization createOrganization(String realName, FulfillmentCenter fc){
        OutboundOrganization temp = new OutboundOrganization(realName, fc);
        outboundOrganizationList.add(temp);  
        return temp;
    }
}
