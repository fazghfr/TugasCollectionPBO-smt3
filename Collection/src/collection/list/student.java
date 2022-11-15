/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author fauza
 */
public class student {
    private ArrayList<String> Student =  new ArrayList();
    
    public void addStudents(String name, int id){
        
        if(id == -1){        
            this.Student.add(name);
        }else{
            this.Student.add(id, name);
        }
    }
    
    public void addStudents(String name){
        this.Student.add(name);
    }
    
    public void removeStudents(String name){
        this.Student.remove(name);
    }
    
    public void sortStud(){
        Collections.sort(Student);
    }
    
    public void dispStud(){
        int i = 1;
        for(String siswa : Student){
            System.out.println("nama :" +siswa +"\t Id : " +i++);
        }
    }
}
