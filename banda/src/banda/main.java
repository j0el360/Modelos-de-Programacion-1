/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class main {

    static Banda banda;
    static Nota nota;
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op;
        
        //Inicializamos banda
       banda=new Banda();
       
       
       //Incicializamos Nota
       nota=new Nota();
       //Se crean las notas
       nota.crearNotas();
       
       do{
       System.out.println("1.Crear Banda Aleatoria");
       System.out.println("2.Tocar Nota");
       System.out.println("3.Tocar Nota Aleatoria");
       System.out.println("4.Afinar Instrumento");
       op=leer.nextInt();
       switch(op){
           case 1:
               //Se crea la banda con un numero aleatorio de instrumentos
                banda.crearBanda(3+(int)(Math.random()*(8)));
                break;
           case 2:
               System.out.println("1.Bethoven");
               System.out.println("2.Mozart");
               System.out.println("3.Vivaldi");
               op=leer.nextInt();
               banda.Tocar(nota.getNotas().get(op));
               break;
           case 3:
               banda.Tocar(nota.getNotas().get(1+(int)(Math.random()*(3))));
               break;
           case 4:
               System.out.println("Que instrumento desea afinar");
               int a=leer.nextInt();
               banda.afinar(a);
       }
       }while(op<5);
    }
    
}
