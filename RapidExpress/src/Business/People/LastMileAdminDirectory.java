/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.HubAdmin;
import Business.Role.LastMileAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class LastMileAdminDirectory {
    ArrayList<LastMileAdmin> lastMileAdminDirectory=new ArrayList<LastMileAdmin>();
    public List<LastMileAdmin> getLastMileAdminList(){
        return this.lastMileAdminDirectory;
    }
    
    public LastMileAdmin createLastMileAdmin(int id){
        LastMileAdmin temp = new LastMileAdmin(id);
        lastMileAdminDirectory.add(temp);
        return temp;
    }
    public int updateLastMileAdmin(String firstName, String lastName, int id){
        LastMileAdmin temp=new LastMileAdmin(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(LastMileAdmin m:this.getLastMileAdminList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removeLastMileAdmin(LastMileAdmin u){
        lastMileAdminDirectory.remove(u);
    }
    public int removeLastMileAdminById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(LastMileAdmin m : this.getLastMileAdminList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.getLastMileAdminList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
