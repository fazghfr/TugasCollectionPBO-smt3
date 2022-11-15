/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.queue;

import java.util.LinkedList;

/**
 *
 * @author fauza
 */
public class queuetest {
     public static void main(String[] args) {
        LinkedList<String> test = new LinkedList<String>();
        
        test.add("a");
        test.add("b");
        test.add("C");
        
        System.out.println("Values : " +test);
         
        while(!test.isEmpty()){
            System.out.println(test.removeFirst());
        }
        System.out.println("");
        test.add("a");
        test.add("z");
        test.add("d");
        
        test.set(2, "e");
        while(!test.isEmpty()){
            System.out.println(test.removeFirst());
        }
            
    }
}
