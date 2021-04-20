/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.POJO;

import Business.EnterpriseVendor.Vendor;

/**
 *
 * @author nisho
 */
public class Product {
    Vendor vendor;
    //add this - possible for direct delivery or by amazon
    int productId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    String productName;
    String productCategory;
    float productCost;
    String weightCategory;
    //product weight category - small, medium, big
    float productWeight;
    //product weight - <30 small, 31-70 medium, >70 big
    private static int counter=0;
    
    public Product(Vendor vendor, String name, float cost, float weight){
        this.productId=++counter;
        this.vendor=vendor;
        this.productName=name;
        this.productCost=cost;
        this.productWeight=weight;
        this.setProductWeightCategory(this.productWeight);
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductCost() {
        return productCost;
    }

    public void setProductCost(float productCost) {
        this.productCost = productCost;
    }

    public String getWeightCategory() {
        return weightCategory;
    }

    public float getProductWeight() {
        return productWeight;
    }

    public void setProductWeightCategory(float productWeight) {
        this.productWeight = productWeight;
        if(productWeight<30){
            this.weightCategory="Small";
        }
        else if(productWeight>30 && productWeight<71){
            this.weightCategory="Medium";
        }
        else{
            this.weightCategory="Large";
        }
    }
    @Override
    public int hashCode(){
        return productId;
    }
    //@Override
    //public boolean equals(Object o){
    //    return this.productId==((Product)o).getProductId();
    //}
    @Override
    public String toString(){
        return ""+this.getProductName();
    }
    
}
