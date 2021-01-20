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
 * @author aziz
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int State;

    public int getState() {
        return State;
    }

    public void setState(int State) {
        this.State = State;
        notifyAllObservers();
    }
    
    void attach(Observer Observer) {
        observers.add(Observer);
    }

    private void notifyAllObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }
    
}
