/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.POJO.Address;
import Business.POJO.Order;
import Business.UserAccount.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nisho
 */
public class Customer extends User{
    //private String customerID;
    private String name;
    private Date dob;
    private int age;
    private String gender;
    private Address address;
    private int contact;
    private String emailID;
    private String imagePath; 
    private byte[] dP;
    private String latLong;
    private List<Order> orders;
    

    public Customer(int id){
        super(id);
        this.orders=new ArrayList<Order>();
    }
    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }

    public boolean isHasPaidTheAmount() {
        return hasPaidTheAmount;
    }

    public void setHasPaidTheAmount(boolean hasPaidTheAmount) {
        this.hasPaidTheAmount = hasPaidTheAmount;
    }
    private boolean hasPaidTheAmount;

    public byte[] getdP() {
        return dP;
    }
    public void setdP(byte[] dP) {
        this.dP = dP;
    }
    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
        public void addOrder(Order o){
        this.orders.add(o);
    }
    //public void addRatings(FoodRatings rat){
    //    this.foodRestaurantRatings.add(rat);
    //}
    public List<Order> getOrders(){
        return this.orders;
    }

// Getter Setter Functions
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getContact() {return contact;}
    public void setContact(int contact) {this.contact = contact;}
    public Date getDob() {        return dob;    }
    public void setDob(Date dob) {        this.dob = dob;    }
    public int getAge() {        return age;    }
    public void setAge(int age) {        this.age = age;    }
    public String getGender() {        return gender;    }
    public void setGender(String gender) {        this.gender = gender;    }
    public void setAddress(Address address){this.address=address;}
    public Address getAddress(){return address;}
    public String getAddressInString(){
        return this.address.getState()+", "+this.address.getCity()+", "+this.address.getArea()+", "+this.address.getLocation();
    }
    public String getEmailID() {return emailID;}
    public void setEmailID(String emailID) {this.emailID = emailID;}
    public void setHasPaidAmount(boolean hasPaid){this.hasPaidTheAmount=hasPaid;}
    
       
}
