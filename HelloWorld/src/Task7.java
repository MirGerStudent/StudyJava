import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double Sum = 1;
        double fact = 1;
        double i = 1;

        System.out.print("Input x: ");
        double x = in.nextDouble();

        System.out.print("Input eps: ");
        double eps = in.nextDouble();

        while (Math.abs(Math.pow(x, i) / fact) >= eps) {
            Sum += Math.pow(x, i) / fact;
            i++;
            fact *= i;
        }

        System.out.println(Sum);

        in.close();
    }
}
