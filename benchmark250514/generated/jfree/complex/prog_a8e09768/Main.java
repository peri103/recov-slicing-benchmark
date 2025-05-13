import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYDifferenceRenderer
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        
        // Create a Paint object to set as negative paint
        Paint negativePaint = Color.RED;
        
        /* write */ renderer.setNegativePaint(negativePaint);
        
        // Initialize a HashMap to store some data
        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("A", 10);
        dataMap.put("B", 20);
        dataMap.put("C", 30);
        
        // Perform operations on the HashMap
        int sum = 0;
        for (String key : dataMap.keySet()) {
            sum += dataMap.get(key);
        }
        System.out.println("Sum of values in dataMap: " + sum);
        
        // Initialize an ArrayList to store colors
        ArrayList<Color> colorList = new ArrayList<>();
        colorList.add(Color.BLUE);
        colorList.add(Color.GREEN);
        colorList.add(Color.YELLOW);
        
        // Perform operations on the ArrayList
        for (Color color : colorList) {
            System.out.println("Color: " + color);
        }
        
        // Retrieve the negative paint from the renderer
        /* read */ Paint retrievedNegativePaint = renderer.getNegativePaint();
        
        // Print the retrieved negative paint to verify the read operation
        System.out.println("Retrieved Negative Paint: " + retrievedNegativePaint);
        
        // Additional complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
        
        // Modify the HashMap and ArrayList further
        dataMap.put("D", 40);
        colorList.add(Color.ORANGE);
        
        // Print modified data structures
        System.out.println("Updated dataMap: " + dataMap);
        System.out.println("Updated colorList: " + colorList);
    }
}