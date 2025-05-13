import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        ArrayList<String> colors = new ArrayList<>();
        
        // Adding some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        // Perform some operations on the list
        for (String color : colors) {
            System.out.println("Color: " + color);
        }
        
        // Set the range paint to BLUE
        /* write */ renderer.setRangePaint(Color.BLUE);
        
        // Additional logic to manipulate some data
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
        
        // Retrieve the range paint value
        /* read */ Paint rangePaint = renderer.getRangePaint();
        
        // Print out the range paint
        System.out.println("Range Paint: " + rangePaint);
        
        // More complex logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5 is: " + product);
        
        // Using the list of colors again
        if (!colors.isEmpty()) {
            System.out.println("First color in the list: " + colors.get(0));
        }
    }
}