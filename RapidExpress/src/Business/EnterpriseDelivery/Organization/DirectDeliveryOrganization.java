/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseDelivery.Organization;

import Business.EnterpriseDelivery.Delivery;
import Business.Organization;
import Business.People.DirectDeliveryMenDirectory;
import Business.People.FirstMileDeliveryMenDirectory;
import Business.Role.DeliveryMen;
import Business.Role.DirectDelivery;
import Business.Role.FirstMileDelivery;
import Business.Role.ManagerDirectDeliveryMenAdmin;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.DirectDelivery;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class DirectDeliveryOrganization extends Organization{
    DirectDeliveryMenDirectory directDeliveryDirectory;
    Delivery del;
    String nameDirectDeliveryOrganization;

    public String getNameDirectDelieryOrganization() {
        return nameDirectDeliveryOrganization;
    }

    public void setNameDirectDeliveryOrganization(String nameDirectDeliveryOrganization) {
        this.nameDirectDeliveryOrganization = nameDirectDeliveryOrganization;
    }
    private static int ctr = 0;
    int dDelOrgId;
    ArrayList<DeliveryMen> deliveryMenList;
    ArrayList<ManagerDirectDeliveryMenAdmin> dirDelManagerAdmin;
    
    public DirectDeliveryOrganization(String nameDirectDeliveryOrganization, Delivery del) {
        super(Organization.DeliveryEnt.DirectDeliveryOrg.getValue());
        dDelOrgId=++ctr;
        directDeliveryDirectory = new DirectDeliveryMenDirectory();       
        this.nameDirectDeliveryOrganization=nameDirectDeliveryOrganization;   
        deliveryMenList=new ArrayList<DeliveryMen>();
        this.del=del;
        this.dirDelManagerAdmin=new ArrayList<ManagerDirectDeliveryMenAdmin>();
    }
    //@Override
    public ArrayList<User.Role> getSupportedRole() {
        ArrayList<User.Role> roles = new ArrayList();
        roles.add(DirectDelivery);
        return roles;
    }
    public void addDirectDeliveryMent(DirectDelivery fmMan){
        this.deliveryMenList.add(fmMan);
    }
    public void addDirDeliveryManager(ManagerDirectDeliveryMenAdmin manager){
        this.dirDelManagerAdmin.add(manager);
    }
}
