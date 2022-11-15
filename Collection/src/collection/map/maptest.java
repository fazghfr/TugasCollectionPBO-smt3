/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.map;

import java.util.HashMap;

/**
 *
 * @author fauza
 */
public class maptest {
    public static void main(String[] args) {
       HashMap<Integer, String> test = new HashMap<Integer, String>();
       maptest.addElem(1, "satu", test);
       maptest.addElem(2, "dua", test);
       maptest.addElem(3, "tiga", test);
       
       maptest.disp(test);
       
        System.out.println(getValue(3, test));
    }
    
    public static void addElem(Integer i, String s, HashMap<Integer, String> h){
        h.put(i, s);
    }
    
    public static void disp(HashMap<Integer, String> h){
        for(HashMap.Entry<Integer, String> i : h.entrySet()){
            System.out.println("key : " +i.getKey() +"\tvalue : " +i.getValue());
        }
    }
    
    public static String getValue(int key,  HashMap<Integer, String> h){
        return h.get(key);
    }
}
