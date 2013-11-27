
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author santiagodejesusrodriguezbeltran
 */
public class Proyecto {

   private String nombreproyecto;
   private String descripcionproyecto;
   List reqfunproyecto;
   List reqnofunproyecto;
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//
//    }

    public Proyecto(){
       nombreproyecto = new String();
       descripcionproyecto = new String();
       reqfunproyecto = new ArrayList();
       reqnofunproyecto = new ArrayList();
    }

   public String getDescripcionproyecto()
    {
      return descripcionproyecto;
    }

   public void setDescripcionproyecto(String descripcionproyecto)
    {
      this.descripcionproyecto = descripcionproyecto;
    }

   public String getNombreproyecto()
    {
      return nombreproyecto;
    }

   public void setNombreproyecto(String nombreproyecto)
    {
      this.nombreproyecto = nombreproyecto;
    }

   

}
