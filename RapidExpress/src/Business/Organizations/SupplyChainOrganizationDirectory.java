/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EnterpriseVendor.Organization.SupplyChainOrganization;
import Business.EnterpriseVendor.Vendor;
import EnterpriseVendor.Organization.MerchantFulfillmentOrganization;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class SupplyChainOrganizationDirectory {
    private ArrayList<SupplyChainOrganization> supplyChainOrganizationList;

    public SupplyChainOrganizationDirectory() {
        supplyChainOrganizationList = new ArrayList();
    }

    public ArrayList<SupplyChainOrganization> getSupplyChainOrganizationList() {
        return supplyChainOrganizationList;
    }
    
    public SupplyChainOrganization createOrganization(String realName, Vendor ven){
        SupplyChainOrganization temp = new SupplyChainOrganization(realName, ven);
        supplyChainOrganizationList.add(temp);  
        return temp;
    }
}
