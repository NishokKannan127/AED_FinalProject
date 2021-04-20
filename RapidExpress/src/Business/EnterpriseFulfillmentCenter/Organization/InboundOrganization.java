/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseFulfillmentCenter.Organization;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseVendor.Vendor;
import Business.Organization;
import Business.People.LastMileDeliveryMenDirectory;
import Business.People.RecieveDirectory;
import Business.People.StowMenDirectory;
import Business.Role.FCManager;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.Role.Recieve;
import Business.Role.Stow;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.Recieve;
import static Business.UserAccount.User.Role.Stow;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class InboundOrganization extends Organization{
    Vendor vendor;
    String nameOfInboundSystem;
    RecieveDirectory recieveDir;
    StowMenDirectory stowDir;
    FulfillmentCenter fc;
    private static int ctr = 0;
    int inboundOrgId;
    ArrayList<FCManager> fmDelManagerAdmin;
    ArrayList<Recieve> recieveMenList;

    public ArrayList<Recieve> getRecieveMenList() {
        return recieveMenList;
    }

    public void setRecieveMenList(ArrayList<Recieve> recieveMenList) {
        this.recieveMenList = recieveMenList;
    }

    public ArrayList<Stow> getStowMenList() {
        return stowMenList;
    }

    public void setStowMenList(ArrayList<Stow> stowMenList) {
        this.stowMenList = stowMenList;
    }
    ArrayList<Stow> stowMenList;
    
    public InboundOrganization(String nameOfInboundSystem, FulfillmentCenter fc) {
        super(Organization.FulfillmentCenterEnt.Inbound.getValue());
        this.nameOfInboundSystem=nameOfInboundSystem;
        this.recieveDir=new RecieveDirectory();
        this.stowDir=new StowMenDirectory();
        this.fc=fc;
        inboundOrgId=++ctr;
        this.fmDelManagerAdmin=new ArrayList<FCManager>();
        this.recieveMenList=new ArrayList<Recieve>();
        this.stowMenList=new ArrayList<Stow>();
    }
    
    //public LastMileDeliveryOrganization(String nameLastMileDeliveryOrganization) {
    //    super(Organization.DeliveryEnt.LastMileDeliveryOrg.getValue());
    //    lastMileDeliveryDirectory = new LastMileDeliveryMenDirectory();       
    //    this.nameLastMileDelieryOrganization=nameLastMileDelieryOrganization;   
    //

    //@Override
    public ArrayList<User.Role> getSupportedRole() {
        ArrayList<User.Role> roles = new ArrayList();
        roles.add(Recieve);
        roles.add(Stow);
        return roles;
    }
    public void addRecieve(Recieve rec){
        this.recieveMenList.add(rec);
    }
    public void addStow(Stow st){
        this.stowMenList.add(st);
    }
    public void addInboundManager(FCManager manager){
        this.fmDelManagerAdmin.add(manager);
    }

}