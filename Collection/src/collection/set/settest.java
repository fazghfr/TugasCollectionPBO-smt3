/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.set;

import java.util.HashSet;

/**
 *
 * @author fauza
 */
public class settest {
    public static void main(String[] args) {
        HashSet<String> mobil = new HashSet<String>();
        
        if(mobil.isEmpty()){
            System.out.println("Set kosong");
        }
        
        mobil.add("Toyota");
        mobil.add("Rolls Royce");
        
       if(mobil.contains(new String("Toyota"))){
           System.out.println("Toyota ada di dalam set");
       }
       
       mobil.add("Toyota");
       
       for(String i : mobil){
           System.out.println(i);
       }
    }
}