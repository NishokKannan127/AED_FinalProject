/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.FCManager;
import Business.Role.HubMan;
import Business.Role.LastMileDelivery;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class HubManDirectory {
    ArrayList<HubMan> hubManDirectory=new ArrayList<HubMan>();
    public List<HubMan> gethubManList(){
        return this.hubManDirectory;
    }
    public HubManDirectory(){
        this.hubManDirectory=new ArrayList<HubMan>();
    }
    public HubMan createhubMan(int id){
        HubMan temp = new HubMan(id);
        hubManDirectory.add(temp);
        return temp;
    }
    public int updatehubMan(String firstName, String lastName, int id){
        HubMan temp=new HubMan(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(HubMan m:this.gethubManList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removehubMan(HubMan u){
        hubManDirectory.remove(u);
    }
    public int removehubManById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(HubMan m : this.gethubManList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.gethubManList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
