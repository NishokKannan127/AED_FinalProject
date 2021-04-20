/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;
import java.util.List;
import Business.Role.DeliveryMen;
import Business.Role.FirstMileDelivery;

/**
 *
 * @author nisho
 */
public class FirstMileDeliveryMenDirectory {
    private List<FirstMileDelivery> deliveryManList = new ArrayList<FirstMileDelivery>();
    
    public List<FirstMileDelivery> getFMDeliveryManList(){
        return this.deliveryManList;
    }
    
    public DeliveryMen createFMDeliveryMan(int id){//, int restaurantId){
        FirstMileDelivery temp = new FirstMileDelivery(id);//, restaurantId);
        deliveryManList.add(temp);
        return temp;
    }
    public int updateFMDeliveryMan(String firstName, String lastName, int id, int restaurantID){
        //DeliveryMen temp=new DeliveryMen(id);
        int checkIfDeliveryManFound=0;
        for(FirstMileDelivery m:this.getFMDeliveryManList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){            
                if(m.getId()==id){
                   // try{
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                  //  if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        checkIfDeliveryManFound=1;
                        
                        m.setFirstName(firstName);
                        m.setLastName(lastName);
                        break;
                    }
                }
                    
                    //catch(Exception ex){
                    //    System.out.println("X");
                    //}
            
            //}
            //catch(Exception ex){
            //    System.out.println("Test");
            //
            return checkIfDeliveryManFound;
        }
//        }
     
    public void removeFMDeliveryMan(DeliveryMen d){
        deliveryManList.remove(d);
    }
    public int removeFMDeliveryManById(int id){
        int checkIfDeliveryManFound=0;
        for(FirstMileDelivery m : this.getFMDeliveryManList()){
            if(m.getId()==id){
                this.getFMDeliveryManList().remove(m);
                checkIfDeliveryManFound=1;
                break;
            }
        }
        return checkIfDeliveryManFound;
    }
}
