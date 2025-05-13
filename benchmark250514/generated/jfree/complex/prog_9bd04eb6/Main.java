import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.labels.CrosshairLabelGenerator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Crosshair crosshair = new Crosshair();
        CrosshairLabelGenerator labelGenerator = new CrosshairLabelGenerator() {
            @Override
            public String generateLabel(Crosshair crosshair) {
                return "Custom Label";
            }
        };

        /* write */ crosshair.setLabelGenerator(labelGenerator);
        
        // Create a list to simulate complex operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 2);
        }

        // Process the list in some way
        int sum = 0;
        for (Integer number : numberList) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform some operations
        int maxNumber = Integer.MIN_VALUE;
        for (Integer number : numberList) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Max number: " + maxNumber);

        // More operations with the list
        for (int i = 0; i < numberList.size(); i++) {
            numberList.set(i, numberList.get(i) + 5);
        }

        // Retrieve the label generator and use it
        /* read */ CrosshairLabelGenerator retrievedGenerator = crosshair.getLabelGenerator();
        System.out.println(retrievedGenerator.generateLabel(crosshair));

        // Additional complex operations
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Modified number: " + numberList.get(i));
        }
    }
}