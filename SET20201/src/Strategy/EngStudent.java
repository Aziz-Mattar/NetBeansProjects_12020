/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author aashgar
 */
public class EngStudent implements Student{

    @Override
    public double calcGrade(double mid, double lab, double fin) {
        return mid*0.20 + lab*0.30 + fin*0.50;
    }
}
