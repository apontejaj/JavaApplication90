/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication90;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import model.Person;
import java.util.Scanner;

/**
 *
 * @author apont
 */
public class JavaApplication90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new JavaApplication90();
        
    }
    
    
    public JavaApplication90(){
        
        Person p1 = new Person("Cristian");
        p1.setName("Alida", "mysecretpassword");
        System.out.println(p1.getLanguages());
        p1.addNewLanguague("Spanish");
        p1.addNewLanguague("English");
        
        Person p2 = new Person("Mariana");
        p2.setName("Gabriel", "incorrectpassword");
        System.out.println(p2.getLanguages());
        p2.addNewLanguague("German");
        p2.addNewLanguague("Italian");
        
        
        p1.run();
        p2.run();
  
        
        System.out.println("Cristian is a star!!!!");

    }
    
}
