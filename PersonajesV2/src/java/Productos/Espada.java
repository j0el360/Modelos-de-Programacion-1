/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author Joel
 */
public class Espada implements Arma{

    @Override
    public String ubicacion() {
        return "Espada.png";
    }

    @Override
    public int x() {
        return 140;
    }

    @Override
    public int y() {
        return 70;
    }
    
}
