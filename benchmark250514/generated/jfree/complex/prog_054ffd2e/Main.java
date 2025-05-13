import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CategoryAxis axis = new CategoryAxis();
        CategoryLabelPositions positions = CategoryLabelPositions.STANDARD;

        // Additional unrelated code to make the program more complex
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        /* write */ axis.setCategoryLabelPositions(positions);

        // More unrelated operations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);

        // Using a similar API pair (not marked with /* write */ and /* read */)
        CategoryAxis axis2 = new CategoryAxis();
        CategoryLabelPositions positions2 = CategoryLabelPositions.UP_45;
        axis2.setCategoryLabelPositions(positions2);
        CategoryLabelPositions readPositions2 = axis2.getCategoryLabelPositions();
        System.out.println("Axis2 positions: " + readPositions2);

        // Some more complex logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        /* read */ CategoryLabelPositions readPositions = axis.getCategoryLabelPositions();
        System.out.println("Axis positions: " + readPositions);
    }
}