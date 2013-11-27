/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialis2;

/**
 *
 * @author Juan Garcia
 */
public class User 
{
 
    String userName;
    String password;
    
    
    public User(String userName, String password)
    {
    
        this.userName = userName;
        this.password = password;
    
    }


    public String getUserName()
    {
    
        return userName;
    }


    public String getPassword()
    {
    
        return password;
    }


}
