package parcialis2;

import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;



public class Reporte  {
    
public Map proyectos;
private int max;
    
    public Reporte(Map proyectos,int max)
    {
        this.proyectos=proyectos;
        this.max=max;
        this.maximo();
        this.MostrarActividades();
    }
        
    private void maximo()
    {
        int maxim=0;
        int i=0;
        while(i<=max)
        {
            if(proyectos.containsKey("NombreActividad "+i))
            {
                maxim=i+1;
            }
            i++;
        }
        this.max=maxim;
    }
    
    
    public  void MostrarActividades()
    {
    
//        System.out.println(proyectos.get("NombreActividad".toString()));
//        System.out.println("-----");
//        System.out.println(proyectos.get("Descripcion".toString()));
//        System.out.println("-----");
//        System.out.println(proyectos.get("Tiempo en horas".toString()));
//        System.out.println("-----");
        
        if(!proyectos.isEmpty())
        {
            /*
            for( Iterator it = proyectos.keySet().iterator(); it.hasNext();) 
            { 
                String s = (String)it.next();
                String s1 = (String)proyectos.get(s);
                System.out.println(s + " : " + s1);
            }
            * */
            
            int j=0;
            while(j<max)
            {
                if(!proyectos.containsKey("NombreActividad "+j))
                {
                    for(int i=j;i<max;i++)
                    {
                        if(proyectos.containsKey("NombreActividad "+i))
                        {
                            j=i;
                            break;
                        }
                    }
                    continue;
                }
                else
                {
                    System.out.println("NombreActividad "+j+" : "+proyectos.get("NombreActividad "+j));
                    System.out.println("Descripcion "+j+" : "+proyectos.get("Descripcion "+j));
                    System.out.println("Tiempo en horas "+j+" : "+proyectos.get("Tiempo en horas "+j));
                    j++;    
                }
            }
        }
        
        
        else
        {
            JOptionPane.showMessageDialog(null,"Esta Vacio");
        }
      
        System.out.println("----------------------------------------------------------------");
     }
  
   
     
   

}