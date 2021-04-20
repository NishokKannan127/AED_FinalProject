/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.HubAdmin;
import Business.Role.LastMileAdmin;
import Business.Role.LastMileDelivery;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class LastMileDeliveryMenDirectory {
    ArrayList<LastMileDelivery> lastMileAdminDirectory;
    public List<LastMileDelivery> getLastMileDeliveryList(){
        return this.lastMileAdminDirectory;
    }
    public LastMileDeliveryMenDirectory(){
        this.lastMileAdminDirectory=new ArrayList<LastMileDelivery>();
    }
    public LastMileDelivery createLastMileDelivery(int id){
        LastMileDelivery temp = new LastMileDelivery(id);
        this.lastMileAdminDirectory.add(temp);
        return temp;
    }
    public int updateLastMileDelivery(String firstName, String lastName, int id){
        LastMileDelivery temp=new LastMileDelivery(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(LastMileDelivery m:this.getLastMileDeliveryList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removeLastMileDelivery(LastMileDelivery u){
        lastMileAdminDirectory.remove(u);
    }
    public int removeLastMileDeliveryById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(LastMileDelivery m : this.getLastMileDeliveryList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.getLastMileDeliveryList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
