import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input float number: ");
        float num1 = in.nextFloat();

        System.out.print("Input float number: ");
        float num2 = in.nextFloat();

        System.out.print("Input float number: ");
        float num3 = in.nextFloat();

        float[] ArrF = new float[3];
        float tmp;

        ArrF[0] = num1;
        ArrF[1] = num2;
        ArrF[2] = num3;

        for (int j = 2; j >= 1; j--) {
            for (int i = 0; i < 2; i++) {
                if (ArrF[i] > ArrF[i + 1]) {
                    tmp = ArrF[i];
                    ArrF[i] = ArrF[i + 1];
                    ArrF[i + 1] = tmp;
                }
            }
        }

        float resp = num1 * num2 * num3;
        System.out.printf("Multiply %.3f\n", resp);

        float res = (num1 + num2 + num3) / 3;
        System.out.printf("Ravage %.3f\n", res);

        for (byte i = 0; i < 3; i++) {
            System.out.printf("%.3f\n", ArrF[i]);
        }

        in.close();
    }
}
