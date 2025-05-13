import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        
        // Initialize a list of colors for demonstration purposes
        ArrayList<Color> colorList = new ArrayList<>();
        colorList.add(Color.BLUE);
        colorList.add(Color.GREEN);
        colorList.add(Color.YELLOW);
        
        // Set positive paint to Color.RED
        /* write */ renderer.setPositivePaint(Color.RED);
        
        // Set negative paint using a color from the list
        renderer.setNegativePaint(colorList.get(1));
        
        // Perform some operations with the color list
        for (Color color : colorList) {
            System.out.println("Color in list: " + color);
        }
        
        // Retrieve positive paint and print it
        /* read */ Paint positivePaint = renderer.getPositivePaint();
        
        System.out.println("Positive Paint: " + positivePaint);
        
        // Demonstrate the use of another color from the list
        Paint negativePaint = renderer.getNegativePaint();
        System.out.println("Negative Paint: " + negativePaint);
    }
}