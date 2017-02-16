/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

/**
 *
 * @author Estudiantes
 */
public class Banda {   
    Instrumento[] usar; 
    Instrumento instrumentos;
  
    Musicos interpretes;
    
    public Banda(){
        instrumentos=new Instrumento();
        instrumentos.crearInstrumentos();
    }
    //funcion que crea La banda con n instrumentos diferentes
    void crearBanda(int cant){
       
        
        usar=new Instrumento[cant]; 
        System.out.println("Se creo una banda compuesta por "+cant+" musicos con los siguientes Instrumentos:");
        for(int i=0;i<cant;i++){
            interpretes=new Musicos("Musico "+(i+1));
              do{
                usar[i]=usar[i].getInstrumentos().get((int)(Math.random()*(10)));
                
           }while(repetido(i));
              System.out.println(""+(i+1)+". "+usar[i].getNombre());
        }
        
    }
    
    //Funcion que analiza si algun instrumento en la banda esta repetido
    boolean repetido(int i){
       for(int j=0;j<i;j++){
            if(usar[j].getNombre()==usar[i].getNombre()){
                return true;
            }
        }
        return false;
    }
    
    //Funcion donde la banda toca una nota
    void Tocar(Nota nota){
        
        int i=0;
        if(usar!=null){
            System.out.println("tocando una nota de "+nota.getAutor());
        while(i<usar.length){
            System.out.println(interpretes.getMusicos().get(i).getId()+" Esta interpretando "+usar[i].getNombre());
            i++;
        }
        }else
            System.out.println("Error No se ha creado la banda");
    }

    void afinar(int a) {
      
        System.out.println("se ha afinado "+usar[a-1].getNombre()+" con exito");
        
    }

}
