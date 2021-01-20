/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author aziz
 */
public abstract class ShapeDecorator implements Shape{
    Shape decoratedshape;
    
    ShapeDecorator(Shape decoratedshape){
        this.decoratedshape = decoratedshape;
    };
    
    @Override
    public void draw() {
        decoratedshape.draw();
        //super
    }

}
