import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.labels.CrosshairLabelGenerator;
import org.jfree.chart.labels.StandardCrosshairLabelGenerator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Crosshair object
        Crosshair crosshair = new Crosshair();

        // Create an instance of CrosshairLabelGenerator
        CrosshairLabelGenerator labelGenerator = new CrosshairLabelGenerator() {
            @Override
            public String generateLabel(Crosshair crosshair) {
                return "Sample Label";
            }
        };

        // Create a StandardCrosshairLabelGenerator instance and set it to the crosshair
        StandardCrosshairLabelGenerator standardLabelGenerator = new StandardCrosshairLabelGenerator();
        crosshair.setLabelGenerator(standardLabelGenerator);

        // Initialize an ArrayList and add some elements
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");

        // Print all elements in the list
        for (String element : stringList) {
            System.out.println(element);
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Set the custom label generator to the crosshair
        /* write */ crosshair.setLabelGenerator(labelGenerator);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Retrieve the label generator from the crosshair and use it
        /* read */ CrosshairLabelGenerator retrievedLabelGenerator = crosshair.getLabelGenerator();
        String label = retrievedLabelGenerator.generateLabel(crosshair);
        System.out.println("Generated Label: " + label);

        // More complex operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Number: " + numberList.get(i));
        }
    }
}