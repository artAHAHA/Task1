package math;

import math.matrix.Matrix;
import math.matrix.Matrix3f;
import math.matrix.Matrix4f;
import math.vectors.Vector3f;
import math.vectors.Vector4f;

public class Main {
    public static void main(String[] args) throws Exception {
        Vector3f v1 = new Vector3f(8,7,2);
        double[][] elementsA = {
                {2, 1, 0,0},
                {3, 2, 0,0},
                {1, 1, 3,4},
                {2, -1, 2, 3}
        };

        double[][] elementsB = {
                {3, 5, -2},
                {1, -3, 2},
                {6, 7, -3}
        };

        double[][] matrix = {
                {1, 1, 1, 6},
                {1, 2, 3, 14},
                {1, -1, 1, 2}
        };

        System.out.println();
        Matrix4f m1 = new Matrix4f(elementsA);
        Matrix3f m2 = new Matrix3f(elementsB);
        //System.out.println(m1.findInverseMatrix());

    }
}
