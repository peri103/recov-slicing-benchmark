import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.MeterNeedle;
import org.jfree.chart.needle.PointerNeedle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CompassPlot compassPlot = new CompassPlot();
        
        MeterNeedle needle = new MeterNeedle();
        PointerNeedle pointerNeedle = new PointerNeedle();
        
        ArrayList<MeterNeedle> needleList = new ArrayList<>();
        needleList.add(needle);
        needleList.add(pointerNeedle);
        
        /* write */ compassPlot.setSeriesNeedle(0, needle);
        
        // Perform some unrelated operations
        for (MeterNeedle n : needleList) {
            System.out.println("Needle in list: " + n);
        }
        
        // Add more operations with CompassPlot
        compassPlot.setSeriesNeedle(1, pointerNeedle);
        MeterNeedle anotherNeedle = compassPlot.getSeriesNeedle(1);
        System.out.println("Another needle: " + anotherNeedle);
        
        // More complex operations
        ArrayList<String> operations = new ArrayList<>();
        operations.add("Set needle");
        operations.add("Get needle");
        
        for (String operation : operations) {
            System.out.println("Operation: " + operation);
        }
        
        // Retrieve the original needle
        /* read */ MeterNeedle retrievedNeedle = compassPlot.getSeriesNeedle(0);
        
        System.out.println(retrievedNeedle.equals(needle));
        
        // Additional logic
        int size = needleList.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Needle index: " + i);
        }
    }
}