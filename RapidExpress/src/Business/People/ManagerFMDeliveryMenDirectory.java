/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.EcoSystem;
import Business.EnterpriseDelivery.Delivery;
import Business.Role.ManagerFMDeliveryMenAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class ManagerFMDeliveryMenDirectory {
    private List<ManagerFMDeliveryMenAdmin> managerList = new ArrayList();
    public List<Delivery> deliveryList = new ArrayList();
    
    public ManagerFMDeliveryMenDirectory(){
        this.managerList=new ArrayList<ManagerFMDeliveryMenAdmin>();
        this.deliveryList=new ArrayList<Delivery>();
    }
    
    public List<ManagerFMDeliveryMenAdmin> getManagerList(){
        return this.managerList;
    }
    
    public ManagerFMDeliveryMenAdmin createManager(int id){
        ManagerFMDeliveryMenAdmin temp = new ManagerFMDeliveryMenAdmin(id);
        managerList.add(temp);
        return temp;
    }
    public int updateManager(String firstName, String lastName, int id, int deliveryID){
        ManagerFMDeliveryMenAdmin temp=new ManagerFMDeliveryMenAdmin(id);
        int checkIfDeliveryManManagerFound=0;        
        for(ManagerFMDeliveryMenAdmin m:this.getManagerList()){
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
    
    public void removeManager(ManagerFMDeliveryMenAdmin d){
        managerList.remove(d);
    }
    
    public void removeManagerById(int id){
        int checkIfDeliveryManFound=0;
        for(ManagerFMDeliveryMenAdmin m : this.managerList){
            if(m.getId()==id){
                checkIfDeliveryManFound=1;
                this.managerList.remove(m);
                return;
            }
        }
    }
}
