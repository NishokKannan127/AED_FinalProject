package Business;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.DeliveryDirectory;
import Business.EnterpriseDelivery.Organization.DirectDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenterDirectory;
import Business.EnterpriseFulfillmentCenter.Organization.FulfillmentByRapidExpressOrganization;
import Business.EnterpriseFulfillmentCenter.Organization.InboundOrganization;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.EnterpriseHubAndLastMile.HubAndLastMileDirectory;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.EnterpriseVendor.Organization.SupplyChainOrganization;
import Business.EnterpriseVendor.Vendor;
import Business.EnterpriseVendor.VendorDirectory;
import Business.Network.Network;
import static Business.Organization.HubAndLastMileEnt.LastMile;
import Business.Organizations.FirstMileDeliveryOrganizationDirectory;
import Business.Organizations.LastMile;
import Business.POJO.Address;
import Business.POJO.Product;
import Business.People.CustomerDirectory;
import Business.People.DeliveryAdminDirectory;
import Business.People.DirectDeliveryMenDirectory;
import Business.People.DockMenDirectory;
import Business.People.FCManagerDirectory;
import Business.People.FirstMileDeliveryMenDirectory;
import Business.People.FulfillmentCenterAdminDirectory;
import Business.People.HubAndLastMileAdminDirectory;
import Business.People.HubManDirectory;
import Business.People.LastMileDeliveryMenDirectory;
import Business.People.LastMileManDirectory;
import Business.People.ManagerDirDeliveryMenDirectory;
import Business.People.ManagerFMDeliveryMenDirectory;
import Business.People.ManagerLMDeliveryMenDirectory;
import Business.People.PickAndPackDirectory;
import Business.People.RecieveDirectory;
import Business.People.StowMenDirectory;
import Business.People.SysAdminDirectory;
import Business.People.VendorAdminDirectory;
import Business.People.VendorManagerDirectory;
import Business.Role.Customer;
import Business.Role.DeliveryAdmin;
import Business.Role.DirectDelivery;
import Business.Role.Dock;
import Business.Role.FCManager;
import Business.Role.FirstMileDelivery;
import Business.Role.FulfillmentCenterAdmin;
import Business.Role.HubAndLastMileAdmin;
import Business.Role.HubMan;
import Business.Role.LastMileDelivery;
import Business.Role.LastMileMan;
import Business.Role.ManagerDirectDeliveryMenAdmin;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.Role.ManagerLMDeliveryMenAdmin;
import Business.Role.PickAndPack;
import Business.Role.Recieve;
import Business.Role.Stow;
import Business.Role.VendorAdmin;
import Business.Role.VendorManager;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.Customer;
import static Business.UserAccount.User.Role.DirectDelivery;
import static Business.UserAccount.User.Role.FCAdmin;
import static Business.UserAccount.User.Role.FCManager;
import static Business.UserAccount.User.Role.HubAndLastMileAdmin;
import static Business.UserAccount.User.Role.Recieve;
import Business.UserAccount.UserAccount;
import EnterpriseVendor.Organization.MerchantFulfillmentOrganization;
//import Business.model.Item;
//import Business.model.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        system.setVendorDirectory(new VendorDirectory());
        system.setSysAdminDirectory(new SysAdminDirectory());
        system.setCustomerDirectory(new CustomerDirectory());
        system.setVendorAdminDirectory(new VendorAdminDirectory());
        system.setFmDeliveryMenDirectory(new FirstMileDeliveryMenDirectory());
        system.setLmDeliveryMenDirectory(new LastMileDeliveryMenDirectory());
        system.setDirManDir(new DirectDeliveryMenDirectory());
        system.setFcDirectory(new FulfillmentCenterDirectory());
        system.setDeliveryDirectory(new DeliveryDirectory());
        system.setFMManagerDeliveryMenDirectory(new ManagerFMDeliveryMenDirectory());
        system.setLMManagerDeliveryMenDirectory(new ManagerLMDeliveryMenDirectory());
        system.setManagerDirDeliveryMenDirectory(new ManagerDirDeliveryMenDirectory());
        system.sethAndLmDir(new HubAndLastMileDirectory());
        system.setVendorManagerDirectory(new VendorManagerDirectory());
        system.setDelAdminDirectory(new DeliveryAdminDirectory());
        system.setFcAdminDirectory(new FulfillmentCenterAdminDirectory());// FcAdminDirectory());
        system.setFcManagerDirectory(new FCManagerDirectory());
        system.setNetwork(new Network());
        system.setRecieveDirectory(new RecieveDirectory());
        system.setStowMenDirectory(new StowMenDirectory());
        system.setPickAndPackDirectory(new PickAndPackDirectory());
        system.sethAndLMAdminDir(new HubAndLastMileAdminDirectory());
        system.setDockPeopleDirectory(new DockMenDirectory());
        system.setHubManDir(new HubManDirectory());
        system.setLmManDir(new LastMileManDirectory());
        
        system.getUserAccountDirectory().createUserAccount("a", "A1","a", "a",User.Role.SysAdmin);
        //Network
        Network network = system.createAndAddNetwork(new Network("Network1", "CA", "USA"));
        
        //Address
        Address add1=new Address("ca","ca","ca","here");
        Address add2=new Address("CA","Los Angeles","Orange County","here");
        Address add3=new Address("MA","Boston","Cambridge","here");
        
        //Enterprise
        Delivery del = system.getDeliveryDirectory().createDelivery("DeliveryComp1", add1);
        network.addEnterpriseToNetwork(del);
        //Org
        FirstMileDeliveryOrganization fmDelOrg;
        LastMileDeliveryOrganization lmDelOrg;
        DirectDeliveryOrganization dirDelOrg;
        fmDelOrg=del.addFMDeliveryOrgToDir("FM Delivery Org", del);
        lmDelOrg=del.addLMDeliveryOrgToDir("LM Delivery Org", del);
        dirDelOrg=del.addDirDeliveryOrgToDir("Direct Delivery Org",del);
        
        Address ad = new Address("ca","ca","ca","ca");        
        //Enterprise
        Vendor v1 = system.getVendorDirectory().createVendor("Apple", ad, 1111111111l);
        Vendor v2 = system.getVendorDirectory().createVendor("Samsung", ad, 1111111111l);
        network.addEnterpriseToNetwork(v1);
        network.addEnterpriseToNetwork(v2);
        Product p1 = new Product(v1,"Iphone", 1000f,200);
        Product p2 = new Product(v1,"Mac", 2000f,1000);
        Product p3 = new Product(v1,"Ipad", 900f,300);
        Product p4 = new Product(v2,"Samung Galaxy A", 1000f,300);
        Product p5 = new Product(v2,"Samung Galaxy B", 900f,200);
        Product p6 = new Product(v2,"Samung Galaxy C", 800f,300);
        v1.addProductsToVendor(p1);
        v1.addProductsToVendor(p2);
        v1.addProductsToVendor(p3);
        v2.addProductsToVendor(p4);
        v2.addProductsToVendor(p5);
        v2.addProductsToVendor(p6);   
        
        MerchantFulfillmentOrganization merchFulfil;        
        FulfillmentByRapidExpressOrganization fulfillByUs;
        //Organization
        SupplyChainOrganization suppChainOrg1;
        SupplyChainOrganization suppChainOrg2;
        suppChainOrg1=v1.addSupplyChainOrgToDir("Supply Chain Org 1", v1);
        suppChainOrg2=v2.addSupplyChainOrgToDir("Supply Chain Org 2", v2);
        //Enterprise        
        HubAndLastMile hubAndLastMile=system.gethAndLmDir().createHubAndLastMile("HubAndLastMileStation",ad);
        network.addEnterpriseToNetwork(hubAndLastMile);
        //Organization
        HubOrganization hubOrg;
        LastMileOrganization lmOrg;
        hubOrg=hubAndLastMile.addHubOrgToDir("Hub org", hubAndLastMile);
        hubOrg.setOrgAddress(ad);
        lmOrg=hubAndLastMile.addLastMileOrgToDir("LastMile Org", hubAndLastMile);
        lmOrg.setOrgAddress(ad);
        //Enterprise
        FulfillmentCenter fc=system.getFcDirectory().createFulfillmentCenter("FC1",ad);
        network.addEnterpriseToNetwork(fc);
        fc.setDeliveryCompenyAssociatedToFC(del);
        del.setFulfillmentCenterToCaterTo(fc);
        fc.setHubAndLMEnterpriseConnectedTo(hubAndLastMile);
        hubAndLastMile.setFc(fc);
        //Organization        
        InboundOrganization inbOrg;
        OutboundOrganization outOrg;
        inbOrg=fc.addInboundOrgToDir("Inbound Org", fc);
        outOrg=fc.addOutboundOrgToDir("Outbound Org", fc);
        
        
        UserAccount c1 = system.getUserAccountDirectory().createUserAccount("Customer", "C1", "c", "c", User.Role.Customer);
        ((Customer)(c1.getUser())).setAddress(add1);
        UserAccount c2 = system.getUserAccountDirectory().createUserAccount("Customer", "C2", "c2", "c", User.Role.Customer);
        ((Customer)(c2.getUser())).setAddress(add2);
        UserAccount vAdm1 = system.getUserAccountDirectory().createUserAccount("AppleAcc", "C1", "apAdmin", "a", User.Role.VendorAdmin,v1);
        ((VendorAdmin)(vAdm1.getUser())).setVendor(v1);
        UserAccount vAdm2 = system.getUserAccountDirectory().createUserAccount("SamsungAcc", "C1", "saAdmin", "s", User.Role.VendorAdmin,v2);
        ((VendorAdmin)(vAdm2.getUser())).setVendor(v2);
        UserAccount vManager1 = system.getUserAccountDirectory().createUserAccount("AppleAccMan", "C1", "apManager", "a", User.Role.VendorManager);
        ((VendorManager)(vManager1.getUser())).setVendor(v1);
        
        suppChainOrg1.addVendorManager((VendorManager)vManager1.getUser());
        UserAccount vManager2 = system.getUserAccountDirectory().createUserAccount("SamsungAccMan", "C1", "samManager", "a", User.Role.VendorManager);
        ((VendorManager)(vManager2.getUser())).setVendor(v2);
        suppChainOrg2.addVendorManager((VendorManager)vManager2.getUser());
        
        
        UserAccount hlmAdm1 = system.getUserAccountDirectory().createUserAccount("hlmAcc", "C1", "hlmdmin", "a", User.Role.HubAndLastMileAdmin,hubAndLastMile);
        ((HubAndLastMileAdmin)(hlmAdm1.getUser())).setHubAndLastMile(hubAndLastMile);// setVendor(v1);
        
        UserAccount fcAdm1 = system.getUserAccountDirectory().createUserAccount("fcAcc", "C1", "fcadmin", "a", User.Role.FCAdmin,fc);
        ((FulfillmentCenterAdmin)(fcAdm1.getUser())).setFC(fc);// setHubAndLastMile(hubAndLastMile);// setVendor(v1);
        
        //nishikori
