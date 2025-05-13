import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        /* write */ axis.setTickUnit(tickUnit);
        
        // Additional unrelated code
        ArrayList<Double> values = new ArrayList<>();
        for (double i = 0; i < 10; i++) {
            values.add(i * 2.5);
        }
        
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        
        System.out.println("Sum of values: " + sum);
        
        // Additional similar API pair usage
        NumberAxis anotherAxis = new NumberAxis();
        NumberTickUnit anotherTickUnit = new NumberTickUnit(2.0);
        anotherAxis.setTickUnit(anotherTickUnit);
        
        NumberTickUnit retrievedAnotherTickUnit = anotherAxis.getTickUnit();
        System.out.println("Another Tick Unit: " + retrievedAnotherTickUnit.getSize());
        
        // More complex operations
        ArrayList<NumberAxis> axes = new ArrayList<>();
        axes.add(axis);
        axes.add(anotherAxis);
        
        for (NumberAxis na : axes) {
            System.out.println("Axis Tick Unit: " + na.getTickUnit().getSize());
        }
        
        /* read */ NumberTickUnit retrievedTickUnit = axis.getTickUnit();
        
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
    }
}