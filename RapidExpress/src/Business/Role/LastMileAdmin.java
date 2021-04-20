/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.POJO.Order;
import Business.POJO.Shipment;
import Business.UserAccount.User;
import java.util.ArrayList;

/**
 *
 * @author nisho
 */
public class LastMileAdmin extends User{
    public LastMileAdmin(int id){
        super(id);
    }
    
    ArrayList<Shipment>shipmentList;
    ArrayList<Order>orderList;
}
