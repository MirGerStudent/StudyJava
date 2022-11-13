public class Vector3DProcessor {
    public static Vector3D sum(Vector3D Vec1, Vector3D Vec2) {
        double X = Vec1.getPoint3D().getX() + Vec2.getPoint3D().getX();
        double Y = Vec1.getPoint3D().getY() + Vec2.getPoint3D().getY();
        double Z = Vec1.getPoint3D().getZ() + Vec2.getPoint3D().getZ();

        Vector3D Res = new Vector3D(X, Y, Z);

        return Res;
    }

    public static Vector3D difference(Vector3D Vec1, Vector3D Vec2) {
        double X = Vec1.getPoint3D().getX() - Vec2.getPoint3D().getX();
        double Y = Vec1.getPoint3D().getY() - Vec2.getPoint3D().getY();
        double Z = Vec1.getPoint3D().getZ() - Vec2.getPoint3D().getZ();

        Vector3D Res = new Vector3D(X, Y, Z);

        return Res;
    }

    public static double scalar_product(Vector3D Vec1, Vector3D Vec2) {
        double X = Vec1.getPoint3D().getX() * Vec2.getPoint3D().getX();
        double Y = Vec1.getPoint3D().getY() * Vec2.getPoint3D().getY();
        double Z = Vec1.getPoint3D().getZ() * Vec2.getPoint3D().getZ();

        double Res = X + Y + Z;

        return Res;
    }

    public static Vector3D vector_product(Vector3D Vec1, Vector3D Vec2) {
        double X1 = Vec1.getPoint3D().getX();
        double Y1 = Vec1.getPoint3D().getY();
        double Z1 = Vec1.getPoint3D().getZ();
        double X2 = Vec2.getPoint3D().getX();
        double Y2 = Vec2.getPoint3D().getY();
        double Z2 = Vec2.getPoint3D().getZ();

        double X = Y1 * Z2 - Z1 * Y2;
        double Y = -(X1 * Z2 - Z1 * X2);
        double Z = X1 * Y2 - Y1 * X2;

        Vector3D Res = new Vector3D(X, Y, Z);

        return Res;
    }

    public static boolean collinear(Vector3D Vec1, Vector3D Vec2) {
        return Vec1.equals(Vec2);
    }
}
