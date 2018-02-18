import java.awt.*;
/**
 * Test if DrawingPanel works like this
 * @author Jacob Salzberg
 */
public class TestHelp {
    /**
     * Tests if DrawingPanel is working
     */
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(520, 520);
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 100, 100);
    }
}
