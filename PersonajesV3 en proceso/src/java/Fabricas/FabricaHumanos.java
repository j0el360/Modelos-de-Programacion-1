/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Arma;
import Productos.Armadura;
import Productos.ArmaduraAcero;
import Productos.Corsel;
import Productos.Escudo;
import Productos.Espada;
import Productos.Gota;
import Productos.Montura;

/**
 *
 * @author Joel
 */
public class FabricaHumanos implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new Espada();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraAcero();
    }

    @Override
    public Escudo crearEscudo() {
        return new Gota();
    }

    @Override
    public Montura crearMontura() {
        return new Corsel();
    }
    
}
