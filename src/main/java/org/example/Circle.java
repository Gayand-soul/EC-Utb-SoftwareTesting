package org.example;

import static javax.swing.text.html.parser.DTDConstants.PI;

public class Circle {
    //attribute
    double radius;

    //constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //getters
    public double getRadius(){
        return radius;
    }
    //setters
    public void setRadius(double radius){
        this.radius = radius;
    }

    //Circle Area
    public double calculateArea(){
        return (PI * radius * radius);
    }

    //Circle Perimeter
    public double calculateCircumference(){
        return (2 * PI * radius);
    }
    //Jämföra Area med Omkrets
    public boolean hasSmallArea(){
        return calculateArea() < calculateCircumference();
    }
}
