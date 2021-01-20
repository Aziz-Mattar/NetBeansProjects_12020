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
public class RedShapeDecorator extends ShapeDecorator{
    RedShapeDecorator(Shape decoratedshape){
        super(decoratedshape);
    }
    
    @Override
    public void draw(){
        decoratedshape.draw();
        setRedBorder(decoratedshape);
    }
    
    private void setRedBorder(Shape decoratedshape){
        System.out.println("Border Color: Red");
    }
}
