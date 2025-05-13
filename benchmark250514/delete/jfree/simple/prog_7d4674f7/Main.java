import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StandardCategoryToolTipGenerator
        StandardCategoryToolTipGenerator generator = new StandardCategoryToolTipGenerator();

        // Create a DecimalFormat instance for formatting
        DecimalFormat format = new DecimalFormat("#.##");

        // Write operation: set the category format
        /* write */ generator.setCategoryFormat(format);

        // Read operation: get the category format
        /* read */ DecimalFormat retrievedFormat = generator.getCategoryFormat();

        // Output the result
        System.out.println(retrievedFormat.toPattern());
    }
}