/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.list;

/**
 *
 * @author fauza
 */
public class studenttest {
    public static void main(String[] args) {
       student test = new student();
       
       test.addStudents("Fauzan");
       test.addStudents("Vito", -1);
       test.addStudents("Apta", -1);
       test.addStudents("Clement", 1);
       test.sortStud();
       test.dispStud();
       
        System.out.println("");
       test.removeStudents("Fauzan");
       test.dispStud();
    }
}
