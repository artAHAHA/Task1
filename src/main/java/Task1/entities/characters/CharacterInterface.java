package Task1.entities.characters;

import java.awt.Graphics;

public interface CharacterInterface {
    void setX(int x);
    void setY(int y);
    void setWidth(int width);
    void setHeight(int height);
    void paint(Graphics g);
}