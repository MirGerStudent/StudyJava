package org.example;

import java.util.Scanner;

// import org.example.NumIsNotGood;

public class Main {
    public static void main(String[] args) throws NumIsNotGood {
        // System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);

        System.out.print("Input String ");
        String str = in.nextLine();

        System.out.print("Input number ");
        int num = Integer.parseInt(in.nextLine());

        String res = StringProcessor.iter(str, num);

        System.out.println(res);
        System.out.println(StringProcessor.count(res, str));

//        System.in.skip(System.in.available());
        System.out.print("Input String ");
        String str1 = in.nextLine();

        System.out.println(str1);
        System.out.println(StringProcessor.onereplace(str1));

        System.out.println(StringProcessor.StrDel(new StringBuilder("abcd")));

        System.out.println("Task 5");
        System.out.print("Input str: ");
        String str2 = in.nextLine();

        String re1 = StringProcessor.ReversSymbols(str2);
        System.out.println(re1);

        System.out.println("Task 6");
        System.out.print("Input str: ");
        String str3 = "Васе 0x00000010 лет";

        String re2 = StringProcessor.reversYear(str3);
        System.out.println(re2);

        in.close();
    }
}