import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NumberAxis numberAxis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        /* write */ numberAxis.setTickUnit(tickUnit);

        // Additional code to make the program more complex
        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("A", 10);
        dataMap.put("B", 20);
        dataMap.put("C", 30);

        int sum = 0;
        for (String key : dataMap.keySet()) {
            sum += dataMap.get(key);
        }
        System.out.println("Sum of values in dataMap: " + sum);

        NumberAxis anotherAxis = new NumberAxis();
        NumberTickUnit anotherTickUnit = new NumberTickUnit(10.0);
        anotherAxis.setTickUnit(anotherTickUnit);
        
        NumberTickUnit readAnotherTickUnit = anotherAxis.getTickUnit();
        System.out.println("Another Tick Unit: " + readAnotherTickUnit.getSize());

        // More unrelated operations
        int product = 1;
        for (int value : dataMap.values()) {
            product *= value;
        }
        System.out.println("Product of values in dataMap: " + product);

        /* read */ NumberTickUnit readTickUnit = numberAxis.getTickUnit();
        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}