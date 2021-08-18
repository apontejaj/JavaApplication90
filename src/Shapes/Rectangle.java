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
public class Rectangle extends Shape{
    
    private double width;
    private double height;

    
    public Rectangle(double width, double height){
        
        super("Blue", true);
        this.width = width;
        this.height = height;
        System.out.println("Rectangle Created");
    }

    public Rectangle(double size) {
        super("Pink", false);
        this.width = size;
        this.height = size;

    }

    public Rectangle() {
        super();
        this.width = 10;
        this.height = 10;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + ", color=" + colour + "}";
    }


    
}
