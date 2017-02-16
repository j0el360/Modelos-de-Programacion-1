
package singleton;

/**
 *
 * @author Joel
 */
public class Singleton {

   
    public static void main(String[] args) {
      obj objeto = obj.getObjeto("pez");
      System.out.println(objeto.getNombre());
      
      /*
      Al intertear crear otro objeto nos imprime el nombre del primer objeto que nos habia creado
      */
      //obj objet = obj.getObjeto("camion");
      //System.out.println(objet.getNombre());
      
      /*
      Al intertear crear un objeto de esta forma nos da error ya que el constructor es privado
      */
      //obj objeto2=new obj("carro");
    }
    
}
