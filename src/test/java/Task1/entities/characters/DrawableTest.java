package Task1.entities.characters;

import Task1.entities.Drawable;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrawableTest {

    @Test
    void testMoveX() {
        Drawable boy = new Boy(100, 100, 200, 400, Color.BLUE, true);
        boy.moveX(50);
        assertEquals(20 + 50, boy.getX());
    }

    @Test
    void testInitialPosition() {
        Drawable boy = new Boy(100, 100, 200, 400, Color.BLUE, true);
        assertEquals(20, boy.getX());
        assertEquals(20, boy.getY());
    }

    @Test
    void testCoordinatesAfterMultipleTicks() {
        Drawable girl = new Girl(100, 100, 200, 400, Color.BLUE, true);
        girl.moveX(10);
        girl.moveX(10);
        girl.moveX(10);
        assertEquals(50, girl.getX());
    }
}


