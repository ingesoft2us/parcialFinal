/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialis2;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Garcia
 */
public class Principal 
{
    
    public Map proyectos;
    public Reporte reporte;
    private int i=0;
    
    public static void main(String args[])
    {
        new Principal();
    }
    
   
    public Principal()
    {
    
        proyectos = new HashMap();        
        this.Proxy();
        //this.menu();
        
      
    }
   
    
   
    public void Proxy()
    {
    
        
        String usuario= JOptionPane.showInputDialog(null,"Ingrese el nombre del usuario");
        String password= JOptionPane.showInputDialog(null,"Ingrese la contraseña");
        Integer.parseInt(password);
        
        
        User user = new User("Juan", "1234");
        IFolder folderProxy = new FolderProxy(user);
        
        if(user.getUserName().equalsIgnoreCase(usuario) &&
           user.getPassword().equalsIgnoreCase(password))
        {
            folderProxy.performOperations();
            this.menu();
        }
        

        else
        {
            JOptionPane.showMessageDialog(null, "Meta bien la clave idiota de mierda");
            this.Proxy();
            System.out.println("Usted no tiene acceso a la modificación de actividades");
        } 
    
    }
  
    
    public void menu()
     {
       char op;
         
       do {
           
            String opcion=JOptionPane.showInputDialog(
                    "1. Adicionar \n" +
                    "2. Modificar \n" +
                    "3. Eliminar \n" +
                    "4. Reportar \n" +
                    "0. Salir");
            
           op=opcion.charAt(0);
            
            switch (op)
            {
                case '1':
                   this.Adicionar();                 
                    break; 
                case '2':
                   this.Modificar();
                    break; 
                case '3':
                   this.Eliminar();
                    break; 
                case '4':
                   reporte=new Reporte(proyectos,i);
                    break; 
                case '0':
                    System.exit(1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE.");
                    break;
                    
            }
        }
        
       
       while (op!='0'); 
    }    

        
   public void Adicionar()
    {
        String NombreActividad= JOptionPane.showInputDialog(null,"Ingrese el nombre de la actividad");
        proyectos.put("NombreActividad "+i, NombreActividad);
        
        String DescripcionActividad= JOptionPane.showInputDialog(null,"Ingrese una descripcioón de la actividad");
        proyectos.put("Descripcion "+i,DescripcionActividad);
        
        String TiempoActividad= JOptionPane.showInputDialog(null,"Ingrese el tiempo asociado a la actividad");
        proyectos.put("Tiempo en horas "+i,TiempoActividad);
        i++;
               
    }
           
        
   public void Modificar()
   {
       String indx=JOptionPane.showInputDialog(null,"Ingrese el indice de la Actividad a elimnar");
       
        if(proyectos.containsKey("NombreActividad "+indx))
        {
            char op;

            do {

                 String opcion=JOptionPane.showInputDialog(
                         "1. NombreActividad \n" +
                         "2. Descripcion \n" +
                         "3. Tiempo\n" +
                         "0. Salir");

                op=opcion.charAt(0);

                 switch (op)
                 {
                     case '1':
                         String x=JOptionPane.showInputDialog(null,"Ingrese el nuevo nombre");
                         proyectos.remove("NombreActividad "+indx);
                         proyectos.put("NombreActividad "+indx, x);
                         System.out.println("NombreActividad "+indx+": "+ x);
                         break; 
                     case '2':
                         x=JOptionPane.showInputDialog(null,"Ingrese la nueva descripcion");
                         proyectos.remove("Descripcion "+indx);
                         proyectos.put("Descripcion "+indx, x);
                         break; 
                     case '3':
                         x=JOptionPane.showInputDialog(null,"Ingrese el nuevo tiempo");
                         proyectos.remove("Tiempo en horas "+indx);
                         proyectos.put("Tiempo en horas "+indx, x);
                         break; 
                     case '0':
                         break;
                     default:
                         JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE.");
                         break;

                 }
             }


            while (op!='0'); 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El indice no existe");
        }
   }
   
   
   public void Eliminar()
   {
        String indx=JOptionPane.showInputDialog(null,"Ingrese el indice de la Actividad a elimnar");
        if(proyectos.containsKey("NombreActividad "+indx))
        {
            proyectos.remove("NombreActividad "+indx);
            proyectos.remove("Descripcion "+indx);
            proyectos.remove("Tiempo en horas "+indx);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El indice no existe");
        }

     //System.out.println("Después de limpiar:" + proyectos);
   
   }
}
