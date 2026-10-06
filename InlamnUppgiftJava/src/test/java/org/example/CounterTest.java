package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CounterTest {

    //Testar att en ny räknare börjar på 0
    @Test
    void newConterStartsAtZero() {
        Counter counter = new Counter();
        assertEquals(0, counter.getRows());
        assertEquals(0, counter.getLetters());
    }

    //Testar att antalet rader räknas rätt
    @Test
    void countsRows() {
        Counter counter = new Counter();
        counter.addLine("Vi");
        counter.addLine("Blev");
        counter.addLine("Som");
        counter.addLine("Andra");
        assertEquals(4, counter.getRows());
    }

    //Testar att tecken räknas rätt, inklusive mellanslag:Sälj dig, sälj dig dyrt
    @Test
    void countsLettersIncludingSpaces() {
        Counter counter = new Counter();
        counter.addLine("Sälj dig ");//8 tecken
        counter.addLine("sälj dig dyrt! ");//15 tecken
        assertEquals(24, counter.getLetters());
    }

    // Testar att en tom rad räknas som rad men ger 0 tecken
    @Test
    void emptyLineCountsAsRowButNoLetters() {
        Counter counter = new Counter();
        counter.addLine("");
        assertEquals(1, counter.getRows());
        assertEquals(0, counter.getLetters());
        assertEquals(0, counter.getWords());
    }

    //Testar att ord ränkas rätt, flera mellanslag
    @Test
    void countsWordsWithExtraSpaces(){
        Counter counter = new Counter();
        counter.addLine("Vi är  tillbaks på noll ");//5 ord
        counter.addLine("   Men ingen kommer sörja   ");//4 ord, stora mellanrum
        assertEquals(9, counter.getWords());

    }

    // Testar att det längsta ordet hittas över flera rader
    @Test
    void finsLongestWord(){
        Counter counter = new Counter();
        counter.addLine("Vi skulle kommit längre");
        counter.addLine("Men räckte inte till");
        counter.addLine("Texten är hämtad från Jockes gästboksinlägg");
        assertEquals("gästboksinlägg", counter.getLongestWord());
    }

    // Testar att stop känns igen, men inte liknande ord
    @Test
    void recognizesStop() {
        Counter counter = new Counter();
        assertTrue(counter.isStop("stop"));
        assertFalse(counter.isStop("stopp"));
        assertFalse(counter.isStop("Stop"));
        assertFalse(counter.isStop("hej"));
    }


}
