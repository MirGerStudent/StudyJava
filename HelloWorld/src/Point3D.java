// package Point3D;

public class Point3D {
    private double x;
    private double y;
    private double z;

    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    void Print() {
        System.out.println("{ " + x + " " + y + " " + z + " }");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
