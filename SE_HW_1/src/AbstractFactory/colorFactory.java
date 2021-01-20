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
public class colorFactory extends AbstractFactory{
    Color getColor(String colorType){
            if(colorType.equalsIgnoreCase("white"))
                return new white();
        else
            if(colorType.equalsIgnoreCase("black"))
                return new black();
        else
            if(colorType.equalsIgnoreCase("silver"))
                return new silver();
        else
                return new white();
    }

    @Override
    car getCar(String carType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
