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
public class Broquel implements Escudo{

    @Override
    public String ubicacion() {
        return "Broquel.png";
    }

    @Override
    public int x() {
        return 20;
    }

    @Override
    public int y() {
        return 150;
    }
    
}
