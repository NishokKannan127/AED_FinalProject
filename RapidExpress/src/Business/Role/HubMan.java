/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.UserAccount.User;

/**
 *
 * @author nisho
 */
public class HubMan extends User{
    public HubMan(int id){
        super(id);
    }
    private boolean isAvailable=true; 

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    HubAndLastMile hAndLM;
    HubOrganization hubOrg;

    public HubOrganization getHubOrganization() {
        return hubOrg;
    }

    public void setHubOrganization(HubOrganization hubOrg) {
        this.hubOrg = hubOrg;
    }

    public HubAndLastMile gethAndLM() {
        return hAndLM;
    }

    public void sethAndLM(HubAndLastMile hAndLM) {
        this.hAndLM = hAndLM;
    }
}
