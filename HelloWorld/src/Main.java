import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Point3D L = new Point3D();
        Point3D M = new Point3D(0, 0, 0);
        Point3D N = new Point3D(9, 8, 1);
        Point3D K = new Point3D(9, 8, 1);
        Point3D a = new Point3D(1, 1, 1);
        Point3D b = new Point3D(2, 2, 2);
        Point3D c = new Point3D(3, 4, 5);

        L.Print();
        M.Print();
        N.Print();
        K.Print();

        System.out.println("M == L");
        if (M == L) {
            System.out.println("Они же равны...");
        } else {
            System.out.println("Они же не равны...");
        }

        System.out.println("N == K");
        if (N == K) {
            System.out.println("Они же равны...");
        } else {
            System.out.println("Они же не равны...");
        }

        System.out.println("L == L");
        if (L == L) {
            System.out.println("Они же равны...");
        } else {
            System.out.println("Они же не равны...");
        }

        System.out.println("\n\n\n");

        Vector3D vec1 = new Vector3D(1, 1, 1);
        Vector3D vec2 = new Vector3D(1, 1, 1);
        Vector3D vec3 = new Vector3D();
        Vector3D vec4 = new Vector3D(a, b);
        Vector3D vec5 = new Vector3D(N, M);

        vec1.getPoint3D().Print();
        vec2.getPoint3D().Print();
        vec3.getPoint3D().Print();
        vec4.getPoint3D().Print();
        vec5.getPoint3D().Print();

        System.out.println("Vector1 == Vector2");
        if (vec1.equals(vec2)) {
            System.out.println("Они же равны...");
        } else {
            System.out.println("Они же не равны...");
        }

        System.out.println("Vector1 == Vector3");
        if (vec1.equals(vec3)) {
            System.out.println("Они же равны...");
        } else {
            System.out.println("Они же не равны...");
        }

        System.out.println("Vector1 == Vector4");
        if (vec1.equals(vec4)) {
            System.out.println("Они же равны...");
        } else {
            System.out.println("Они же не равны...");
        }

        System.out.println("\n\n\n");

        System.out.println("Сумма Vec1 и Vec2");
        Vector3DProcessor.sum(vec1, vec2).getPoint3D().Print();

        System.out.println("Разность Vec1 и Vec2");
        Vector3DProcessor.difference(vec1, vec2).getPoint3D().Print();

        System.out.println("Скалярное произведение Vec1 и Vec2");
        System.out.println(Vector3DProcessor.scalar_product(vec1, vec2));

        System.out.println("Векторное произведение Vec1 и Vec2");
        Vector3DProcessor.vector_product(vec1, vec2).getPoint3D().Print();

        System.out.println("Коллинеарность Vec1 и Vec2");
        System.out.println(Vector3DProcessor.collinear(vec1, vec2));

        System.out.println("\n\n\n");

        Vector3DArray VecArray = new Vector3DArray(3);

//        VecArray.GetVector(2).getPoint3D().Print();

        VecArray.replacement(0, vec2);
        VecArray.replacement(1, vec2);
        VecArray.replacement(2, vec5);

        VecArray.Print();

        System.out.print("Максимальная длинна ");
        System.out.println(VecArray.maxLength());

        System.out.print("Поиск vec2 в массиве (возвращаем индекс) ");
        System.out.println(VecArray.search(vec2));

        System.out.print("Поиск vec2 в массиве (возвращаем индекс) ");
        System.out.println(VecArray.search(vec3));

        System.out.print("Сумма всех эелементов в массиве ");
        VecArray.Summ().getPoint3D().Print();
        
        double RatioArr[] = new double[3];

        for (int i = 0; i < VecArray.size; i++) {
            System.out.print("Введите коэфициент " + i + " ");
            RatioArr[i] = in.nextDouble();
        }

        System.out.print("Массив коэффициентов: ");
        for (double elem : RatioArr) {
            System.out.print(" " + elem + " ");
        }

        System.out.print("\n\nЛинейная комбинация векторов: ");
        VecArray.linear_combination(RatioArr).getPoint3D().Print();

        System.out.print("Массив точек полученный путём сдвига на точку ");
        c.Print();
        Point3D ArrPoint3D[] = new Point3D[VecArray.size];
        ArrPoint3D = VecArray.getPointArray(c);

        for (Point3D elem : ArrPoint3D) {
            elem.Print();
        }

        System.out.print("\nИсходный массив :");
        VecArray.Print();
    }
}
