/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aashgar
 */
public class Subject {
    private List<Observer> observers =
            new ArrayList<Observer>();
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
         notifyAllObservers();
    }
    
    public void attach(Observer observer){
        this.observers.add(observer);
    }
    
    public void notifyAllObservers(){
        for(Observer observer: this.observers)
            observer.show();
    }
}
