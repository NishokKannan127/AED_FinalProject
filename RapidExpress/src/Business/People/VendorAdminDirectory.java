/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Enterprise.Enterprise;
import Business.EnterpriseVendor.Vendor;
import Business.Role.Customer;
import Business.Role.Dock;
import Business.Role.VendorAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class VendorAdminDirectory {
    
    ArrayList<VendorAdmin> vendorAdminList;
    Vendor vend;
    public List<VendorAdmin> getVendorAdminList(){
        return this.vendorAdminList;
    }
    public VendorAdminDirectory(){
        this.vendorAdminList=new ArrayList<VendorAdmin>();
    }
    public ArrayList<VendorAdmin> returnAllVendordmins(){
        return this.vendorAdminList;
    }
    public VendorAdmin createVendorAdmin(int id, Enterprise ent){
        VendorAdmin temp = new VendorAdmin(id);
        temp.setVendor((Vendor) ent);
        vendorAdminList.add(temp);
//        this.vend=(Vendor) ent;
        return temp;
    }
    public int updateVendorAdmin(String firstName, String lastName, int id){
        //Dock temp=new Dock(id);
        int checkIfVendorAdminFound=0;
        for(VendorAdmin m:this.getVendorAdminList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removeVendorAdmin(Dock u){
        vendorAdminList.remove(u);
    }
    public int removeVendorAdminById(int id){
        int checkIfVendorAdminFound=0;
        for(VendorAdmin m : this.getVendorAdminList()){
            //try{
                if(m.getId()==id){
                    checkIfVendorAdminFound=1;
                    this.vendorAdminList.remove(m);
                break;//return;
                }
                
            }
        return checkIfVendorAdminFound;
        }
}
