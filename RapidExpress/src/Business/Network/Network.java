/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private String state;
    private String country;
    
    
    
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public Network(String name, String state, String country){
        enterpriseDirectory=new EnterpriseDirectory();
        this.name=name;
        this.state=state;
        this.country=country;
    }
    public String getName() {
        return name;
    }
    public void addEnterpriseToNetwork(Enterprise ent){
        this.enterpriseDirectory.addEnterprise(ent);// add(ent);
    }
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
