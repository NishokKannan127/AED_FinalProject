/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        this.customerList=new ArrayList<Customer>();
    }
    public List<Customer> getCustomerList(){
        return this.customerList;
    }
    
    public Customer createCustomer(int id){
        Customer temp = new Customer(id);
        customerList.add(temp);
        return temp;
    }
    public int updateCustomer(String firstName, String lastName, int id){
        Customer temp=new Customer(id);
        int checkIfCustomerFound=0;
        for(Customer m:this.getCustomerList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            //try{
                if(m.getId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        checkIfCustomerFound=1;
                        m.setFirstName(firstName);
                        m.setLastName(lastName);
                        break;
                    
                }
            //    else{
            //        throw new Exception();
            //    }
            }
        return checkIfCustomerFound;
            //catch(Exception ex){
            //    System.out.println("Cannot find the id in the directory. Enter a correct customer id");
            //}
            
        }
    
    
    public void removeCustomer(Customer u){
        customerList.remove(u);
    }
    public int removeCustomerById(int id){
        int checkIfCustomerFound=0;
        for(Customer m : this.getCustomerList()){
            //try{
                if(m.getId()==id){
                    checkIfCustomerFound=1;
                    this.getCustomerList().remove(m);
                break;//return;
                }
                
            }
        return checkIfCustomerFound;
        }
}
