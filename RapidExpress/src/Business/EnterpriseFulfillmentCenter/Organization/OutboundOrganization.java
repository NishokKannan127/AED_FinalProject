/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseFulfillmentCenter.Organization;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseVendor.Vendor;
import Business.Organization;
import Business.People.DockMenDirectory;
import Business.People.PickAndPackDirectory;
import Business.Role.Dock;
import Business.Role.FCManager;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.Role.PickAndPack;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.PickAndPack;
import static Business.UserAccount.User.Role.Recieve;
import static Business.UserAccount.User.Role.Stow;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class OutboundOrganization extends Organization{
    Vendor vendor;
    String nameOfOutboundSystem;
    PickAndPackDirectory pickAndPackDir;
    DockMenDirectory dockDir;
    FulfillmentCenter fc;
    private static int ctr = 0;
    int outboundOrgId;
    ArrayList<Dock>dockMenList;
    ArrayList<PickAndPack>pickAndPackMenList;
    ArrayList<FCManager> fmDelManagerAdmin;
    
    public OutboundOrganization(String nameOfOutboundSystem, FulfillmentCenter fc) {
        super(Organization.FulfillmentCenterEnt.Outbound.getValue());
        this.nameOfOutboundSystem=nameOfOutboundSystem;
        this.pickAndPackDir=new PickAndPackDirectory();
        this.dockDir=new DockMenDirectory();
        this.fc=fc;
        outboundOrgId=++ctr;
        this.fmDelManagerAdmin=new ArrayList<FCManager>();
        this.pickAndPackMenList=new ArrayList<PickAndPack>();
        this.dockMenList=new ArrayList<Dock>();
    }
    public ArrayList<Dock>getDockMenList(){
        return this.dockMenList;
    }
    public ArrayList<PickAndPack>getPAndPList(){
        return this.pickAndPackMenList;
    }
    public ArrayList<User.Role> getSupportedRole() {
        ArrayList<User.Role> roles = new ArrayList();
        roles.add(PickAndPack);
        roles.add(User.Role.Dock);
        return roles;
    }
    public void addPickAndPackMen(PickAndPack pAndP){
        this.pickAndPackMenList.add(pAndP);
    }
    public void addDockMen(Dock dockMen){
        this.dockMenList.add(dockMen);
    }
    public void addOutboundManager(FCManager manager){
        this.fmDelManagerAdmin.add(manager);
    }
}
