import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.PieToolTipGenerator;
import org.jfree.chart.labels.StandardPieToolTipGenerator;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot
        PiePlot plot = new PiePlot();
        
        // Initialize and set a label generator
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        /* write */ plot.setLabelGenerator(labelGenerator);
        
        // Initialize and set a tooltip generator
        PieToolTipGenerator toolTipGenerator = new StandardPieToolTipGenerator();
        plot.setToolTipGenerator(toolTipGenerator);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 2;
        }
        System.out.println("Sum of first 10 even numbers: " + sum);
        
        // Retrieve the tooltip generator and perform operations
        PieToolTipGenerator retrievedToolTipGenerator = plot.getToolTipGenerator();
        System.out.println("Tooltip Generator: " + retrievedToolTipGenerator);

        // Perform some more unrelated operations
        double product = 1.0;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
        
        // Retrieve the label generator
        /* read */ PieSectionLabelGenerator retrievedLabelGenerator = plot.getLabelGenerator();
        System.out.println("Label Generator: " + retrievedLabelGenerator);
    }
}