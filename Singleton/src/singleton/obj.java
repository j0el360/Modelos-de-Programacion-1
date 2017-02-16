/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Joel
 */
public class obj {

    private static obj objeto;
    String nombre;
    private obj(String n) {
        this.nombre=n;
        }

    public static obj getObjeto(String n) {
        if(objeto==null){
            objeto=new obj(n);
        }
        return objeto;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
