/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class HubOrganizationDirectory {
    private ArrayList<HubOrganization> hubOrganizationList;

    public ArrayList<HubOrganization> getHubOrganizationList() {
        return hubOrganizationList;
    }

    public void setHubOrganizationList(ArrayList<HubOrganization> hubOrganizationList) {
        this.hubOrganizationList = hubOrganizationList;
    }
    private HubAndLastMile hAndLM;

    public HubOrganizationDirectory() {
        hubOrganizationList = new ArrayList();
    }

    public ArrayList<HubOrganization> geFMDeliverytOrganizationList() {
        return hubOrganizationList;
    }
    
    public HubOrganization createOrganization(String realName, HubAndLastMile hAndLM){
        HubOrganization temp = new HubOrganization(realName, hAndLM);
        hubOrganizationList.add(temp);        
        return temp;
    }
}
