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
public class Order implements OrderItem{
    private OrderItem[] items;

    public Order() {
        items = new OrderItem[] {new Bread(), new Cheese(), new Tea() };
    }
    
    @Override
    public String accept(OrderItemVisitor anOrderItemVisitor) {
        String output ="";
        output+= anOrderItemVisitor.visit(this) + "\n";
        for(OrderItem orderItem: items)
            output+= orderItem.accept(anOrderItemVisitor) +"\n";
        return output;
    }
}
