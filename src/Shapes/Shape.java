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
public abstract class Shape {
    
    protected String colour;
    protected boolean isFilled;
    
    public Shape(String colour, boolean isFilled){
        this.colour = colour;
        this.isFilled = isFilled;
    }
    
    public Shape(){
        this.colour = "Red";
        this.isFilled = true;
    }    
    
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    
    public String toString(){
        return "This is a shape.";
    }
    
}
