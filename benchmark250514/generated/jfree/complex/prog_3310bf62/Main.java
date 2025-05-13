import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);

        // Unrelated code: creating and manipulating an ArrayList
        ArrayList<Double> values = new ArrayList<>();
        for (double i = 0.0; i < 20.0; i += 5.0) {
            values.add(i);
        }
        
        // Further unrelated code: calculating sum of values
        double sum = 0.0;
        for (Double value : values) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        /* write */ axis.setTickUnit(tickUnit);

        // Unrelated code: finding the maximum value
        double maxValue = Double.MIN_VALUE;
        for (Double value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("Max value: " + maxValue);

        // Unrelated code: applying a transformation to values
        ArrayList<Double> transformedValues = new ArrayList<>();
        for (Double value : values) {
            transformedValues.add(value * 2);
        }

        /* read */ NumberTickUnit readTickUnit = axis.getTickUnit();
        System.out.println("Tick Unit Size: " + readTickUnit.getSize());

        // Unrelated code: printing transformed values
        System.out.println("Transformed Values:");
        for (Double transformedValue : transformedValues) {
            System.out.println(transformedValue);
        }
    }
}