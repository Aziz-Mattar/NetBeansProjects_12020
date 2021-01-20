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
public abstract class AbstractFactory {
    abstract Color getColor(String colorType) ;
    abstract car getCar(String carType) ;
}
