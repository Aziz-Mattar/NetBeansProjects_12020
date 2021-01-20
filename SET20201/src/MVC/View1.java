/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author aashgar
 */
public class View1 implements View{

    @Override
    public String show(String name, String major, double grade) {
        return ("Student data: \n" +
                name + "\n" +
                major +"\n" +
                String.valueOf(grade) +"\n").toLowerCase();
    }
    
}
