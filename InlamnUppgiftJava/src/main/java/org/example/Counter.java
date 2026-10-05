package org.example;

public class Counter {

    private int rows = 0;
    private int letters = 0;

    public void addLine(String text) {
        rows++;
        letters = letters + text.length();
    }
    public int getRows() {
        return rows;
    }
    public int getLetters() {
        return letters;
    }
}