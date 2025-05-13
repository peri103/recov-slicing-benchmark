import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.TickUnits;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(5.0);
        
        /* write */ axis.setTickUnit(tickUnit);
        
        // Additional complex logic
        TickUnits tickUnitsCollection = new TickUnits();
        tickUnitsCollection.add(new TickUnit(1.0));
        tickUnitsCollection.add(new TickUnit(2.5));
        tickUnitsCollection.add(new TickUnit(5.0));
        
        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            values.add(i * 2.5);
        }
        
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        
        System.out.println("Sum of values: " + sum);
        
        TickUnit retrievedTickUnit = axis.getTickUnit();
        double retrievedTickSize = retrievedTickUnit.getSize();
        
        // More complex logic
        ArrayList<Double> adjustedValues = new ArrayList<>();
        for (Double value : values) {
            adjustedValues.add(value / retrievedTickSize);
        }
        
        System.out.println("Adjusted values:");
        for (Double adjustedValue : adjustedValues) {
            System.out.println(adjustedValue);
        }
        
        /* read */ TickUnit finalRetrievedTickUnit = axis.getTickUnit();
        
        System.out.println("Final Tick Unit Size: " + finalRetrievedTickUnit.getSize());
    }
}