import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        ArrayList<Color> colorList = new ArrayList<>();
        
        // Add colors to the list
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);
        
        // Set the background paint to the first color in the list
        /* write */ plot.setBackgroundPaint(colorList.get(2));
        
        // Perform some operations on the color list
        for (Color color : colorList) {
            System.out.println("Color: " + color);
        }
        
        // Add more colors to the list
        colorList.add(Color.YELLOW);
        colorList.add(Color.ORANGE);
        
        // Create a new PiePlot object and set a different background paint
        PiePlot anotherPlot = new PiePlot();
        anotherPlot.setBackgroundPaint(Color.MAGENTA);
        
        // Retrieve and print the background paint of the original plot
        /* read */ Color backgroundColor = (Color) plot.getBackgroundPaint();
        System.out.println("Original Plot Background Color: " + backgroundColor);
        
        // Print the background paint of the second plot
        Color anotherBackgroundColor = (Color) anotherPlot.getBackgroundPaint();
        System.out.println("Another Plot Background Color: " + anotherBackgroundColor);
        
        // Iterate through the color list and print each color
        for (Color color : colorList) {
            System.out.println("Listed Color: " + color);
        }
    }
}