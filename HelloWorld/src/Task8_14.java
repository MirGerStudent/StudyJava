import java.util.Scanner;

public class Task8_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input Array size: ");
        int size = in.nextInt();

        int[] Array = new int[size];
        InputArrayElement(Array, size, in);
        PrintArray(Array);
        System.out.printf("Summ Array element %d\n", SummArrayElement(Array));
        System.out.printf("Even element in Array %d\n", Even(Array));

        System.out.print("Input inf ");
        int inf = in.nextInt();

        System.out.print("Input sup ");
        int sup = in.nextInt();

        System.out.printf("The numbers of elements in Array %d\n", CountInSegment(Array, inf, sup));
        System.out.printf("Positive elements in array is %b\n", Positive(Array));
        System.out.print("Invert Array ");
        Invert(Array, size);
        PrintArray(Array);

        in.close();
    }

    public static void PrintArray(int[] Array) {
        for (int elem : Array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void InputArrayElement(int[] Array, int size, Scanner in) {
        for (int i = 0; i < size; i++) {
            System.out.printf("Input %d Element from Array - ", i);
            Array[i] = in.nextInt();
        }
    }

    public static int SummArrayElement(int[] Array) {
        int Sum = 0;

        for (int elem : Array) {
            Sum += elem;
        }

        return Sum;
    }

    public static int Even(int[] Array) {
        int count = 0;

        for (int elem : Array) {
            if (elem % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int CountInSegment(int[] Array, int inf, int sup) {
        int count = 0;

        for (int elem : Array) {
            if (elem <= sup && elem >= inf) {
                count++;
            }
        }

        return count;
    }

    public static boolean Positive(int[] Array) {
        boolean res = true;

        for (int elem : Array) {
            if (elem < 0) {
                res = false;
                break;
            }
        }

        return res;
    }

    public static void Invert(int[] Array, int size) {
        int tmp = 0;

        for (int i = 0; i < (size / 2); i++) {
            tmp = Array[i];
            Array[i] = Array[size - i - 1];
            Array[size - i - 1] = tmp;
        }
    }
}
