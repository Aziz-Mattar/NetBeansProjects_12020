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
public class carFactory extends AbstractFactory{
    car getCar(String carType){
        if(carType.equalsIgnoreCase("SUV"))
            return new SUV();
        else if(carType.equalsIgnoreCase("Vans"))
            return new Vans();
        else if(carType.equalsIgnoreCase("Sedan"))
            return new Sedan();
        else return new SUV();
    }

    @Override
    Color getColor(String colorType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
