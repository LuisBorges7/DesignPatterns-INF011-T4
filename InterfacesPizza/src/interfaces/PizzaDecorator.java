package interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisborges
 */
public abstract class PizzaDecorator implements PizzaComponent{
    public final void setDecorated(PizzaComponent decorated) {
        this.decorated = decorated;        
    }
    protected PizzaComponent decorated;
}