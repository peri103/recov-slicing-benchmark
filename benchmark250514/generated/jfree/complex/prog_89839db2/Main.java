import org.jfree.chart.plot.ThermometerPlot;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        ArrayList<Integer> temperatures = new ArrayList<>();
        temperatures.add(32);
        temperatures.add(45);
        temperatures.add(60);

        // Perform some operations on the temperatures list
        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        double average = sum / (double) temperatures.size();
        System.out.println("Average temperature: " + average);

        // Set the units for the ThermometerPlot
        /* write */ plot.setUnits(ThermometerPlot.UNITS_FAHRENHEIT);

        // Some unrelated complex logic
        ArrayList<String> temperatureLabels = new ArrayList<>();
        for (int temp : temperatures) {
            if (temp < 50) {
                temperatureLabels.add("Cold");
            } else {
                temperatureLabels.add("Warm");
            }
        }

        for (String label : temperatureLabels) {
            System.out.println("Temperature label: " + label);
        }

        // Read the units back from the ThermometerPlot
        /* read */ int units = plot.getUnits();
        System.out.println("Thermometer units: " + units);

        // More complex logic
        int maxTemp = Integer.MIN_VALUE;
        for (int temp : temperatures) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
        }
        System.out.println("Max temperature: " + maxTemp);
    }
}