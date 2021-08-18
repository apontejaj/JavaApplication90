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
        
        Person p1 = new Person("Allan");
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
        
        System.out.println(p1.getLanguages());
        System.out.println(p2.getLanguages());

        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println(r1.getArea());
        
        Rectangle r2 = new Rectangle(20);
        System.out.println(r2);
        System.out.println(r2.getArea());

        Rectangle r3 = new Rectangle(20, 40);
        System.out.println(r3);
        System.out.println(r3.getArea());
        
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getArea());   
        
        Circle c2 = new Circle(20);
        System.out.println(c2);
        System.out.println(c2.getArea());      
        
        
        Rectangle[] rectangles = new Rectangle[10];
        rectangles[0] = r1;
        //rectangles[2] = c1;
        
        Circle[] circles = new Circle[10];
        circles[0] = c1;
        //circles[1] = r1;
        
        
        Shape[] shapes = new Shape[10];
        shapes[0] = r1;
        shapes[1] = c1;
        
        
        System.out.println("Some changes here");
        
        
        
        

    }
    
}
