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
public class Bread implements OrderItem{

    @Override
    public String accept(OrderItemVisitor anOrderItemVisitor) {
        return anOrderItemVisitor.visit(this);
    }
    
}
