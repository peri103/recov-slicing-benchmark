import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend Item");

        // Use the write method to set the fill paint
        /* write */ legendItem.setFillPaint(Color.RED);

        // Adding more complexity with ArrayList operations
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Iterate over the list and print each color
        for (String color : colors) {
            System.out.println("Color: " + color);
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Adding another LegendItem for demonstration
        LegendItem anotherLegendItem = new LegendItem("Another Legend Item");
        anotherLegendItem.setFillPaint(Color.GREEN);
        Paint anotherFillPaint = anotherLegendItem.getFillPaint();
        System.out.println("Another Legend Item Fill Paint: " + anotherFillPaint);

        // Use the read method to get the fill paint
        /* read */ Paint fillPaint = legendItem.getFillPaint();

        // Print the value to verify
        System.out.println("Sample Legend Item Fill Paint: " + fillPaint);

        // More operations to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        // Print numbers
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}