import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        List<ValueAxis> axisList = new ArrayList<>();
        
        axisList.add(axis);
        
        // Some unrelated operations
        for (int i = 0; i < 5; i++) {
            ValueAxis newAxis = new NumberAxis("Axis " + i);
            newAxis.setRange(new Range(i * 10.0, (i + 1) * 10.0));
            axisList.add(newAxis);
        }
        
        // More unrelated operations
        for (ValueAxis ax : axisList) {
            System.out.println("Axis Range: " + ax.getRange().getLowerBound() + " to " + ax.getRange().getUpperBound());
        }
        
        /* write */ axis.setRange(new Range(0.0, 10.0));
        
        // Even more unrelated operations
        double sumOfRanges = 0.0;
        for (ValueAxis ax : axisList) {
            Range r = ax.getRange();
            sumOfRanges += r.getUpperBound() - r.getLowerBound();
        }
        System.out.println("Sum of all axis ranges: " + sumOfRanges);
        
        // Final unrelated operations
        for (int i = 0; i < axisList.size(); i++) {
            System.out.println("Axis " + i + " has range: " + axisList.get(i).getRange());
        }
        
        /* read */ Range range = axis.getRange();
        
        System.out.println("Final Range: " + range.getLowerBound() + " to " + range.getUpperBound());
    }
}