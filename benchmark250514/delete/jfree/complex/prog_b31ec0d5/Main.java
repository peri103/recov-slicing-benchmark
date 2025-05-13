import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardCategoryToolTipGenerator object
        StandardCategoryToolTipGenerator generator = new StandardCategoryToolTipGenerator();

        // Create a NumberFormat instance for formatting
        NumberFormat format = NumberFormat.getInstance();

        // Write: Set the category format using the setCategoryFormat method
        /* write */ generator.setCategoryFormat(format);

        // Additional complexity: Use an ArrayList to store multiple formats
        List<NumberFormat> formats = new ArrayList<>();
        formats.add(NumberFormat.getCurrencyInstance());
        formats.add(NumberFormat.getPercentInstance());

        // Iterate over the formats and print their class names
        for (NumberFormat nf : formats) {
            System.out.println("Format class: " + nf.getClass().getName());
        }

        // Perform some mathematical operations
        double value1 = 123.45;
        double value2 = 678.90;
        double sum = value1 + value2;
        double product = value1 * value2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Read: Retrieve the category format using the getCategoryFormat method
        /* read */ NumberFormat retrievedFormat = generator.getCategoryFormat();

        // Print the retrieved format to verify the operation
        System.out.println("Retrieved format: " + retrievedFormat);

        // Further complexity: Perform string manipulations
        String text = "Hello, World!";
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Original text: " + text);
        System.out.println("Reversed text: " + reversed);

        // Additional list operations
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");

        for (String s : strings) {
            System.out.println("Programming language: " + s);
        }
    }
}