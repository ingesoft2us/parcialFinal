/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialis2;

/**
 *
 * @author Juan Garcia
 */

public class FolderProxy implements IFolder 
{

    Folder folder;
    User user;
    
    
    public FolderProxy(User user)
    {
    
        this.user=user;
    
    }


    public void performOperations()
    {
    
//        if(user.getUserName().equalsIgnoreCase("Garcia") &&
//           user.getPassword().equalsIgnoreCase("Garcia"))
//        {
        
            folder=new Folder();
            System.out.println("Bienvenido a la sección de modificación de actividades");
            folder.performOperations();
            
        
//        }
    
//        else 
//        {
//        
//            System.out.println("You don´t have acces to this folder");
//        
//        }
    }
}
