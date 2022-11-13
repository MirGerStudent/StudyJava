import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input float number a: ");
        float a = in.nextFloat();

        System.out.print("Input float number b: ");
        float b = in.nextFloat();

        System.out.print("Input float number c: ");
        float c = in.nextFloat();

        float D = b * b - 4 * a * c;
        if (D >= 0) {
            if (a != 0 && b != 0 && c != 0) {
                if (D == 0) {
                    System.out.print(-b / 2 * a);
                } else {
                    System.out.print((-b + Math.sqrt(D)) / 2 * a + "\n");
                    System.out.print((-b - Math.sqrt(D)) / 2 * a + "\n");
                }
            } else

            if (a == 0 && b == 0) {
                System.out.print("Out of R");
            } else

            if (b == 0 && c == 0) {
                System.out.print("0");
            } else

            if (b == 0) {
                if (c / a > 0) {
                    System.out.print((-b + Math.sqrt(D)) / 2 * a + "\n");
                    System.out.print((-b - Math.sqrt(D)) / 2 * a + "\n");
                } else {
                    System.out.print("Out of R");
                }
            } else

            if (c == 0) {
                System.out.print("0\n");
                System.out.print(((b / a) + "\n"));
            } else

            if (a == 0) {
                if (c == 0) {
                    System.out.print("0\n");
                } else {
                    System.out.print(-c / b);
                }
            }
        } else {
            System.out.print("Out of R");
        }
        in.close();
    }
}
