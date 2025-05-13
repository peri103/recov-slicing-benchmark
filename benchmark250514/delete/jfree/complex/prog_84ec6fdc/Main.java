import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        
        // Create a DecimalFormat instance to set the value format
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        /* write */ plot.setValueFormat(decimalFormat);
        
        // Create an ArrayList to store temperature values
        ArrayList<Double> temperatures = new ArrayList<>();
        for (double i = 0; i < 100; i += 10) {
            temperatures.add(i);
        }
        
        // Calculate average temperature
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        double averageTemperature = sum / temperatures.size();
        
        // Print average temperature
        System.out.println("Average Temperature: " + averageTemperature);
        
        // Simulate setting the thermometer plot value
        plot.setValue(averageTemperature);
        
        // Retrieve and print the current value format pattern
        /* read */ DecimalFormat retrievedFormat = (DecimalFormat) plot.getValueFormat();
        System.out.println("Value format pattern: " + retrievedFormat.toPattern());
        
        // Check if the current temperature is above a threshold
        double threshold = 50.0;
        if (averageTemperature > threshold) {
            System.out.println("Warning: Temperature exceeds threshold!");
        } else {
            System.out.println("Temperature is within normal range.");
        }
        
        // Print all temperatures in the list
        System.out.println("Temperature readings:");
        for (double temp : temperatures) {
            System.out.println(temp);
        }
    }
}