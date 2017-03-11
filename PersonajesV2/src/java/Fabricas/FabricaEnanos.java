/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Arma;
import Productos.Armadura;
import Productos.ArmaduraHierro;
import Productos.Broquel;
import Productos.Escudo;
import Productos.Mazo;
import Productos.Montura;
import Productos.Pony;

/**
 *
 * @author Joel
 */
public class FabricaEnanos implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new Mazo();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraHierro();
    }

    @Override
    public Escudo crearEscudo() {
        return new Broquel();
    }

    @Override
    public Montura crearMontura() {
        return new Pony();
    }
    
}
