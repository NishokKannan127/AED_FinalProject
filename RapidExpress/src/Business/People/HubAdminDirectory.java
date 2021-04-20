/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.FulfillmentCenterAdmin;
import Business.Role.HubAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class HubAdminDirectory {
    ArrayList<HubAdmin> hubAdminList=new ArrayList<HubAdmin>();
    
    public List<HubAdmin> getHubAdminList(){
        return this.hubAdminList;
    }
    
    public HubAdmin createHubAdmin(int id){
        HubAdmin temp = new HubAdmin(id);
        hubAdminList.add(temp);
        return temp;
    }
    public int updateHubAdmin(String firstName, String lastName, int id){
        HubAdmin temp=new HubAdmin(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(HubAdmin m:this.getHubAdminList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            //try{
                if(m.getId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        checkIfFulfillmentCenterAdminFound=1;
                        m.setFirstName(firstName);
                        m.setLastName(lastName);
                        break;
                    
                }
            //    else{
            //        throw new Exception();
            //    }
            }
        return checkIfFulfillmentCenterAdminFound;
            //catch(Exception ex){
            //    System.out.println("Cannot find the id in the directory. Enter a correct customer id");
            //}
            
        }
    
    
    public void removeHubAdmin(HubAdmin u){
        hubAdminList.remove(u);
    }
    public int removeHubAdminById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(HubAdmin m : this.getHubAdminList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.getHubAdminList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
