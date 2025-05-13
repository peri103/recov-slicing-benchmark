import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardXYItemLabelGenerator
        StandardXYItemLabelGenerator labelGenerator = new StandardXYItemLabelGenerator();
        
        // Initialize a different label generator for complexity
        StandardPieSectionLabelGenerator pieLabelGenerator = new StandardPieSectionLabelGenerator();
        
        // Set format string for the pie label generator
        pieLabelGenerator.setFormat("{0} = {1} ({2})");
        
        // Create a list to store label generators
        ArrayList<Object> labelGenerators = new ArrayList<>();
        labelGenerators.add(labelGenerator);
        labelGenerators.add(pieLabelGenerator);
        
        // Perform some operations on the list
        for (Object obj : labelGenerators) {
            if (obj instanceof StandardXYItemLabelGenerator) {
                /* write */ ((StandardXYItemLabelGenerator) obj).setFormatString("{0}: {1}");
            }
        }
        
        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 2;
        }
        System.out.println("Sum of first 10 even numbers: " + sum);
        
        // More operations involving the pie label generator
        String pieFormat = pieLabelGenerator.getFormat();
        System.out.println("Pie Label Format: " + pieFormat);
        
        // Finally, read the format string from the original label generator
        String formatString = null;
        for (Object obj : labelGenerators) {
            if (obj instanceof StandardXYItemLabelGenerator) {
                /* read */ formatString = ((StandardXYItemLabelGenerator) obj).getFormatString();
            }
        }
        System.out.println("XY Label Format: " + formatString);
    }
}