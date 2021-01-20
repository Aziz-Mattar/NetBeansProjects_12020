/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author aziz
 */
public class junior extends employee{

    public junior(String name, String id) {
        super(name, id);
        
    }
    
    
    @Override
    String print(){
        return  "I am junior employee";
    }
}
