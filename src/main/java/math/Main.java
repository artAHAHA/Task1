package math;

public class Main {
    public static void main(String[] args) {
        Vector3f v1 = new Vector3f(0,1,0);
        Vector3f v2 = new Vector3f(1,0,2);
        Vector3f v3 = v1.vectorProduct(v2);
        System.out.println(v3);
    }
}
