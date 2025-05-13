import org.jfree.chart.renderer.xy.XYBubbleRenderer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        XYBubbleRenderer renderer = new XYBubbleRenderer();
        ArrayList<Integer> dataList = new ArrayList<>();
        HashMap<String, Integer> dataMap = new HashMap<>();

        // Initialize dataList with some values
        for (int i = 0; i < 5; i++) {
            dataList.add(i * 2);
        }

        // Populate dataMap with values from dataList
        for (int i = 0; i < dataList.size(); i++) {
            dataMap.put("Key" + i, dataList.get(i));
        }

        // Perform some operations on dataList
        int sum = 0;
        for (int value : dataList) {
            sum += value;
        }
        System.out.println("Sum of dataList: " + sum);

        /* write */ renderer.setScaleType(XYBubbleRenderer.SCALE_ON_RANGE_AXIS);

        // Additional computations
        int product = 1;
        for (int value : dataMap.values()) {
            product *= value;
        }
        System.out.println("Product of dataMap values: " + product);

        // Retrieve a value from dataMap
        int retrievedValue = dataMap.get("Key3");
        System.out.println("Retrieved value from dataMap: " + retrievedValue);

        // More operations
        dataList.add(10);
        dataList.add(20);
        dataList.remove(0);

        // Final computation
        int max = Integer.MIN_VALUE;
        for (int value : dataList) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max value in dataList: " + max);

        /* read */ int scaleType = renderer.getScaleType();
        System.out.println("Scale Type from renderer: " + scaleType);
    }
}