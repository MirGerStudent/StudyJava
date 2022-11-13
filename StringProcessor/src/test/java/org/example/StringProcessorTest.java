package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void iterTest1() throws NumIsNotGood {
        String cope = StringProcessor.iter("qw", 0);
        assertEquals("", cope);
    }

    @Test(expected = NumIsNotGood.class)
    public void iterTest2() throws NumIsNotGood {
        String cope = StringProcessor.iter("qw", -1);
    }

    @Test
    public void iterTest3() throws NumIsNotGood {
        String cope = StringProcessor.iter("qw", 2);
        assertEquals("qwqw", cope);
    }

    @Test
    public void countTest1() throws NumIsNotGood {
        int cope = StringProcessor.count("olll", "l");
        assertEquals( 3, cope);
    }

    @Test
    public void countTest2() throws NumIsNotGood {
        int cope = StringProcessor.count("", "l");
        assertEquals( 0, cope);
    }

    @Test
    public void countTest3() throws NumIsNotGood {
        int cope = StringProcessor.count("olll", "");
        assertEquals( null, cope);
    }

    @Test
    public void onereplaceTest1() throws NumIsNotGood {
        String cope = StringProcessor.onereplace("123");
        assertEquals("одиндватри", cope);
    }

    @Test
    public void onereplaceTEst2() throws NumIsNotGood {
        String cope = StringProcessor.onereplace("");
        assertEquals("", cope);
    }

    @Test
    public void strDelTest1() {
        StringBuilder cope = StringProcessor.StrDel(new StringBuilder(""));
        assertEquals("", cope.toString());
    }

    @Test
    public void strDelTest2() {
        StringBuilder cope = StringProcessor.StrDel(new StringBuilder("abcd"));
        assertEquals("ac", cope.toString());
    }
}