/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialis2;

/**
 *
 * @author Light
 */
public class SeguimientoObject {
    
    String index;
    int horas;
    String descripcion;

    public SeguimientoObject(String index, int horas, String descripcion) {
        this.index = index;
        this.horas = horas;
        this.descripcion = descripcion;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
