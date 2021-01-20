/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author aziz
 */
public class ShapeMaker {
    //AGGRAGATION
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();      
    }
     //مش تكرار هذا تطبيق للفكرة الاساسية للفاساد  انو يكون المسؤول
    void drawCircle(){
        circle.draw();
    }
    
    void drawSquare(){
        square.draw();
    }
    void drawRectangle(){
        rectangle.draw();
    }
}
