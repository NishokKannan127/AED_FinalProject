/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Enterprise.Enterprise;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.Role.Customer;
import Business.Role.FulfillmentCenterAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class FulfillmentCenterAdminDirectory {
    ArrayList<FulfillmentCenterAdmin> fcAdminList;
    
    public FulfillmentCenterAdminDirectory(){
        this.fcAdminList=new ArrayList<FulfillmentCenterAdmin>();
    }
    public List<FulfillmentCenterAdmin> getFulfillmentCenterAdminList(){
        return this.fcAdminList;
    }
    
    public FulfillmentCenterAdmin createFulfillmentCenterAdmin(int id, Enterprise ent){
        FulfillmentCenterAdmin temp = new FulfillmentCenterAdmin(id, ent);
        temp.setFC((FulfillmentCenter) ent);
        fcAdminList.add(temp);
        return temp;
    }
    public int updateFulfillmentCenterAdmin(String firstName, String lastName, int id, Enterprise ent){
        FulfillmentCenterAdmin temp=new FulfillmentCenterAdmin(id, ent);
        int checkIfFulfillmentCenterAdminFound=0;
        for(FulfillmentCenterAdmin m:this.getFulfillmentCenterAdminList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removeFulfillmentCenterAdmin(FulfillmentCenterAdmin u){
        fcAdminList.remove(u);
    }
    public int removeFulfillmentCenterAdminById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(FulfillmentCenterAdmin m : this.getFulfillmentCenterAdminList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.getFulfillmentCenterAdminList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
