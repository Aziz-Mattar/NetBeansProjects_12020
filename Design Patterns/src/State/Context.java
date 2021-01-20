/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author aziz
 */
public class Context {
    private State state;
    
    Context(){
        state = null;
    }
    
    void setState(State state){
        this.state = state;
    }
    State getState(){
        return state;
    }
}
