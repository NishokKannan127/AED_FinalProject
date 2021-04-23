/* * @author nishok

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization;
import javax.swing.JPanel;

/**
 *
 */
public abstract class User {
    String firstName;
    String lastName;
    String name;
    private int id;
    
    public User(int id){
        this.id = id;
    }
    public User(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public User(String name){
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setId(int id) {
        this.id = id;
    }
        
    public enum Role{
        FCAdmin("FCAdmin"),
        SysAdmin("SysAdmin"),
        VendorAdmin("VendorAdmin"),
        DeliveryAdmin("DeliveryAdmin"),
        HubAndLastMileAdmin("HubAndLastMileAdmin"),
        
        FMDeliveryManager("FMDeliveryManager"),
        LMDeliveryManager("LMDeliveryManager"),
        DirectDeliveryManager("DirectDeliveryManager"),
        FCManager("FCManager"),
        VendorManager("VendorManager"),
        HubAndLastMileManager("HubAndLastMileManager"),
        
        Customer("Customer"),
        //Vendor("Vendor"),
        Dock("Dock"),        
        FMDelivery("FMDelivery"),
        HubManager("HubManager"),       
        LMManager("LMManager"),
        LMDelivery("LMDelivery"),
        DirectDelivery("DirectDelivery"),
        PickAndPack("PickAndPack"),
        Recieve("Recieve"),
        Stow("Stow");
        
        
        
        private String value;
        private Role(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
        //private RoleType(String value){
        //    this.value = value;
        //}

        //public String getValue() {
        //    return value;
        //}

        @Override
        public String toString() {
            return value;
        }
    }
            
}
