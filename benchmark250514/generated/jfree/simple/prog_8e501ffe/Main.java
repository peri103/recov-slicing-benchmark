import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot object
        PiePlot piePlot = new PiePlot();
        
        // Create a label generator
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        // Set the label generator using the write method
        /* write */ piePlot.setLabelGenerator(labelGenerator);
        
        // Retrieve the label generator using the read method
        /* read */ PieSectionLabelGenerator retrievedLabelGenerator = piePlot.getLabelGenerator();
        
        // Print the result to verify the read method retrieved the correct value
        System.out.println(retrievedLabelGenerator.equals(labelGenerator));
    }
}