/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnterpriseVendor.Organization;

import Business.EnterpriseVendor.Vendor;
import Business.Organization;
import Business.Role.FirstMileDelivery;
import Business.UserAccount.User;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class MerchantFulfillmentOrganization extends Organization{
    Vendor vendor;
    String nameMerchantFulfillmentOrg;
    Vendor ven;
    private static int ctr = 0;
    int merchFulOrgId;
    
    public MerchantFulfillmentOrganization(String nameMerchantFulfillmentOrg, Vendor ven) {
        super(Organization.VendorEnt.MerchantFulfillment.getValue());
        this.nameMerchantFulfillmentOrg=nameMerchantFulfillmentOrg;
        this.ven=ven;
        this.merchFulOrgId=++ctr;
    }
    
    //make a fulfillment manager (vendor manager. this guy 
    
    //public void addFMDeliveryMent(FirstMileDelivery fmMan){
    //    this.deliveryMenList.add(fmMan);
    //}
    
}
