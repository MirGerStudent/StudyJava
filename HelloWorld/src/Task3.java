import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input int number: ");
        int num1 = in.nextInt();

        System.out.print("Input int number: ");
        int num2 = in.nextInt();

        System.out.print("Input int number: ");
        int num3 = in.nextInt();

        int[] ArrF = new int[3];
        int tmp;

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

        int resp = num1 * num2 * num3;
        System.out.printf("Multiply %d\n", resp);

        float res = (num1 + num2 + num3) / 3.0f;
        System.out.printf("Average %.3f\n", res);

        for (byte i = 0; i < 3; i++) {
            System.out.printf("%d\n", ArrF[i]);
        }

        in.close();
    }
}

