import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LogarithmicAxis logAxis = new LogarithmicAxis("Log Axis");
        
        // Set base for logarithmic axis
        /* write */ logAxis.setBase(10.0);
        
        // Create a NumberAxis for demonstration
        NumberAxis numberAxis = new NumberAxis("Number Axis");
        numberAxis.setRange(0, 100);
        
        // Create a list to hold axis objects
        ArrayList<Object> axisList = new ArrayList<>();
        axisList.add(logAxis);
        axisList.add(numberAxis);
        
        // Manipulate the NumberAxis
        numberAxis.setTickUnit(5);
        
        // Perform some calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 2.5;
        }
        
        // Read base value from logarithmic axis
        /* read */ double base = logAxis.getBase();
        
        // Output results
        System.out.println("Logarithmic Axis Base: " + base);
        System.out.println("Sum of calculations: " + sum);
        
        // Additional operations on axis list
        for (Object axis : axisList) {
            if (axis instanceof LogarithmicAxis) {
                System.out.println("Found LogarithmicAxis in list.");
            } else if (axis instanceof NumberAxis) {
                System.out.println("Found NumberAxis in list.");
            }
        }
    }
}