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
public class ArmaduraCuero implements Armadura{

    @Override
    public String ubicacion() {
        return "ArmaduraElfo.png";
    }

    @Override
    public int x() {
        return 35;
    }

    @Override
    public int y() {
        return 40;
    }
    
}
