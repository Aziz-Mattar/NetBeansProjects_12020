/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author aziz
 */
public class Singleton {
    private static Singleton mysql = new Singleton();
    private static Singleton oracle = new Singleton();
    private String connection;

    
    private Singleton(){}
    
    static Singleton getMysql(){
        return mysql;
    }
    
    static Singleton getOracle(){
        return oracle;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
    
    
    void showMessage(){
        System.out.println("Hello World");
    }
}
