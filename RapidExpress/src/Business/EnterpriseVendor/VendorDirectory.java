/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseVendor;

import Business.POJO.Address;
import Business.Role.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class VendorDirectory {
    ArrayList<Vendor> vendorList;
    public VendorDirectory(){
        this.vendorList=new ArrayList<Vendor>();
    }
    public List<Vendor> geVendorList(){
        return this.vendorList;
    }
    
    public Vendor createVendor(String name, Address address, Long phoneNumber){
        Vendor temp = new Vendor(name, address, phoneNumber);
        vendorList.add(temp);
        return temp;
    }
    public int updateVendor(String name, Address address, Long phoneNumber, int id){
        //Vendor temp=new Vendor(name, address, phoneNumber);
        int checkIfVendorFound=0;
        for(Vendor m:this.geVendorList()){
            //EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            //try{
                if(m.getVendorId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        //setFirstName(firstName);
                        checkIfVendorFound=1;
                        m.setEntAddress(address);      
                        m.setPhoneNumber(phoneNumber);
                        m.setVendorName(name);
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
    public Vendor getVendorById(int id){        
        for(Vendor r : this.vendorList){            
            if(r.getVendorId()==id) return r;
        }
        return null;
    }
    public void removeVendor(Vendor u){
        vendorList.remove(u);
    }
    public int removeVendorById(int id){
        int checkIfVendorFound=0;
        for(Vendor m : this.geVendorList()){
            //try{
                if(m.getVendorId()==id){
                    checkIfVendorFound=1;
                    this.geVendorList().remove(m);
                break;//return;
                }
                
            }
        return checkIfVendorFound;
        }
}
