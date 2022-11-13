package org.example;

import java.util.Objects;

public class StringServer {
    public static int CountWhitStartsElement(String[] Array, String element) {
        int count = 0;

        for (String Element : Array) {
            if (Element.startsWith(element)) {
                count++;
            }
        }
        return count;
    }

    public static int CountWhitElement(String[] Array, String element) {
        int count = 0;
        for (String Element : Array) {
            if (Element.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static int CountWhitOutElement(String[] Array, String element) {
        int res = 0;

        for (String elem : Array) {
            if (!elem.contains(element)) {
                res++;
            }
        }

        return res;
    }

    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

    public static int CountWhitOneElement(String[] Array, String element) {
        int res = 0;

        for (String elem : Array) {
            if (((elem.length() - elem.replace(element, "").length()) / element.length()) == 1) {
                res++;
            }
        }

        return res;
    }
}
