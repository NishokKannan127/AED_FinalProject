/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseHubAndLastMile;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.POJO.Address;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class HubAndLastMileDirectory {
    private ArrayList<HubAndLastMile> hubAndLMList;
    
    public ArrayList<HubAndLastMile> getHubAndLastMileList(){
        return this.hubAndLMList;
    }
    public HubAndLastMile getHubAndLMById(int id){        
        for(HubAndLastMile r : this.hubAndLMList){            
            if(r.getHubAndLastMileCenterId()==id) return r;
        }
        return null;
    }
    public HubAndLastMileDirectory(){
        this.hubAndLMList=new ArrayList<HubAndLastMile>();
    }
    public HubAndLastMile createHubAndLastMile(String name, Address address){
        HubAndLastMile temp = new HubAndLastMile(name, address);
        hubAndLMList.add(temp);
        return temp;
    }
    public int updateHubAndLastMile(String name, int id){
        //FulfillmentCenter temp=new FulfillmentCenter(id);
        int checkIfFulfillmentCenterFound=0;
        for(HubAndLastMile m:this.getHubAndLastMileList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            //try{
                if(m.getHubAndLastMileCenterId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        checkIfFulfillmentCenterFound=1;
                        //m.setAddress(address);// setFirstName(firstName);
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
    
    
    public void removeHubAndLastMile(FulfillmentCenter u){
        hubAndLMList.remove(u);
    }
    public int removeHubAndLastMileById(int id){
        int checkIfFulfillmentCenterFound=0;
        for(HubAndLastMile m : this.getHubAndLastMileList()){
            //try{
                if(m.getHubAndLastMileCenterId()==id){
                    checkIfFulfillmentCenterFound=1;
                    this.getHubAndLastMileList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterFound;
        }
}
