/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author aziz
 */
public class OctalObserver extends Observer{

   public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    
    
    @Override
    void update() {
        System.out.println("Octal String: "+ Integer.toOctalString(subject.getState()));
    }
    
}
