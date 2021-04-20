/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseFulfillmentCenter.Organization;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseVendor.Vendor;
import Business.Organization;
import Business.People.DockMenDirectory;
import Business.People.PickAndPackDirectory;
import Business.People.RecieveDirectory;
import Business.People.StowMenDirectory;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.LMDelivery;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class FulfillmentByRapidExpressOrganization extends Organization{
    RecieveDirectory recieveDir;
    StowMenDirectory stowMenDir;
    PickAndPackDirectory pAndPackDir;
    DockMenDirectory dockMenDir;
    FulfillmentCenter fc;
    private static int ctr = 0;
    int fulREOrgId;
            
    String nameFulfillmentByRapidExpressOrganization;
    
    public FulfillmentByRapidExpressOrganization(String nameFulfillmentByRapidExpressOrganization, FulfillmentCenter fc) {
        super(Organization.DeliveryEnt.LastMileDeliveryOrg.getValue());
        recieveDir = new RecieveDirectory();       
        stowMenDir = new StowMenDirectory();
        pAndPackDir = new PickAndPackDirectory();
        dockMenDir = new DockMenDirectory();
        fulREOrgId=++ctr;
        this.nameFulfillmentByRapidExpressOrganization=nameFulfillmentByRapidExpressOrganization;   
        this.fc=fc;
    }
//    public ArrayList<User.Role> getSupportedRole() {
//        ArrayList<User.Role> roles = new ArrayList();
//        roles.add(test);
//        return roles;
//    }

    
}
