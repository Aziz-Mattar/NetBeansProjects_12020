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
public class StopState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Stop State........");
        context.setState(this);        
    }
    
    @Override
    public String toString(){
        return "Stop String";
    }
    
}
