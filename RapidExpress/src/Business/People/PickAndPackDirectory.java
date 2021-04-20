/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.Role.HubAdmin;
import Business.Role.LastMileDelivery;
import Business.Role.PickAndPack;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class PickAndPackDirectory {
    ArrayList<PickAndPack> pickAndPackMenList;
    public List<PickAndPack> getpickAndPackMenListList(){
        return this.pickAndPackMenList;
    }
    public PickAndPackDirectory(){
        pickAndPackMenList=new ArrayList<PickAndPack>();
    }
    public PickAndPack createPickAndPack(int id, Enterprise ent){
        PickAndPack temp = new PickAndPack(id);
        temp.setFC((FulfillmentCenter) ent);
        pickAndPackMenList.add(temp);
        return temp;
    }
    public PickAndPack createPickAndPack(int id){
        PickAndPack temp = new PickAndPack(id);
        pickAndPackMenList.add(temp);
        return temp;
    }
    public int updateLastMileDelivery(String firstName, String lastName, int id){
        PickAndPack temp=new PickAndPack(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(PickAndPack m:this.getpickAndPackMenListList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removeLastMileDelivery(PickAndPack u){
        pickAndPackMenList.remove(u);
    }
    public int removeLastMileDeliveryById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(PickAndPack m : this.getpickAndPackMenListList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.getpickAndPackMenListList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
