/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author aziz
 */
public class carFactory {
    car getCar(String carType){
        if(carType.equalsIgnoreCase("SUV"))
            return new SUV();
        else if(carType.equalsIgnoreCase("Vans"))
            return new Vans();
        else if(carType.equalsIgnoreCase("Sedan"))
            return new Sedan();
        else return null;
    }
}
