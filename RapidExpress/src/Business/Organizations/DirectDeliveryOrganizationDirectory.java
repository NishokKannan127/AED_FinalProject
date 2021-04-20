/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.DirectDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class DirectDeliveryOrganizationDirectory {
    private ArrayList<DirectDeliveryOrganization> directDeliveryOrganizationList;
    private Delivery del;

    public DirectDeliveryOrganizationDirectory() {
        directDeliveryOrganizationList = new ArrayList();
    }

    public ArrayList<DirectDeliveryOrganization> geDirectDeliveryOrganizationList() {
        return directDeliveryOrganizationList;
    }
    
    public void createOrganization(String realName){
        DirectDeliveryOrganization temp = new DirectDeliveryOrganization(realName, del);
        directDeliveryOrganizationList.add(temp);        
    }
}
