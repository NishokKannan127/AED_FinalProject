/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.POJO.Address;
import Business.POJO.Order;
import Business.POJO.Routes;
import Business.POJO.Shipment;
import Business.UserAccount.User;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nisho
 */
public abstract class DeliveryMen extends User{
    private boolean isAvailable=true; 

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    private int deliveryManId;
    private String name;
    private Date dob;
    private int age;
    private String gender;
    private Address address;
    private int contact;
    private String status;
//    private ArrayList<Shipment> shipmentList;
    //private ArrayList<Order> orderList;
    private Routes route;
    
    //    public String getLatLong() {
//        return latLong;
//    }
    public DeliveryMen(int id){
        super(id);
    }
//    public void setLatLong(String latLong) {
//        this.latLong = latLong;
//    }

    public boolean isHasPaidTheAmount() {
        return hasPaidTheAmount;
    }

    public void setHasPaidTheAmount(boolean hasPaidTheAmount) {
        this.hasPaidTheAmount = hasPaidTheAmount;
    }
    private boolean hasPaidTheAmount;

//    public byte[] getdP() {
//        return dP;
//    }
//    public void setdP(byte[] dP) {
//        this.dP = dP;
//    }
//    public String getImagePath() {
//        return imagePath;
//    }
//    public void setImagePath(String imagePath) {
//        this.imagePath = imagePath;
//   }

// Getter Setter Functions
    public int getDeliveryManId(){
        return deliveryManId;
    }
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
    public Address getAddress(){return address;}
    public void setAddress(Address address){this.address=address;}
//public String getStreetAddress() {        return streetAddress;    }
    //public void setStreetAddress(String streetAddress) {        this.streetAddress = streetAddress;    }
    //public String getCity() {        return city;    }
    //public void setCity(String city) {        this.city = city;    }
    //public String getState() {        return state;    }
    //public void setState(String state) {        this.state = state;    }
    //public int getZipCode() {        return zipCode;    }
    //public void setZipCode(int zipCode) {this.zipCode = zipCode;}
//    public String getEmailID() {return emailID;}
//    public void setEmailID(String emailID) {this.emailID = emailID;}
    public void setHasPaidAmount(boolean hasPaid){this.hasPaidTheAmount=hasPaid;}
    @Override
    public String toString(){
        return this.getLastName();
    }
}
