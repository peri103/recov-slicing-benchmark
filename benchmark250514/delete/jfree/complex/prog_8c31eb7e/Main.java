import org.jfree.chart.renderer.Renderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new XYLineAndShapeRenderer();
        BasicStroke stroke = new BasicStroke(2.0f);
        List<Color> colors = new ArrayList<>();
        
        // Initialize some colors
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        
        // Set a base color for the renderer
        renderer.setSeriesPaint(0, colors.get(0));
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Manipulate colors
        for (Color color : colors) {
            System.out.println("Color: " + color.toString());
        }
        
        /* write */ renderer.setBaseStroke(stroke);
        
        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
        
        // More color manipulations
        renderer.setSeriesPaint(1, colors.get(1));
        renderer.setSeriesPaint(2, colors.get(2));
        
        // More complex operations
        double average = sum / 10.0;
        System.out.println("Average: " + average);
        
        /* read */ BasicStroke readStroke = (BasicStroke) renderer.getBaseStroke();
        
        System.out.println("Stroke width: " + readStroke.getLineWidth());
    }
}