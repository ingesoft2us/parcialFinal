/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialis2;

import java.util.Date;

/**
 *
 * @author Juan Garcia
 */

 public class Folder implements IFolder 
{
 
     java.util.Date fecha = new Date();
     
    
    public void performOperations()
    {
    
        System.out.println("Le advertimos que cualquier cambio que dañe las actividades podrá ser atribuido a usted desde ahora "   );
        System.out.println("----------------------------------------------------------------------------------------------------"   );
    
    
    }
}
