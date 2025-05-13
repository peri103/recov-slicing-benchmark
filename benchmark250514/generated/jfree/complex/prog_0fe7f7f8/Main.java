import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot
        PiePlot plot = new PiePlot();
        
        // Create a list of colors
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        
        // Create a map to store color names and their RGB values
        HashMap<String, String> colorMap = new HashMap<>();
        colorMap.put("Red", "255,0,0");
        colorMap.put("Green", "0,255,0");
        colorMap.put("Blue", "0,0,255");
        
        // Set label background paint
        /* write */ plot.setLabelBackgroundPaint(Color.BLUE);
        
        // Iterate over colors and print their RGB values
        for (Color color : colors) {
            for (String name : colorMap.keySet()) {
                if (colorMap.get(name).equals(color.getRed() + "," + color.getGreen() + "," + color.getBlue())) {
                    System.out.println("Color: " + name + " RGB: " + colorMap.get(name));
                }
            }
        }
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Read label background paint
        /* read */ Paint labelBackgroundPaint = plot.getLabelBackgroundPaint();
        System.out.println("Label Background Paint: " + labelBackgroundPaint);
        
        // More complex logic: Calculate factorial of a number
        int number = 5;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}