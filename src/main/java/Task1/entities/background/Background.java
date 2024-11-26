package Task1.entities.background;

import Task1.entities.Drawable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Background implements Drawable {

    private final List<Drawable> elements;

    public Background(int width, int height) {
        elements = new ArrayList<>();

        elements.add(new Sky(width, height));
        elements.add(new Grass(width,height));
        elements.add(new Tree(width/8, (int) (height/2.4)));
        elements.add(new Tree((int) (width/2.67), (int) (height/2.4)));
        elements.add(new Tree((int) (width/1.6), (int) (height/2.4)));
        elements.add(new Bush(width/4, height/2));
        elements.add(new Bush(width/2, height/2));
    }

    @Override
    public void draw(Graphics g) {

        for (Drawable element : elements) {
            element.draw(g);
        }
    }
}
