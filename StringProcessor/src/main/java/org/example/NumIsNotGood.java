package org.example;

public class NumIsNotGood extends Exception {
    public NumIsNotGood() {
    }

    public NumIsNotGood(String message) {
        super(message);
    }
}
