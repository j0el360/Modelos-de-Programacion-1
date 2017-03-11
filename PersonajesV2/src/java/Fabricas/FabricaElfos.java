/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Arco;
import Productos.Arma;
import Productos.Armadura;
import Productos.ArmaduraCuero;
import Productos.Dorado;
import Productos.Escudo;
import Productos.Montura;
import Productos.Unicornio;

/**
 *
 * @author Joel
 */
public class FabricaElfos implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new Arco();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraCuero();
    }

    @Override
    public Escudo crearEscudo() {
        return new Dorado();
    }

    @Override
    public Montura crearMontura() {
        return new Unicornio();
    }
    
    Personaje personaje=new Elfo();
    public String getPersonaje(){
        return personaje.ubicacion();
    }
    
}
