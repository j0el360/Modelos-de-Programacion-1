/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Arma;
import Productos.Armadura;
import Productos.Cetro;
import Productos.Dragon;
import Productos.Escudo;
import Productos.Montura;
import Productos.Amuleto;
import Productos.Tunicas;

/**
 *
 * @author Joel
 */
public class FabricaHechiceros implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new Cetro();
    }

    @Override
    public Armadura crearArmadura() {
        return new Tunicas();
    }

    @Override
    public Escudo crearEscudo() {
        return new Amuleto();
    }

    @Override
    public Montura crearMontura() {
        return new Dragon();
    }
    
}
