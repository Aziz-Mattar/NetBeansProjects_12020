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
public interface OrderItemVisitor {
    public String visit(Bread aBread);
    public String visit(Cheese aCheese);
    public String visit(Tea aTea);
    public String visit(Order aOrder);
}
