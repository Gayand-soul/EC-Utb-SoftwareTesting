package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //skapa ett objekt av Rectangel
        Rectangle myRectangle = new Rectangle(5, 10);
        System.out.println("Rektangelns Omkrets:  " + myRectangle.calculatePerimeter());
        System.out.println( "Rektangelns Area är: " + myRectangle.calculateArea());
        System.out.println("Är fyrkanten kvadrat: " + myRectangle.isSquare());

        //skapa ett objekt av Cirkeln
        Circle myCircle = new Circle(5);
        System.out.println("Cirkelns area är: " +  myCircle.calculateArea());
        System.out.println("Cirkelns omkrets är: "+ myCircle.calculateCircumference());

        System.out.println();
        System.out.println("-----------Cirkelns area jämförelse-----------------------");
        System.out.println();

        //Använder Cirkelmetoder för att jämföra olika radien
        Circle myCircle2 = new Circle(0.5);
        System.out.println("myCirkel2  har area mindre än omkrets: " + myCircle2.hasSmallArea());
        Circle myCircle3 = new Circle(1);
        System.out.println("myCircle3  har area mindre än omkrets: " + myCircle3.hasSmallArea());
        Circle myCircle4 = new Circle(2);
        System.out.println("myCircle4 har area mindre än omkrets: " + myCircle4.hasSmallArea());
        Circle myCircle5 = new Circle(4);
        System.out.println("myCircle5 har area mindre än omkrets: " + myCircle5.hasSmallArea());

        System.out.println();
        //skapa ett objekt av Lamp
        System.out.println("-----------Tända lampan och släcka lampan-----------------------");
        Lamp lavaLamp = new Lamp(false);
        System.out.println(" Är lampan på?: " + lavaLamp.isON);
        lavaLamp.turnOn();
        System.out.println(" Är lampan på? " + lavaLamp.isON);
        lavaLamp.turnOff();
        System.out.println(" Är lampan på? " + lavaLamp.isON);


    }
}

