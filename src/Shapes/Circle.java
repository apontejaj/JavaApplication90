/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author apont
 */
public class Circle extends Shape{
    
    private double radius;

    public Circle(double radius) {
        super("Green", false);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 10;
        this.colour = "Red";
        this.isFilled = true;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", colour=" + colour +"}";
    }


   
    
    
}
