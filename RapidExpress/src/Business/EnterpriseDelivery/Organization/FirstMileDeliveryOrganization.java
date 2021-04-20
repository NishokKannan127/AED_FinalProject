/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseDelivery.Organization;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseVendor.Vendor;
import Business.Organization;
import Business.People.FirstMileDeliveryMenDirectory;
import Business.Role.DeliveryMen;
import Business.Role.FirstMileDelivery;
import Business.Role.LastMileDelivery;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.Role.ManagerLMDeliveryMenAdmin;
import Business.UserAccount.User;
import Business.UserAccount.User.Role;
import static Business.UserAccount.User.Role.FMDelivery;
import static Business.UserAccount.User.Role.FMDeliveryManager;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */


//create roles
public class FirstMileDeliveryOrganization extends Organization{
    FirstMileDeliveryMenDirectory firstMileDeliveryDirectory;
    Delivery del;
    String nameFirstMileDelieryOrganization;
    private static int ctr = 0;
    int fmDelOrgId;
    ArrayList<DeliveryMen> deliveryMenList;
    ArrayList<ManagerFMDeliveryMenAdmin> fmDelManagerAdmin;
    
    public FirstMileDeliveryOrganization(String nameFirstMileDeliveryOrganization, Delivery del) {
        super(Organization.DeliveryEnt.FirstMileDeliveryOrg.getValue());
        fmDelOrgId=++ctr;
        firstMileDeliveryDirectory = new FirstMileDeliveryMenDirectory();       
        this.nameFirstMileDelieryOrganization=nameFirstMileDeliveryOrganization;   
        deliveryMenList=new ArrayList<DeliveryMen>();
        fmDelManagerAdmin=new ArrayList<ManagerFMDeliveryMenAdmin>();
        this.del=del;
    }
    //@Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(FMDelivery);
        roles.add(FMDeliveryManager);
        return roles;
    }
    public void addFMDeliveryMent(FirstMileDelivery fmMan){
//        firstMileDeliveryDirectory.createFMDeliveryMan(ctr);
        this.deliveryMenList.add(fmMan);
    }
    public void createFMDeliveryMent(int id){
//        firstMileDeliveryDirectory.createFMDeliveryMan(ctr);
        this.firstMileDeliveryDirectory.createFMDeliveryMan(id);
    }
    public void addFMDeliveryManager(ManagerFMDeliveryMenAdmin manager){
        this.fmDelManagerAdmin.add(manager);
    }
    
//    public FirstMileDelivery CreateFirstMileDeliveryOrganization(){
        
//    }
    //UserAccount del1 = system.getUserAccountDirectory().createUserAccount("Del1", "d1", "d1", "d1", User.Role.FMDelivery);
    //    ((FirstMileDelivery)(del1.getUser())).setDelivery(del);
    //    UserAccount del2 = system.getUserAccountDirectory().createUserAccount("Del2", "d2", "d2", "d2", User.Role.FMDelivery);
    //    ((FirstMileDelivery)(del2.getUser())).setDelivery(del);
    //    UserAccount del3 = system.getUserAccountDirectory().createUserAccount("Del3", "d3", "d3", "d3", User.Role.FMDelivery);
    //    ((FirstMileDelivery)(del3.getUser())).setDelivery(del);
    //    UserAccount del4 = system.getUserAccountDirectory().createUserAccount("Del4", "d4", "d4", "d4", User.Role.FMDelivery);
    //    ((FirstMileDelivery)(del4.getUser())).setDelivery(del);
    
//    system.setFmDeliveryMenDirectory(new FirstMileDeliveryMenDirectory());
    
    
}
