import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardCategoryToolTipGenerator object
        StandardCategoryToolTipGenerator tooltipGenerator = new StandardCategoryToolTipGenerator();
        
        // Initialize the DecimalFormat object which will be used for setting and getting the category format
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        
        // Set the category format using the write method
        /* write */ tooltipGenerator.setCategoryFormat(decimalFormat);
        
        // Get the category format using the read method
        /* read */ DecimalFormat retrievedFormat = tooltipGenerator.getCategoryFormat();
        
        // Print the retrieved format pattern to verify the correct format is read
        System.out.println(retrievedFormat.toPattern());
    }
}