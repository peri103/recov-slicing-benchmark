import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

public class ShapeProcessor {
    private List<Shape> shapesList = new ArrayList<>();

    public void addShape(Shape shape) {
        shapesList.add(shape);
    }

    public void processShapes() {
        for (Shape shape : shapesList) {
            System.out.println("Processing shape: " + shape.getBounds());
        }
    }
}
