/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parmesao;

import interfaces.PizzaComponent;
import interfaces.PizzaDecorator;

/**
 *
 * @author luisborges
 */
public class Parmesao extends PizzaDecorator{
    public Parmesao(){
    }
       
    public Parmesao(PizzaComponent decorated) {
    this.decorated = decorated;
    }
    
    @Override
    public void preparar() {
        decorated.preparar();
        System.out.println("Colocando Parmesão");
    }
    
}
