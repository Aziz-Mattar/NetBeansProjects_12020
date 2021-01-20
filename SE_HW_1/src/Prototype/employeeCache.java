/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.Hashtable;

/**
 *
 * @author aziz
 */
public class employeeCache {
    private static Hashtable<String, employee> empMap = new Hashtable<String, employee>();
    
    static employee getEmp(String id){
        employee cachedEmp = empMap.get(id);
        return (employee) cachedEmp.clone();
    }
    
    static void loadCache(String name, String id , String type){
//        junior j = new junior();
//        j.setId("1");
//        empMap.put(j.getId(), j);
//        
//        senior s = new senior();
//        s.setId("2");
//        empMap.put(s.getId(), s);
//        
//        supervisor sp = new supervisor();
//        sp.setId("3");
//        empMap.put(sp.getId(), sp);

        if(type.equalsIgnoreCase("junior"))
            empMap.put(id, new junior(id, name));
        else if(type.equalsIgnoreCase("senior"))
            empMap.put(id, new senior(id, name));
        else if(type.equalsIgnoreCase("supervisor"))
            empMap.put(id, new supervisor(id, name)); 
        
    }
}
