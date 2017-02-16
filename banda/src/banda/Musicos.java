/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

import java.util.ArrayList;


public class Musicos {
    
    private static ArrayList<Musicos> musicos =new ArrayList<Musicos>();
    String id;
    
   
    public Musicos(String id){
        this.id=id;
        musicos.add(this);
    }

    public static ArrayList<Musicos> getMusicos() {
        return musicos;
    }

    public String getId() {
        return id;
    }
    
    
    
}
