/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public abstract class Student implements Cloneable{
    private String id;
    private String name;
    protected String type;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    public String getId() {
        return id;
    }    

    public String getName() {
        return name;
    }
   
    public String getType() {
        return type;
    }
    
    public abstract String Show();

    @Override
    protected Object clone() {
        Object clone = null;
        try { 
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clone;
    }
    
}
