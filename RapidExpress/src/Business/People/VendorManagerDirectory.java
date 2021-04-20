/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.FCManager;
import Business.Role.LastMileDelivery;
import Business.Role.VendorManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class VendorManagerDirectory {
    ArrayList<VendorManager> fcManagerDirectory;
    public List<VendorManager> getVendorManagerList(){
        return this.fcManagerDirectory;
    }
    
    public VendorManagerDirectory(){
        this.fcManagerDirectory=new ArrayList<VendorManager>();
    }
    public VendorManager createVendorManager(int id){
        VendorManager temp = new VendorManager(id);
        fcManagerDirectory.add(temp);
        return temp;
    }
    public int updateVendorManager(String firstName, String lastName, int id){
        LastMileDelivery temp=new LastMileDelivery(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(VendorManager m:this.getVendorManagerList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removeVendorManager(FCManager u){
        fcManagerDirectory.remove(u);
    }
    public int removeVendorManagerById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(VendorManager m : this.getVendorManagerList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.getVendorManagerList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
