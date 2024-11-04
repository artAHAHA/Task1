package math.matrix;

import math.vectors.Vector4f;

public class Matrix4f implements Matrix<Matrix4f, Vector4f>{
    private final double[][] elements;

    public Matrix4f(double[][] elements) {
        if (elements.length != 4 || elements[0].length != 4) {
            throw new IllegalArgumentException("Матрица должна быть 4x4");
        }
        this.elements = new double[4][4];
        for (int i = 0; i < 4; i++) {
            System.arraycopy(elements[i], 0, this.elements[i], 0, 4);
        }
    }


    @Override
    public Matrix4f add(Matrix4f other) {
        double[][] result = new double[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                result[i][j] = this.elements[i][j] + this.elements[i][j];
            }
        }
        return new Matrix4f(result);
    }

    @Override
    public Matrix4f subtract(Matrix4f other) {
        double[][] result = new double[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                result[i][j] = this.elements[i][j] - this.elements[i][j];
            }
        }
        return new Matrix4f(result);
    }

    @Override
    public Vector4f multiplyingMatrixByVector(Vector4f vector) {
        /*        if (vector.) {
            throw new IllegalArgumentException("Вектор должен быть размерности 4");
        }*/
        double[] result = new double[4];
        for (int i = 0; i < 4; i++) {
            result[i] = elements[i][0] * vector.getX() +
                    elements[i][1] * vector.getY() +
                    elements[i][2] * vector.getZ() +
                    elements[i][3] * vector.getW();
        }
        return new Vector4f(result[0], result[1], result[2], result[3]);
    }

    @Override
    public Matrix4f matrixProduct(Matrix4f other) {
        double[][] result = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = this.elements[i][0] * other.elements[0][j] +
                        this.elements[i][1] * other.elements[1][j] +
                        this.elements[i][2] * other.elements[2][j] +
                        this.elements[i][3] * other.elements[3][j];
            }
        }
        return new Matrix4f(result);
    }

    @Override
    public Matrix4f transpose() {
        double[][] result = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result[j][i] = this.elements[i][j];
            }
        }
        return new Matrix4f(result);
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
