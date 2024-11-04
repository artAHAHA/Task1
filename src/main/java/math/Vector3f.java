package math;


public class Vector3f implements Vector<Vector3f> {
    private double x;
    private double y;
    private double z;

    public Vector3f(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    @Override
    public boolean isEqual(Vector3f other) {
        return Math.abs(x - other.x) < EPS && Math.abs(y - other.y) < EPS && Math.abs(z - other.z) < EPS;
    }


    @Override
    public Vector3f add(Vector3f other) {
        return new Vector3f(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    @Override
    public Vector3f subtract(Vector3f other) {
        return new Vector3f(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    @Override
    public void multiplyingVectorByScalar(double scalar) {
        this.x = Math.round(this.x * scalar * 10.0) / 10.0;
        this.y = Math.round(this.y * scalar * 10.0) / 10.0;
        this.z = Math.round(this.z * scalar * 10.0) / 10.0;
    }

    @Override
    public void dividingVectorByScalar(double scalar) {
        this.x = Math.round(this.x / scalar * 10.0) / 10.0;
        this.y = Math.round(this.y / scalar * 10.0) / 10.0;
        this.z = Math.round(this.z / scalar * 10.0) / 10.0;
    }

    @Override
    public double getLength() {
        double length = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
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
    }

    @Override
    public double scalarMultiplication(Vector3f other) {
        return (this.x * other.x + this.y * other.y + this.z * other.z);
    }

    public Vector3f vectorProduct(Vector3f other) {
        return new Vector3f(this.y * other.z - this.z * other.y,
                            this.z * other.x - this.x * other.z,
                            this.x * other.y - this.y * other.x);
    }

    @Override
    public String toString() {
        return "Vector3f(" + x + ", " + y + ", " + z + ")";
    }
}