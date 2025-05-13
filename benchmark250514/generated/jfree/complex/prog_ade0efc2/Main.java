import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot
        PiePlot piePlot = new PiePlot();
        
        // Initialize another PiePlot for additional complexity
        PiePlot anotherPiePlot = new PiePlot();
        
        // Create a list of colors
        ArrayList<Color> colorList = new ArrayList<>();
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);
        
        // Set label background paint using one of the colors
        anotherPiePlot.setLabelBackgroundPaint(colorList.get(0));
        
        // Perform some operations on the list
        for (Color color : colorList) {
            anotherPiePlot.setLabelBackgroundPaint(color);
        }
        
        // Set label background paint for the main PiePlot
        /* write */ piePlot.setLabelBackgroundPaint(Color.BLUE);
        
        // Perform some additional operations
        Color testColor = colorList.get(1);
        anotherPiePlot.setLabelBackgroundPaint(testColor);
        
        // Retrieve the label background paint from the main PiePlot
        /* read */ Paint paint = piePlot.getLabelBackgroundPaint();
        System.out.println("Main PiePlot Label Background Paint: " + paint);
        
        // Display the label background paint from the other PiePlot
        Paint anotherPaint = anotherPiePlot.getLabelBackgroundPaint();
        System.out.println("Another PiePlot Label Background Paint: " + anotherPaint);
        
        // Add more colors to the list
        colorList.add(Color.YELLOW);
        colorList.add(Color.MAGENTA);
        
        // Print all colors in the list
        for (Color color : colorList) {
            System.out.println("Color in list: " + color);
        }
    }
}