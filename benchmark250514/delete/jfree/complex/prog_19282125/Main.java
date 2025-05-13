import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        DecimalFormat format = new DecimalFormat("#.##");
        Color mercuryColor = Color.RED;
        ArrayList<Double> temperatureReadings = new ArrayList<>();

        // Additional setup for thermometer plot
        plot.setMercuryPaint(mercuryColor);
        plot.setSubrangePaint(0, Color.BLUE);
        
        // Simulate temperature readings
        for (int i = 0; i < 10; i++) {
            temperatureReadings.add(Math.random() * 100);
        }

        // Process temperature data
        double averageTemperature = temperatureReadings.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        
        System.out.println("Average Temperature: " + averageTemperature);

        /* write */ plot.setValueFormat(format);

        // Additional operations with the thermometer plot
        plot.setSubrange(0, averageTemperature - 10, averageTemperature + 10);
        plot.setUnits(1);
        
        // More processing with temperature readings
        double maxTemperature = temperatureReadings.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0.0);
        
        System.out.println("Max Temperature: " + maxTemperature);

        /* read */ DecimalFormat retrievedFormat = (DecimalFormat) plot.getValueFormat();
        
        System.out.println("Value Format: " + retrievedFormat.toPattern());

        // Print all temperature readings
        System.out.println("Temperature Readings:");
        for (Double temp : temperatureReadings) {
            System.out.println(temp);
        }
    }
}