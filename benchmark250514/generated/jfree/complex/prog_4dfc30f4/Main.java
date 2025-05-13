import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot
        PiePlot piePlot = new PiePlot();

        // Create and manipulate a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Iterate through the map and print values
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Write operation on PiePlot
        /* write */ piePlot.setLabelOutlinePaint(Color.RED);

        // Create and manipulate an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        // Print the square of numbers
        for (Integer number : numbers) {
            System.out.println("Square: " + number);
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        // Read operation on PiePlot
        /* read */ Paint paint = piePlot.getLabelOutlinePaint();
        System.out.println("Label Outline Paint: " + paint);

        // Further operations on the ArrayList
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Add more elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            numbers.add(i + 10);
        }

        // Print all elements in the ArrayList
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}