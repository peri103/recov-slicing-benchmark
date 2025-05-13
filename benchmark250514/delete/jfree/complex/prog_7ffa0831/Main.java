import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize the ValueAxis object
        ValueAxis axis = new NumberAxis();
        
        // Create a NumberTickUnit object to be used for setting the tick unit
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        // Use the write method to set the tick unit
        /* write */ axis.setTickUnit(tickUnit);
        
        // Additional unrelated code to make the program more complex
        NumberAxis anotherAxis = new NumberAxis();
        anotherAxis.setTickUnit(new NumberTickUnit(10.0));
        
        double[] data = new double[10];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextDouble() * 100;
        }
        
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        double average = sum / data.length;
        
        System.out.println("Average of random data: " + average);
        
        // Use the read method to get the tick unit
        /* read */ NumberTickUnit readTickUnit = (NumberTickUnit) axis.getTickUnit();
        
        // Print the tick unit value to verify the read operation
        System.out.println("Tick Unit: " + readTickUnit.getSize());
        
        // More unrelated code to make the program complex
        double scaledAverage = average / readTickUnit.getSize();
        System.out.println("Scaled Average: " + scaledAverage);
        
        double[] scaledData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            scaledData[i] = data[i] / readTickUnit.getSize();
        }
        
        System.out.println("Scaled Data:");
        for (double value : scaledData) {
            System.out.println(value);
        }
    }
}