public class Vector3D {
    private Point3D point3D = new Point3D();

    public Point3D getPoint3D() {
        return point3D;
    }

    public void setPoint3D(Point3D point3D) {
        this.point3D = point3D;
    }

    Vector3D() {
        point3D.setX(0);
        point3D.setY(0);
        point3D.setZ(0);
    }

    public Vector3D(double x, double y, double z) {
        point3D.setX(x);
        point3D.setY(y);
        point3D.setZ(z);
    }

    public Vector3D(Point3D a, Point3D b) {
        this.point3D.setX(b.getX()-a.getX());
        this.point3D.setY(b.getY()-a.getY());
        this.point3D.setZ(b.getZ()-a.getZ());
    }

    public double length() {
        double x = this.point3D.getX();
        double y = this.point3D.getY();
        double z = this.point3D.getZ();

        return Math.sqrt(x*x + y*y + z*z);
    }

    public boolean equals(Vector3D Vec2) {
        double X1 = this.point3D.getX();
        double Y1 = this.point3D.getY();
        double Z1 = this.point3D.getZ();
        double X2 = Vec2.point3D.getX();
        double Y2 = Vec2.point3D.getY();
        double Z2 = Vec2.point3D.getZ();

        return ((X1 == X2) & (Y1 == Y2) & (Z1 == Z2));
    }
}
