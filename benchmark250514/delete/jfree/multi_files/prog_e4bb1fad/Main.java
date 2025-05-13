import java.awt.BasicStroke;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Instantiate CustomRenderer
        CustomRenderer renderer = new CustomRenderer();
        
        // Set custom stroke
        BasicStroke stroke = new BasicStroke(2.0f);
        renderer.setCustomStroke(stroke);
        
        // Instantiate RectangleOperations
        RectangleOperations rectOps = new RectangleOperations(0, 0, 100, 50);
        
        // Calculate area
        double area = rectOps.calculateArea();
        System.out.println("Initial Rectangle area: " + area);
        
        // Modify rectangle
        rectOps.modifyRectangle(10, 10, 200, 100);
        
        // Recalculate area
        double newArea = rectOps.calculateArea();
        System.out.println("Modified Rectangle area: " + newArea);
        
        // Read the custom stroke
        /* read */ BasicStroke readStroke = renderer.getCustomStroke();
        System.out.println("Read Stroke: " + readStroke);
        
        // Set and read base color (extra operation)
        renderer.setBasePaint(Color.BLUE);
        Color readColor = (Color) renderer.getBasePaint();
        System.out.println("Base Color: " + readColor);
        
        // Output the final state of the rectangle
        System.out.println("Rectangle: " + rectOps.getRectangle());
    }
}