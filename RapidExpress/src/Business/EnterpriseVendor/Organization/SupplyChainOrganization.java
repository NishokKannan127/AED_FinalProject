/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseVendor.Organization;

import Business.EnterpriseDelivery.Delivery;
import Business.Organization;
import Business.People.VendorAdminDirectory;
import Business.People.VendorManagerDirectory;
import Business.Role.VendorAdmin;
import Business.UserAccount.User.Role;
import java.util.ArrayList;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseVendor.Vendor;
import Business.Role.ManagerLMDeliveryMenAdmin;
import Business.Role.VendorManager;
import static Business.UserAccount.User.Role.FMDeliveryManager;
import static Business.UserAccount.User.Role.LMDeliveryManager;


/**
 *
 * @author nisho
 */
public class SupplyChainOrganization extends Organization{
    VendorManagerDirectory vendManDirectory;
    
    Delivery del;
    String name;
    private static int ctr = 0;
    int supplyChainOrgId;
    ArrayList<VendorManager> vendorManagerList;
    Vendor ven;
    FulfillmentCenter fc;
    
    public SupplyChainOrganization(String name, Vendor ven) {
        super(Organization.VendorEnt.SupplyChainOrganization.getValue());
        supplyChainOrgId=++ctr;
        vendManDirectory = new VendorManagerDirectory();       
        this.name=name;   
        this.ven=ven;
        this.vendorManagerList=new ArrayList<VendorManager>();
        //sdeliveryMenList=new ArrayList<DeliveryMen>();
    }
    //@Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(Role.VendorManager);
//        roles.add(LMDeliveryManager);
        return roles;
    }
    //public void addVendorManager(VendorAdmin vendMan){
    //    this.vendManAdminDirectory.add(vendMan);
   // }
    public void addVendorManager(VendorManager manager){
        this.vendorManagerList.add(manager);
    }
    public void createVendorManager(int id){
//        firstMileDeliveryDirectory.createFMDeliveryMan(ctr);
        this.vendManDirectory.createVendorManager(id);// createVendorAdmin(id);// createLastMileDelivery(id);
    }
}
