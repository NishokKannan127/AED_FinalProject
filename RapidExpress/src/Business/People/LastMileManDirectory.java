/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.HubMan;
import Business.Role.LastMileMan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class LastMileManDirectory {
    ArrayList<LastMileMan> lmDirectory=new ArrayList<LastMileMan>();
    public List<LastMileMan> gethubManLastMileManList(){
        return this.lmDirectory;
    }
    public LastMileManDirectory(){
        this.lmDirectory=new ArrayList<LastMileMan>();
    }
    public LastMileMan createLastMileMan(int id){
        LastMileMan temp = new LastMileMan(id);
        lmDirectory.add(temp);
        return temp;
    }
    public int updateLastMileMan(String firstName, String lastName, int id){
        LastMileMan temp=new LastMileMan(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(LastMileMan m:this.gethubManLastMileManList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
        lmDirectory.remove(u);
    }
    public int removehubManById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(LastMileMan m : this.gethubManLastMileManList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.gethubManLastMileManList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
