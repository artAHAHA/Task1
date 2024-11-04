package math.vectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Vector2fTest {
    @Test
    void sum() {
        Vector2f v1 = new Vector2f(1, 2);
        Vector2f v2 = new Vector2f(1, 2);

        Vector2f sum = v1.add(v2);
        Assertions.assertEquals(3.0, sum.getX(), 1e-7);
        Assertions.assertEquals(4.0, sum.getY(), 1e-7);
    }

}
