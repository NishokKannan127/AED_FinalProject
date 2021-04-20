/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseFulfillmentCenter;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.EnterpriseVendor.Vendor;
import Business.POJO.Address;
import Business.Role.FulfillmentCenterAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class FulfillmentCenterDirectory {
    private ArrayList<FulfillmentCenter> fcList;
    
    public List<FulfillmentCenter> getFulfillmentCenterList(){
        return this.fcList;
    }
    public FulfillmentCenter getFCById(int id){        
        for(FulfillmentCenter r : this.fcList){            
            if(r.getFulfillmentCenterId()==id) return r;
        }
        return null;
    }
    public FulfillmentCenterDirectory(){
        this.fcList=new ArrayList<FulfillmentCenter>();
    }
    public FulfillmentCenter createFulfillmentCenter(String name, Address address){
        FulfillmentCenter temp = new FulfillmentCenter(name,address);
        fcList.add(temp);
        return temp;
    }
    public int updateFulfillmentCenter(String name, Address address, int id){
        //FulfillmentCenter temp=new FulfillmentCenter(id);
        int checkIfFulfillmentCenterFound=0;
        for(FulfillmentCenter m:this.getFulfillmentCenterList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            //try{
                if(m.getFulfillmentCenterId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        checkIfFulfillmentCenterFound=1;
                        m.setEntAddress(address);// setFirstName(firstName);
                        m.setName(name);
                        break;
                    
                }
            //    else{
            //        throw new Exception();
            //    }
            }
        return checkIfFulfillmentCenterFound;
            //catch(Exception ex){
            //    System.out.println("Cannot find the id in the directory. Enter a correct customer id");
            //}
            
        }
    
    
    public void removeFulfillmentCenter(FulfillmentCenter u){
        fcList.remove(u);
    }
    public int removeFulfillmentCenterById(int id){
        int checkIfFulfillmentCenterFound=0;
        for(FulfillmentCenter m : this.getFulfillmentCenterList()){
            //try{
                if(m.getFulfillmentCenterId()==id){
                    checkIfFulfillmentCenterFound=1;
                    this.getFulfillmentCenterList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterFound;
        }
}
