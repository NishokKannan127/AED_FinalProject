/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseDelivery;

import Business.EnterpriseVendor.Vendor;
import Business.POJO.Address;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class DeliveryDirectory {
    ArrayList<Delivery> deliveryList;
    public DeliveryDirectory(){
        this.deliveryList=new ArrayList<Delivery>();
    }
    public List<Delivery> getDeliveryList(){
        return this.deliveryList;
    }
    
    public Delivery createDelivery(String name, Address address){
        Delivery temp = new Delivery(name, address);
        deliveryList.add(temp);
        return temp;
    }
    public int updateDelivery(String name,int id){
        //Vendor temp=new Vendor(name, address, phoneNumber);
        int checkIfVendorFound=0;
        for(Delivery m:this.getDeliveryList()){
            //EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            //try{
                if(m.getDeliveryId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        //setFirstName(firstName);
                        checkIfVendorFound=1;
                        //m.setAddress(address);      
                       // m.setPhoneNumber(phoneNumber);
                        m.setName(name);
                        //m.setProductAndQuantity(productAndQuantity);
                        //m.setProductsOffered(productsOffered);
                        break;
                    
                }
            //    else{
            //        throw new Exception();
            //    }
            }
        return checkIfVendorFound;
            //catch(Exception ex){
            //    System.out.println("Cannot find the id in the directory. Enter a correct customer id");
            //}
            
        }
    public Delivery getDeliveryById(int id){        
        for(Delivery r : this.deliveryList){            
            if(r.getDeliveryId()==id) return r;
        }
        return null;
    }
    public void removeDelivery(Vendor u){
        deliveryList.remove(u);
    }
    public int removeDeliveryById(int id){
        int checkIfVendorFound=0;
        for(Delivery m : this.getDeliveryList()){
            //try{
                if(m.getDeliveryId()==id){
                    checkIfVendorFound=1;
                    this.getDeliveryList().remove(m);
                break;//return;
                }
                
            }
        return checkIfVendorFound;
        }
}
