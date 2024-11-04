package math;

import math.matrix.Matrix;
import math.matrix.Matrix3f;
import math.matrix.Matrix4f;
import math.vectors.Vector3f;

public class Main {
    public static void main(String[] args) {
        Vector3f v1 = new Vector3f(8,7,2);
        double[][] elementsA = {
                {1, 2, 3,4},
                {3, 1, 2,5},
                {4, 4, 0,7},
                {11,12,13,321}
        };

        double[][] elementsB = {
                {4, 2, 1},
                {2, 0, 4},
                {9, 4, 2}
        };
        Matrix4f m1 = new Matrix4f(elementsA);
        Matrix3f m2 = new Matrix3f(elementsB);
        Matrix4f m3 = m1.transpose();
        System.out.println(m3);

    }
}
