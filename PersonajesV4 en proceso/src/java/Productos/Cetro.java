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
public class Cetro implements Arma{

    @Override
    public String ubicacion() {
        return "Cetro.png";
    }

    @Override
    public int x() {
        return 10;
    }

    @Override
    public int y() {
        return 60;
    }
    
}
