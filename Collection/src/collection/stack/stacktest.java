/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.stack;

import java.util.LinkedList;

/**
 *
 * @author fauza
 */
public class stacktest {
    public static void main(String[] args) {
        LinkedList<String> test = new LinkedList<String>();
        
        test.push("a");
        test.push("b");
        test.push("C");
        
        System.out.println("Values : " +test);
         
        while(!test.isEmpty()){
            System.out.println(test.pop());
        }
        System.out.println("");
        test.push("a");
        test.push("z");
        test.push("d");
        
        test.set(2, "e");
        while(!test.isEmpty()){
            System.out.println(test.pop());
        }
    }
}
