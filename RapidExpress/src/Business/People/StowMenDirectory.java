/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.Recieve;
import Business.Role.Stow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class StowMenDirectory {
    ArrayList<Stow>stowMenList;
        public List<Stow> getStowMenList(){
        return this.stowMenList;
    }
    public StowMenDirectory(){
        this.stowMenList=new ArrayList<Stow>();
    }
    public Stow createStowMan(int id){
        Stow temp = new Stow(id);
        stowMenList.add(temp);
        return temp;
    }
    public int updateStowMen(String firstName, String lastName, int id){
        Stow temp=new Stow(id);
        int checkIfFulfillmentCenterAdminFound=0;
        for(Stow m:this.getStowMenList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    
    public void removeStowMan(Stow u){
        stowMenList.remove(u);
    }
    public int removeStowManById(int id){
        int checkIfFulfillmentCenterAdminFound=0;
        for(Stow m : this.getStowMenList()){
            //try{
                if(m.getId()==id){
                    checkIfFulfillmentCenterAdminFound=1;
                    this.getStowMenList().remove(m);
                break;//return;
                }
                
            }
        return checkIfFulfillmentCenterAdminFound;
        }
}