//        UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount(firstName, lastName, userName, password, User.Role.FMDeliveryManager);
//            User qq = managerDel1.getUser();
//            ManagerFMDeliveryMenAdmin temp=((ManagerFMDeliveryMenAdmin)(qq));
//            ((FirstMileDeliveryOrganization)organization).addFMDeliveryManager(temp);
        //nishikori
        
        
        UserAccount delAdm1 = system.getUserAccountDirectory().createUserAccount("DeliveryAccMan", "C1", "delAdmin", "a", User.Role.DeliveryAdmin,del);
//        ((DeliveryAdmin)(delAdm1.getUser())). setVendor(v2);
        
        UserAccount del1 = system.getUserAccountDirectory().createUserAccount("Del1", "d1", "d1", "d1", User.Role.FMDelivery);
        ((FirstMileDelivery)(del1.getUser())).setDelivery(del);
        fmDelOrg.addFMDeliveryMent((FirstMileDelivery)del1.getUser());
        
        UserAccount del2 = system.getUserAccountDirectory().createUserAccount("Del2", "d2", "d2", "d2", User.Role.FMDelivery);
        ((FirstMileDelivery)(del2.getUser())).setDelivery(del);
        fmDelOrg.addFMDeliveryMent((FirstMileDelivery)del2.getUser());
        
        UserAccount del3 = system.getUserAccountDirectory().createUserAccount("Del3", "d3", "d3", "d3", User.Role.LMDelivery);
        ((LastMileDelivery)(del3.getUser())).setDelivery(del);
        lmDelOrg.addLMDeliveryMent((LastMileDelivery)del3.getUser());
        
        UserAccount del4 = system.getUserAccountDirectory().createUserAccount("Del4", "d4", "d4", "d4", User.Role.LMDelivery);
        ((LastMileDelivery)(del4.getUser())).setDelivery(del);             
        lmDelOrg.addLMDeliveryMent((LastMileDelivery)del4.getUser());
        
        UserAccount del5 = system.getUserAccountDirectory().createUserAccount("Del5", "d5", "d5", "d5", User.Role.DirectDelivery);
        ((DirectDelivery)(del5.getUser())).setDelivery(del);             
        dirDelOrg.addDirectDeliveryMent((DirectDelivery)del5.getUser());
        
        UserAccount del6 = system.getUserAccountDirectory().createUserAccount("Del6", "d6", "d6", "d6", User.Role.DirectDelivery);
        ((DirectDelivery)(del6.getUser())).setDelivery(del);             
        dirDelOrg.addDirectDeliveryMent((DirectDelivery)del6.getUser());
        
        UserAccount managerDel1 = system.getUserAccountDirectory().createUserAccount("ManDel1", "d4", "dm", "dm", User.Role.FMDeliveryManager);
        User qq = managerDel1.getUser();
       ManagerFMDeliveryMenAdmin temp=((ManagerFMDeliveryMenAdmin)(qq));
       temp.setDelivery(del);
       fmDelOrg.addFMDeliveryManager(temp);
       
       UserAccount managerDel2 = system.getUserAccountDirectory().createUserAccount("ManDel2", "d4", "dm2", "dm", User.Role.LMDeliveryManager);
        User pp = managerDel2.getUser();
       ManagerLMDeliveryMenAdmin temp2=((ManagerLMDeliveryMenAdmin)(pp));
       temp2.setDelivery(del);
       lmDelOrg.addLMDeliveryManager(temp2);
       
       UserAccount managerDel3 = system.getUserAccountDirectory().createUserAccount("ManDel3", "d4", "dm3", "dm", User.Role.DirectDeliveryManager);
        User rr = managerDel3.getUser();
       ManagerDirectDeliveryMenAdmin temp3=((ManagerDirectDeliveryMenAdmin)(rr));
       temp3.setDelivery(del);
       dirDelOrg.addDirDeliveryManager(temp3);
       
       //UserAccount fcAdm1 = system.getUserAccountDirectory().createUserAccount("FCAcc", "C1", "fcAdmin", "s", User.Role.FCAdmin,fc );
       UserAccount fcManager1 = system.getUserAccountDirectory().createUserAccount("FCManager", "C1", "fcManager", "a", User.Role.FCManager);
       FCManager fcm =((FCManager)fcManager1.getUser());
       fcm.setFC(fc);
       //fcm.setInboundOrg(inbOrg);
       //fcm.setOutboundOrg(outOrg);
       inbOrg.addInboundManager(fcm);
       outOrg.addOutboundManager(fcm);
       
       UserAccount rec1 = system.getUserAccountDirectory().createUserAccount("Rec1", "rec1", "rec1", "rec1", User.Role.Recieve);
       inbOrg.addRecieve((Recieve)rec1.getUser());// addLMDeliveryMent((LastMileDelivery)del4.getUser());
       
       UserAccount rec2 = system.getUserAccountDirectory().createUserAccount("Rec2", "rec2", "rec2", "rec2", User.Role.Recieve);
       inbOrg.addRecieve((Recieve)rec2.getUser());
       
       UserAccount stow1 = system.getUserAccountDirectory().createUserAccount("Stow1", "Stow1", "Stow1", "Stow1", User.Role.Stow);
       inbOrg.addStow((Stow)stow1.getUser());// addRecieve((Recieve)rec1.getUser());// addLMDeliveryMent((LastMileDelivery)del4.getUser());
       
       UserAccount stow2 = system.getUserAccountDirectory().createUserAccount("Stow2", "Stow2", "Stow2", "Stow2", User.Role.Stow);
       inbOrg.addStow((Stow)stow2.getUser());
       
       ((Recieve)(rec1.getUser())).setFC(fc); 
       ((Recieve)(rec1.getUser())).setInboundOrg(inbOrg); 
       ((Recieve)(rec2.getUser())).setFC(fc); 
       ((Recieve)(rec2.getUser())).setInboundOrg(inbOrg); 
       
       ((Stow)(stow1.getUser())).setFC(fc); 
       ((Stow)(stow2.getUser())).setFC(fc); 
       //rec1.setInboundOrg(inbOrg);
       //rec2.setInboundOrg(inbOrg);
       ((Stow)(stow1.getUser())).setInboundOrg(inbOrg);
       ((Stow)(stow2.getUser())).setInboundOrg(inbOrg);
       
       UserAccount pickAndPack1 = system.getUserAccountDirectory().createUserAccount("PAndP1", "PAndP1", "PAndP1", "pp1", User.Role.PickAndPack, fc);
       outOrg.addPickAndPackMen((PickAndPack)pickAndPack1.getUser());// addRecieve((Recieve)rec1.getUser());// addLMDeliveryMent((LastMileDelivery)del4.getUser());
       UserAccount pickAndPack2 = system.getUserAccountDirectory().createUserAccount("PAndP2", "PAndP2", "PAndP2", "pp2", User.Role.PickAndPack, fc);
       outOrg.addPickAndPackMen((PickAndPack)pickAndPack2.getUser());
       UserAccount dock1 = system.getUserAccountDirectory().createUserAccount("Dock1", "Dock1", "Dock1", "Dock1", User.Role.Dock);
       outOrg.addDockMen((Dock)dock1.getUser());// addStow((Stow)stow1.getUser());// addRecieve((Recieve)rec1.getUser());// addLMDeliveryMent((LastMileDelivery)del4.getUser());
       UserAccount dock2 = system.getUserAccountDirectory().createUserAccount("Dock2", "Dock2", "Dock2", "Dock2", User.Role.Dock);
       outOrg.addDockMen((Dock)dock2.getUser());// addStow((Stow)stow1.getUser());// addRecieve((Recieve)rec1.getUser());// addLMDeliveryMent((LastMileDelivery)del4.getUser());//addStow((Stow)stow2.getUser());
       ((PickAndPack)(pickAndPack1.getUser())).setFC(fc);
       ((PickAndPack)(pickAndPack2.getUser())).setFC(fc);
       ((Dock)(dock1.getUser())).setFC(fc);
       ((Dock)(dock2.getUser())).setFC(fc);
        
       ((PickAndPack)(pickAndPack1.getUser())).setOutboundOrg(outOrg);
       ((PickAndPack)(pickAndPack2.getUser())).setOutboundOrg(outOrg);
       ((Dock)(dock2.getUser())).setOutboundOrg(outOrg);
       ((Dock)(dock2.getUser())).getOutboundOrg();
       //pickAndPack2.setFC(fc);
       //pickAndPack2.setInboundOrg(inbOrg);
       //dock1.setFC(fc);
       //dock1.setInboundOrg(inbOrg);
       //dock2.setFC(fc);
       //dock2.setInboundOrg(inbOrg);
       
       
       UserAccount hub1=system.getUserAccountDirectory().createUserAccount("hu1", "hu1", "hu1", "hu1", User.Role.HubManager);
       hubOrg.addHubMen((HubMan)hub1.getUser());
       ((HubMan)(hub1.getUser())).sethAndLM(hubAndLastMile);
       ((HubMan)(hub1.getUser())).setHubOrganization(hubOrg);
       
       UserAccount hub2=system.getUserAccountDirectory().createUserAccount("hu2", "hu2", "hu2", "hu2", User.Role.HubManager);
       hubOrg.addHubMen((HubMan)hub2.getUser());
       ((HubMan)(hub2.getUser())).sethAndLM(hubAndLastMile);
       ((HubMan)(hub2.getUser())).setHubOrganization(hubOrg);
       
       UserAccount lm1=system.getUserAccountDirectory().createUserAccount("lmm1", "lmm1", "lmm1", "lmm1", User.Role.LMManager);
       lmOrg.addLMMen((LastMileMan)lm1.getUser());
       ((LastMileMan)(lm1.getUser())).sethAndLM(hubAndLastMile);// setHubAndLastMile(hubAndLastMile);
       ((LastMileMan)(lm1.getUser())).setLastMileOrg(lmOrg);
       
       UserAccount lm2=system.getUserAccountDirectory().createUserAccount("lmm2", "lmm2", "lmm2", "lmm2", User.Role.LMManager);
       lmOrg.addLMMen((LastMileMan)lm2.getUser());
       ((LastMileMan)(lm2.getUser())).sethAndLM(hubAndLastMile);//setHubAndLastMile(hubAndLastMile);
       ((LastMileMan)(lm2.getUser())).setLastMileOrg(lmOrg);
       
       
       
       
       
       
       
       
       
       
       


        //       system.setAdminDirectory(new AdminDirectory());
 //       system.setManagerDirectory(new ManagerDirectory());
 //       system.setCustomerDirectory(new CustomerDirectory());
 //       system.setRestaurantDirectory(new RestaurantDirectory());
 //       system.setDeliveryManDirectory(new DeliveryManDirectory());
        //String name, String location, int zipCode, String restaurantType, float avgPriceOfFood, int bookingPhoneNumber
 //       Restaurant re1 = system.getRestaurantDirectory().createRestaurant("res1","Boston",02120,"Italian",10, (Long) 8888888888l);     
 //       Restaurant re2 = system.getRestaurantDirectory().createRestaurant("res2","New York",10001,"Indian",11, (Long) 9999999999l);
        
 //       system.getUserAccountDirectory().createUserAccount("a", "A1","a", "a",User.Role.Admin);
 //       UserAccount m1 = system.getUserAccountDirectory().createUserAccount("manager","M1","m","m",User.Role.Manager);
 //       ((Manager)(m1.getUser())).setRestaurant(re1);
 //       UserAccount m2 = system.getUserAccountDirectory().createUserAccount("manager","M2","m2","m",User.Role.Manager);
 //       ((Manager)(m2.getUser())).setRestaurant(re2);
 //       UserAccount d1 = system.getUserAccountDirectory().createUserAccount("delivery", "D1", "d", "d", User.Role.DeliveryMan);
 //       ((DeliveryMan)(d1.getUser())).setRestaurant(re1);
 //       UserAccount d2 = system.getUserAccountDirectory().createUserAccount("delivery", "D2", "d2", "d", User.Role.DeliveryMan);
 //       ((DeliveryMan)(d2.getUser())).setRestaurant(re1);
 //       UserAccount d3 = system.getUserAccountDirectory().createUserAccount("delivery", "D3", "d3", "d", User.Role.DeliveryMan);
 //       ((DeliveryMan)(d3.getUser())).setRestaurant(re2);
 //       UserAccount c1 = system.getUserAccountDirectory().createUserAccount("Customer", "C1", "c", "c", User.Role.Customer);
 //       ((Customer)(c1.getUser())).setAddress("1575 Tremont St.");
 //      UserAccount c2 = system.getUserAccountDirectory().createUserAccount("Customer", "C2", "c2", "c", User.Role.Customer);
 //       ((Customer)(c2.getUser())).setAddress("149 Boylston St.");
        
 //       Item i1 = new Item("Burger", 4.99f,re1);
 //       Item i2 = new Item("Pizza", 2.99f,re1);
 //       Item i3 = new Item("Pasta", 9.99f,re1);
 //       Item i4 = new Item("Soup", 1.99f,re2);
 //       Item i5 = new Item("Rice", 2.99f,re2);
 //       Item i6 = new Item("Noodles", 6.99f,re2);
        
 //       re1.addMenuItem(i1);
 //       re1.addMenuItem(i2);
 //       re1.addMenuItem(i3);
 //      re2.addMenuItem(i4);
 //       re2.addMenuItem(i5);
 //       re2.addMenuItem(i6);
        
 //       List<Item> order = new ArrayList();
 //       order.add(i1);
 //       order.add(i3);
 //       List<Item> order2 = new ArrayList();
 //       order2.add(i4);
 //       order2.add(i5);
        
 //       re1.addRating((Customer)(c1.getUser()), 86);
 //       re1.addRating((Customer)(c2.getUser()), 92);
 //       re2.addRating((Customer)(c1.getUser()), 75);
 //       re2.addRating((Customer)(c2.getUser()), 82);
        //FoodRatings foodRating1= new FoodRatings((Customer)c1.getUser(),re1,86f);
        //FoodRatings foodRating2= new FoodRatings((Customer)c2.getUser(),re1,92f);
   //     ((Customer)c1.getUser()).addRatings(foodRating1);
   //     ((Customer)c2.getUser()).addRatings(foodRating2);
   //     re1.addRating(foodRating1);
   //     re1.addRating(foodRating2);
 //       Order orderObject1 = new Order((Customer)c1.getUser(),order,"spicy",re1);
 //       Order orderObject2 = new Order((Customer)c1.getUser(),order2,"sweet",re2);
 //       re1.getOrders().add(orderObject1);
 //       ((Customer)c1.getUser()).addOrder(orderObject1);
 //       re2.getOrders().add(orderObject2);
 //       ((Customer)c1.getUser()).addOrder(orderObject2);
        
        return system;
    }
    
}
