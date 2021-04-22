/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.User.Role;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private int accountId;
    private String username;
    private String password;
    private User user;
    private Role role;
    private static int counter=0;

    //String firstName, String lastName, String username, String password, int restaurantId, Role role
    public UserAccount(String firstName, String lastName, String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
        accountId = ++counter;
        //System admin
        if(role==Role.SysAdmin)this.user = EcoSystem.getInstance().getSysAdminDirectory().createAdmin(accountId);// getAdminDirectory().createAdmin(accountId);
        //Role.VendorAdmin, Role.HubAndLasMileAdmin, Role.DeliveryAdmin, Role.FulfillmentCenterAdmin
        //Enterprise admins
        //if(role==Role.FCAdmin)this.user = EcoSystem.getInstance().getFcAdminDirectory().createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        //if(role==Role.VendorAdmin)this.user = EcoSystem.getInstance().getVendorAdminDirectory().createVendorAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        //if(role==Role.HubAndLastMileAdmin)this.user = EcoSystem.getInstance().getHubAndLastMileAdminDirectory().createHubAndLastMileAdmin(accountId);// createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        //if(role==Role.DeliveryAdmin)this.user = EcoSystem.getInstance().getDeliveryAdminDirectory().createDelAdmin(accountId);// createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        
        if(role==Role.FCManager)this.user = EcoSystem.getInstance().getFcManagerDirectory().createFCManager(accountId);// createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        if(role==Role.VendorManager)this.user = EcoSystem.getInstance().getVendorManagerDirectory().createVendorManager(accountId);// createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        //if(role==Role.HubAndLastMileManager)this.user = EcoSystem.getInstance().getHubAndLastMileManagerDirectory().createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        if(role==Role.FMDeliveryManager)this.user = EcoSystem.getInstance().getFMManagerDeliveryMenDirectory().createManager(accountId);//getSysAdminDirectory().createAdmin(accountId);// getAdminDirectory().createAdmin(accountId);
        if(role==Role.LMDeliveryManager)this.user = EcoSystem.getInstance().getLMManagerDeliveryMenDirectory().createManager(accountId);//getSysAdminDirectory().createAdmin(accountId);// getAdminDirectory().createAdmin(accountId);
        if(role==Role.DirectDelivery)this.user=EcoSystem.getInstance().getDirManDir().createDirectDeliveryMan(accountId);
            if(role==Role.DirectDeliveryManager)this.user=EcoSystem.getInstance().getManagerDirDeliveryMenDirectory().createManager(accountId);
        if(role==Role.Customer)this.user = EcoSystem.getInstance().getCustomerDirectory().createCustomer(accountId);
        if(role==Role.Dock)this.user = EcoSystem.getInstance().getDockPeopleDirectory().createDockMen(accountId);// getDeliveryManDirectory().createDeliveryMan(accountId);        
        if(role==Role.FMDelivery)this.user = EcoSystem.getInstance().getFmDeliveryMenDirectory().createFMDeliveryMan(accountId);// createFmDeliveryMan(accountId);//getManagerDirectory().createManager(accountId);
        if(role==Role.HubManager)this.user = EcoSystem.getInstance().getHubManDir().createhubMan(accountId);// .createHubAdmin(accountId);//getManagerDirectory().createManager(accountId);
        if(role==Role.LMManager)this.user = EcoSystem.getInstance().getLmManDir().createLastMileMan(accountId);// //LmAdminDirectory().createLastMileAdmin(accountId);// createLmAdmin(accountId);//getManagerDirectory().createManager(accountId);
        if(role==Role.LMDelivery)this.user = EcoSystem.getInstance().getLmDeliveryMenDirectory().createLastMileDelivery(accountId); //createLMDeliverMen(accountId);// getManagerDirectory().createManager(accountId);
        if(role==Role.PickAndPack)this.user = EcoSystem.getInstance().getPickAndPackDirectory().createPickAndPack(accountId); //createPickAndPack(accountId); //getManagerDirectory().createManager(accountId);
        if(role==Role.Recieve)this.user = EcoSystem.getInstance().getRecieveDirectory().createRecieve(accountId);//   createRecieveMen(accountId); //getManagerDirectory().createManager(accountId);
        if(role==Role.Stow)this.user = EcoSystem.getInstance().getStowMenDirectory().createStowMan(accountId); //createStowMen(accountId); //getManagerDirectory().createManager(accountId);
        //if(role==Role.Vendor)this.user = EcoSystem.getInstance().getVendorAdminDirectory().createVendorAdmin(accountId);// createVendor(accountId); //getManagerDirectory().createManager(accountId);

//        //role.
        this.user.setFirstName(firstName);
        this.user.setLastName(lastName);
    }
    
    public UserAccount(String firstName, String lastName, String username, String password, Role role, Enterprise enterprise) {
        this.username = username;
        this.password = password;
        this.role = role;
        accountId = ++counter;
        //System admin
        if(role==Role.SysAdmin)this.user = EcoSystem.getInstance().getSysAdminDirectory().createAdmin(accountId);// getAdminDirectory().createAdmin(accountId);
        //Role.VendorAdmin, Role.HubAndLasMileAdmin, Role.DeliveryAdmin, Role.FulfillmentCenterAdmin
        //Enterprise admins
        if(role==Role.FCAdmin)this.user = EcoSystem.getInstance().getFcAdminDirectory().createFulfillmentCenterAdmin(accountId, enterprise);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        if(role==Role.VendorAdmin)this.user = EcoSystem.getInstance().getVendorAdminDirectory().createVendorAdmin(accountId, enterprise);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        if(role==Role.HubAndLastMileAdmin)this.user = EcoSystem.getInstance().gethAndLMAdminDir().createHubAndLastMileAdmin(accountId, enterprise);// createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        if(role==Role.DeliveryAdmin)this.user = EcoSystem.getInstance().getDeliveryAdminDirectory().createDelAdmin(accountId, enterprise);// createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        
        if(role==Role.FCManager)this.user = EcoSystem.getInstance().getFcManagerDirectory().createFCManager(accountId);// createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        if(role==Role.VendorManager)this.user = EcoSystem.getInstance().getVendorManagerDirectory().createVendorManager(accountId);// createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        //if(role==Role.HubAndLastMileManager)this.user = EcoSystem.getInstance().getHubAndLastMileManagerDirectory().createFulfillmentCenterAdmin(accountId);// createFcAdmin(accountId);//  //getManagerDirectory().createManager(accountId);
        if(role==Role.FMDeliveryManager)this.user = EcoSystem.getInstance().getFMManagerDeliveryMenDirectory().createManager(accountId);//getSysAdminDirectory().createAdmin(accountId);// getAdminDirectory().createAdmin(accountId);
        if(role==Role.LMDeliveryManager)this.user = EcoSystem.getInstance().getLMManagerDeliveryMenDirectory().createManager(accountId);//getSysAdminDirectory().createAdmin(accountId);// getAdminDirectory().createAdmin(accountId);
        
        if(role==Role.Customer)this.user = EcoSystem.getInstance().getCustomerDirectory().createCustomer(accountId);
        if(role==Role.Dock)this.user = EcoSystem.getInstance().getDockPeopleDirectory().createDockMen(accountId);// getDeliveryManDirectory().createDeliveryMan(accountId);        
        if(role==Role.FMDelivery)this.user = EcoSystem.getInstance().getFmDeliveryMenDirectory().createFMDeliveryMan(accountId);// createFmDeliveryMan(accountId);//getManagerDirectory().createManager(accountId);
        if(role==Role.HubManager)this.user = EcoSystem.getInstance().getHubAdminDirectory().createHubAdmin(accountId);//getManagerDirectory().createManager(accountId);
        if(role==Role.LMManager)this.user = EcoSystem.getInstance().getLmAdminDirectory().createLastMileAdmin(accountId);// createLmAdmin(accountId);//getManagerDirectory().createManager(accountId);
        if(role==Role.LMDelivery)this.user = EcoSystem.getInstance().getLmDeliveryMenDirectory().createLastMileDelivery(accountId); //createLMDeliverMen(accountId);// getManagerDirectory().createManager(accountId);
        if(role==Role.PickAndPack)this.user = EcoSystem.getInstance().getPickAndPackDirectory().createPickAndPack(accountId); //createPickAndPack(accountId); //getManagerDirectory().createManager(accountId);
        if(role==Role.Recieve)this.user = EcoSystem.getInstance().getRecieveDirectory().createRecieve(accountId);//   createRecieveMen(accountId); //getManagerDirectory().createManager(accountId);
        if(role==Role.Stow)this.user = EcoSystem.getInstance().getStowMenDirectory().createStowMan(accountId); //createStowMen(accountId); //getManagerDirectory().createManager(accountId);
        //if(role==Role.Vendor)this.user = EcoSystem.getInstance().getVendorAdminDirectory().createVendorAdmin(accountId);// createVendor(accountId); //getManagerDirectory().createManager(accountId);

//        //role.
        this.user.setFirstName(firstName);
        this.user.setLastName(lastName);
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
  
    @Override
    public String toString() {
        return username;
    }
    
    
    
}