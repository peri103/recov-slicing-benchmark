import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator object
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        // Initialize a NumberFormat object
        NumberFormat numberFormat = NumberFormat.getInstance();
        
        // Set the NumberFormat using the write method
        /* write */ labelGenerator.setNumberFormat(numberFormat);
        
        // Retrieve the NumberFormat using the read method
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();
        
        // Print out whether the retrieved format is the same as the one set
        System.out.println(retrievedFormat.equals(numberFormat));
    }
}