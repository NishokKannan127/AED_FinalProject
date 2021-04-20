/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class FirstMileDeliveryOrganizationDirectory {
    private ArrayList<FirstMileDeliveryOrganization> fmDeliveryOrganizationList;
    private Delivery del;

    public FirstMileDeliveryOrganizationDirectory() {
        fmDeliveryOrganizationList = new ArrayList();
    }

    public ArrayList<FirstMileDeliveryOrganization> geFMDeliverytOrganizationList() {
        return fmDeliveryOrganizationList;
    }
    
    public FirstMileDeliveryOrganization createOrganization(String realName, Delivery del){
        FirstMileDeliveryOrganization temp = new FirstMileDeliveryOrganization(realName, del);
        fmDeliveryOrganizationList.add(temp);        
        return temp;
    }
}
