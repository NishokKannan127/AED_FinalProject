/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.EnterpriseDelivery.DeliveryDirectory;
import Business.EnterpriseVendor.VendorDirectory;
import Business.People.CustomerDirectory;
import Business.People.FirstMileDeliveryMenDirectory;
import Business.People.DockMenDirectory;
import Business.People.FulfillmentCenterAdminDirectory;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenterDirectory;
import Business.EnterpriseHubAndLastMile.HubAndLastMileDirectory;
import Business.Network.Network;
import Business.People.DeliveryAdminDirectory;
import Business.People.FCManagerDirectory;
import Business.People.HubAdminDirectory;
import Business.People.HubAndLastMileAdminDirectory;
import Business.People.HubManDirectory;
import Business.People.LastMileAdminDirectory;
import Business.People.LastMileDeliveryMenDirectory;
import Business.People.LastMileManDirectory;
import Business.People.ManagerFMDeliveryMenDirectory;
import Business.People.ManagerLMDeliveryMenDirectory;
import Business.People.PickAndPackDirectory;
import Business.People.RecieveDirectory;
import Business.People.StowMenDirectory;
import Business.People.SysAdminDirectory;
import Business.People.VendorAdminDirectory;
import Business.People.VendorManagerDirectory;
import Business.UserAccount.User;
import Business.UserAccount.User.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{

    private static EcoSystem business;
    private CustomerDirectory customerDirectory;
    private FirstMileDeliveryMenDirectory fmDeliveryMenDirectory;
    private LastMileDeliveryMenDirectory lmDeliveryMenDirectory;
    private FulfillmentCenterDirectory fcDirectory;
    private DockMenDirectory dockPeopleDirectory;
    private FulfillmentCenterAdminDirectory fcAdminDirectory;
    private HubAndLastMileDirectory hAndLmDir;    
    private HubAdminDirectory hubAdminDirectory;
    private LastMileAdminDirectory lmAdminDirectory;
    private PickAndPackDirectory pickAndPackDirectory;
    private RecieveDirectory recieveDirectory;
    private StowMenDirectory stowMenDirectory;
    private SysAdminDirectory sysAdminDirectory;
    private VendorAdminDirectory vendorAdminDirectory;
    private VendorDirectory vendorDirectory;
    private DeliveryDirectory deliveryDirectory;
    private ManagerFMDeliveryMenDirectory managerFMDeliveryMenDirectory;
    private ManagerLMDeliveryMenDirectory managerLMDeliveryMenDirectory;
    private ArrayList<Network> networkList;
    private HubAndLastMileAdminDirectory hubAndLMAdminDirectory;
    private DeliveryAdminDirectory delAdminDirectory;
    private FCManagerDirectory fcManagerDirectory;
    private Network network;
    public HubManDirectory hubManDir;

    public HubManDirectory getHubManDir() {
        return hubManDir;
    }

    public void setHubManDir(HubManDirectory hubManDir) {
        this.hubManDir = hubManDir;
    }

    public LastMileManDirectory getLmManDir() {
        return lmManDir;
    }

    public void setLmManDir(LastMileManDirectory lmManDir) {
        this.lmManDir = lmManDir;
    }
    public LastMileManDirectory lmManDir;

    public void setNetwork(Network network){
        this.network=network;
    }
    public Network getNetwork(){
        return this.network;
    }
    public Network searchNetwork(String net){
        for(int i=0; i<networkList.size(); i++){
            if(this.networkList.get(i).getName().equals(net)){
                return this.networkList.get(i);
            }
        }
        return null;
    }
    
    public void setFcManagerDirectory(FCManagerDirectory fcManagerDirectory) {
        this.fcManagerDirectory = fcManagerDirectory;
    }
    public FCManagerDirectory getFcManagerDirectory(){
        return fcManagerDirectory;
    }

    public HubAndLastMileAdminDirectory getHubAndLMAdminDirectory() {
        return hubAndLMAdminDirectory;
    }

    public void setHubAndLMAdminDirectory(HubAndLastMileAdminDirectory hubAndLMAdminDirectory) {
        this.hubAndLMAdminDirectory = hubAndLMAdminDirectory;
    }

    public DeliveryAdminDirectory getDelAdminDirectory() {
        return delAdminDirectory;
    }

    public void setDelAdminDirectory(DeliveryAdminDirectory delAdminDirectory) {
        this.delAdminDirectory = delAdminDirectory;
    }
    //private FCManagerDirectory fcManagerDirectory;
    private VendorManagerDirectory vendorManagerDirectory;

    public ManagerFMDeliveryMenDirectory getFMManagerDeliveryMenDirectory() {
        return managerFMDeliveryMenDirectory;
    }

    public void setFMManagerDeliveryMenDirectory(ManagerFMDeliveryMenDirectory managerDeliveryMenDirectory) {
        this.managerFMDeliveryMenDirectory = managerDeliveryMenDirectory;
    }
    
    public ManagerLMDeliveryMenDirectory getLMManagerDeliveryMenDirectory() {
        return managerLMDeliveryMenDirectory;
    }

    public void setLMManagerDeliveryMenDirectory(ManagerLMDeliveryMenDirectory managerDeliveryMenDirectory) {
        this.managerLMDeliveryMenDirectory = managerDeliveryMenDirectory;
    }

    public DeliveryDirectory getDeliveryDirectory() {
        return deliveryDirectory;
    }

    public void setDeliveryDirectory(DeliveryDirectory deliveryDirectory) {
        this.deliveryDirectory = deliveryDirectory;
    }

    
    public VendorDirectory getVendorDirectory() {
        return vendorDirectory;
    }

    public void setVendorDirectory(VendorDirectory vendorDirectory) {
        this.vendorDirectory = vendorDirectory;
    }
    
    public FirstMileDeliveryMenDirectory getFmDeliveryMenDirectory() {
        return fmDeliveryMenDirectory;
    }

    public void setFmDeliveryMenDirectory(FirstMileDeliveryMenDirectory fmDeliveryMenDirectory) {
        this.fmDeliveryMenDirectory = fmDeliveryMenDirectory;
    }

    public LastMileDeliveryMenDirectory getLmDeliveryMenDirectory() {
        return lmDeliveryMenDirectory;
    }
    
    public HubAndLastMileDirectory gethAndLmDir() {
        return hAndLmDir;
    }

    public void sethAndLmDir(HubAndLastMileDirectory hAndLmDir) {
        this.hAndLmDir = hAndLmDir;
    }

    public void setLmDeliveryMenDirectory(LastMileDeliveryMenDirectory lmDeliveryMenDirectory) {
        this.lmDeliveryMenDirectory = lmDeliveryMenDirectory;
    }
    
    public VendorAdminDirectory getVendorAdminDirectory() {
        return vendorAdminDirectory;
    }
    public HubAndLastMileAdminDirectory getHubAndLastMileAdminDirectory(){
        return hubAndLMAdminDirectory;
    }
    public DeliveryAdminDirectory getDeliveryAdminDirectory(){
        return delAdminDirectory;
    }
    //public FCManagerDirectory getFcManagerDirectory(){
    //return fcManagerDirectory;
   //s }
    public VendorManagerDirectory getVendorManagerDirectory(){
        return vendorManagerDirectory;
    }
    public void setVendorManagerDirectory(VendorManagerDirectory vendorManagerDirectory){
        this.vendorManagerDirectory= vendorManagerDirectory;
    }

    public void setVendorAdminDirectory(VendorAdminDirectory vendorAdminDirectory) {
        this.vendorAdminDirectory = vendorAdminDirectory;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public FirstMileDeliveryMenDirectory getDeliveryMenDirectory() {
        return fmDeliveryMenDirectory;
    }

    public void setDeliveryMenDirectory(FirstMileDeliveryMenDirectory deliveryMenDirectory) {
        this.fmDeliveryMenDirectory = deliveryMenDirectory;
    }

    public FulfillmentCenterDirectory getFcDirectory() {
        return fcDirectory;
    }

    public void setFcDirectory(FulfillmentCenterDirectory fcDirectory) {
        this.fcDirectory = fcDirectory;
    }

    public DockMenDirectory getDockPeopleDirectory() {
        return dockPeopleDirectory;
    }

    public void setDockPeopleDirectory(DockMenDirectory dockPeopleDirectory) {
        this.dockPeopleDirectory = dockPeopleDirectory;
    }

    public FulfillmentCenterAdminDirectory getFcAdminDirectory() {
        return fcAdminDirectory;
    }

    public void setFcAdminDirectory(FulfillmentCenterAdminDirectory fcAdminDirectory) {
        this.fcAdminDirectory = fcAdminDirectory;
    }

    public HubAdminDirectory getHubAdminDirectory() {
        return hubAdminDirectory;
    }

    public void setHubAdminDirectory(HubAdminDirectory hubAdminDirectory) {
        this.hubAdminDirectory = hubAdminDirectory;
    }

    public LastMileAdminDirectory getLmAdminDirectory() {
        return lmAdminDirectory;
    }

    public void setLmAdminDirectory(LastMileAdminDirectory lmAdminDirectory) {
        this.lmAdminDirectory = lmAdminDirectory;
    }

    public PickAndPackDirectory getPickAndPackDirectory() {
        return pickAndPackDirectory;
    }

    public void setPickAndPackDirectory(PickAndPackDirectory pickAndPackDirectory) {
        this.pickAndPackDirectory = pickAndPackDirectory;
    }

    public RecieveDirectory getRecieveDirectory() {
        return recieveDirectory;
    }

    public void setRecieveDirectory(RecieveDirectory recieveDirectory) {
        this.recieveDirectory = recieveDirectory;
    }

    public StowMenDirectory getStowMenDirectory() {
        return stowMenDirectory;
    }

    public void setStowMenDirectory(StowMenDirectory stowMenDirectory) {
        this.stowMenDirectory = stowMenDirectory;
    }

    public SysAdminDirectory getSysAdminDirectory() {
        return sysAdminDirectory;
    }

    public void setSysAdminDirectory(SysAdminDirectory sysAdminDirectory) {
        this.sysAdminDirectory = sysAdminDirectory;
    }
    

    
    //if(role==User.Role.SysAdmin)this.user = EcoSystem.getInstance().getAdminDirectory().createAdmin(accountId);
    //    if(role==User.Role.Customer)this.user = EcoSystem.getInstance().getCustomerDirectory().createCustomer(accountId);
    //    if(role==User.Role.Dock)this.user = EcoSystem.getInstance().getDeliveryManDirectory().createDeliveryMan(accountId);
    //    if(role==User.Role.FCAdmin)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    //    if(role==User.Role.FCHubDelivery)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    //    if(role==User.Role.HubAdmin)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    //    if(role==User.Role.HubLMDelivery)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    //    if(role==User.Role.LMAdmin)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    //    if(role==User.Role.LMDelivery)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    //    if(role==User.Role.PickAndPack)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    //    if(role==User.Role.Recieve)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    //    if(role==User.Role.Stow)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    //    if(role==User.Role.Vendor)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
    
    private EcoSystem(){
        super(null);
        networkList = new ArrayList<Network>();
    }
    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

   

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    public Network createAndAddNetwork(Network network){
        //Network network=new Network();
        networkList.add(network);
        return network;
    }
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    //@Override
    //public ArrayList<User.Role> getSupportedRole() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    
}
