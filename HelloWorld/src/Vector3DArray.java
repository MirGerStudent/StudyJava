public class Vector3DArray {
    int size;
    Vector3D[] Arr;

    Vector3DArray(int size) {
        this.size = size;
        Arr = new Vector3D[this.size];

        for (int i = 0; i < size; i++) {
            Arr[i] = new Vector3D();
        }
    }

    public Vector3D GetVector(int index) {
        return this.Arr[index];
    }

    public int GetSize() {
        return size;
    }

    public void replacement(int index, Vector3D Vec) {
        Arr[index] = Vec;
    }

    public double maxLength() {
        double max = 0;

        for (Vector3D Now : Arr) {
            if (Now.length() > max) {
                max = Now.length();
            }
        }

        return max;
    }

    public int search(Vector3D SearchableVec) {
        int res = -1;

        for (int i = 0; i < this.size; i++) {
            if (this.Arr[i].equals(SearchableVec)) {
                res = i;
                break;
            }
        }

        return res;
    }

    public Vector3D Summ() {
        Vector3D res = new Vector3D();

        for (Vector3D Vec : this.Arr) {
            res = Vector3DProcessor.sum(res, Vec);
        }

        return res;
    }

    public void Print() {
        System.out.println("\n");
        for (int i = 0; i <this.size; i++) {
            System.out.print("Vec " + i + " ");
            this.Arr[i].getPoint3D().Print();
        }
    }

    public Vector3D linear_combination(double[] ratio_array) {
        Vector3D linear = new Vector3D();
        double x = 0, y = 0, z = 0;

        if (this.size == ratio_array.length) {
            for (int i = 0; i < this.Arr.length; i++) {
                x += ratio_array[i] * this.Arr[i].getPoint3D().getX();
                y += ratio_array[i] * this.Arr[i].getPoint3D().getY();
                z += ratio_array[i] * this.Arr[i].getPoint3D().getZ();
            }
        }
        linear.getPoint3D().setX(x);
        linear.getPoint3D().setY(y);
        linear.getPoint3D().setZ(z);

        return linear;
    }

    public Point3D[] getPointArray(Point3D Point) {
        Point3D[] PointArray = new Point3D[this.size];

        for (int i = 0; i < PointArray.length; i++) {
            PointArray[i] = new Point3D();
        }

        for (int i = 0; i < this.size; i++) {
            PointArray[i].setX(Point.getX() + this.Arr[i].getPoint3D().getX());
            PointArray[i].setY(Point.getY() + this.Arr[i].getPoint3D().getY());
            PointArray[i].setZ(Point.getZ() + this.Arr[i].getPoint3D().getZ());
        }

        return PointArray;
    }
}