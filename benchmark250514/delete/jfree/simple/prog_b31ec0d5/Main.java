import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardCategoryToolTipGenerator object
        StandardCategoryToolTipGenerator generator = new StandardCategoryToolTipGenerator();

        // Create a NumberFormat instance for formatting
        NumberFormat format = NumberFormat.getInstance();

        // Write: Set the category format using the setCategoryFormat method
        /* write */ generator.setCategoryFormat(format);

        // Read: Retrieve the category format using the getCategoryFormat method
        /* read */ NumberFormat retrievedFormat = generator.getCategoryFormat();

        // Print the retrieved format to verify the operation
        System.out.println(retrievedFormat);
    }
}