import org.jfree.chart.plot.IntervalMarker;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IntervalMarker marker = new IntervalMarker(0.0, 10.0);
        
        // Using ArrayList to store markers
        List<IntervalMarker> markerList = new ArrayList<>();
        markerList.add(marker);

        // Perform operations on markerList
        for (IntervalMarker m : markerList) {
            System.out.println("Initial Start Value: " + m.getStartValue());
        }

        // Adding more markers
        IntervalMarker marker2 = new IntervalMarker(20.0, 30.0);
        markerList.add(marker2);

        // Modifying start value of the first marker
        /* write */ marker.setStartValue(5.0);

        // Perform operations on markerList again
        for (IntervalMarker m : markerList) {
            System.out.println("Modified Start Value: " + m.getStartValue());
        }

        // Reading the start value of the first marker
        /* read */ double startValue = marker.getStartValue();
        System.out.println("Read Start Value: " + startValue);

        // Adding unrelated operations
        double totalRange = 0.0;
        for (IntervalMarker m : markerList) {
            totalRange += (m.getEndValue() - m.getStartValue());
        }
        System.out.println("Total Range: " + totalRange);
    }
}