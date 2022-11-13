package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

import static java.lang.Integer.*;

public class StringProcessor {
    public static String iter(String str, int n) throws NumIsNotGood {
        StringBuilder result = new StringBuilder();
        String res;

        if (n < 0) {
            throw new NumIsNotGood("n < 0");
        } else if (n == 0) {
            res = "";
        } else {
            result.append(String.valueOf(str).repeat(n));

            res = new String(result);
        }
        return res;
    }

    public static int count(String str, String target) throws NumIsNotGood {
        int res = 0;
        if (Objects.equals(target, "")) {
            throw new NumIsNotGood("target == null or ''");
        } else {
            res = (str.length() - str.replace(target, "").length()) / target.length();
        }
        return res;
    }

    public static String onereplace(String str) throws NumIsNotGood {
        for (int i = 0; i < count(str, "1"); i++) {
            str = str.replace("1", "один");
        }
        for (int i = 0; i < count(str, "2"); i++) {
            str = str.replace("2", "два");
        }
        for (int i = 0; i < count(str, "3"); i++) {
            str = str.replace("3", "три");
        }

        return str;
    }

    public static StringBuilder StrDel(StringBuilder stringBuilder) {
        if (stringBuilder == null) {
            throw new IllegalArgumentException("Argument is null");
        } else {
            for (int i = 1; i < stringBuilder.length(); i++) {
                stringBuilder.deleteCharAt(i);
            }
        }

        return stringBuilder;
    }

    public static String ReversSymbols(String str) {
        StringBuilder res = new StringBuilder();
        StringBuilder nowStr = new StringBuilder();
        Deque<String> words = new LinkedList<String>();
        char StrArr[] = str.toCharArray();
        Deque<Integer> SpaceArr = new LinkedList<Integer>();
        boolean space = false, charelem = false;
        boolean space_first = false, char_first = false;
        int space_count = 0, lastelem = 0;

        for (char elem : StrArr) {
            if (elem == ' ') {
                space = true;
                charelem = false;
            } else {
                charelem = true;
                space = false;
            }

            // lastelem: 0 - самое начало, 1 - пробел, 2 - остальные символы
            if (lastelem == 0) {
                if (space) {
                    space_count++;
                    lastelem = 1;
                    space_first = true;
                }
                if (charelem) {
                    nowStr.append(elem);
                    lastelem = 2;
                    char_first = true;
                }
            } else if (lastelem == 1) {
                if (space) {
                    space_count++;
                    lastelem = 1;
                }
                if (charelem) {
                    SpaceArr.addLast(space_count);
                    space_count = 0;
                    nowStr.append(elem);
                    lastelem = 2;
                }
            } else if (lastelem == 2) {
                if (space) {
                    space_count++;
                    words.addLast(nowStr.toString());
                    nowStr.delete(0, nowStr.length());
                    lastelem = 1;
                }
                if (charelem) {
                    nowStr.append(elem);
                    lastelem = 2;
                }
            }
        }
        if (!nowStr.toString().equals("")) {
            words.addLast(nowStr.toString());
            nowStr.delete(0, nowStr.length());
        }
        if (space_count != 0) {
            SpaceArr.addLast(space_count);
        }

        if (space_first) {
            while (!SpaceArr.isEmpty() | !words.isEmpty()) {
                if (!SpaceArr.isEmpty()) {
                    res.append(" ".repeat(SpaceArr.getFirst()));
                    SpaceArr.removeFirst();
                }
                if (!words.isEmpty()) {
                    res.append(words.getLast());
                    words.removeLast();
                }
            }
        }
        if (char_first) {
            while (!SpaceArr.isEmpty() | !words.isEmpty()) {
                if (!words.isEmpty()) {
                    res.append(words.getLast());
                    words.removeLast();
                }
                if (!SpaceArr.isEmpty()) {
                    res.append(" ".repeat(SpaceArr.getFirst()));
                    SpaceArr.removeFirst();
                }
            }
        }

        return res.toString();
    }

    public static String reversYear(String str) {
//        while (str)
        StringBuilder res = new StringBuilder(str);
        String num = str.substring(str.indexOf("0x") + 2, str.indexOf("0x") + 10);
        int rep2 = parseUnsignedInt(num, 16);
        res.replace(str.indexOf("0x"), str.indexOf("0x") + 10, Integer.toString(rep2));
        return res.toString();
    }

}
