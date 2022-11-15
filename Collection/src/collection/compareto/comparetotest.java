/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.compareto;

/**
 *
 * @author fauza
 */
public class comparetotest {
    public static void main(String[] args) {
        String str1 = new String("ITS");
        String str2 = new String("MIT");
        String str3 = new String("ITS");
        
        if(str1.compareTo(str3) == 0){
            System.out.println(str1 +" is equal to " +str3);
        }else{
            System.out.println(str1 +" not equal to " +str3);
        }
        
        if(str1.compareTo(str2) == 0){
            System.out.println(str1 +" is equal to " +str2);
        }else{
            System.out.println(str1 +" not equal to " +str2);
        }
    }
}
