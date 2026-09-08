package org.example;

public class Lamp {
    //Attribute
    boolean isON;

    //konstructor
    public Lamp (boolean isON){
        this.isON = isON;
    }


    //slå på lampan
    public void turnOn (){
        isON = true;
    }
    //slå av lampan
    public void turnOff (){
        isON = false;
    }
}
