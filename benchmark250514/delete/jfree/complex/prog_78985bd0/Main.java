import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StandardXYItemLabelGenerator labelGenerator = new StandardXYItemLabelGenerator();
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        
        // Create another label generator for categories
        StandardCategoryItemLabelGenerator categoryLabelGenerator = new StandardCategoryItemLabelGenerator();
        categoryLabelGenerator.setFormatString("{1}");
        
        // Manipulate the map
        String mapValue = map.get("key1");
        System.out.println("Map value for key1: " + mapValue);
        
        /* write */ labelGenerator.setFormatString("{2}");
        
        // Perform some operations with the category label generator
        String categoryFormat = categoryLabelGenerator.getFormatString();
        System.out.println("Category label format: " + categoryFormat);
        
        // More complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // More map manipulations
        map.put("key3", "value3");
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }
        
        /* read */ String formatString = labelGenerator.getFormatString();
        System.out.println("XY label format: " + formatString);
    }
}