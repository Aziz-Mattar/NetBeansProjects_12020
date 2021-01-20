/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

/**
 *
 * @author aziz
 */

public class CaesarCipher {
    public static String encrypt(String text, int s) {   
            StringBuffer result= new StringBuffer(); 
            for (int i=0; i<text.length(); i++) {            
                 char ch = (char)(((int)text.charAt(i) + (26+(s%26)) - 97) % 26 + 97);                                                             
                            result.append(ch); 
            } 
            return result.toString(); 
    } 
    public static String decrypt(String text, int s) {    
            return CaesarCipher.encrypt(text, (26-(s%26)));
//            StringBuffer result= new StringBuffer(); 
//            for (int i=0; i<text.length(); i++) {            
//                 char ch = (char)(((int)text.charAt(i) + 26-s - 97) % 26 + 97);                                                             
//                            result.append(ch); 
//            } 
//            return result.toString();
    }
//    public static void main(String[] args) {
//        for (int i = 1; i <= 26; i++) {
//            System.out.println(CaesarCipher.decrypt("abdalaziz", i));
//            
//        }
//        
//    }
} 
    
