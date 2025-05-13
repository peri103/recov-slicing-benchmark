import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a custom plot
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };

        // Create a list of colors
        ArrayList<Color> colorList = new ArrayList<>();
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);
        
        // Create a map to store color names
        HashMap<String, Color> colorMap = new HashMap<>();
        colorMap.put("Red", Color.RED);
        colorMap.put("Green", Color.GREEN);
        colorMap.put("Blue", Color.BLUE);

        // Set the background paint to blue
        /* write */ plot.setBackgroundPaint(Color.BLUE);

        // Loop through the color list and print color names
        for (Color color : colorList) {
            for (String colorName : colorMap.keySet()) {
                if (colorMap.get(colorName).equals(color)) {
                    System.out.println("Color in list: " + colorName);
                }
            }
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Get the background paint and print it
        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();
        System.out.println("Background Paint: " + backgroundPaint);

        // Perform another unrelated operation
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}