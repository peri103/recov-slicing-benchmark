import org.jfree.chart.plot.ValueMarker;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Original ValueMarker usage
        ValueMarker marker = new ValueMarker(0.0);
        
        // Additional complex code
        ArrayList<Double> valuesList = new ArrayList<>();
        Random random = new Random();
        
        // Populate the list with random values
        for (int i = 0; i < 5; i++) {
            valuesList.add(random.nextDouble() * 100);
        }
        
        // Process the list to find the maximum value
        double maxValue = Double.MIN_VALUE;
        for (Double val : valuesList) {
            if (val > maxValue) {
                maxValue = val;
            }
        }
        
        // Set the maximum value to the marker
        /* write */ marker.setValue(maxValue);
        
        // Perform some unrelated calculations
        double sum = 0;
        for (Double val : valuesList) {
            sum += val;
        }
        double average = sum / valuesList.size();
        System.out.println("Average of list: " + average);
        
        // Retrieve and print the value from the marker
        /* read */ double value = marker.getValue();
        System.out.println("Maximum value set in marker: " + value);
        
        // Additional unrelated code
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Use the maximum value in a new calculation
        double finalCalculation = value * 2;
        System.out.println("Final calculation result: " + finalCalculation);
    }
}