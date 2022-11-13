import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input inf: ");
        float inf = in.nextFloat();

        System.out.print("Input sup: ");
        float sup = in.nextFloat();

        System.out.print("Input step: ");
        float step = in.nextFloat();

        if (inf > sup) {
            float tmp = inf;
            inf = sup;
            sup = tmp;
        }

        if (step != 0) {
            if (step > 0) {
                for (float i = inf; i <= sup; i += step) {
                    System.out.printf("x = %.10f   sin(x) = %.3f\n", i, Math.sin(i));
                }
            }
            if (step < 0) {
                for (float i = sup; i != inf - 1; i += step) {
                    System.out.printf("x = %.3f   sin(x) = %.3f\n", i, Math.sin(i));
                }
            }
        } else {
            System.out.print("Step cannot be zero!");
        }
        
        in.close();
    }
}
