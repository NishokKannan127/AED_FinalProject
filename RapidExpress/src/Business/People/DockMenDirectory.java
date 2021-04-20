/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.Role.Customer;
import Business.Role.Dock;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class DockMenDirectory {
    ArrayList<Dock> dockMenList=new ArrayList<Dock>();
    
    public List<Dock> getDockMenList(){
        return this.dockMenList;
    }
    
    public Dock createDockMen(int id){
        Dock temp = new Dock(id);
        dockMenList.add(temp);
        return temp;
    }
    public int updateDockMen(String firstName, String lastName, int id){
        //Dock temp=new Dock(id);
        int checkIfDockMenFound=0;
        for(Dock m:this.getDockMenList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            //try{
                if(m.getId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        checkIfDockMenFound=1;
                        m.setFirstName(firstName);
                        m.setLastName(lastName);
                        break;
                    
                }
            //    else{
            //        throw new Exception();
            //    }
            }
        return checkIfDockMenFound;
            //catch(Exception ex){
            //    System.out.println("Cannot find the id in the directory. Enter a correct customer id");
            //}
            
        }
    
    
    public void removeDockMen(Dock u){
        dockMenList.remove(u);
    }
    public int removeDockMenById(int id){
        int checkIfDockMenFound=0;
        for(Dock m : this.getDockMenList()){
            //try{
                if(m.getId()==id){
                    checkIfDockMenFound=1;
                    this.getDockMenList().remove(m);
                break;//return;
                }
                
            }
        return checkIfDockMenFound;
        }
}
