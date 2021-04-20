/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.Role.ManagerFMDeliveryMenAdmin;
import Business.Role.ManagerLMDeliveryMenAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class ManagerLMDeliveryMenDirectory {
    private List<ManagerLMDeliveryMenAdmin> managerList = new ArrayList();
    public List<Delivery> deliveryList = new ArrayList();
    
    public ManagerLMDeliveryMenDirectory(){
        this.managerList=new ArrayList<ManagerLMDeliveryMenAdmin>();
        this.deliveryList=new ArrayList<Delivery>();
    }
    
    public List<ManagerLMDeliveryMenAdmin> getManagerList(){
        return this.managerList;
    }
    
    public ManagerLMDeliveryMenAdmin createManager(int id){
        ManagerLMDeliveryMenAdmin temp = new ManagerLMDeliveryMenAdmin(id);
        managerList.add(temp);
        return temp;
    }
    public int updateManager(String firstName, String lastName, int id, int deliveryID){
        ManagerLMDeliveryMenAdmin temp=new ManagerLMDeliveryMenAdmin(id);
        int checkIfDeliveryManManagerFound=0;        
        for(ManagerLMDeliveryMenAdmin m:this.getManagerList()){
            if(m.getId()==id){
                for(Delivery r:EcoSystem.getInstance().getDeliveryDirectory().getDeliveryList()){// getRestaurantDirectory().getRestaurantList()){
                    if(r.getDeliveryId()==deliveryID){                        
                        checkIfDeliveryManManagerFound=1;
                        m.setDeliveryByID(deliveryID);// setRestaurantByID(restaurantID);
                        m.setFirstName(firstName);
                        m.setLastName(lastName);
                        break;
                    }
                }                   
            }
        }
        return checkIfDeliveryManManagerFound;
    } 
    
    public void removeManager(ManagerLMDeliveryMenAdmin d){
        managerList.remove(d);
    }
    
    public void removeManagerById(int id){
        int checkIfDeliveryManFound=0;
        for(ManagerLMDeliveryMenAdmin m : this.managerList){
            if(m.getId()==id){
                checkIfDeliveryManFound=1;
                this.managerList.remove(m);
                return;
            }
        }
    }
}
