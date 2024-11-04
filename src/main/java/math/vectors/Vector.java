package math.vectors;

public interface Vector<T> {

    final float EPS = 1e-7f;

    boolean isEqual(T other);

    T add(T other);

    T subtract(T other);
    void multiplyingVectorByScalar(double scalar);

    void dividingVectorByScalar(double scalar);

    double getLength();
    void normalize();

    double scalarMultiplication(T other);

    String toString();
}

