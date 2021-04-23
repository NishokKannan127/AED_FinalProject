/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.User.Role;
import Business.People.CustomerDirectory;
import Business.People.FirstMileDeliveryMenDirectory;
import Business.Role.DeliveryMen;

//import Business.Customer.Customer;
//import Business.DeliveryMan.DeliveryMan;
//import Business.Manager.Manager;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    public boolean authenticateUser(String username){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username)){
                return false;
            }
        return true;
    }
    
    public UserAccount createUserAccount(String firstName, String lastName, String username, String password, Role role){
        if(!checkIfUsernameIsUnique(username)) return null;
        UserAccount userAccount = new UserAccount(firstName, lastName, username, password, role);
        userAccountList.add(userAccount);
        return userAccount;
        
    }
    public UserAccount createUserAccount(String firstName, String lastName, String username, String password, Role role, Enterprise enterprise){
        if(!checkIfUsernameIsUnique(username)) return null;
        UserAccount userAccount = new UserAccount(firstName, lastName, username, password, role, enterprise);
        userAccountList.add(userAccount);
        return userAccount;
        
    }
    public void updateUserAccount(int id, String firstName, String lastName, String username, String password, Role role){
        UserAccount tempp = new UserAccount(firstName, lastName, username, password, role);
        int userAccountFound=0;
        User temp = new User(firstName,lastName) {};
//if(!checkIfUsernameIsUnique(username)) return null;
        //User user = new User(firstName, lastName) {};
        for(int i=0; i<userAccountList.size(); i++){
            if(userAccountList.get(i).getAccountId()==id){
                userAccountList.get(i).setUser(temp);// = tempp;
                userAccountList.get(i).setPassword(password);
                userAccountList.get(i).setUsername(username);
                userAccountList.get(i).setPassword(password);        
                userAccountFound=1;
            }
        }
        //userAccountList.add(userAccount);
        //return userAccount;
        
    }
           
    public int deleteAccount(int id){
        int userAccountFound=0;
        for(UserAccount u : userAccountList){
            if(u.getAccountId()==id){
                //userAccountList.remove(u);
                //User user = u.getUser();
                //if(u.getRole()==Role.Admin) EcoSystem.getInstance().getAdminDirectory().removeAdmin((Admin)user);
                //if(u.getRole()==Role.Customer) EcoSystem.getInstance().getCustomerDirectory().removeCustomer((Customer)user);
                //if(u.getRole()==Role.DeliveryMan) EcoSystem.getInstance().getDeliveryManDirectory().removeDeliveryMan((DeliveryMan)user);
                //if(u.getRole()==Role.Manager) EcoSystem.getInstance().getManagerDirectory().removeManager((Manager)user);
                //userAccountFound=1;
                //break;
            }
        }
        return userAccountFound;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
