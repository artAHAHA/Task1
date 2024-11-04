package math.vectors;

public class Vector4f implements Vector<Vector4f> {
    private double x;
    private double y;
    private double z;
    private double w;
    public Vector4f(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
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

    public double getW(){
        return w;
    }

    @Override
    public boolean isEqual(Vector4f other) {
        return Math.abs(x - other.x) < EPS &&
                Math.abs(y - other.y) < EPS &&
                 Math.abs(z - other.z) < EPS &&
                  Math.abs(w-other.z) < EPS;
    }

    @Override
    public Vector4f add(Vector4f other) {
        return new Vector4f(this.x + other.x,
                this.y + other.y,
                this.z + other.z,
                this.w + other.w);
    }

    @Override
    public Vector4f subtract(Vector4f other) {
        return new Vector4f(this.x - other.x,
                this.y - other.y,
                this.z - other.z,
                this.w - other.w);
    }

    @Override
    public void multiplyingVectorByScalar(double scalar) {
        this.x = Math.round(this.x * scalar * 10.0) / 10.0;
        this.y = Math.round(this.y * scalar * 10.0) / 10.0;
        this.z = Math.round(this.z * scalar * 10.0) / 10.0;
        this.w = Math.round(this.w * scalar * 10.0) / 10.0;
    }

    @Override
    public void dividingVectorByScalar(double scalar) {
        this.x = Math.round(this.x / scalar * 10.0) / 10.0;
        this.y = Math.round(this.y / scalar * 10.0) / 10.0;
        this.z = Math.round(this.z / scalar * 10.0) / 10.0;
        this.w = Math.round(this.w / scalar * 10.0) / 10.0;
    }

    @Override
    public double getLength() {
        double length = Math.sqrt(
                        Math.pow(this.x, 2) +
                        Math.pow(this.y, 2) +
                        Math.pow(this.z, 2) +
                        Math.pow(this.w, 2)
                        );
        return Math.round(length * 10.0) / 10.0;
    }

    @Override
    public void normalize() {
        double length = getLength();
        if (length == 0) {
            throw new ArithmeticException("Длина равна 0, вектор нормализовать нельзя");
        }
        this.x /= length;
        this.y /= length;
        this.z /= length;
        this.w /= length;
    }

    @Override
    public double scalarMultiplication(Vector4f other) {
        return (this.x * other.x +
                this.y * other.y +
                this.z * other.z +
                this.w * other.w);
    }
    @Override
    public String toString() {
        return "Vector3f(" + x + ", " + y + ", " + z + ", " + w + ")";
    }
}
