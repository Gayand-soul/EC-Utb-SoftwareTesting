package org.example;

public class Counter {

    private int rows = 0;
    private int letters = 0;
    private int words = 0;
    private String longestWord = "";

    //Metod: kontroll om 'stop' fanns
    public boolean isStop(String text){
        return text.equals("stop");//förutsätter att man skriver småbokst..
    }

    //Metod: räknar rader, tecken och ord, sparar längsta ordet
    public void addLine(String text) {
        rows++;
        letters = letters + text.length();

        String trimmedText = text.trim();
        if(trimmedText.isEmpty()){
            return;//tom rad
        }

        String[] wordArray = trimmedText.split("\\s+");
        words = words + wordArray.length;

        for(String word : wordArray){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
    }

    //getters
    public int getRows() {
        return rows;
    }
    public int getLetters() {
        return letters;
    }
    public int getWords() { return words; }
    public String getLongestWord() { return longestWord; }

}