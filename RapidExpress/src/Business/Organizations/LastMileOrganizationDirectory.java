/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import java.util.ArrayList;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;

/**
 *
 * @author nisho
 */
public class LastMileOrganizationDirectory {
    private ArrayList<LastMileOrganization> lmOrganizationList;

    public ArrayList<LastMileOrganization> getLMOrganizationList() {
        return lmOrganizationList;
    }

    public void setLMOrganizationList(ArrayList<LastMileOrganization> fmDeliveryOrganizationList) {
        this.lmOrganizationList = fmDeliveryOrganizationList;
    }
    private HubAndLastMile hAndLM;

    public LastMileOrganizationDirectory() {
        lmOrganizationList = new ArrayList();
    }

    
    public LastMileOrganization createOrganization(String realName, HubAndLastMile del){
        LastMileOrganization temp = new LastMileOrganization(realName, hAndLM);
        lmOrganizationList.add(temp);   
        return temp;
    }
}
