/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Arma;
import Productos.Armadura;
import Productos.Escudo;
import Productos.Montura;

/**
 *
 * @author Joel
 */
public interface FabricaAbstracta {
    public Arma crearArma();
    public Armadura crearArmadura();
    public Escudo crearEscudo();
    public Montura crearMontura();
    
}
