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
public class employee implements Cloneable{
    String name;
    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    String print(){
        return "";
    }

    public employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
