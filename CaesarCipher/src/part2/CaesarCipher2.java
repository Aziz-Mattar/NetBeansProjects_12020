/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;
import part1.CaesarCipher;

/**
 *
 * @author aziz
 */

class CaesarCipher2 {
    public static String encrypt(String text) {   
        StringBuffer result= new StringBuffer(); 
        for (int i=0; i<text.length(); i++) {               
                if (((int)text.charAt(i))%2==0) {                    
                    result.append(CaesarCipher.encrypt(String.valueOf(text.charAt(i)), 3));
                } 
                else{                    
                    result.append(CaesarCipher.encrypt(String.valueOf(text.charAt(i)), -1));
                } 
        } 
        return result.toString(); 
    } 
    public static String decrypt(String text) {    
        StringBuffer result= new StringBuffer(); 
        for (int i=0; i<text.length(); i++) {           
            //System.out.println(((int)text.charAt(i)));
                if (((int)text.charAt(i))%2==0) {                    
                    result.append(CaesarCipher.decrypt(String.valueOf(text.charAt(i)), -1));
                } 
                else{                    
                    result.append(CaesarCipher.decrypt(String.valueOf(text.charAt(i)), 3));
                } 
        } 
        return result.toString(); 
    }
} 
