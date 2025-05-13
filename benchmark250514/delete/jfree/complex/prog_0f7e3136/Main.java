import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;
import org.jfree.chart.plot.Plot;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        DecimalFormat format = new DecimalFormat("#.##");
        
        // Set value format
        /* write */ plot.setValueFormat(format);

        // Additional complex operations
        Plot anotherPlot = new ThermometerPlot();
        DecimalFormat anotherFormat = new DecimalFormat("#.###");
        anotherPlot.setValueFormat(anotherFormat);

        // Perform some calculations
        double[] temperatureValues = {98.6, 101.3, 99.4, 100.0};
        double sum = 0;
        for (double value : temperatureValues) {
            sum += value;
        }
        double averageTemperature = sum / temperatureValues.length;
        System.out.println("Average Temperature: " + averageTemperature);

        // Retrieve value format and perform operations
        /* read */ DecimalFormat retrievedFormat = (DecimalFormat) plot.getValueFormat();
        System.out.println("Value format set: " + retrievedFormat.toPattern());

        // Further operations using the retrieved format
        double roundedTemperature = Double.parseDouble(retrievedFormat.format(averageTemperature));
        System.out.println("Rounded Average Temperature: " + roundedTemperature);

        // More unrelated operations for complexity
        double maxTemperature = Double.MIN_VALUE;
        for (double temp : temperatureValues) {
            if (temp > maxTemperature) {
                maxTemperature = temp;
            }
        }
        System.out.println("Max Temperature: " + maxTemperature);
    }
}