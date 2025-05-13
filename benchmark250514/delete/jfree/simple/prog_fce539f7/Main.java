import org.jfree.chart.labels.StandardXYItemLabelGenerator;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardXYItemLabelGenerator object
        StandardXYItemLabelGenerator labelGenerator = new StandardXYItemLabelGenerator();
        
        // Use the write method to set the format string
        /* write */ labelGenerator.setFormatString("{0}: {1}, {2}");
        
        // Use the read method to get the format string
        /* read */ String formatString = labelGenerator.getFormatString();
        
        // Print the format string to verify the read operation
        System.out.println(formatString);
    }
}