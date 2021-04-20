/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseHubAndLastMile.Organization;

import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.Organization;
import Business.POJO.FCShipment;
import Business.People.HubAdminDirectory;
import Business.People.RecieveDirectory;
import Business.People.StowMenDirectory;
import Business.Role.HubMan;
import Business.Role.Recieve;
import Business.Role.Stow;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.HubManager;
import static Business.UserAccount.User.Role.PickAndPack;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class HubOrganization extends Organization{
    String name;
    HubAdminDirectory hubDir;
    HubAndLastMile hAndLM;
    private static int ctr = 0;
    int hubOrgId;
    ArrayList<FCShipment>listOfShipmentsOfThisHAndLM;
    
    public int getHubOrgId() {
        return hubOrgId;
    }

    public void setHubOrgId(int hubOrgId) {
        this.hubOrgId = hubOrgId;
    }
    ArrayList<HubMan> hubMenList;
    
    public HubOrganization(String name, HubAndLastMile hAndLM) {
        super(Organization.HubAndLastMileEnt.Hub.getValue());
        this.name=name;
        this.hubDir=new HubAdminDirectory();
        this.hAndLM=hAndLM;
        this.hubOrgId=++ctr;
        this.hubMenList=new ArrayList<HubMan>();
        this.listOfShipmentsOfThisHAndLM=new ArrayList<FCShipment>();
    }
    public ArrayList<User.Role> getSupportedRole() {
        ArrayList<User.Role> roles = new ArrayList();
        roles.add(HubManager);        
        return roles;
    }
    public void addHubMen(HubMan hub){
        this.hubMenList.add(hub);
    }
    
     public void addShipmentToHub(FCShipment ship){
        if(this.getOrgAddress().getCity()==ship.getDestAddress().getCity())
            this.listOfShipmentsOfThisHAndLM.add(ship);
    }
}
