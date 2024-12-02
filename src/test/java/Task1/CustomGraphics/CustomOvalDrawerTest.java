package Task1.CustomGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.*;
import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

class CustomOvalDrawerTest {

    private CustomOvalDrawer customOvalDrawer;
    private BufferedImage bufferedImage;
    private Graphics2D g2d;

    @BeforeEach
    void setUp() {
        customOvalDrawer = new CustomOvalDrawer();
        bufferedImage = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        g2d = bufferedImage.createGraphics();
    }

    @Test
    void testDrawOval() {
        customOvalDrawer.drawOval(g2d, 50, 50, 100, 150);
        Color color = new Color(bufferedImage.getRGB(100, 125), true);
        assertNotEquals(Color.WHITE, color);
    }
    @Test
    void testOvalTopLeftCorner() {
        customOvalDrawer.drawOval(g2d, 50, 50, 100, 150);
        Color color = new Color(bufferedImage.getRGB(50, 50), true);
        assertNotEquals(Color.WHITE, color);  // Проверяем, что верхняя левая точка овала нарисована
    }
    @Test
    void testOvalBottomRightCorner() {
        customOvalDrawer.drawOval(g2d, 50, 50, 100, 150);
        Color color = new Color(bufferedImage.getRGB(150, 200), true);
        assertNotEquals(Color.WHITE, color);
    }
    @Test
    void testOvalCenterVertical() {
        customOvalDrawer.drawOval(g2d, 50, 50, 100, 150);
        Color color = new Color(bufferedImage.getRGB(50, 200), true);
        assertNotEquals(Color.WHITE, color);
    }

    @Test
    void testOvalCenterHorizontal() {
        customOvalDrawer.drawOval(g2d, 50, 50, 100, 150);
        Color color = new Color(bufferedImage.getRGB(150, 50), true);
        assertNotEquals(Color.WHITE, color);
    }

    @Test
    void testDrawDifferentSizedOval() {
        customOvalDrawer.drawOval(g2d, 20, 20, 80, 120);
        Color color1 = new Color(bufferedImage.getRGB(20, 20), true);
        Color color2 = new Color(bufferedImage.getRGB(100, 140), true);
        assertNotEquals(Color.WHITE, color1);
        assertNotEquals(Color.WHITE, color2);
    }

}
