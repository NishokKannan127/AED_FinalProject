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
import Business.Role.FirstMileDelivery;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.FMDelivery;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class DirectDeliveryOrganization extends Organization{
    DirectDeliveryMenDirectory directDeliveryDirectory;
    Delivery del;
    String nameDirectDeliveryOrganization;
    private static int ctr = 0;
    int dDelOrgId;
    ArrayList<DeliveryMen> deliveryMenList;
    
    public DirectDeliveryOrganization(String nameDirectDeliveryOrganization, Delivery del) {
        super(Organization.DeliveryEnt.DirectDeliveryOrg.getValue());
        dDelOrgId=++ctr;
        directDeliveryDirectory = new DirectDeliveryMenDirectory();       
        this.nameDirectDeliveryOrganization=nameDirectDeliveryOrganization;   
        deliveryMenList=new ArrayList<DeliveryMen>();
        this.del=del;
    }
    //@Override
    public ArrayList<User.Role> getSupportedRole() {
        ArrayList<User.Role> roles = new ArrayList();
        roles.add(FMDelivery);
        return roles;
    }
    public void addDirectDeliveryMent(FirstMileDelivery fmMan){
        this.deliveryMenList.add(fmMan);
    }
}
