public class Sem1 {
    public static void main(String[] args) {
        String S = "Hello!";
        int t = 10;
        String S1 = new String("Hello!");
        int[] numbers = new int[t];
        System.out.println(S1);
        System.out.println(S);
        for (int i = 0; i < t; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
        Show(numbers);
        for (int value : numbers) {
            System.out.print(value + " ");
        }

        int[] numbers1 = new int[t];
        for (int i = 0; i < t; i++) {
            if (i % 2 == 0) {
                numbers1[i] = 4;
            }
        }
        System.out.println(Counter(numbers1, 4));
    }

    public static void Show(int[] arr) {
        System.out.println();
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int Counter(int[] arr, int elem) {
        int counter = 0;

        for (int num : arr) {
            if (num == elem) {
                counter++;
            }
        }

        return counter;
    }

    public static void Func(int[] arr, int size) {
        int tmp;
        for (int i = 0; i < size; i++) {
            tmp = arr[i];
            arr[i] = arr[(i - 1) % size];

        }
    }
}
