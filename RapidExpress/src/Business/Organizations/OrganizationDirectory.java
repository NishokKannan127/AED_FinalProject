/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.Organization.FirstMileDeliveryOrganization;
import Business.EnterpriseDelivery.Organization.LastMileDeliveryOrganization;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.Organization.FulfillmentByRapidExpressOrganization;
import java.util.ArrayList;
import Business.Organization;
import Business.Organization.Type;
import Business.EnterpriseFulfillmentCenter.Organization.InboundOrganization;
import EnterpriseVendor.Organization.MerchantFulfillmentOrganization;
import Business.EnterpriseFulfillmentCenter.Organization.OutboundOrganization;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.EnterpriseHubAndLastMile.Organization.HubOrganization;
import Business.EnterpriseHubAndLastMile.Organization.LastMileOrganization;
import Business.EnterpriseVendor.Organization.SupplyChainOrganization;
import Business.EnterpriseVendor.Vendor;
/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    //
    //public enum Type{
    //    Admin("AdminOrganization"); 
        
        
    //    private String value;
    //    private Type(String value) {
    //        this.value = value;
    //    }
    //    public String getValue() {
    //        return value;
    //    }
    //}
    
    // public enum DeliveryEnt {
         
    //   FirstMileDeliveryOrg("FirstMileDeliveryOrganization"),
    //    LastMileDeliveryOrg("LastMileDeliveryOrganization");
    //    private String value;

    //    private DeliveryEnt(String value) {
    //        this.value = value;
    //    }

    //    public String getValue() {
    //        return value;
    //    }
    // }
    //public enum ECommerceEnt{
    //    Customer("CustomerOrganization"),
    //    FulfillmentByRapidExpress("RapidExpressFulfillmentOrganization");
    //    private String value;

    //    private ECommerceEnt(String value) {
    //        this.value = value;
    //    }

    //    public String getValue() {
    //        return value;
    //    }
    //}
    //public enum HubAndLastMileEnt{
    //    Hub("HubOrganization"),
    //    LastMile("LastMileOrganization");
    //    private String value;

    //    private HubAndLastMileEnt(String value) {
    //        this.value = value;
    //    }

    //    public String getValue() {
    //        return value;
    //   }
    //}
    //public enum VendorEnt {
         
    //    Inbound("InboundOrganization"),
    //    Outbound("OurboundOrganization"),
    //    MerchantFulfillment("MerchantFulfillmentOrganization");
    //    private String value;

    //    private VendorEnt(String value) {
    //        this.value = value;
    //    }

    //    public String getValue() {
    //        return value;
    //   }
    //}
    //
//    public Organization createOrganization(Type type, String realName){
//        Organization organization = null;
//        if (type.getValue().equals(Type.Doctor.getValue())){
//            organization = new DoctorOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.SystemCoordinator.getValue())){
//            organization = new SystemCoordinatorOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Pathologist.getValue())){
//            organization = new PathologistOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
//        return organization;
//    }
    
    //public enum FulfillmentCenterEnt{
    //    FulfillmentByRapidEx("FulfillmentByRapidEx");
    //    private String value;
    //    
    //    private FulfillmentCenterEnt(String value){
    //        this.value=value;
    //    }
    //    public String getValue() {
    //        return value;
    //    }
    //}
    public Organization createDeliveryOrganization(Organization.DeliveryEnt type, String realName, Delivery del){
        Organization organization = null;
        if (type.getValue().equals(Organization.DeliveryEnt.FirstMileDeliveryOrg.getValue())){
            organization = new FirstMileDeliveryOrganization(realName, del);
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.DeliveryEnt.LastMileDeliveryOrg.getValue())){
            organization = new LastMileDeliveryOrganization(realName, del);
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createHubLastMileOrganization(Organization.HubAndLastMileEnt type, String realName, HubAndLastMile hAndLM){
        Organization organization = null;
        if (type.getValue().equals(Organization.HubAndLastMileEnt.Hub.getValue())){
            organization = new HubOrganization(realName, hAndLM);
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.HubAndLastMileEnt.LastMile.getValue())){
            organization = new LastMileOrganization(realName, hAndLM);
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createVendorOrganization(Organization.VendorEnt type, String realName, Vendor ven){
        Organization organization = null;
        if (type.getValue().equals(Organization.VendorEnt.SupplyChainOrganization.getValue())){
            organization = new SupplyChainOrganization(realName, ven);
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        
        return organization;
    }
     
    public void createAdminOrganization(Organization.Type adminType, String realName){
        //Organization organization = null;
        //if (legalType.getValue().equals(Organization.LegalType.LegalOfficer.getValue())){
        //    organization = new LegalOfficerOrganization();
        //    organization.setRealName(realName);
        //    organizationList.add(organization);
        //}
        //return organization;
    }
    
    public Organization createFulfillmentCenterOrganization(Organization.FulfillmentCenterEnt type, String realName, FulfillmentCenter fc){
        Organization organization = null;
        if (type.getValue().equals(Organization.FulfillmentCenterEnt.FulfillmentByRapidEx.getValue())){
            organization = new FulfillmentByRapidExpressOrganization(realName, fc);
           organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.FulfillmentCenterEnt.Outbound.getValue())){
            organization = new InboundOrganization(realName, fc);
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.FulfillmentCenterEnt.Outbound.getValue())){
            organization = new OutboundOrganization(realName, fc);
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
//     public Organization createCustomerOrganization(Organization.ECommerceEnt cusType, String realName){
//        Organization organization = null;
//        if (cusType.getValue().equals(Organization.ECommerceEnt.Customer.getValue())){
//            organization = new PlasmaBankOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
//        return organization;
//    }
     
//     public Organization createHubOrganization(Organization.CovidCentreType covidType, String realName){
//        Organization organization = null;
//        if (covidType.getValue().equals(Organization.CovidCentreType.CovidCentre.getValue())){
//            organization = new CovidCentreOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
//        return organization;
//    }
     
     
//    public Organization createHubOrganization(Organization.GovernmentType govtType, String realName){
//        Organization organization = null;
//        if (govtType.getValue().equals(Organization.GovernmentType.Government.getValue())){
//            organization = new GovernmentOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
//        return organization;
//    }
//    public Organization createLastMileStationOrganization(Organization.GovernmentType govtType, String realName){
//        Organization organization = null;
//        if (govtType.getValue().equals(Organization.GovernmentType.Government.getValue())){
//            organization = new GovernmentOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
//        return organization;
//    }
     
}