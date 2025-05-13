import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        // Create a NumberFormat instance to be used for setting and getting
        NumberFormat numberFormat = NumberFormat.getInstance();
        
        // Use the write method to set the number format
        /* write */ labelGenerator.setNumberFormat(numberFormat);
        
        // Create another NumberFormat instance and a DecimalFormat instance
        NumberFormat anotherFormat = NumberFormat.getCurrencyInstance();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        // Create an ArrayList to store different formats
        ArrayList<NumberFormat> formatList = new ArrayList<>();
        formatList.add(anotherFormat);
        formatList.add(decimalFormat);
        
        // Iterate over the format list and print each format type
        for (NumberFormat format : formatList) {
            System.out.println("Format class: " + format.getClass().getName());
        }
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Use the read method to get the number format
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();
        
        // Print out the result to verify the operation
        System.out.println("Retrieved format equals original: " + retrievedFormat.equals(numberFormat)); // Should print true

        // More complex operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        for (Integer num : numberList) {
            System.out.println("Number: " + num);
        }
    }
}