/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseHubAndLastMile.Organization;

import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.Organization;
import Business.POJO.FCShipment;
import Business.POJO.Order;
import Business.People.LastMileAdminDirectory;
import Business.People.RecieveDirectory;
import Business.People.StowMenDirectory;
import Business.Role.HubMan;
import Business.Role.LastMileMan;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.LMManager;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class LastMileOrganization extends Organization{
    String name;
    LastMileAdminDirectory lastMileDir;
    HubAndLastMile hAndLM;
    private static int ctr = 0;
    int lmOrgId;

    public int getLmOrgId() {
        return lmOrgId;
    }

    public void setLmOrgId(int lmOrgId) {
        this.lmOrgId = lmOrgId;
    }
    ArrayList<LastMileMan> lmMenList;
    ArrayList<FCShipment>listOfShipmentsOfThisHAndLM;;
    ArrayList<Order>lmOrders;
    
    public LastMileOrganization(String nameOfInboundSystem, HubAndLastMile hAndLM) {
        super(Organization.HubAndLastMileEnt.LastMile.getValue());
        this.name=name;
        this.lastMileDir=new LastMileAdminDirectory();
        this.hAndLM=hAndLM;
        this.lmOrgId=++ctr;
        this.lmMenList=new ArrayList<LastMileMan>();
        this.lmOrders=new ArrayList<Order>();
        this.listOfShipmentsOfThisHAndLM=new ArrayList<FCShipment>();
    }
    public ArrayList<User.Role> getSupportedRole() {
        ArrayList<User.Role> roles = new ArrayList();
        roles.add(LMManager);        
        return roles;
    }
    public void addLMMen(LastMileMan lmMan){
        this.lmMenList.add(lmMan);
    }
    public void addOrdersToLM(Order order){        
        if(this.getOrgAddress().getArea()==order.getCustomer().getAddress().getArea())
            this.lmOrders.add(order);
    }
}
