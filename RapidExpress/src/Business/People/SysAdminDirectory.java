/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;                                                        
                                                                                
import Business.Role.Sysadmin;                                                  
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisho
 */
public class SysAdminDirectory {
    ArrayList<Sysadmin> sysadminList;
    
    private List<Sysadmin> adminList = new ArrayList();
    
    public List<Sysadmin> getAdminList(){
        return this.adminList;
    }
    
    public Sysadmin createAdmin(int id){
        Sysadmin temp = new Sysadmin(id);
        adminList.add(temp);
        return temp;
    }
    
    public void removeAdmin(Sysadmin u){
        adminList.remove(u);
    }
}
