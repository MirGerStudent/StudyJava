import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a11: ");
        float a11 = in.nextFloat();

        System.out.print("Input a12: ");
        float a12 = in.nextFloat();

        System.out.print("Input b1: ");
        float b1 = in.nextFloat();

        System.out.print("Input a21: ");
        float a21 = in.nextFloat();

        System.out.print("Input a22: ");
        float a22 = in.nextFloat();

        System.out.print("Input b2: ");
        float b2 = in.nextFloat();

        float x1 = ((b1 * a22 - b2 * a12) / (a11 * a22 - a12 * a21));
        float x2 = ((a11 * b2 - a21 * b1) / (a11 * a22 - a12 * a21));

        // System.out.println(x1);
        // System.out.println(x2);
        // System.out.println((a11 * a22 - a12 * a21));

        boolean linear = ((a11 / a12 == a21 / a22) & (b1 / b2 == a21 / a22) & (a11 / a12 == b1 / b2));

        if ((((a11 * a22 - a12 * a21) == 0) | (b1 == 0 & b2 == 0)) & !linear) {
            System.out.print("No answers!");
        } else if (linear) {
            System.out.print("x, y принадлежат R");
        } else if ((a11 == 0 & a12 == b1) | (a21 == 0 & a22 == b2) | (a12 == 0 & a11 == b1) | (a22 == 0 & a21 == b2)) {
            if (a11 == 0 & a12 == b1) {
                System.out.println(a12);
            } else if (a21 == 0 & a22 == b2) {
                System.out.println(a22);
            } else if (a12 == 0 & a11 == b1) {
                System.out.println(a11);
            } else if (a22 == 0 & a21 == b2) {
                System.out.println(a21);
            }
        } else {
            System.out.print(x1 + "\n");
            System.out.print(x2);
        }

        in.close();

        // System.out.println(x1);
        // System.out.println(x2);
        // System.out.println((a11 * a22 - a12 * a21));
    }
}
