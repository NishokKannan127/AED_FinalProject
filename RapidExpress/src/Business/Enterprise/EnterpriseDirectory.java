/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseDelivery.DeliveryDirectory;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenterDirectory;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.EnterpriseHubAndLastMile.HubAndLastMileDirectory;
import Business.EnterpriseVendor.Vendor;
import Business.EnterpriseVendor.VendorDirectory;
import Business.POJO.Address;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    private DeliveryDirectory deldir;
    private FulfillmentCenterDirectory fcDirectory;
    private VendorDirectory vendorDir;
    private HubAndLastMileDirectory hubAndLMDir;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
        deldir=new DeliveryDirectory();
        fcDirectory=new FulfillmentCenterDirectory();
        vendorDir=new VendorDirectory();
        hubAndLMDir=new HubAndLastMileDirectory();
    }
    
    //Create enterprise
    public void addEnterprise(Enterprise ent){
        enterpriseList.add(ent);
    }
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type, Address address,Long phone){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Delivery){
            enterprise=new Delivery(name, address);
            enterpriseList.add(enterprise);
            deldir.createDelivery(name, address);
        }
        else if(type==Enterprise.EnterpriseType.FulfillmentCenter){
            enterprise=new FulfillmentCenter(name, address);
            enterpriseList.add(enterprise);
            fcDirectory.createFulfillmentCenter(name,address);
        }
        else if(type==Enterprise.EnterpriseType.HubAndLastMile){
            enterprise=new HubAndLastMile(name, address);
            enterpriseList.add(enterprise);
            hubAndLMDir.createHubAndLastMile(name, address);
        }
        else if(type==Enterprise.EnterpriseType.Vendor){
            enterprise=new Vendor(name,address,phone);
            enterpriseList.add(enterprise);
            vendorDir.createVendor(name, address, phone);
        }
        
        return enterprise;
    }
}
