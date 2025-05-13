import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        DecimalFormat format = new DecimalFormat("#.##");
        
        /* write */ plot.setValueFormat(format);
        
        // Additional code to make the program more complex
        ArrayList<Double> temperatureReadings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            temperatureReadings.add(Math.random() * 100);
        }
        
        double averageTemperature = 0;
        for (Double temp : temperatureReadings) {
            averageTemperature += temp;
        }
        averageTemperature /= temperatureReadings.size();
        
        System.out.println("Average Temperature: " + averageTemperature);
        
        DecimalFormat readFormat = (DecimalFormat) plot.getValueFormat();
        double formattedAverage = Double.parseDouble(readFormat.format(averageTemperature));
        
        // Simulate some operations
        ArrayList<Double> formattedTemperatures = new ArrayList<>();
        for (Double temp : temperatureReadings) {
            formattedTemperatures.add(Double.parseDouble(readFormat.format(temp)));
        }
        
        double maxTemperature = Double.MIN_VALUE;
        for (Double temp : formattedTemperatures) {
            if (temp > maxTemperature) {
                maxTemperature = temp;
            }
        }
        
        /* read */ System.out.println("Formatted Average Temperature: " + formattedAverage);
        System.out.println("Max Temperature: " + maxTemperature);
    }
}