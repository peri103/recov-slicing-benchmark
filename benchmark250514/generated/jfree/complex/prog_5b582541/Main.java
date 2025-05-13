import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NumberAxis numberAxis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        // Additional code with unrelated operations
        ArrayList<String> labels = new ArrayList<>();
        labels.add("Label1");
        labels.add("Label2");
        labels.add("Label3");
        
        for (String label : labels) {
            System.out.println("Processing label: " + label);
        }
        
        // Interacting with NumberAxis
        NumberAxis anotherAxis = new NumberAxis();
        anotherAxis.setAutoRangeIncludesZero(false);
        anotherAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        double lowerBound = anotherAxis.getLowerBound();
        double upperBound = anotherAxis.getUpperBound();
        System.out.println("Axis bounds: " + lowerBound + " to " + upperBound);
        
        /* write */ numberAxis.setTickUnit(tickUnit);
        
        // More unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);
        
        NumberTickUnit retrievedTickUnit = null;
        if (sum > 10) {
            /* read */ retrievedTickUnit = numberAxis.getTickUnit();
        }
        
        if (retrievedTickUnit != null) {
            System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
        }
        
        // Further unrelated operations
        ArrayList<Double> values = new ArrayList<>();
        for (double j = 0.0; j < 10.0; j += 2.5) {
            values.add(j);
        }
        
        for (double value : values) {
            System.out.println("Value: " + value);
        }
    }
}