import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of PiePlot
        PiePlot piePlot = new PiePlot();
        
        // Additional PiePlot instance for demonstration
        PiePlot anotherPiePlot = new PiePlot();

        // Set the shadow paint using the write method
        /* write */ piePlot.setShadowPaint(Color.GRAY);

        // Perform some unrelated operations
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        // Manipulate the list
        for (String str : stringList) {
            System.out.println("String in list: " + str);
        }

        // Set shadow paint for anotherPiePlot
        anotherPiePlot.setShadowPaint(Color.BLUE);

        // Perform calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Retrieve the shadow paint using the read method
        /* read */ Paint shadowPaint = piePlot.getShadowPaint();

        // Output the shadow paint to verify the value
        System.out.println("Original PiePlot Shadow Paint: " + shadowPaint);

        // Retrieve shadow paint for anotherPiePlot
        Paint anotherShadowPaint = anotherPiePlot.getShadowPaint();
        System.out.println("Another PiePlot Shadow Paint: " + anotherShadowPaint);

        // More complex operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numberList.add(i * 2);
        }

        int product = 1;
        for (int number : numberList) {
            product *= number;
        }
        System.out.println("Product of numbers in list: " + product);
    }
}