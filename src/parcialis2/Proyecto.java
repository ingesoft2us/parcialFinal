/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialis2;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Juan Garcia
 */
public class Proyecto 
{

   private String nombrep;
   private String descripcionproyecto;
   List reqfunproyecto;
   List reqnofunproyecto;
   
   public Proyecto()
   {
   
       nombrep= new String();
       descripcionproyecto= new String();
       reqfunproyecto = new ArrayList <String>() {};
       reqnofunproyecto = new ArrayList <String>();
       
   
   }


   //SETTERS
   
   void setNombrep(String nuevoNombrep)
   {
   
       nombrep=nuevoNombrep;
   
   }
   
   void setDescripcionproyecto(String nuevoDescripcionproyecto)
   {
   
       descripcionproyecto=nuevoDescripcionproyecto;
   }
   
  
   void setReqfunproyecto(List reqfunproyecto)
  {
  
      this.reqfunproyecto=reqfunproyecto;
  }
   
  
   void setReqnofunproyecto(List reqnofunproyecto)
   {
   
       this.reqnofunproyecto=reqnofunproyecto;
   }
 
   
   
   //GETTERS
   
   public String getNombrep()
   {
   
       return this.nombrep;
   
   }
   
   public String getDescripcionproyecto()
   {
   
       return this.descripcionproyecto;
   }
   
   public List getReqfunproyecto() 
   {
   
       return this.reqfunproyecto;
       
   }
   
   public List getReqnofunproyecto()
   {
   
       return this.reqnofunproyecto;
   }
}
