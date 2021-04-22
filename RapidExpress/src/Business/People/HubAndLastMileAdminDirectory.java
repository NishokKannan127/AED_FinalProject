/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Enterprise.Enterprise;
import Business.EnterpriseHubAndLastMile.HubAndLastMile;
import Business.Role.Dock;
import Business.Role.FulfillmentCenterAdmin;
import Business.Role.HubAndLastMileAdmin;
import Business.Role.VendorAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class HubAndLastMileAdminDirectory {
    ArrayList<HubAndLastMileAdmin> hubAndLMAdminList=new ArrayList<HubAndLastMileAdmin>();
    HubAndLastMile hubAndLM;
    public List<HubAndLastMileAdmin> getHubAndLMAdminList(){
        return this.hubAndLMAdminList;
    }
    public ArrayList<HubAndLastMileAdmin> returnAllHAndLMAdmins(){
        return this.hubAndLMAdminList;
    }
    public HubAndLastMileAdminDirectory(){
        this.hubAndLMAdminList=new ArrayList<HubAndLastMileAdmin>();
    }
    public HubAndLastMileAdmin createHubAndLastMileAdmin(int id, Enterprise ent){
        HubAndLastMileAdmin temp = new HubAndLastMileAdmin(id);
        temp.setHubAndLastMile((HubAndLastMile) ent);
        hubAndLMAdminList.add(temp);
        //this.hubAndLM=(HubAndLastMile) ent;
        return temp;
    }
    public int updateHubAndLastMileAdmin(String firstName, String lastName, int id){
        //Dock temp=new Dock(id);
        int checkIfVendorAdminFound=0;
        for(HubAndLastMileAdmin m:this.getHubAndLMAdminList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removeHubAndLastMileAdmin(Dock u){
        hubAndLMAdminList.remove(u);
    }
    public int removeHubAndLastMileAdminById(int id){
        int checkIfVendorAdminFound=0;
        for(HubAndLastMileAdmin m : this.getHubAndLMAdminList()){
            //try{
                if(m.getId()==id){
                    checkIfVendorAdminFound=1;
                    this.hubAndLMAdminList.remove(m);
                break;//return;
                }
                
            }
        return checkIfVendorAdminFound;
        }
}
