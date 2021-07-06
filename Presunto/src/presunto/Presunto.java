/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presunto;

import interfaces.PizzaComponent;
import interfaces.PizzaDecorator;

/**
 *
 * @author luisborges
 */
public class Presunto extends PizzaDecorator{
    public Presunto(){
    }
    
    public Presunto(PizzaComponent decorated) {
    this.decorated = decorated;
    }
    
    @Override
    public void preparar() {
        decorated.preparar();
        System.out.println("Colocando Presunto");
    }
}
