/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author aziz
 */
public class FactoryProducer {
       public static AbstractFactory getFactory(String type){   
           if(type.equalsIgnoreCase("color"))
               return new colorFactory();
           else if(type.equalsIgnoreCase("car"))
               return  new carFactory();
           else 
               return new carFactory();
       }
}
