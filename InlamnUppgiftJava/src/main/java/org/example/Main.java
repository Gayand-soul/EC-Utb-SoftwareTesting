/*DEL 2,3,4 osv:
-uppgift:Skriv ett program som läser in text ifrån kommandoraden rad
 -för rad tills användaren skriver ordet stop.
* Uppgift:När användaren är klar skriver programmet ut
* antal tecken och hur många rader som användaren har skrivit,
* exklusive raden med ordet stop*/

package org.example;
import java.util.Scanner;

public class Main {

    // Scanner som läser in text som användaren skriver i konsolen
    static Scanner input = new Scanner(System.in);

    // Objekt av klassen Counter som räknar rader och tecken
    static Counter counter = new Counter();

    public static void main(String[] args) {

        System.out.println("Please enter text (type 'stop' to exit): ");
        String text = input.nextLine();

        if(counter.isStop(text)){
            System.out.println("total rows: " + counter.getRows());
            System.out.println("total letters: " + counter.getLetters());
            System.out.println("total words: " + counter.getWords());
            System.out.println("longest word: " + counter.getLongestWord());
        }else {
            counter.addLine(text);
            main(args);
        }
    }
}