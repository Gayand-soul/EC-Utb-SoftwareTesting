package org.example;

public class Rectangle {

    //Attribute
    int width;
    int height;

    //constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //setters
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    //getters
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    //method returns Area
    public int calculateArea(){
        return width * height;
    }
    //Omkrets
    public int calculatePerimeter (){
        return (width + height) * 2;
    }

    //isSquare metod
    public boolean isSquare(){
        return width == height;
    }

}
