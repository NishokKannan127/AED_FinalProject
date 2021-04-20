/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.HubAdmin;
import Business.Role.PickAndPack;
import Business.Role.Recieve;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class RecieveDirectory {
    ArrayList<Recieve> recieveMenList=new ArrayList<Recieve>();
    public List<Recieve> getRecieveList(){
        return this.recieveMenList;
    }
    public RecieveDirectory(){
        recieveMenList=new ArrayList<Recieve>();
    }
    public Recieve createRecieve(int id){
        Recieve temp = new Recieve(id);
        recieveMenList.add(temp);
        return temp;
    }
    public int updateRecieve(String firstName, String lastName, int id){
        Recieve temp=new Recieve(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(Recieve m:this.getRecieveList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            //try{
                if(m.getId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        checkIfFulfillmentCenterAdminFound=1;
                        m.setFirstName(firstName);
                        m.setLastName(lastName);
                        break;
                    
                }
            //    else{
            //        throw new Exception();
            //    }
            }
        return checkIfFulfillmentCenterAdminFound;
            //catch(Exception ex){
            //    System.out.println("Cannot find the id in the directory. Enter a correct customer id");
            //}
            
        }
    
    
    public void removeRecieve(Recieve u){
        recieveMenList.remove(u);
    }
    public int removeRecieveById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(Recieve m : this.getRecieveList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.getRecieveList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
