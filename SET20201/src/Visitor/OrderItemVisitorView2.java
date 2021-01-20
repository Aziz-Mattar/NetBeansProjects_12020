/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author aashgar
 */
public class OrderItemVisitorView2 implements OrderItemVisitor{

    @Override
    public String visit(Bread aBread) {
        return "Displaying Bread".toUpperCase();
    }

    @Override
    public String visit(Cheese aCheese) {
        return "Displaying Cheese".toUpperCase();
    }

    @Override
    public String visit(Tea aTea) {
        return "Displaying Tea".toUpperCase();
    }

    @Override
    public String visit(Order aOrder) {
        return "Displaying Order".toUpperCase();
    }
    
}
