package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringServerTest {
    @Test
    public void CountWhitStartsElementTest() {
        String StringArray[] = {"AA", "LL", "AAGGCC", "CC", "FFQQAA", "OO", "AA", "aa", "oo"};
        int cope = StringServer.CountWhitStartsElement(StringArray, "AA");
        assertEquals(3, cope);
    }

    @Test
    public void CountWhitElementTest() {
        String StringArray[] = {"AA", "LL", "AAGGCC", "CC", "FFQQAA", "OO", "AA", "aa", "oo"};
        int cope = StringServer.CountWhitElement(StringArray, "AA");
        assertEquals(2, cope);
    }

    @Test
    public void CountWhitOutElementTest() {
        String StringArray[] = {"AA", "LL", "AAGGCC", "CC", "FFQQAA", "OO", "AA", "aa", "oo"};
        int cope = StringServer.CountWhitOutElement(StringArray, "AA");
        assertEquals(4, cope);
    }
}