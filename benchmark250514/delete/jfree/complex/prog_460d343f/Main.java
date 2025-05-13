import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.SpiderWebPlot;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        SpiderWebPlot spiderPlot = new SpiderWebPlot();
        ArrayList<Integer> values = new ArrayList<>();
        
        // Set units for the thermometer plot
        /* write */ plot.setUnits(ThermometerPlot.UNITS_CELSIUS);
        
        // Some additional operations
        spiderPlot.setOrientation(PlotOrientation.HORIZONTAL);
        values.add(10);
        values.add(20);
        values.add(30);
        
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        
        System.out.println("Sum of values: " + sum);
        
        // Retrieve the units from the thermometer plot
        /* read */ int units = plot.getUnits();
        System.out.println("Thermometer units: " + units);
        
        // Further operations
        spiderPlot.setOrientation(PlotOrientation.VERTICAL);
        values.add(40);
        
        int maxValue = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        
        System.out.println("Max value: " + maxValue);
    }
}