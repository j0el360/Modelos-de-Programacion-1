/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Instrumento {
    
    
    String nombre;
    
    //Funcion que crea 10 instrumentos diferentes
    void crearInstrumentos(){
    Instrumento guitarra=new Instrumento("La Guitarra");
    Instrumento bateria=new Instrumento("La Bateria");
    Instrumento bajo=new Instrumento("El Bajo");
    Instrumento violin=new Instrumento("El Violin");
    Instrumento viola=new Instrumento("La Viola");
    Instrumento tambor=new Instrumento("El Tambor");
    Instrumento piano=new Instrumento("El Piano");
    Instrumento maracas=new Instrumento("Las Maracas");
    Instrumento lira=new Instrumento("La Lira");
    Instrumento acordeon=new Instrumento("El Acordeon");
    }
    
    //Se crea una lista de instrumentos 
    private static ArrayList<Instrumento> instrumentos =new ArrayList<Instrumento>();
      
    //Constructor que le asigna el nombre a cada instrumento y lo añade a la lista
    public Instrumento(String nombre){
        this.nombre=nombre;
        instrumentos.add(this);
    }
    
    //Constructor que llama a la funcion crearinstrumentos
    public Instrumento(){
        crearInstrumentos();
    }

    
    public String getNombre() {
        return nombre;
    }

    public static ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }
    
   
}
