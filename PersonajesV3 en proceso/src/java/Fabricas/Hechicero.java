/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

/**
 *
 * @author Estudiantes
 */
public class Hechicero implements Personaje{

    @Override
    public String ubicacion() {
        return "hechicero.png";
    }

    @Override
    public int personajex() {
        return 35;
    }

    @Override
    public int personajey() {
        return 40;
    }
    
}
