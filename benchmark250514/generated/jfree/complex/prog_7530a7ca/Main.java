import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();

        // Create a Color object to set as the label background paint
        Color labelBackgroundColor = new Color(255, 0, 0); // Red color

        /* write */ piePlot.setLabelBackgroundPaint(labelBackgroundColor);

        // Additional code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        HashMap<Integer, String> numberDescriptions = new HashMap<>();
        for (int number : numbers) {
            numberDescriptions.put(number, "Number: " + number);
        }

        for (int number : numbers) {
            System.out.println(numberDescriptions.get(number));
        }

        // More operations on PiePlot
        piePlot.setSectionOutlinesVisible(true);
        piePlot.setExplodePercent(0, 0.1);

        // Some unrelated calculations
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ Paint retrievedPaint = piePlot.getLabelBackgroundPaint();
        System.out.println("Retrieved Paint: " + retrievedPaint);

        // Further complex operations
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("First");
        listOfStrings.add("Second");
        listOfStrings.add("Third");

        for (String str : listOfStrings) {
            System.out.println("String: " + str);
        }

        int product = 1;
        for (int number : numbers) {
            product *= number + 1;
        }
        System.out.println("Product of numbers plus one: " + product);
    }
}