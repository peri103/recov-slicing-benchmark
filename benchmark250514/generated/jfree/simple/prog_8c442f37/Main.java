import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot instance
        PiePlot plot = new PiePlot();

        // Create a label generator
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();

        // Write: Set the label generator for the plot
        /* write */ plot.setLabelGenerator(labelGenerator);

        // Read: Get the label generator from the plot
        /* read */ StandardPieSectionLabelGenerator retrievedGenerator = (StandardPieSectionLabelGenerator) plot.getLabelGenerator();

        // Print out the retrieved generator to verify it matches what was set
        System.out.println(retrievedGenerator);
    }
}