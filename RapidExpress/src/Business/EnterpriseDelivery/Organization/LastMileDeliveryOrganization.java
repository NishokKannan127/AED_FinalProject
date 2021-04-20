/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseDelivery.Organization;

import Business.EnterpriseDelivery.Delivery;
import Business.Organization;
import Business.People.FirstMileDeliveryMenDirectory;
import Business.People.LastMileDeliveryMenDirectory;
import Business.Role.DeliveryMen;
import Business.Role.LastMileDelivery;
import Business.Role.ManagerLMDeliveryMenAdmin;
import Business.UserAccount.User.Role;
import static Business.UserAccount.User.Role.FMDelivery;
import static Business.UserAccount.User.Role.LMDelivery;
import static Business.UserAccount.User.Role.LMDeliveryManager;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class LastMileDeliveryOrganization extends Organization{
    LastMileDeliveryMenDirectory lastMileDeliveryDirectory;
    Delivery del;
    String nameLastMileDelieryOrganization;
    private static int ctr = 0;
    int lmDelOrgId;
    ArrayList<DeliveryMen> deliveryMenList;
    ArrayList<ManagerLMDeliveryMenAdmin> lmDelManagerAdmin;
    
    public LastMileDeliveryOrganization(String nameLastMileDeliveryOrganization, Delivery del) {
        super(Organization.DeliveryEnt.LastMileDeliveryOrg.getValue());
        lmDelOrgId=++ctr;
        lastMileDeliveryDirectory = new LastMileDeliveryMenDirectory();       
        this.nameLastMileDelieryOrganization=nameLastMileDelieryOrganization;  
        deliveryMenList=new ArrayList<DeliveryMen>();
        lmDelManagerAdmin=new ArrayList<ManagerLMDeliveryMenAdmin>();
        this.del=del;
    }
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(LMDelivery);
        roles.add(LMDeliveryManager);
        return roles;
    }
    public void addLMDeliveryMent(LastMileDelivery lmMan){
        this.deliveryMenList.add(lmMan);
    }
    public void addLMDeliveryManager(ManagerLMDeliveryMenAdmin manager){
        this.lmDelManagerAdmin.add(manager);
    }
    public void createLMDeliveryMent(int id){
//        firstMileDeliveryDirectory.createFMDeliveryMan(ctr);
        this.lastMileDeliveryDirectory.createLastMileDelivery(id);
    }
    //@Override
    //public ArrayList<Role> getSupportedRole() {
    //    ArrayList<Role> roles = new ArrayList();
    //    roles.add(new DoctorRole());
    //    return roles;
    //}
}
