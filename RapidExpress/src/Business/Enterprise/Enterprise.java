 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization;
import Business.Organizations.OrganizationDirectory;
import Business.POJO.Address;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private int contact;
    private String email;
    private Address address;

    public Address getEntAddress() {
        return address;
    }

    public void setEntAddress(Address address) {
        this.address = address;
    }
    

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Delivery("Delivery"),
        FulfillmentCenter("FulfillmentCenter"),
        HubAndLastMile("HubAndLastMile"),
        Vendor("Vendor");
        
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name, EnterpriseType type, Address address){
        super(name);
        this.enterpriseType=type;
        this.address=address;
        organizationDirectory = new OrganizationDirectory();
    }
    public Enterprise(){
        
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
