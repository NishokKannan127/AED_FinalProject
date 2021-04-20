/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EnterpriseFulfillmentCenter.FulfillmentCenter;
import Business.POJO.Order;
import Business.UserAccount.User;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class FCManager extends User{
    public FCManager(int id){
        super(id);
        this.listOfOrdersRecievedByFC=new ArrayList<Order>();
    }
    ArrayList<Order> listOfOrdersRecievedByFC;
    FulfillmentCenter fc;
    public void setFC(FulfillmentCenter fc){
        this.fc=fc;
    }
    public FulfillmentCenter getFC(){
        return this.fc;
    }
}
