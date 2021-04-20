/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Delivery;
import Business.Role.DeliveryAdmin;
import Business.Role.Dock;
import Business.Role.VendorAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class DeliveryAdminDirectory {
    ArrayList<DeliveryAdmin> delAdminList;
    Delivery del;
    public List<DeliveryAdmin> getDeliveryAdminList(){
        return this.delAdminList;
    }
    public DeliveryAdminDirectory(){
        this.delAdminList=new ArrayList<DeliveryAdmin>();
    }
    public DeliveryAdmin createDelAdmin(int id, Enterprise ent){
        DeliveryAdmin temp = new DeliveryAdmin(id);
        temp.setDelivery((Delivery) ent);
        delAdminList.add(temp);
//        this.del=(Delivery) ent;
        return temp;
    }
    public int updateDelAdmin(String firstName, String lastName, int id){
        //Dock temp=new Dock(id);
        int checkIfVendorAdminFound=0;
        for(DeliveryAdmin m:this.getDeliveryAdminList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            //try{
                if(m.getId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        checkIfVendorAdminFound=1;
                        m.setFirstName(firstName);
                        m.setLastName(lastName);
                        break;
                    
                }
            //    else{
            //        throw new Exception();
            //    }
            }
        return checkIfVendorAdminFound;
            //catch(Exception ex){
            //    System.out.println("Cannot find the id in the directory. Enter a correct customer id");
            //}
            
        }
    
    
    public void removeDelAdmin(Dock u){
        delAdminList.remove(u);
    }
    public int removeDelAdminById(int id){
        int checkIfVendorAdminFound=0;
        for(DeliveryAdmin m : this.getDeliveryAdminList()){
            //try{
                if(m.getId()==id){
                    checkIfVendorAdminFound=1;
                    this.delAdminList.remove(m);
                break;//return;
                }
                
            }
        return checkIfVendorAdminFound;
        }
}
