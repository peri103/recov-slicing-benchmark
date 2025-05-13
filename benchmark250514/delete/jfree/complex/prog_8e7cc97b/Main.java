import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        DecimalFormat format = new DecimalFormat("#.##");
        
        // Create a HashMap to store some configurations
        HashMap<String, String> configMap = new HashMap<>();
        configMap.put("temperatureUnit", "Celsius");
        configMap.put("displayMode", "digital");
        
        // Create a list to simulate some data points
        ArrayList<Double> dataPoints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataPoints.add(Math.random() * 100);
        }
        
        /* write */ plot.setValueFormat(format);
        
        // Process the data points
        double average = 0;
        for (Double point : dataPoints) {
            average += point;
        }
        average /= dataPoints.size();
        
        // Print out the configuration settings
        for (String key : configMap.keySet()) {
            System.out.println(key + ": " + configMap.get(key));
        }
        
        /* read */ DecimalFormat retrievedFormat = (DecimalFormat) plot.getValueFormat();
        
        // Test to ensure the read format is the same as the one we set
        System.out.println(retrievedFormat.toPattern());
        
        // Calculate and print the average temperature
        System.out.println("Average Temperature: " + format.format(average));
        
        // Additional processing with a new DecimalFormat
        DecimalFormat anotherFormat = new DecimalFormat("#.###");
        double roundedAverage = Double.parseDouble(anotherFormat.format(average));
        System.out.println("Rounded Average Temperature: " + roundedAverage);
    }
}