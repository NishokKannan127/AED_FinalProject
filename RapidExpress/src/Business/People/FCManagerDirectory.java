/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.Dock;
import Business.Role.FCManager;
import Business.Role.LastMileDelivery;
import Business.Role.VendorAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class FCManagerDirectory {
    ArrayList<FCManager> fcManagerDirectory=new ArrayList<FCManager>();
    public List<FCManager> getFCManagerList(){
        return this.fcManagerDirectory;
    }
    public FCManagerDirectory(){
        this.fcManagerDirectory=new ArrayList<FCManager>();
    }
    public FCManager createFCManager(int id){
        FCManager temp = new FCManager(id);
        fcManagerDirectory.add(temp);
        return temp;
    }
    public int updateFCManager(String firstName, String lastName, int id){
        LastMileDelivery temp=new LastMileDelivery(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(FCManager m:this.getFCManagerList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removeFCManager(FCManager u){
        fcManagerDirectory.remove(u);
    }
    public int removeFCManagerById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(FCManager m : this.getFCManagerList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.getFCManagerList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
