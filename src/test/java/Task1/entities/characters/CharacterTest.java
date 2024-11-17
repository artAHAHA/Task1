package Task1.entities.characters;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void testMoveX() {
        Character character = new Character(100, 100, 200, 400, Color.BLUE);
        character.moveX(50);
        assertEquals(20 + 50, character.x); // 100/5 + 50
    }


    @Test
    void testInitialPosition() {
        Character character = new Character(100, 100, 200, 400, Color.BLUE);
        assertEquals(20, character.x);
        assertEquals(20, character.y);
    }
    @Test
    void testCoordinatesAfterMultipleTicks() {
        Character character = new Character(100, 100, 200, 400, Color.BLUE);
        character.moveX(10);
        character.moveX(10);
        character.moveX(10);
        assertEquals(50, character.x);
    }

}

