import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        CategoryAxis categoryAxis = new CategoryAxis();
        DateAxis dateAxis = new DateAxis();

        // Setting ranges for different axes
        categoryAxis.setCategoryMargin(0.05);
        dateAxis.setMinimumDate(new java.util.Date(0));

        // Perform some operations with category and date axes
        categoryAxis.setTickLabelsVisible(true);
        dateAxis.setDateFormatOverride(new java.text.SimpleDateFormat("MMM-yyyy"));

        /* write */ axis.setRange(new Range(0.0, 10.0));

        // Additional operations to make the program more complex
        axis.setTickLabelsVisible(true);
        axis.setTickMarksVisible(false);
        axis.setLabel("Value Axis");

        Range range = axis.getRange();
        double centralValue = range.getCentralValue();
        double length = range.getLength();

        System.out.println("Central Value: " + centralValue);
        System.out.println("Range Length: " + length);

        // More operations unrelated to the original write-read pair
        categoryAxis.setLabel("Category Axis");
        dateAxis.setLabel("Date Axis");

        // Perform calculations with the range
        double lowerBound = range.getLowerBound();
        double upperBound = range.getUpperBound();
        double midPoint = (lowerBound + upperBound) / 2;

        System.out.println("Midpoint of Range: " + midPoint);

        // Final read operation
        /* read */ Range finalRange = axis.getRange();
        System.out.println("Final Range: " + finalRange);
    }
}