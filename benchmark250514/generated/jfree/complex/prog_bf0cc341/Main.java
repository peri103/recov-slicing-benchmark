import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        /* write */ axis.setTickUnit(tickUnit);
        
        // Additional unrelated code to make the program more complex
        List<Double> values = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            values.add(i * 2.5);
        }
        
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        
        System.out.println("Sum of values: " + sum);

        // Additional similar api usage
        NumberAxis anotherAxis = new NumberAxis();
        NumberTickUnit anotherTickUnit = new NumberTickUnit(10.0);
        anotherAxis.setTickUnit(anotherTickUnit);

        NumberTickUnit readAnotherTickUnit = anotherAxis.getTickUnit();
        System.out.println("Another Tick Unit: " + readAnotherTickUnit.getSize());
        
        // More complex operations
        double average = sum / values.size();
        System.out.println("Average of values: " + average);

        // Perform some calculations using the tick unit size
        double calculatedValue = readAnotherTickUnit.getSize() * average;
        System.out.println("Calculated Value: " + calculatedValue);

        /* read */ NumberTickUnit readTickUnit = axis.getTickUnit();
        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}