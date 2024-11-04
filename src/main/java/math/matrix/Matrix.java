package math.matrix;


import math.vectors.Vector;


public interface Matrix<T extends Matrix<T, V>, V extends Vector<V>>{

    T add(T other);
    T subtract(T other);
    V multiplyingMatrixByVector(V vector);
    T matrixProduct(T other);
    T transpose();
    double findDeterminant();
    T findInverseMatrix();

}
