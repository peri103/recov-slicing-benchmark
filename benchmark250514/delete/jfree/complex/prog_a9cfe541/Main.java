import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import org.jfree.chart.axis.CategoryAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ValueAxis using NumberAxis
        ValueAxis axis = new NumberAxis();
        
        // Define a range to be set
        Range rangeToSet = new Range(0.0, 100.0);
        
        /* write */ axis.setRange(rangeToSet);
        
        // Additional complex code
        CategoryAxis categoryAxis = new CategoryAxis("Category");
        ArrayList<String> categories = new ArrayList<>();
        categories.add("Category 1");
        categories.add("Category 2");
        categories.add("Category 3");
        
        for (String category : categories) {
            System.out.println("Processing: " + category);
            categoryAxis.addCategoryLabel(category);
        }
        
        double lowerBound = 10.0;
        double upperBound = 50.0;
        Range anotherRange = new Range(lowerBound, upperBound);
        
        axis.setRange(anotherRange);
        System.out.println("Another Range Set: " + axis.getRange());
        
        // Perform some calculations
        double midPoint = (lowerBound + upperBound) / 2.0;
        System.out.println("Mid Point: " + midPoint);
        
        // Use the range read from the axis
        /* read */ Range rangeRead = axis.getRange();
        
        System.out.println("Range: " + rangeRead);
        
        // More unrelated code
        for (int i = 0; i < categories.size(); i++) {
            System.out.println("Category " + (i + 1) + ": " + categories.get(i));
        }
        
        // Final calculations
        double rangeLength = rangeRead.getLength();
        System.out.println("Length of the Range: " + rangeLength);
    }
}