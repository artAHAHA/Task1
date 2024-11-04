package math.matrix;

import math.vectors.Vector;
import math.vectors.Vector3f;

public class Matrix3f implements Matrix<Matrix3f, Vector3f> {
    private final double[][] elements;

    public Matrix3f(double[][] elements) {
        if (elements.length != 3 || elements[0].length != 3) {
            throw new IllegalArgumentException("Матрица должна быть 3x3");
        }
        this.elements = new double[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(elements[i], 0, this.elements[i], 0, 3);
        }
    }


    @Override
    public Matrix3f add(Matrix3f other) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                result[i][j] = this.elements[i][j] + this.elements[i][j];
            }
        }
        return new Matrix3f(result);
    }

    @Override
    public Matrix3f subtract(Matrix3f other) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                result[i][j] = this.elements[i][j] - this.elements[i][j];
            }
        }
        return new Matrix3f(result);
    }


    @Override
    public Vector3f multiplyingMatrixByVector(Vector3f vector) {
/*        if (vector.) {
            throw new IllegalArgumentException("Вектор должен быть размерности 3");
        }*/
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            result[i] = elements[i][0] * vector.getX() +
                        elements[i][1] * vector.getY() +
                        elements[i][2] * vector.getZ();
        }
        return new Vector3f(result[0], result[1], result[2]);
    }

    @Override
    public Matrix3f matrixProduct(Matrix3f other) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = this.elements[i][0] * other.elements[0][j] +
                               this.elements[i][1] * other.elements[1][j] +
                               this.elements[i][2] * other.elements[2][j];
            }
        }
        return new Matrix3f(result);
    }

    @Override
    public Matrix3f transpose() {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[j][i] = this.elements[i][j];
            }
        }
        return new Matrix3f(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : elements) {
            sb.append("[ ");
            for (double value : row) {
                sb.append(value).append(" ");
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}
