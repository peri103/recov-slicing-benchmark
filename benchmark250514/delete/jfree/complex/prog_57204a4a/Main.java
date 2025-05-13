import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("Example Axis");
        Color color = Color.RED;
        
        /* write */ axis.setSubCategoryPaint("SubCategory1", color);

        // Additional complexity: working with a map
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("One", 1);
        dataMap.put("Two", 2);
        dataMap.put("Three", 3);

        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Additional complexity: more operations on SubCategoryAxis
        axis.setSubCategoryPaint("SubCategory2", Color.BLUE);
        axis.setSubCategoryPaint("SubCategory3", Color.GREEN);

        // Retrieve and print values from the map
        int valueOne = dataMap.get("One");
        int valueTwo = dataMap.get("Two");
        System.out.println("Value for 'One': " + valueOne);
        System.out.println("Value for 'Two': " + valueTwo);

        // Additional complexity: another axis operation
        Color subCategory2Color = axis.getSubCategoryPaint("SubCategory2");
        System.out.println("Color for SubCategory2: " + subCategory2Color);

        // Continue with the original read operation
        /* read */ Color readColor = axis.getSubCategoryPaint("SubCategory1");
        
        System.out.println("Color for SubCategory1: " + readColor);
    }
}