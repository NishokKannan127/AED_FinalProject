/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseVendor.Vendor;
import EnterpriseVendor.Organization.MerchantFulfillmentOrganization;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class MerchantFulfillmentOrganizationDirectory {
    private ArrayList<MerchantFulfillmentOrganization> merchantFulfillmentOrganizationList;
    private Vendor ven;
    
    public MerchantFulfillmentOrganizationDirectory() {
        merchantFulfillmentOrganizationList = new ArrayList();
    }

    public ArrayList<MerchantFulfillmentOrganization> geFMDeliverytOrganizationList() {
        return merchantFulfillmentOrganizationList;
    }
    
    public MerchantFulfillmentOrganization createOrganization(String realName){
        MerchantFulfillmentOrganization temp = new MerchantFulfillmentOrganization(realName, ven);
        merchantFulfillmentOrganizationList.add(temp);        
        return temp;
    }
}
