/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.POJO;

/**
 *
 * @author nisho
 */
public class Address {
    private String location;
    private String area;
    private String city;
    private String state;
    private int addressId;
    private static int counter=0;

    public Address(String state, String city, String area, String location){
        addressId=++counter;
        this.state=state;
        this.city=city;
        this.area=area;
        this.location=location;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
