import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StandardCategoryToolTipGenerator
        StandardCategoryToolTipGenerator tooltipGenerator = new StandardCategoryToolTipGenerator();

        // Create a NumberFormat instance for setting the category format
        NumberFormat format = NumberFormat.getNumberInstance();
        
        /* write */ tooltipGenerator.setCategoryFormat(format);

        /* read */ NumberFormat retrievedFormat = tooltipGenerator.getCategoryFormat();

        // Print out the format to verify it was set and retrieved correctly
        System.out.println(retrievedFormat);
    }
}