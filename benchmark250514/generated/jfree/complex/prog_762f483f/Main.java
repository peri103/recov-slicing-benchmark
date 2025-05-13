import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        ArrayList<Color> colorList = new ArrayList<>();
        
        // Add some colors to the list
        colorList.add(Color.BLUE);
        colorList.add(Color.GREEN);
        colorList.add(Color.YELLOW);
        
        // Set the positive paint using the first color from the list
        /* write */ renderer.setPositivePaint(colorList.get(0));
        
        // Perform some operations
        for (int i = 1; i < colorList.size(); i++) {
            renderer.setPositivePaint(colorList.get(i));
        }
        
        // Retrieve the positive paint
        /* read */ Paint positivePaint = renderer.getPositivePaint();
        
        // Print the positive paint
        System.out.println("Positive Paint: " + positivePaint);
        
        // Additional operations
        XYDifferenceRenderer anotherRenderer = new XYDifferenceRenderer();
        anotherRenderer.setPositivePaint(Color.MAGENTA);
        Paint anotherPositivePaint = anotherRenderer.getPositivePaint();
        System.out.println("Another Positive Paint: " + anotherPositivePaint);
        
        // Manipulate the color list
        colorList.add(Color.ORANGE);
        colorList.remove(Color.BLUE);
        
        // Print the final color list
        System.out.println("Final Color List: " + colorList);
    }
}