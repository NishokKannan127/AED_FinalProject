/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DB4OUtil.DB4OUtil;
import Business.POJO.Address;
import Business.UserAccount.User.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private int organizationID;
    private String name;
    private String realName;
    private WorkQueue workQueue;
    //private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    //private 
    private static int counter=0;
    //private BloodGroup bloodGroup;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Address address;

    public Address getOrgAddress() {
        return address;
    }

    public void setOrgAddress(Address address) {
        this.address = address;
    }
    
    
    public enum Type{
        Admin("AdminOrganization"); 
        
        //SystemCoordinator("System Coorinator Organization"),
        //Doctor("Doctor Organization"), 
        //Pathologist("Pathologist Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
     public enum DeliveryEnt {
         
        FirstMileDeliveryOrg("FirstMileDeliveryOrganization"),
        DirectDeliveryOrg("DirectDeliveryOrganization"),
        LastMileDeliveryOrg("LastMileDeliveryOrganization");
        private String value;

        private DeliveryEnt(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    public enum ECommerceEnt{
        Customer("CustomerOrganization");
        private String value;

        private ECommerceEnt(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    public enum FulfillmentCenterEnt{
        FulfillmentByRapidEx("FulfillmentByRapidEx"),
        Inbound("Inbound"),
        Outbound("Outbound");
        
        private String value;
        
        private FulfillmentCenterEnt(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
    }
    public enum HubAndLastMileEnt{
        Hub("HubOrganization"),
        LastMile("LastMileOrganization");
        private String value;

        private HubAndLastMileEnt(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    public enum VendorEnt {
         
        SupplyChainOrganization("SupplyChainOrg"),
        MerchantFulfillment("MerchantFulfillmentOrganization");
        private String value;

        private VendorEnt(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        System.out.println("initialise work queue");
        //employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        //bloodGroup = new BloodGroup();
        
          organizationID = counter;  
        
        
        ++counter;
    }
    public Organization(){
        
    }

    //public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    //public EmployeeDirectory getEmployeeDirectory() {
    //    return employeeDirectory;
    //}
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

   

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    //public ArrayList<Role> getSupportedRole();
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
