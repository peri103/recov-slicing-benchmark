import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.MeterNeedle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CompassPlot and MeterNeedle
        CompassPlot compassPlot = new CompassPlot();
        MeterNeedle needle = new MeterNeedle();

        // Initialize an ArrayList to store some data
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("North");
        dataList.add("East");
        dataList.add("South");
        dataList.add("West");

        // Perform some operations on the ArrayList
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println("Direction: " + dataList.get(i));
        }

        // Set a series needle in CompassPlot
        /* write */ compassPlot.setSeriesNeedle(0, needle);

        // Perform more operations on the ArrayList
        dataList.add("Northeast");
        System.out.println("Added new direction: " + dataList.get(dataList.size() - 1));

        // Check if a specific direction exists in the list
        if (dataList.contains("Southwest")) {
            System.out.println("Southwest is in the list.");
        } else {
            System.out.println("Southwest is not in the list.");
        }

        // Get the series needle from CompassPlot
        /* read */ MeterNeedle readNeedle = compassPlot.getSeriesNeedle(0);

        // Compare the read needle with the original needle
        System.out.println("Needle comparison result: " + readNeedle.equals(needle)); // Should print true if the read needle is the same as the written needle

        // Perform a final operation on the ArrayList
        dataList.remove("East");
        System.out.println("Removed East from the list. Current list: " + dataList);
    }
}