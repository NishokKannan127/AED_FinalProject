/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseVendor;

import Business.Enterprise.Enterprise;
import Business.EnterpriseDelivery.Delivery;
import Business.EnterpriseVendor.Organization.SupplyChainOrganization;
import Business.Organizations.SupplyChainOrganizationDirectory;
import Business.POJO.Address;
import Business.POJO.Order;
import Business.POJO.Product;
import Business.Role.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nisho
 */
public class Vendor extends Enterprise{

    
    int vendorId;
    ArrayList<Product> productsOffered;
    String vendorName;
    HashMap<Product,Integer>productAndQuantity;
    Long phoneNumber;
    private List<Order> orders;
    ArrayList<Product> listOfProductOrders;
    private static int ctr = 0;
    SupplyChainOrganizationDirectory suppChOrgDir;

    public SupplyChainOrganizationDirectory getSuppChOrgDir() {
        return suppChOrgDir;
    }

    public void setSuppChOrgDir(SupplyChainOrganizationDirectory suppChOrgDir) {
        this.suppChOrgDir = suppChOrgDir;
    }
    SupplyChainOrganization suppTemp;

    public Vendor(String name, Address address, Long phoneNumber){
        super(name,Enterprise.EnterpriseType.Vendor, address);
        this.vendorId=++ctr;
        this.vendorName = name;
        //this.address=address; 
        this.orders=new ArrayList<Order>();
        this.suppChOrgDir=new SupplyChainOrganizationDirectory();
        try{
            if(phoneNumber>=1000000000L && phoneNumber<=9999999999L){
                this.phoneNumber=phoneNumber;
            }
            else{
                throw new Exception();
            }            
        }
        catch(Exception ex){
            System.out.println("Enter valid phone number");
        }
        productsOffered=new ArrayList<Product>();
        productAndQuantity=new HashMap<Product,Integer>();
        this.listOfProductOrders=new ArrayList<Product>();
    }
    
    public ArrayList<Product> getProductsOffered() {
        return productsOffered;
    }

    public void setProductsOffered(ArrayList<Product> productsOffered) {
        this.productsOffered = productsOffered;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public HashMap<Product, Integer> getProductAndQuantity() {
        return productAndQuantity;
    }

    public void setProductAndQuantity(HashMap<Product, Integer> productAndQuantity) {
        this.productAndQuantity = productAndQuantity;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getVendorId(){
        return vendorId;
    }
    public void addProductsToVendor(Product product){
        this.productsOffered.add(product);
        //this.productAndQuantity.put(product,0);
    }    
    public void addProductAndQuantityToVendor(Product product, Integer quantity){
        this.productAndQuantity.put(product,quantity);
    }
    public void addCustomerProductOrder(Product p){
        this.listOfProductOrders.add(p);
        Integer temp = this.productAndQuantity.get(p);
        if(temp==null){
            this.productAndQuantity.put(p,1);
        }
        else{
            this.productAndQuantity.put(p,temp+1);
        }
        
        
        }
    public SupplyChainOrganization addSupplyChainOrgToDir(String suppChOrg, Vendor v){
        suppTemp=suppChOrgDir.createOrganization(suppChOrg, v);
        return suppTemp;
    }
    public HashMap<Product,Integer> getCustomerProductOrder(){
        return this.productAndQuantity;
    }
    public void addOrder(Order o){
        this.orders.add(o);
    }
    public List<Order> getOrders() {
        return orders;
    }
    @Override
    public String toString(){
        return this.vendorName;
    }
    
}
