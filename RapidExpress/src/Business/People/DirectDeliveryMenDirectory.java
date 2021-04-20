/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.DeliveryMen;
import Business.Role.DirectDelivery;
import Business.Role.FirstMileDelivery;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class DirectDeliveryMenDirectory {
    private List<DirectDelivery> deliveryManList = new ArrayList();
    
    public List<DirectDelivery> getDirectDeliveryManList(){
        return this.deliveryManList;
    }
    
    public DeliveryMen createDirectDeliveryMan(int id){//, int restaurantId){
        DirectDelivery temp = new DirectDelivery(id);//, restaurantId);
        deliveryManList.add(temp);
        return temp;
    }
    public int updateDirectDeliveryMan(String firstName, String lastName, int id, int restaurantID){
        //DeliveryMen temp=new DeliveryMen(id);
        int checkIfDeliveryManFound=0;
        for(DirectDelivery m:this.getDirectDeliveryManList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){            
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
     
    public void removeDirectDeliveryMan(DeliveryMen d){
        deliveryManList.remove(d);
    }
    public int removeDirectDeliveryManById(int id){
        int checkIfDeliveryManFound=0;
        for(DirectDelivery m : this.getDirectDeliveryManList()){
            if(m.getId()==id){
                this.getDirectDeliveryManList().remove(m);
                checkIfDeliveryManFound=1;
                break;
            }
        }
        return checkIfDeliveryManFound;
    }
}
