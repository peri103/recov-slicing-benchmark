import java.awt.geom.Rectangle2D;

public class RectangleOperations {
    private Rectangle2D rect;

    public RectangleOperations(double x, double y, double width, double height) {
        this.rect = new Rectangle2D.Double(x, y, width, height);
    }

    public double calculateArea() {
        return rect.getWidth() * rect.getHeight();
    }

    public void modifyRectangle(double x, double y, double width, double height) {
        rect.setRect(x, y, width, height);
    }

    public Rectangle2D getRectangle() {
        return rect;
    }
}
